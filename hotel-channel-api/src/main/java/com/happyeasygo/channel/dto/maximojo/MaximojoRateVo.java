package com.happyeasygo.channel.dto.maximojo;

import java.util.List;

public class MaximojoRateVo {
    /**
     * HotelId : 123
     * OTACode : RezNext
     * Rooms : [{"RoomId":"DLX","RateplanId":"RACK","FromDate":"2018-05-04T06:01:01.5558317Z","ToDate":"2018-05-06T06:01:01.5558317Z","ApplicableDays":"0,1,2,3,4,5,6","Rates":[{"NumberOfGuest":"1","Amount":2500},{"NumberOfGuest":"2","Amount":3500}],"AdditionalRates":[{"OccupantsAgeCode":10,"Amount":1500}]},{"RoomId":"STD","RateplanId":"RACK","FromDate":"2018-05-04T06:01:01.5558317Z","ToDate":"2018-05-06T06:01:01.5558317Z","ApplicableDays":"0,1,2,3,4,5,6","Rates":[{"NumberOfGuest":"1","Amount":2500},{"NumberOfGuest":"2","Amount":3500}],"AdditionalRates":[{"OccupantsAgeCode":10,"Amount":1500}]}]
     */

    private String HotelId;
    private String OTACode;
    private List<RoomsBean> Rooms;

    public String getHotelId() {
        return HotelId;
    }

    public void setHotelId(String HotelId) {
        this.HotelId = HotelId;
    }

    public String getOTACode() {
        return OTACode;
    }

    public void setOTACode(String OTACode) {
        this.OTACode = OTACode;
    }

    public List<RoomsBean> getRooms() {
        return Rooms;
    }

    public void setRooms(List<RoomsBean> Rooms) {
        this.Rooms = Rooms;
    }

    public static class RoomsBean {
        /**
         * RoomId : DLX
         * RateplanId : RACK
         * FromDate : 2018-05-04T06:01:01.5558317Z
         * ToDate : 2018-05-06T06:01:01.5558317Z
         * ApplicableDays : 0,1,2,3,4,5,6
         * Rates : [{"NumberOfGuest":"1","Amount":2500},{"NumberOfGuest":"2","Amount":3500}]
         * AdditionalRates : [{"OccupantsAgeCode":10,"Amount":1500}]
         */

        private String RoomId;
        private String RateplanId;
        private String FromDate;
        private String ToDate;
        private String ApplicableDays;
        private List<RatesBean> Rates;
        private List<AdditionalRatesBean> AdditionalRates;

        public String getRoomId() {
            return RoomId;
        }

        public void setRoomId(String RoomId) {
            this.RoomId = RoomId;
        }

        public String getRateplanId() {
            return RateplanId;
        }

        public void setRateplanId(String RateplanId) {
            this.RateplanId = RateplanId;
        }

        public String getFromDate() {
            return FromDate;
        }

        public void setFromDate(String FromDate) {
            this.FromDate = FromDate;
        }

        public String getToDate() {
            return ToDate;
        }

        public void setToDate(String ToDate) {
            this.ToDate = ToDate;
        }

        public String getApplicableDays() {
            return ApplicableDays;
        }

        public void setApplicableDays(String ApplicableDays) {
            this.ApplicableDays = ApplicableDays;
        }

        public List<RatesBean> getRates() {
            return Rates;
        }

        public void setRates(List<RatesBean> Rates) {
            this.Rates = Rates;
        }

        public List<AdditionalRatesBean> getAdditionalRates() {
            return AdditionalRates;
        }

        public void setAdditionalRates(List<AdditionalRatesBean> AdditionalRates) {
            this.AdditionalRates = AdditionalRates;
        }

        public static class RatesBean {
            /**
             * NumberOfGuest : 1
             * Amount : 2500
             */

            private String NumberOfGuest;
            private double Amount;

            public String getNumberOfGuest() {
                return NumberOfGuest;
            }

            public void setNumberOfGuest(String NumberOfGuest) {
                this.NumberOfGuest = NumberOfGuest;
            }

            public double getAmount() {
                return Amount;
            }

            public void setAmount(double Amount) {
                this.Amount = Amount;
            }
        }

        public static class AdditionalRatesBean {
            /**
             * OccupantsAgeCode : 10
             * Amount : 1500
             */

            private int OccupantsAgeCode;
            private double Amount;

            public int getOccupantsAgeCode() {
                return OccupantsAgeCode;
            }

            public void setOccupantsAgeCode(int OccupantsAgeCode) {
                this.OccupantsAgeCode = OccupantsAgeCode;
            }

            public double getAmount() {
                return Amount;
            }

            public void setAmount(double Amount) {
                this.Amount = Amount;
            }
        }
    }
}
