package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.3Xb  reason: invalid class name and case insensitive filesystem */
public final class C66723Xb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C89864Ye(5);
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C66723Xb)) {
            return false;
        }
        C66723Xb r4 = (C66723Xb) obj;
        return AnonymousClass00C.A0J(r4.A04, this.A04) && AnonymousClass00C.A0J(r4.A03, this.A03) && r4.A01 == this.A01 && r4.A02 == this.A02 && r4.A00 == this.A00;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        C36331k8.A1V(objArr, this.A01);
        C36341k9.A1T(objArr, this.A02);
        C36341k9.A1U(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }

    public C66723Xb(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public C66723Xb() {
    }
}
