import bean.Student;
import daoIMP.StudentDAOIMP;
import org.junit.Test;
public class StudentDAOIMPTest {
    private StudentDAOIMP dao = new StudentDAOIMP();
    @Test
    public void insertTest(){
        Student stu = new Student();
        stu.setID(1003);
        stu.setName("王五");
        dao.insert(stu);
    }
    @Test
    public void findAll(){
        System.out.println(dao.findAll());
    }

    @Test
    public void findById(){
        System.out.println(dao.findByID(1003));
    }
    @Test
    public void delete(){
        dao.delete("1003");
    }
    @Test
    public void update(){
        Student stu = new Student();
        stu.setID(1003);
        stu.setName("王五六");
        dao.update(stu);
    }
}
