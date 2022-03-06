package daoIMP;

import bean.Student;
import dao.StudentDAO;

import java.sql.PreparedStatement;
import java.util.List;

public class StudentDAOIMP extends BaseDao implements StudentDAO {

    // 添加操作
    public void insert(Student s) {
        String sql = "INSERT INTO student (id, name) values (?,?)";
        update(sql,s.getID(),s.getName());
    }


    public void inserts(Student stu){
        String sql = "INSERT INTO student (id, name) values (?,?)";
        PreparedStatement pstmt = null;

    }
    public void update(Student s) {
        //作业
        String sql = "update student set name = ? where id = ?";
        update(sql,s.getName(),s.getID());
    }

    public void delete(String iD) {
        //作业
        String sql = "delete from student where id = ?";
        update(sql,iD);
    }

    public List findAll() {
        //作业
        String sql = "select * from student";
        return queryForList(Student.class,sql);
    }

    public Student findByID(long iD) {
        //作业
        String sql = "select * from student where id = ?";
        return queryForOne(Student.class,sql,iD);
    }

}
