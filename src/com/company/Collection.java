package com.company;

public class Collection implements CustomCollection {
    String arrCollection[];
    int counter = 0;

    public Collection() {
        arrCollection = new String[10];
    }

    public String[] getLargerCollectionByOne() {
        String newArrCollection[] = new String[arrCollection.length + 1];
        for (int i = 0; i < counter; i++){
            newArrCollection[i] = arrCollection[i];
    }
        return newArrCollection;
}

    @Override
    public boolean add(String str) {
        if(counter+1>arrCollection.length)
            arrCollection=getLargerCollectionByOne();
        arrCollection[counter]=str;
        counter++;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for(int i=0;i<strArr.length;i++)
            this.add(strArr[i]);
        return true;
    }

    @Override
    public boolean addAll(Collection strColl) {
        for(int i=0;i<counter;i++)
            add(strColl.arrCollection[i]);
        return true;
    }

    @Override
    public boolean delete(int index) {
        arrCollection[index]=null;
        for(;index+1<arrCollection.length;index++)
            arrCollection[index]=arrCollection[index+1];
        counter--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        for (int i=0;i<counter;i++){
            if(arrCollection[i].equals(str))
                delete(i);
        }
        return true;
    }

    @Override
    public String get(int index) {
        return arrCollection[index];
    }

    @Override
    public boolean contains(String str) {
        for(int i=0;i<counter;i++){
            if(arrCollection[i]!=str)
                 return true;
    }
        return true;
    }

    @Override
    public boolean clear() {
        for(int i=0;i<counter;i++){
            arrCollection[i]=null;
        }
        counter=0;
        return true;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public boolean trim() {
        String tempArr[]=new String[counter];
        for(int i=0;i<counter;i++){
            tempArr[i]=arrCollection[i]; }
            arrCollection=tempArr;
        return true;
    }

    @Override
    public boolean compare(Collection coll) {
        if(this.counter!=coll.getCount() || coll.arrCollection.length!=this.arrCollection.length)
            return false;
        for(int i=0;i<counter;i++){
            if(this.arrCollection[i]!=coll.arrCollection[i])
                return false;
        }
        return true;
    }

    public int getCount() {
        return counter;
    }
    public String[] getLargerCollection() {
        String newArrCollection[] = new String[arrCollection.length +Math.round(arrCollection.length *2/3)];//округляем новую размерность массива
        for (int i = 0; i < counter; i++) {
            newArrCollection[i] = arrCollection[i];
        }
        return newArrCollection;
    }
}
