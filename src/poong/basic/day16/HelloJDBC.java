package poong.basic.day16;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelloJDBC {

    public static void main(String[] args) {

        /*

        JDBC
        java database connectivity

        자바 프로그래밍 언어를 통해 다양한 관계형 데이터베이스에 접속하고
        SQL문을 실행하고 관리하고자 할 때 사용하는
        표준 SQL 인터페이스
        이것을 통해 데이터베이스 코드를 한 번만 작성해두면
        어떤 DBMS라도 코드 변경 없이 동일하게 작동할 수 있음.

        JDK에 포함된 JDBC인터페이스는 java.sql 패키지 아래 있음.

        하지만, 이것만으로는 작동하지 않고
        각 데이터베이스 제조사가 JDBC인터페이스를 구현해서
        작성한 클래스가 필요한데, JDBC 드라이버 매니저라 함.
        jdbc 드라이버 매니저는 데이터베이스 제조사 홈페이지에서
        내려받을 수 있음.

         */




        //oracle용 drv, url
        //drv : oracle.jdbc.OracleDriver
        //url : jdbc:oracle:thin:@[vmware주소]:1521:xe

        //postgresql용 drv, url
        //drv : org.postgresql.Driver
        //url : jdbc:postgresql://[vmware주소]:5432/postgre






        //amazon  데이터베이스 접속 확인

        String drv = "org.mariadb.jdbc.Driver";
        String amz = "bigdata.cy3h4z2zvnxs.ap-northeast-2.rds.amazonaws.com";
        String url = "jdbc:mariadb://"+amz+":3306/bigdata";
        String usr = "bigdata";
        String pwd = "bigdata2020";

        //1. JDBC 드라이버를 메모리에 초기화함.
        System.out.println("마리아 데이터베이스 접속을 시도합니다...");
        try {
            Class.forName(drv);

        } catch (ClassNotFoundException ex) {
            System.out.println("마리아 드라이버를 확인하세요!");
        }



        //2. 데이터베이스 서버 접속
        try (
                Connection conn = DriverManager.getConnection(url, usr, pwd);
                ) {
            if (conn != null)
                System.out.println("마리아 데이터베이스 연결 성공!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }






        // vmware에 구축된 PostgreSQL 서버 접속 테스트

//        postgre  데이터베이스 접속 확인

        String post_drv = "org.postgresql.Driver";
        String post_url = "jdbc:postgresql://192.168.204.129:5432/postgres";
        String post_usr = "postgres";
        String post_pwd = "bigdata2020";

        //1. JDBC 드라이버를 메모리에 초기화함.
        System.out.println("포스트그레 데이터베이스 접속을 시도합니다...");
        try {
            Class.forName(post_drv);

        } catch (ClassNotFoundException ex) {
            System.out.println("포스트그레 데이터베이스 드라이버를 확인하세요!");
        }


        //2. 데이터베이스 서버 접속
        try (
                Connection conn = DriverManager.getConnection(post_url, post_usr, post_pwd);
        ) {
            if (conn != null)
                System.out.println("포스트그레 데이터베이스 연결 성공!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }







        // vmware에 구축된 oracle 서버 접속 테스트

//        oracle  데이터베이스 접속 확인

        String odrv = "oracle.jdbc.OracleDriver";
        String ourl = "jdbc:oracle:thin:@192.168.120.130:1521:xe";
        String ousr = "system";
//        String opwd = "bigdata2020";

        //1. JDBC 드라이버를 메모리에 초기화함.
        System.out.println("오라클 데이터베이스 접속을 시도합니다...");
        try {
            Class.forName(odrv);

        } catch (ClassNotFoundException ex) {
            System.out.println("오라클 데이터베이스 드라이버를 확인하세요!");
        }


        //2. 데이터베이스 서버 접속
        try (
                Connection conn = DriverManager.getConnection(ourl, ousr, pwd);
        ) {
            if (conn != null)
                System.out.println("오라클 데이터베이스 연결 성공!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }






        //**************************************************************
//        try {
//            Class.forName(odrv);
//        } catch (ClassNotFoundException ex) {
//            System.out.println("드라이버를 확인하세요!");
//        }
//
//        try (
//                Connection conn = DriverManager.getConnection(ourl, ousr, pwd);
//        ) {
//            if (conn != null)
//                System.out.println("데이터베이스 연결 성공!");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }


    }//main

}//public class HelloJDBC {
