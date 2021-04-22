package poong.basic.board_practice1;

import java.util.List;

public interface BoardDAO {

    int insertBoard(BoardVO bd);        //게시물 입력
    List<BoardVO> selectBoard();        //게시물 조회
    BoardVO selectOneBoard(int bdno);   //게시물 하나의 번호를 넘겨받는다.
    int updateBoard(BoardVO bd);        //수정
    int deleteBoard(int bdno);          //삭제

}
