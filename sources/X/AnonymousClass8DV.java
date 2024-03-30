package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.8DV  reason: invalid class name */
public final class AnonymousClass8DV extends C204449q1 implements C23102B4r {
    public AnonymousClass8DV(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void Byw(AnonymousClass8CC r4) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeInt(1);
        r4.writeToParcel(obtain, 0);
        A00(59, obtain);
    }
}
