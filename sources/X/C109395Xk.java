package X;

/* renamed from: X.5Xk  reason: invalid class name and case insensitive filesystem */
public abstract class C109395Xk {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONNECTED";
            case 2:
                return "UNMETERED";
            case 3:
                return "NOT_ROAMING";
            case 4:
                return "METERED";
            case 5:
                return "TEMPORARILY_UNMETERED";
            default:
                return "NOT_REQUIRED";
        }
    }
}
