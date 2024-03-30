package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qy  reason: invalid class name and case insensitive filesystem */
public final class C205039qy implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = AnonymousClass0ZA.A00(parcel2);
        AnonymousClass8CB[] r4 = null;
        C169948Bj[] r5 = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = -1.0f;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 2:
                    i2 = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 3:
                    f = C165577te.A00(parcel2, readInt);
                    break;
                case 4:
                    f2 = C165577te.A00(parcel2, readInt);
                    break;
                case 5:
                    f3 = C165577te.A00(parcel2, readInt);
                    break;
                case 6:
                    f4 = C165577te.A00(parcel2, readInt);
                    break;
                case 7:
                    f5 = C165577te.A00(parcel2, readInt);
                    break;
                case 8:
                    f6 = C165577te.A00(parcel2, readInt);
                    break;
                case 9:
                    r4 = (AnonymousClass8CB[]) AnonymousClass0ZA.A0K(parcel2, AnonymousClass8CB.CREATOR, readInt);
                    break;
                case 10:
                    f8 = C165577te.A00(parcel2, readInt);
                    break;
                case 11:
                    f9 = C165577te.A00(parcel2, readInt);
                    break;
                case 12:
                    f10 = C165577te.A00(parcel2, readInt);
                    break;
                case 13:
                    r5 = (C169948Bj[]) AnonymousClass0ZA.A0K(parcel2, C169948Bj.CREATOR, readInt);
                    break;
                case 14:
                    f7 = C165577te.A00(parcel2, readInt);
                    break;
                case 15:
                    f11 = C165577te.A00(parcel2, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel2, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel2, A00);
        return new AnonymousClass8CE(r4, r5, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CE[i];
    }
}
