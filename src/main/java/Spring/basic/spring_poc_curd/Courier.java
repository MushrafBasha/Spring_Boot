package Spring.basic.spring_poc_curd;


import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ekart")
public class Courier {
        private List<EKart> Orderproduct=new ArrayList<>();

        @PostConstruct
        public void NewItem(){
            Orderproduct.add(new EKart(111,"Dinesh","Mobile","Namakkal",54867923648L,60000,"transit","Ragul"));
            Orderproduct.add(new EKart(112,"Gokul","Washing machine","Namakkal",364544197825L,48000," delivered","Kamal"));
            Orderproduct.add(new EKart(113,"Mushraf","Fridge","Salem",63542988735L,65999,"transit","Sanjay"));
            Orderproduct.add(new EKart(114,"Bharathi","Fan","Valapadzhi",659629759969L,39999," delivered","Jeeva"));
            Orderproduct.add(new EKart(115,"Manoj","Light","Namakkal",32554876209L,80000," delivered","Mohan"));
            Orderproduct.add(new EKart(116,"Karthi","Laptop","Karur",967853248730L,99000," delivered","Naveen"));
            Orderproduct.add(new EKart(117,"Dharshan","Headphones","Namakkal",967853248730L,59999,"transit","Dhanush"));
            Orderproduct.add(new EKart(118,"Dharaneesh","Camera","Namakkal",9685547321544L,85999," transit","Kalai"));
        }

        @GetMapping ("/got")
        public List<EKart> got_all(){
            return Orderproduct;
        }
        @PostMapping("/post")
        public EKart create(@RequestBody EKart new_data){
            Orderproduct.add(new_data);
            return new_data ;
        }

        @PutMapping("/new")
        public String Update(@RequestBody EKart New_updates){
            boolean update=false;
            for(int i=0;i<Orderproduct.size();i++){
                if(Orderproduct.get(i).getParcelId()==New_updates.getParcelId()){
                    Orderproduct.get(i).setItemStatus(New_updates.getItemStatus());
                    System.out.println(Orderproduct.get(i).getParcelId());
                    update=true;
                    break;
                }
            }
            if(update==true){
                return "Iterm_status "+New_updates.getItemStatus()+"is updated";
            }
            else {
                return "The parceID"+New_updates.getParcelId()+" is not in the list";
            }
        }


        @GetMapping("/get/{executive}")
        public List<EKart> executive(@PathVariable("executive") String executive) {
            return  Orderproduct.stream().filter(list->list.getExecutiveName().equalsIgnoreCase(executive)).collect(Collectors.toList());
                 if(list_E.isEmpty()){
           return null;
      }
      else {
           return list_E;
      }            
        }
        @GetMapping("/get/address/{address}")
        public List<EKart>  address(@PathVariable("address") String address){
            return  Orderproduct.stream().filter(list->list.getReceiverAddress().equalsIgnoreCase(address)).collect(Collectors.toList());
                
                  if (list.isEmpty()){
           return null;
       }
       else {
           return match_address;
       }
   }

        @GetMapping("/get/rec/{receiver}")
        public List<EKart>  receiver(@PathVariable("receiver") String receiver){
            return  Orderproduct.stream().filter(list->list.getReceiverName().equalsIgnoreCase(receiver)).collect(Collectors.toList());
                if (list.isEmpty()){
           return null;
       }
       else {
           return reciv;
       }

        }

    }










