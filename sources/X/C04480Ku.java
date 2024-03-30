package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Ku  reason: invalid class name and case insensitive filesystem */
public final class C04480Ku extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08150aH();
    public final int A00;
    public final int A01;
    public final String A02;

    public C04480Ku(String str, int i) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A0C(parcel, this.A02, 2, false);
        AnonymousClass0Z9.A08(parcel, 3, this.A01);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C04480Ku(int i, String str, int i2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }
}
