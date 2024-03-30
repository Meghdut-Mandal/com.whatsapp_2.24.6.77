package androidx.car.app;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IOnRequestPermissionsListener extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.IOnRequestPermissionsListener";

    public class Default implements IOnRequestPermissionsListener {
        public IBinder asBinder() {
            return null;
        }

        public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        }
    }

    public abstract class Stub extends Binder implements IOnRequestPermissionsListener {
        public static final int TRANSACTION_onRequestPermissionsResult = 2;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IOnRequestPermissionsListener.DESCRIPTOR);
                    if (i == 2) {
                        onRequestPermissionsResult(parcel.createStringArray(), parcel.createStringArray());
                        parcel2.writeNoException();
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IOnRequestPermissionsListener.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IOnRequestPermissionsListener {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IOnRequestPermissionsListener.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnRequestPermissionsListener.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    obtain.writeStringArray(strArr2);
                    AnonymousClass000.A15(this.mRemote, obtain, obtain2, 2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IOnRequestPermissionsListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnRequestPermissionsListener.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOnRequestPermissionsListener)) {
                return new Proxy(iBinder);
            }
            return (IOnRequestPermissionsListener) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, IOnRequestPermissionsListener.DESCRIPTOR);
        }
    }

    void onRequestPermissionsResult(String[] strArr, String[] strArr2);
}
