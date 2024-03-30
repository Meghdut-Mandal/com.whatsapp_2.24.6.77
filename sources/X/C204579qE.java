package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qE  reason: invalid class name and case insensitive filesystem */
public final class C204579qE implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        while (parcel.dataPosition() < A00) {
            AnonymousClass0ZA.A0D(parcel, parcel.readInt());
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CG();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CG[i];
    }
}
