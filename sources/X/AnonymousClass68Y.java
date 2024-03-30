package X;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.68Y  reason: invalid class name */
public final class AnonymousClass68Y {
    public final IProjectionDelegate A00;

    public AnonymousClass68Y(IProjectionDelegate iProjectionDelegate) {
        this.A00 = iProjectionDelegate;
    }

    public C98844s7 A02() {
        Parcelable parcelable;
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A02 = r2.A02(3, C133816a2.A00(r2));
            Parcelable.Creator creator = C98844s7.CREATOR;
            if (A02.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A02);
            }
            C98844s7 r0 = (C98844s7) parcelable;
            A02.recycle();
            return r0;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public Point A00(LatLng latLng) {
        AnonymousClass006.A01(latLng);
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A002 = C133816a2.A00(r2);
            AnonymousClass6UO.A01(A002, latLng);
            return (Point) AnonymousClass0LR.A00(C133816a2.A01(A002, r2, 2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public LatLng A01(Point point) {
        Parcelable parcelable;
        AnonymousClass006.A01(point);
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A02 = r2.A02(1, AnonymousClass6UO.A00(new AnonymousClass0LR(point), r2));
            Parcelable.Creator creator = LatLng.CREATOR;
            if (A02.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A02);
            }
            LatLng latLng = (LatLng) parcelable;
            A02.recycle();
            return latLng;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }
}
