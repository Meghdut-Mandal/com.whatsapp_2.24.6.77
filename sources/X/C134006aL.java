package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.6aL  reason: invalid class name and case insensitive filesystem */
public final class C134006aL implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0g = C36341k9.A0g(parcel);
        int readInt = parcel.readInt();
        ArrayList A14 = C36441kJ.A14(readInt);
        for (int i = 0; i != readInt; i++) {
            A14.add(C36411kG.A0H(parcel, C134746bX.class));
        }
        int readInt2 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
        for (int i2 = 0; i2 != readInt2; i2++) {
            linkedHashMap.put(parcel.readSerializable(), C134656bO.CREATOR.createFromParcel(parcel));
        }
        int readInt3 = parcel.readInt();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
        for (int i3 = 0; i3 != readInt3; i3++) {
            linkedHashMap2.put(C134606bJ.CREATOR.createFromParcel(parcel), parcel.readSerializable());
        }
        return new C134746bX(A0g, A14, linkedHashMap, linkedHashMap2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134746bX[i];
    }
}
