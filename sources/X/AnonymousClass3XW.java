package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XW  reason: invalid class name */
public final class AnonymousClass3XW implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass3X5();
    public String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.length() == 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A00() {
        /*
            r4 = this;
            java.lang.String r3 = r4.A02
            r2 = 0
            if (r3 == 0) goto L_0x000c
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r1 = 0
            if (r0 == 0) goto L_0x0011
            return r1
        L_0x0011:
            byte[] r0 = android.util.Base64.decode(r3, r2)     // Catch:{ IllegalArgumentException -> 0x0016 }
            return r0
        L_0x0016:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XW.A00():byte[]");
    }

    public AnonymousClass3XW(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A02 = str5;
    }

    public String toString() {
        Object obj;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShopEntityMetaData(id='");
        A0u.append(this.A00);
        A0u.append("', title='");
        A0u.append(this.A03);
        A0u.append("', subTitle='");
        A0u.append(this.A01);
        A0u.append("', imageUrl='");
        A0u.append(this.A04);
        A0u.append("', thumbBase64Encoded='");
        String str = this.A02;
        if (str != null) {
            obj = Integer.valueOf(str.length());
        } else {
            obj = "null";
        }
        A0u.append(obj);
        return AnonymousClass000.A0q("')", A0u);
    }
}
