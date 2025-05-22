package za.co.shinysneakers.service;

public interface IService<Type,id>{
    Type create(Type t);

    Type read(id id);

    Type update(Type t);

}
