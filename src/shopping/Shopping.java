package shopping;

import java.util.*;

import javax.swing.JOptionPane;

public class Shopping {
	// attributes
	private ArrayList<String> shoppingList;
	private String alternatives[] = {"List", "Add", "Show", "Exit"};
	
	// constructor
	public Shopping()
	{
		shoppingList = new ArrayList<String>();
	}
	
	// add an item to the shoppingList
	public void addItem(String celeb)
	{
		shoppingList.add(celeb);
	}
	
	// return number of items on the list
	public int numberOfItems()
	{
		return shoppingList.size();
	}
	
	// display item given an index
	public void showItem(int itemIndex)
	{
		if (itemIndex < 0) {} // not valid so do nothing
		else if (itemIndex < numberOfItems())
		{
			System.out.println(shoppingList.get(itemIndex));
		}
		else {} // not valid so do nothing
	}
	
	// display items in the shoppingList
	public void listItems() 
	{
		for (int i = 0; i < shoppingList.size(); i++)
		{
			System.out.println(shoppingList.get(i));
		}
	}
	
	public void runShopping()
	{
		int option = getChoice();
        while (option != 3)
        {
          //Action depending on choice
          if (option == 0)//List items
          {
           if (numberOfItems() >0 )
           { 
            listItems();
           }
           else System.out.println("No items in list");
          }
          else if (option == 1) //Add item
          {
           String newItem= JOptionPane.showInputDialog(null,"Enter a new item","New item", JOptionPane.PLAIN_MESSAGE);
           addItem(newItem) ; 
         
          }
          else if (option == 2) // Show items
          {
            if (numberOfItems() >0 )
            {
              String strNum= JOptionPane.showInputDialog(null,"Enter an item number","Show item", JOptionPane.PLAIN_MESSAGE);
              int num = Integer.parseInt(strNum); 
              if (num < 0)
              {
            	  System.out.println("Invalid number");
              }
              if (num <= numberOfItems())
              {
                showItem(num) ;
              }
              else System.out.println("Invalid number");
            }
            else System.out.println("No items in list");
          }
           else JOptionPane.showMessageDialog(null, "No Comprendo " +option);
         //Prompt again
         option = getChoice();
        }//End while
     }
    
    public int getChoice()
    {
        int choice = JOptionPane.showOptionDialog(null, "Select from ..","Shopping List Menu",
                     JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, alternatives, alternatives[0]);
        return choice;
    }
	
}
