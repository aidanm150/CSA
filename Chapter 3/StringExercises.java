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
        String s1 = s.replace('0','2');
        s1 = s1.replace('1','0');
        s1 = s1.replace('2', '1');
        return s1;
    }

    public static String dateString(String dateStr){
        String s1 = dateStr.substring(0, 3);
        String s2 = dateStr.substring(3, 6);
        s2+=s1;
        String s4 = dateStr.substring(6, 10);
        s2+=s4;
        return s2;
    }

    public static String dateString2(String dateStr){
        int first = dateStr.indexOf("/");
        int last = dateStr.lastIndexOf("/");
        int len = dateStr.length();
        String s1 = dateStr.substring(0,first);
        String s2 = dateStr.substring(first+1,last+1);
        String s3 = dateStr.substring(last, len);
        s2+=s1;
        s2+=s3;
        return s2;
    }

    public static boolean startsWith(String s, String prefix){
        int pLen = prefix.length();
        int sLen = s.length();
        if(pLen>sLen) return false;
        String s1 = s.substring(0,pLen);
        boolean f = prefix.equalsIgnoreCase(s1); 
        return f;
    }

    public static boolean endsWith(String s, String suffix){
        int sufLen = suffix.length();
        int sLen = s.length();
        if(sufLen>sLen) return false;
        int sufLen2 = sLen-sufLen;
        String s1 = s.substring(sufLen2,sLen);
        boolean f = suffix.equalsIgnoreCase(s1); 
        return f;
    }

    public static String removeTag(String m, String tag){
        int mStart = m.indexOf(">")+1;
        int mEnd = m.lastIndexOf("/"+tag)-1; 
        if(mStart==-1||mEnd<mStart) return m;
        String s = m.substring(mStart, mEnd);
        return s;
    }

    public static void main(String args[]){
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));
    
        System.out.println(convertName(" Reubenstein, Lori Renee  	"));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));
    
        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));
    
        System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));
    
        System.out.println("04/20/2014 becomes " + dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + dateString2("04/2/2014"));
        System.out.println("4/2/2024 becomes " + dateString2("4/2/2024"));
    
        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));
    
        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));
    
        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday", "title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}