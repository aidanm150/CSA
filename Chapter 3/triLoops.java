public class triLoops{
    public void eights(){
        for(int i=8;i>=0;i-=2){
            for(int g=8;g>i;g-=2){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void alternate(int x){
        for(int i=1;i<=x;i++){
            if(i%2==0){
                for(int k=i;k>=1;k--){
                    System.out.print(k);
                }
                System.out.println();
            }
            else{
                for(int g=1;g<=i;g++){
                    System.out.print(g);
                }
                System.out.println();
            }
        }
    }
    public void isosceles(int h){
        for(int i=1;i<h;i++){
            for(int g=h-1;g>=1;g--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        triLoops ab = new triLoops();
        ab.eights();
        ab.alternate(6);
        ab.alternate(5);
        ab.isosceles(6);
    }
}