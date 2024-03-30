package X;

/* renamed from: X.72O  reason: invalid class name */
public abstract class AnonymousClass72O implements Cloneable {
    public long A00;
    public transient int A01;
    public transient boolean A02;

    public final synchronized long A02() {
        return this.A00;
    }

    public final void A03() {
        this.A02 = true;
        this.A01++;
    }

    public final synchronized void A04(long j) {
        this.A00 = j;
    }

    public boolean A05() {
        if (this.A02 || this.A00 == -1) {
            return true;
        }
        return false;
    }

    public AnonymousClass72O(long j) {
        this.A00 = j;
    }

    public Object clone() {
        return super.clone();
    }
}
