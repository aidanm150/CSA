public class Poem {
    private int l;
    private String rhythm = "Free Verse!";
    public Poem(int lines){
        l = lines;
    }
    public Poem(){
        l = 0;
    }
    public int getNumlines(){return l;}
    public void printRhythm(){System.out.println(rhythm);}
    public String taRhythm(int rows, int[] columns){
        String rhythm = "";
        for(int i = 0; i<rows; i++){
            for(int k = 0; k<columns[i]; k++){
                rhythm += "ta";
            }
            rhythm += "\n";
        }
        return rhythm;
    }
}
