package X;

/* renamed from: X.9aM  reason: invalid class name and case insensitive filesystem */
public abstract class C196679aM {
    public static final Integer[] A00;

    static {
        Integer num = C023109s.A00;
        Integer num2 = C023109s.A01;
        Integer num3 = C023109s.A0C;
        A00 = new Integer[]{num2, num, C023109s.A0G, num3};
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "M";
            case 2:
                return "Q";
            case 3:
                return "H";
            default:
                return "L";
        }
    }
}
