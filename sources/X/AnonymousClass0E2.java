package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0E2  reason: invalid class name */
public class AnonymousClass0E2 extends Binder implements C17450rO {
    public final /* synthetic */ C08700bA A00;

    public IBinder asBinder() {
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass0E2(C08700bA r1) {
        this();
        this.A00 = r1;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = C17450rO.A00;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                if (i == 1) {
                    parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    if (parcel.readInt() != 0) {
                        creator.createFromParcel(parcel);
                    }
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public AnonymousClass0E2() {
        attachInterface(this, C17450rO.A00);
    }
}
