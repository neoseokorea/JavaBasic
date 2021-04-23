package poong.basic.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeService2Impl implements EmployeeService {

    //멤버변수 선언
    List<EmployeeVO> empdata = new ArrayList<>();
    EmployeeVO emp = null;

    //상수선언
    static final String[] JOBID = {"FI_MGR","AC_MGR","SA_MAN","IT_PROG","ST_CLERK"};
    static int MINSAL = 2000;
    static int MAXSAL = 40000;
    static int MAXDEPT = 270;
    static int MAXMGRID = 206;


    //싱글톤 블럭 시작
    private static EmployeeService empsrv = null;
    private EmployeeService2Impl() {
    }

    public static EmployeeService getInstance() {
        if (empsrv == null) empsrv = new EmployeeService2Impl();
        return empsrv;
    }





    //화면에 메뉴 출력
    @Override
    public void displayMenu() {
        String displayMenu =
        "========================================= \n" +
        "            사원 관리 프로그램 V1           \n" +
        "========================================= \n" +
        "          1. 직원 데이터 입력 \n" +
        "          2. 직원 데이터 조회 \n" +
        "          3. 직원 데이터 상세조회 \n" +
        "          4. 직원 데이터 수정 \n" +
        "          5. 직원 데이터 삭제 \n" +
        "          0. 프로그램 종료 \n" +
        "========================================= \n" +
        "작업을 선택하세요 : ";
        System.out.print(displayMenu);

    }



    //새로운 사원 정보 정보를 입력받음.
    @Override
    public void newEmployee() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("사번 : ");
            int empno = sc.nextInt();
            System.out.print("first name : ");
            String fname = sc.next();
            System.out.print("last name : ");
            String lname = sc.next();
            System.out.print("메일 주소 : ");
            String email = sc.next();
            System.out.print("전화 번호 : ");
            String phone = sc.next();
            System.out.print("입사일 : ");
            String hdate = sc.next();

            EmployeeVO emp = new EmployeeVO(
                    empno, fname, lname, email, phone, hdate);
            //입력받은 성적 데이터를 객체화함.


            //사원 추가 정보를 생성해서 사원 정보로 저장.
            empsrv.makeExtInfo(emp);

            empdata.add(emp);
            //처리된 성적데이터를 동적배열에 저장.

        } catch (Exception ex) {
            System.out.println("잘못 입력했어요.");
            return; //오류 발생시 실행을 중단하고 main으로 복귀.
        }

    }//public void newEmployee() {





    //사원 기본정보(사번, 이름, 성)등을 리스트 형태로 출력함.
    @Override
    public void showEmployee() {
        String fmt = "%s %s %s %s %s %s \n";

        for(EmployeeVO emp :empdata ) {
            System.out.printf(fmt,
                    emp.getEmpno(),
                    emp.getFname(),
                    emp.getLname(),
                    emp.getEmail(),
                    emp.getPhone(),
                    emp.getHdate()
                    );
        }//for

    }




    //
    @Override
    public void showOneEmployee() {

        String fmt = "%s %s %s %s %s %s \n" +
                "%s %s %s %s %s \n";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사번은? : ");
        int empno = sc.nextInt();

        EmployeeVO emp = null;
        for (EmployeeVO e : empdata) { //<======================================
            //찾는 데이터가 동적배열 empdata에 존재한다면
            //emp 변수에 그것을 저장하고 반복문을 종료한다.
            if (e.getEmpno() == empno)  {  //<======================================
                emp = e; //주소가 넘어옴.
                break;
            }
        }//for

        System.out.printf(fmt,
                emp.getEmpno(),
                emp.getFname(),
                emp.getLname(),
                emp.getEmail(),
                emp.getPhone(),
                emp.getHdate(),
                emp.getJobid(),
                emp.getSal(),
                emp.getComm(),
                emp.getMgird(),
                emp.getDeptid()
                );
    }



    //
    @Override
    public void modifyEmployee() {

    }




    //
    @Override
    public void removeEmployee() {

    }

    @Override
    public void makeExtInfo(EmployeeVO emp) {
        Random rnd = new Random(); //<======================================

        int key = rnd.nextInt(JOBID.length); //<======================================
        String jobid = JOBID[key]; //랜덤발생된 키를 이용해서 직책을 임의결정해준다.

        //급여를 난수로 발생시킴
        int sal = rnd.nextInt(MAXSAL) + MINSAL; //급여
        int mgrid = rnd.nextInt(MAXMGRID) + 100; //상사 번호
        int deptid = (rnd.nextInt(MAXDEPT) % 100) * 10; //부서 번호

        DecimalFormat df = new DecimalFormat("#.#");
        double comm = Double.parseDouble(
                            df.format(
                                    rnd.nextDouble() / 2
                                        )
                        );

        emp.setJobid(jobid);
        emp.setSal(sal);
        emp.setComm(comm);
        emp.setMgird(mgrid+"");
        emp.setDeptid(deptid+"");

    }

    //싱글톤 블럭 끝
}
