package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8VY  reason: invalid class name */
public final class AnonymousClass8VY extends C207269up {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(14);
    public final C207269up A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8VY) {
                AnonymousClass8VY r5 = (AnonymousClass8VY) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8VY(X.C207269up r35, boolean r36) {
        /*
            r34 = this;
            r12 = r35
            java.lang.String r11 = r12.A0F
            java.lang.String r10 = r12.A05
            java.lang.String r0 = r12.A0C
            r18 = r0
            java.math.BigDecimal r0 = r12.A06
            r17 = r0
            X.6Tk r14 = r12.A04
            java.lang.String r13 = r12.A0E
            java.lang.String r9 = r12.A0G
            java.util.List r8 = r12.A07
            X.9tw r7 = r12.A01
            X.6bV r6 = r12.A02
            java.lang.String r5 = r12.A0D
            int r4 = r12.A00
            boolean r3 = r12.A08
            long r1 = r12.A09
            X.6bW r0 = r12.A0B
            r15 = 1
            X.C36321k7.A0v(r11, r15, r10)
            r15 = 8
            X.AnonymousClass00C.A0D(r8, r15)
            r16 = 0
            r15 = r34
            r32 = 1
            r33 = r3
            r28 = r8
            r29 = r4
            r30 = r1
            r24 = r13
            r25 = r9
            r26 = r5
            r27 = r17
            r20 = r14
            r21 = r11
            r22 = r10
            r23 = r18
            r17 = r7
            r18 = r6
            r19 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33)
            r15.A00 = r12
            r0 = r36
            r15.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8VY.<init>(X.9up, boolean):void");
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EditCollectionProduct(product=");
        A0u.append(this.A00);
        A0u.append(", belongsToCollection=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
