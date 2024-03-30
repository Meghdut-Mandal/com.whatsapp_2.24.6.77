package X;

/* renamed from: X.1go  reason: invalid class name and case insensitive filesystem */
public final class C34311go {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34311go) {
                C34311go r5 = (C34311go) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WDSButtonState(normal=");
        sb.append(this.A01);
        sb.append(", pressed=");
        sb.append(this.A02);
        sb.append(", disabled=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C34311go(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }
}
