import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
/**
 Основной класс хранящий список номеров
 */
public class PhoneBook extends PhoneSort {

    private Map<String, TreeSet<String>> phoneList; //список номеров

    public PhoneBook() {
        this.phoneList = new HashMap<>();
    }

    public PhoneBook(Map<String, TreeSet<String>> newPhoneList) {
        this.phoneList = newPhoneList;
    }

    /**
    Дабавить телефон владельцу (елси нет владельца, то он будет создан и получит введенный номер)
     */
    public void addPhone(String name, String phone){
        if(!phoneList.containsKey(name)){
            phoneList.put(name, new TreeSet<>());
        }
        phoneList.get(name).add(phone);
    }

    /**
    Получить все телефоны пользователя
     */
    public String getPhones(String name){
        return name + " : " + phoneList.get(name);
    }

    /**
    Удалить телефон кокретного владельца из книги
    */
    public boolean deletePhone(String name, String phone){
        if (phoneList.containsKey(name)){
            return phoneList.get(name).remove(phone);
        } else {
            return false;
        }
    }

    /**
    Удалить владельца номеров из книги
     */
    public boolean deleteOwner(String name){
        if(phoneList.containsKey(name)){
            phoneList.remove(name);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return MapSizeSort(phoneList).toString();
    }
}
