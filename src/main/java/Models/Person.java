package Models;

import java.time.LocalDate;
/**
 * Класс человека
 */
public class Person {
    public Long id;
    public String name;
    public String gender;
    public Division division;
    public Integer salary;
    public LocalDate birthdate;
   public Person(Long id,String name,String gender,Division division,Integer salary,LocalDate birthdate)
    {
        this.id= id;
        this.name=name;
        this.gender=gender;
        this.division=division;
        this.salary=salary;
        this.birthdate=birthdate;
    }
    public String getPerson()
    {
        return "id: " + this.id.toString() + "; birthdate: " + this.birthdate.toString() + "; salary: " + this.salary.toString() + "; gender: " + this.gender.toString() + "; name: " + this.name.toString() +"; " +this.division.getDivision();
    }
}

