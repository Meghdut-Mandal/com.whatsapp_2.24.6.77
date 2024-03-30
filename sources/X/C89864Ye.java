package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.4Ye  reason: invalid class name and case insensitive filesystem */
public class C89864Ye implements Parcelable.Creator {
    public final int A00;

    public C89864Ye(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        Double valueOf2;
        switch (this.A00) {
            case 0:
                return new AnonymousClass3XZ(parcel);
            case 1:
                String A0g = C36341k9.A0g(parcel);
                String readString = parcel.readString();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(AnonymousClass3XO.A04);
                C18740tg.A06(createTypedArrayList);
                AnonymousClass00C.A08(createTypedArrayList);
                return new AnonymousClass3XK(A0g, readString, createTypedArrayList);
            case 2:
                int A02 = C36411kG.A02(parcel);
                int readInt = parcel.readInt();
                Integer num = null;
                if (parcel.readByte() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readByte() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                return new AnonymousClass3XO(valueOf, num, A02, readInt);
            case 3:
                String A0g2 = C36341k9.A0g(parcel);
                C18740tg.A06(A0g2);
                AnonymousClass00C.A08(A0g2);
                String readString2 = parcel.readString();
                C18740tg.A06(readString2);
                AnonymousClass00C.A08(readString2);
                Double d = null;
                if (parcel.readByte() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Double.valueOf(parcel.readDouble());
                }
                if (parcel.readByte() != 0) {
                    d = Double.valueOf(parcel.readDouble());
                }
                return new AnonymousClass3XE(valueOf2, d, A0g2, readString2);
            case 4:
                String A0g3 = C36341k9.A0g(parcel);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Parcelable A0H = C36411kG.A0H(parcel, AnonymousClass3XE.class);
                C18740tg.A06(A0H);
                AnonymousClass00C.A08(A0H);
                return new AnonymousClass3XS((AnonymousClass3XE) A0H, A0g3, readString3, readString4);
            case 5:
                AnonymousClass00C.A0D(parcel, 0);
                return new C66723Xb(parcel);
            default:
                return new C66733Xc(parcel);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass3XZ[i];
            case 1:
                return new AnonymousClass3XK[i];
            case 2:
                return new AnonymousClass3XO[i];
            case 3:
                return new AnonymousClass3XE[i];
            case 4:
                return new AnonymousClass3XS[i];
            case 5:
                return new C66723Xb[i];
            default:
                return new C66733Xc[i];
        }
    }
}
