package X;

/* renamed from: X.3lI  reason: invalid class name and case insensitive filesystem */
public class C74243lI implements AnonymousClass4T6 {
    public static final int A05 = Math.max(64, Math.min((int) ((C19430v1.A00 / 16) / 16384), 512));
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;

    public boolean Bin(int i, boolean z) {
        int i2 = this.A04;
        if (i2 != 0) {
            int i3 = this.A01 + 1;
            this.A01 = i3;
            int i4 = this.A02 + (z ? 1 : 0);
            this.A02 = i4;
            if (i3 > i2 || i4 > this.A03) {
                this.A00 = i;
                return false;
            }
        }
        return true;
    }

    public C74243lI(int i, int i2) {
        this.A04 = i != 1 ? i * 3072 : i2;
        this.A03 = A05 * i;
    }

    public int BDX() {
        return this.A00;
    }
}
