package ru.otus.AIK.L0201.HW02_Reflection;

public class App
{
    public static void main( String[] args ) throws Throwable
    {
        System.gc();
        Object o = new String("fg");
        System.out.println("Object: "+ObjectSize.estimate(o));
        int i = Integer.MAX_VALUE;
        System.out.println("int: "+ObjectSize.estimate(i));
        double d = Double.MAX_VALUE;
        System.out.println("double: "+ObjectSize.estimate(d));
        String tempString = "sdgkdfhgd";
        System.out.println("String: "+ObjectSize.estimate(tempString));
        String tempString2 = new String(tempString);
        System.out.println("String2: "+ObjectSize.estimate(tempString2));
        String[] s = new String[1000000];
        for (int j = 0; j < s.length; j++) {
            StringBuilder sb = new StringBuilder();
            sb.append(tempString).append(String.valueOf(j));
            s[j] = sb.toString();
            // s[j] = tempString;
        }
        System.out.println("StringArray1_000_000Per1: "+ObjectSize.estimate(s)/s.length);
    }
}
