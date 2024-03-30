package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qz  reason: invalid class name and case insensitive filesystem */
public final class C205049qz implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 3:
                    i2 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 4:
                    i3 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 5:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 6:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 7:
                    f = C165577te.A00(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CV(f, i, i2, i3, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CV[i];
    }
}
