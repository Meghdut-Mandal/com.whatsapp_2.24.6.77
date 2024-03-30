package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;

/* renamed from: X.3TK  reason: invalid class name */
public abstract class AnonymousClass3TK {
    public static final int[][] A00 = {new int[]{R.string.f12nameremoved, R.string.f12nameremoved}, new int[]{R.string.f12nameremoved, R.string.f12nameremoved}, new int[]{R.string.f12nameremoved, R.string.f12nameremoved}};

    public static boolean A03(AnonymousClass3T1 r6, AnonymousClass35M r7) {
        boolean z = false;
        if (r7 != null) {
            long j = r6.A0I;
            if (r6 instanceof AnonymousClass2bO) {
                j = ((AnonymousClass2bO) r6).A00;
            }
            if (r7.A01.A0I > j) {
                z = true;
            }
        }
        if (z) {
            AnonymousClass2bM r2 = r7.A01;
            if (!(r2 instanceof C180868mY)) {
                return true;
            }
            C180868mY r22 = (C180868mY) r2;
            String[] strArr = C65753Ti.A03;
            if (TextUtils.isEmpty(r22.A01) || AnonymousClass3PG.A00.equals(r22.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableString A00(android.util.Pair r10, android.widget.TextView r11, X.C19630wG r12, X.C20810yC r13, X.AnonymousClass35M r14, java.lang.String r15) {
        /*
            X.2bM r8 = r14.A01
            boolean r0 = r8 instanceof X.C180868mY
            if (r0 == 0) goto L_0x0081
            X.8mY r8 = (X.C180868mY) r8
            android.content.Context r5 = r12.A00
            java.lang.String r0 = r8.A01
            java.lang.String r6 = X.C65753Ti.A03(r0)
            java.lang.String r4 = ""
            r3 = r4
            if (r15 == 0) goto L_0x001f
            java.lang.String r1 = r15.toString()
            java.lang.String r0 = "⁣"
            java.lang.String r4 = r1.replaceAll(r0, r4)
        L_0x001f:
            java.lang.Object r2 = r10.first
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            java.lang.Object r0 = r10.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0033
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "⁣"
            java.lang.String r3 = r1.replaceAll(r0, r3)
        L_0x0033:
            if (r2 == 0) goto L_0x003f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "⁣ "
            java.lang.String r3 = X.AnonymousClass000.A0p(r0, r3, r1)
        L_0x003f:
            X.3Qa r0 = r8.A1J
            boolean r0 = r0.A02
            r7 = 2
            if (r0 == 0) goto L_0x006d
            r1 = 2131893349(0x7f121c65, float:1.9421472E38)
        L_0x0049:
            java.lang.Object[] r0 = X.C36431kI.A1a(r6, r3, r7)
        L_0x004d:
            java.lang.String r1 = r5.getString(r1, r0)
            android.text.SpannableString r5 = X.C36441kJ.A0O(r1)
            if (r2 == 0) goto L_0x006c
            A01(r2, r11)
            X.1mE r4 = new X.1mE
            r4.<init>(r2)
            java.lang.String r0 = "⁣"
            int r2 = r1.indexOf(r0)
        L_0x0065:
            int r1 = r2 + 1
        L_0x0067:
            r0 = 17
            r5.setSpan(r4, r2, r1, r0)
        L_0x006c:
            return r5
        L_0x006d:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 2131893348(0x7f121c64, float:1.942147E38)
            if (r0 != 0) goto L_0x0049
            r1 = 2131893347(0x7f121c63, float:1.9421468E38)
            r0 = 3
            java.lang.Object[] r0 = X.C36431kI.A1a(r4, r6, r0)
            r0[r7] = r3
            goto L_0x004d
        L_0x0081:
            X.3T1 r2 = r14.A00
            boolean r0 = r2 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x00ee
            X.2bS r2 = (X.AnonymousClass2bS) r2
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            X.3Qa r0 = r8.A1J
            boolean r1 = r0.A02
            r0 = 1
            android.content.Context r6 = r12.A00
            if (r1 == 0) goto L_0x00d7
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131893135(0x7f121b8f, float:1.9421038E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x00a1:
            r7.append(r3)
            java.lang.String r0 = "   "
            r7.append(r0)
            java.lang.String r0 = r2.A03
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r7)
            android.text.SpannableString r5 = X.C36441kJ.A0O(r0)
            boolean r0 = X.C36391kE.A1Y(r13)
            r1 = 2131233260(0x7f0809ec, float:1.8082652E38)
            if (r0 == 0) goto L_0x00bf
            r1 = 2131233261(0x7f0809ed, float:1.8082655E38)
        L_0x00bf:
            r0 = 2131101697(0x7f060801, float:1.781581E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r6, r1, r0)
            A01(r0, r11)
            X.1mE r4 = new X.1mE
            r4.<init>(r0)
            int r0 = r3.length()
            int r2 = r0 + 1
            int r1 = r0 + 2
            goto L_0x0067
        L_0x00d7:
            android.content.res.Resources r5 = r6.getResources()
            r4 = 2131893136(0x7f121b90, float:1.942104E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 == 0) goto L_0x00e9
            java.lang.String r15 = r8.A0r
        L_0x00e9:
            java.lang.String r3 = X.C36411kG.A0w(r5, r15, r3, r1, r4)
            goto L_0x00a1
        L_0x00ee:
            boolean r0 = r2 instanceof X.AnonymousClass2bT
            r1 = 5563(0x15bb, float:7.795E-42)
            if (r0 == 0) goto L_0x0110
            boolean r0 = r8 instanceof X.C46762bd
            if (r0 == 0) goto L_0x015e
            boolean r0 = r13.A0E(r1)
            if (r0 == 0) goto L_0x015e
            X.2bT r2 = (X.AnonymousClass2bT) r2
            X.2bd r8 = (X.C46762bd) r8
            X.2pC r7 = r8.A01
            r10 = 0
            r9 = 1
            if (r7 == 0) goto L_0x0110
            X.2pC r0 = X.C52292pC.NOT_GOING
            if (r7 == r0) goto L_0x0112
            X.2pC r0 = X.C52292pC.GOING
            if (r7 == r0) goto L_0x0112
        L_0x0110:
            r5 = 0
            return r5
        L_0x0112:
            android.content.Context r3 = r12.A00
            java.lang.String r4 = ""
            if (r15 == 0) goto L_0x0122
            java.lang.String r1 = r15.toString()
            java.lang.String r0 = "⁣"
            java.lang.String r4 = r1.replaceAll(r0, r4)
        L_0x0122:
            java.lang.String r6 = r2.A05
            X.3Qa r0 = r8.A1J
            boolean r0 = r0.A02
            r5 = 2
            if (r0 == 0) goto L_0x0155
            r2 = 0
        L_0x012c:
            X.2pC r0 = X.C52292pC.GOING
            r1 = 1
            if (r7 != r0) goto L_0x0132
            r1 = 0
        L_0x0132:
            int[][] r0 = A00
            r0 = r0[r2]
            r1 = r0[r1]
            java.lang.Object[] r0 = X.C36441kJ.A1Q()
            r0[r10] = r4
            java.lang.String r7 = "⁣"
            r0[r9] = r7
            java.lang.String r2 = X.C36391kE.A0v(r3, r6, r0, r5, r1)
            android.text.SpannableString r5 = X.C36441kJ.A0O(r2)
            r1 = 2131234024(0x7f080ce8, float:1.8084202E38)
            r0 = 2131101697(0x7f060801, float:1.781581E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r3, r1, r0)
            goto L_0x01a3
        L_0x0155:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            int r2 = X.C36391kE.A00(r0)
            goto L_0x012c
        L_0x015e:
            boolean r0 = r8 instanceof X.C46732ba
            if (r0 == 0) goto L_0x0110
            boolean r0 = r13.A0E(r1)
            if (r0 == 0) goto L_0x0110
            X.2bT r2 = (X.AnonymousClass2bT) r2
            android.content.Context r4 = r12.A00
            java.lang.String r6 = ""
            if (r15 == 0) goto L_0x017a
            java.lang.String r1 = r15.toString()
            java.lang.String r0 = "⁣"
            java.lang.String r6 = r1.replaceAll(r0, r6)
        L_0x017a:
            java.lang.String r5 = r2.A05
            boolean r1 = r2.A06
            r3 = 3
            r2 = 2
            java.lang.String r7 = "⁣"
            X.3Qa r0 = r8.A1J
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x01be
            if (r0 == 0) goto L_0x01b1
            r1 = 2131889368(0x7f120cd8, float:1.9413398E38)
        L_0x018d:
            java.lang.Object[] r0 = X.C36431kI.A1a(r7, r5, r2)
        L_0x0191:
            java.lang.String r2 = r4.getString(r1, r0)
            android.text.SpannableString r5 = X.C36441kJ.A0O(r2)
            r1 = 2131234024(0x7f080ce8, float:1.8084202E38)
            r0 = 2131101697(0x7f060801, float:1.781581E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r4, r1, r0)
        L_0x01a3:
            A01(r0, r11)
            X.1mE r4 = new X.1mE
            r4.<init>(r0)
            int r2 = r2.indexOf(r7)
            goto L_0x0065
        L_0x01b1:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 2131889366(0x7f120cd6, float:1.9413394E38)
            if (r0 == 0) goto L_0x01d1
            r1 = 2131889367(0x7f120cd7, float:1.9413396E38)
            goto L_0x018d
        L_0x01be:
            if (r0 == 0) goto L_0x01c4
            r1 = 2131889383(0x7f120ce7, float:1.9413428E38)
            goto L_0x018d
        L_0x01c4:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 2131889381(0x7f120ce5, float:1.9413424E38)
            if (r0 == 0) goto L_0x01d1
            r1 = 2131889382(0x7f120ce6, float:1.9413426E38)
            goto L_0x018d
        L_0x01d1:
            java.lang.Object[] r0 = X.C36431kI.A1a(r6, r7, r3)
            r0[r2] = r5
            goto L_0x0191
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TK.A00(android.util.Pair, android.widget.TextView, X.0wG, X.0yC, X.35M, java.lang.String):android.text.SpannableString");
    }

    public static void A01(Drawable drawable, TextView textView) {
        int intrinsicHeight;
        int textSize = (int) textView.getTextSize();
        if (drawable.getIntrinsicHeight() == 0) {
            intrinsicHeight = 1;
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * textSize) / intrinsicHeight, textSize);
    }

    public static void A02(DialogFragment dialogFragment, AnonymousClass141 r4) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("jid", AnonymousClass143.A03(r4.A0H));
        dialogFragment.A17(A07);
    }
}
