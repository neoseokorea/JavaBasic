package poong.basic.exam01;

import poong.basic.lab.EmployeeVO;
import poong.basic.sungjuk.SungJukServiceV2;
import poong.basic.sungjuk.SungJukServiceV2Impl;
import poong.basic.sungjuk.SungJukVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {

    List<LibraryVO> libdata = new ArrayList<>();
    LibraryVO lib = null; //입력받은 데이터 저장소

    //싱글톤 패턴 시작
    private static LibraryService libsrv = null;

    public LibraryServiceImpl() {
    }

    public LibraryServiceImpl(List<LibraryVO> libdata, LibraryVO lib) {
        this.libdata = libdata;
        this.lib = lib;
    }

    public static LibraryService getInstance(){
        if (libsrv == null) libsrv = new LibraryServiceImpl();
        return libsrv;
    }

    @Override
    public void displayMenu() {

        String displayMenu =
            "========================================= \n" +
            "              도서관 관리 프로그램          \n" +
            "========================================= \n" +
            "          1. 도서관 데이터 입력 \n" +
            "          2. 도서관 데이터 조회 \n" +
            "          3. 도서관 데이터 상세조회 \n" +
            "          4. 도서관 데이터 수정 \n" +
            "          5. 도서관 데이터 삭제 \n" +
            "          0. 프로그램 종료 \n" +
            "========================================= \n" +
            "작업을 선택하세요(0 ~ 5) : ";
        System.out.print(displayMenu);

    }//public void displayMenu()


    @Override
    public void newLibrary() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("도서관명 : ");
            String lbname = sc.next();
            System.out.print("시도 : ");
            String sido = sc.next();
            System.out.print("구군 : ");
            String gugon = sc.next();
            System.out.print("도서관유형 : ");
            String lbtype = sc.next();
            System.out.print("휴관일 : ");
            String clsday = sc.next();
            System.out.print("주소 : ");
            String addr = sc.next();
            System.out.print("전화번호 : ");
            String phone = sc.next();
            System.out.print("홈페이지 : ");
            String homepage = sc.next();
            System.out.print("위도 : ");
            float lat = sc.nextFloat();
            System.out.print("경도 : ");
            float lon = sc.nextFloat();

            LibraryVO lib = new LibraryVO(lbname, sido, gugon, lbtype,
                    clsday, addr, phone, homepage, lat, lon);
            //입력받은 성적 데이터를 객체화함.

            libdata.add(lib);
            //처리된 성적데이터를 동적배열에 저장.

        } catch (Exception ex) {
            System.out.println("잘못 입력했어요.");
            return; //오류 발생시 실행을 중단하고 main으로 복귀.
        }
    }

    @Override
    public void showLibrary() {

        String fmt = "Index: %d 도서관명 : %s 시도 : %s  구군 :%s 도서관유형 : %s 휴관일 : %s \n";

        int pos = 0;
        for (LibraryVO lib : libdata) {
            System.out.printf(fmt, pos,
                    lib.getLbname(),
                    lib.getSido(),
                    lib.getGugon(),
                    lib.getLbtype(),
                    lib.getClsday()
            );
            pos++;
        }//for


    }

    @Override
    public void showOneLibrary() {

        String fmt = "도서관명 : %s 시도 :%s 구군 :%s 도서관유형 :%s\n" +
                "휴관일 :%s 주소 :%s 전화번호 :%s 홈페이지 :%s\n" +
                "위도 :%f 경도 :%f \n";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 도서관 이름는? : ");
        String libname = sc.next();

        LibraryVO lib = null;
        for (LibraryVO l : libdata) {
            //찾는 데이터가 동적배열 libdata에 존재한다면
            //emp 변수에 그것을 저장하고 반복문을 종료한다.
            if (l.getLbname().equals(libname) ) {  //<======================================
                lib = l; //주소가 넘어옴.
                break;
            }
        }//for


        System.out.printf(fmt,
                lib.getLbname(),
                lib.getSido(),
                lib.getGugon(),
                lib.getLbtype(),
                lib.getClsday(),
                lib.getAddr(),
                lib.getPhone(),
                lib.getHomepage(),
                lib.getLat(),
                lib.getLon()
                );

    }

    @Override
    public void modifyLibrary() {

    }

    @Override
    public void removeLibrary() {

    }
}
