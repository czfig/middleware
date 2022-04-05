package daoIMP;

import connection.DataBaseConnection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public abstract class BaseDao {
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * @Description 增删改
     * */
    public int update(String sql,Object... args){
        Connection conn = DataBaseConnection.getConnection();
        try {
            return queryRunner.update(conn,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DataBaseConnection.close(conn);
        }
        return -1;
    }
    /**
     * @Description 查询返回一个javabean对象的sql语句
     * */
    public <T> T queryForOne(Class<T> type,String sql,Object... args){
        Connection conn = DataBaseConnection.getConnection();
        try {
            return queryRunner.query(conn,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DataBaseConnection.close(conn);
        }
        return null;
    }

    /**
     * @Description 查询返回多个javabean对象的sql语句
     * */
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args){
        Connection conn = DataBaseConnection.getConnection();
        try {
            return queryRunner.query(conn,sql,new BeanListHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DataBaseConnection.close(conn);
        }
        return null;
    }


    /**
     * @Description 执行返回一行一列的sql语句
     * */
    public Object queryForSingleValue(String sql,Object... args){
        Connection conn = DataBaseConnection.getConnection();
        try {
            return queryRunner.query(conn,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DataBaseConnection.close(conn);
        }
        return null;
    }

}
