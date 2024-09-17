import java.util.*;
//custom classes
class solution{
    public int n1;
    public String n2;

    solution(int num1,String name1){
        this.n1 = num1;
        this.n2 = name1;
    }
}

public class basics{
    public static void main(String[] args){
        solution sol = new solution(17,"aryan");

        System.out.println(sol.n1+" "+sol.n2);


        //collections
        //arraylist
        //it is one ended list, takes constatnt time to add an element to it. 
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(11);
        alist.add(111);
        alist.add(1111);

        System.out.println(alist);
        System.out.println(alist.size());
        System.out.println(alist.get(1));
        System.out.println(alist.remove(2));
        System.out.println(alist);

        //adding element like this in the arraylist takes a lot of time
        alist.add(1,213);
        System.out.println(alist);
        System.out.println(alist.contains(213));




        //Linkedlist is similar to arraylist, it is dynamic in nature
        // only difference is it is a 2 ended list 
        LinkedList<Integer> li = new LinkedList<>();

        li.add(123);
        li.add(321);
        li.addFirst(1111);
        li.addLast(7777);
        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());

        //hashset
        //unique elements at random positions
        //****unique */
        //O(1)
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(0);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);
        hs.remove(1);

        //var will consider all integers, strings, whatever it is in the hash set so it makes it easy
        for(var num: hs){
            System.out.println(num);
        }


        //Treeset always does the sorting always., Hashset does not always do it
        // unique values
        //O(logn) bcauz sorting

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(1);
        System.out.println(ts);

        for(var num:ts){
            System.out.println(num);
        }

        //floor will print first value which is less than or equal to the value
        //so values less than or equal to 2 are 1, 2 in above treeset so the 1st one less than or equal to 2 is 2 
        //(descending order from 2.. (2,1)) so therefor 2
        System.out.println(ts.floor(2));
        System.out.println(ts.ceiling(2));



        //arraydequeue
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offer(1);
        ad.offer(2);
        ad.offer(3);
        ad.offer(1);
        System.out.println(ad);
        
        //poll will remove the first element
        ad.poll();

        //peek will help us see the first element
        System.out.println(ad.peek());

        //adds element at the last
        ad.offerLast(12);
        System.out.println(ad);



        //priority queue
        //tree type ds 
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(1);
        pq.offer(1);
        pq.offer(99);
        pq.offer(22);
        pq.offer(55);
        System.out.println(pq);

        //peek will give the smallest element
        System.out.println(pq.peek());

        pq.poll();
        System.out.println(pq.peek());







    }
}