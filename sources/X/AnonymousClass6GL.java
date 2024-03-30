package X;

/* renamed from: X.6GL  reason: invalid class name */
public abstract class AnonymousClass6GL {
    public static boolean A01(Integer num) {
        if (num == C023109s.A0C || num == C023109s.A0G || num == C023109s.A0S) {
            return true;
        }
        return false;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "RUNNING";
            case 2:
                return "SUCCEEDED";
            case 3:
                return "FAILED";
            case 4:
                return "BLOCKED";
            case 5:
                return "CANCELLED";
            default:
                return "ENQUEUED";
        }
    }
}
