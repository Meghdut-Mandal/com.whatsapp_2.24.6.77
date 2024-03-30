package X;

/* renamed from: X.3lH  reason: invalid class name and case insensitive filesystem */
public class C74233lH implements AnonymousClass4T6 {
    public int A00 = 0;
    public int A01 = 0;

    public boolean Bin(int i, boolean z) {
        if (z) {
            this.A01++;
        }
        if (this.A01 < 128) {
            return true;
        }
        this.A00 = i;
        return false;
    }

    public int BDX() {
        return this.A00;
    }
}
