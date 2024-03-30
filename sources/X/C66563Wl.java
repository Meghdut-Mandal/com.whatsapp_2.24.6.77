package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Wl  reason: invalid class name and case insensitive filesystem */
public final class C66563Wl implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0g = C36341k9.A0g(parcel);
        Parcelable.Creator creator = AnonymousClass3XN.CREATOR;
        return new AnonymousClass3XU((AnonymousClass3XN) creator.createFromParcel(parcel), (AnonymousClass3XN) creator.createFromParcel(parcel), (AnonymousClass3XN) creator.createFromParcel(parcel), A0g, parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass3XU[i];
    }
}
