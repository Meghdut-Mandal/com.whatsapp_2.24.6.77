package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6b9  reason: invalid class name and case insensitive filesystem */
public class C134506b9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C133876a8();
    public Messenger A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.A00.getBinder().equals(((C134506b9) obj).A00.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return this.A00.getBinder().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.A00.getBinder());
    }

    public C134506b9(IBinder iBinder) {
        this.A00 = new Messenger(iBinder);
    }
}
