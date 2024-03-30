package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qk  reason: invalid class name and case insensitive filesystem */
public final class C204899qk implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                strArr = AnonymousClass0ZA.A0L(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CN(strArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CN[i];
    }
}
