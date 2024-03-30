package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.location.WaMapView;

/* renamed from: X.6jU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C139256jU implements AnonymousClass7eQ {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C139256jU(LatLng latLng, String str) {
        this.A00 = latLng;
        this.A01 = str;
    }

    public final void BaR(C139266jV r6) {
        C114635hZ A012;
        LatLng latLng = this.A00;
        String str = this.A01;
        if (WaMapView.A02 == null) {
            if (AnonymousClass6UY.A01 == null) {
                A012 = null;
            } else {
                A012 = AnonymousClass6UY.A01(new C163157pk(1), AnonymousClass000.A0r("resource_", AnonymousClass000.A0u(), R.drawable.ic_map_pin));
            }
            WaMapView.A02 = A012;
        }
        C130516Lj r1 = new C130516Lj();
        r1.A01 = C134976bv.A02(latLng);
        r1.A00 = WaMapView.A02;
        r1.A03 = str;
        r6.A05();
        C97634q1 r0 = new C97634q1(r6, r1);
        r6.A0B(r0);
        r0.A0D = r6;
    }
}
