package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: X.6a6  reason: invalid class name and case insensitive filesystem */
public class C133856a6 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        Objects.requireNonNull(readBundle);
        return new C134946bs(readBundle);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134946bs[i];
    }
}
