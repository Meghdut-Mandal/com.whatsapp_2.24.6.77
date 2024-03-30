package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.6UP  reason: invalid class name */
public abstract class AnonymousClass6UP {
    public static ICameraUpdateFactoryDelegate A00;

    public static C115065iH A00(CameraPosition cameraPosition) {
        AnonymousClass006.A02(cameraPosition, "cameraPosition must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            AnonymousClass006.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C133816a2 r2 = (C133816a2) iCameraUpdateFactoryDelegate;
            Parcel A002 = C133816a2.A00(r2);
            AnonymousClass6UO.A01(A002, cameraPosition);
            return new C115065iH(C133816a2.A01(A002, r2, 7));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public static C115065iH A01(LatLng latLng) {
        AnonymousClass006.A02(latLng, "latLng must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            AnonymousClass006.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C133816a2 r2 = (C133816a2) iCameraUpdateFactoryDelegate;
            Parcel A002 = C133816a2.A00(r2);
            AnonymousClass6UO.A01(A002, latLng);
            return new C115065iH(C133816a2.A01(A002, r2, 8));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public static C115065iH A02(LatLng latLng, float f) {
        AnonymousClass006.A02(latLng, "latLng must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            AnonymousClass006.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C133816a2 r2 = (C133816a2) iCameraUpdateFactoryDelegate;
            Parcel A002 = C133816a2.A00(r2);
            AnonymousClass6UO.A01(A002, latLng);
            A002.writeFloat(f);
            return new C115065iH(C133816a2.A01(A002, r2, 9));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public static C115065iH A03(LatLngBounds latLngBounds, int i) {
        AnonymousClass006.A02(latLngBounds, "bounds must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            AnonymousClass006.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C133816a2 r2 = (C133816a2) iCameraUpdateFactoryDelegate;
            Parcel A002 = C133816a2.A00(r2);
            AnonymousClass6UO.A01(A002, latLngBounds);
            A002.writeInt(i);
            return new C115065iH(C133816a2.A01(A002, r2, 10));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }
}
