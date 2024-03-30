package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0b6  reason: invalid class name and case insensitive filesystem */
public final class C08660b6 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                str = AnonymousClass0ZA.A09(parcel, str, c, 2, readInt);
            } else {
                arrayList = AnonymousClass0ZA.A0A(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0L2(str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0L2[i];
    }
}
