package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qm  reason: invalid class name and case insensitive filesystem */
public final class C204919qm implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
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
                    i4 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 6:
                    i5 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 7:
                    i6 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 9:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CZ(str, i, i2, i3, i4, i5, i6, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CZ[i];
    }
}
