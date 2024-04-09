package org.ylab.access;

import org.ylab.access.model.Person;
import org.ylab.dao.TrainDAO;
import org.ylab.model.Train;

public class Autorization {
    Person person;
    String role;

    TrainDAO trainDAO;

    public void setTrainDAO(TrainDAO trainDAO) {
        this.trainDAO = trainDAO;
    }

    public TrainDAO getTrainDAO() {
        return trainDAO;
    }

    public Autorization(Person person) {
        this.person = person;
        this.role = person.getRole();
    }

    public Train accessToPersonalTrain(int id){
        Train currentTrain = trainDAO.getTrain(id);
        return currentTrain;
    }
}
