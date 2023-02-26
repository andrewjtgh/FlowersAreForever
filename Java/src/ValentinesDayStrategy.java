import java.util.*;

// markup only Toys by 25% for Valentines Day
public class ValentinesDayStrategy implements PricingStrategy {

	public float calculateTotal(Collection<Product> items) {
		float total = 0.0f;
		Iterator<Product> iter = items.iterator();

		while (iter.hasNext()) {
			Product item = iter.next();
			float price = item.getPrice();
			if (item.getClass() == Toy.class) {
				price = item.getPrice() * 1.25f;
			}
			System.out.println("ValentinesDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
			total += price;
		}
		return total;
	}
}
