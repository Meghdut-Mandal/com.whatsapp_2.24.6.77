package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4s5  reason: invalid class name and case insensitive filesystem */
public final class C98824s5 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205399ra();
    public final byte A00;
    public final byte A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C98824s5 r5 = (C98824s5) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02.equals(r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C90504aG.A0B(this.A02, (((this.A00 + 31) * 31) + this.A01) * 31);
    }

    public final String toString() {
        byte b = this.A00;
        byte b2 = this.A01;
        String str = this.A02;
        StringBuilder A0h = C90524aI.A0h(C90474aD.A05(str) + 73);
        A0h.append("AmsEntityUpdateParcelable{, mEntityId=");
        A0h.append(b);
        A0h.append(", mAttributeId=");
        A0h.append(b2);
        A0h.append(", mValue='");
        A0h.append(str);
        return AnonymousClass000.A0q("'}", A0h);
    }

    public C98824s5(String str, byte b, byte b2) {
        this.A00 = b;
        this.A01 = b2;
        this.A02 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A05(parcel, this.A00, 2);
        AnonymousClass0Z9.A05(parcel, this.A01, 3);
        AnonymousClass0Z9.A0C(parcel, this.A02, 4, false);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}
