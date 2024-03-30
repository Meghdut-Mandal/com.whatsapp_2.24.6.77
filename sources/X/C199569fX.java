package X;

/* renamed from: X.9fX  reason: invalid class name and case insensitive filesystem */
public final class C199569fX {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass9LA A04;
    public AnonymousClass9OI A05;
    public final C23061B2i A06;
    public final C194089Ob A07 = new C194089Ob();
    public final C202309lW A08 = new C202309lW();
    public final C202309lW A09 = new C202309lW(1);

    public static AnonymousClass9MC A00(C199569fX r3) {
        C194089Ob r1 = r3.A07;
        int i = r1.A05.A02;
        AnonymousClass9MC r12 = r1.A06;
        if ((r12 != null || (r12 = r3.A05.A0A[i]) != null) && r12.A03) {
            return r12;
        }
        return null;
    }

    public void A01() {
        C194089Ob r3 = this.A07;
        r3.A01 = 0;
        r3.A04 = 0;
        r3.A07 = false;
        r3.A08 = false;
        r3.A06 = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public C199569fX(C23061B2i b2i) {
        this.A06 = b2i;
    }
}
