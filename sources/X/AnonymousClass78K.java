package X;

import android.os.RemoteException;

/* renamed from: X.78K  reason: invalid class name */
public final class AnonymousClass78K extends RuntimeException {
    public static AnonymousClass78K A00(RemoteException remoteException) {
        return new AnonymousClass78K(remoteException);
    }

    public AnonymousClass78K(RemoteException remoteException) {
        super(remoteException);
    }
}
