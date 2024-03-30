package X;

/* renamed from: X.9j1  reason: invalid class name and case insensitive filesystem */
public class C201179j1 {
    public static final C201179j1 A04 = new C201179j1(2);
    public static final C201179j1 A05 = new C201179j1(-1);
    public static final C201179j1 A06 = new C201179j1(0);
    public B0E A00;
    public B0E A01;
    public B0F A02;
    public boolean A03;

    public void A00(Appendable appendable, String str) {
        if (!this.A01.BQ0(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        C201179j1 r0 = C197039b2.A00;
        if (str != null) {
            this.A02.B6q(appendable, str);
        }
        appendable.append('\"');
    }

    public C201179j1(int i) {
        B0E b0e;
        B0F b0f;
        boolean z = false;
        boolean A1Q = AnonymousClass000.A1Q(i & 1);
        boolean A1Q2 = AnonymousClass000.A1Q(i & 4);
        boolean A1Q3 = AnonymousClass000.A1Q(i & 2);
        this.A03 = (i & 16) > 0 ? true : z;
        if ((i & 8) > 0) {
            b0e = C201919ki.A02;
        } else {
            b0e = C201919ki.A03;
        }
        if (A1Q2) {
            this.A01 = C201919ki.A04;
        } else {
            this.A01 = b0e;
        }
        if (A1Q) {
            this.A00 = C201919ki.A04;
        } else {
            this.A00 = b0e;
        }
        if (A1Q3) {
            b0f = C201919ki.A00;
        } else {
            b0f = C201919ki.A01;
        }
        this.A02 = b0f;
    }

    public C201179j1() {
        this(0);
    }
}
