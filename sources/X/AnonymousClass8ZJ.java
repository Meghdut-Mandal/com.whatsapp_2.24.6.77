package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.8ZJ  reason: invalid class name */
public abstract class AnonymousClass8ZJ extends AnonymousClass2ID {
    public boolean A00;

    public void A16() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass2IQ r5 = (AnonymousClass2IQ) this;
            C27861Qc r6 = (C27861Qc) C175108Zr.A0l(this);
            C18800tq r4 = r6.A0M;
            C27111My A0m = C175108Zr.A0m(r4, r6, r5);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, r5);
            C175108Zr.A11(r4, r5);
            C175108Zr.A14(r4, r5, C165597tg.A0h(r4));
            C175108Zr.A12(r4, r5);
            C175108Zr.A10(r4, r2, r5, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, r5);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, r5, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, r5, C175108Zr.A0o(r4, r5));
            C175108Zr.A0w(A0m, r4, r2, r5);
            C175108Zr.A0z(r4, r2, r6, r5, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, r6, r5);
            C175108Zr.A0u(A0k, r4, r2, r6, r5);
            A0Y(A0k, r4, r2, r5);
        }
    }

    public AnonymousClass8ZJ(Context context, C89004Uw r2, AnonymousClass3T1 r3) {
        super(context, r2, r3);
        A16();
    }

    public static void A0U(View view, AnonymousClass2IS r4) {
        Context context = view.getContext();
        AnonymousClass00C.A0D(context, 0);
        Drawable A002 = AnonymousClass00E.A00(context, R.drawable.balloon_centered_normal);
        C18740tg.A06(A002);
        AnonymousClass00C.A08(A002);
        view.setBackground(A002);
        r4.A0N = false;
    }

    public static void A0Y(C19460v5 r1, C18800tq r2, C18830tt r3, AnonymousClass2IQ r4) {
        r4.A02 = (C20830yE) r2.A9E.get();
        r4.A05 = (AnonymousClass1ST) r2.A4i.get();
        r4.A06 = (AnonymousClass3P3) r3.A9c.get();
        r4.A04 = (AnonymousClass1Y4) r2.AZK.get();
        r4.A03 = (C62163Fa) r3.A5p.get();
        r4.A00 = r1;
        r4.A07 = (AnonymousClass1EM) r2.A3l.get();
    }

    public static void A0Z(C18800tq r1, C18830tt r2, C27861Qc r3, AnonymousClass2IO r4) {
        AnonymousClass3T8.A00((C20690y0) r1.A6r.get(), r4);
        AnonymousClass3T8.A03(r4, (AnonymousClass1SU) r1.AQu.get());
        AnonymousClass3T8.A02(r4, (AnonymousClass1D4) r1.ABL.get());
        AnonymousClass3T8.A01(C27861Qc.A0A(r3), r4);
        AnonymousClass3T8.A04(r4, (C62683Hc) r2.A4H.get());
    }

    public static void A0b(C18800tq r1, C27861Qc r2, AnonymousClass2I5 r3) {
        r3.A00 = C27861Qc.A0A(r2);
        r3.A01 = (AnonymousClass1TA) r1.A7h.get();
    }

    public static void A0g(C18800tq r0, AnonymousClass2IB r1) {
        r1.A0A = (AnonymousClass1D1) r0.APG.get();
    }
}
