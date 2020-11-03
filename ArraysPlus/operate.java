package ArraysPlus;


import java.util.ArrayList;
import java.util.Arrays;

public class operate<T> {

    public  int origin_length;
    public ArrayList new_arry;
    public int length;

    public operate (T[] origin){
        this.origin_length = this.length = origin.length;
        ArrayList<T> new_arry = new ArrayList<T>(Arrays.asList(origin));

//  Arrays.asList(origin)返回的是视图view 相当于引用;
//        也可写成;
//        new_arry.addAll(Arrays.asList(origin));

        this.new_arry = new_arry;
    }

    public  operate append (T[] add_arry){
        var a_l = add_arry.length;
        this.length+=a_l;
        for (T x:add_arry){
            this.new_arry.add(x);
        }
        var temp = new operate(this.new_arry.toArray());
        return temp;
    }

    public  T[] to_arry(T[] array){
//        生成array数组
        return (T[]) this.new_arry.toArray(array);
    }

    public Byte[] to_ByteArray(){

        var temp = new Byte[this.length];
        return (Byte[]) this.new_arry.toArray(temp);
    }

    public byte[] to_byteArray(){
        var temp = new Byte[this.length];
        return ByteArray_2_byteArray(
                (Byte[]) this.new_arry.toArray(temp)
        );
    }

    public String to_string(){
        return this.new_arry.toString();
    }

    public String decode_2_string(){
        var mybyte = this.to_byteArray();
        return new String(mybyte);
    }

    public Integer[] size_or_length(){

        Integer[] temp= new Integer[2];
        temp[0] = this.length;
        temp[1] = this.new_arry.size();
        return temp;
    }




    static public Byte[] byteArray_2_ByteArray(byte[] byteArray){
        int temp =byteArray.length;
//        System.out.println(temp);
        var ByteArray = new Byte[temp];
        int i = 0;
        for (byte x:byteArray){

            ByteArray[i] = x;
            i++;
        }
        return ByteArray;
    }
    static public byte[] ByteArray_2_byteArray(Byte[] ByteArray){
        int temp =ByteArray.length;

        var byteArray = new byte[temp];
        int i = 0;
        for (Byte x:ByteArray){
            if (x != null){
                byteArray[i] = x;
                i++;}

        }
        return byteArray;
    }



}
