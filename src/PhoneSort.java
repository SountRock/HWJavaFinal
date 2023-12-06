import java.util.*;
/**
 * Класс сортировки телефонов
 */
public class PhoneSort {
    /**
    Метод сортировки пузырьком который возращает отсортированный спсиок телефонов Map
     */
    public Map<String, TreeSet<String>> MapSizeSort(Map<String, TreeSet<String>> map) {

        List<String> mapKeys = new ArrayList<>(); //сюда мы поместим все ключи

        //заполняем нас счетчик
        for (Map.Entry item : map.entrySet()) {
            mapKeys.add((String) item.getKey());
        }

        //сортируем Пузырьком
        boolean over = false;
        while (!over) {
            over = true;
            for (int i = 1; i < map.size(); i++) {
                if(map.get(mapKeys.get(i - 1)).size() > map.get(mapKeys.get(i)).size()){
                    over = false;
                    String temp = mapKeys.get(i - 1);
                    mapKeys.set(i - 1, mapKeys.get(i));
                    mapKeys.set(i, temp);
                }
            }
        }

        Map<String, TreeSet<String>> sortMap = new HashMap<>();

        //по списку правильных ключей заполняем массив
        for (int i = 0; i < mapKeys.size(); i++) {
            String key = mapKeys.get(i);
            sortMap.put(key, map.get(key));
        }

        return sortMap;
    }
}