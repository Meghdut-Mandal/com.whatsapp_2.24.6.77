package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CH  reason: invalid class name */
public class AnonymousClass8CH extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204769qX();
    public final int A00;
    public final Float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8CH) {
                AnonymousClass8CH r5 = (AnonymousClass8CH) obj;
                if (this.A00 != r5.A00 || !AnonymousClass0QM.A00(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0h = C90524aI.A0h(C90474aD.A05(valueOf) + 39);
        A0h.append("[PatternItem: type=");
        A0h.append(i);
        A0h.append(" length=");
        return C165567td.A0Y(valueOf, A0h);
    }

    public AnonymousClass8CH(Float f, int i) {
        boolean z = false;
        if (i == 1 || (f != null && f.floatValue() >= 0.0f)) {
            z = true;
        }
        String valueOf = String.valueOf(f);
        StringBuilder A0h = C90524aI.A0h(C90474aD.A05(valueOf) + 45);
        A0h.append("Invalid PatternItem: type=");
        A0h.append(i);
        AnonymousClass006.A07(z, AnonymousClass000.A0p(" length=", valueOf, A0h));
        this.A00 = i;
        this.A01 = f;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A00);
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        Float f = this.A01;
        if (f != null) {
            parcel.writeInt(262147);
            parcel.writeFloat(f.floatValue());
        }
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
