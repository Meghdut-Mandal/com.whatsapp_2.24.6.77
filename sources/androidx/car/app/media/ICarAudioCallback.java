package androidx.car.app.media;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ICarAudioCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.media.ICarAudioCallback";

    public class Default implements ICarAudioCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onStopRecording() {
        }
    }

    public abstract class Stub extends Binder implements ICarAudioCallback {
        public static final int TRANSACTION_onStopRecording = 1;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(ICarAudioCallback.DESCRIPTOR);
                    if (i == 1) {
                        onStopRecording();
                        throw AnonymousClass000.A0j();
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(ICarAudioCallback.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements ICarAudioCallback {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return ICarAudioCallback.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onStopRecording() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarAudioCallback.DESCRIPTOR);
                    AnonymousClass000.A15(this.mRemote, obtain, obtain2, 1);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ICarAudioCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICarAudioCallback.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICarAudioCallback)) {
                return new Proxy(iBinder);
            }
            return (ICarAudioCallback) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, ICarAudioCallback.DESCRIPTOR);
        }
    }

    void onStopRecording();
}
