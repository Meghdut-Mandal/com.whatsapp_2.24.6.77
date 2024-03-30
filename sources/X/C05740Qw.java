package X;

/* renamed from: X.0Qw  reason: invalid class name and case insensitive filesystem */
public abstract class C05740Qw {
    public static String A00(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "DROP_OLDEST";
            case 2:
                return "DROP_LATEST";
            default:
                return "SUSPEND";
        }
    }
}
