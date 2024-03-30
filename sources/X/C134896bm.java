package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bm  reason: invalid class name and case insensitive filesystem */
public final class C134896bm implements Parcelable {
    public static final C133866a7 CREATOR = new C133866a7();
    public final int A00;
    public final int A01;
    public final Parcelable A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public C134896bm(Parcelable parcelable, int i, int i2) {
        this.A02 = parcelable;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C134896bm(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.Class<X.6bm> r2 = X.C134896bm.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x001e
            java.lang.ClassLoader r0 = r2.getClassLoader()
            java.lang.Object r2 = r4.readParcelable(r0, r2)
        L_0x0010:
            X.6bm r2 = (X.C134896bm) r2
            int r1 = r4.readInt()
            int r0 = r4.readInt()
            r3.<init>(r2, r1, r0)
            return
        L_0x001e:
            android.os.Parcelable r2 = X.C36411kG.A0H(r4, r2)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134896bm.<init>(android.os.Parcel):void");
    }
}
