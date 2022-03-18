import java.util;


class Solutions{
    public static void main(String[] args){
        }

    public static Int findIntersection(LinkedList<Int> list1, list2){
        list1 = Collections.sort(list1);
        list2 = Collections.sort(list2);

        new LinkedList resultList()

        Iterator<Int> point1 = list1.iterator();
        Iterator<Int> point2 = list2.iterator();

        while(point1.hasNext() && point2.hasNext()){
            Int p1 = point1.next();
            Int p2 = point2.next();
            if (p1 < p2){
                point1.next();
            }
            else if (p1 > p2){
                point2.next();
            }
            else{
                return p2;
            }

        }

    }


}