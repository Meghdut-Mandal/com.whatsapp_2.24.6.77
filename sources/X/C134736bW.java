package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6bW  reason: invalid class name and case insensitive filesystem */
public final class C134736bW implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C133936aE();
    public final C134546bD A00;
    public final C134666bP A01;
    public final List A02;
    public final List A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134736bW) {
                C134736bW r5 = (C134736bW) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0o = C90474aD.A0o(parcel, list);
            while (A0o.hasNext()) {
                parcel.writeParcelable((Parcelable) A0o.next(), i);
            }
        }
        List list2 = this.A02;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0o2 = C90474aD.A0o(parcel, list2);
            while (A0o2.hasNext()) {
                ((C134606bJ) A0o2.next()).writeToParcel(parcel, i);
            }
        }
        C134666bP r0 = this.A01;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        C134546bD r02 = this.A00;
        if (r02 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r02.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return (((((AnonymousClass000.A0H(this.A03) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A00);
    }

    public C134736bW(C134546bD r1, C134666bP r2, List list, List list2) {
        this.A03 = list;
        this.A02 = list2;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductVariantInfo(types=");
        A0u.append(this.A03);
        A0u.append(", properties=");
        A0u.append(this.A02);
        A0u.append(", listingDetails=");
        A0u.append(this.A01);
        A0u.append(", availability=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
