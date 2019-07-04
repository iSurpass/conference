package com.youkeda.web.service;

import com.youkeda.web.utils.HandleData;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Juniors
 */
@Service
public class Handle {

    static {


    }

    static final int FLOOR_DISTANCE = 10;

    static final int ROOM_DISTANCE = 10;

    static final boolean FLAG = false;

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




    public static void main(String[] args) {

        String[][] string1 = new String[10][10];

        int floor,room;

        for (int i=0;i<10;i++){

            floor = i;
            floor++;
            for (int j=0;j<10;j++){

                room = j;
                room++;
                String des = "1-" + floor + "-" + room;
                string1[i][j] = des;
            }
        }

        int[][] capacities1 = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                capacities1[i][j] = HandleData.handle(string1[i][j]);
            }
        }

        System.out.println(handle(6,4,23,capacities1).get(6));
    }

}
