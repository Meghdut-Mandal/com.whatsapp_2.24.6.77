package X;

/* renamed from: X.2qA  reason: invalid class name and case insensitive filesystem */
public enum C52782qA implements C22899AyB {
    UNKNOWN(0),
    CHROME(1),
    FIREFOX(2),
    IE(3),
    OPERA(4),
    SAFARI(5),
    EDGE(6),
    DESKTOP(7),
    IPAD(8),
    ANDROID_TABLET(9),
    OHANA(10),
    ALOHA(11),
    CATALINA(12),
    TCL_TV(13),
    IOS_PHONE(14),
    IOS_CATALYST(15),
    ANDROID_PHONE(16),
    ANDROID_AMBIGUOUS(17),
    WEAR_OS(18),
    AR_WRIST(19),
    AR_DEVICE(20),
    UWP(21),
    VR(22);
    
    public final int value;

    /* access modifiers changed from: public */
    C52782qA(int i) {
        this.value = i;
    }

    public static C52782qA A00(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CHROME;
            case 2:
                return FIREFOX;
            case 3:
                return IE;
            case 4:
                return OPERA;
            case 5:
                return SAFARI;
            case 6:
                return EDGE;
            case 7:
                return DESKTOP;
            case 8:
                return IPAD;
            case 9:
                return ANDROID_TABLET;
            case 10:
                return OHANA;
            case 11:
                return ALOHA;
            case 12:
                return CATALINA;
            case 13:
                return TCL_TV;
            case 14:
                return IOS_PHONE;
            case 15:
                return IOS_CATALYST;
            case 16:
                return ANDROID_PHONE;
            case 17:
                return ANDROID_AMBIGUOUS;
            case 18:
                return WEAR_OS;
            case 19:
                return AR_WRIST;
            case 20:
                return AR_DEVICE;
            case 21:
                return UWP;
            case 22:
                return VR;
            default:
                return null;
        }
    }

    public final int BEY() {
        return this.value;
    }
}
