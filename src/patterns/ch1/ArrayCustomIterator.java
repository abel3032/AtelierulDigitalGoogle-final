package patterns.ch1;

public class ArrayCustomIterator {

    private int[] array;
    private int position;

    public ArrayCustomIterator(int[] array)
    {
        this.array=array;
        this.position=0;
    }


    public int next()
    {
        if(hasNext()){
            return array[this.position++];
        }
        else{
            return 0;
        }
    }

    public boolean hasNext()
    {
        return (position< array.length);
    }


}
