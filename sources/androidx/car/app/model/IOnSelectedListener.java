package androidx.car.app.model;

import X.C165567td;
import X.C165577te;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IOnSelectedListener extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.IOnSelectedListener";

    public class Default implements IOnSelectedListener {
        public IBinder asBinder() {
            return null;
        }

        public void onSelected(int i, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IOnSelectedListener {
        public static final int TRANSACTION_onSelected = 2;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IOnSelectedListener.DESCRIPTOR);
                    if (i == 2) {
                        onSelected(parcel.readInt(), C165577te.A0K(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IOnSelectedListener.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IOnSelectedListener {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IOnSelectedListener.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onSelected(int i, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnSelectedListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 2);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IOnSelectedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnSelectedListener.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOnSelectedListener)) {
                return new Proxy(iBinder);
            }
            return (IOnSelectedListener) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, IOnSelectedListener.DESCRIPTOR);
        }
    }

    void onSelected(int i, IOnDoneCallback iOnDoneCallback);
}
