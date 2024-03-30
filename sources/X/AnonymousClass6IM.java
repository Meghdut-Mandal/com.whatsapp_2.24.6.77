package X;

/* renamed from: X.6IM  reason: invalid class name */
public abstract class AnonymousClass6IM {
    public static final Integer[] A00 = C023109s.A00(3);

    public static Integer A00(String str) {
        String str2;
        for (Integer num : A00) {
            switch (num.intValue()) {
                case 1:
                    str2 = "enabled";
                    break;
                case 2:
                    str2 = "disabled";
                    break;
                default:
                    str2 = "auto";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        AnonymousClass6RL.A00(AnonymousClass5S6.ERROR, "CdsOpenScreenConfig", AnonymousClass000.A0p("Error finding DragToDismiss enum value for: ", str, AnonymousClass000.A0u()));
        return C023109s.A00;
    }
}
