package poong.basic.lab;

import poong.basic.day19.BoardVO;

import java.util.List;

public interface EmployeeDAOV2 {

    int insertEmp(EmployeeVO evo);

    List<EmployeeVO> selectEmployee();

    EmployeeVO selectOneEmployee(int empno);

    int updateEmployee(EmployeeVO evo);

    int deleteEmployee(int empno);

}
