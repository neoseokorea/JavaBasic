package poong.basic.sungjuk;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SungJukServiceV3Impl implements SungJukServiceV3 {

//   멤버 변수 선언
//   입력받은 모든 성적데이터를 저장하는 동적배열 변수 선언
    List<SungJukVO> sjdata = new ArrayList<>();
    SungJukVO sj = null; //입력받은 데이터 저장소
    //성적데이터를 저장해 둘 파일경로 지정
    String fpath = "c:/Java/SungJuk.data";
    String fpath2 = "c:/Java/SungJuk.csv";
    String fpath3 = "c:/Java/SungJuk.json";

    //CSV직렬화를 위한 문자열 포맷
    String csvfmt = "%s, %d, %d, %d, %d, %.1f, %s\n";

    //json직렬화를 위한 문자열 포맷
//    String jsonfmt = "{'name':'%s', 'kor':%d, 'eng':%d, 'mat':%d, " +
//            "'tot':%d, 'avg':%.1f, 'grd':'%s'}\n";
    String jsonfmt = "{\"name\":\"%s\", \"kor\":%d, \"eng\":%d, \"mat\":%d, " +
            "\"tot\":%d, \"avg\":%.1f, \"grd\":\"%s\"}\n";


    //싱글톤 패턴 시작
    private static SungJukServiceV3 sjsrv = null;

    private SungJukServiceV3Impl() {
        initSungJuk();
    }

    public static SungJukServiceV3 getInstance(){
        if (sjsrv == null) sjsrv = new SungJukServiceV3Impl();
        return sjsrv;
    }







    @Override
    public void displayMenu() {
        String displayMenu =
            "========================================= \n" +
            "              성적 프로그램 V7              \n" +
            "========================================= \n" +
            "          1. 성적 데이터 입력 \n" +
            "          2. 성적 데이터 조회 \n" +
            "          3. 성적 데이터 상세조회 \n" +
            "          4. 성적 데이터 수정 \n" +
            "          5. 성적 데이터 삭제 \n" +
            "          0. 프로그램 종료 \n" +
            "========================================= \n" +
            "작업을 선택하세요 : ";
        System.out.print(displayMenu);

    }//public void displayMenu()







    @Override
    public void newSungJuk() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("이름은 : ");
            String name = sc.next();
            System.out.print("국어는 : ");
            int kor = sc.nextInt();
            System.out.print("영어는 : ");
            int eng = sc.nextInt();
            System.out.print("수학은 : ");
            int mat = sc.nextInt();

            SungJukVO sj = new SungJukVO(name, kor, eng, mat);
            //입력받은 성적 데이터를 객체화함.

            computeSungJuk(sj);
            //성적데이터 처리

            sjdata.add(sj);
            //처리된 성적데이터를 동적배열에 저장.

            //입력된 데이터와 기존 입력된 데이터를
            //sungjuk.daa 파일에 직렬화해서 저장함.
//            saveSungJuk();

        } catch (Exception ex) {
            System.out.println("잘못 입력했어요.");
            return; //오류 발생시 실행을 중단하고 main으로 복귀.
        }

    }//public SungJuVO readSungJuk()






    /*
        저장된  성적데이터들 중에서
        배열의순번번호(index), 이름, 국어, 영어, 수학만 뽑아서
        목록 형태로 출력함.
     */
    @Override
    public void showSungJuk() {
        String fmt = "번호 : %d, 이름 : %s, 국어 : %d,  영어 : %d, 수학 : %d \n";
        int pos = 0; //배열인덱스

        for (SungJukVO sj : sjdata) {   // <==========================
            System.out.printf(fmt, pos,
                    sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                    sj.getTot(), sj.getAvg(), sj.getGrd()
            );
            ++pos;
        }//for
        System.out.println("");
        System.out.println("");

    }//public void showSungJuk() {







    @Override
    public void computeSungJuk(SungJukVO sj) {
        sj.setTot( sj.getKor() + sj.getEng() + sj.getMat() );
        sj.setAvg( (double) sj.getTot() / 3);

        //학점 산정
        switch ((int) sj.getAvg() / 10) {
            case 10:
            case 9: sj.setGrd('수'); break;
            case 8: sj.setGrd('우'); break;
            case 7: sj.setGrd('미'); break;
            case 6: sj.setGrd('양'); break;
            default: sj.setGrd('가'); break;
        }//swich

    }//public void computeSungJuk(SungJukVO sj)







    @Override
    public void showOneSungJuk() {
        String fmt = "번호 : %d, 이름 : %s, 국어 : %d,  영어 : %d, 수학 : %d +" +
                "총점 : %d, 평균 : %.1f, 학점 : %c\n";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 학생의 번호는? : ");
        int pos = sc.nextInt();

        try {
            SungJukVO sj = sjdata.get(pos);

            System.out.printf(fmt, pos,
                    sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                    sj.getTot(), sj.getAvg(), sj.getGrd());
        } catch (Exception ex) {
            System.out.println("데이터가 존재하지 않음");
        }
    }//public void showOneSungJuk() {







    @Override
    public void modifySungJuk() {

    }






    @Override
    public void removeSungJuk() {

    }






    //기존에 입력된 성적데이터를
    //파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk() {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fpath);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);

            sjdata = (ArrayList) ois.readObject();


        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("파일이 없거나 시스템 오류입니다.");
        } finally {
            if (ois != null)
                    try { ois.close(); } catch (IOException e) { }
            if (bis != null)
                    try { ois.close(); } catch (IOException e) { }
            if (fis != null)
                    try { ois.close(); } catch (IOException e) { }
        }

    }//public void initSungJuk()







    //메모리내에 저장된 모든 성적데이터를
    //직렬화를 통해 파일에 저장장    @Override
    public void saveSungJuk() {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fpath);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);

            oos.writeObject(sjdata);


        } catch (Exception ex) {
//            ex.printStackTrace();
            System.out.println("파일이 없거나 시스템 오류입니다.");
        } finally {
            if (oos != null)
                try { oos.close(); } catch (IOException e) { }
            if (bos != null)
                try { bos.close(); } catch (IOException e) { }
            if (fos != null)
                try { fos.close(); } catch (IOException e) { }
        }

    }//public void saveSungJuk()







    //기존에 입력된 성적데이터를 CSV직렬화로
    //파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk2() {
        //try-with-resources 구문 사용

        try (
                FileReader fr = new FileReader(fpath2);
                BufferedReader br = new BufferedReader(fr);
        ) {
                sjdata = new ArrayList<>();
                while (br.ready()) {
                    //csv파일에서 문자열 한 줄을 읽어서
                    //쉼표 단위로 분리한 후 배열로 생성
                    String line = br.readLine();
                    String data[] = line.split(",");

                    //생성된 배열을 이용해서 성적 객체를 만들어
                    //총점, 평균, 학점을 구한 다음 (옵션)
                    //ArrayList에 저장함.
                   SungJukVO sj = new SungJukVO(
                            data[0],    Integer.parseInt(data[1]),
                                        Integer.parseInt(data[2]),
                                        Integer.parseInt(data[3]) );
                    computeSungJuk(sj);

                    sjdata.add(sj);
                    ;
                }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//public void initSungJuk2() {







    //메모리내에 저장된 모든 성적데이터를 CSV직렬화로
    //직렬화를 통해 파일에 저장장    @Override
    @Override
    public void saveSungJuk2() {
//        FileWriter fw = new FileWriter(fpath2);
//        BufferedWriter bw = new BufferedWriter(fw);

        //JDK7부터는 자원을 쉽게 해제할 수 있도록
        //try-with-resources라는 구문을 지원함.

        try (
                FileWriter fw = new FileWriter(fpath2);
                BufferedWriter bw = new BufferedWriter(fw);
        )   {
                String result = "";
                for (SungJukVO sj : sjdata) {
                    result = String.format  (csvfmt,
                                            sj.getKor(), sj.getEng(), sj.getMat(),
                                            sj.getTot(), sj.getAvg(), sj.getGrd()
                                            );
                    bw.write(result);
                }

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

        }

    }//public void saveSungJuk2() {







    //기존에 입력된 성적데이터를 jason 역직렬화로
    //파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk3() {

        try (
                FileReader fr = new FileReader(fpath3);
                BufferedReader br = new BufferedReader(fr);
        ) {

            //json파일의 모든 내용을 한번에 읽어 lines 변수에 저장
            String lines = br.lines().collect(Collectors.joining());
//            System.out.println(lines);

//            sjdata = new ArrayList<>();

            //텍스트 파일에 저장된 반정형데이터를
            //json 분석기(parser)를 이용해서
            //메모리에 객체형태로 저장함.
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(lines);

            //메모리에 저장된 객체에서 sj라는 이름의 배열객체를 가져옴.
            JSONArray jsons = (JSONArray) obj.get("sj");

            for(int i = 0; i < jsons.size() ; ++i) {
                JSONObject json = (JSONObject) jsons.get(i);
                SungJukVO sj = new SungJukVO(
                        (String) json.get("name"),
                        ((Long) json.get("kor")).intValue(),
                        ((Long) json.get("eng")).intValue(),
                        ((Long) json.get("mat")).intValue() );
                computeSungJuk(sj);
                sjdata.add(sj);


            }


//            while (br.ready()) {
////                //csv파일에서 문자열 한 줄을 읽어서
////                //쉼표 단위로 분리한 후 배열로 생성
////                String line = br.readLine();
////                String data[] = line.split(",");
////
////                //생성된 배열을 이용해서 성적 객체를 만들어
////                //총점, 평균, 학점을 구한 다음 (옵션)
////                //ArrayList에 저장함.
////                SungJukVO sj = new SungJukVO(
////                        data[0],    Integer.parseInt(data[1]),
////                        Integer.parseInt(data[2]),
////                        Integer.parseInt(data[3]) );
////                computeSungJuk(sj);
////
////                sjdata.add(sj);
////                ;
////            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }






    @Override
    public void saveSungJuk3() {

        try (
                FileWriter fw = new FileWriter(fpath3);
                BufferedWriter bw = new BufferedWriter(fw);
        )   {
            String result = "";

            bw.write("{ \"sj\":[");                           //json배열 시작
            for (SungJukVO sj : sjdata) {
                result = String.format  (jsonfmt, sj.getName(),
                        sj.getKor(), sj.getEng(), sj.getMat(),
                        sj.getTot(), sj.getAvg(), sj.getGrd()
                );
                // {'name':'혜교', 'kor':54 ... }
                bw.write(result);
            }
            bw.write("] }");                                //json배열 끝

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

        }


    }


}//v3impl