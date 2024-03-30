package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.4sf  reason: invalid class name and case insensitive filesystem */
public abstract class C99124sf extends C91524c9 implements C161377me {
    public static C161377me A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof C161377me) {
            return (C161377me) queryLocalInterface;
        }
        return new C98954sO(iBinder);
    }
}
