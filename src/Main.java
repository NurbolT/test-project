import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import javax.xml.soap.Node;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//        //Task1
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Random random = new Random();
//
//        for(int i=0; i<10; i++){
//            arrayList.add(random.nextInt(100));
//        }
//        System.out.println(arrayList);
//
//        //Task2
//        int maxValue1 = Collections.max(arrayList);
//        System.out.println(maxValue1);
//
//        int max = arrayList.get(0);
//        for (Integer maxValue2 : arrayList) {
//            if(max<=maxValue2){
//                max = maxValue2;
//            }
//        }
//        System.out.println(max);
//
//        //Task3
//
//        int min = arrayList.get(0);
//        for(int i=1; i<arrayList.size(); i++){
//            if(min>arrayList.get(i)){
//                min = arrayList.get(i);
//            }
//        }
//        System.out.println(min);
//
//        Iterator<Integer> integerIterator = arrayList.iterator();
//        while (integerIterator.hasNext()){
//           if(min>integerIterator.next()){
//               min = integerIterator.next();
//           }
//        }
//        System.out.println(min);
//
//        //Task4
////      ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.addAll(arrayList);
////        for(int i=0; i<arrayList.size(); i++){
////            arrayList2.add(arrayList.get(i));
////        }
//        System.out.println(arrayList2);
//
//        //Task5
//        Collections.swap(arrayList,2,3);
//        System.out.println(arrayList);


        //LeetCode
        //Task1
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        int[] twoSum = new int[2];
//        for(int i=0; i<nums.length; i++){
//            for(int j=i; j<nums.length; j++){
//                if(nums[i]+nums[j] == target){
//                    twoSum[0] = i;
//                    twoSum[1] = j;
//
//                }
//            }
//        }
//        System.out.println(twoSum[0]+" "+twoSum[1]);


        //w3resource
        //Task1
        ArrayList<String> colorsArray = new ArrayList<>();
        colorsArray.add("red");
        colorsArray.add("blue");
        colorsArray.add("yellow");
        colorsArray.add("pink");
//        System.out.println(colorsArray);


//        //Task2
//        Iterator<String> iterator = colorsArray.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//
//        }


        //Task3
//        colorsArray.add(0,"orange");
//        System.out.println(colorsArray);

//        //Task4
//        System.out.println(colorsArray.get(0));

        //Task5
//        colorsArray.set(2, "green");
//        System.out.println(colorsArray);

        //Task6
//        colorsArray.remove(2);
//        System.out.println(colorsArray);

        //Task7
//        System.out.println(colorsArray.contains("blue"));

        //Task8
//        Collections.sort(colorsArray);
//        System.out.println(colorsArray);

//        //Task9
//        ArrayList<String> newArray = new ArrayList<>();
//        newArray.add("abc");
//        newArray.add("abc");
//        newArray.add("abc");
//        newArray.add("abc");
////        ArrayList<String> newArray = new ArrayList<>(colorsArray);
//        Collections.copy(colorsArray, newArray);
//        System.out.println(newArray);

//        //Task10
//        Collections.shuffle(colorsArray);
//        System.out.println(colorsArray);


//        //Task11
//        Collections.reverse(colorsArray);
//        System.out.println(colorsArray);

//        //Task12
//        List<String> newArrayList = colorsArray.subList(1,3);
//        System.out.println(newArrayList);

//        //Task13
//        ArrayList<String> newArrayList = new ArrayList<>(colorsArray);
//        newArrayList.add(colorsArray.size(),"white");
//        System.out.println(colorsArray);
//        System.out.println(newArrayList);
//        for (String a : newArrayList) {
//            if(colorsArray.contains(a)){
//                System.out.print("YES ");
//            }else {
//                System.out.print("NO ");
//            }
//        }

//        //Task14
//        Collections.swap(colorsArray,0,3);
//        System.out.println(colorsArray);

////        //Task15
//        ArrayList<String> newArrayList = new ArrayList<>();
//        newArrayList.add("Example1");
//        newArrayList.add("Example2");
//        newArrayList.add("Example3");
//        colorsArray.addAll(newArrayList);
//        System.out.println(colorsArray);

//        //Task16
//        ArrayList<String> newArrayList =  (ArrayList<String>) colorsArray.clone();;
//        System.out.println(newArrayList);

//        //Task17
//        System.out.println(colorsArray);
//        colorsArray.removeAll(newArrayList);
//        System.out.println(colorsArray);
//        colorsArray.clear();
//        System.out.println(colorsArray);

        //Task18
//        colorsArray.clear();
//        if(colorsArray.isEmpty()){
//            System.out.println("ArrayList is empty");
//        }else {
//            System.out.println("ArrayList conatins " + colorsArray.size() + " elements");
//        }

//        //Task19
////        colorsArray.trimToSize();
////        System.out.println(colorsArray);

//        //Task20
//        colorsArray.ensureCapacity(4);
//        colorsArray.add("example1");
//        colorsArray.add("example2");
//        colorsArray.add("example3");
//        colorsArray.add("example4");
//        System.out.println(colorsArray);

        //Task21
//        colorsArray.set(0, newArrayList.get(0));
//        System.out.println(colorsArray);

//        //Task22
//        for(int i=0; i<colorsArray.size(); i++){
//            System.out.println(colorsArray.get(i));
//
//        }



        //LinkedList
        //Task1
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Example1");
        linkedList.add("Example2");
        linkedList.add("Example3");
        linkedList.add("Example4");
//        linkedList.addLast("Example5");
//        System.out.println(linkedList);

//        //Task2
//        Iterator<String> iteratorLinkedList = linkedList.iterator();
//        while (iteratorLinkedList.hasNext()){
//            System.out.println(iteratorLinkedList.next());
//        }
//        for(String elementOfLinkedList : linkedList){
//            System.out.println(elementOfLinkedList);
//
//        }


//        //Task3
//        int index = 1;
//        for(int i=1; i<linkedList.size(); i++){
//            System.out.println(linkedList.get(i));
//        }
//
//        ListIterator<String> stringListIterator = linkedList.listIterator(1);
//        while (stringListIterator.hasNext()){
//            System.out.println(stringListIterator.next());
//        }

        //Task 4
//        Collections.reverse(linkedList);
//        Iterator<String> iterator = linkedList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        Iterator<String> iterator = linkedList.descendingIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //Task5
//        linkedList.add(2,"Example");
//        System.out.println(linkedList);

        //Task6
//        linkedList.addFirst("FirstExample");
//        linkedList.addLast("LastExample");
//        System.out.println(linkedList);

        //Task7-8
//        linkedList.offerFirst("First");
//        linkedList.offerLast("Last");
//        System.out.println(linkedList);

        //Task9
//        linkedList.add(1, "Second");
//        linkedList.add(4, "Fifth");
//        System.out.println(linkedList);

        //Task10
//        System.out.println("FirstElement: " + linkedList.getFirst());
//        System.out.println("LastElement: " + linkedList.getLast());


        //Task11
//        for(int i=0; i<linkedList.size(); i++){
//            System.out.println(linkedList.get(i) + "-" + i);
//        }

        //Task12
//        linkedList.remove(2);
//        System.out.println(linkedList);

        //Task13
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        System.out.println(linkedList);


        //Task14
//
//        linkedList.clear();
//        System.out.println(linkedList);

        //Task15
//        Collections.swap(linkedList,1,2);
//        System.out.println(linkedList);

        //Task16
//        Collections.shuffle(linkedList);
//        System.out.println(linkedList);

        //Task17
//        LinkedList<String> newLinkedList = new LinkedList<>();
//        newLinkedList.add("1Example");
//        newLinkedList.add("2Example");
//        newLinkedList.add("3Example");
//        newLinkedList.add("4Example");
//
//        LinkedList<String> resultLinkedList = new LinkedList<>();
//        resultLinkedList.addAll(linkedList);
//        resultLinkedList.addAll(newLinkedList);
//        System.out.println(resultLinkedList);

        //Task18
//        LinkedList<String> newLinkedList = new LinkedList<>();
//        newLinkedList = (LinkedList<String>) linkedList.clone();
//        System.out.println(newLinkedList);

        //Task19
//        System.out.println(linkedList.pop());
//        System.out.println(linkedList);

        //Task20
//        linkedList.clear();
//        System.out.println(linkedList.peekFirst());


        //Task21
//        System.out.println(linkedList.peekLast());

        //Task22

//        if(linkedList.contains("Example1")){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }

        //Task23
//        ArrayList<String> newArryList = new ArrayList<>(linkedList);
//        for(String s : newArryList){
//            System.out.println(s);
//        }

        //Task24
//        LinkedList<String> newLinkedList = new LinkedList<>();
//        newLinkedList.add("Example1");
//        newLinkedList.add("Hello1");
//        newLinkedList.add("World1");
//
//        LinkedList<String> thirdLinkedList = new LinkedList<>();
//        for(String s : linkedList){
//            thirdLinkedList.add(newLinkedList.contains(s) ? "YES" : "NO");
//        }
//        System.out.println(thirdLinkedList);

        //Task25
//        linkedList.clear();
//        System.out.println(linkedList.isEmpty() ? "IsEmpty" : "NotEmpty");

        //Task26
//        linkedList.set(2,"Hello2");
//        System.out.println(linkedList);









    }
}
