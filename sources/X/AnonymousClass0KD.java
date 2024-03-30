package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KD  reason: invalid class name */
public class AnonymousClass0KD extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08120aE();
    public final int A00;
    public final AnonymousClass0KC A01;
    public final boolean A02;
    public final boolean A03;
    public final int[] A04;
    public final int[] A05;

    public AnonymousClass0KD(AnonymousClass0KC r1, int[] iArr, int[] iArr2, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = iArr;
        this.A00 = i;
        this.A05 = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A01, 1, i, false);
        AnonymousClass0Z9.A0A(parcel, 2, this.A02);
        AnonymousClass0Z9.A0A(parcel, 3, this.A03);
        int[] iArr = this.A04;
        if (iArr != null) {
            int A022 = AnonymousClass0Z9.A02(parcel, 4);
            parcel.writeIntArray(iArr);
            AnonymousClass0Z9.A07(parcel, A022);
        }
        AnonymousClass0Z9.A08(parcel, 5, this.A00);
        int[] iArr2 = this.A05;
        if (iArr2 != null) {
            int A023 = AnonymousClass0Z9.A02(parcel, 6);
            parcel.writeIntArray(iArr2);
            AnonymousClass0Z9.A07(parcel, A023);
        }
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
