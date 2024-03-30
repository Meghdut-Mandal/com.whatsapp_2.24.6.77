package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aE  reason: invalid class name and case insensitive filesystem */
public final class C08120aE implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        AnonymousClass0KC r3 = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    r3 = (AnonymousClass0KC) AnonymousClass0ZA.A06(parcel, AnonymousClass0KC.CREATOR, readInt);
                    break;
                case 2:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 3:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 4:
                    iArr = AnonymousClass0ZA.A0J(parcel, readInt);
                    break;
                case 5:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 6:
                    iArr2 = AnonymousClass0ZA.A0J(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KD(r3, iArr, iArr2, i, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KD[i];
    }
}
