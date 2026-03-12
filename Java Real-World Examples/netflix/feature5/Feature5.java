package netflix.feature5;

public class Feature5 {

    public static void main(String[] args){

        MostRecentlyWatchedTitles lru = new MostRecentlyWatchedTitles(5);
        System.out.println("size: " + lru.size());
        lru.put(2,2);
        lru.put(1,2);
        lru.put(3,2);
        System.out.println("lru: " + lru);
        System.out.println("get9: " +  lru.get(9));
        System.out.println("Most Recently Watched: "+ lru.recent());
        System.out.println("lru: " + lru);
        System.out.println("get1: " +  lru.get(1));
        System.out.println("lru: " + lru);
        lru.put(4,2);
        System.out.println("lru: " + lru);
        System.out.println("get3: " +  lru.get(3));
        System.out.println("lru: " + lru);
        lru.put(3,3);
        System.out.println("Most Recently Watched: "+ lru.recent());
        System.out.println("lru: " + lru);
        System.out.println("get1: " +  lru.get(1));
        System.out.println("Most Recently Watched: "+ lru.recent());
        System.out.println("lru: " + lru);
        lru.put(5,1);
        System.out.println("lru: " + lru);
        lru.put(6,6);
        System.out.println("lru: " + lru);

        System.out.println("size: " + lru.size());
        System.out.println("Most Recently Watched: "+ lru.recent());
    }
}

/*
OUTPUT:
------------------------------------
size: 0
put2
put1
put3
lru: 2-2  1-2  3-2
cacheMap: {1=2, 2=2, 3=2}
get9: null
Most Recently Watched: 3
lru: 2-2  1-2  3-2
cacheMap: {1=2, 2=2, 3=2}
get1: 2
lru: 2-2  3-2  1-2
cacheMap: {1=2, 2=2, 3=2}
put4
lru: 2-2  3-2  1-2  4-2
cacheMap: {1=2, 2=2, 3=2, 4=2}
get3: 2
lru: 2-2  1-2  4-2  3-2
cacheMap: {1=2, 2=2, 3=2, 4=2}
put3
Most Recently Watched: 3
lru: 2-2  1-2  4-2  3-3
cacheMap: {1=2, 2=2, 3=3, 4=2}
get1: 2
Most Recently Watched: 1
lru: 2-2  4-2  3-3  1-2
cacheMap: {1=2, 2=2, 3=3, 4=2}
put5
lru: 2-2  4-2  3-3  1-2  5-1
cacheMap: {1=2, 2=2, 3=3, 4=2, 5=1}
put6
lru: 4-2  3-3  1-2  5-1  6-6
cacheMap: {1=2, 3=3, 4=2, 5=1, 6=6}
size: 5
Most Recently Watched: 6

 */
