
package ui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import utils.MyToys;


public class Menu {
    
    private String menuTitle;
    
    List<String> menu = new ArrayList<>();

    public Menu(String menuTitle) {
        this.menuTitle = menuTitle.toUpperCase();
    }
    
    public void addOption(String newOption){
        
        menu.add(newOption);
        
    }
    
    public void showMenu(){
        if(menu.isEmpty()){
            System.out.println("Menu is Empty!!!");
        }
        System.out.println("-------------" + menuTitle +"--------------------");
        for (String string : menu) {
            System.out.println(string);
        }
    }
    
    public int getchoice(){
        int maxchoice = menu.size();
        String msg = "Choose[1...." + maxchoice + "]: ";
        String errorMsg = "Your choice must be in range of [1..." + maxchoice + "]";
        return MyToys.getInteger(msg, errorMsg, 1, maxchoice);
    }
}
