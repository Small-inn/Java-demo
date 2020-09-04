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
    