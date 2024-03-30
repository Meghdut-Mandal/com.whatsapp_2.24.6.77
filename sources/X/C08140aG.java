package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0aG  reason: invalid class name and case insensitive filesystem */
public final class C08140aG implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 2) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                arrayList = AnonymousClass0ZA.A0B(parcel, C04480Ku.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0LA(arrayList, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0LA[i];
    }
}
