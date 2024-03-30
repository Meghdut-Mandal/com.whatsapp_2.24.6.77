package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.7ut  reason: invalid class name and case insensitive filesystem */
public class C166017ut extends Binder implements CLResultReceiver {
    public final /* synthetic */ C165657tu A00;

    public C166017ut() {
        attachInterface(this, "org.npci.upi.security.services.CLResultReceiver");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C166017ut(C165657tu r1) {
        this();
        this.A00 = r1;
    }

    public static CLResultReceiver A01(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("org.npci.upi.security.services.CLResultReceiver");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof CLResultReceiver)) ? new AZT(iBinder) : (CLResultReceiver) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Bpm(A00(parcel));
        } else if (i == 2) {
            Bw9(A00(parcel));
        } else if (i == 3) {
            B7Z(A00(parcel));
        } else if (i == 4) {
            Bw8(A00(parcel));
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("org.npci.upi.security.services.CLResultReceiver");
            return true;
        }
        parcel2.writeNoException();
        return true;
    }

    public static Bundle A00(Parcel parcel) {
        parcel.enforceInterface("org.npci.upi.security.services.CLResultReceiver");
        if (parcel.readInt() != 0) {
            return (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        return null;
    }

    public void B7Z(Bundle bundle) {
        this.A00.A01.send(3, bundle);
    }

    public void Bpm(Bundle bundle) {
        this.A00.A01.send(1, bundle);
    }

    public void Bw8(Bundle bundle) {
        this.A00.A01.send(4, bundle);
    }

    public void Bw9(Bundle bundle) {
        this.A00.A01.send(2, bundle);
    }
}
