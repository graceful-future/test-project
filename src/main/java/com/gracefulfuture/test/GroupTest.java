package com.gracefulfuture.test;


import com.gracefulfuture.entity.AbnormalSituationRes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTest {
    public static void main(String[] args) {
        List<AbnormalSituationRes> abnormalSituationList = new ArrayList<>();
        AbnormalSituationRes abnormalSituationRes1 = new AbnormalSituationRes();
        abnormalSituationRes1.setAbnormalDate("2021-4-27");
        abnormalSituationRes1.setAbnormalType("01");
        abnormalSituationRes1.setAbnormalNum("2");

        AbnormalSituationRes abnormalSituationRes2 = new AbnormalSituationRes();
        abnormalSituationRes2.setAbnormalDate("2021-4-27");
        abnormalSituationRes2.setAbnormalType("05");
        abnormalSituationRes2.setAbnormalNum("1");

        AbnormalSituationRes abnormalSituationRes3 = new AbnormalSituationRes();
        abnormalSituationRes3.setAbnormalDate("2021-4-27");
        abnormalSituationRes3.setAbnormalType("06");
        abnormalSituationRes3.setAbnormalNum("3");

        AbnormalSituationRes abnormalSituationRes4 = new AbnormalSituationRes();
        abnormalSituationRes4.setAbnormalDate("2021-4-28");
        abnormalSituationRes4.setAbnormalType("01");
        abnormalSituationRes4.setAbnormalNum("2");

        AbnormalSituationRes abnormalSituationRes5 = new AbnormalSituationRes();
        abnormalSituationRes5.setAbnormalDate("2021-4-28");
        abnormalSituationRes5.setAbnormalType("05");
        abnormalSituationRes5.setAbnormalNum("1");

        AbnormalSituationRes abnormalSituationRes6 = new AbnormalSituationRes();
        abnormalSituationRes6.setAbnormalDate("2021-4-28");
        abnormalSituationRes6.setAbnormalType("06");
        abnormalSituationRes6.setAbnormalNum("3");

        abnormalSituationList.add(abnormalSituationRes1);
        abnormalSituationList.add(abnormalSituationRes2);
        abnormalSituationList.add(abnormalSituationRes3);
        abnormalSituationList.add(abnormalSituationRes4);
        abnormalSituationList.add(abnormalSituationRes5);
        abnormalSituationList.add(abnormalSituationRes6);

        Map<String, List<AbnormalSituationRes>> listMap = abnormalSituationList.stream().collect(Collectors.groupingBy(AbnormalSituationRes::getAbnormalType));
        System.out.println(listMap);
//        abnormalSituationList.forEach(System.out::println);
//        System.out.println("==============================");
//        abnormalSituationList.stream().forEach(System.out::println);
    }
}
