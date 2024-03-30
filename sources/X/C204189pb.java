package X;

import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.9pb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204189pb implements Camera.AutoFocusCallback {
    public final /* synthetic */ Point A00;
    public final /* synthetic */ C157797eh A01;
    public final /* synthetic */ C198999eX A02;

    public /* synthetic */ C204189pb(Point point, C157797eh r2, C198999eX r3) {
        this.A02 = r3;
        this.A00 = point;
        this.A01 = r2;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        Integer num;
        C198999eX r4 = this.A02;
        Point point = this.A00;
        C157797eh r2 = this.A01;
        r4.A07 = z;
        r4.A08 = false;
        if (r4.A0A) {
            r4.A04 = false;
        }
        if (z) {
            num = C023109s.A0G;
        } else {
            num = C023109s.A0R;
        }
        C198999eX.A00(point, r4.A02, r4, num);
        C198999eX.A00(point, r2, r4, num);
    }
}
