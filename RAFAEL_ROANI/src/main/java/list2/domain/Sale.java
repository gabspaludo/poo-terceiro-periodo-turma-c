package list2.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Sale {
    double valueSale;
    double discount;
    int quantity;
}
