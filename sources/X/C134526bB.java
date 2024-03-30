package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bB  reason: invalid class name and case insensitive filesystem */
public class C134526bB implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134266al();

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(1);
    }

    public void A00() {
        if (this instanceof AnonymousClass5DM) {
            C36341k9.A0v(C90474aD.A0H(((AnonymousClass5DM) this).A00.A00.A03), "nux_seen_count", Integer.MAX_VALUE);
        }
    }

    public void A01() {
        if (this instanceof AnonymousClass5DM) {
            C194599Qj r0 = ((AnonymousClass5DM) this).A00.A00.A03;
            C36341k9.A0v(C90474aD.A0H(r0), "nux_seen_count", C36371kC.A01(r0.A00(), "nux_seen_count") + 1);
        }
    }

    public boolean A02() {
        if (!(this instanceof AnonymousClass5DM)) {
            return false;
        }
        AnonymousClass67J r3 = ((AnonymousClass5DM) this).A00;
        return AnonymousClass000.A1T(C36371kC.A01(r3.A00.A03.A00(), "nux_seen_count"), r3.A01.A07(6374));
    }
}
