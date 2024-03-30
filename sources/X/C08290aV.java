package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aV  reason: invalid class name and case insensitive filesystem */
public final class C08290aV implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            str = AnonymousClass0ZA.A09(parcel, str, (char) readInt, 1, readInt);
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KQ(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KQ[i];
    }
}
