package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.7uP  reason: invalid class name and case insensitive filesystem */
public abstract class C165937uP extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public C165937uP(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status status;
        Object valueOf;
        TaskCompletionSource taskCompletionSource;
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C170268Ct) {
            C170268Ct r3 = (C170268Ct) this;
            if (i != 1) {
                return false;
            }
            status = (Status) AnonymousClass000.A0W(parcel, Status.CREATOR);
            valueOf = Boolean.valueOf(AnonymousClass000.A1P(parcel.readInt()));
            taskCompletionSource = r3.A00;
        } else if (this instanceof C170258Cs) {
            C170258Cs r32 = (C170258Cs) this;
            if (i != 1) {
                return false;
            }
            status = (Status) AnonymousClass000.A0W(parcel, Status.CREATOR);
            valueOf = parcel.createByteArray();
            taskCompletionSource = r32.A00;
        } else {
            C170248Cr r33 = (C170248Cr) this;
            if (i != 1) {
                return false;
            }
            status = (Status) AnonymousClass000.A0W(parcel, Status.CREATOR);
            valueOf = Integer.valueOf(parcel.readInt());
            taskCompletionSource = r33.A00;
        }
        AnonymousClass0QK.A00(status, taskCompletionSource, valueOf);
        return true;
    }
}
