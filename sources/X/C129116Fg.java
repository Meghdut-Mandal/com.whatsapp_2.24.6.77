package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.6Fg  reason: invalid class name and case insensitive filesystem */
public final class C129116Fg {
    public final C161377me A00;

    public LatLng A00() {
        Parcelable parcelable;
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A02 = r2.A02(4, C133816a2.A00(r2));
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

    public Object A01() {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            return AnonymousClass0LR.A00(C133816a2.A01(C133816a2.A00(r2), r2, 30));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public void A02() {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            r2.A03(12, C133816a2.A00(r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public void A03() {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            r2.A03(11, C133816a2.A00(r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public void A04(C115075iI r4) {
        C133816a2 r2;
        Parcel parcel;
        if (r4 == null) {
            try {
                r2 = (C133816a2) this.A00;
                parcel = C133816a2.A00(r2);
                parcel.writeStrongBinder((IBinder) null);
            } catch (RemoteException e) {
                throw AnonymousClass78K.A00(e);
            }
        } else {
            IObjectWrapper iObjectWrapper = r4.A00;
            r2 = (C133816a2) this.A00;
            parcel = AnonymousClass6UO.A00(iObjectWrapper, r2);
        }
        r2.A03(18, parcel);
    }

    public void A05(LatLng latLng) {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A002 = C133816a2.A00(r2);
            AnonymousClass6UO.A01(A002, latLng);
            r2.A03(3, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public void A06(Object obj) {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            r2.A03(29, AnonymousClass6UO.A00(new AnonymousClass0LR(obj), r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public void A07(String str) {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A002 = C133816a2.A00(r2);
            A002.writeString(str);
            r2.A03(5, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public void A08(boolean z) {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A002 = C133816a2.A00(r2);
            A002.writeInt(z ? 1 : 0);
            r2.A03(14, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public boolean A09() {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A02 = r2.A02(15, C133816a2.A00(r2));
            boolean A1P = AnonymousClass000.A1P(A02.readInt());
            A02.recycle();
            return A1P;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C129116Fg)) {
            return false;
        }
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A02 = r2.A02(16, AnonymousClass6UO.A00(((C129116Fg) obj).A00, r2));
            boolean A1P = AnonymousClass000.A1P(A02.readInt());
            A02.recycle();
            return A1P;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public int hashCode() {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A02 = r2.A02(17, C133816a2.A00(r2));
            int readInt = A02.readInt();
            A02.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public C129116Fg(C161377me r1) {
        AnonymousClass006.A01(r1);
        this.A00 = r1;
    }
}
