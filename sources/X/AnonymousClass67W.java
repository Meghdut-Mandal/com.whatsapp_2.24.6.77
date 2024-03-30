package X;

/* renamed from: X.67W  reason: invalid class name */
public class AnonymousClass67W {
    public final /* synthetic */ C134906bn A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ C131556Pn A02;
    public final /* synthetic */ C122855vX A03;
    public final /* synthetic */ C160217ke A04;

    public AnonymousClass67W(C131556Pn r1, C122855vX r2, C134906bn r3, C160217ke r4, boolean z) {
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = z;
        this.A00 = r3;
        this.A04 = r4;
    }

    public void A00(Exception exc) {
        C122855vX r3 = this.A03;
        r3.A02 = exc;
        r3.A00 = 4;
        this.A02.A02(r3, this.A04, exc.getLocalizedMessage());
    }

    public void A01(String str) {
        this.A02.A01(this.A03, this.A00, this.A04, str, this.A01);
    }
}
