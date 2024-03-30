package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aI  reason: invalid class name and case insensitive filesystem */
public final class C08160aI implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        C04460Ks r3 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 2:
                    i2 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 3:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 4:
                    i3 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 5:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 6:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 7:
                    i4 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 8:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 9:
                    r3 = (C04460Ks) AnonymousClass0ZA.A06(parcel, C04460Ks.CREATOR, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04530Kz(r3, str, str2, i, i2, i3, i4, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04530Kz[i];
    }
}
