package X;

/* renamed from: X.Asg  reason: case insensitive filesystem */
public class C22676Asg extends C22657AsN {
    public C22676Asg() {
    }

    public C22676Asg(C219411z r1) {
        super(r1);
    }

    public C22676Asg(C202169lB r2) {
        super(r2, false);
    }

    public C22676Asg(C219411z[] r2) {
        super(r2, false);
    }

    public int A0A() {
        int i = 0;
        for (C219411z Bve : this.A00) {
            i += Bve.Bve().A0A();
        }
        return i + 2 + 2;
    }

    public void A0D(C200179gm r3, boolean z) {
        r3.A05(this.A00, 49, z);
    }
}
