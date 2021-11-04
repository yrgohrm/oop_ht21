public enum Days {
    MON, TUE, WED, THU, FRI, SAT, SUN;

    @Override
    public String toString() {
        switch (this) {
            case MON:
                return "måndag";
            case TUE:
                return "tisdag";
            case WED:
                return "onsdag";
            case THU:
                return "torsdag";
            case FRI:
                return "fredag";
            case SAT:
                return "lördag";
            case SUN:
                return "söndag";
            default:
                throw new IllegalStateException("..." + this.ordinal());
        }       
    }
}
