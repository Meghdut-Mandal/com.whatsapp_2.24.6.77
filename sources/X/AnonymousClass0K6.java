package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0K6  reason: invalid class name */
public final class AnonymousClass0K6 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08630b3();
    public final String A00;
    public final byte[] A01;

    public AnonymousClass0K6(String str, byte[] bArr) {
        AnonymousClass006.A01(str);
        this.A00 = str;
        AnonymousClass006.A01(bArr);
        this.A01 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, 1);
        AnonymousClass0Z9.A0F(parcel, this.A01, 3, C10440eF.A06(parcel, this.A00));
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
