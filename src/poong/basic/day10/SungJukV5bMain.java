package poong.basic.day10;

import poong.basic.sungjuk.SungJukService;
import poong.basic.sungjuk.SungJukServiceImpl;
import poong.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {



//        SungJukV5Service sjsrv = new SungJukV5ServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();

        SungJukVO sj = sjsrv.readSungJuk();

        sjsrv.computeSungJuk(sj);

        sjsrv.printSungJuk(sj);

    }
}
