package X;

/* renamed from: X.4iT  reason: invalid class name and case insensitive filesystem */
public final class C94594iT extends C109085Wf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94594iT) {
                C94594iT r5 = (C94594iT) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C90474aD.A02(C90514aH.A05(this.A01), this.A00) + this.A02) * 31) + this.A03) * 31;
    }

    public C94594iT(float f, float f2, int i, int i2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = i2;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Stroke(width=");
        A0u.append(this.A01);
        A0u.append(", miter=");
        A0u.append(this.A00);
        A0u.append(", cap=");
        int i = this.A02;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else if (i == 2) {
            str = "Square";
        } else {
            str = "Unknown";
        }
        A0u.append(str);
        A0u.append(", join=");
        int i2 = this.A03;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else {
            str2 = "Bevel";
        }
        A0u.append(str2);
        A0u.append(", pathEffect=");
        return AnonymousClass000.A0m((Object) null, A0u);
    }
}
