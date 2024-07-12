package Spring.basic.spring_poc_curd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

//table creation//
@Entity
public class EKart {

        //Primary key//
        @Id
        //Auto increment//
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int parcelId;
        private String receiverName;
        private String parcelItemName;
        private String receiverAddress;
        private Long receiverContact;
        private double itemPrice;
        private String itemStatus; // transit or delivered
        private String executiveName;

    }





