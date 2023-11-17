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
    
    public boolean onesDigitSame(int a, int b, int c){
        int a1 = a%10;
        int b1 = b%10;
        int c1 = c%10;
        if(a1==b1||a1==c1||b1==c1){
            return true;
        }
        else{
            return false;
        }
    }

    public int blackjack(int x, int y){
        if(x<=21||y<=21){
            if(y<=21&&x<=21){
                if(x<=y){
                    return y;
                }
                else{
                    return x;
                }
            }
            else{
                if(y>x && x<=21){
                    return x;
                }
                else if(y<x && y<=21){}
                    return y;
                }
            }
        else{
            return 0;
        }
    }

    public static void main(String [] args){
        Conditionals x = new Conditionals();
        System.out.println("chimpTrouble method");
        System.out.println(x.chimpTrouble(true,true));
        System.out.println(x.chimpTrouble(false,false));
        System.out.println(x.chimpTrouble(true,false));
        System.out.println(x.chimpTrouble(false,true));
        System.out.println("negPos method");
        System.out.println(x.negPos(1,-1,false));
        System.out.println(x.negPos(-1,1,false));
        System.out.println(x.negPos(1,1,false));
        System.out.println(x.negPos(-1,-1,false));
        System.out.println(x.negPos(4,-5,true));
        System.out.println(x.negPos(-4,5,true));
        System.out.println(x.negPos(4,5,true));
        System.out.println("pickUpPhone Method");
        System.out.println(x.pickUpPhone(false, false, true));
        System.out.println(x.pickUpPhone(true, true, true));
        System.out.println(x.pickUpPhone(true,true,false));
        System.out.println(x.pickUpPhone(false, true, false));
        System.out.println(x.pickUpPhone(true, false, false));
        System.out.println(x.pickUpPhone(false, false, false));
        System.out.println("setAlarm Method");
        System.out.println(x.setAlarm(1, false));
        System.out.println(x.setAlarm(5, false));
        System.out.println(x.setAlarm(0, false));
        System.out.println(x.setAlarm(2, true));
        System.out.println(x.setAlarm(4, true));
        System.out.println(x.setAlarm(6, true));
        System.out.println("onesDigitSame Method");
        System.out.println(x.onesDigitSame(23, 19, 13));
        System.out.println(x.onesDigitSame(23, 19, 12));
        System.out.println(x.onesDigitSame(23, 19, 3));
        System.out.println(x.onesDigitSame(423, 13, 3));
        System.out.println(x.onesDigitSame(23, 29, 25));
        System.out.println("Blackjack Method");
        System.out.println(x.blackjack(19,21));
        System.out.println(x.blackjack(21,19));
        System.out.println(x.blackjack(19, 22));
        System.out.println(x.blackjack(8, 8));
        System.out.println(x.blackjack(25, 24));
        System.out.println(x.blackjack(17, 9));
        System.out.println(x.blackjack(12,18));
    }

}
