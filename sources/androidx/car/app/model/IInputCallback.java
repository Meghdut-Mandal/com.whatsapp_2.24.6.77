package androidx.car.app.model;

import X.C165567td;
import X.C165577te;
import X.C165607th;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IInputCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.IInputCallback";

    public class Default implements IInputCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
        }

        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IInputCallback {
        public static final int TRANSACTION_onInputSubmitted = 3;
        public static final int TRANSACTION_onInputTextChanged = 2;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IInputCallback.DESCRIPTOR);
                    if (i == 2) {
                        onInputTextChanged(parcel.readString(), C165577te.A0K(parcel));
                        return true;
                    } else if (i == 3) {
                        onInputSubmitted(parcel.readString(), C165577te.A0K(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IInputCallback.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IInputCallback {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IInputCallback.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    C165607th.A19(iOnDoneCallback, obtain, IInputCallback.DESCRIPTOR, str);
                    C165567td.A0l(this.mRemote, obtain, 3);
                } finally {
                    obtain.recycle();
                }
            }

            public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    C165607th.A19(iOnDoneCallback, obtain, IInputCallback.DESCRIPTOR, str);
                    C165567td.A0l(this.mRemote, obtain, 2);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IInputCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IInputCallback.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IInputCallback)) {
                return new Proxy(iBinder);
            }
            return (IInputCallback) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, IInputCallback.DESCRIPTOR);
        }
    }

    void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback);

    void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback);
}
