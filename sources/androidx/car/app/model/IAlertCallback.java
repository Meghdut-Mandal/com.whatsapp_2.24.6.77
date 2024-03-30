package androidx.car.app.model;

import X.C165567td;
import X.C165577te;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IAlertCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.IAlertCallback";

    public class Default implements IAlertCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onAlertCancelled(int i, IOnDoneCallback iOnDoneCallback) {
        }

        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IAlertCallback {
        public static final int TRANSACTION_onAlertCancelled = 2;
        public static final int TRANSACTION_onAlertDismissed = 3;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IAlertCallback.DESCRIPTOR);
                    if (i == 2) {
                        onAlertCancelled(parcel.readInt(), C165577te.A0K(parcel));
                        return true;
                    } else if (i == 3) {
                        onAlertDismissed(C165577te.A0K(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IAlertCallback.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IAlertCallback {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IAlertCallback.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onAlertCancelled(int i, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAlertCallback.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 2);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAlertCallback.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 3);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IAlertCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAlertCallback.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAlertCallback)) {
                return new Proxy(iBinder);
            }
            return (IAlertCallback) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, IAlertCallback.DESCRIPTOR);
        }
    }

    void onAlertCancelled(int i, IOnDoneCallback iOnDoneCallback);

    void onAlertDismissed(IOnDoneCallback iOnDoneCallback);
}
