package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8C5  reason: invalid class name */
public class AnonymousClass8C5 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204849qf();
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public AnonymousClass8C5(String str, byte[] bArr, int i) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0F(parcel, this.A02, 3, C10440eF.A06(parcel, this.A01));
        AnonymousClass0Z9.A08(parcel, 4, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
