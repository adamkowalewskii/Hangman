package com.pack;

public class Draw {
    int misses;
    int attemps;
    int diffrence;

    Draw(int misses, int attemps){
        this.misses = misses;
        this.attemps = attemps;
        this.diffrence = 11 - attemps + misses;

        drawing();
    }

    private void drawing(){
        if(diffrence == 0){
            System.out.println(" O\n/|\\\n/ \\");
        }
        else if(diffrence == 1){
            System.out.println(" |\n O\n/|\\\n/ \\");
        }
        else if(diffrence == 2){
            System.out.println(" |\n |\n O\n/|\\\n/ \\");
        }
        else if(diffrence == 3){
            System.out.println(" |-\n |\n O\n/|\\\n/ \\");
        }
        else if(diffrence == 4){
            System.out.println(" |--\n |\n O\n/|\\\n/ \\");
        }
        else if(diffrence == 5){
            System.out.println(" |---\n |\n O\n/|\\\n/ \\");
        }
        else if(diffrence == 6){
            System.out.println(" |----\n |\n O\n/|\\\n/ \\");
        }
        else if(diffrence == 7){
            System.out.println(" |----|\n |\n O\n/|\\\n/ \\");
        }
        else if(diffrence == 8){
            System.out.println(" |----|\n |    |\n O\n/|\\\n/ \\");
        }
        else if(diffrence == 9){
            System.out.println(" |----|\n |    |\n O    |\n/|\\\n/ \\");
        }
        else if(diffrence == 10){
            System.out.println(" |----|\n |    |\n O    |\n/|\\   |\n/ \\");
        }
        else if(diffrence == 11){
            System.out.println(" |----|\n |    |\n O    |\n/|\\   |\n/ \\   |");
        }
    }
}
