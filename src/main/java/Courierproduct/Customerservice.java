package Courierproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class Customerservice {
        @Autowired
        basiss jpa;

        public Courierentity post(Courierentity data){
            return jpa.save(data);
        }

        public List<Courierentity> get_excutive(String name){
            return  jpa.findAllByExecutiveName(name);
        }

        public List<Courierentity> get_address(String address){
            return jpa.findAllByReceiverAddress(address);
        }

        public List<Courierentity> get_receiver(String receiver){
            return jpa.findAllByReceiverName(receiver);
        }


    }









