package example.accountbook;

import java.util.ArrayList;
import java.util.Scanner;

public interface AccountService {
	void insertItem(ArrayList<Item> list, Item item); //가계부에 있는 내역리스트, 추가할 아이템
	void pirntItem(ArrayList<Item> list);//가계부에 있는 내역 리스트
	boolean updateItem(ArrayList<Item> list, int index, Item item);//가계부에 있는 내역리스트, 몇번지, 수정할 아이템
	void deleteItem(ArrayList<Item> list, int index);
	void printMenu();;//가계부에 있는 내역리스트, 몇번지
	void runMenu(ArrayList<Item> list, int menu, Scanner scan);
	
}
