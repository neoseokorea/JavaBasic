package poong.basic.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.Scanner;

public class AdvJDBC {
    public static void main(String[] args) {
        /*
        효율적으로 jdbc 프로그램 작성하기
        데이터베이스 연결정보를 소스 내에 작성하는 것은
        보안상 좋지 않고 유지 보수 측면에서도 추천 하지 않음.

        따라서, 독립적인 외부 파일에 작성해서
        사용하도록 코드를 작성하는 것이 효율적이고 안전.
        => properties 파일 사용

         */

        //jdbc.properties 파일 경로 지정
        String pkpath = "poong.basic.jdbc.jdbc";
        ResourceBundle rb = ResourceBundle.getBundle(pkpath);

//        System.out.println(rb.getString("mdrv"));
//        System.out.println(rb.getString("murl"));
//        System.out.println(rb.getString("musr"));
//        System.out.println(rb.getString("mpwd"));

        //jtbc 프로그램에서 공통적으로 작성하는 코드들 중 하나는
        // 디비 접속부분과 해제부분임.
        // 이걸 클래스로 만들어 따로 관리하면
        // 유지보수에 장점.

                /*
        예) playground 데이터베이스에 books 테이블을
        생성하고 새로운 도서 정보를 입력하는 프로그램을
        작성한다.

        입력방법은 scanner 클래스를 이용
        */


        String sql =    " insert into books " +
                        " values (?,?,?,?) ";
        // ? : parameter placeholder
        // 동적sql문을 사용해서 실제 입력값은
        // 매개변수를 통해
        // 완전한 형태의 SQL문으로 구성하는 방식을 추천함.
        // XSS 해킹을 방지하는데도 도움이 됨.

        //parameter placeholder 사용하기 전
        //자주 사용되었던 방식 - 해킹 위험이 존재.
            //sql = " insert into books " +
            //      " values ("+ bkid +", '"+ name +"', '"
            //      + publish + "', " + price+ ") "

        Scanner sc = new Scanner(System.in);
        System.out.println("도서번호 도서명 출판사 가격 : ");
        int bookid = Integer.parseInt(sc.next());
        String bookname = sc.next();
        String publish = sc.next();
        int price = Integer.parseInt(sc.next());

        MariaJDBC jdbc = new MariaJDBC();

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                // Statement vs. PrepareStatement
                // jdbc를 이용해서 sql이 실행되는 순서
                // => statement : SQL 분석 => 컴파일 => 실행
                // => PrepareStatement : (SQL 분석 -> 컴파일 ) -> 실행
                // Statement 객체로 sql 실행시 위 3가지 과정을 매번 거쳐야 함.
                // 반면, prepareStatement 객체는 처음 실행시 3가지 과정을 거친 후
                // 실행한 sql을 캐시에 저장해 둠.
                // 그런 후 다음에 실행시 캐시를 재활용해서 실행하기 때문에
                // 성능이 개선됨.

                //반복실행 해야할 sql : PrepareStatement (DML)
                //반복실행 필요없는 sql : Statement (DDL)

                ) {

                pstmt.setInt(1, bookid);
                pstmt.setString(2, bookname);
                pstmt.setString(3, publish);
                pstmt.setInt(4, price);

                int cnt = pstmt.executeUpdate();
                if ( cnt > 0 ) System.out.println("도서 추가 완료.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
/*
        예) playground 데이터베이스에 books 테이블에
        저장된 데이터를 조회하는 프로그램을 작성한다.
     */
        sql = " select * from books";

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                ) {

            String fmt = "%s %s %s %s \n";
            StringBuffer sb = new StringBuffer();
            while (rs.next()) {
                String result = String.format(fmt,
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                sb.append(result);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//main

}//class





class MariaJDBC {
    private ResourceBundle rb = null;
    private String DRV;
    private String URL;
    private String USR;
    private String PWD;

    //alt insert 눌러 생성자 생성
    public MariaJDBC() {
        String pkpath = "poong.basic.jdbc.jdbc";
                //poong.basic.jdbc 는 패키지이름
                //jdbc : properties 파일명
        rb = ResourceBundle.getBundle(pkpath);
        DRV = rb.getString("mdrv");
        URL = rb.getString("murl");
        USR = rb.getString("musr");
        PWD = rb.getString("mpwd");
    }//

    public Connection openConn() {
        Connection conn = null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL, USR, PWD);
        } catch (Exception ex) {
            ex.printStackTrace();}

        return conn;
    }
}//class