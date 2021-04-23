package poong.basic.day19;

import java.util.ArrayList;
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
        System.out.print("아이디 : ");
        String userid = sc.nextLine();
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("본문 : ");
        String contents = sc.nextLine();

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
        System.out.print("조회할 게시물 번호를 입력하세요 : ");
        int bdno = sc.nextInt();

        BoardVO bvo = bdao.selectOneBoard(bdno);
        String result = String.format(fmt, bvo.getBdno(),
                bvo.getTitle(), bvo.getUserid(), bvo.getRegdate(),
                bvo.getViews(), bvo.getThumbup(), bvo.getContents());

        System.out.println(result);

        System.out.println("이 게시물을 추천하실래요? (y/n)");
        String thumbup = sc.next();
        if (thumbup.equalsIgnoreCase("y"))
//       = if (thumbup.toLowerCase().equals("y"))
            bdao.thumbupBoard(bdno);    //본문글 추천하기

    }

    @Override
    public void modifyBoard() {
        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 게시글 번호는 : ");
        String bdno = sc.nextLine();
        System.out.print("수정할 제목은 : ");
        String title = sc.nextLine();
        System.out.println("수정할 본문글은? ");
        String contents = sc.nextLine();

        BoardVO bvo = new BoardVO(
                            bdno, title,
                            null, null, null, null,
                            contents);

        int cnt = bdao.updateBoard(bvo);
        if (cnt>0) System.out.println("수정되었습니다.");


    }

    @Override
    public void removeBoard() {
        Scanner sc = new Scanner(System.in);

        System.out.print("삭제할 게시글 번호는? ");
        int bdno = sc.nextInt();

        bdao.deleteBoard(bdno);

        int cnt = bdao.deleteBoard(bdno);
        if (cnt>0) System.out.println("삭제 완료.");
    }

}//public class BoardServiceImpl implements BoardService {
