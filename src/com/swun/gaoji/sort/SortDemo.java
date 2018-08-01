package com.swun.gaoji.sort;

import java.util.*;

import static java.util.Objects.isNull;

/**
 * Created by Maven on 2018/8/1.
 * Description:
 */
public class SortDemo {

    private static List<SVO> svoList;

    private static void init() {
        svoList = new LinkedList<>();
        SVO s1 = new SVO("1", "张1", "A01");
        SVO s2 = new SVO("2", "张2", "A02");
        SVO s3 = new SVO("3", "张3", "A03");
        SVO s4 = new SVO("4", "张4", "A01");
        SVO s5 = new SVO("5", "张5", "A03");
        SVO s6 = new SVO("6", "张6", "A01");
        SVO s7 = new SVO("7", "张7", "A02");
        SVO s8 = new SVO("8", "张8", "A01");
        SVO s9 = new SVO("9", "张9", "A01");
        Collections.addAll(svoList, s1, s2, s3, s4, s5, s6, s7, s8, s9);
    }

    /**
     * 按系编码进行分组 便于统计
     * @param list
     */
    public  static void sort(List<SVO> list){
        HashMap<String,List<SVO>> map = new HashMap<>();
        for (SVO svo : list) {
            List<SVO> svoList = map.get(svo.getDept());
            if (isNull(svoList)) {
                svoList = new ArrayList<>();
                map.put(svo.getDept(),svoList);
            }
            svoList.add(svo);
        }

        Set<Map.Entry<String, List<SVO>>> entries = map.entrySet();
        for (Map.Entry<String, List<SVO>> entry : entries) {
            System.out.println("key:"+entry.getKey());
            List<SVO> values = entry.getValue();
            for (SVO value : values) {
                System.out.println("value:"+value);
            }

        }

    }

    public static void main(String[] args) {
        init();
        sort(svoList);
    }
}