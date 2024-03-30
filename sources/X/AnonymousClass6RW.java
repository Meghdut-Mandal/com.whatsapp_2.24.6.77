package X;

/* renamed from: X.6RW  reason: invalid class name */
public abstract class AnonymousClass6RW {
    public static final Integer[] A00 = C023109s.A00(6);

    public static Integer A00(String str) {
        for (Integer num : A00) {
            if (A01(num).equals(str)) {
                return num;
            }
        }
        AnonymousClass6RL.A00(AnonymousClass5S6.ERROR, "CdsOpenScreenConfig", AnonymousClass000.A0p("Error finding Mode enum value for ", str, AnonymousClass000.A0u()));
        return C023109s.A00;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "half_sheet";
            case 2:
                return "auto_sheet";
            case 3:
                return "full_screen";
            case 4:
                return "flexible_sheet";
            case 5:
                return "half_sheet_with_underlay";
            default:
                return "full_sheet";
        }
    }
}
