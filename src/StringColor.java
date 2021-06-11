package src;

import java.util.ArrayList;
import java.util.Arrays;

public class StringColor{
    public int BLACK = 0, RED = 1, GREEN = 2, YELLOW = 3, BLUE = 4, PINK = 5, CYAN = 6, GRAY = 7;
    public String attachColor(int color){
        return "\033[0;3" + color + "m";
    }
    public ArrayList<String> colors = new ArrayList<String>(
        Arrays.asList(
            new String[]{"Black", "Red", "Green", "Yellow", "Blue", "Pink", "Cyan", "Gray"}
        )
    );
    public static void main(String[] args){
        StringColor stringColor = new StringColor();
        for ( String color : stringColor.colors){
            System.out.println(
                stringColor.attachColor(
                        stringColor.colors.indexOf(color)
                )
                + color
            );
        }
    }
}