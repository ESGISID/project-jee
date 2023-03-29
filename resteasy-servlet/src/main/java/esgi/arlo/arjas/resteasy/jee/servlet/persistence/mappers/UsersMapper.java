package esgi.arlo.arjas.resteasy.jee.servlet.persistence.mappers;

import esgi.arlo.arjas.resteasy.jee.servlet.domain.pojos.Users;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.entities.UsersEntity;

public class UsersMapper {

    public static Users toDomain(UsersEntity entity){
        return new Users(entity.getName(), entity.getPassword(), entity.getValue(), entity.getSomeCode());
    }
}
