package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3Qf  reason: invalid class name and case insensitive filesystem */
public final class C64983Qf {
    public int A00;
    public long A01;
    public Animation A02;
    public C87634Po A03;
    public boolean A04;
    public final C19730wQ A05;
    public final AnonymousClass34L A06;
    public final C18820ts A07;
    public final C20400xV A08;
    public final C20500xf A09;
    public final C235618y A0A;
    public final C19970wo A0B;
    public final C20810yC A0C;

    public final SpannableStringBuilder A01(TextEmojiLabel textEmojiLabel) {
        AnonymousClass00C.A0D(textEmojiLabel, 0);
        Drawable A012 = AnonymousClass3UF.A01(textEmojiLabel.getContext(), R.drawable.ic_security_balloon, C224514j.A00(textEmojiLabel.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        this.A00 = A012.getIntrinsicWidth();
        return C36441kJ.A0P(C37351mE.A02(textEmojiLabel.getPaint(), A012, textEmojiLabel.getContext().getString(R.string.f12nameremoved)));
    }

    public final void A03(View view, TextEmojiLabel textEmojiLabel, CharSequence charSequence) {
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        CharSequence charSequence2 = charSequence;
        if (textEmojiLabel != null) {
            View view2 = view;
            if (view != null) {
                if (charSequence == null) {
                    charSequence2 = A01(textEmojiLabel);
                }
                textEmojiLabel.setText(charSequence2);
                if (!this.A04) {
                    C09020bh.A00(view, new C1503474x((Object) view2, (Object) textEmojiLabel2, (Object) charSequence2, (Object) this, 30));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r3 == 2) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.C64983Qf r5, X.AnonymousClass141 r6, X.AnonymousClass11F r7) {
        /*
            X.0yC r1 = r5.A0C
            r0 = 6843(0x1abb, float:9.589E-42)
            boolean r0 = r1.A0E(r0)
            r4 = 0
            if (r0 == 0) goto L_0x002a
            X.34L r2 = r5.A06
            r1 = 1
            boolean r0 = r6.A0G()
            if (r0 != 0) goto L_0x002b
            X.0wQ r0 = r2.A00
            boolean r0 = X.C36361kB.A1X(r0, r6)
            if (r0 != 0) goto L_0x002b
            java.util.concurrent.ConcurrentHashMap r0 = r2.A01
            java.lang.Object r0 = r0.get(r7)
            boolean r0 = X.C36371kC.A1X(r0, r1)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            return r4
        L_0x002b:
            boolean r0 = r6.A0G()
            if (r0 != 0) goto L_0x004f
            X.0xf r0 = r5.A09
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x004f
            com.whatsapp.jid.UserJid r3 = X.C36401kF.A0b(r7)
            X.18y r2 = r5.A0A
            X.3L0 r1 = r6.A0E
            X.3U1 r0 = new X.3U1
            r0.<init>(r1)
            r0.A02 = r3
            r0.A01 = r2
            boolean r0 = r0.A06()
            return r0
        L_0x004f:
            X.3L0 r0 = r6.A0E
            if (r0 == 0) goto L_0x009b
            X.3ur r2 = r0.A00()
            X.0xf r0 = r5.A09
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x006e
            X.0xV r1 = r5.A08
            boolean r0 = r7 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x006e
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            boolean r0 = r1.A01(r7)
            if (r0 == 0) goto L_0x006e
            return r4
        L_0x006e:
            int r3 = r2.hostStorage
            int r2 = r2.actualActors
            r1 = 1
            if (r3 != r1) goto L_0x007f
            if (r2 == r1) goto L_0x00a9
        L_0x0077:
            r0 = 2
            if (r3 == r1) goto L_0x0086
            if (r3 != r0) goto L_0x0084
            if (r2 != r1) goto L_0x0086
            return r4
        L_0x007f:
            if (r3 != 0) goto L_0x0077
            if (r2 != 0) goto L_0x0089
            goto L_0x00a9
        L_0x0084:
            if (r3 != r0) goto L_0x0089
        L_0x0086:
            if (r2 != r0) goto L_0x0089
            return r4
        L_0x0089:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "getProviderCategory unexpected arguments hostStorage: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ". actualActors:"
            X.C36321k7.A1S(r0, r1, r2)
            goto L_0x00a9
        L_0x009b:
            X.0wQ r0 = r5.A05
            boolean r0 = X.C36361kB.A1X(r0, r6)
            if (r0 == 0) goto L_0x002a
            boolean r0 = r6.A0C()
            if (r0 != 0) goto L_0x002a
        L_0x00a9:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64983Qf.A00(X.3Qf, X.141, X.11F):boolean");
    }

    public C64983Qf(C19730wQ r1, C235618y r2, AnonymousClass34L r3, C19970wo r4, C18820ts r5, C20400xV r6, C20810yC r7, C20500xf r8) {
        C36321k7.A1B(r7, r1, r4, r3, r5);
        C36321k7.A13(r6, r8, r2);
        this.A0C = r7;
        this.A05 = r1;
        this.A0B = r4;
        this.A06 = r3;
        this.A07 = r5;
        this.A08 = r6;
        this.A09 = r8;
        this.A0A = r2;
    }

    public final Pair A02(Context context, AnonymousClass141 r7, AnonymousClass11F r8, long j) {
        boolean A1U = C36401kF.A1U((C36441kJ.A0A(j) > this.A01 ? 1 : (C36441kJ.A0A(j) == this.A01 ? 0 : -1)));
        if (!A00(this, r7, r8) || A1U) {
            return null;
        }
        return C36441kJ.A0Q(C36381kD.A0n(), context.getString(R.string.f12nameremoved));
    }

    public final void A04(AnonymousClass141 r6, AnonymousClass11F r7, long j, boolean z) {
        if (A00(this, r6, r7)) {
            Handler A0H = C36341k9.A0H();
            C1502474n r3 = new C1502474n(this, r7, r6, 45);
            long j2 = 3000;
            if (r6.A0C() || z || r6.A0G()) {
                j2 = 3000 + j;
            }
            this.A01 = j2;
            A0H.postDelayed(r3, j2);
        }
    }
}
