package poong.basic.lab;

public interface EmployeeService {

    /*
        응집도와 결합도를 낮추기 위한 방법을오 인터페이스를 쓴다.
        협업이 용이해진다.
     */

    void displayMenu();

    void newEmployee();

    void showEmployee();

    void showOneEmployee();

    void modifyEmployee();

    void removeEmployee();

    void makeExtInfo(EmployeeVO emp);
}
