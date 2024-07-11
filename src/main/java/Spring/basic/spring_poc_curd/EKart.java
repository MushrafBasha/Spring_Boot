package Spring.basic.spring_poc_curd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EKart {
        private int parcelId;
        private String receiverName;
        private String parcelItemName;
        private String receiverAddress;
        private Long receiverContact;
        private double itemPrice;
        private String itemStatus; // transit or delivered
        private String executiveName;

    }





