package X;

/* renamed from: X.3RE  reason: invalid class name */
public abstract class AnonymousClass3RE {
    public static final int A00(C52512pY r0) {
        switch (r0.ordinal()) {
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 8:
                return 6;
            case 9:
                return 5;
            case 10:
                return 7;
            case 11:
                return 8;
            case 13:
                return 9;
            case 14:
                return 11;
            case 15:
            case 16:
            case 17:
            case 18:
                return 10;
            case 19:
            case 20:
            case 21:
                return 12;
            case 22:
            case 23:
                return 13;
            default:
                return 0;
        }
    }

    public static final int A01(C52512pY r3) {
        int ordinal = r3.ordinal();
        if (ordinal == 4) {
            return 3;
        }
        if (ordinal == 8) {
            return 4;
        }
        if (ordinal == 13) {
            return 6;
        }
        switch (ordinal) {
            case 1:
            case 22:
                return 2;
            case 2:
            case 23:
                return 5;
            default:
                return 1;
        }
    }

    public static final Integer A02(C52512pY r0) {
        int i;
        switch (r0.ordinal()) {
            case 15:
                i = 1;
                break;
            case 16:
            case 19:
                i = 2;
                break;
            case 17:
            case 20:
                i = 3;
                break;
            case 18:
            case 21:
                i = 4;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }
}
