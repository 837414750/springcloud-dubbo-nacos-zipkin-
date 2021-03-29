package com.happyeasygo.channel.dto.maximojo;

import java.util.List;

public class MaximojoInvenVo {

    /**
     * HotelId : 123
     * OTACode : RezNext
     * Rooms : [{"RoomId":"DLX","RateplanId":"RACK","FromDate":"2018-05-04T06:01:01.5558317Z","ToDate":"2018-05-06T06:01:01.5558317Z","ApplicableDays":"0,1,2,3,4,5,6","Inventory":"1","RestrictionStatus":{"CTA":"True","CTD":"False","CloseOut":"True","MinStay":"1","MaxStay":"3"}},{"RoomId":"STD","RateplanId":"RACK","FromDate":"2018-05-04T06:01:01.5558317Z","ToDate":"2018-05-06T06:01:01.5558317Z","ApplicableDays":"0,1,2,3,4,5,6","Inventory":"1","RestrictionStatus":{"CTA":"True","CTD":"False","CloseOut":"True","MinStay":"1","MaxStay":"3"}}]
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
         * Inventory : 1
         * RestrictionStatus : {"CTA":"True","CTD":"False","CloseOut":"True","MinStay":"1","MaxStay":"3"}
         */

        private String RoomId;
        private String RateplanId;
        private String FromDate;
        private String ToDate;
        private String ApplicableDays;
        private String Inventory;
        private RestrictionStatusBean RestrictionStatus;

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

        public String getInventory() {
            return Inventory;
        }

        public void setInventory(String Inventory) {
            this.Inventory = Inventory;
        }

        public RestrictionStatusBean getRestrictionStatus() {
            return RestrictionStatus;
        }

        public void setRestrictionStatus(RestrictionStatusBean RestrictionStatus) {
            this.RestrictionStatus = RestrictionStatus;
        }

        public static class RestrictionStatusBean {
            /**
             * CTA : True
             * CTD : False
             * CloseOut : True
             * MinStay : 1
             * MaxStay : 3
             */

            private String CTA;
            private String CTD;
            private String CloseOut;
            private String MinStay;
            private String MaxStay;

            public String getCTA() {
                return CTA;
            }

            public void setCTA(String CTA) {
                this.CTA = CTA;
            }

            public String getCTD() {
                return CTD;
            }

            public void setCTD(String CTD) {
                this.CTD = CTD;
            }

            public String getCloseOut() {
                return CloseOut;
            }

            public void setCloseOut(String CloseOut) {
                this.CloseOut = CloseOut;
            }

            public String getMinStay() {
                return MinStay;
            }

            public void setMinStay(String MinStay) {
                this.MinStay = MinStay;
            }

            public String getMaxStay() {
                return MaxStay;
            }

            public void setMaxStay(String MaxStay) {
                this.MaxStay = MaxStay;
            }
        }
    }
}
