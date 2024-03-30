package androidx.car.app.suggestion;

import X.C134946bs;
import X.C165577te;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ISuggestionHost extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.suggestion.ISuggestionHost";

    public class Default implements ISuggestionHost {
        public IBinder asBinder() {
            return null;
        }

        public void updateSuggestions(C134946bs r1) {
        }
    }

    public abstract class Stub extends Binder implements ISuggestionHost {
        public static final int TRANSACTION_updateSuggestions = 2;

        public abstract IBinder asBinder();

        public class Proxy implements ISuggestionHost {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return ISuggestionHost.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void updateSuggestions(C134946bs r6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.mRemote.transact(2, obtain, obtain2, C165577te.A1X(obtain, r6, ISuggestionHost.DESCRIPTOR) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ISuggestionHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISuggestionHost.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISuggestionHost)) {
                return new Proxy(iBinder);
            }
            return (ISuggestionHost) queryLocalInterface;
        }

        public Stub() {
            throw null;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw null;
        }
    }

    void updateSuggestions(C134946bs r1);
}
