package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6aN  reason: invalid class name and case insensitive filesystem */
public final class C134026aN implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        double readDouble = parcel.readDouble();
        int readInt = parcel.readInt();
        float readFloat = parcel.readFloat();
        ArrayList A0I = AnonymousClass001.A0I();
        parcel.readList(A0I, C06970Vv.A00.getClass().getClassLoader());
        ArrayList A0I2 = AnonymousClass001.A0I();
        parcel.readList(A0I2, C134796bc.CREATOR.getClass().getClassLoader());
        return new C135016bz(A0I, A0I2, readDouble, readFloat, readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C135016bz[i];
    }
}
