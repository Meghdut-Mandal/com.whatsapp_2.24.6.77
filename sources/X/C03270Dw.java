package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0Dw  reason: invalid class name and case insensitive filesystem */
public abstract class C03270Dw extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public C03270Dw() {
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        AnonymousClass0LX r1 = (AnonymousClass0LX) this;
        if (i != 1) {
            return false;
        }
        AnonymousClass0QK.A00((Status) AnonymousClass000.A0W(parcel, Status.CREATOR), r1.A00, (Object) null);
        return true;
    }
}
