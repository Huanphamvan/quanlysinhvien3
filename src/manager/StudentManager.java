package manager;

import model.Student;

import java.util.ArrayList;

public class StudentManager implements Imanager<Student> {
    ArrayList<Student>list= new ArrayList<>();
    @Override
    public void add(Student student) {
    list.add(student);
    }

    @Override
    public void edit(int id, Student student) {
        int index = findIndexById(id);
        list.set(index,student);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        list.remove(index);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()== id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<Student> findAll() {
        return list;
    }

}
