package X;

import java.util.Arrays;

/* renamed from: X.6P8  reason: invalid class name */
public final class AnonymousClass6P8 {
    public static final AnonymousClass6P8 A02 = new AnonymousClass6P8(53264);
    public static final AnonymousClass6P8 A03 = new AnonymousClass6P8(53252);
    public static final AnonymousClass6P8 A04 = new AnonymousClass6P8(53250);
    public static final AnonymousClass6P8 A05 = new AnonymousClass6P8(49156);
    public static final AnonymousClass6P8 A06 = new AnonymousClass6P8(0);
    public static final AnonymousClass6P8 A07 = new AnonymousClass6P8(49155);
    public static final AnonymousClass6P8 A08 = new AnonymousClass6P8(53251);
    public static final AnonymousClass6P8 A09 = new AnonymousClass6P8(49154);
    public static final AnonymousClass6P8 A0A = new AnonymousClass6P8(49153);
    public static final AnonymousClass6P8 A0B = new AnonymousClass6P8(53249);
    public final int A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.facebook.wearable.datax.Error");
                if (this.A00 != ((AnonymousClass6P8) obj).A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00 + 7;
    }

    public AnonymousClass6P8(int i) {
        Integer num;
        int i2;
        this.A00 = i;
        Integer[] A002 = C023109s.A00(15);
        int length = A002.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                num = A002[i3];
                int i4 = this.A00;
                switch (num.intValue()) {
                    case 1:
                        i2 = 49153;
                        break;
                    case 2:
                        i2 = 49154;
                        break;
                    case 3:
                        i2 = 49155;
                        break;
                    case 4:
                        i2 = 49156;
                        break;
                    case 5:
                        i2 = 49157;
                        break;
                    case 6:
                        i2 = 49158;
                        break;
                    case 7:
                        i2 = 53249;
                        break;
                    case 8:
                        i2 = 53250;
                        break;
                    case 9:
                        i2 = 53251;
                        break;
                    case 10:
                        i2 = 53252;
                        break;
                    case 11:
                        i2 = 53264;
                        break;
                    case 12:
                        i2 = 53280;
                        break;
                    case 13:
                        i2 = 57345;
                        break;
                    case 14:
                        i2 = 65536;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                if (i4 != i2) {
                    i3++;
                }
            } else {
                num = C023109s.A06;
            }
        }
        this.A01 = num;
        int i5 = this.A00;
        if (i5 < 0 || i5 > 65535) {
            throw AnonymousClass000.A0g(" must be unsigned 16bit", C90504aG.A0q(i5));
        }
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(0x");
        Object[] objArr = new Object[1];
        AnonymousClass000.A1J(objArr, this.A00);
        C90494aF.A1M(A0u, C90504aG.A0m("%04x", Arrays.copyOf(objArr, 1)));
        int intValue = this.A01.intValue();
        if (intValue == 14) {
            str = "This code doesn't match to a known error type, please reach out to the connectivityteam or the owners of the service you are trying to communicate with on the deviceteam to figure out what this code means.";
        } else if (intValue != 5) {
            switch (intValue) {
                case 1:
                    str = "SERVICE_NOT_FOUND";
                    break;
                case 2:
                    str = "SERVICE_LOST";
                    break;
                case 3:
                    str = "OUT_OF_CHANNELS";
                    break;
                case 4:
                    str = "INTERNAL_ERROR";
                    break;
                case 5:
                    str = "MESSAGE_OVERFLOW";
                    break;
                case 6:
                    str = "CHANNEL_CLOSED";
                    break;
                case 7:
                    str = "UNKNOWN_TYPE";
                    break;
                case 8:
                    str = "DEPRECATED_TYPE";
                    break;
                case 9:
                    str = "REMOVED_TYPE";
                    break;
                case 10:
                    str = "BAD_TYPE";
                    break;
                case 11:
                    str = "BAD_REQUEST";
                    break;
                case 12:
                    str = "SERIALIZE_FAILED";
                    break;
                case 13:
                    str = "WRITE_WOULD_BLOCK";
                    break;
                case 14:
                    str = "UNKNOWN_ERROR_CODE";
                    break;
                default:
                    str = "OK";
                    break;
            }
        } else {
            str = "Message is too long. DataX cannot send messages longer than 16383 bytes. Try fragmenting your data into more messages, for example if you're sending a list of contacts then send each contact in a separate message instead of all in one big list.";
        }
        return C36321k7.A0E(str, A0u);
    }
}
