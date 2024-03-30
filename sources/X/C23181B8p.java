package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.B8p  reason: case insensitive filesystem */
public class C23181B8p implements Parcelable.Creator {
    public final int A00;

    public C23181B8p(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                C175868bC r3 = new C175868bC();
                r3.A01 = parcel.readInt();
                r3.A09 = parcel.readString();
                r3.A0C = parcel.readString();
                r3.A03 = parcel.readString();
                r3.A03 = parcel.readString();
                r3.A07 = parcel.readString();
                r3.A04 = parcel.readString();
                r3.A05 = parcel.readString();
                r3.A02 = parcel.readLong();
                r3.A00 = parcel.readInt();
                r3.A02 = parcel.readString();
                r3.A06 = parcel.readString();
                r3.A04 = parcel.readString();
                boolean z = false;
                r3.A0E = AnonymousClass000.A1S(parcel.readByte(), 1);
                if (parcel.readByte() == 1) {
                    z = true;
                }
                r3.A0F = z;
                r3.A0B = parcel.readString();
                r3.A08 = parcel.readString();
                r3.A00 = parcel.readInt();
                r3.A05 = parcel.readString();
                r3.A01 = parcel.readInt();
                return r3;
            case 1:
                C175938bJ r32 = new C175938bJ();
                r32.A0N(parcel);
                r32.A05 = parcel.readString();
                r32.A04 = parcel.readString();
                r32.A03 = parcel.readString();
                r32.A02 = (Boolean) parcel.readSerializable();
                r32.A06 = parcel.readString();
                r32.A01 = (C207079uW) C36411kG.A0H(parcel, C207079uW.class);
                return r32;
            case 2:
                return new C178738hB(C90514aH.A0u(parcel));
            case 3:
                return new C178748hC(C90514aH.A0u(parcel), AnonymousClass000.A1O(parcel.readByte()));
            case 4:
                return new C180888ma(parcel);
            case 5:
                return new C207199ui(parcel);
            case 6:
                return new C206899uB(parcel);
            case 7:
                return new C206929uE(parcel);
            case 8:
                return new C207009uP(parcel);
            case 9:
                return new C206839u5(parcel);
            case 10:
                return new C206959uJ(parcel);
            case 11:
                return new C206979uM(parcel);
            case 12:
                return new C206909uC(parcel);
            case 13:
                return new C21331AHj(parcel);
            case 14:
                return new C21332AHk(parcel);
            case 15:
                return new C21333AHl(parcel);
            case 16:
                return new C21335AHn(parcel);
            case 17:
                return new C21334AHm(parcel);
            case 18:
                return new C207149ud(parcel);
            case 19:
                return new C206919uD(parcel);
            case 20:
                return new C206969uL(parcel);
            default:
                return new C207209uj(parcel);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new C175868bC[i];
            case 1:
                return new C175938bJ[0];
            case 2:
                return new C178738hB[i];
            case 3:
                return new C178748hC[i];
            case 4:
                return new C180888ma[i];
            case 5:
                return new C207199ui[i];
            case 6:
                return new C206899uB[i];
            case 7:
                return new C206929uE[i];
            case 8:
                return new C207009uP[i];
            case 9:
                return new C206839u5[i];
            case 10:
                return new C206959uJ[i];
            case 11:
                return new C206979uM[i];
            case 12:
                return new C206909uC[i];
            case 13:
                return new C21331AHj[i];
            case 14:
                return new C21332AHk[i];
            case 15:
                return new C21333AHl[i];
            case 16:
                return new C21335AHn[i];
            case 17:
                return new C21334AHm[i];
            case 18:
                return new C207149ud[i];
            case 19:
                return new C206919uD[i];
            case 20:
                return new C206969uL[i];
            default:
                return new C207209uj[i];
        }
    }
}
