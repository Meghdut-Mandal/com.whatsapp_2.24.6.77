package X;

import android.graphics.Color;
import android.graphics.Paint;

/* renamed from: X.9y8  reason: invalid class name and case insensitive filesystem */
public class C208369y8 implements C22853Ax3 {
    public boolean A00 = true;
    public final C196189Yb A01;
    public final C196189Yb A02;
    public final C196189Yb A03;
    public final C196189Yb A04;
    public final C22853Ax3 A05;
    public final C196189Yb A06;

    public void BkC() {
        this.A00 = true;
        this.A05.BkC();
    }

    public void A00(Paint paint) {
        if (this.A00) {
            this.A00 = false;
            double A012 = ((double) C196189Yb.A01(this.A02)) * 0.017453292519943295d;
            float A013 = C196189Yb.A01(this.A03);
            float sin = ((float) Math.sin(A012)) * A013;
            float cos = ((float) Math.cos(A012 + 3.141592653589793d)) * A013;
            int A0I = AnonymousClass000.A0I(this.A01.A05());
            paint.setShadowLayer(C196189Yb.A01(this.A04), sin, cos, Color.argb(Math.round(C196189Yb.A01(this.A06)), Color.red(A0I), Color.green(A0I), Color.blue(A0I)));
        }
    }

    public void A01(C199409fG r3) {
        AnonymousClass81L r0;
        C196189Yb r1 = this.A06;
        if (r3 == null) {
            r0 = null;
        } else {
            r0 = new AnonymousClass81L(this, r3);
        }
        r1.A0A(r0);
    }

    public C208369y8(C22853Ax3 ax3, C208409yC r4, AnonymousClass9M9 r5) {
        this.A05 = ax3;
        C1685380z r0 = new C1685380z(r5.A00.A00);
        this.A01 = r0;
        r0.A09(this);
        r4.A0C(r0);
        AnonymousClass812 A002 = C1684680s.A00(r5.A03);
        this.A06 = A002;
        A002.A09(this);
        r4.A0C(A002);
        AnonymousClass812 A003 = C1684680s.A00(r5.A01);
        this.A02 = A003;
        A003.A09(this);
        r4.A0C(A003);
        AnonymousClass812 A004 = C1684680s.A00(r5.A02);
        this.A03 = A004;
        A004.A09(this);
        r4.A0C(A004);
        AnonymousClass812 A005 = C1684680s.A00(r5.A04);
        this.A04 = A005;
        A005.A09(this);
        r4.A0C(A005);
    }
}
