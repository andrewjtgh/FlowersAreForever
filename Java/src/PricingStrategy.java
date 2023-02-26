import java.util.Collection;

public interface PricingStrategy {
  static final int REGULAR = 99;
  static final int VALENTINE = 0;
  static final int MOTHER = 1;

  float calculateTotal(Collection<Product> items);
}
