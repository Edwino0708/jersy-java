
package com.api.backend.common;

import java.util.List;

public interface ICrudService<T> {
    
    public T FindById();
    public List<T> GetAll();
    public void Add(T entity);
    public void Delete(T entity);
    public void Update(T entity);
}
