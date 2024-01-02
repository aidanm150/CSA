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
            for(int g=h-1;g>=i;g--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int j=i-1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void upsideDown(int max, int min){
        int a = max-min;
        for(int i=1;i<=a+1;i++){
            for(int l=i-1;l>0;l--){
                System.out.print(" ");
            }
            for(int g=max;g>min;g--){
                System.out.print(g);
            }
            for(int k=min;k<=max;k++){
                System.out.print(k);
            }
            System.out.println();
            max=max-1;
        }
    }
    public static void main(String args[]){
        triLoops ab = new triLoops();
        System.out.println("Eights");
        ab.eights();
        System.out.println("alternate");
        ab.alternate(6);
        ab.alternate(5);
        System.out.println("isossceles");
        ab.isosceles(6);
        System.out.println("Upside Down");
        ab.upsideDown(8, 6);
        ab.upsideDown(9, 5);
        ab.upsideDown(6, 4);
    }
}