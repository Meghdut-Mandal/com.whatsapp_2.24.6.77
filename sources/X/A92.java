package X;

public class A92 implements C159227j1 {
    public final /* synthetic */ C202279lS A00;
    public final /* synthetic */ C193139Jz A01;
    public final /* synthetic */ String A02;

    public A92(C202279lS r1, C193139Jz r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BXn(String str, int i) {
        if (this.A02.equals(str)) {
            C193139Jz r3 = this.A01;
            C206669tm r1 = r3.A02.A01;
            if (r1.A00) {
                r1.A00 = true;
                r3.A00.A06.A0n(r3.A01, -1);
            }
            this.A00.A0N.remove(this);
        }
    }

    public void BXo(AnonymousClass9NZ r5, String str) {
        if (this.A02.equals(str)) {
            C193139Jz r3 = this.A01;
            C206669tm r1 = r3.A02.A01;
            if (r1.A00) {
                r1.A00 = false;
                r3.A00.A06.A0n(r3.A01, -1);
            }
            this.A00.A0N.remove(this);
        }
    }
}
