package X;

/* renamed from: X.9c0  reason: invalid class name and case insensitive filesystem */
public final class C197619c0 {
    public final C19970wo A00;
    public final C21700zf A01;

    public C197619c0(C19970wo r3, C21700zf r4) {
        this.A00 = r3;
        this.A01 = r4;
        C21710zg r1 = r4.A04;
        r1.A04 = r1.A04;
    }

    public static final String A00(String str) {
        switch (str.hashCode()) {
            case -1656096205:
                if (str.equals("consent_flow")) {
                    return "consent_flow";
                }
                break;
            case -1547048218:
                if (str.equals("pin_create")) {
                    return "pin_create";
                }
                break;
            case -1236338706:
                if (str.equals("add_card")) {
                    return "add_card";
                }
                break;
            case -791291370:
                if (str.equals("pin_confirm")) {
                    return "pin_confirm";
                }
                break;
            case -593273019:
                if (str.equals("user_detail")) {
                    return "user_detail";
                }
                break;
            case 115032:
                if (str.equals("tos")) {
                    return "tos";
                }
                break;
            case 128430571:
                if (str.equals("add_card_loading")) {
                    return "add_card_loading";
                }
                break;
            case 377959296:
                if (!str.equals("user_address")) {
                    return "no_surface";
                }
                return "user_address";
        }
        return "no_surface";
    }
}
