import java.util.*;

public class HashMapExercises {
    public static void main(String[] args) {

        //Task1
        HashMap<String, String> footballClubs = new HashMap<>();
        footballClubs.put("Spain","Real Madrid");
        footballClubs.put("Germany","Borussia");
        footballClubs.put("England","Arsenal");
        footballClubs.put("Paris","PSG");
        footballClubs.put("Qazaqstan","Astana");

//        for(Map.Entry map : footballClubs.entrySet()){
//            System.out.println(map);
//        }

        //Task2
//        System.out.println(footballClubs.size());

        //Task3
//        Map<String,String> newMap = new HashMap<>(footballClubs);
//        System.out.println(newMap);
//        Map<String,String> newMap = new HashMap<>();
//        newMap.putAll(footballClubs);
//        System.out.println(newMap);

        //Task4
//        footballClubs.clear();
//        System.out.println(footballClubs);

        //Task5
//        footballClubs.clear();
//        String key = "Kyrgyzstan";
//        if(footballClubs.isEmpty()){
//            System.out.println("Empty Map");
//        }else if(footballClubs.containsKey(key)){
//            System.out.println(footballClubs.get(key));
//        }else {
//            System.out.println("Map not contains value of the key " + key);
//        }


        //Task6
//        Map<String, String> newMap = new HashMap<>(footballClubs);
//        Map<String, String> newMap = new HashMap<>();
//        newMap = (HashMap) footballClubs.clone();
//        System.out.println(newMap);

        //Task7
//        String key = "Germany";
//        if(footballClubs.containsKey(key)){
//            System.out.println(footballClubs.get(key));
//        }else{
//            System.out.println("Map not contain this key: " + key);
//        }

        //Task8
//        String value = "Kairat";
//        if(footballClubs.containsValue(value)){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }

        //Task9
//        Set set = footballClubs.entrySet();
//        System.out.println(set);

        //Task10
//        System.out.println(footballClubs.get("Spain"));

        //Task11
//        Set set = footballClubs.keySet();
//        System.out.println(set);

        //Task12
//        System.out.println(footballClubs.values());



        //PriorityQueue
        //Task1
        Queue<String> priorityQueque = new PriorityQueue<>();
        priorityQueque.add("Black");
        priorityQueque.add("White");
        priorityQueque.add("Yellow");
        priorityQueque.add("Red");
        priorityQueque.add("Blue");
//
//        for(String s: priorityQueque){
//            System.out.println(s);
//        }

        //Task2
//        Iterator iterator = priorityQueque.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //Task3
//        PriorityQueue<String> newPriorityQueque = new PriorityQueue<>();
//        newPriorityQueque.addAll(priorityQueque);
//        System.out.println(priorityQueque);

        //Task4
//        priorityQueque.offer("Aaa");
//        System.out.println(priorityQueque);

        //Task5
//        priorityQueque.clear();
//        System.out.println(priorityQueque);

        //Task6
//        System.out.println(priorityQueque.size());

        //Task7
//        PriorityQueue<String> newPriorityQueque = new PriorityQueue<>();
//        newPriorityQueque.add("Green");
//        newPriorityQueque.add("Red");
//
//        for(String s : priorityQueque){
//            System.out.println(newPriorityQueque.contains(s) ? "YES" : "NO");
//        }

        //Task8
//        System.out.println(priorityQueque.peek());
//        System.out.println(priorityQueque);

        //Task9
//        System.out.println(priorityQueque.poll());
//        System.out.println(priorityQueque);

        //Task10
//        List<String> stringList = new ArrayList<>(priorityQueque);
//        System.out.println(stringList);

        //Task11
//        String str = priorityQueque.toString();
//        System.out.println(str);

        //Task12
//        String val = null;
//        while ((val = priorityQueque.poll()) != null){
//            System.out.println(val);
//        }



        //HashSet
        //Task1
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Example1");
        hashSet.add("Example2");
        hashSet.add("Example3");
        hashSet.add("Example4");
        hashSet.add("Example5");
//        System.out.println(hashSet);

        //Task2
//        for(String s : hashSet){
//            System.out.println(s);
//        }

//        Iterator<String> s = hashSet.iterator();
//        while (s.hasNext()){
//            System.out.println(s.next());
//        }

        //Task3
//        System.out.println(hashSet.size());

        //Task4
//        hashSet.removeAll(hashSet);
//        System.out.println(hashSet.isEmpty());

        //Task5
//        if(hashSet.isEmpty()){
//            System.out.println("HashSet is not empty");
//        }else {
//            System.out.println("HashSet is empty");
//        }

        //Task6
//        HashSet<String> newHashSet = (HashSet) hashSet.clone();
//        System.out.println(newHashSet);

        //Task7
//        List<String> stringList = new ArrayList<>(hashSet);
//        System.out.println(stringList);
//        String[] strings = new String[hashSet.size()];
//        hashSet.toArray(strings);
//        for(String s : strings){
//            System.out.println(s);
//        }

        //Task8
//        TreeSet<String> treeSet = new TreeSet<>(hashSet);
//        System.out.println(treeSet);

        //Task9
//        List<String> stringList = new ArrayList<>(hashSet);
//        System.out.println(stringList);

        //Task10
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Example5");
        hashSet1.add("Example10");
        hashSet1.add("Example1");
        hashSet1.add("Example8");
        hashSet1.add("Example3");
//
//        System.out.println(hashSet1);
//        for(String s : hashSet1){
//            System.out.println(hashSet.contains(s) ? "YES" : "NO");
//        }

        //Task11
//        HashSet<String> hashSet2 = new HashSet<>();
//        for(String s : hashSet1){
//            if(hashSet.contains(s)){
//                hashSet2.add(s);
//            }
//        }
//
//        System.out.println(hashSet2);

//        hashSet.retainAll(hashSet1);
//        System.out.println(hashSet);


        //Task12
//        hashSet.clear();












    }
}
