import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLDataException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//class Outer{
//    class Inner{
//        public void print(){
//            System.out.println("inner:print");
//        }
//    }
//}

//enum Color{
//    RED,PINK,BLUE,WHITE;
//        }

//class A{
//    static int s=0;
//    A(){
//        s++;
//        System.out.println(s);
//    }
//}

//interface Function {
//    int apply (int x); // This is an abstract method that takes an int and returns an int
//}

class Main {
    public static void main(String[] args) throws IOException, SQLDataException {
//        Path path= Paths.get();
//        Stream<String> lines = Files.lines(Path.of("hello.txt"));
//        lines.forEach(System.out::println);
//        System.out.println(path);

//        Stream ints=Stream.of(1,2,3,4);
//       boolean result = ints.parallel().isParallel();
//        ints.forEach(System.out::println);
//        System.out.println(result);

//        try {
//            System.out.println("A" + 1 / 0);
//            throw new NullPointerException("hello");
//        } catch (Exception e) {
//            System.out.println("e.getMessage()");
//            String a = "hello";
//            a = String.valueOf(11);
//            int b = 1 + Integer.valueOf("123");
//            //int b = 1+ "123";//error
//            System.out.println(b);
//            int c = +b++ + 1;
//            System.out.println(c);
////
////        Eb bus= new Eb();
////        bus.show();
////        }
////
//        }
//
//        class Sb {
//            void show() {
//                System.out.println("sss");
//            }
//        }
//        class Eb extends Sb {
//            void show() {
//                System.out.println("eeee");
//            }
//        }
//
//    }
//    int c=8;
//    boolean d = 5>5&&6>5&c++<10;
//        String a =new String("Raj");
//        String b =new String("rAJ");
//        int j;
//        System.out.println(j);

//        List<Integer> ints = Arrays.asList(1,2,3,4,5);
//        ints.replaceAll(i->i*i);
//        System.out.println(ints);

//        int ch = 0;
//        try (FileReader input = new FileReader("hello.txt")){
//            while ((ch = input.read())!=-1){
//                System.out.println((char)ch);
//            }
//        }

//        List integer = Arrays.asList(15,85,45,31,29,121,-200);
//        Integer max = (Integer) integer.stream().max((i, j)->(int)i-(int)j).get();
//        System.out.println(max);

//     Set set= new CopyOnWriteArraySet();
//     set.add(2);
//     set.add(1);
//     set.add(5);
//        Iterator iter = set.iterator();
//        set.add(10);
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//
//
//        }Locale local= Locale.JAPAN;
//        System.out.println(local);

//Outer.Inner iner = new Outer().new Inner();
//iner.print();

        //System.out.println(Color.BLUE.ordinal());
//
//        Stream words = Stream.of("eeny","meeny","miny","mo");
//        String boxStr = words.collect(Collectors.joining(",","[","]")).toString();
//        System.out.println(boxStr);
//        //Iterator iter = words.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }


//        String[] brics={"india","brasil","rassia","china"};
//        Arrays.sort(brics,null);
//        Arrays.stream(brics).forEach(i-> System.out.println(i));

//        try{
//            A a = new A();
//            int i = 10/0;
//            A b = new A();
//
//        }catch (NullPointerException| ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println(e.getClass());
//          // e = new NullPointerException();
//            System.out.println(e.getCause());
//        }
//
//
//        Function f = x -> x * x; // This is a lambda expression that creates a Function object
//        System.out.println(useFunction(f, 12)); // This prints 100
//    }
//
//    public static int useFunction(Function f, int x) {
//        return f.apply(x); // This calls the apply method of the Function object
//        String c ="Hello im raj";
//        boolean var = c.startsWith("hello");
//        StringBuffer s1= new StringBuffer("Rajkumar");
//        StringBuffer s2= s1.reverse();
//        System.out.println(s2)

        Main obj =new Main();


    }
}

