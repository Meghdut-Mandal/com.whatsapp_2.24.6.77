package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.location.WaMapView;

/* renamed from: X.6nJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141476nJ implements AnonymousClass7f7 {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C141476nJ(LatLng latLng, String str) {
        this.A00 = latLng;
        this.A01 = str;
    }

    public final void BaS(C129186Fs r6) {
        LatLng latLng = this.A00;
        String str = this.A01;
        C115075iI r1 = WaMapView.A03;
        if (r1 == null) {
            try {
                C161357mc r2 = C112965ek.A00;
                AnonymousClass006.A02(r2, "IBitmapDescriptorFactory is not initialized");
                C133816a2 r22 = (C133816a2) r2;
                Parcel A002 = C133816a2.A00(r22);
                A002.writeInt(R.drawable.ic_map_pin);
                r1 = new C115075iI(C133816a2.A01(A002, r22, 1));
                WaMapView.A03 = r1;
            } catch (RemoteException e) {
                throw AnonymousClass78K.A00(e);
            }
        }
        C98884sB r0 = new C98884sB();
        r0.A08 = latLng;
        r0.A07 = r1;
        r0.A09 = str;
        r6.A06();
        r6.A03(r0);
    }
}
