package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Wj  reason: invalid class name and case insensitive filesystem */
public final class C66543Wj implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        return new C80193v0((C66753Xe) C66753Xe.CREATOR.createFromParcel(parcel), (AnonymousClass11F) C36411kG.A0H(parcel, C80193v0.class), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C80193v0[i];
    }
}
