package _00_Objektinis_Programavimas_2019._18_Lambda_Lists;

public class Container<T> {
    private int size;
    private T[] elements;

    public Container(){
        elements=(T[])new Object[10];
        size=0;
    }

    public void add(T o){
        if (size <elements.length){
            elements[size]=o;
        }else{

        }
        ++size;
    }

    public T get(int index){
        if (index>=size){
            throw new IndexOutOfBoundsException("Index: "+index+";");
        }
        return (T) elements[index];
    }
}
