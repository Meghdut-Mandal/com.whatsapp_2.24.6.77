package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qP  reason: invalid class name and case insensitive filesystem */
public final class C204689qP implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 2:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 3:
                    z3 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 4:
                    z4 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 5:
                    z5 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 6:
                    z6 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CD(z, z2, z3, z4, z5, z6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CD[i];
    }
}
