package androidx.car.app;

import X.C134946bs;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.ICarHost;

public interface ICarApp extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.ICarApp";

    public class Default implements ICarApp {
        public IBinder asBinder() {
            return null;
        }

        public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        }

        public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        }

        public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        }

        public void onHandshakeCompleted(C134946bs r1, IOnDoneCallback iOnDoneCallback) {
        }

        public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements ICarApp {
        public static final int TRANSACTION_getAppInfo = 10;
        public static final int TRANSACTION_getManager = 9;
        public static final int TRANSACTION_onAppCreate = 2;
        public static final int TRANSACTION_onAppPause = 5;
        public static final int TRANSACTION_onAppResume = 4;
        public static final int TRANSACTION_onAppStart = 3;
        public static final int TRANSACTION_onAppStop = 6;
        public static final int TRANSACTION_onConfigurationChanged = 8;
        public static final int TRANSACTION_onHandshakeCompleted = 11;
        public static final int TRANSACTION_onNewIntent = 7;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(ICarApp.DESCRIPTOR);
                    switch (i) {
                        case 2:
                            onAppCreate(ICarHost.Stub.asInterface(parcel.readStrongBinder()), (Intent) C165567td.A0R(parcel, Intent.CREATOR), (Configuration) C165567td.A0R(parcel, Configuration.CREATOR), C165577te.A0K(parcel));
                            return true;
                        case 3:
                            onAppStart(C165577te.A0K(parcel));
                            return true;
                        case 4:
                            onAppResume(C165577te.A0K(parcel));
                            return true;
                        case 5:
                            onAppPause(C165577te.A0K(parcel));
                            return true;
                        case 6:
                            onAppStop(C165577te.A0K(parcel));
                            return true;
                        case 7:
                            onNewIntent((Intent) C165567td.A0R(parcel, Intent.CREATOR), C165577te.A0K(parcel));
                            return true;
                        case 8:
                            onConfigurationChanged((Configuration) C165567td.A0R(parcel, Configuration.CREATOR), C165577te.A0K(parcel));
                            return true;
                        case 9:
                            getManager(parcel.readString(), C165577te.A0K(parcel));
                            return true;
                        case 10:
                            getAppInfo(C165577te.A0K(parcel));
                            return true;
                        case 11:
                            onHandshakeCompleted((C134946bs) C165567td.A0R(parcel, C134946bs.CREATOR), C165577te.A0K(parcel));
                            return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(ICarApp.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements ICarApp {
            public IBinder mRemote;

            public static void A00(Parcel parcel, Parcelable parcelable) {
                if (parcelable != null) {
                    parcel.writeInt(1);
                    parcelable.writeToParcel(parcel, 0);
                    return;
                }
                parcel.writeInt(0);
            }

            public String getInterfaceDescriptor() {
                return ICarApp.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 10);
                } finally {
                    obtain.recycle();
                }
            }

            public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    C165607th.A19(iOnDoneCallback, obtain, ICarApp.DESCRIPTOR, str);
                    C165567td.A0l(this.mRemote, obtain, 9);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iCarHost);
                    A00(obtain, intent);
                    A00(obtain, configuration);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 2);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppPause(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 5);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppResume(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 4);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppStart(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 3);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppStop(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 6);
                } finally {
                    obtain.recycle();
                }
            }

            public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    A00(obtain, configuration);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 8);
                } finally {
                    obtain.recycle();
                }
            }

            public void onHandshakeCompleted(C134946bs r4, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    A00(obtain, r4);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 11);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    A00(obtain, intent);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 7);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static ICarApp asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICarApp.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICarApp)) {
                return new Proxy(iBinder);
            }
            return (ICarApp) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, ICarApp.DESCRIPTOR);
        }
    }

    void getAppInfo(IOnDoneCallback iOnDoneCallback);

    void getManager(String str, IOnDoneCallback iOnDoneCallback);

    void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback);

    void onAppPause(IOnDoneCallback iOnDoneCallback);

    void onAppResume(IOnDoneCallback iOnDoneCallback);

    void onAppStart(IOnDoneCallback iOnDoneCallback);

    void onAppStop(IOnDoneCallback iOnDoneCallback);

    void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback);

    void onHandshakeCompleted(C134946bs r1, IOnDoneCallback iOnDoneCallback);

    void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback);
}
