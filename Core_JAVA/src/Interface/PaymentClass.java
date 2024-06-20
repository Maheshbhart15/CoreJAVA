package Interface;

public class PaymentClass implements Payment {

    @Override
    public void modeofpayment(String mode) {
        System.out.println("Mode of Payment "+ mode);

    }

    @Override
    public void Recipet(float amount) {
        System.out.println("total bill "+amount);

    }

    public static void main(String[] args) {
   PaymentClass paymentClass=new PaymentClass();
   paymentClass.modeofpayment("online");
   paymentClass.Recipet(50000f);

}
}
