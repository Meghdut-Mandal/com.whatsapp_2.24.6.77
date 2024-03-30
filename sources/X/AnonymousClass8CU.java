package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.8CU  reason: invalid class name */
public class AnonymousClass8CU extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204889qj();
    public long A00;
    public ParcelFileDescriptor A01;
    public DataHolder A02;
    public String A03;
    public byte[] A04;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        boolean A06 = C10440eF.A06(parcel, this.A03);
        AnonymousClass0Z9.A0B(parcel, this.A02, 3, i, A06);
        AnonymousClass0Z9.A0B(parcel, this.A01, 4, i, A06);
        AnonymousClass0Z9.A09(parcel, 5, this.A00);
        AnonymousClass0Z9.A0F(parcel, this.A04, 6, A06);
        AnonymousClass0Z9.A07(parcel, A002);
        this.A01 = null;
    }

    public AnonymousClass8CU(ParcelFileDescriptor parcelFileDescriptor, DataHolder dataHolder, String str, byte[] bArr, long j) {
        this.A03 = str;
        this.A02 = dataHolder;
        this.A01 = parcelFileDescriptor;
        this.A00 = j;
        this.A04 = bArr;
    }

    public AnonymousClass8CU() {
        this((ParcelFileDescriptor) null, (DataHolder) null, (String) null, (byte[]) null, 0);
    }
}
