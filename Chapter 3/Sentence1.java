public class Sentence1 {
    public static void main(String args[]){
        Sentence sentence1 = new Sentence("A cat ate late");
        System.out.println(sentence1.findNthTime("at",1));
        System.out.println(sentence1.findNthTime("at",5));
        System.out.println(sentence1.findNthTime("at",3));
        System.out.println(sentence1.findNthTime("bat",2));
        // sentence1.replaceNthTime("at", 1, "rane"); 
        // System.out.println(sentence1);
        // sentence1.replaceNthTime("at", 6, "xx"); 
        // System.out.println(sentence1);
        // sentence1.replaceNthTime("at", 3, "xx");
        // System.out.println(sentence1);
        sentence1.replaceNthTime("bat", 2, "xx");
        System.out.println(sentence1);
        System.out.println(sentence1.findLastTime("at"));
        System.out.println(sentence1.findLastTime("cat"));
        System.out.println(sentence1.findLastTime("bat"));
    }
}
