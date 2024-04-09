package org.ylab.dao;

import org.ylab.model.Train;

import java.util.ArrayList;
import java.util.List;

public class TrainDAO {

    private List<Train> list = new ArrayList<>();

    public void addTrain(Train training){
        list.add(training);
    }
    public Train getTrain(int id){
        Train resultTrain = null;
        for( Train train : list){
            if(train.getId()==id){
                resultTrain=train;
            }
        }
        return resultTrain;
    }
}
