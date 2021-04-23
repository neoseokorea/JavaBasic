package poong.basic.lab;

import poong.basic.jdbc.JDBCUtil;

import java.util.List;

public class EmployeeDAOV2Impl implements EmployeeDAOV2 {


    private static EmployeeDAOV2 edao = null;
    private JDBCUtil jdbc = null;

    private String insertSQL =
            "INSERT into board (title, userid, contents) " +
                    "values (?, ?, ?) ";

    private String selectSQL =
            "SELECT bdno, title, userid, " +
                    " mid(regdate, 1, 10), views, thumbup " +
                    " FROM board order by bdno desc ";

    private String selectOneSQL =
            " select * from board where bdno = ? ";

    private String viewSQL =
            " update board set views = views + 1 " +
                    " where bdno = ? ";

    private String updateSQL =
            " update board set title = ? , contents = ? " +
                    " where bdno = ? ";

    private String deleteSQL =
            " delete from board where bdno = ? ";


    public EmployeeDAOV2Impl() {
        jdbc = new JDBCUtil();
    }

    public static EmployeeDAOV2 getInstance() {
        if (edao == null) edao = new EmployeeDAOV2Impl();
        return edao;
    }




    @Override
    public int insertEmp(EmployeeVO evo) {
        return 0;
    }

    @Override
    public List<EmployeeVO> selectEmployee() {
        return null;
    }

    @Override
    public EmployeeVO selectOneEmployee(int empno) {
        return null;
    }

    @Override
    public int updateEmployee(EmployeeVO evo) {
        return 0;
    }

    @Override
    public int deleteEmployee(int empno) {
        return 0;
    }
}
