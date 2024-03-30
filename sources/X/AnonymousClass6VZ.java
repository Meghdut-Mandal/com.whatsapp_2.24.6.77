package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.6VZ  reason: invalid class name */
public abstract class AnonymousClass6VZ {
    public static final C137856gq A00(C1506776e r1) {
        int i;
        if (r1 == null || (i = r1.A00) == 0) {
            return null;
        }
        return (C137856gq) r1.A04(i - 1);
    }

    public static final C137846gp A02(AnonymousClass7bY r0) {
        C94894iy r02 = ((C137856gq) r0).A03.A05;
        if (r02 != null) {
            return r02.A0G;
        }
        throw AnonymousClass001.A09("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static C137346fz A01(AnonymousClass7bY r0) {
        return (C137346fz) ((AndroidComposeView) A03(r0)).A0R;
    }

    public static final C161327mZ A03(AnonymousClass7bY r0) {
        C161327mZ r02 = A02(r0).A09;
        if (r02 != null) {
            return r02;
        }
        throw AnonymousClass001.A09("This node does not have an owner.");
    }

    public static final void A04(C1506776e r3, C137856gq r4) {
        C1506776e A09 = A02(r4).A09();
        int i = A09.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = A09.A01;
            do {
                r3.A0D(((C137846gp) objArr[i2]).A0R.A02);
                i2--;
            } while (i2 >= 0);
        }
    }

    public static void A05(AnonymousClass7bY r0) {
        A02(r0).A0J();
    }

    public static void A06(AnonymousClass7bY r0) {
        A02(r0).A0I();
    }
}
