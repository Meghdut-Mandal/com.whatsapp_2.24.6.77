package androidx.car.app;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IStartCarApp extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.IStartCarApp";

    public class Default implements IStartCarApp {
        public IBinder asBinder() {
            return null;
        }

        public void startCarApp(Intent intent) {
        }
    }

    public abstract class Stub extends Binder implements IStartCarApp {
        public static final int TRANSACTION_startCarApp = 2;

        public abstract IBinder asBinder();

        public class Proxy implements IStartCarApp {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IStartCarApp.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void startCarApp(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IStartCarApp.DESCRIPTOR);
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

        public static IStartCarApp asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IStartCarApp.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IStartCarApp)) {
                return new Proxy(iBinder);
            }
            return (IStartCarApp) queryLocalInterface;
        }

        public Stub() {
            throw null;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw null;
        }
    }

    void startCarApp(Intent intent);
}
