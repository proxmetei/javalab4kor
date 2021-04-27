import Models.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Loader downloader = new Loader();
        List<Person> persons = new ArrayList<>();
        try{
            persons = downloader.downloadPersons("src/main/resources/foreign_names.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Person p: persons){
            System.out.println(p.getPerson());
        }

    }
}
