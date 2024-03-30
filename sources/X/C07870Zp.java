package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zp  reason: invalid class name and case insensitive filesystem */
public final class C07870Zp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 2:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 3:
                    str3 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 4:
                    str4 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 5:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 6:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04380Kk(str, str2, str3, str4, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04380Kk[i];
    }
}
