package esgi.arlo.arjas.jerseyservlet.persistence.mappers;

import esgi.arlo.arjas.jerseyservlet.domain.pojos.Users;
import esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersEntity;

public class UsersMapper {

    public static Users toDomain(UsersEntity entity){
        return new Users(entity.getUsername(), entity.getPassword());
    }
}
