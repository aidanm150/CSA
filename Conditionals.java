public class Conditionals {

    public boolean chimpTrouble(boolean a, boolean b){
        if ((a==true && b==true)||(a==true && b==true)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean negPos(int a, int b, boolean c){
        if(c==true){
            if(a<0 && b<0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if((a>0 && b<0)||(a<0 && b>0)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public boolean pickUpPhone(boolean time, boolean mom, boolean asleep){
        if(asleep==false && time==false){
            return true;
        }
        else if(asleep==false && time==true && mom==true){
            return true;
        }
        else{
            return false;
        }
    }

    public String setAlarm(int day, boolean vacay){
        if(vacay==false){
            if(day>0 && day<6){
                return "7:00";
            }
            else{
                return "10:00";
            }
        }
        else{
            if(day>0 && day<6){
                return "7:00";
            }
            else{
                return "off";
            }
        }
    }

    public static void main(String [] args){
        Conditionals x = new Conditionals();
        System.out.println("chimpTrouble method");
        System.out.println(x.chimpTrouble(true,true));
        System.out.println(x.chimpTrouble(false,true));
        System.out.println("negPos method");
        System.out.println(x.negPos(-2,3,true));
        System.out.println(x.negPos(-3,-2,true));
        System.out.println(x.negPos(-3,-2,false));
        System.out.println(x.negPos(3,-2,false));
        System.out.println("pickUpPhone Method");
        System.out.println(x.pickUpPhone(false, false, false));
        System.out.println(x.pickUpPhone(true, true, false));
        System.out.println(x.pickUpPhone(true,false,false));
        System.out.println(x.pickUpPhone(true, true, true));
    }

}
