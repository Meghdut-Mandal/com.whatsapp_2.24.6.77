package X;

/* renamed from: X.88B  reason: invalid class name */
public final class AnonymousClass88B extends C53062qe {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final C15020mZ A04;

    public AnonymousClass88B(Integer num, C15020mZ r3, int i, int i2, int i3) {
        AnonymousClass00C.A0D(num, 1);
        this.A03 = num;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass88B) {
                AnonymousClass88B r5 = (AnonymousClass88B) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00 && AnonymousClass00C.A0J(this.A04, r5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A03;
        return C36401kF.A02(this.A04, (((((((AnonymousClass95F.A00(num).hashCode() + num.intValue()) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BitrateLadderRung(quality=");
        A0u.append(AnonymousClass95F.A00(this.A03));
        A0u.append(", width=");
        A0u.append(this.A02);
        A0u.append(", height=");
        A0u.append(this.A01);
        A0u.append(", frameRate=");
        A0u.append(this.A00);
        A0u.append(", bitRateRange=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
