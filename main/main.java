package main;
import ArraysPlus.operate;

public class main {


    public static void main(String[] arg){
        String a = "demo";

        Byte[] d = new Byte[4];
        var c = a.getBytes();

        var c_B =operate.byteArray_2_ByteArray(c);

//        System.out.println(c_B);
        operate<Byte> op = new operate(c_B).append(c_B);
//        var arr = op.to_byteArray();
//        System.out.println(op.to_string());
//        System.out.println(op.toString());
//        System.out.println(op.decode_2_string());
        System.out.print(op.size_or_length()[1]);




    }
}
