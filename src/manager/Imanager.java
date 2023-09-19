package manager;

import java.util.ArrayList;

public interface Imanager <E>{
    void add (E e);
    void edit(int id, E e);
    void delete (int id);
    int findIndexById(int id);
    ArrayList<E> findAll();
}
