TreeMap<Integer,Integer> treeMap=new TreeMap<>(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1>o2?1:-1;
           }
       }) ;
