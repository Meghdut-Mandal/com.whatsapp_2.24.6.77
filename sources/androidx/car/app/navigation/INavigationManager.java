package androidx.car.app.navigation;

import X.C165567td;
import X.C165577te;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface INavigationManager extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.navigation.INavigationManager";

    public class Default implements INavigationManager {
        public IBinder asBinder() {
            return null;
        }

        public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements INavigationManager {
        public static final int TRANSACTION_onStopNavigation = 2;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(INavigationManager.DESCRIPTOR);
                    if (i == 2) {
                        onStopNavigation(C165577te.A0K(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(INavigationManager.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements INavigationManager {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return INavigationManager.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INavigationManager.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 2);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static INavigationManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(INavigationManager.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INavigationManager)) {
                return new Proxy(iBinder);
            }
            return (INavigationManager) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, INavigationManager.DESCRIPTOR);
        }
    }

    void onStopNavigation(IOnDoneCallback iOnDoneCallback);
}
