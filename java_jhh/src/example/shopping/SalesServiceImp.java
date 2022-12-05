package example.shopping;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public abstract class SalesServiceImp implements SalesService {
	
	
	public Sales inputSales(String type) {
		Scanner scan = new Scanner(System.in);
		System.out.print("일시 : ");
		String date = scan.nextLine();
		System.out.print("분류 : ");
		String type = scan.nextLine();
		System.out.print("제품명 : ");
		String title = scan.nextLine();
		System.out.print("수량 : ");
		int amount = scan.nextInt();
		if(amount <= 0)
			return null;
		Product product = new Product(type, title, 0, 0);
		Sales sales =
				new Sales(product, amount, 0, date, SalesType.);
				
			return sales;
	}

	@Override
	public void printByYear(List<Sales> salesList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도 : " );
		String year = scan.nextLine();
		printSales(salesList, s->{
			String salesDate = s.getDateStr().substring(0, date.length())
			return salesDate.equals(date);
		});
	}

	@Override
	public void printSales(List<Sales> salesList, Predicate<Sales> p) {
		if(salesList == null || salesList.size() == 0) {
			System.out.println("결과 없습니다.");
			return;
		}
		int count = 0;
		for(Sales sales : salesList) {
			if(p.test(sales)) {
				System.out.println(sales);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("결과 없습니다.");
		}
	}	
}
