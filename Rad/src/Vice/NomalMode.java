package Vice;

import Main.OpenMode;

import java.util.ArrayList;

public class NomalMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        int avg=totalMoney/totalCount;
        int mod=totalMoney%totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);
        }
        int last=avg+mod;
        list.add(last);
        return list;
    }
}
