package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9td  reason: invalid class name and case insensitive filesystem */
public final class C206579td implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206119sk();
    public final String A00;
    public final List A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206579td) {
                C206579td r5 = (C206579td) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0o = C90474aD.A0o(parcel, this.A01);
        while (A0o.hasNext()) {
            ((C206509tW) A0o.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36341k9.A09(this.A00) * 31);
    }

    public C206579td(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductSection(title=");
        A0u.append(this.A00);
        A0u.append(", productList=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
