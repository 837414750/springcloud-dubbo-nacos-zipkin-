package com.happyeasygo.channel.dto.axisroom;

import java.util.List;

public class AxisRoomBook {
    /**
     * accessKey : key123
     * bookingStatus : confirmed/modified/cancelled
     * bookedTime : 2016­-08­-02 16:39:20
     * cancelledTime : 2016­-08-­02 16:39:20
     * modifiedTime : 2016­-08­-02 16:39:20
     * confirmationNo : 24314283
     * hotelId : 64
     * supplierAmount : 9870.0
     * taxes : 870.0
     * commission : 780.0
     * totalAmount : 10384.0
     * checkInDate : 2016­-08­-10
     * checkOutDate : 2016­-08-­12
     * totalAdults : 2
     * totalChildren : 1
     * bookedBy : test user
     * customerEmail : ram@xxx.com
     * phoneNo : 9986543212
     * paymentStatus : 0
     * roomStays : [{"rateId":"12XXX","rateName":"CP/AP/MAP/EP","roomId":"1","noOfUnits":"1","amount":"25960.0","guestDetails":{"guestName":"Krishna kumar","adults":2,"children":2}},{"rateId":"13XXXX","rateName":"CP/AP/MAP/EP","roomId":"1","noOfUnits":"1","totalAmount":"25960.0","guestDetails":{"guestName":"Satya prakash","totalAdults":2,"totalChildren":1}}]
     */
    private String accessKey;
    private String bookingStatus;
    private String bookedTime;
    private String cancelledTime;
    private String modifiedTime;
    private String confirmationNo;
    private String hotelId;
    private String supplierAmount;
    private String taxes;
    private String commission;
    private String totalAmount;
    private String checkInDate;
    private String checkOutDate;
    private int totalAdults;
    private int totalChildren;
    private String bookedBy;
    private String customerEmail;
    private String phoneNo;
    private int paymentStatus;
    private List<RoomStaysBean> roomStays;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getBookedTime() {
        return bookedTime;
    }

    public void setBookedTime(String bookedTime) {
        this.bookedTime = bookedTime;
    }

    public String getCancelledTime() {
        return cancelledTime;
    }

    public void setCancelledTime(String cancelledTime) {
        this.cancelledTime = cancelledTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getConfirmationNo() {
        return confirmationNo;
    }

    public void setConfirmationNo(String confirmationNo) {
        this.confirmationNo = confirmationNo;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getSupplierAmount() {
        return supplierAmount;
    }

    public void setSupplierAmount(String supplierAmount) {
        this.supplierAmount = supplierAmount;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getTotalAdults() {
        return totalAdults;
    }

    public void setTotalAdults(int totalAdults) {
        this.totalAdults = totalAdults;
    }

    public int getTotalChildren() {
        return totalChildren;
    }

    public void setTotalChildren(int totalChildren) {
        this.totalChildren = totalChildren;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public List<RoomStaysBean> getRoomStays() {
        return roomStays;
    }

    public void setRoomStays(List<RoomStaysBean> roomStays) {
        this.roomStays = roomStays;
    }

    public static class RoomStaysBean {
        /**
         * rateId : 12XXX
         * rateName : CP/AP/MAP/EP
         * roomId : 1
         * noOfUnits : 1
         * amount : 25960.0
         * guestDetails : {"guestName":"Krishna kumar","adults":2,"children":2}
         * totalAmount : 25960.0
         */

        private String rateId;
        private String rateName;
        private String roomId;
        private String noOfUnits;
        private String amount;
        private GuestDetailsBean guestDetails;
        private String totalAmount;

        public String getRateId() {
            return rateId;
        }

        public void setRateId(String rateId) {
            this.rateId = rateId;
        }

        public String getRateName() {
            return rateName;
        }

        public void setRateName(String rateName) {
            this.rateName = rateName;
        }

        public String getRoomId() {
            return roomId;
        }

        public void setRoomId(String roomId) {
            this.roomId = roomId;
        }

        public String getNoOfUnits() {
            return noOfUnits;
        }

        public void setNoOfUnits(String noOfUnits) {
            this.noOfUnits = noOfUnits;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public GuestDetailsBean getGuestDetails() {
            return guestDetails;
        }

        public void setGuestDetails(GuestDetailsBean guestDetails) {
            this.guestDetails = guestDetails;
        }

        public String getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
        }

        public static class GuestDetailsBean {
            /**
             * guestName : Krishna kumar
             * adults : 2
             * children : 2
             */

            private String guestName;
            private int adults;
            private int children;

            public String getGuestName() {
                return guestName;
            }

            public void setGuestName(String guestName) {
                this.guestName = guestName;
            }

            public int getAdults() {
                return adults;
            }

            public void setAdults(int adults) {
                this.adults = adults;
            }

            public int getChildren() {
                return children;
            }

            public void setChildren(int children) {
                this.children = children;
            }
        }
    }
}
