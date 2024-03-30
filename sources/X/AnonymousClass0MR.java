package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.0MR  reason: invalid class name */
public abstract class AnonymousClass0MR extends AnonymousClass0E1 implements IObjectWrapper {
    public AnonymousClass0MR() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static IObjectWrapper A01(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof IObjectWrapper) {
            return (IObjectWrapper) queryLocalInterface;
        }
        return new AnonymousClass0MO(iBinder);
    }
}
