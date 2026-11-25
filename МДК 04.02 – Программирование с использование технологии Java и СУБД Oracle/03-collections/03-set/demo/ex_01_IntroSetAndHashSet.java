import java.util.HashSet;
import java.util.Set;

class ex_01_IntroSetAndHashSet {
    public static void main(String[] args){
        
        /*
            Set - это коллекция, которая не содержит дубликатов.
            HashSet - это реализация Set, которая использует хеш-таблицу для хранения элементов.
            HashSet не гарантирует порядок элементов, но обеспечивает быструю проверку наличия элемента.
           
            Основные медоды для работы:
            - add() - добавляет элемент в Set, возвращает true, если элемент был добавлен, false если элемент уже существует.
            - remove() - удаляет элемент из Set, возвращает true, если элемент
            - size() - возвращает количество элементов в Set.
            - contains() - проверяет наличие элемента в Set, возвращает true если элемент
        */

        Set<String> tags = new HashSet<>();
        tags.add("java");
        tags.add("учёба");
        tags.add("java");

        System.out.println(tags.size());
        System.out.println(tags.contains("java"));
    }
}