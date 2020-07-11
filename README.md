# HNUTest

`student` 表与 `score` 表通过 `stu_no` 字段建立外键约束，`student` 表为主表。

```mysql
ALTER TABLE score ADD CONSTRAINT stu_fk FOREIGN KEY(stu_no) REFERENCES student(stu_no) ON DELETE RESTRICT ON UPDATE RESTRICT;
```

## API

| URI                | METHOD | DATA                                                         | FUNCTION                                        |
| ------------------ | ------ | ------------------------------------------------------------ | ----------------------------------------------- |
| `/api/add/score`   | `POST` | `{stuNo: String, cName: String, grade: int}`                 | 添加一条记录，`score_id` 字段值自动生成         |
| `/api/add/student` | `POST` | `{stuNo: String, stuName: String, sexde: String, birth: Date/String, department: String, addr: String}` | 添加一条记录，`id` 字段值自动生成               |
| `/api/del/score`   | `POST` | `int`                                                        | 删除一条 `score_id` 字段值与指定整数相同的记录  |
| `/api/del/student` | `POST` | `int`                                                        | 删除一条 `id` 字段值与指定整数相同的记录        |
| `/api/upd/score`   | `POST` | `{scoreId: int, stuNo: String, cName: String, grade: int}`   | 更新一条 `score_id` 字段与 `scoreId` 相同的记录 |
| `/api/upd/student` | `POST` | `{id: int, stuNo: String, stuName: String, sexde: String, birth: Date/String, department: String, addr: String}` | 更新一条 `id` 字段与 `id` 相同的记录            |
| `/api/get/score`   | `GET`  | `stuNo=String`                                               | 返回所有 `stu_no` 字段与指定字符串相同的记录    |
| `/api/get/student` | `GET`  | `stuNo=String`                                               | 返回 `stu_no` 字段与指定字符串相同的记录        |

