package Main;

import java.util.ArrayList;
/**
 * 请将totalMoney分成count份，保存到ArrayList<Integer>中，返回即可。
 * totalMoney           总金额方便计算，已经转换为整数，单位为分
 * totalCount           红包个数
 * return
 * 元素为各个红包的金额值，所有元素的值累和等于总金额
 * */
public interface OpenMode {
    ArrayList<Integer> divide(int totalMoney, int totalCount);
}
