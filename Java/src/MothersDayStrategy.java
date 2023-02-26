import java.util.*;

// markup only Flowers by 15% for Mothers Day
public class MothersDayStrategy implements PricingStrategy {

	public float calculateTotal(Collection<Product> items) {
		float total = 0.0f;
		Iterator<Product> iter = items.iterator();

		while (iter.hasNext()) {
			Product item = iter.next();
			float price = item.getPrice();
			if (item.getClass() == Flower.class) {
				price = item.getPrice() * 1.15f;
			}
			System.out.println("MothersDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
			total += price;
		}
		return total;
	}
}
