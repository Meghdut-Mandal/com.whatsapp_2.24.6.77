package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9to  reason: invalid class name and case insensitive filesystem */
public final class C206689to implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139sm();
    public final String A00;
    public final String A01;
    public final List A02;

    public C206689to(String str, String str2, List list) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206689to) {
                C206689to r5 = (C206689to) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
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
        Iterator A0o = C90474aD.A0o(parcel, this.A02);
        while (A0o.hasNext()) {
            ((C206729ts) A0o.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, (C36421kH.A04(this.A01) + C36341k9.A09(this.A00)) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SingleSelectListSection(title=");
        A0u.append(this.A01);
        A0u.append(", highlightLabel=");
        A0u.append(this.A00);
        A0u.append(", items=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
