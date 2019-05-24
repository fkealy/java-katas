public class BowlingGame {

    private int total;
    private String rolls;
    private String[] frames;

    public void setRolls(String rolls) {
        this.rolls = rolls;
        this.frames =  rolls.split(" ");
    }

    public int score() {
        for(int i = 0; i < frames.length ; i++ ){
           total += getFrameScore(frames[i],i);
        }
        System.out.println(total);
        return total;
    }

    private int getFrameScore(String frame, int i) {
        int frameScore=0;
        for(char c: frame.toCharArray()){
            switch(c) {
                case 'X':
                    if(i < 9) {
                        frameScore += 10 + getBonusScoreForStrike(frames[i + 1].toCharArray());
                        if(frames[i+1].toCharArray()[0]== 'X'){
                            frameScore += getBonusScoreForSpare(frames[i+2].toCharArray());
                        }

                    } else {
                        frameScore += 10;
                    }
                    break;
                case '/':
                    if(i < 10) {
                        frameScore = 10 + getBonusScoreForSpare(frames[i + 1].toCharArray());
                    }
                    break;
                case '-':
                    break;
                default:
                    if(i<10) {
                        frameScore += Character.getNumericValue(c);
                    }
            }
        }
        return frameScore;
    }

    private int getBonusScoreForSpare(char[] frame) {
        int framePreMultiplierScore = 0;
        switch (frame[0]) {
            case 'X':
            case '/':
                return 10;
            case '-':
                break;
            default:
                framePreMultiplierScore += Character.getNumericValue(frame[0]);
        }
        return framePreMultiplierScore;
    }

    private int getBonusScoreForStrike(char[] frame) {
        int framePreMultiplierScore = 0;
        for(char c: frame){
            switch(c){
                case 'X':
                case '/': return 10;
                case '-': break;
                default: framePreMultiplierScore += Character.getNumericValue(c);
            }
        }
        return framePreMultiplierScore;
    }
}



