public class StringExercises{
    public static String scroll(String s){
        String k="";
        String x="";
        int a = s.length();
        k+=s.charAt(0);
        x=s.substring(1, a);
        x+=k;
        return x;
    }

    public static String convertName(String s){
        int k = s.lastIndexOf(",");
        s=s.trim();
        if(k>=1){
            String s2 = s.substring(0,k);
            String s3 = s.substring(k+1);
            String s4=" ";
            s=s3+s4+s2;
            s=s.trim();
        }
        return s;
    }

    public static String negative(String s){
        String s1 = 
    }

    public static void main(String args[]){
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));
        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));
        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));
        // System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));
        // System.out.println("04/20/2014 becomes" + dateString2("04/20/2014"));
        // System.out.println("4/20/2014 becomes" + dateString2("4/20/2014"));
        // System.out.println("04/2/2014 becomes" + dateString2("04/2/2014"));
        // System.out.println("4/2/2014 becomes" + dateString2("4/2/2014"));
        // System.out.println("\nstartsWith");
        // System.out.println(startsWith("architecture", "arch"));
        // System.out.println(startsWith("architecture", "a"));
        // System.out.println(startsWith("arch", "architecture"));
        // System.out.println(startsWith("architecture", "rch"));
        // System.out.println(startsWith("architecture", "architecture"));
        // System.out.println("\nendsWith");
        // System.out.println(endsWith("astronomy", "nomy"));
        // System.out.println(endsWith("astronomy", "y"));
        // System.out.println(endsWith("astronomy", "nom"));
        // System.out.println(endsWith("nomy", "astronomy"));
        // System.out.println(endsWith("astronomy", "astronomy"));
        // System.out.println("\nremoveTag");
        // System.out.println(removeTag("<b>Hello World</b>", "b"));
        // System.out.println(removeTag("<b>Hello World</b>", "head"));
        // System.out.println(removeTag("Hello World</b>", "b"));
        // System.out.println(removeTag("<b>Hello World", "b"));
        // System.out.println(removeTag("</img>Hello World<img>", "img"));
        // System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        // System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
        // "title"));
        // System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}