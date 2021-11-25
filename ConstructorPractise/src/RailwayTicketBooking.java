public class RailwayTicketBooking {

    private String pnr;
    private String trainNo;
    private String fromStation;
    private String toStation;
    private String passengerName;
    private String passangerAge;
    private String berthSelection;
    private String modeOfPayment;

    public String bookingProcess(){
        this.pnr = trainNo+"13579";
        return ("booking in process pnr will be enerated soon/n"+ pnr);
    }


    RailwayTicketBooking(String trainNo, String fromStation, String toStation, String passengerName){
        this.trainNo=trainNo;
        this.fromStation=fromStation;
        this.toStation=toStation;
        this.passengerName=passengerName;
    }



    public String getPnr() {
        return pnr;
    }

//    public void setPnr() {
//        this.pnr = trainNo+"13579";
//    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassangerAge() {
        return passangerAge;
    }

    public void setPassangerAge(String passangerAge) {
        this.passangerAge = passangerAge;
    }

    public String getBerthSelection() {
        return berthSelection;
    }

    public void setBerthSelection(String berthSelection) {
        this.berthSelection = berthSelection;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }


    @Override
    public String toString() {
        return "RailwayTicketBooking{" +
                "pnr='" + pnr + '\'' +
                ", trainNo='" + trainNo + '\'' +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", passangerAge='" + passangerAge + '\'' +
                ", berthSelection='" + berthSelection + '\'' +
                ", modeOfPayment='" + modeOfPayment + '\'' +
                '}';
    }
}
