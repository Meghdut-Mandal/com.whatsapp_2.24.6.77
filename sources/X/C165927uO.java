package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.7uO  reason: invalid class name and case insensitive filesystem */
public abstract class C165927uO extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public C165927uO() {
        attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        BasePendingResult basePendingResult;
        C16780q5 r0;
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        C170498Dq r3 = (C170498Dq) this;
        if (i == 1) {
            Status status = (Status) AnonymousClass000.A0W(parcel, Status.CREATOR);
            C169878Ba r1 = (C169878Ba) AnonymousClass000.A0W(parcel, C169878Ba.CREATOR);
            if (r3 instanceof C170448Dl) {
                basePendingResult = ((C170448Dl) r3).A00;
                r0 = new A49(status, r1);
            } else {
                throw AnonymousClass001.A0D();
            }
        } else if (i == 2) {
            parcel.readString();
            throw AnonymousClass001.A0D();
        } else if (i == 3) {
            AnonymousClass000.A0W(parcel, Status.CREATOR);
            AnonymousClass000.A0W(parcel, AnonymousClass8CU.CREATOR);
            throw AnonymousClass001.A0D();
        } else if (i == 4) {
            AnonymousClass000.A0W(parcel, Status.CREATOR);
            parcel.readInt();
            throw AnonymousClass001.A0D();
        } else if (i == 6) {
            AnonymousClass000.A0W(parcel, Status.CREATOR);
            AnonymousClass000.A0W(parcel, C169888Bb.CREATOR);
            throw AnonymousClass001.A0D();
        } else if (i == 8) {
            Status status2 = (Status) AnonymousClass000.A0W(parcel, Status.CREATOR);
            AnonymousClass8CA r12 = (AnonymousClass8CA) AnonymousClass000.A0W(parcel, AnonymousClass8CA.CREATOR);
            if (r3 instanceof C170458Dm) {
                basePendingResult = ((C170458Dm) r3).A00;
                r0 = new A4A(status2, r12);
            } else {
                throw AnonymousClass001.A0D();
            }
        } else if (i == 10) {
            AnonymousClass000.A0W(parcel, Status.CREATOR);
            parcel.readInt();
            throw AnonymousClass001.A0D();
        } else if (i == 11) {
            AnonymousClass000.A0W(parcel, Status.CREATOR);
            throw AnonymousClass001.A0D();
        } else if (i == 15) {
            AnonymousClass000.A0W(parcel, Status.CREATOR);
            AnonymousClass000.A0W(parcel, AnonymousClass8Bi.CREATOR);
            throw AnonymousClass001.A0D();
        } else if (i != 16) {
            return false;
        } else {
            AnonymousClass000.A0W(parcel, Status.CREATOR);
            parcel.readString();
            parcel.readInt();
            throw AnonymousClass001.A0D();
        }
        basePendingResult.A06(r0);
        return true;
    }
}
