package androidx.car.app;

import X.AnonymousClass000;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ICarHost extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.ICarHost";

    public class Default implements ICarHost {
        public IBinder asBinder() {
            return null;
        }

        public void finish() {
        }

        public IBinder getHost(String str) {
            return null;
        }

        public void startCarApp(Intent intent) {
        }
    }

    public abstract class Stub extends Binder implements ICarHost {
        public static final int TRANSACTION_finish = 4;
        public static final int TRANSACTION_getHost = 3;
        public static final int TRANSACTION_startCarApp = 2;

        public abstract IBinder asBinder();

        public class Proxy implements ICarHost {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return ICarHost.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void finish() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHost.DESCRIPTOR);
                    AnonymousClass000.A15(this.mRemote, obtain, obtain2, 4);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder getHost(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHost.DESCRIPTOR);
                    obtain.writeString(str);
                    AnonymousClass000.A15(this.mRemote, obtain, obtain2, 3);
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void startCarApp(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHost.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ICarHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICarHost.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICarHost)) {
                return new Proxy(iBinder);
            }
            return (ICarHost) queryLocalInterface;
        }

        public Stub() {
            throw null;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw null;
        }
    }

    void finish();

    IBinder getHost(String str);

    void startCarApp(Intent intent);
}
