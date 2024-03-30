package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.9q2  reason: invalid class name and case insensitive filesystem */
public abstract class C204459q2 implements IInterface {
    public final String A00;
    public final IBinder A01;

    public C204459q2(IBinder iBinder, String str) {
        this.A01 = iBinder;
        this.A00 = str;
    }

    public final IBinder asBinder() {
        return this.A01;
    }

    public final void A00(int i, Parcel parcel) {
        try {
            C165567td.A0l(this.A01, parcel, i);
        } finally {
            parcel.recycle();
        }
    }
}
