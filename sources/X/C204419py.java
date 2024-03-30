package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkLinkInfoRequest;
import com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback;

/* renamed from: X.9py  reason: invalid class name and case insensitive filesystem */
public class C204419py implements IInterface {
    public IBinder A00;

    public C204419py(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public void A00(AppLinkLinkInfoRequest appLinkLinkInfoRequest, IAppLinkLinkInfoResponseCallback iAppLinkLinkInfoResponseCallback) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            boolean A1Q = C165597tg.A1Q(obtain, appLinkLinkInfoRequest);
            obtain.writeStrongInterface(iAppLinkLinkInfoResponseCallback);
            this.A00.transact(4, obtain, obtain2, A1Q ? 1 : 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
