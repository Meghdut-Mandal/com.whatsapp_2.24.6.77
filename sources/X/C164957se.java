package X;

/* renamed from: X.7se  reason: invalid class name and case insensitive filesystem */
public class C164957se implements C25711Hj {
    public int A00 = -1;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C164957se(AnonymousClass1Y4 r2, C146506vi r3, AnonymousClass3SC r4, int i) {
        this.A05 = i;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        AnonymousClass1Y4 r4;
        AnonymousClass3SC r3;
        int i = this.A05;
        Number number = (Number) obj;
        int intValue = number.intValue();
        int i2 = this.A00;
        if (i != 0) {
            if (intValue != i2) {
                this.A00 = intValue;
                if (intValue >= this.A01 + 5) {
                    this.A01 = intValue;
                    ((AnonymousClass3SC) this.A04).A02.size();
                }
                r4 = (AnonymousClass1Y4) this.A02;
                AnonymousClass1Y6 r1 = r4.A0D;
                r3 = (AnonymousClass3SC) this.A04;
                C164887sX.A00(r1, r3, number, 1);
            } else {
                return;
            }
        } else if (intValue != i2) {
            this.A00 = intValue;
            if (intValue >= this.A01 + 5) {
                this.A01 = intValue;
                ((AnonymousClass3SC) this.A04).A02.size();
            }
            r4 = (AnonymousClass1Y4) this.A02;
            AnonymousClass1Y6 r2 = r4.A0D;
            r3 = (AnonymousClass3SC) this.A04;
            if (!AnonymousClass1Y6.A00(new C164887sX(r2, 11), r3, number)) {
                return;
            }
        } else {
            return;
        }
        AnonymousClass16J r22 = r4.A06;
        AnonymousClass00C.A0D(r22, 0);
        r22.A07(r3.A02, 8);
    }
}
