package androidx.car.app.model;

import X.C165567td;
import X.C165577te;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IOnContentRefreshListener extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.IOnContentRefreshListener";

    public class Default implements IOnContentRefreshListener {
        public IBinder asBinder() {
            return null;
        }

        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IOnContentRefreshListener {
        public static final int TRANSACTION_onContentRefreshRequested = 2;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IOnContentRefreshListener.DESCRIPTOR);
                    if (i == 2) {
                        onContentRefreshRequested(C165577te.A0K(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IOnContentRefreshListener.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IOnContentRefreshListener {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IOnContentRefreshListener.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnContentRefreshListener.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 2);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IOnContentRefreshListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnContentRefreshListener.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOnContentRefreshListener)) {
                return new Proxy(iBinder);
            }
            return (IOnContentRefreshListener) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, IOnContentRefreshListener.DESCRIPTOR);
        }
    }

    void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback);
}
