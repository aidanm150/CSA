public class Sentence {
    private String currSent;
    public Sentence(String p) {
       currSent = p;
    }
 
    public String toString() {
       return currSent;
    }
 
    /** Returns the index of the nth occurrence of str in the current sentence;
     * returns -1 if the nth occurrence does not exist.
     * Precondition:  str.length() > 0 and n > 0
     * Postcondition: the current sentence is not modified.
     */
    public int findNthTime(String str, int n){
        if(str.length()<=0 && n<=0) return -1;
        String s2 = currSent.substring(0,n);
        int k = s2.length();
        String s1 = currSent.substring(n);
        int s = s1.indexOf(str)+k;
        return s;
    }
 
 
    /** Modifies the current sentence by replacing the nth occurrence of str with repl
     * If the nth occurrence does not exist, the current sentence is unchanged.
     * Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthTime(String str, int n, String repl){
        int s = findNthTime(str, n);
        if(str.length()>0 && n>0 && s!=-1){
            int k = str.length();
            int u = currSent.length();
            String s1 = currSent.substring(0,s);
            int j = s1.length();
            String s3 = currSent.substring((j+k),u);
            s1+=repl;
            s1+=s3;
            currSent=s1;
        }
    }
 
    /** Returns the index of the last occurrence of str in the current sentence:
     * returns -1 if str is not found.
     * Precondition:  str.length() > 0
     * Postcondition: the current sentence is not modified.
     */
    public int findLastTime(String str){
        if(str.length()<=0) return -1;
        int k = currSent.lastIndexOf(str);
        if(k==-1) return -1;
        int c = findNthTime(str, k);
        return c;
    }
 
}
