package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* renamed from: X.0MF  reason: invalid class name */
public abstract class AnonymousClass0MF extends AnonymousClass0E0 implements IStatusCallback {
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C07370Xj.A00(parcel);
        Bf5((Status) AnonymousClass000.A0W(parcel, Status.CREATOR));
        return true;
    }

    public AnonymousClass0MF() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }
}
