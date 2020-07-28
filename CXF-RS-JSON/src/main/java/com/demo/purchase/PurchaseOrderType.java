package main.java.com.demo.purchase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrderType", propOrder = {
        "shipTo",
        "billTo"
})
public class PurchaseOrderType {
private ShippingAddress shipTo;
private ShippingAddress billTo;

    public ShippingAddress getShipTo() {
        return shipTo;
    }

    public void setShipTo(ShippingAddress shipTo) {
        this.shipTo = shipTo;
    }

    public ShippingAddress getBillTo() {
        return billTo;
    }

    public void setBillTo(ShippingAddress billTo) {
        this.billTo = billTo;
    }
}
