package X;

/* renamed from: X.5ZA  reason: invalid class name */
public abstract class AnonymousClass5ZA {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PREFETCH";
            case 2:
                return "FETCH";
            case 3:
                return "HOISTED_PREFETCH";
            default:
                return "PARALLEL_FETCH";
        }
    }
}
