package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0bF  reason: invalid class name and case insensitive filesystem */
public class C08740bF implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18580tO(4);
    public final Bundle A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public C08740bF(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.A00 = readBundle;
        if (classLoader != null && readBundle != null) {
            readBundle.setClassLoader(classLoader);
        }
    }

    public C08740bF(Bundle bundle) {
        this.A00 = bundle;
    }
}
