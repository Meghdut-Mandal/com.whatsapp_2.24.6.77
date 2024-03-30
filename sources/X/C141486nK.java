package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.WaMapView;

/* renamed from: X.6nK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141486nK implements AnonymousClass7f7 {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ C98864s9 A01;
    public final /* synthetic */ WaMapView A02;

    public /* synthetic */ C141486nK(LatLng latLng, C98864s9 r2, WaMapView waMapView) {
        this.A02 = waMapView;
        this.A00 = latLng;
        this.A01 = r2;
    }

    public final void BaS(C129186Fs r5) {
        WaMapView waMapView = this.A02;
        waMapView.setupGoogleMap(waMapView.A01, this.A00, this.A01);
    }
}
