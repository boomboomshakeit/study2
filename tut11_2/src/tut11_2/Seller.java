package tut11_2;

import java.util.ArrayList;
import java.util.List;

public class Seller {
	
	private int memberID;
	private String memberName;
	
	//아이디랑 비번을 등록하면 리스트가 공간을 만들어준다.
	List<Item> list = null;
	
	public Seller(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
		
		list = new ArrayList<Item>(); //상품을 등록시킬 공간을 만듬
	}
	
	public void addItem(String itemName, int itemPrice, int itemStock) { //Item item 이것과 같은 뜻
		Item item = new Item();
		item.setItemName(itemName);
		item.setIeamPrice(itemPrice);
		item.setItemStock(itemStock); //아이템에 저장시켜는 것
		
		list.add(item); //줄이 만들어지면서 상품이 들어감
	}
	
	public void showMemberInfo() {
		
		for(Item info : list) {
			System.out.println("판매자 아이디 : " +memberID + "| 판매자 이름 : " + memberName + "| 상품명 : " + info.getItemName() + "| 상품가격 : " + info.getIeamPrice() + "| 상품재고 : " + info.getItemStock());
		}
		System.out.println(list.size() + "개의 상품이 등록 되어 있습니다.");
	}
	
	
}
