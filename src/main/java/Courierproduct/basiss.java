package Courierproduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface basiss extends JpaRepository<Courierentity, Long> {



        List<Courierentity> findAllByExecutiveName(String executiveName);
        List<Courierentity> findAllByReceiverAddress(String receiverAddress);
        List<Courierentity> findAllByReceiverName(String receiverName);
    }







