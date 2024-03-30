package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bu  reason: invalid class name and case insensitive filesystem */
public class C134966bu implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(16);
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C134966bu r5 = (C134966bu) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C134966bu(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A00;
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public C134966bu(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
