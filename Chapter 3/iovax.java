public class iovax{
    boolean stupid = true;
    public boolean isStupid(){
        if(stupid==true){
            return true; 
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        iovax ab = new iovax();
        System.out.println(ab.isStupid());
    }
}
