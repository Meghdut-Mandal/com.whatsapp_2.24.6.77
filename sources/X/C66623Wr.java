package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Wr  reason: invalid class name and case insensitive filesystem */
public final class C66623Wr implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        Parcelable.Creator creator = AnonymousClass146.CREATOR;
        return new AnonymousClass146(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass146[i];
    }
}
