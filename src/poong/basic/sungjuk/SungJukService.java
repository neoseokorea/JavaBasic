package poong.basic.sungjuk;


//성적서비스 V1
//입력, 처리, 출력 기능 구현
//프로그램 메뉴 출력
public interface SungJukService {

    void displayMenu();
    SungJukVO readSungJuk();
    void computeSungJuk(SungJukVO sj);
    void printSungJuk(SungJukVO sj);



}
