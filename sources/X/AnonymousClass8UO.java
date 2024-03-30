package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8UO  reason: invalid class name */
public final class AnonymousClass8UO extends C206209st {
    public static final Parcelable.Creator CREATOR = new C205489rj();
    public final List A00;
    public final int A01;
    public final C52522pZ A02;

    public AnonymousClass8UO(C52522pZ r2, List list, int i) {
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = list;
        this.A02 = r2;
        this.A01 = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8UO) {
                AnonymousClass8UO r5 = (AnonymousClass8UO) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        Iterator A0o = C90474aD.A0o(parcel, this.A00);
        while (A0o.hasNext()) {
            parcel.writeParcelable((Parcelable) A0o.next(), i);
        }
        C36391kE.A1E(parcel, this.A02);
        parcel.writeInt(this.A01);
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36391kE.A0A(this.A00)) + this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaUriListParams(mediaUriList=");
        A0u.append(this.A00);
        A0u.append(", entryPointSource=");
        A0u.append(this.A02);
        A0u.append(", lwiEntryPoint=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
