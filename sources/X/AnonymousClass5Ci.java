package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.json.JSONObject;

/* renamed from: X.5Ci  reason: invalid class name */
public final class AnonymousClass5Ci extends C129196Ft {
    public int A00 = 1;
    public Bitmap A01;
    public PointF A02;
    public C131646Px A03;
    public AnonymousClass6L5 A04;
    public boolean A05;
    public final float A06;

    public void A0L(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        super.A0L(jSONObject);
        C131646Px r0 = this.A03;
        if (r0 != null) {
            r0.A07(jSONObject);
        }
    }

    public final void A0P(AnonymousClass6L5 r3) {
        C104975Ct r1;
        this.A04 = r3;
        C131646Px r12 = this.A03;
        if ((r12 instanceof C104975Ct) && (r1 = (C104975Ct) r12) != null) {
            r1.A00 = r3;
        }
    }

    public AnonymousClass5Ci(float f) {
        this.A06 = f;
        C36421kH.A0q(this.A01);
    }
}
