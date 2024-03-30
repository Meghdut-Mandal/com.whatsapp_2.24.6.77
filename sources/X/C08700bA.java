package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0bA  reason: invalid class name and case insensitive filesystem */
public class C08700bA implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18440tA(0);
    public C17450rO A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            C17450rO r0 = this.A00;
            if (r0 == null) {
                r0 = new AnonymousClass0E2(this);
                this.A00 = r0;
            }
            parcel.writeStrongBinder(r0.asBinder());
        }
    }

    public C08700bA(Parcel parcel) {
        C17450rO r1;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C17450rO.A00);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C17450rO)) {
                r1 = new C08880bT(readStrongBinder);
            } else {
                r1 = (C17450rO) queryLocalInterface;
            }
        }
        this.A00 = r1;
    }
}
