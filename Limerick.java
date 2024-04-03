public class Limerick extends Poem {
    private int[] syllables = {9,9,6,6,9};

    public Limerick(){
        super(5);
    }

    public int getSyllables(int line){
        return syllables[line];
    }

    public void printRhythm(){
        System.out.println(taRhythm(getNumlines(), syllables));
    }
}
