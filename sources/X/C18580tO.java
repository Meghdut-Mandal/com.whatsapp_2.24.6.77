package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0tO  reason: invalid class name and case insensitive filesystem */
public class C18580tO implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public C18580tO(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        AnonymousClass0EL r2;
        switch (this.A00) {
            case 0:
                return new AnonymousClass0HS(parcel, classLoader);
            case 1:
                return new AnonymousClass0HP(parcel, classLoader);
            case 2:
                return new AnonymousClass0HJ(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return C08840bP.A01;
                }
                throw AnonymousClass001.A09("superState must be null");
            case 4:
                return new C08740bF(parcel, classLoader);
            case 5:
                return new AnonymousClass0HK(parcel, classLoader);
            case 6:
                return new AnonymousClass0HT(parcel, classLoader);
            case 7:
                if (Build.VERSION.SDK_INT >= 24) {
                    return r2;
                }
                r2 = new AnonymousClass0EL(parcel);
                return r2;
            case 8:
                return new AnonymousClass0HQ(parcel, classLoader);
            case 9:
                return new AnonymousClass0HR(parcel, classLoader);
            case 10:
                return new AnonymousClass0HL(parcel, classLoader);
            case 11:
                return new AnonymousClass0HM(parcel, classLoader);
            case 12:
                return new AnonymousClass0ED(parcel, classLoader);
            case 13:
                return new AnonymousClass0HN(parcel, classLoader);
            default:
                return new AnonymousClass0HO(parcel, classLoader);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass0HS[i];
            case 1:
                return new AnonymousClass0HP[i];
            case 2:
                return new AnonymousClass0HJ[i];
            case 3:
                return new C08840bP[i];
            case 4:
                return new C08740bF[i];
            case 5:
                return new AnonymousClass0HK[i];
            case 6:
                return new AnonymousClass0HT[i];
            case 7:
                return new AnonymousClass0EL[i];
            case 8:
                return new AnonymousClass0HQ[i];
            case 9:
                return new AnonymousClass0HR[i];
            case 10:
                return new AnonymousClass0HL[i];
            case 11:
                return new AnonymousClass0HM[i];
            case 12:
                return new AnonymousClass0ED[i];
            case 13:
                return new AnonymousClass0HN[i];
            default:
                return new AnonymousClass0HO[i];
        }
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass0EL r3;
        switch (this.A00) {
            case 0:
                return new AnonymousClass0HS(parcel, (ClassLoader) null);
            case 1:
                return new AnonymousClass0HP(parcel, (ClassLoader) null);
            case 2:
                return new AnonymousClass0HJ(parcel, (ClassLoader) null);
            case 3:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return C08840bP.A01;
                }
                throw AnonymousClass001.A09("superState must be null");
            case 4:
                return new C08740bF(parcel, (ClassLoader) null);
            case 5:
                return new AnonymousClass0HK(parcel, (ClassLoader) null);
            case 6:
                return new AnonymousClass0HT(parcel, (ClassLoader) null);
            case 7:
                if (Build.VERSION.SDK_INT >= 24) {
                    return r3;
                }
                r3 = new AnonymousClass0EL(parcel);
                return r3;
            case 8:
                return new AnonymousClass0HQ(parcel, (ClassLoader) null);
            case 9:
                return new AnonymousClass0HR(parcel, (ClassLoader) null);
            case 10:
                return new AnonymousClass0HL(parcel, (ClassLoader) null);
            case 11:
                return new AnonymousClass0HM(parcel, (ClassLoader) null);
            case 12:
                return new AnonymousClass0ED(parcel, (ClassLoader) null);
            case 13:
                return new AnonymousClass0HN(parcel, (ClassLoader) null);
            default:
                return new AnonymousClass0HO(parcel, (ClassLoader) null);
        }
    }
}
