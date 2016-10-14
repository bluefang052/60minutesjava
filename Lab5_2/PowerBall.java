import java.util.Arrays;

public class PowerBall {
    
    int[] whiteBalls = new int[5];
    int redBall;
    private static final int maxWhite = 49;
    private static final int maxRed = 42;

    public PowerBall() {
        generateWhiteBalls();
        generateRedBall();
    }
    private void generateWhiteBalls(){
        for(int i = 0; i <= whiteBalls.length - 1; i++){

            while (whiteBalls[i] == 0 || whiteBalls[i] > maxWhite) {
                int randomValue = (int) (Math.random() * 100);
                if (Arrays.binarySearch(whiteBalls, randomValue) < 0) {
                    whiteBalls[i] = randomValue;
                }
            }
        }
    }    
    
    private void generateRedBall(){    
        while (redBall == 0 || redBall > maxRed) {
            redBall = (int) (Math.random() * 100);
            }
    }
    
    void outPut(){
        String output = String.format("White Balls\n ------- \n %d %d %d %d %d \n Red Balls \n -----------\n %d \n", whiteBalls[0],
                whiteBalls[1], whiteBalls[2], whiteBalls[3],
                whiteBalls[4], redBall);
        
        System.out.printf(output);
    }

        
    
}
