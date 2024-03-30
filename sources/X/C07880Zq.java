package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0Zq  reason: invalid class name and case insensitive filesystem */
public final class C07880Zq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 2:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 3:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 4:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 5:
                    str3 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 6:
                    arrayList = AnonymousClass0ZA.A0A(parcel, readInt);
                    break;
                case 7:
                    z3 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04390Kl(str, str2, str3, arrayList, z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04390Kl[i];
    }
}
