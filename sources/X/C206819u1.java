package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9u1  reason: invalid class name and case insensitive filesystem */
public final class C206819u1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206109sj();
    public final UserJid A00;
    public final C206669tm A01;
    public final List A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206819u1) {
                C206819u1 r5 = (C206819u1) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        Iterator A0o = C90474aD.A0o(parcel, this.A02);
        while (A0o.hasNext()) {
            ((C206579td) A0o.next()).writeToParcel(parcel, i);
        }
        this.A01.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final int A00() {
        int i = 0;
        for (C206579td r0 : this.A02) {
            i += r0.A01.size();
        }
        return i;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A01, C36391kE.A0A(this.A02)));
    }

    public C206819u1(UserJid userJid, C206669tm r2, List list) {
        C36321k7.A11(list, r2, userJid);
        this.A02 = list;
        this.A01 = r2;
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductListInfo(productSectionList=");
        A0u.append(this.A02);
        A0u.append(", productHeaderImage=");
        A0u.append(this.A01);
        A0u.append(", businessOwnerJid=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
