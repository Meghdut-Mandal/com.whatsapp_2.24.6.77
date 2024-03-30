package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;

/* renamed from: X.6II  reason: invalid class name */
public final class AnonymousClass6II {
    public static boolean A00;

    public static synchronized int A00(Context context) {
        ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate;
        C161357mc r1;
        synchronized (AnonymousClass6II.class) {
            AnonymousClass006.A02(context, "Context is null");
            if (!A00) {
                try {
                    try {
                        C99014sU r5 = (C99014sU) C129856Is.A01(context);
                        Parcel obtain = Parcel.obtain();
                        String str = r5.A00;
                        obtain.writeInterfaceToken(str);
                        Parcel A02 = r5.A02(4, obtain);
                        IBinder readStrongBinder = A02.readStrongBinder();
                        if (readStrongBinder == null) {
                            iCameraUpdateFactoryDelegate = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                            if (queryLocalInterface instanceof ICameraUpdateFactoryDelegate) {
                                iCameraUpdateFactoryDelegate = (ICameraUpdateFactoryDelegate) queryLocalInterface;
                            } else {
                                iCameraUpdateFactoryDelegate = new C98964sP(readStrongBinder);
                            }
                        }
                        A02.recycle();
                        AnonymousClass006.A01(iCameraUpdateFactoryDelegate);
                        AnonymousClass6UP.A00 = iCameraUpdateFactoryDelegate;
                        Parcel obtain2 = Parcel.obtain();
                        obtain2.writeInterfaceToken(str);
                        Parcel A022 = r5.A02(5, obtain2);
                        IBinder readStrongBinder2 = A022.readStrongBinder();
                        if (readStrongBinder2 == null) {
                            r1 = null;
                        } else {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                            if (queryLocalInterface2 instanceof C161357mc) {
                                r1 = (C161357mc) queryLocalInterface2;
                            } else {
                                r1 = new C98934sM(readStrongBinder2);
                            }
                        }
                        A022.recycle();
                        if (C112965ek.A00 == null) {
                            AnonymousClass006.A02(r1, "delegate must not be null");
                            C112965ek.A00 = r1;
                        }
                        A00 = true;
                    } catch (RemoteException e) {
                        throw AnonymousClass78K.A00(e);
                    }
                } catch (AnonymousClass0O8 e2) {
                    return e2.errorCode;
                }
            }
        }
        return 0;
    }
}
