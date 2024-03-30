package X;

import java.util.Objects;

/* renamed from: X.676  reason: invalid class name */
public class AnonymousClass676 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof AnonymousClass676)) {
                return false;
            }
            AnonymousClass676 r7 = (AnonymousClass676) obj;
            if (!(this.A01 == r7.A01 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A02 == r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1J(objArr, this.A01);
        C36421kH.A1P(objArr, this.A03);
        C36331k8.A1V(objArr, this.A00);
        objArr[3] = Long.valueOf(this.A02);
        return Objects.hash(objArr);
    }

    public AnonymousClass676(int i, int i2, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = j2;
    }
}
