public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    int p = 0;
    public static int gamesPlayed = 0;
    public static int goalsScored = 0;


    public SoccerTeam(){
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore){
        if(myScore>otherScore){
            this.wins++;
            other.losses++;
        }
        else if(otherScore>myScore){
            other.wins++;
            this.losses++;
        }
        else if(otherScore==myScore){
            this.ties++;
            other.ties++;
        }
        goalsScored+= myScore+otherScore;
        gamesPlayed++;
    }

    public int points(){
        for(int i = 0; i<=wins;i++){
            p+=3;
        }
        for(int i = 0; i<=ties;i++){
            p++;
        }
        return p;
    }

    public void reset(){
        wins = 0;
        ties = 0;
        losses = 0;
    }

    public static int getGamesPlayed(){
        return gamesPlayed;
    }
    public static int getGoalsScored(){
        return goalsScored;
    }

    public static void startTournament(SoccerTeam a, SoccerTeam b, SoccerTeam c, SoccerTeam d){
        int f = (int)(Math.random()*10)+1;
        int o =(int)(Math.random()*10)+1;
        a.played(b, f, o);
        if(f==o){
            f=(int)(Math.random()*10)+1;
            o=(int)(Math.random()*10)+1;
            a.played(b, f, o);
        }
        int l = (int)(Math.random()*10)+1;
        int w = (int)(Math.random()*10)+1;
        c.played(d,l,w);
        if(l==w){
            l=(int)(Math.random()*10)+1;
            w=(int)(Math.random()*10)+1;
            c.played(d, l, w);
        }
        System.out.println("Team A:"+a.points()+" Team B:"+b.points()+" Team C:"+c.points()+" Team D:"+d.points()+" Total games played:"+ getGamesPlayed()+" Total goals scored:"+getGoalsScored());
        int y = (int)(Math.random()*10)+1;
        int r = (int)(Math.random()*10)+1;
        int s = (int)(Math.random()*10)+1;
        int g = (int)(Math.random()*10)+1;
        if((a.points()>b.points()&&c.points()>d.points())||(a.points()<b.points()&&c.points()<d.points())){
            a.played(c, y, r);
            if(y==r){
                y=(int)(Math.random()*10)+1;
                r=(int)(Math.random()*10)+1;
                a.played(c,y,r);
            }
            b.played(d,s,g);
            if(s==g){
                s=(int)(Math.random()*10)+1;
                g=(int)(Math.random()*10)+1;
                b.played(d, s, g);
            }
        }
        else{
            b.played(c,y,r);
            if(y==r){
                y=(int)(Math.random()*10)+1;
                r=(int)(Math.random()*10)+1;
                b.played(c,y,r);
            }
            a.played(d, s, g);
            if(s==g){
                s=(int)(Math.random()*10)+1;
                g=(int)(Math.random()*10)+1;
                a.played(d, s, g);
            }
        }

        System.out.println("Team A:"+a.points()+" Team B:"+b.points()+" Team C:"+c.points()+" Team D:"+d.points()+" Total games played:"+getGamesPlayed()+" Total goals scored:"+getGoalsScored());
    }

    public static void main(String args[]){
        SoccerTeam a = new SoccerTeam();
        SoccerTeam b = new SoccerTeam();
        SoccerTeam c = new SoccerTeam();
        SoccerTeam d = new SoccerTeam();
        startTournament(a,b,c,d);
        startTournament(a, b, c, d);
    }
}
