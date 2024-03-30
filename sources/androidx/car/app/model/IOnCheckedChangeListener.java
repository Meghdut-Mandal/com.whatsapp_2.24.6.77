package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165577te;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IOnCheckedChangeListener extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.IOnCheckedChangeListener";

    public class Default implements IOnCheckedChangeListener {
        public IBinder asBinder() {
            return null;
        }

        public void onCheckedChange(boolean z, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IOnCheckedChangeListener {
        public static final int TRANSACTION_onCheckedChange = 2;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IOnCheckedChangeListener.DESCRIPTOR);
                    if (i == 2) {
                        onCheckedChange(AnonymousClass000.A1P(parcel.readInt()), C165577te.A0K(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IOnCheckedChangeListener.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IOnCheckedChangeListener {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IOnCheckedChangeListener.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onCheckedChange(boolean z, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnCheckedChangeListener.DESCRIPTOR);
                    obtain.writeInt(AnonymousClass000.A1P(z ? 1 : 0) ? 1 : 0);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IOnCheckedChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnCheckedChangeListener.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOnCheckedChangeListener)) {
                return new Proxy(iBinder);
            }
            return (IOnCheckedChangeListener) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, IOnCheckedChangeListener.DESCRIPTOR);
        }
    }

    void onCheckedChange(boolean z, IOnDoneCallback iOnDoneCallback);
}
