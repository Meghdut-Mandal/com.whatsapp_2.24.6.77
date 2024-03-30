package X;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0Dx  reason: invalid class name */
public abstract class AnonymousClass0Dx extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass0Dx() {
        attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object createFromParcel;
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        C04790Ma r4 = (C04790Ma) this;
        if (i != 1) {
            return false;
        }
        Status status = (Status) AnonymousClass000.A0W(parcel, Status.CREATOR);
        Parcelable.Creator creator = PendingIntent.CREATOR;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(parcel);
        }
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            AnonymousClass0QK.A00(status, r4.A00, createFromParcel);
            return true;
        }
        throw new BadParcelableException(AnonymousClass000.A0r("Parcel data not fully consumed, unread size: ", AnonymousClass000.A0u(), dataAvail));
    }
}
