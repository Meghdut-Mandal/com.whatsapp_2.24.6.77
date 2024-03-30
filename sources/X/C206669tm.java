package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.9tm  reason: invalid class name and case insensitive filesystem */
public final class C206669tm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206099si();
    public boolean A00;
    public final String A01;
    public final byte[] A02;

    public C206669tm(byte[] bArr, String str, boolean z) {
        AnonymousClass00C.A0D(str, 2);
        this.A02 = bArr;
        this.A01 = str;
        this.A00 = z;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x003c
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = X.C90474aD.A0W(r5)
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.content.ProductHeaderImage"
            X.AnonymousClass00C.A0E(r5, r0)
            X.9tm r5 = (X.C206669tm) r5
            byte[] r1 = r4.A02
            byte[] r0 = r5.A02
            if (r1 == 0) goto L_0x0028
            if (r0 == 0) goto L_0x0027
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x002b
        L_0x0027:
            return r2
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            return r2
        L_0x002b:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0027
            boolean r1 = r4.A00
            boolean r0 = r5.A00
            if (r1 == r0) goto L_0x003c
            return r2
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206669tm.equals(java.lang.Object):boolean");
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public int hashCode() {
        int i;
        byte[] bArr = this.A02;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        return C36381kD.A08(this.A01, i * 31) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductHeaderImage(thumbnail=");
        C90474aD.A1O(A0u, this.A02);
        A0u.append(", productId=");
        A0u.append(this.A01);
        A0u.append(", isProductRejected=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
