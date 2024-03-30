package X;

/* renamed from: X.9WT  reason: invalid class name */
public final class AnonymousClass9WT {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9WT r7 = (AnonymousClass9WT) obj;
            if (!(this.A02 == r7.A02 && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A03 == r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass9WT A00(int i) {
        int i2 = i;
        if (this.A02 == i) {
            return this;
        }
        return new AnonymousClass9WT(i2, this.A00, this.A03, this.A01);
    }

    public int hashCode() {
        return ((((C165617ti.A01(this.A02) + this.A00) * 31) + this.A01) * 31) + ((int) this.A03);
    }

    public AnonymousClass9WT(int i, int i2, long j, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
    }
}
