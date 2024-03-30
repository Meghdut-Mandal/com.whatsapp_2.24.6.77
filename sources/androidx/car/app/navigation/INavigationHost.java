package androidx.car.app.navigation;

import X.AnonymousClass000;
import X.C134946bs;
import X.C165577te;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface INavigationHost extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.navigation.INavigationHost";

    public class Default implements INavigationHost {
        public IBinder asBinder() {
            return null;
        }

        public void navigationEnded() {
        }

        public void navigationStarted() {
        }

        public void updateTrip(C134946bs r1) {
        }
    }

    public abstract class Stub extends Binder implements INavigationHost {
        public static final int TRANSACTION_navigationEnded = 3;
        public static final int TRANSACTION_navigationStarted = 2;
        public static final int TRANSACTION_updateTrip = 4;

        public abstract IBinder asBinder();

        public class Proxy implements INavigationHost {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return INavigationHost.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void navigationEnded() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INavigationHost.DESCRIPTOR);
                    AnonymousClass000.A15(this.mRemote, obtain, obtain2, 3);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void navigationStarted() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INavigationHost.DESCRIPTOR);
                    AnonymousClass000.A15(this.mRemote, obtain, obtain2, 2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void updateTrip(C134946bs r6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.mRemote.transact(4, obtain, obtain2, C165577te.A1X(obtain, r6, INavigationHost.DESCRIPTOR) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static INavigationHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(INavigationHost.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INavigationHost)) {
                return new Proxy(iBinder);
            }
            return (INavigationHost) queryLocalInterface;
        }

        public Stub() {
            throw null;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw null;
        }
    }

    void navigationEnded();

    void navigationStarted();

    void updateTrip(C134946bs r1);
}
