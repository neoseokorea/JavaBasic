package poong.basic.day19;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BoardServiceImpl implements BoardService {





    private static BoardDAO bdao;
    private static BoardService bsrv;

    private BoardServiceImpl() {
        bdao = BoardDAOImpl.getInstance();

    }

    public static BoardService getInstance() {
        if (bsrv == null) bsrv = new BoardServiceImpl();
        return bsrv;
    }





    @Override
    public void newBoard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디 제목 본문순으로 입력하세요:");
        String userid = sc.next();
        String title = sc.next();
        String contents = sc.next();

        BoardVO bvo = new BoardVO(
                null, title, userid, null,
                null, null, contents);

        int cnt = bdao.insertBoard(bvo);
        if (cnt > 0) System.out.println("새로운 글이 등록됨");


    }





    @Override
    public void readBoard() {
        String fmt = "%s %s %s %s %s %s \n";
        ArrayList<BoardVO> bdlist =
                (ArrayList<BoardVO>)  bdao.selectBoard();

        StringBuffer sb = new StringBuffer();
        for (BoardVO b: bdlist) {
            String result = String.format(fmt,
                    b.getBdno(), b.getTitle(), b.getUserid(),
                    b.getRegdate(), b.getViews(), b.getThumbup());
            sb.append(result);
        }
        System.out.println(sb.toString());


    }





    @Override
    public void readOneBoard() {
        String fmt = "%s %s %s %s %s %s \n %s ";
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 게시물 번호를 입력하세요 : ");
        int bdno = sc.nextInt();

        BoardVO bvo = bdao.selectOneBoard(bdno);
        String result = String.format(fmt, bvo.getBdno(),
                bvo.getTitle(), bvo.getUserid(), bvo.getRegdate(),
                bvo.getViews(), bvo.getThumbup(), bvo.getContents());

        System.out.println(result);

        System.out.println("이 게시물을 추천하실래요? (y/n)");
        String thumbup = sc.next();
        if (thumbup.toLowerCase().equals("y"))
            bdao.thumbupBoard(bdno);    //본문글 추천하기

    }

    @Override
    public void modifyBoard() {

    }

    @Override
    public void removeBoard() {

    }

}//public class BoardServiceImpl implements BoardService {
