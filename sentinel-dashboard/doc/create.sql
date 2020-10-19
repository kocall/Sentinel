CREATE TABLE `metrics`
(
    `id`            int(11)       NOT NULL AUTO_INCREMENT,
    `gmt_create`    timestamp     NOT NULL,
    `gmt_modified`  timestamp     NOT NULL,
    `app_id`        int(11)       not NULL comment 'app id',
    `timestamp`     timestamp     NOT NULL,
    `resource_id`   int(11)       not NULL comment 'resource id',
    `pass_qps`      int         not NULL default 0,
    `success_qps`   int          not NULL default 0,
    `block_qps`     int         not NULL default 0  ,
    `exception_qps` int          not NULL default 0 ,
    `rt`            double(10, 2) not NULL default 0,
    `count`         int           not NULL default 0,
    `resource_code` int           not NULL default 0,
    PRIMARY KEY (`id`),
    KEY (`app_id`, `resource_id`),
    KEY (`timestamp`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


create TABLE `app`
(
    `id`  int(11)      NOT NULL AUTO_INCREMENT,
    `app` varchar(128) not NULL comment '服务名',
    PRIMARY KEY (`id`),
    UNIQUE KEY (`app`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

create TABLE `resource`
(
    `id`       int(11)      NOT NULL AUTO_INCREMENT,
    `resource` varchar(128) not NULL comment 'sentinel 资源',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

create table `app_resource`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT,
    `app_id`      int(11) not NULL comment 'app id',
    `resource_id` int(11) not NULL comment 'resoruce id',
    PRIMARY KEY (`id`),
    KEY (`app_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;





select m.*,a.app,r.resource from metrics m
inner join app_resource ar on m.app_id =  ar.app_id and m.resource_id=ar.resource_id
inner join app a on a.id = ar.app_id
inner join resource r on ar.resource_id = r.id
where a.app='#{app}' and r.resource='#{resource}' and m.timestamp between '#{startTime}' and '#{endTime}';

select r.resource from resource r
inner join app_resource ar on r.id = ar.resource_id
inner  join app a on ar.app_id = a.id
where a.app='#{app}';



select m.id as id,m.gmt_create as gmtCreate,m.pass_qps as passQps,m.success_qps as successQps,
       m.block_qps as blockQps,m.exception_qps as exceptionQps,m.rt as rt,
       m.count as count,m.resource_code as resourceCode,a.app,r.resource from metrics m inner join app_resource ar on m.app_id =  ar.app_id and m.resource_id=ar.resource_id inner join app a on a.id = ar.app_id inner join resource r on ar.resource_id = r.id where a.app=? and r.resource=? and unix_timestamp(m.timestamp) between ? and ?