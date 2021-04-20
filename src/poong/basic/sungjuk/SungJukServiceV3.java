package poong.basic.sungjuk;


import poong.basic.sungjuk.SungJukServiceV2;
import poong.basic.sungjuk.SungJukVO;

//성적서비스 V3
//입력, 처리, 출력 기능 구현
//프로그램 메뉴 출력
//파일 입출력 + 직렬화 기능 추가
public interface SungJukServiceV3 extends SungJukServiceV2 {

    void initSungJuk();
    void saveSungJuk();

    void initSungJuk2();
    void saveSungJuk2();

    void initSungJuk3();
    void saveSungJuk3();


}
