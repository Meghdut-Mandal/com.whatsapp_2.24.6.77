package X;

/* renamed from: X.7r7  reason: invalid class name and case insensitive filesystem */
public class C164007r7 implements C160107kT {
    public Object A00;
    public final int A01;

    public C164007r7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BW4(long j) {
        if (this.A01 == 0) {
            ((C101334xN) this.A00).A0I(j);
        }
    }

    public void BW6(boolean z) {
        AnonymousClass777 r2;
        int i;
        switch (this.A01) {
            case 0:
                C101334xN.A04(C133136Wx.A00(13, z), (C101334xN) this.A00);
                return;
            case 1:
                r2 = ((AnonymousClass5C1) this.A00).A02;
                i = 34;
                break;
            default:
                r2 = ((AnonymousClass5Bs) this.A00).A02;
                i = 0;
                break;
        }
        if (!z) {
            i = 13;
        }
        r2.BVO(new C133136Wx(i));
    }

    public void BW7(C133136Wx r2, C129166Fp r3) {
        AnonymousClass777 r0;
        switch (this.A01) {
            case 0:
                return;
            case 1:
                r0 = ((AnonymousClass5C1) this.A00).A02;
                break;
            default:
                r0 = ((AnonymousClass5Bs) this.A00).A02;
                break;
        }
        r0.BVO(r2);
    }
}
