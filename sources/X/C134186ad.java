package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6ad  reason: invalid class name and case insensitive filesystem */
public final class C134186ad implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C36411kG.A02(parcel);
        return new C134496b8(C90524aI.A0S(C90514aH.A0u(parcel)), A02, parcel.readInt(), C111805cs.A00(parcel).booleanValue());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134496b8[i];
    }
}
