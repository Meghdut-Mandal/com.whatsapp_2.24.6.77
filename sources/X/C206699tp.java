package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9tp  reason: invalid class name and case insensitive filesystem */
public final class C206699tp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205439re();
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public C206699tp(String str, String str2, boolean z, List list) {
        AnonymousClass00C.A0D(list, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
        this.A03 = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206699tp) {
                C206699tp r5 = (C206699tp) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A03 != r5.A03) {
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
        parcel.writeString(this.A01);
        Iterator A0o = C90474aD.A0o(parcel, this.A02);
        while (A0o.hasNext()) {
            ((C206539tZ) A0o.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, ((C36341k9.A09(this.A00) * 31) + C36421kH.A05(this.A01)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessAccountSettings:{'intent'='");
        A0u.append(this.A00);
        A0u.append("', 'status'='");
        A0u.append(this.A01);
        A0u.append("', 'issues'='");
        A0u.append(this.A02);
        A0u.append("', 'isProfileEditDisabled'='");
        A0u.append(this.A03);
        return AnonymousClass000.A0q("'}", A0u);
    }
}
