package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9q9  reason: invalid class name and case insensitive filesystem */
public final class C204529q9 implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C170148Cd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        C170158Ce r3 = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        C170188Ch[] r7 = null;
        boolean z = true;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    r3 = (C170158Ce) AnonymousClass0ZA.A06(parcel, C170158Ce.CREATOR, readInt);
                    break;
                case 3:
                    bArr = AnonymousClass0ZA.A0I(parcel, readInt);
                    break;
                case 4:
                    iArr = AnonymousClass0ZA.A0J(parcel, readInt);
                    break;
                case 5:
                    strArr = AnonymousClass0ZA.A0L(parcel, readInt);
                    break;
                case 6:
                    iArr2 = AnonymousClass0ZA.A0J(parcel, readInt);
                    break;
                case 7:
                    bArr2 = AnonymousClass0ZA.A0M(parcel, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 9:
                    r7 = (C170188Ch[]) AnonymousClass0ZA.A0K(parcel, C170188Ch.CREATOR, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170148Cd(r3, bArr, iArr, iArr2, r7, strArr, bArr2, z);
    }
}
