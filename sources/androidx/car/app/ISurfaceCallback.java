package androidx.car.app;

import X.C134946bs;
import X.C165567td;
import X.C165577te;
import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ISurfaceCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.ISurfaceCallback";

    public class Default implements ISurfaceCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onClick(float f, float f2) {
        }

        public void onFling(float f, float f2) {
        }

        public void onScale(float f, float f2, float f3) {
        }

        public void onScroll(float f, float f2) {
        }

        public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }

        public void onSurfaceAvailable(C134946bs r1, IOnDoneCallback iOnDoneCallback) {
        }

        public void onSurfaceDestroyed(C134946bs r1, IOnDoneCallback iOnDoneCallback) {
        }

        public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements ISurfaceCallback {
        public static final int TRANSACTION_onClick = 9;
        public static final int TRANSACTION_onFling = 7;
        public static final int TRANSACTION_onScale = 8;
        public static final int TRANSACTION_onScroll = 6;
        public static final int TRANSACTION_onStableAreaChanged = 4;
        public static final int TRANSACTION_onSurfaceAvailable = 2;
        public static final int TRANSACTION_onSurfaceDestroyed = 5;
        public static final int TRANSACTION_onVisibleAreaChanged = 3;

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(ISurfaceCallback.DESCRIPTOR);
                    switch (i) {
                        case 2:
                            onSurfaceAvailable((C134946bs) C165567td.A0R(parcel, C134946bs.CREATOR), C165577te.A0K(parcel));
                            return true;
                        case 3:
                            onVisibleAreaChanged((Rect) C165567td.A0R(parcel, Rect.CREATOR), C165577te.A0K(parcel));
                            return true;
                        case 4:
                            onStableAreaChanged((Rect) C165567td.A0R(parcel, Rect.CREATOR), C165577te.A0K(parcel));
                            return true;
                        case 5:
                            onSurfaceDestroyed((C134946bs) C165567td.A0R(parcel, C134946bs.CREATOR), C165577te.A0K(parcel));
                            return true;
                        case 6:
                            onScroll(parcel.readFloat(), parcel.readFloat());
                            return true;
                        case 7:
                            onFling(parcel.readFloat(), parcel.readFloat());
                            return true;
                        case 8:
                            onScale(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                            return true;
                        case 9:
                            onClick(parcel.readFloat(), parcel.readFloat());
                            return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(ISurfaceCallback.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements ISurfaceCallback {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return ISurfaceCallback.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onClick(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    C165567td.A0l(this.mRemote, obtain, 9);
                } finally {
                    obtain.recycle();
                }
            }

            public void onFling(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    C165567td.A0l(this.mRemote, obtain, 7);
                } finally {
                    obtain.recycle();
                }
            }

            public void onScale(float f, float f2, float f3) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    C165567td.A0l(this.mRemote, obtain, 8);
                } finally {
                    obtain.recycle();
                }
            }

            public void onScroll(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    C165567td.A0l(this.mRemote, obtain, 6);
                } finally {
                    obtain.recycle();
                }
            }

            public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    if (rect != null) {
                        obtain.writeInt(1);
                        rect.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 4);
                } finally {
                    obtain.recycle();
                }
            }

            public void onSurfaceAvailable(C134946bs r4, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    if (r4 != null) {
                        obtain.writeInt(1);
                        r4.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 2);
                } finally {
                    obtain.recycle();
                }
            }

            public void onSurfaceDestroyed(C134946bs r4, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    if (r4 != null) {
                        obtain.writeInt(1);
                        r4.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 5);
                } finally {
                    obtain.recycle();
                }
            }

            public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    if (rect != null) {
                        obtain.writeInt(1);
                        rect.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    C165567td.A0l(this.mRemote, obtain, 3);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static ISurfaceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISurfaceCallback.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISurfaceCallback)) {
                return new Proxy(iBinder);
            }
            return (ISurfaceCallback) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, ISurfaceCallback.DESCRIPTOR);
        }
    }

    void onClick(float f, float f2);

    void onFling(float f, float f2);

    void onScale(float f, float f2, float f3);

    void onScroll(float f, float f2);

    void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    void onSurfaceAvailable(C134946bs r1, IOnDoneCallback iOnDoneCallback);

    void onSurfaceDestroyed(C134946bs r1, IOnDoneCallback iOnDoneCallback);

    void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);
}
