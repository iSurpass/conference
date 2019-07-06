package com.youkeda.web.service.impl;

import com.youkeda.web.service.HandleService;
import com.youkeda.web.utils.HandleData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 推荐算法实现类
 *
 * @author Juniors
 */
@Service
public class HandleServiceImpl implements HandleService {

        static final int FLOOR = 20;
        static final int ROOM  = 5;

        public Map<Integer,Integer> handle( int floor, int room, int capacity_need, int[][] a){

            int flag = 0;
            Map<Integer,Integer> map = new HashMap<>();

            // 基础层
            if( flag ==0 ) {
                ArrayList<Integer> list = new ArrayList<>();
                ArrayList<Integer> list_length = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    if (a[floor][i] >= capacity_need) {
                        list.add(i);
                        list_length.add(Math.abs(room - i));
                    }
                }

                for (int i = 0; i < list.size(); i++) {
                    int min = list_length.get(0);
                    int min_index = list.get(0);
                    if (list_length.get(i) <= min) {
                        min_index = list.get(i);
                        min = list_length.get(i);
                        map.put(floor, min_index);
                    }
                }

                if(map.size()==0){
                    flag = 1;
                }
            }
            // 下一层
            if(flag == 1){
                ArrayList<Integer> list_1 = new ArrayList<>();
                ArrayList<Integer> list_length_1 = new ArrayList<>();
                ArrayList<Integer> list_2 = new ArrayList<>();
                ArrayList<Integer> list_length_2 = new ArrayList<>();

                for(int i = 0; i < 10; i++){
                    if(a[floor-1][i] >= capacity_need ){
                        list_1.add(i);
                        list_length_1.add(Math.abs(room - i));
                    }
                }
                for(int i = 0; i < list_1.size(); i++){
                    int min = list_length_1.get(0);
                    int min_index = list_1.get(0);
                    if(list_length_1.get(i) <= min){
                        min_index = list_1.get(i);
                        min = list_length_1.get(i);
                        map.put(floor-1,min_index);
                    }
                }
            }
            return map;
        }

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
                capacities2[i][j] = HandleData.handle(string2[i][j]);
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
                string3[i][j] = des;
            }
        }

        int[][] capacities3 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities3[i][j] = HandleData.handle(string3[i][j]);
            }
        }

        String[][] string4 = new String[10][10];

        int floor4,room4;

        for (int i=0;i<10;i++){

            floor4 = i;
            floor4++;
            for (int j=0;j<10;j++){

                room4 = j;
                room4++;
                String des = "4-" + floor4 + "-" + room4;
                string4[i][j] = des;
            }
        }

        int[][] capacities4 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities4[i][j] = HandleData.handle(string4[i][j]);
            }
        }

        String[][] string5 = new String[10][10];

        int floor5,room5;

        for (int i=0;i<10;i++){

            floor5 = i;
            floor5++;
            for (int j=0;j<10;j++){

                room5 = j;
                room5++;
                String des = "5-" + floor5 + "-" + room5;
                string5[i][j] = des;
            }
        }

        int[][] capacities5 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities5[i][j] = HandleData.handle(string5[i][j]);
            }
        }

        String[][] string6 = new String[10][10];

        int floor6,room6;

        for (int i=0;i<10;i++){

            floor6 = i;
            floor6++;
            for (int j=0;j<10;j++){

                room6 = j;
                room6++;
                String des = "6-" + floor6 + "-" + room6;
                string6[i][j] = des;
            }
        }

        int[][] capacities6 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities6[i][j] = HandleData.handle(string6[i][j]);
            }
        }

        String[][] string7 = new String[10][10];

        int floor7,room7;

        for (int i=0;i<10;i++){

            floor7 = i;
            floor7++;
            for (int j=0;j<10;j++){

                room7 = j;
                room7++;
                String des = "7-" + floor7 + "-" + room7;
                string7[i][j] = des;
            }
        }

        int[][] capacities7 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities7[i][j] = HandleData.handle(string7[i][j]);
            }
        }

        String[][] string8 = new String[10][10];

        int floor8,room8;

        for (int i=0;i<10;i++){

            floor8 = i;
            floor8++;
            for (int j=0;j<10;j++){

                room8 = j;
                room8++;
                String des = "8-" + floor8 + "-" + room8;
                string8[i][j] = des;
            }
        }

        int[][] capacities8 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities8[i][j] = HandleData.handle(string8[i][j]);
            }
        }

        String[][] string9 = new String[10][10];

        int floor9,room9;

        for (int i=0;i<10;i++){

            floor9 = i;
            floor9++;
            for (int j=0;j<10;j++){

                room9 = j;
                room9++;
                String des = "9-" + floor9 + "-" + room9;
                string9[i][j] = des;
            }
        }

        int[][] capacities9 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities9[i][j] = HandleData.handle(string9[i][j]);
            }
        }

        String[][] string10 = new String[10][10];

        int floor10,room10;

        for (int i=0;i<10;i++){

            floor10 = i;
            floor10++;
            for (int j=0;j<10;j++){

                room10 = j;
                room10++;
                String des = "10-" + floor10 + "-" + room10;
                string10[i][j] = des;
            }
        }

        int[][] capacities10 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities10[i][j] = HandleData.handle(string10[i][j]);
            }
        }

        map.put(1,capacities1);
        map.put(2,capacities2);
        map.put(3,capacities3);
        map.put(4,capacities4);
        map.put(5,capacities5);
        map.put(6,capacities6);
        map.put(7,capacities7);
        map.put(8,capacities8);
        map.put(9,capacities9);
        map.put(10,capacities10);

        int[][] finalCap = map.get(tar);
        int floor = Integer.parseInt(desString[1]);
        int room = Integer.parseInt(desString[2]);

        floor--;
        room--;

        Map<Integer, Integer> desMap;

        desMap =  handle(floor,room,Integer.parseInt(capacities),finalCap);


        int desRoom = 0;
        int desFloor = 0;

        for (Integer key : desMap.keySet()) {

            Integer value = desMap.get(key);

            desFloor = key;
            desRoom = value;
        }

        desFloor++;
        desRoom++;

        desString[2] = String.valueOf(desRoom);
        desString[1] = String.valueOf(desFloor);
        String qq = desString[0] + "-" + desString[1] + "-"  + desString[2];
        System.out.println(qq);
        qq = HandleData.skr(qq);

        return qq;
    }
}
