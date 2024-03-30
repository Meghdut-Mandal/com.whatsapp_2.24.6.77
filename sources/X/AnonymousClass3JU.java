package X;

/* renamed from: X.3JU  reason: invalid class name */
public final class AnonymousClass3JU {
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3JU)) {
            return false;
        }
        AnonymousClass3JU r7 = (AnonymousClass3JU) obj;
        if (r7.A01 == this.A01 && r7.A00 == this.A00 && r7.A03 == this.A03 && r7.A02 == this.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C36321k7.A00(this.A03, ((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A02;
    }

    public AnonymousClass3JU(float f, float f2, int i, long j) {
        this.A01 = f;
        this.A00 = f2;
        this.A03 = j;
        this.A02 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RotaryScrollEvent(verticalScrollPixels=");
        A0u.append(this.A01);
        A0u.append(",horizontalScrollPixels=");
        A0u.append(this.A00);
        A0u.append(",uptimeMillis=");
        A0u.append(this.A03);
        A0u.append(",deviceId=");
        return C36321k7.A0G(A0u, this.A02);
    }
}
