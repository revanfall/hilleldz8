package com.company;

public class Main {

    public static void main(String[] args) {
        Collection col = new Collection();
        Collection col1 = new Collection();



       /* long startTime = System.nanoTime();
        for(int i=0;i<17;i++){
            col.add(Integer.toString(i));
        }
        long finishTime=System.nanoTime()-startTime;
        System.out.println(finishTime);
        При увеличении коллекции на 2/3 рузльтат-68370 наносекунд
        */
        /*long startTime = System.nanoTime();
        for(int i=0;i<17;i++){
            col.add(Integer.toString(i));
        }
        long finishTime=System.nanoTime()-startTime;
        System.out.println(finishTime);
        а при добавлении по одному элементу, результат-49349, что получилось быстрее
    */

    }

}


