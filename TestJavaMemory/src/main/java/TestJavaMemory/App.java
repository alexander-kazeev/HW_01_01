package TestJavaMemory;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;

public class App 
{
    public static void main( String[] args )
    {
        int arrLen = 1000000;

        byte b = Byte.MAX_VALUE;
        System.gc();
        System.out.println("byte size "+ObjectSizeCalculator.getObjectSize(b)+" bytes");
        Byte bB = Byte.MAX_VALUE;
        System.gc();
        System.out.println("Byte size "+ObjectSizeCalculator.getObjectSize(bB)+" bytes");
        short sh = Short.MAX_VALUE;
        System.gc();
        System.out.println("short size "+ObjectSizeCalculator.getObjectSize(sh)+" bytes");
        int i = Integer.MAX_VALUE;
        System.gc();
        System.out.println("int size "+ObjectSizeCalculator.getObjectSize(i)+" bytes");
        long l = Long.MAX_VALUE;
        System.gc();
        System.out.println("long size "+ObjectSizeCalculator.getObjectSize(l)+" bytes");
        float f = Float.MAX_VALUE;
        System.gc();
        System.out.println("float size "+ObjectSizeCalculator.getObjectSize(f)+" bytes");
        double d = Double.MAX_VALUE;
        System.gc();
        System.out.println("double size "+ObjectSizeCalculator.getObjectSize(d)+" bytes");
        String es = "";
        System.gc();
        System.out.println("empty String size "+ObjectSizeCalculator.getObjectSize(es)+" bytes");
        BigInteger bi = BigInteger.ONE;
        System.gc();
        System.out.println("BigInteger size "+ObjectSizeCalculator.getObjectSize(es)+" bytes");
        BigDecimal bd = BigDecimal.ONE;
        System.gc();
        System.out.println("BigDecimal size "+ObjectSizeCalculator.getObjectSize(es)+" bytes");
        String fs = "dsf";
        System.gc();
        System.out.println("Not empty String (dsf) size "+ObjectSizeCalculator.getObjectSize(fs)+" bytes");
        String[] stringArray = new String[arrLen];
        for (int j = 0; j < arrLen; j++) {
            /*stringArray[j] = Integer.toString(j);*/
            stringArray[j] = Integer.toString(arrLen);
            /*stringArray[j] = "1000000";*/
            /*stringArray[j] = "a";*/
        }
        System.gc();
        long calcedSize = ObjectSizeCalculator.getObjectSize(stringArray);
        System.out.println("StringArray for "+arrLen+" elements size "+calcedSize+" bytes, i/e for 1 element "+calcedSize/arrLen+" bytes");
        Object obj = new Object();
        System.gc();
        System.out.println("Object size "+ObjectSizeCalculator.getObjectSize(obj)+" bytes");
        byte[] byteArrayOne = new byte[1];
        System.gc();
        System.out.println("byteArray for 1 elements size "+ObjectSizeCalculator.getObjectSize(byteArrayOne)+" bytes");
        Byte[] bByteArrayOne = new Byte[1];
        System.gc();
        System.out.println("ByteArray for 1 elements size "+ObjectSizeCalculator.getObjectSize(bByteArrayOne)+" bytes");
        byte[] byteArrayMin = new byte[arrLen];
        for (int j = 0; j < arrLen; j++) {
            byteArrayMin[j] = Byte.MIN_VALUE;
        }
        System.gc();
        calcedSize = ObjectSizeCalculator.getObjectSize(byteArrayMin);
        System.out.println("byteArray MIN_VALUE for "+arrLen+" elements size "+calcedSize+" bytes, i/e for 1 element "+calcedSize/arrLen+" bytes");
        Byte[] bByteArrayMin = new Byte[arrLen];
        for (int j = 0; j < arrLen; j++) {
            bByteArrayMin[j] = Byte.MIN_VALUE;
        }
        System.gc();
        calcedSize = ObjectSizeCalculator.getObjectSize(bByteArrayMin);
        System.out.println("ByteArray MIN_VALUE for "+arrLen+" elements size "+calcedSize+" bytes, i/e for 1 element "+calcedSize/arrLen+" bytes");
        byte[] byteArrayMax = new byte[arrLen];
        for (int j = 0; j < arrLen; j++) {
            byteArrayMax[j] = Byte.MAX_VALUE;
        }
        System.gc();
        calcedSize = ObjectSizeCalculator.getObjectSize(byteArrayMax);
        System.out.println("byteArray MAX_VALUE for "+arrLen+" elements size "+calcedSize+" bytes, i/e for 1 element "+calcedSize/arrLen+" bytes");
        Byte[] bByteArrayMax = new Byte[arrLen];
        for (int j = 0; j < arrLen; j++) {
            bByteArrayMax[j] = Byte.MAX_VALUE;
        }
        System.gc();
        calcedSize = ObjectSizeCalculator.getObjectSize(bByteArrayMax);
        System.out.println("ByteArray MAX_VALUE for "+arrLen+" elements size "+calcedSize+" bytes, i/e for 1 element "+calcedSize/arrLen+" bytes");
        int[] intArrayMin = new int[arrLen];
        for (int j = 0; j < arrLen; j++) {
            intArrayMin[j] = Integer.MIN_VALUE;
        }
        System.gc();
        calcedSize = ObjectSizeCalculator.getObjectSize(intArrayMin);
        System.out.println("intArray MIN_VALUE for "+arrLen+" elements size "+calcedSize+" bytes, i/e for 1 element "+calcedSize/arrLen+" bytes");
    }
}
