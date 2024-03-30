package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.9rc  reason: invalid class name and case insensitive filesystem */
public final class C205419rc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 3:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 4:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 5:
                    i2 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 6:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 7:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 8:
                    str3 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 9:
                    z3 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 10:
                    str4 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 11:
                    str5 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new ConnectionConfiguration(str, str2, str3, str4, str5, i, i2, z, z2, z3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
