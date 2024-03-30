package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9ta  reason: invalid class name and case insensitive filesystem */
public final class C206549ta implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205619rw();
    public final C134766bZ A00;
    public final C134766bZ A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206549ta) {
                C206549ta r5 = (C206549ta) obj;
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
        C134766bZ r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        C134766bZ r02 = this.A01;
        if (r02 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r02.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A00) * 31) + C36411kG.A09(this.A01);
    }

    public C206549ta(C134766bZ r1, C134766bZ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkedAccounts:{'facebookPage'='");
        C134766bZ r0 = this.A00;
        String str2 = null;
        if (r0 != null) {
            str = r0.toString();
        } else {
            str = null;
        }
        A0u.append(str);
        A0u.append("', 'instagramPage'='");
        C134766bZ r02 = this.A01;
        if (r02 != null) {
            str2 = r02.toString();
        }
        A0u.append(str2);
        return AnonymousClass000.A0q("'}", A0u);
    }
}
