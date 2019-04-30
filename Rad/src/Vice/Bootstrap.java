package Vice;

import Main.OpenMode;
import Vice.MyRad;
import Vice.NomalMode;

public class Bootstrap {
    public static void main(String[] args) {
        MyRad red=new MyRad("森森的红包");
        //设置群主名称
        red.setOwnerName("王森森");
        //普通红包
//        OpenMode normal=new NomalMode();
//        red.setOpenWay(normal);
        //随机红包
        OpenMode random=new RandomMode();
        red.setOpenWay(random);
    }
}
