package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0Zj  reason: invalid class name and case insensitive filesystem */
public final class C07810Zj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 2:
                    arrayList = AnonymousClass0ZA.A0A(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = AnonymousClass0ZA.A0A(parcel, readInt);
                    break;
                case 4:
                    arrayList3 = AnonymousClass0ZA.A0A(parcel, readInt);
                    break;
                case 5:
                    arrayList4 = AnonymousClass0ZA.A0A(parcel, readInt);
                    break;
                case 6:
                    arrayList5 = AnonymousClass0ZA.A0A(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04700Lr(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04700Lr[i];
    }
}
