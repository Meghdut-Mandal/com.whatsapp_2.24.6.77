package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.C165577te;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IPanModeListener extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.navigation.model.IPanModeListener";

    public class Default implements IPanModeListener {
        public IBinder asBinder() {
            return null;
        }

        public void onPanModeChanged(boolean z, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IPanModeListener {
        public static final int TRANSACTION_onPanModeChanged = 2;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IPanModeListener.DESCRIPTOR);
                    if (i == 2) {
                        onPanModeChanged(AnonymousClass000.A1P(parcel.readInt()), C165577te.A0K(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IPanModeListener.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IPanModeListener {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IPanModeListener.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onPanModeChanged(boolean z, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPanModeListener.DESCRIPTOR);
                    obtain.writeInt(AnonymousClass000.A1P(z ? 1 : 0) ? 1 : 0);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IPanModeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPanModeListener.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IPanModeListener)) {
                return new Proxy(iBinder);
            }
            return (IPanModeListener) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, IPanModeListener.DESCRIPTOR);
        }
    }

    void onPanModeChanged(boolean z, IOnDoneCallback iOnDoneCallback);
}
