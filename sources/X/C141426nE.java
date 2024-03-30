package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.IMapViewDelegate;

/* renamed from: X.6nE  reason: invalid class name and case insensitive filesystem */
public final class C141426nE implements C17240qx {
    public View A00;
    public final IMapViewDelegate A01;
    public final ViewGroup A02;

    public final void A00(AnonymousClass7f7 r4) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(9, AnonymousClass6UO.A00(new C99044sX(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void BfR() {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(3, C133816a2.A00(r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void onLowMemory() {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(6, C133816a2.A00(r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public C141426nE(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
        AnonymousClass006.A01(iMapViewDelegate);
        this.A01 = iMapViewDelegate;
        AnonymousClass006.A01(viewGroup);
        this.A02 = viewGroup;
    }

    public final void BUp(Bundle bundle) {
        try {
            Bundle A07 = AnonymousClass001.A07();
            AnonymousClass6U8.A01(bundle, A07);
            C133816a2 r3 = (C133816a2) this.A01;
            Parcel obtain = Parcel.obtain();
            String str = r3.A00;
            obtain.writeInterfaceToken(str);
            AnonymousClass6UO.A01(obtain, A07);
            r3.A03(2, obtain);
            AnonymousClass6U8.A01(A07, bundle);
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(str);
            this.A00 = (View) AnonymousClass0LR.A00(C133816a2.A01(obtain2, r3, 8));
            ViewGroup viewGroup = this.A02;
            viewGroup.removeAllViews();
            viewGroup.addView(this.A00);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }
}
