import Models.Division;
import Models.Person;
import au.com.bytecode.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Loader {
    /**
     * Функция загрузки людей из csv файла
     * @param path путь до файла
     * @return List с данными о людях
     * @throws IOException
     */
    private final DivisionStorage divisionsStore = new DivisionStorage();
    public List<Person> downloadPersons(String path) throws IOException {
        List<Person> persons = new ArrayList<>();
        CSVReader reader;
        try{
            reader = new CSVReader(new FileReader(path), ';' , '"' , 1);
        }
        catch (FileNotFoundException e){
            throw new FileNotFoundException(path);

        }
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            Person person = new Person(
                    Long.valueOf(nextLine[0]),
                    nextLine[1],
                    nextLine[2],
                    divisionsStore.getDivision(nextLine[4]),
                    Integer.parseInt(nextLine[5]),
                    LocalDate.parse(nextLine[3],formatter)
            );

            persons.add(person);
        }
        return persons;
    }
}