package poong.basic.day15;

import java.io.*;
import java.util.Scanner;

public class CharSungJuk {
    public static void main(String[] args) {

        /*
            이름, 국어, 영어, 수학을 키보드로 입력받아
            sungjuk.dat에 저장하는 코드를 작성하세요.
            단, 파일에 저장하는 문자열 형식은 다음과 같이 합니다.

            입력 데이터 : 혜교 97 98 96
            파일 저장 형식 : 혜교, 97, 98, 95
         */

        String name = "";
        int kor = 0;
        int eng = 0;
        int mat = 0;

        Scanner sc = new Scanner(System.in);

//        System.out.print(" 이름 : ");
//        name = sc.next();
//        System.out.print(" 국어 : ");
//        kor = sc.nextInt();
//        System.out.print(" 영어 : ");
//        eng = sc.nextInt();
//        System.out.print(" 수학 : ");
//        mat = sc.nextInt();
          System.out.println("성적은? ('이름 국어 영어 수학' 순서로");
          name = sc.next();
          kor = sc.nextInt();
          eng = sc.nextInt();
          mat = sc.nextInt();

        //파일에 쓰기
        String fpath = "c:/Java/sungjuk.dat";

        //FileWriter 객체 초기화
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {

            fw = new FileWriter(fpath, true);
            //파일에 데이터 누적 옵션 설정.
            bw = new BufferedWriter(fw);

            String fmt = "%s, %d, %d, %d\n";
            String data = String.format(
                    fmt, name, kor, eng, mat
            );
            bw.write(data);

//            fw.write(name + ", ");
//            fw.write(kor + " , ");
//            fw.write(eng + " , ");
//            fw.write(mat + "\n");

            bw.close(); //파일 쓰기 종료
            fw.close(); //파일 쓰기 종료


        } catch (IOException e) {
            System.out.println("파일쓰기 오류!");
            e.printStackTrace();
        }

        //저장한 성적 데이터를 화면에 출력
        FileReader fr = null;
        BufferedReader br = null;


        try {
            fr = new FileReader(fpath);
            br = new BufferedReader(fr);

            while(br.ready()) {
                System.out.println(br.readLine());
            }

            br.close(); //LIFO 형식으로 객체를 닫음.
            fr.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }//main
}
