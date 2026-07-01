public class Coupon {

    private String couponCode;
    private String consumerId;
    private int discount;
    private boolean used;

    public Coupon() {

    }

    public Coupon(String couponCode,
                  String consumerId,
                  int discount) {

        this.couponCode = couponCode;
        this.consumerId = consumerId;
        this.discount = discount;
        this.used = false;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public int getDiscount() {
        return discount;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public void displayCoupon() {

        System.out.println("Coupon Code : " + couponCode);
        System.out.println("Discount    : " + discount);
        System.out.println("Used        : " + used);

    }

}