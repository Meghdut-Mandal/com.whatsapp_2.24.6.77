package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7st  reason: invalid class name and case insensitive filesystem */
public class C165107st implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public C165107st(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (this.A00 != 0) {
            return new C95214kF(parcel, (ClassLoader) null);
        }
        return new C95204kE(parcel, (ClassLoader) null);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        if (this.A00 != 0) {
            return new C95214kF[i];
        }
        return new C95204kE[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (this.A00 != 0) {
            return new C95214kF(parcel, classLoader);
        }
        return new C95204kE(parcel, classLoader);
    }
}
