package X;

/* renamed from: X.B8w  reason: case insensitive filesystem */
public class C23188B8w implements B2S {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C23188B8w(C22998Azo azo, Integer num, Runnable runnable, int i) {
        this.A03 = i;
        this.A02 = runnable;
        this.A00 = azo;
        this.A01 = num;
    }

    public void BVK() {
        ((C22998Azo) this.A00).onError(AnonymousClass000.A0I(this.A01));
    }

    public void BWk(Exception exc) {
        ((C22998Azo) this.A00).onError(AnonymousClass000.A0I(this.A01));
    }

    public void Bi5(AnonymousClass6OQ r2) {
        ((Runnable) this.A02).run();
    }
}
