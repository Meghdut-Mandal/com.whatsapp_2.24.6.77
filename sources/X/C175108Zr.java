package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;

/* renamed from: X.8Zr  reason: invalid class name and case insensitive filesystem */
public abstract class C175108Zr extends AnonymousClass2IS {
    public boolean A00;

    public static int A0i(AnonymousClass2IS r0, DynamicButtonsLayout dynamicButtonsLayout, int i) {
        return i + dynamicButtonsLayout.A03(r0.A0b.getMeasuredWidth());
    }

    public static C19470v6 A0k(C27111My r1, C18800tq r2, C18830tt r3, AnonymousClass2IR r4, AnonymousClass19I r5) {
        r4.A1Y = r5;
        r4.A1g = (AnonymousClass1TF) r2.AV5.get();
        r4.A1R = (AnonymousClass1EL) r2.A8L.get();
        r4.A17 = C27111My.A1O(r1);
        r4.A1b = r2.Azb();
        r4.A1G = (AnonymousClass1VZ) r2.A6B.get();
        r4.A0q = (C33751fs) r3.A17.get();
        C19470v6 r12 = C19470v6.A00;
        r4.A0N = r12;
        r4.A10 = C27861Qc.A0P();
        r4.A1y = (AnonymousClass1SV) r2.A5I.get();
        r4.A1e = (AnonymousClass3EA) r3.AAR.get();
        r4.A0a = C18800tq.A1I(r2);
        r4.A0b = (C29591Xf) r2.A3G.get();
        r4.A25 = C18840tu.A00(r2.A0x);
        r4.A1L = (C27751Pr) r2.A64.get();
        return r12;
    }

    public static C27111My A0m(C18800tq r2, C27861Qc r3, AnonymousClass2IS r4) {
        r4.A0G = (C20810yC) r2.A02.get();
        r4.A0L = (AnonymousClass1X7) r2.A4o.get();
        r4.A07 = (C19700wN) r2.A2U.get();
        r4.A0F = (C220412q) r2.A1l.get();
        r4.A0I = (AnonymousClass2XH) r2.A4W.get();
        C27111My r1 = r3.A0L;
        r4.A09 = r1.A0R();
        r4.A0D = (C21060yb) r2.A8W.get();
        r4.A0E = (C18820ts) r2.A9X.get();
        r4.A0M = C18800tq.ALZ(r2);
        return r1;
    }

    public static C26171Jd A0o(C18800tq r1, AnonymousClass2IR r2) {
        r2.A2B = C18840tu.A00(r1.A5a);
        r2.A0d = (C29461Ws) r1.A1S.get();
        return (C26171Jd) r1.A4s.get();
    }

    public static void A0s(View view, AnonymousClass2IS r6) {
        View view2 = r6.A0b;
        view.layout(view2.getLeft(), view2.getBottom(), view2.getRight(), view.getMeasuredHeight() + view2.getBottom());
    }

    public static void A0v(C19460v5 r1, C18800tq r2, C18830tt r3, AnonymousClass2IR r4, C26171Jd r5) {
        r4.A1K = r5;
        r4.A1v = (AnonymousClass1E9) r2.A8c.get();
        r4.A0m = (AnonymousClass185) r2.A8u.get();
        r4.A1B = (C19420v0) r2.A9G.get();
        r4.A1l = (AnonymousClass1BF) r2.A0Q.get();
        r4.A0e = (AnonymousClass9Y1) r2.A1R.get();
        r4.A1r = (AnonymousClass1HA) r2.A84.get();
        r4.A1h = (A8P) r3.AAX.get();
        r4.A1T = (C27251Nm) r2.A4J.get();
        r4.A28 = C18840tu.A00(r2.A2i);
        r4.A1F = (AnonymousClass17X) r2.A3v.get();
        r4.A0K = r1;
        r4.A0s = (AnonymousClass1LL) r2.A2s.get();
    }

    public static void A0z(C18800tq r1, C18830tt r2, C27861Qc r3, AnonymousClass2IR r4, AnonymousClass005 r5) {
        r4.A2E = r5;
        r4.A0t = (C194529Qc) r2.AAr.get();
        r4.A1A = (AnonymousClass17Z) r1.A95.get();
        r4.A2A = C18840tu.A00(r1.A6v);
        r4.A0c = (AnonymousClass9XI) r1.ADM.get();
        r4.A0g = (C199439fJ) r1.A17.get();
        r4.A0j = (AnonymousClass1OF) r1.AP7.get();
        r4.A0o = (C235618y) r1.A15.get();
        r4.A1x = (C32711e4) r2.A2Z.get();
        r4.A1i = (C28441Sr) r1.A1g.get();
        r4.A14 = C27861Qc.A0U(r3);
        r4.A11 = C27861Qc.A0Q(r3);
        r4.A13 = C27861Qc.A0R(r3);
        r4.A15 = C27861Qc.A0V(r3);
        r4.A16 = C27861Qc.A0W(r3);
    }

    public static void A10(C18800tq r1, C18830tt r2, AnonymousClass2IR r3, Object obj) {
        r3.A1f = (AnonymousClass1J1) obj;
        r3.A1p = (C199859g8) r2.ABh.get();
        r3.A0f = (C603337l) r1.Aad.get();
        r3.A1z = (AnonymousClass13J) r1.A6z.get();
        r3.A0n = (AnonymousClass171) r1.A90.get();
        r3.A27 = C18840tu.A00(r1.A10);
        r3.A1q = (AnonymousClass3DP) r1.AGS.get();
        r3.A1H = (C32731e6) r1.A6S.get();
        r3.A26 = C18840tu.A00(r1.A0y);
        r3.A0h = (AnonymousClass1NG) r1.A0v.get();
        r3.A0p = (C21159AAt) r1.A2F.get();
        r3.A0r = (C63193Jc) r1.AEl.get();
    }

    public static void A11(C18800tq r1, AnonymousClass2IR r2) {
        r2.A1U = (AnonymousClass1DU) r1.A4T.get();
        r2.A0W = (C20050ww) r1.A7v.get();
    }

    public static void A12(C18800tq r1, AnonymousClass2IR r2) {
        r2.A0P = (C24801Dv) r1.A0D.get();
        r2.A1Z = (AnonymousClass19A) r1.A4x.get();
        r2.A0l = (AnonymousClass16D) r1.A2A.get();
    }

    public static void A13(C18800tq r1, AnonymousClass2IR r2) {
        r2.A1D = (C20310xM) r1.A2S.get();
        r2.A1t = (AnonymousClass1A1) r1.A3H.get();
        r2.A1Q = (C20350xQ) r1.A3k.get();
    }

    public static void A14(C18800tq r1, AnonymousClass2IR r2, Object obj) {
        r2.A1M = (AnonymousClass1H2) obj;
        r2.A1c = (AnonymousClass1C4) r1.A7e.get();
        r2.A0V = (C21100yf) r1.A7f.get();
        r2.A1u = (AnonymousClass1C6) r1.A7s.get();
        r2.A1J = (AnonymousClass16E) r1.A80.get();
        r2.A0Z = (AnonymousClass1X4) r1.A8h.get();
        r2.A1W = (AnonymousClass1E2) r1.Adc.get();
        r2.A1O = r1.AzV();
        r2.A0S = (C32691e2) r1.A4R.get();
        r2.A1n = (C23871Ae) r1.A0V.get();
        r2.A1V = (AnonymousClass1D5) r1.A4j.get();
        r2.A22 = (AnonymousClass1T2) r1.A9M.get();
    }

    public static boolean A15(AnonymousClass2IR r3) {
        AnonymousClass005 r2 = r3.A25;
        return C66013Ui.A0X(r3.A0j, r3.getFMessage(), r2);
    }

    public void A16() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass2IR r5 = (AnonymousClass2IR) this;
            C27861Qc r6 = (C27861Qc) A0l(this);
            C18800tq r4 = r6.A0M;
            C27111My A0m = A0m(r4, r6, r5);
            C18830tt r2 = r4.A00;
            A0y(r4, r2, r2, r5);
            A11(r4, r5);
            A14(r4, r5, C165597tg.A0h(r4));
            A12(r4, r5);
            A10(r4, r2, r5, A0q(r4));
            A13(r4, r5);
            C19470v6 A0k = A0k(A0m, r4, r2, r5, C165577te.A0U(r4));
            A0v(A0k, r4, r2, r5, A0o(r4, r5));
            A0w(A0m, r4, r2, r5);
            A0z(r4, r2, r6, r5, A0p(r2));
            A0x(A0m, r6, r5);
            A0u(A0k, r4, r2, r6, r5);
        }
    }

    public C175108Zr(Context context, C89004Uw r2, AnonymousClass3T1 r3) {
        super(context, r2, r3);
        A16();
    }

    public static int A0h(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public static Drawable A0j(View view) {
        Drawable A002 = AnonymousClass00E.A00(view.getContext(), R.drawable.ic_ephemeral_v2);
        C18740tg.A06(A002);
        return AnonymousClass3UF.A08(A002, AnonymousClass00F.A00(view.getContext(), R.color.f6nameremoved));
    }

    public static C27851Qb A0l(C37541mm r0) {
        return (C27851Qb) r0.generatedComponent();
    }

    public static C27861Qc A0n(C37541mm r0) {
        return (C27861Qc) ((C27851Qb) r0.generatedComponent());
    }

    public static AnonymousClass005 A0p(C18830tt r0) {
        return C18840tu.A00(r0.ABS);
    }

    public static Object A0q(C18800tq r0) {
        return r0.AV4.get();
    }

    public static void A0r(Context context, TextView textView, AnonymousClass2IR r3) {
        textView.setBackgroundResource(R.drawable.date_balloon);
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        textView.setTextSize(r3.getDividerFontSize());
    }

    public static void A0t(TextView textView, AnonymousClass2IR r2, CharSequence charSequence) {
        textView.setText(r2.A1V(charSequence));
    }

    public static void A0u(C19460v5 r1, C18800tq r2, C18830tt r3, C27861Qc r4, AnonymousClass2IR r5) {
        r5.A0y = C27861Qc.A0B(r4);
        r5.A1o = (AnonymousClass1AW) r2.A4H.get();
        r5.A0M = r1;
        r5.A0O = r1;
        r5.A0z = (AnonymousClass3NN) r3.A9l.get();
        r5.A1P = (C25361Fz) r2.ASg.get();
        r5.A2D = C18840tu.A00(r3.A2u);
        r5.A2C = C18840tu.A00(r2.A5f);
        r5.A29 = C18840tu.A00(r2.AQk);
        r5.A24 = C18840tu.A00(r2.ABe);
        r5.A1S = (AnonymousClass1CF) r2.A8K.get();
        r5.A0J = C19460v5.A01(r2.API.get());
        r5.A1d = (AnonymousClass1JN) r2.AVE.get();
        r5.A23 = C18840tu.A00(r2.A0s);
        r5.A0L = r1;
    }

    public static void A0w(C27111My r1, C18800tq r2, C18830tt r3, AnonymousClass2IR r4) {
        r4.A1I = (AnonymousClass1TV) r2.AWx.get();
        r4.A1k = (C19890wg) r2.A7i.get();
        r4.A0i = (C29911Yl) r2.A4z.get();
        r4.A0k = (C19600wD) r2.A24.get();
        r4.A1m = (AnonymousClass6WF) r1.A04.get();
        r4.A1C = (AnonymousClass1A5) r2.A2K.get();
        r4.A1E = (AnonymousClass1TW) r2.AH4.get();
        r4.A0u = (AnonymousClass31A) r3.AAs.get();
        r4.A1s = (AnonymousClass1YD) r2.Aba.get();
        r4.A1a = (AnonymousClass3O0) r3.A9s.get();
        r4.A1N = (AnonymousClass184) r2.AGb.get();
    }

    public static void A0x(C27111My r0, C27861Qc r1, AnonymousClass2IR r2) {
        r2.A12 = r0.A1M();
        r2.A0Q = (AnonymousClass30L) r1.A08.get();
    }

    public static void A0y(C18800tq r1, C18830tt r2, C18830tt r3, AnonymousClass2IR r4) {
        r4.A0H = r2.A5d();
        r4.A0J = r1.AHt();
        r4.A0C = (AnonymousClass3HC) r3.A6M.get();
        r4.A0A = (C65793Tm) r3.A9m.get();
        r4.A08 = (AnonymousClass1LI) r1.A3Q.get();
        r4.A19 = (C19970wo) r1.A8b.get();
        r4.A0R = (AnonymousClass17Y) r1.A3e.get();
        r4.A1X = (C28371Sj) r1.A4r.get();
        r4.A1w = (C32681e1) r3.A2Y.get();
        r4.A21 = (C19770wU) r1.A9Y.get();
        r4.A0T = (C19730wQ) r1.A4g.get();
        r4.A0U = (AnonymousClass1XY) r1.A7c.get();
    }
}
