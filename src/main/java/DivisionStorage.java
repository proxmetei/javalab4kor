import Models.Division;

import java.util.HashSet;
import java.util.Set;

/**
 * Класс, хранящий объекты подразделений
 */
public class DivisionStorage {
    private Set<Division> store = new HashSet<>();
    private Long lastId = 0L;

    public Division getDivision(String name) {
        for (Division div : store) {
            if (div.getName().equals(name)) {
                return div;
            }
        }
        Division division = new Division(++lastId, name);
        store.add(division);
        return division;
    }
}
