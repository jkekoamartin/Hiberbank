package repositories.interfaces;

import java.util.List;

public interface CrudOperations<T, ID> {

    T getById(ID id);

    List<T> getAll();

    void deleteById(ID id);

    void save(T object);

    void update(T object);

}
