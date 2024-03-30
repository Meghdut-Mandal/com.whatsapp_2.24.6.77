package X;

import android.content.Context;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.WaMapView;

/* renamed from: X.5BG  reason: invalid class name */
public class AnonymousClass5BG extends WaMapView {
    public C1267965o A00;
    public Integer A01;

    public void A01(LatLng latLng, C98864s9 r3, AnonymousClass2XH r4) {
        this.A01 = null;
        super.A01(latLng, r3, r4);
    }

    public void A02(AnonymousClass2XH r2, C46902br r3, boolean z) {
        this.A01 = null;
        super.A02(r2, r3, z);
    }

    public void A03(AnonymousClass2XH r2, C46912bs r3) {
        this.A01 = null;
        super.A03(r2, r3);
    }

    public void A04(LatLng latLng, AnonymousClass2XH r3, Integer num) {
        this.A01 = num;
        super.A01(latLng, (C98864s9) null, r3);
    }

    public void setupGoogleMap(C92744eX r7, LatLng latLng, C98864s9 r9) {
        r7.A07(new C165417tO(r7, latLng, r9, this, 1));
    }

    public AnonymousClass5BG(Context context) {
        super(context);
    }
}
