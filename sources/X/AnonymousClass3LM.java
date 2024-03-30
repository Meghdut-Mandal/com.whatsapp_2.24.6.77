package X;

/* renamed from: X.3LM  reason: invalid class name */
public abstract class AnonymousClass3LM {
    public static Integer A00(int i) {
        if (i == 0) {
            return C023109s.A00;
        }
        if (i == 1) {
            return C023109s.A01;
        }
        if (i == 2) {
            return C023109s.A0C;
        }
        if (i == 3) {
            return C023109s.A0G;
        }
        throw AnonymousClass000.A0d("Unknown enum value: ", AnonymousClass000.A0u(), i);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "LEFT";
            case 1:
                return "TOP";
            case 2:
                return "RIGHT";
            default:
                return "BOTTOM";
        }
    }
}
