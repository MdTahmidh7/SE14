package DP_Presentaion.Literal;

//public class Foo {
//    private String name = "foobar";
//    public String defaultName = "foobar";
//    String something;
//
//    public Foo(String name) {
//        if (name.isEmpty()) {
//            something = "foobar";
//        }
//    }

    class Foo {
        private  final String name = "foobar";
        public String defaultName = name;
        String something;
        
        public Foo(String name) {
            if (name.isEmpty()) {
                something = name;
            }
        }
    }
//}