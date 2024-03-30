package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6aA  reason: invalid class name and case insensitive filesystem */
public final class C133896aA implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        ArrayList A14;
        Integer valueOf3;
        String A0g = C36341k9.A0g(parcel);
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            A14 = null;
        } else {
            int readInt = parcel.readInt();
            A14 = C36441kJ.A14(readInt);
            for (int i = 0; i != readInt; i++) {
                A14.add(parcel.readValue(C135046c2.class.getClassLoader()));
            }
        }
        int readInt2 = parcel.readInt();
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new C135046c2(valueOf, valueOf2, valueOf3, num, A0g, readString, A14, readInt2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C135046c2[i];
    }
}
