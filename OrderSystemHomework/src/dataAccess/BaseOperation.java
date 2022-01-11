package dataAccess;

import java.util.List;

public interface BaseOperation<T> {

	void add(T data);
	List<T> getAll();
	T getById(int id) throws Exception;
}
