package X;

import android.graphics.Point;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.6Nv  reason: invalid class name and case insensitive filesystem */
public class C131126Nv {
    public AnonymousClass6WY A00;
    public AnonymousClass68Y A01;

    public Point A00(LatLng latLng) {
        AnonymousClass68Y r0 = this.A01;
        if (r0 != null) {
            return r0.A00(latLng);
        }
        return this.A00.A04(C134976bv.A02(latLng));
    }

    public C131126Nv(AnonymousClass68Y r4) {
        this.A01 = r4;
        r4.A00(new LatLng(0.0d, 0.0d));
    }

    public C131126Nv(AnonymousClass6WY r4) {
        this.A00 = r4;
        r4.A04(new C134976bv(0.0d, 0.0d));
    }
}
