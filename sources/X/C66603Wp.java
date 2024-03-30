package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Wp  reason: invalid class name and case insensitive filesystem */
public final class C66603Wp implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        Parcelable.Creator creator = AnonymousClass148.CREATOR;
        new AnonymousClass148(parcel.readString());
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass148[i];
    }
}
