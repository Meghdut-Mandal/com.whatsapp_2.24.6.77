package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XO  reason: invalid class name */
public final class AnonymousClass3XO implements Parcelable {
    public static final Parcelable.Creator A04 = new C89864Ye(2);
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A02;
        if (num2 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeInt(num2.intValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.AnonymousClass3XO
            r2 = 0
            if (r0 == 0) goto L_0x0024
            int r1 = r3.A00
            X.3XO r4 = (X.AnonymousClass3XO) r4
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0024
            int r1 = r3.A01
            int r0 = r4.A01
            if (r1 != r0) goto L_0x0024
            java.lang.Integer r1 = r3.A03
            java.lang.Integer r0 = r4.A03
            if (r1 != 0) goto L_0x002c
            if (r0 != 0) goto L_0x0024
        L_0x001b:
            java.lang.Integer r1 = r3.A02
            java.lang.Integer r0 = r4.A02
            if (r1 != 0) goto L_0x0025
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r2 = 1
        L_0x0024:
            return r2
        L_0x0025:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            goto L_0x0023
        L_0x002c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XO.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int A0J = ((((this.A00 * 31) + this.A01) * 31) + AnonymousClass000.A0J(this.A03)) * 31;
        Integer num = this.A02;
        if (num != null) {
            i = num.hashCode();
        }
        return A0J + i;
    }

    public AnonymousClass3XO(Integer num, Integer num2, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = num;
        this.A02 = num2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("dayOfWeek: ");
        A0u.append(this.A00);
        A0u.append(", mode: ");
        A0u.append(this.A01);
        A0u.append(", openTime: ");
        A0u.append(this.A03);
        A0u.append(", closeTime: ");
        return AnonymousClass000.A0o(this.A02, A0u);
    }
}
