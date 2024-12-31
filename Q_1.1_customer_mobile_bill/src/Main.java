
class Customer{
    int customer_id;
    float local_call;
    float ISD_call;
    float data;
    double total_bill;

    Customer(){
        customer_id=1;
        local_call=130;
        ISD_call=60;
        data=2.4f;
    }
    Customer(int customer_id, float local_call, float ISD_call , float data){
        this.customer_id=customer_id;
        this.local_call=local_call;
        this.ISD_call=ISD_call;
        this.data=data;
    }

    void total(){
        total_bill=(local_call*0.1)+(ISD_call*1)+(data*500);
        System.out.println("Your Total bill is : " + total_bill + "Rs");
    }
}

public class Main{
    public static void main(String[] args) {
       Customer c1=new Customer();
       Customer c2=new Customer(2,60, 200, 5.5f);
       c1.total();
       c2.total();
    }
}