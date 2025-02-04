package labshopmonolith.domain;

import java.time.LocalDate;
import java.util.*;
import labshopmonolith.domain.*;
import labshopmonolith.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Long qty;
    private String customerId;
    private Long amount;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
