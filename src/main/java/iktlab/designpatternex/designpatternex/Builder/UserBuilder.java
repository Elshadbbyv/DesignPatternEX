package iktlab.designpatternex.designpatternex.Builder;

import lombok.Data;

@Data
public class UserBuilder{
    private final String name;
    private final String surname;
    private final Long id;
    private final int age;
    private final String address;

    public User build(){
        User user = new User(this);
        validateUser(user);
        return user;

    }
    private void validateUser(User user){}



}


