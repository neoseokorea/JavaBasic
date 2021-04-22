package poong.basic.sungjuk;

import java.util.List;

public interface SungJukV4DAO { //인터페이스 클래스 SungJukV4DAO를 만든다.

    int insertSungJuk(SungJukVO sj); //성적 입력
    List<SungJukVO> selectSungJuk(); // 성적 조회
    SungJukVO selectOneSungJuk(int sjno); // 한 사람 학생의 번호를 넘겨받는다.
    int updateSungJuk(SungJukVO sj); //수정
    int deleteSungJuk(int sjno); //삭제

}
