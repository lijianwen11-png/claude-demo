CREATE TABLE IF NOT EXISTS t_user (
    id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(50)  NOT NULL,
    age     INT,
    email   VARCHAR(100)
);

INSERT INTO t_user (name, age, email) VALUES ('张三', 25, 'zhangsan@example.com');
INSERT INTO t_user (name, age, email) VALUES ('李四', 30, 'lisi@example.com');
INSERT INTO t_user (name, age, email) VALUES ('王五', 28, 'wangwu@example.com');
