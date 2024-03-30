package X;

/* renamed from: X.6RV  reason: invalid class name */
public abstract class AnonymousClass6RV {
    public static final Integer[] A00 = C023109s.A00(3);

    public static Integer A00(String str) {
        for (Integer num : A00) {
            if (A01(num).equals(str)) {
                return num;
            }
        }
        AnonymousClass6RL.A00(AnonymousClass5S6.ERROR, "CdsOpenScreenConfig", AnonymousClass000.A0p("Error finding DimmedBackgroundTapToDismiss enum value for: ", str, AnonymousClass000.A0u()));
        return C023109s.A00;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "enabled";
            case 2:
                return "disabled";
            default:
                return "auto";
        }
    }
}
