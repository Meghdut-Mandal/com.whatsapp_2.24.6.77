package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9sb  reason: invalid class name and case insensitive filesystem */
public final class C206029sb implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Object createFromParcel2;
        Object createFromParcel3;
        Object createFromParcel4;
        Object createFromParcel5;
        int A02 = C36411kG.A02(parcel);
        Object obj = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C206659tl.CREATOR.createFromParcel(parcel);
        }
        C206659tl r3 = (C206659tl) createFromParcel;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList A14 = C36441kJ.A14(readInt);
        int i = 0;
        while (i != readInt) {
            i = C90504aG.A0A(parcel, C206689to.CREATOR, A14, i);
        }
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = C206819u1.CREATOR.createFromParcel(parcel);
        }
        C206819u1 r5 = (C206819u1) createFromParcel2;
        String readString4 = parcel.readString();
        C207199ui r1 = (C207199ui) C36411kG.A0H(parcel, C207219uk.class);
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = C206679tn.CREATOR.createFromParcel(parcel);
        }
        C206679tn r6 = (C206679tn) createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = C207089uX.CREATOR.createFromParcel(parcel);
        }
        C207089uX r4 = (C207089uX) createFromParcel4;
        if (parcel.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = C206489tU.CREATOR.createFromParcel(parcel);
        }
        C206489tU r2 = (C206489tU) createFromParcel5;
        if (parcel.readInt() != 0) {
            obj = AnonymousClass3XY.CREATOR.createFromParcel(parcel);
        }
        return new C207219uk(r1, r2, r3, r4, r5, r6, (AnonymousClass3XY) obj, readString, readString2, readString3, readString4, A14, A02);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C207219uk[i];
    }
}
