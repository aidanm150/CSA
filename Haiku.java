public class Haiku extends Poem{
    private int[] syllables = {5,7,5};

    public Haiku(){
        super(3);
    }

    public int getSyllables(int line){
        return syllables[line];
    }

    public void printRhythm(){
        System.out.println(taRhythm(getNumlines(), syllables));
    }
}
