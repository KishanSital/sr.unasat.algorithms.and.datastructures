package linear.binary.search.mobile;

import java.util.Objects;

public class MobilePhone implements Comparable<MobilePhone> {
    private String brand;
    private String modelNumber;

    public MobilePhone(String brand, String modelNumber) {
        this.brand = brand;
        this.modelNumber = modelNumber;
    }

    public MobilePhone() {
    }

    @Override
    public boolean equals(Object mobilePhone) {
        if (this == mobilePhone) return true;
        if (mobilePhone == null || getClass() != mobilePhone.getClass()) return false;
        MobilePhone that = (MobilePhone) mobilePhone;
        return Objects.equals(brand, that.brand) &&
                Objects.equals(modelNumber, that.modelNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, modelNumber);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }

    @Override
    public int compareTo(MobilePhone mobilePhone) {
        return this.getModelNumber().compareTo(mobilePhone.getModelNumber());
    }
}
