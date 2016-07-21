package Moderate.doubleCola.java;

public class DoubleCola {

    /*
      Problem statement implies the sequence  num_names + 2*num_names + 2*2*num_names....
      And for 5 names we get the seq 5, 10, 20, 40, 80, 160 ....
      which are the lengths of "queue" after each iteration of "drinking"
      and the running sum is  5, 15, 35, 75, 155, ....
      we can use this to find the iteration where n falls
                           n
      intervals   [5][10][20][40][80][160]...

      we can then determine from the length of the interval which
      which name lines up with n
     */

    public static String WhoIsNext(String[] names, int n) {
        while ( n > names.length){
            n = (n - (names.length - 1)) / 2;
        }
        return names[n-1];
    }

    // bruteforce solution
    //public static String WhoIsNext(String[] names, int n) {
    //    LinkedList<String> queue = new LinkedList<>();
    //    Collections.addAll(queue, names);
    //
    //    for(int i = 1; i < n; i++) {
    //        String name = queue.pollFirst();
    //        queue.addLast(name);
    //        queue.addLast(name);
    //    }
    //
    //    return queue.peekFirst();
    //}

}
