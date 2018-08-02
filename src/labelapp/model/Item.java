package labelapp.model;

public class Item {
    private String name, serialNumber, barcode;

    public Item(String name, String serialNumber, String barcode) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
