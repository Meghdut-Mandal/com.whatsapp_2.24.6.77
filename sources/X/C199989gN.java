package X;

/* renamed from: X.9gN  reason: invalid class name and case insensitive filesystem */
public class C199989gN {
    public static final C1693188p A0F = new C1693188p(5);
    public static final C1693188p A0G = new C1693188p(3);
    public static final C1693188p A0H = new C1693188p(2);
    public static final C1693188p A0I = new C1693188p(4);
    public static final C191349Cp A0J = new C191349Cp(7);
    public static final C191349Cp A0K = new C191349Cp(0);
    public static final C191349Cp A0L = new C191349Cp(6);
    public static final C191349Cp A0M = new C191349Cp(17);
    public static final C191349Cp A0N = new C191349Cp(12);
    public static final C191349Cp A0O = new C191349Cp(13);
    public static final C191349Cp A0P = new C191349Cp(14);
    public static final C191349Cp A0Q = new C191349Cp(15);
    public static final C191349Cp A0R = new C191349Cp(8);
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final boolean A0E;

    public Integer A00(C1693188p r4) {
        int i;
        int i2 = r4.A00;
        if (i2 == 2) {
            i = this.A07;
        } else if (i2 == 3) {
            i = this.A06;
        } else if (i2 == 4) {
            i = this.A08;
        } else if (i2 == 5) {
            i = this.A05;
        } else {
            throw C165567td.A0U("Invalid required video capture result key: ", AnonymousClass000.A0u(), i2);
        }
        return Integer.valueOf(i);
    }

    public Object A01(C191349Cp r4) {
        long j;
        int i = r4.A00;
        if (i == 0) {
            return this.A0D;
        }
        if (i == 1) {
            return null;
        }
        switch (i) {
            case 6:
                return Boolean.valueOf(this.A0E);
            case 7:
                return Integer.valueOf(this.A04);
            case 8:
                return Integer.valueOf(this.A09);
            case 9:
                return this.A0A;
            case 10:
                return this.A0B;
            case 11:
                return this.A0C;
            case 12:
                j = this.A00;
                break;
            case 13:
                j = this.A01;
                break;
            case 14:
                j = this.A02;
                break;
            case 15:
                j = this.A03;
                break;
            case 16:
            case 17:
                return null;
            default:
                throw C165567td.A0U("Invalid required video capture result key: ", AnonymousClass000.A0u(), i);
        }
        return Long.valueOf(j);
    }

    public void A02(C191349Cp r6, Object obj) {
        String str;
        String str2;
        switch (r6.A00) {
            case 12:
                if (this.A00 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Start request time was already set, cannot set it again";
                    break;
                } else {
                    this.A00 = C36431kI.A09(obj);
                    return;
                }
            case 13:
                if (this.A01 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Start time was already set, cannot set it again";
                    break;
                } else {
                    this.A01 = C36431kI.A09(obj);
                    return;
                }
            case 14:
                if (this.A02 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Stop request time was already set, cannot set it again";
                    break;
                } else {
                    this.A02 = C36431kI.A09(obj);
                    return;
                }
            default:
                if (this.A03 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Stop time was already set, cannot set it again";
                    break;
                } else {
                    this.A03 = C36431kI.A09(obj);
                    return;
                }
        }
        C202389lj.A02(str, str2);
    }

    public C199989gN(C195099Sm r3) {
        String str = r3.A0B;
        if (str == null) {
            throw AnonymousClass001.A08("one of file path or FileDescriptor must be set");
        }
        this.A0D = str;
        this.A07 = r3.A03;
        this.A06 = r3.A02;
        this.A08 = r3.A04;
        this.A05 = r3.A01;
        this.A0E = true;
        this.A04 = r3.A00;
        this.A09 = r3.A05;
        this.A0A = r3.A08;
        this.A0B = r3.A09;
        this.A0C = r3.A0A;
        this.A00 = r3.A06;
        this.A01 = r3.A07;
        this.A02 = -1;
        this.A03 = -1;
    }
}
