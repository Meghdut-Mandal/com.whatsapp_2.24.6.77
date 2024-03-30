package X;

/* renamed from: X.9hK  reason: invalid class name and case insensitive filesystem */
public abstract class C200389hK {
    public static char A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 'i';
            case 2:
                return 'x';
            case 3:
                return 'm';
            case 4:
                return 's';
            case 5:
                return 'u';
            case 6:
                return 'U';
            default:
                return 'd';
        }
    }

    public static int A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 32;
            case 5:
                return 64;
            case 6:
                return 256;
            default:
                return 1;
        }
    }
}
