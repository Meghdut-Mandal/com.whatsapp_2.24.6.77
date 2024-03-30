package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qM  reason: invalid class name and case insensitive filesystem */
public final class C204659qM implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = "";
        String str2 = str;
        String str3 = str;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str2 = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c != 2) {
                str = AnonymousClass0ZA.A09(parcel, str, c, 5, readInt);
            } else {
                str3 = AnonymousClass0ZA.A08(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8C3(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8C3[i];
    }
}
