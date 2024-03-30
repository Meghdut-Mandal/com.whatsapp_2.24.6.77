package androidx.car.app.model;

import X.C165567td;
import X.C165577te;
import X.C165607th;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface ITabCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.ITabCallback";

    public class Default implements ITabCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements ITabCallback {
        public static final int TRANSACTION_onTabSelected = 2;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(ITabCallback.DESCRIPTOR);
                    if (i == 2) {
                        onTabSelected(parcel.readString(), C165577te.A0K(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(ITabCallback.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements ITabCallback {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return ITabCallback.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    C165607th.A19(iOnDoneCallback, obtain, ITabCallback.DESCRIPTOR, str);
                    C165567td.A0l(this.mRemote, obtain, 2);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static ITabCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ITabCallback.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITabCallback)) {
                return new Proxy(iBinder);
            }
            return (ITabCallback) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, ITabCallback.DESCRIPTOR);
        }
    }

    void onTabSelected(String str, IOnDoneCallback iOnDoneCallback);
}
