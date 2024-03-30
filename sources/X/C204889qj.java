package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.9qj  reason: invalid class name and case insensitive filesystem */
public final class C204889qj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c == 3) {
                dataHolder = (DataHolder) AnonymousClass0ZA.A06(parcel, DataHolder.CREATOR, readInt);
            } else if (c == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) AnonymousClass0ZA.A06(parcel, ParcelFileDescriptor.CREATOR, readInt);
            } else if (c == 5) {
                j = AnonymousClass0ZA.A03(parcel, readInt);
            } else if (c != 6) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CU(parcelFileDescriptor, dataHolder, str, bArr, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CU[i];
    }
}
