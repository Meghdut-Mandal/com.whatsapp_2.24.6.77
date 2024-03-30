package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6aP  reason: invalid class name and case insensitive filesystem */
public final class C134046aP implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        int readInt = parcel.readInt();
        ArrayList A0I = AnonymousClass001.A0I();
        parcel.readList(A0I, C134616bK.CREATOR.getClass().getClassLoader());
        return new C134796bc(A0I, readFloat, readFloat2, readInt, parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134796bc[i];
    }
}
