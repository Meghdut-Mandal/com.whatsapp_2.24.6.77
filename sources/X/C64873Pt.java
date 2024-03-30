package X;

/* renamed from: X.3Pt  reason: invalid class name and case insensitive filesystem */
public class C64873Pt {
    public final C20810yC A00;
    public final C21010yW A01;

    public static void A00(C64873Pt r2, int i, int i2) {
        AnonymousClass2PX r1 = new AnonymousClass2PX();
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = Integer.valueOf(i);
        r1.A02 = Integer.valueOf(C36411kG.A1W(r2.A00) ? 1 : 0);
        r2.A01.Bly(r1);
    }

    public void A01(int i) {
        C44652Oi r1 = new C44652Oi();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(C36411kG.A1W(this.A00) ? 1 : 0);
        this.A01.Bly(r1);
    }

    public void A02(int i) {
        C44442Nn r1 = new C44442Nn();
        r1.A00 = Integer.valueOf(i);
        this.A01.Bly(r1);
    }

    public void A03(int i) {
        C44452No r1 = new C44452No();
        r1.A00 = Integer.valueOf(i);
        this.A01.Bly(r1);
    }

    public C64873Pt(C20810yC r1, C21010yW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
