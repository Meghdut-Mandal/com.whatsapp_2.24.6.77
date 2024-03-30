package X;

/* renamed from: X.5aN  reason: invalid class name and case insensitive filesystem */
public abstract class C110255aN {
    public static final String A00(int i) {
        if (i == 0) {
            return "kCallLinkStateNone";
        }
        if (i == 1) {
            return "kCallLinkStateQuerySent";
        }
        if (i == 2) {
            return "kCallLinkStateJoinAcked";
        }
        if (i == 3) {
            return "kCallLinkStateJoinSent";
        }
        if (i == 4) {
            return "kCallLinkStateQueryAcked";
        }
        C18740tg.A0D(false, "UNKNOWN CallLinkState");
        return "UNKNOWN CallLinkState";
    }
}
