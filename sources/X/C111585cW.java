package X;

/* renamed from: X.5cW  reason: invalid class name and case insensitive filesystem */
public abstract class C111585cW {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NEW";
            case 1:
                return "CONNECTING";
            case 2:
                return "CONNECTED";
            default:
                return "CLOSED";
        }
    }
}
