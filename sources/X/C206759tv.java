package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tv  reason: invalid class name and case insensitive filesystem */
public final class C206759tv implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(16);
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public C206759tv(String str, String str2, String str3, int i, int i2) {
        AnonymousClass00C.A0D(str, 1);
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = i;
        this.A02 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C206759tv)) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A04, ((C206759tv) obj).A04);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductImage(imageId=");
        A0u.append(this.A04);
        A0u.append(", originalImageUrl=");
        A0u.append(this.A00);
        A0u.append(", scaledImageUrl=");
        A0u.append(this.A01);
        A0u.append(", width=");
        A0u.append(this.A03);
        A0u.append(", height=");
        return C36321k7.A0G(A0u, this.A02);
    }
}
