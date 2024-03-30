package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bU  reason: invalid class name and case insensitive filesystem */
public final class C134716bU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134446b3();
    public final C134876bk A00;
    public final C134876bk A01;
    public final C134876bk A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134716bU) {
                C134716bU r5 = (C134716bU) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A01, C36391kE.A0A(this.A00)));
    }

    public C134716bU(C134876bk r1, C134876bk r2, C134876bk r3) {
        C36321k7.A11(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Fb4aUserEntityForNativeAuth(accessToken=");
        A0u.append(this.A00);
        A0u.append(", fullName=");
        A0u.append(this.A01);
        A0u.append(", profilePictureUrl=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
