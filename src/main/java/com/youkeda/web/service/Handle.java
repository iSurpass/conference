package com.youkeda.web.service;

import com.youkeda.web.utils.HandleData;
import org.springframework.stereotype.Service;

/**
 * @author Juniors
 */
@Service
public class Handle {

    static final int FLOOR_DISTANCE = 10;

    static final int ROOM_DISTANCE = 10;

    static final boolean FLAG = false;

    public String handle(String code,int floor,int room,int capacities){

        int cap = 0;

        if (floor == 1){

            do {
                cap = HandleData.handle(code);


            }while (capacities > cap);
            return null;
        }
        return null;
    }


    public static void main(String[] args) {

        String[][] strings = new String[10][10];

        int floor,room;

        for (int i=0;i<10;i++){

            floor = i;
            floor++;
            for (int j=0;j<10;j++){

                room = j;
                room++;
                String des = "1-" + floor + "-" + room;
                strings[i][j] = des;
            }
        }

        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.println(strings[i][j]);
//                System.out.println(HandleData.handle(strings[i][j]));
            }
        }
    }

}
