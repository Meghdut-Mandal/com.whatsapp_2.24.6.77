package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.6Rr  reason: invalid class name and case insensitive filesystem */
public abstract class C131996Rr {
    public static final C93564gm A00 = new C93544gk(C153647Pd.A00);
    public static final C93564gm A01 = new C93544gk(C153667Pf.A00);
    public static final C93564gm A02 = new C93544gk(C153697Pi.A00);
    public static final C93564gm A03 = new C93544gk(C153707Pj.A00);
    public static final C93564gm A04 = new C93544gk(C153767Pp.A00);
    public static final C93564gm A05 = new C93544gk(AnonymousClass7PZ.A00);
    public static final C93564gm A06 = new C93544gk(C153617Pa.A00);
    public static final C93564gm A07 = new C93544gk(C153627Pb.A00);
    public static final C93564gm A08 = new C93544gk(C153637Pc.A00);
    public static final C93564gm A09 = new C93544gk(C153657Pe.A00);
    public static final C93564gm A0A = new C93544gk(C153677Pg.A00);
    public static final C93564gm A0B = new C93544gk(C153687Ph.A00);
    public static final C93564gm A0C = new C93544gk(C153717Pk.A00);
    public static final C93564gm A0D = new C93544gk(C153727Pl.A00);
    public static final C93564gm A0E = new C93544gk(C153737Pm.A00);
    public static final C93564gm A0F = new C93544gk(C153747Pn.A00);
    public static final C93564gm A0G = new C93544gk(C153757Po.A00);
    public static final C93564gm A0H = new C93544gk(C153777Pq.A00);

    public static final void A00(C161337ma r10, C161327mZ r11, C156997bf r12, C009003v r13, int i) {
        int i2;
        r10.Bun(874662829);
        if ((i & 14) == 0) {
            i2 = C90464aC.A0A(r10, r11) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C90464aC.A09(r10, r12);
        }
        if ((i & 896) == 0) {
            int i3 = 128;
            if (r10.B2h(r13)) {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !r10.BHg()) {
            C120655rr[] r3 = new C120655rr[18];
            AndroidComposeView androidComposeView = (AndroidComposeView) r11;
            C120655rr.A00(A05, androidComposeView.A0a, r3, 0, true);
            r3[1] = new C120655rr(A06, androidComposeView.A0O, true);
            C120655rr.A00(A07, androidComposeView.A0P, r3, 2, true);
            r3[3] = new C120655rr(A08, androidComposeView.A0b, true);
            C120655rr.A00(A00, androidComposeView.A04, r3, 4, true);
            C120655rr.A00(A09, androidComposeView.A0R, r3, 5, true);
            C120655rr.A00(A0A, androidComposeView.A0j, r3, 6, false);
            C120655rr.A00(A01, r11.getFontFamilyResolver(), r3, 7, false);
            r3[8] = new C120655rr(A0B, androidComposeView.A0S, true);
            C120655rr.A00(A02, androidComposeView.A0T, r3, 9, true);
            C120655rr.A00(A03, r11.getLayoutDirection(), r3, 10, true);
            C120655rr.A00(A0E, androidComposeView.A0k, r3, 11, true);
            C120655rr.A00(A0D, androidComposeView.A0e, r3, 12, true);
            C120655rr.A00(A0F, androidComposeView.A0f, r3, 13, true);
            r3[14] = new C120655rr(A0G, r12, true);
            C120655rr.A00(A04, androidComposeView.A0g, r3, 15, true);
            C120655rr.A00(A0H, androidComposeView.A0h, r3, 16, true);
            C120655rr.A00(A0C, androidComposeView.A0U, r3, 17, true);
            AnonymousClass6Fz.A01(r10, r13, r3, ((i2 >> 3) & 112) | 8);
        } else {
            r10.BuE();
        }
        C136976fO B6Z = r10.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C156007Yh(r11, r12, r13, i);
        }
    }

    public static final /* synthetic */ void A01(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CompositionLocal ");
        A0u.append(str);
        throw AnonymousClass000.A0g(" not present", A0u);
    }
}
