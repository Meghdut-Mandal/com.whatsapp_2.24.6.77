package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.9tl  reason: invalid class name and case insensitive filesystem */
public final class C206659tl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206059se();
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.protocol.content.Header");
                C206659tl r5 = (C206659tl) obj;
                if (AnonymousClass00C.A0J(this.A01, r5.A01) && AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    byte[] bArr = this.A02;
                    byte[] bArr2 = r5.A02;
                    if (bArr != null) {
                        if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                            return false;
                        }
                    } else if (bArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A02);
    }

    public int hashCode() {
        int i = 0;
        int A06 = ((C165577te.A06(this.A01) * 31) + C165577te.A06(this.A00)) * 31;
        byte[] bArr = this.A02;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return A06 + i;
    }

    public C206659tl(String str, byte[] bArr, String str2) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = bArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Header(title=");
        A0u.append(this.A01);
        A0u.append(", subTitle=");
        A0u.append(this.A00);
        A0u.append(", thumbnail=");
        return C36321k7.A0E(Arrays.toString(this.A02), A0u);
    }
}
