package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.Calendar;

/* renamed from: X.0tA  reason: invalid class name and case insensitive filesystem */
public class C18440tA implements Parcelable.Creator {
    public final int A00;

    public C18440tA(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new C08700bA(parcel);
            case 1:
                return new C08770bI(parcel);
            case 2:
                return new C08730bE(parcel);
            case 3:
                return new AnonymousClass0EI(parcel);
            case 4:
                return new AnonymousClass0EJ(parcel);
            case 5:
                return new C08790bK(parcel);
            case 6:
                return new C08710bC(parcel);
            case 7:
                return new C08750bG(parcel);
            case 8:
                return new C08780bJ(parcel);
            case 9:
                return new C08820bN(parcel);
            case 10:
                return new C08850bQ(parcel);
            case 11:
                return new C08810bM(parcel);
            case 12:
                return new C08860bR(parcel);
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                return new C08800bL(parcel);
            case 15:
                return new AnonymousClass0EK(parcel);
            case 16:
                Class<C10940fT> cls = C10940fT.class;
                parcel.readParcelable(C17460rQ.class.getClassLoader());
                return new C08720bD((C10940fT) parcel.readParcelable(cls.getClassLoader()), (C10940fT) parcel.readParcelable(cls.getClassLoader()), (C10940fT) parcel.readParcelable(cls.getClassLoader()), parcel.readInt());
            case 17:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Calendar A02 = AnonymousClass0YR.A02((Calendar) null);
                A02.set(1, readInt);
                A02.set(2, readInt2);
                return new C10940fT(A02);
            default:
                return new C08760bH(parcel);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new C08700bA[i];
            case 1:
                return new C08770bI[i];
            case 2:
                return new C08730bE[i];
            case 3:
                return new AnonymousClass0EI[i];
            case 4:
                return new AnonymousClass0EJ[i];
            case 5:
                return new C08790bK[i];
            case 6:
                return new C08710bC[i];
            case 7:
                return new C08750bG[i];
            case 8:
                return new C08780bJ[i];
            case 9:
                return new C08820bN[i];
            case 10:
                return new C08850bQ[i];
            case 11:
                return new C08810bM[i];
            case 12:
                return new C08860bR[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new C08800bL[i];
            case 15:
                return new AnonymousClass0EK[i];
            case 16:
                return new C08720bD[i];
            case 17:
                return new C10940fT[i];
            default:
                return new C08760bH[i];
        }
    }
}
