package X;

/* renamed from: X.88A  reason: invalid class name */
public final class AnonymousClass88A extends C53062qe {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Integer A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass88A) {
                AnonymousClass88A r5 = (AnonymousClass88A) obj;
                if (!(this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A04.intValue();
        if (1 != intValue) {
            str = "H264";
        } else {
            str = "H265";
        }
        return ((((((((((str.hashCode() + intValue) * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31) + 3) * 31) + this.A00;
    }

    public AnonymousClass88A(Integer num, int i, int i2, int i3, int i4) {
        this.A04 = num;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoFormat(codec=");
        if (1 - this.A04.intValue() != 0) {
            str = "H264";
        } else {
            str = "H265";
        }
        A0u.append(str);
        A0u.append(", width=");
        A0u.append(this.A03);
        A0u.append(", height=");
        A0u.append(this.A02);
        A0u.append(", frameRate=");
        A0u.append(this.A01);
        A0u.append(", iFrameInterval=");
        A0u.append(3);
        A0u.append(", bitRate=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
