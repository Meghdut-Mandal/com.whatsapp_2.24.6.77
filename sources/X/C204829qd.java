package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qd  reason: invalid class name and case insensitive filesystem */
public final class C204829qd implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C170188Ch[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 3:
                    bArr = AnonymousClass0ZA.A0I(parcel, readInt);
                    break;
                case 4:
                    bArr2 = AnonymousClass0ZA.A0M(parcel, readInt);
                    break;
                case 5:
                    bArr3 = AnonymousClass0ZA.A0M(parcel, readInt);
                    break;
                case 6:
                    bArr4 = AnonymousClass0ZA.A0M(parcel, readInt);
                    break;
                case 7:
                    bArr5 = AnonymousClass0ZA.A0M(parcel, readInt);
                    break;
                case 8:
                    iArr = AnonymousClass0ZA.A0J(parcel, readInt);
                    break;
                case 9:
                    bArr6 = AnonymousClass0ZA.A0M(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170188Ch(str, bArr, iArr, bArr2, bArr3, bArr4, bArr5, bArr6);
    }
}
