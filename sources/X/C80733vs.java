package X;

/* renamed from: X.3vs  reason: invalid class name and case insensitive filesystem */
public class C80733vs implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public C80733vs(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2) {
        this.A06 = i2;
        this.A01 = obj;
        this.A05 = str;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    public final void run() {
        if (this.A06 != 0) {
            C602637d r4 = (C602637d) this.A01;
            String str = this.A05;
            int i = this.A00;
            Object obj = this.A02;
            C158077fl r2 = (C158077fl) this.A03;
            C158077fl r1 = (C158077fl) this.A04;
            C36331k8.A1H(r2, r1);
            C18800tq r5 = r4.A00.A00.A00;
            C20050ww A0U = C36381kD.A0U(r5);
            C19420v0 A0Y = C36351kA.A0Y(r5);
            AnonymousClass005 A002 = C18840tu.A00(r5.A96);
            AnonymousClass004 r13 = r5.A04;
            AnonymousClass004 r14 = r5.A06;
            new AnonymousClass5PA(A0U, A0Y, C36341k9.A0V(r5), (AnonymousClass1WF) r5.A3W.get(), (C20020wt) r5.A8i.get(), A002, str, r13, r14, i).Blp(new C75023mY(r2, r1, r4, obj));
            return;
        }
        String str2 = this.A05;
        int i2 = this.A00;
        long A003 = AnonymousClass1V2.A00((C20690y0) this.A01, new C65343Rr((C19970wo) this.A02, (AnonymousClass199) this.A03));
        C45492Ro r12 = new C45492Ro();
        C55572uq.A00(r12, str2, 2, i2);
        r12.A05 = Long.valueOf(A003);
        ((C21010yW) this.A04).Bly(r12);
    }
}
