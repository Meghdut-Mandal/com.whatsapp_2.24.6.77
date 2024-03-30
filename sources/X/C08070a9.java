package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0a9  reason: invalid class name and case insensitive filesystem */
public final class C08070a9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
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
                    i3 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 4:
                    j = AnonymousClass0ZA.A03(parcel, readInt);
                    break;
                case 5:
                    j2 = AnonymousClass0ZA.A03(parcel, readInt);
                    break;
                case 6:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 7:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 8:
                    i4 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 9:
                    i5 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KE(str, str2, i, i2, i3, i4, i5, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KE[i];
    }
}
