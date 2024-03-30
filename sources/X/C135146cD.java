package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6cD  reason: invalid class name and case insensitive filesystem */
public class C135146cD implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new C163937r0(11);
    public static final long serialVersionUID = 0;
    public List mIdentifiers;

    public int describeContents() {
        return 0;
    }

    public static C23931Ak A00(C135146cD r0) {
        List list = r0.mIdentifiers;
        if (list == null) {
            return null;
        }
        return C23931Ak.copyOf((Collection) list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return C1897595l.A00(A00(this), A00((C135146cD) obj));
    }

    public String toString() {
        List list = this.mIdentifiers;
        if (list == null || C23931Ak.copyOf((Collection) list) == null || A00(this).isEmpty()) {
            return "";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        Iterator it = A00(this).iterator();
        while (it.hasNext()) {
            C90474aD.A1L(A0u, AnonymousClass001.A0C(it));
        }
        A0u.deleteCharAt(C90504aG.A0C(A00(this)));
        return A0u.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C23931Ak r0;
        List list;
        List list2 = this.mIdentifiers;
        if (list2 == null || C23931Ak.copyOf((Collection) list2) == null || (list = this.mIdentifiers) == null) {
            r0 = null;
        } else {
            r0 = C23931Ak.copyOf((Collection) list);
        }
        parcel.writeStringList(r0);
    }

    public C135146cD(Parcel parcel) {
        this.mIdentifiers = null;
        this.mIdentifiers = (List) parcel.readValue(List.class.getClassLoader());
    }

    public int hashCode() {
        return AnonymousClass000.A0K(A00(this), AnonymousClass001.A0L());
    }

    public C135146cD() {
        this.mIdentifiers = null;
        this.mIdentifiers = AnonymousClass001.A0I();
    }
}
