package Models;
/**
 * Класс подразделения
 */
public class Division {
    public Long id;
    public String name;
    public Division(Long id, String name){
        this.id=id;
        this.name=name;    }
        public String getName()
        {
            return  this.name;
        }
        public String getDivision()
        {
            return "division name: "+this.name+"; division id: "+this.id;
        }
}
