package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rq  reason: invalid class name and case insensitive filesystem */
public final class C205559rq implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Object createFromParcel;
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Object obj = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(AnonymousClass000.A1P(parcel.readInt()));
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C206599tf.CREATOR.createFromParcel(parcel);
        }
        C206599tf r1 = (C206599tf) createFromParcel;
        if (parcel.readInt() != 0) {
            obj = C206709tq.CREATOR.createFromParcel(parcel);
        }
        return new C206789ty(r1, (C206709tq) obj, valueOf, A0g, readString, readString2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206789ty[i];
    }
}
