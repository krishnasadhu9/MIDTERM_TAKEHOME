package question3;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<BakedGoods> bakedgoods_list= new ArrayList<BakedGoods>();
		
		Cookie cookie = new Cookie(2, "cookie - contains oats and choco chips" , "05/31/2020");
		bakedgoods_list.add(cookie);
		
		CinnamonRoll cinnamonroll = new CinnamonRoll(5, "cinnamon roll - contains corn and flour", "05/31/2019");
		bakedgoods_list.add(cinnamonroll);
		
		Brownie brownie = new Brownie(3, "brownie - contains dark choclate ", "06/01/2019");
		bakedgoods_list.add(brownie);
		
		Cookie cookie2 = new Cookie(2, "cookie - contains oats and choco chips" , "05/31/2020");
		bakedgoods_list.add(cookie2);
		
		CinnamonRoll cinnamonroll2 = new CinnamonRoll(5, "cinnamon roll - contains corn and flour", "05/31/2019");
		bakedgoods_list.add(cinnamonroll2);
		
		Brownie brownie2 = new Brownie(3, "brownie - contains dark choclate ", "06/01/2019");
		bakedgoods_list.add(brownie2);
		
		Cookie cookie3 = new Cookie(2, "cookie - contains oats and choco chips" , "05/31/2020");
		bakedgoods_list.add(cookie3);
		
		CinnamonRoll cinnamonroll3 = new CinnamonRoll(5, "cinnamon roll - contains corn and flour", "05/31/2019");
		bakedgoods_list.add(cinnamonroll3);
		
		Brownie brownie3 = new Brownie(3, "brownie - contains dark choclate ", "06/01/2019");
		bakedgoods_list.add(brownie3);
		
		for(BakedGoods bg :bakedgoods_list)
		{
			System.out.printf("The Price is %d dollors \n",bg.getPrice());
			System.out.println("The Description:  " + bg.getDescription());
			System.out.println("The SellByDate:  " + bg.getSellByDate());
			
			
			
		}
		
		
		

	}

}
