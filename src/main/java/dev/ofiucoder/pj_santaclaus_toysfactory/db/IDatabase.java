package dev.ofiucoder.pj_santaclaus_toysfactory.db;

import java.util.List;

// Entities 
public interface IDatabase<E> {

    public void save(E entity);
    public List<E> getToys();

}