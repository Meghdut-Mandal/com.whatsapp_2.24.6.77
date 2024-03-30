package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Bh  reason: invalid class name */
public class AnonymousClass8Bh extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204509q7();
    public final boolean A00;
    public final byte[] A01;

    public AnonymousClass8Bh(byte[] bArr, boolean z) {
        this.A01 = bArr;
        this.A00 = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0F(parcel, this.A01, 1, false);
        AnonymousClass0Z9.A0A(parcel, 2, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
