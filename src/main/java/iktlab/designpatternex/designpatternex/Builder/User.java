package iktlab.designpatternex.designpatternex.Builder;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;




@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class User{
    private  String name;
    private String surname;
    private  Long id;
    private int age;
    private String address;

    public User(UserBuilder builder){
        this.name = builder.getName();
        this.surname = builder.getSurname();
        this.id = builder.getId();
        this.age = builder.getAge();
        this.address = builder.getAddress();


    }


}
