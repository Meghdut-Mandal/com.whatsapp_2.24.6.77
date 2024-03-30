package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9r8  reason: invalid class name and case insensitive filesystem */
public final class C205119r8 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                uri = (Uri) AnonymousClass0ZA.A06(parcel, Uri.CREATOR, readInt);
            } else if (c == 4) {
                bundle = AnonymousClass0ZA.A04(parcel, readInt);
            } else if (c != 5) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CF(uri, bundle, bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CF[i];
    }
}
