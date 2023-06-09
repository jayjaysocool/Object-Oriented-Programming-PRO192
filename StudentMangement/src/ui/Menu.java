
package ui;

import java.util.ArrayList;
import java.util.List;
import utils.MyToys;


public class Menu {
    
    private String menuTitle;
    private List<String> optionList = new ArrayList();

    public Menu(String menuTitle) {
        this.menuTitle = menuTitle;
    }
    
    public void addOption(String newOption){
        
        optionList.add(newOption);
    }
    
    public void printOpTion(){
       if(optionList.isEmpty()){
           System.out.println("Menu is Empty");
           return;
       }
        System.out.println("------------ " + menuTitle + " ------------");
        for (String string : optionList) {
            System.out.println(string);
        }
        System.out.println("-------------------------------------------"); 
       
    }
    public int getChoice(){
        
        int maxOption = optionList.size();
        
        String msg = "Choose [1...." + maxOption + "]: ";
        String errorMsg = "Your choice is required in range 1..." + maxOption;
        
        return MyToys.getAnInteger(msg, errorMsg, 1, maxOption);
    }
            
}
