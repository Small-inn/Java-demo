SQL
---
## 概念
   - 数据库（DataBase）
   - 作用：存储数据、管理数据
## 数据库分类
   - 关系型数据库（SQL）
       * MySQL、Oracle、SQL Server、DB2、SQLite
       * 通过表与表之间，行和列之间的关系进行数据存储
   - 非关系型数据库（NoSQL）
       * Redis、MongoDB
       * 对象存储，通过对象的自身属性来决定
## DBMS
   - 数据库管理软件
   
## 简介
   - 用于访问和处理数据库的标准计算机语言
   - SQL指机构优化查询语言
   - SQL使我们有能力访问数据库
   - SQL是一种ANS（美国国家标准化组织）的标准计算机语言
   - SQL对大小写不敏感
## 数据库列类型
   - 数值
        * tinyint 极小的数据 1个字节
        * smallint 较小的数据 2个字节
        * mediumint 中等大小  3个字节
        * int    标准整数     4个字节
        * bigint 较大的数据   8个字节
        * float  浮点数      4个字节
        * double 浮点数      8个字节
        * decimal 字符串形式浮点数 金融计算，一般是decimal
   - 字符串
        * char 字符固定大小的 0-255
        * varchar 可变字符串 0-65535 常用的string
        * tinytext 微型文本 2^8 - 1 
        * text 文本串 2^16 - 1  保存大文本 
   - 时间日期
        * date  YYYY-MM-HH 日期格式  
        * time  HH:mm:SS 时间格式
        * datetime  YYYY-MM-HH HH:mm:SS 最常用的时间格式
        * timestamp   时间戳 1970到现在的毫秒数
        * year  年 
   - null
        * 没有值，未知
        * 注意，一般不要使用null进行运算，结果为null
## 数据库字段属性
   - Unsigned: 无符号的整数，不能声明为负数
   - Zerofill: 0填充，不足的位数使用0填充
   - 自增（auto increament）: 自动在上一条记录的基础上+1，通常用来设置唯一的主键，必须是整数类型，可以自定义设计主键自增的起始值和步长
   - 非空（not null）: 如果不赋值，就会报错
   - 默认（default）: 设置默认的值
## 数据库引擎
   - INNODB
   - MYISAM
   
   | 项 | MYISAM | INNODB |
   | --- | --- | ----- |
   | 事务支持 | NO | YES | 
   | 数据行锁定 | NO | YES | 
   | 外键约束 | NO | YES | 
   | 全文索引 | YES | NO | 
   | 表空间大小 | 较小 | 较大，约为2倍 |
   - MYISAM 节约空间，速度较快
   - INNODB 安全性高，事务处理，多表多用户操作 
## 语法
1. 数据操作语言（DML）
    - SELECT - 从数据库表中获取数据
    - UPDATE - 更新数据库表中的数据
    - DELETE - 从数据库表中删除数据
    - INSERT INFO-向数据库表中插入数据
2. 数据定义语言（DDL）
    - CREATE DATABASE - 创建新数据库
    - ALTER DATABASE - 修改数据库
    - CREATE TABLE - 创建新表
    - ALTER TABLE - 变更数据库表
    - DROP TABLE - 删除表
    - CREATE INDEX - 创建索引（搜索键）
    - DROP INDEX - 删除索引
3. SELECT
    - 从表中选取数据表名称
    - SELECT column_name(s) FROM table_name 、 SELECT * FROM 
    - SELECT DISTINCT 返回唯一不同值
4. WHERE子句
    - 用于规定选择的标准
    - SELECT column_name(s) FROM table_name WHERE 列 运算符 值
        * 例如：SELECT * FROM Persons WHERE City='Beijing'
        
    | 操作符 | 描述 |
    | ------  | ----- | 
    | =  |  等于  |
    | <> |  不等于 |
    | '>'  |  大于  |
    | <  |  小于  |
    | >= |  大于等于  |
    | <=  |  小于等于  |
    | BETWEEN |  在某个范围内  |
    | LIKE |  搜索某种模式  |
    **注释：** 在某些SQL版本中，操作符<>可以写为!=
5. AND和OR运算符
    - 用于基于一个以上的条件对记录进行过滤
    - AND和OR可在WHERE子语句中把两个货多个条件结合起来，如果第一个条件和第二个条件都成立，则AND运算符显示一条记录，如果第一条件和第二条件只要一个成立，则OR运算符显示一条记录。
        * 例如：SELECT * FROM Persons WHERE FirstName='Thomas' AND LastName='Carter'
        * SELECT * FROM Persons WHERE FirstName='Thomas' OR LastName='Carter'
        * SELECT * FROM Persons WHERE (FirstName='Thomas' OR FirstName='William') AND LastName='Carter'
6. ORDER BY语句
    - 用于对结果集进行排序
    - ORDER BY语句用于根据指定的列对结果集进行排序
    - ORDER BY语句默认按照升序记录进行排序
        * SELECT 列名，列名 FROM 表名 ORDER BY 列名
    - SELECT 列名，列名。。。 FROM 表名 ORDER BY 列名 DESC 降序排序
7. INSERT INTO语句
    - 用于向表格中插入新的行
    - INSERT INTO 表名称 VALUES（值1，值2，....） 
    - INSERT INTO TABLE_NAME（列1，列2，....） VALUES (值1，值2，....)
8. UPDATE语句
    - 用于修改表中的数据
    - UPDATE 表名称 列名称 = 新值 WHSETERE 列名称 = 某值    
    - UPDATE 表名称 列名称 = 新值，列名称 = 新值 WHSETERE 列名称 = 某值
9. DELETE语句
    - 用于删除表中的行
    - DELETE FROM 表名称 WHERE 列名称 = 值
    - DELETE FROM TABLE_NAME 、 DELETE * FROM TABLE_NAME 删除所有行
10. TRUNCATE语句
    - 完全清空一个数据库表，表的结构和约束不会变
    - TRUNCATE TABLENAME
## 高级语法
1. TOP子句
    - 用于规定返回的记录的数目（注意：并是不所有的数据库系统都支持TOP子句）
    - SELECT TOP number|percent column_name(s) FROM table_name
    - eg: SELECT TOP 2 * FROM 表名、SELECT TOP 50 PERCENT * FROM 表名
2. LIKE操作符
    - 用于在WHERE子句中搜索列中的指定模式
    - SELECT colume_name(s) FROM table_name WHERE column_name LIKE pattern
    - eg: "Persons" 表中选取居住在以 "N" 开始的城市里的人, SELECT * FROM Persons WHERE City LIKE 'N%',（提示：%可用于定义通配符）
    - eg: "Persons" 表中选取居住在以 "g" 结尾的城市里的人, SELECT * FROM Persons WHERE City LIKE '%g'   
    - eg: "Persons" 表中选取居住在包含 "ion" 的城市里的人, SELECT * FROM Persons WHERE City LIKE '%ion%'    
    - eg: "Persons" 表中选取居住在不包含 "ion" 的城市里的人, SELECT * FROM Persons WHERE City NOT LIKE '%ion%'
3. 通配符
    - 通配符可以替代一个或者多个字符，必须与LIKE一起使用
4. IN操作符
    - 允许我们在WHERE子句中规定多个值
    - SELECT column_name(s) FROM table_name WHERE column IN (value1, value2, .....) 
5. BETWEEN操作符
    - 操作符BETWEEN...AND会选取介于两个值之间的数据范围。可以是数值、文本或者日期
    - SELECT colum_name(s) FROM table_name WHERE column_name BETWEEN value1 AND vlaue2
6. Create Index语句
    - 用于在表中创建索引，在不读取整个表的情况下，索引使数据库应用程序可以更快地查找数据
    - 用户无法看到索引，它们只能被用来加速搜索/查询。
    - **注释：** 更新一个包含索引的表需要比更新一个没有索引的表更多的时间，这是由于索引本身也需要更新。因此，理想的做法是仅仅在常常被搜索的列（以及表）上面创建索引。
    - CREATE INDEX index_name ON table_name(column_name): 创建简单索引，允许使用重复的值
    - CREATE UNIQUE INDEX index_name ON table_name(column_name): 创建唯一索引，唯一索引意味着两个行不能拥有相同的索引值
7. DROP语句
    - 可以轻松的删除索引、表和数据库
    - DROP INDEX index_name ON table_name
    - SQL DROP TABLE 语句: DROP TABLE table_name
    - TRUNCATE TABLE table_name: 仅仅删除表内数据，不删除表本身
8. ALTER TABLE 语句
    - 用于在已有的表中添加、修改或者删除列
    - ALTER TABLE table_name ADD column_name datatype 添加列
    - ALTER TABLE table_name DROP COLUMN column_name datatype
9. Auto-Increment
    - 会在新记录插入表中时生成一个唯一的数字
10. SQL CREARE VIEW语句
    - SQL语句结果集的可视化表
    - **注释**：数据库的设计和结构不会受到视图中的函数、where或join语句的影响
    - 语法：
        ``` 
            CREATE VIEW view_name AS
            SELECT column_name(s)
            FROM table_name
            WHERE condition
        ``` 
11. NULL值
    - NULL值是遗漏的未知数据，IS NULL和IS NOT NULL操作符
    
## 约束
    - 作用：定义规则，保准数据的完整性
    - 外键约束
    - 唯一约束
    - 检查约束
    
## 事务
   - ACID原则，原子性、一致性、隔离性、持久性 （脏读、幻读）
   - 原子性（Atomicity）:要么都成功，要么都失败
   - 一致性（consistency）：事务前后的数据完整性要确保保持一致
   - 持久性（durability）：事务一旦提交则不可逆，被持久化到数据库中
   - 隔离性（isolation）：多个用户并发访问数据库，数据库为每一个用户开启一个事务，不能被其他事务的操作干扰，多个并发事务之间要互相隔离
   - 脏读：指一个事物读取了另一个事务未提交的数据
   - 幻不可重复读：在一个事务内读取表中的某一行数据，多次读取结果不同
   - 幻读：指在一个事务内读到了别的事务插入的数据，导致前后读取不一致
   
## 索引
   - 主键索引：primary key
        - 唯一的标识，主键不可重复，只能有一个列作为主键
   - 唯一索引： unique key
        - 避免重复的列出现，可以重复，多个列都可以标识为唯一索引
   - 常规索引: key/index
        - 默认的，index、key关键字设置
   - 全文索引：FullText
        - 特定的数据库引擎才有
   - CREATE INDEX 索引名 on 表名（字段）**一般索引名是：id_表名_字段名
   - 原则
        - 不是越多越好
        - 不要对进程变动数据加索引
        - 小数据量的表不需要加索引
        - 索引一般加载常用来查询的字段上 
 
## 数据库备份
   - 直接拷贝物理文件
   - 工具导出文件
   - 命令行 mysqldump
   
## 规范数据库设计
   - 数据库设计 
        - 分析需求：分析业务和需要处理的数据库的需求
        - 概要设计：设计关系图E-R图
   - 设计步骤
        - 收集信息
        - 标识实体类（需求落实到每个字段）
   - 三大范式
   1. 什么要数据规范化
        - 信息重复
        - 更新异常
        - 插入异常
            - 无法正常显示信息
        - 删除异常
            - 丢失有效信息
   2. 三大范式
        - 第一范式
            - 要求数据库的每一列都是不可分割的原子数据项，保证每一列不可再分
        - 第二范式
            - 前提满足第一范式
            - 非码属性必须完全依赖于候选码
            - 每张表只描述一件事情
        - 第三范式
            - 前提满足第二范式
            - 确保数据表中的每一列数据都是和主键直接相关，而不能间接相关
   3. 规范性和性能问题
        - 一般的关联查询不超过三张表
        - 
## JDBC
   - sun为了简化开发人员对数据库的统一操作，提供了一个规范（Java操作数据库的规范）JDBC
    