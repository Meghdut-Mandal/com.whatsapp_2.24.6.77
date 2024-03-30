package X;

public class A21 implements C23064B2n, C22788Avz {
    public float A00 = 1.0f;
    public C201589jv A01;
    public boolean A02;
    public A23 A03;
    public A23 A04;
    public final AnonymousClass9VB A05 = new AnonymousClass9VB();
    public final C198549dl A06;

    public void B1T(AnonymousClass9ST r1) {
    }

    public void B5N() {
    }

    public synchronized void release() {
        this.A03 = null;
        this.A04 = null;
    }

    public static A23 A00(A21 a21) {
        if (a21.A02) {
            if (a21.A03 == null) {
                A23 a23 = new A23(a21.A06, new AnonymousClass88T(), new AnonymousClass88R(), true);
                a21.A03 = a23;
                a21.A01.A03(a23);
            }
            return a21.A03;
        }
        if (a21.A04 == null) {
            A23 a232 = new A23(a21.A06, new AnonymousClass88T(), new AnonymousClass88R(), true);
            a21.A04 = a232;
            a21.A01.A03(a232);
        }
        return a21.A04;
    }

    public A21(C198549dl r2) {
        this.A06 = r2;
    }

    public void BKM(C201589jv r1) {
        this.A01 = r1;
    }
}
