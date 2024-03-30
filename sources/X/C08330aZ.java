package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* renamed from: X.0aZ  reason: invalid class name and case insensitive filesystem */
public final class C08330aZ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c == 3) {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c != 4) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                arrayList = AnonymousClass0ZA.A0B(parcel, Transport.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04330Kf(str, arrayList, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04330Kf[i];
    }
}
