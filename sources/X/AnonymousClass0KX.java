package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KX  reason: invalid class name */
public class AnonymousClass0KX extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08340aa();
    public final C08830bO A00;
    public final C05120Nn A01;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0KX) {
            AnonymousClass0KX r4 = (AnonymousClass0KX) obj;
            if (!this.A01.equals(r4.A01) || !this.A00.equals(r4.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass0KX(String str, int i) {
        AnonymousClass006.A01(str);
        try {
            this.A01 = C05120Nn.A00(str);
            AnonymousClass006.A01(Integer.valueOf(i));
            try {
                this.A00 = C08830bO.A00(i);
            } catch (AnonymousClass0O0 e) {
                throw new IllegalArgumentException(e);
            }
        } catch (AnonymousClass0O2 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        return AnonymousClass000.A0L(this.A00, A0M);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A01.toString(), 2, false);
        int B8Q = this.A00.A00.B8Q();
        if (Integer.valueOf(B8Q) != null) {
            parcel.writeInt(262147);
            parcel.writeInt(B8Q);
        }
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
