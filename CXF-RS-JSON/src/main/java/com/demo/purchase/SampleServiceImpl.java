package main.java.com.demo.purchase;

public class SampleServiceImpl implements SampleService{
    public PurchaseOrderType getPurchaseOrder() {
        PurchaseOrderType po = new PurchaseOrderType();

        ShippingAddress address1 = new ShippingAddress();
        address1.setCity("New York");
        address1.setCountry("USA");
        address1.setName("SpongeBob");

        po.setBillTo(address1);
        po.setShipTo(address1);

        return po;
    }
}