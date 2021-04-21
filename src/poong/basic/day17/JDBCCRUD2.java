package poong.basic.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCCRUD2 {
    public static void main(String[] args) throws ClassNotFoundException {

    /*
        예) playground 데이터베이스에 books 테이블에
        저장된 데이터를 조회하는 프로그램을
        작성한다.

        컬럼정보:
        bookid, bookname, publish, price

     */

    //접속정보
    String drv = "org.mariadb.jdbc.Driver";
    String amz = "bigdata.cy3h4z2zvnxs.ap-northeast-2.rds.amazonaws.com";
    String url = "jdbc:mariadb://"+amz+":3306/playground";
    String usr = "playground";
    String pwd = "bigdata2020";

    //jdbc 관련 sql 정의
    String readAll = " select * from books ";
    String readAll2 = " select bookname, price from books ";
    String readOne = " select * from books where publish = 'oracle' ";

    Class.forName(drv);


//readAll

        try (
            Connection conn =
                    DriverManager.getConnection(url, usr, pwd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(readAll);
            //지정한 SQL을 실행하고 결과집합을 받아옴.
            //단, select 실행시에만 사용!


    ) {
            StringBuffer sb = new StringBuffer();

            while (rs.next()) {
                //결과 집합에서 불러올 데이터가 없을 때까지 다음 반복
                sb.append(rs.getString(1))
                  //결과집합에서 첫번째 컬럼의 값을 문자형태로 읽어옴.
                  .append(rs.getString("bookname"))
                        //결과집합에서 bookname 컬럼의 값을 문자형태로 읽어옴.
                  .append(rs.getString(3))
                  .append(rs.getString(4))
                  .append("\n");
            }

        System.out.println(readAll + "을 출력합니다............");
        System.out.println(sb.toString()); //결과출력

    } catch (Exception ex) {
        ex.printStackTrace();
    }





    //readAll2

        try (
                Connection conn =
                        DriverManager.getConnection(url, usr, pwd);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(readAll2);

        ) {
            StringBuffer sb = new StringBuffer();

            while (rs.next()) {
                sb.append(rs.getString("bookname")).append(" ")
                        .append(rs.getString("price")).append(" ")
                        .append("\n");
            }
            System.out.println(readAll2 + "을 출력합니다............");
            System.out.println(sb.toString()); //결과출력

        } catch (Exception ex) {
            ex.printStackTrace();
        }





//readOne

        try (
                Connection conn =
                        DriverManager.getConnection(url, usr, pwd);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(readOne);
//
        ) {
            StringBuffer sb = new StringBuffer();

            while (rs.next()) {
                sb.append(rs.getString(1))
                        .append(rs.getString(2))
                        .append(rs.getString(3))
                        .append(rs.getString(4))
                        .append("\n");
            }
            System.out.println(readOne + "을 출력합니다............");
            System.out.println(sb.toString()); //결과출력

        } catch (Exception ex) {
            ex.printStackTrace();
        }



    }//main

}//class
