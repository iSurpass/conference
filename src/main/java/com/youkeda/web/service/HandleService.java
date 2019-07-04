package com.youkeda.web.service;

import com.youkeda.web.utils.HandleData;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Juniors
 */
@Service
public class HandleService {

    static {


    }

    static final int FLOOR_DISTANCE = 10;

    static final int ROOM_DISTANCE = 10;

    static final boolean FLAG = false;

    /**
     * 会议室推荐核心算法
     *
     * @param floor
     * @param room
     * @param need
     * @param capacities
     * @return
     */
    public static Map<Integer,Integer> handle(int floor,int room,int need,int[][] capacities){

        Map<Integer,Integer> map = new HashMap<>();
        int des_min = 10;
        int des;
        for (int i = 0; i<10; i++){

            int ss = capacities[floor][i];

            if (capacities[floor][i] > need){
                des = Math.abs(room - i);
                if (des < des_min){
                    des_min = des;
                    map.put(floor,i+1);
                }
            }
        }
        return map;
    }




//    public static void main(String[] args) {
//
//        String[][] string1 = new String[10][10];
//
//        int floor,room;
//
//        for (int i=0;i<10;i++){
//
//            floor = i;
//            floor++;
//            for (int j=0;j<10;j++){
//
//                room = j;
//                room++;
//                String des = "1-" + floor + "-" + room;
//                string1[i][j] = des;
//            }
//        }
//
//        int[][] capacities1 = new int[10][10];
//        for (int i=0;i<10;i++){
//            for (int j=0;j<10;j++){
//                capacities1[i][j] = HandleData.handle(string1[i][j]);
//            }
//        }
//
//        System.out.println(handle(6,4,23,capacities1).get(6));
//    }


    /**
     * 为核心算法提供数据准备
     * 并封装数据
     *
     * @param code
     * @param capacities
     * @return
     */
    public String task(String code,String capacities){

        Map<Integer,int[][]> map = new HashMap<>();

        String[] desString = code.split("-");
        int tar = Integer.parseInt(desString[0]);


        String[][] string1 = new String[10][10];

        int floor1,room1;

        for (int i=0;i<10;i++){

            floor1 = i;
            floor1++;
            for (int j=0;j<10;j++){

                room1 = j;
                room1++;
                String des = "1-" + floor1 + "-" + room1;
                string1[i][j] = des;
            }
        }

        int[][] capacities1 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities1[i][j] = HandleData.handle(string1[i][j]);
            }
        }


        String[][] string2 = new String[10][10];

        int floor2,room2;

        for (int i=0;i<10;i++){

            floor2 = i;
            floor2++;
            for (int j=0;j<10;j++){

                room2 = j;
                room2++;
                String des = "2-" + floor2 + "-" + room2;
                string2[i][j] = des;
            }
        }

        int[][] capacities2 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities2[i][j] = HandleData.handle(string1[i][j]);
            }
        }


        String[][] string3 = new String[10][10];

        int floor3,room3;

        for (int i=0;i<10;i++){

            floor3 = i;
            floor3++;
            for (int j=0;j<10;j++){

                room3 = j;
                room3++;
                String des = "3-" + floor3 + "-" + room3;
                string1[i][j] = des;
            }
        }

        int[][] capacities3 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities3[i][j] = HandleData.handle(string1[i][j]);
            }
        }

        map.put(1,capacities1);
        map.put(2,capacities2);
        map.put(3,capacities3);

        int[][] finalCap = map.get(tar);
        int floor = Integer.parseInt(desString[1]);
        int room = Integer.parseInt(desString[2]);

        int ww =  handle(floor,room,Integer.parseInt(capacities),finalCap).get(floor);

        desString[2] = String.valueOf(ww);
        String qq = desString[0] + "-" + desString[1] + "-"  + desString[2];

        return qq;
    }

}
