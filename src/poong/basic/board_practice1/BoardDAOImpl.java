package poong.basic.board_practice1;

import poong.basic.jdbc.JDBCUtil;
import poong.basic.sungjuk.SungJukVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements BoardDAO{




    private JDBCUtil jdbc;

    private String insertSQL =
            " insert into board (bdno, title, userid, regdate, views, thumbup, contents)" +
            " values (?, ?, ?, ?, ?, ?, ?) ";

    private String selectSQL = " select bdno, title, userid, regdate, views, thumbup, contents) " +
            " from board " +
            " order by bdno;";

    private String selectOneBoard = "select * from board where bdno = ?";

    private String updateSQL =
            "update board set bdno = ?, title = ?, userid = ?, regdate = current_timestamp " +
                    " , views = ?, thumbup = ? , contents = ? " +
                    "where bdno = ? ";

    private String deleteSQL = "delete from board where bdno = ? ";

        public BoardDAOImpl() {
        jdbc = new JDBCUtil();
    }





    @Override
    public int insertBoard(BoardVO bd) {

    int cnt = 0;

        try (
        Connection conn = jdbc.openConn();
        PreparedStatement pstmt = conn.prepareStatement(insertSQL);

                ) {
        pstmt.setInt(1, bd.getBdno());
        pstmt.setString(2, bd.getTitle());
        pstmt.setString(3, bd.getUserid());
        pstmt.setString(4, bd.getRegdate());
        pstmt.setInt(5, bd.getViews());
        pstmt.setInt(6, bd.getThumbup());
        pstmt.setString(7, bd.getContents()+"");

        cnt = pstmt.executeUpdate(); //cnt는 영향받은 레코드의 수를 반환한다.

    } catch (Exception ex) {
        ex.printStackTrace();
    }

        return cnt;
}




    @Override
    public List<BoardVO> selectBoard() {


        List<BoardVO> bdlist = new ArrayList<>();

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(selectSQL);
                ResultSet rs = pstmt.executeQuery();
        ) {

            while(rs.next()) {
                BoardVO bd = new BoardVO(
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5)

                );
                bd.setSjno(rs.getString(1));
                bd.setRegdate(rs.getString(6));
                bdlist.add(bd);
            }

        } catch (Exception ex ) {
            ex.printStackTrace();
        }

        return bdlist;

    }//public List<BoardVO> selectBoard()



    @Override
    public BoardVO selectOneBoard(int bdno) {
        return null;
    }



    @Override
    public int updateBoard(BoardVO bd) {
        return 0;
    }



    @Override
    public int deleteBoard(int bdno) {
        return 0;
    }
}
