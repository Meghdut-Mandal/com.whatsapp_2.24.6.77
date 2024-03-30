package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkLinkInfoResponse;
import com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback;

/* renamed from: X.7ur  reason: invalid class name and case insensitive filesystem */
public abstract class C165997ur extends Binder implements IAppLinkLinkInfoResponseCallback {
    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback");
                if (i == 2) {
                    Bf4((AppLinkLinkInfoResponse) C165567td.A0R(parcel, AppLinkLinkInfoResponse.CREATOR));
                    return true;
                } else if (i == 3) {
                    BWa(parcel.readInt(), parcel.readString());
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public C165997ur() {
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback");
    }
}
