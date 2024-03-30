package X;

/* renamed from: X.5Y1  reason: invalid class name */
public abstract class AnonymousClass5Y1 {
    public static final AnonymousClass5SZ A00(AnonymousClass5SZ r1, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        return AnonymousClass5SZ.STRETCH;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        return AnonymousClass5SZ.CENTER;
                    }
                    break;
                case 100571:
                    if (str.equals("end")) {
                        return AnonymousClass5SZ.FLEX_END;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        return AnonymousClass5SZ.FLEX_START;
                    }
                    break;
            }
        }
        return r1;
    }
}
