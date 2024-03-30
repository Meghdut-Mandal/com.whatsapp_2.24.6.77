package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.viewmodel.ConversationTitleViewModel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.2Gw  reason: invalid class name */
public class AnonymousClass2Gw extends AnonymousClass28d {
    public int A00;
    public long A01;
    public Handler A02;
    public AnonymousClass141 A03;
    public Runnable A04;
    public ConversationTitleViewModel A05;
    public final AnonymousClass1LV A06;
    public final C20230xE A07;
    public final AnonymousClass16D A08;
    public final C64983Qf A09;
    public final C19970wo A0A;
    public final C220412q A0B;
    public final AnonymousClass17X A0C;
    public final C20350xQ A0D;
    public final AnonymousClass1EL A0E;
    public final AnonymousClass147 A0F;
    public final AnonymousClass1EM A0G;
    public final AnonymousClass012 A0H;
    public final AnonymousClass016 A0I;
    public final C62553Gp A0J;
    public final C87854Qk A0K = new C89584Xc(this, 8);
    public final C27541Op A0L;

    private synchronized void A03(AnonymousClass026 r3) {
        AnonymousClass141 r0 = this.A03;
        if (r0 != null) {
            r3.accept(r0);
        } else {
            C80273v8.A00(this.A0f, this, r3, 33);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2Gw(X.AnonymousClass01L r32, X.AnonymousClass012 r33, X.AnonymousClass016 r34, X.C32621dv r35, X.AnonymousClass17Y r36, X.C19730wQ r37, X.AnonymousClass1LI r38, X.AnonymousClass3CG r39, X.C26421Kc r40, X.C24361Cd r41, X.AnonymousClass1LV r42, X.C28431Sq r43, X.AnonymousClass1Pp r44, X.AnonymousClass16D r45, X.AnonymousClass16I r46, X.AnonymousClass171 r47, X.C27761Ps r48, X.C64983Qf r49, X.C19970wo r50, X.C18820ts r51, X.C220412q r52, X.AnonymousClass1A5 r53, X.AnonymousClass17X r54, X.AnonymousClass141 r55, X.AnonymousClass1H2 r56, X.C20810yC r57, X.C20350xQ r58, X.C27541Op r59, X.C233117z r60, X.AnonymousClass1EL r61, X.AnonymousClass147 r62, X.AnonymousClass1EM r63, X.AnonymousClass13J r64, X.C19770wU r65) {
        /*
            r31 = this;
            r20 = 0
            r6 = r31
            r25 = r60
            r24 = r57
            r23 = r56
            r13 = r40
            r14 = r41
            r15 = r44
            r7 = r32
            r4 = r62
            r10 = r37
            r3 = r63
            r11 = r38
            r28 = r64
            r8 = r35
            r12 = r39
            r2 = r65
            r9 = r36
            r16 = r46
            r5 = r47
            r18 = r48
            r19 = r51
            r21 = r53
            r22 = r55
            r26 = r4
            r27 = r3
            r29 = r2
            r30 = r20
            r17 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 8
            X.4Xc r0 = new X.4Xc
            r0.<init>(r6, r1)
            r6.A0K = r0
            r0 = r50
            r6.A0A = r0
            r0 = r45
            r6.A08 = r0
            r0 = r43
            r6.A07 = r0
            r0 = r42
            r6.A06 = r0
            r0 = r59
            r6.A0L = r0
            r0 = r54
            r6.A0C = r0
            r6.A0F = r4
            r0 = r52
            r6.A0B = r0
            r6.A0G = r3
            r0 = r61
            r6.A0E = r0
            r0 = r58
            r6.A0D = r0
            r0 = r34
            r6.A0I = r0
            r0 = r33
            r6.A0H = r0
            r3 = r49
            r6.A09 = r3
            r0 = 0
            X.2tM r1 = new X.2tM
            r1.<init>(r6, r0)
            X.3Gp r0 = new X.3Gp
            r0.<init>(r5, r1, r4, r2)
            r6.A0J = r0
            r1 = 1
            X.4Zl r0 = new X.4Zl
            r0.<init>(r6, r1)
            r3.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Gw.<init>(X.01L, X.012, X.016, X.1dv, X.17Y, X.0wQ, X.1LI, X.3CG, X.1Kc, X.1Cd, X.1LV, X.1Sq, X.1Pp, X.16D, X.16I, X.171, X.1Ps, X.3Qf, X.0wo, X.0ts, X.12q, X.1A5, X.17X, X.141, X.1H2, X.0yC, X.0xQ, X.1Op, X.17z, X.1EL, X.147, X.1EM, X.13J, X.0wU):void");
    }

    private void A02() {
        C50912mq r0;
        boolean z = true;
        int i = 0;
        if (this.A0L) {
            if (this.A0I.A02 <= 0) {
                z = false;
            }
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) this.A08;
            if (z) {
                r0 = new C50912mq();
            } else {
                r0 = null;
            }
            wDSProfilePhoto.setProfileBadge(r0);
            return;
        }
        WaImageView waImageView = this.A0G;
        if (waImageView != null) {
            if (this.A0I.A02 <= 0) {
                z = false;
                i = 8;
            }
            waImageView.setVisibility(i);
            if (z) {
                this.A0G.setImageResource(R.drawable.ic_ephemeral_v2);
            }
        }
    }

    public void A0G(AnonymousClass141 r3) {
        if (!this.A0C.A0C(this.A0F) || this.A00 != 3) {
            super.A0G(r3);
        } else {
            A03(new C89854Yd(this, 6));
        }
    }

    public void A0H() {
        this.A00 = this.A0B.A05(this.A0F);
        super.A0H();
        this.A0J.A00();
        A02();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A00 = this.A0B.A05(this.A0F);
        super.onActivityCreated(activity, bundle);
        this.A0L.A00(this.A0K);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c3, code lost:
        if (r0 == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d9, code lost:
        if (X.C64983Qf.A00(r3, r1, r2) != false) goto L_0x0117;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass2Gw r11) {
        /*
            long r4 = java.lang.System.currentTimeMillis()
            r2 = 5000(0x1388, double:2.4703E-320)
            long r0 = r11.A01
            long r4 = r4 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x008e
            X.17X r8 = r11.A0C
            X.147 r7 = r11.A0F
            boolean r0 = r8.A0D(r7)
            r10 = r0 ^ 1
            X.3Qf r5 = r11.A09
            com.whatsapp.TextEmojiLabel r6 = r11.A0D
            X.141 r9 = r11.A0I
            long r2 = r11.A01
            X.11F r4 = r11.A0e
            int r1 = r11.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            boolean r0 = X.C64983Qf.A00(r5, r9, r4)
            if (r0 == 0) goto L_0x0042
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            if (r1 == 0) goto L_0x0042
            if (r0 == 0) goto L_0x0042
            int r1 = r1.intValue()
            r0 = 3
            if (r0 != r1) goto L_0x0070
            if (r10 == 0) goto L_0x0078
        L_0x0042:
            X.1dv r1 = r11.A0V
            X.141 r0 = r11.A0I
            java.lang.String r1 = r1.A01(r0)
            X.141 r2 = r11.A0I
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x0059
            com.whatsapp.TextEmojiLabel r1 = r11.A0D
            r0 = 2131896209(0x7f122791, float:1.9427273E38)
        L_0x0055:
            r1.setText(r0)
        L_0x0058:
            return
        L_0x0059:
            if (r1 == 0) goto L_0x0061
            com.whatsapp.TextEmojiLabel r0 = r11.A0D
            r0.setText(r1)
            return
        L_0x0061:
            boolean r0 = r2.A0d
            r1 = 3
            if (r0 == 0) goto L_0x013a
            int r0 = r11.A00
            if (r0 == r1) goto L_0x013a
            com.whatsapp.TextEmojiLabel r1 = r11.A0D
            r0 = 2131891816(0x7f121668, float:1.9418363E38)
            goto L_0x0055
        L_0x0070:
            if (r0 == r1) goto L_0x0078
            r0 = 2
            if (r1 == r0) goto L_0x0078
            r0 = 6
            if (r1 != r0) goto L_0x0042
        L_0x0078:
            long r3 = X.C36441kJ.A0A(r2)
            r1 = 8000(0x1f40, double:3.9525E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            android.text.SpannableStringBuilder r2 = r5.A01(r6)
            com.whatsapp.TextEmojiLabel r1 = r11.A0D
            android.view.View r0 = r11.A03
            r5.A03(r0, r1, r2)
            return
        L_0x008e:
            X.141 r0 = r11.A0I
            boolean r0 = r0.A0i
            if (r0 == 0) goto L_0x009d
            com.whatsapp.TextEmojiLabel r3 = r11.A0D
            r1 = 2131896209(0x7f122791, float:1.9427273E38)
        L_0x0099:
            r3.setText(r1)
            return
        L_0x009d:
            X.1EM r2 = r11.A0G
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x00dc
            int r1 = r11.A00
            r0 = 3
            if (r1 != r0) goto L_0x00dc
            X.17X r1 = r11.A0C
            X.147 r0 = r11.A0F
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x00c9
            com.whatsapp.TextEmojiLabel r3 = r11.A0D
            X.0yC r2 = r11.A0d
            X.0yV r1 = X.C21000yV.A01
            r0 = 4727(0x1277, float:6.624E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            r1 = 2131891818(0x7f12166a, float:1.9418367E38)
            if (r0 != 0) goto L_0x0099
        L_0x00c5:
            r1 = 2131891816(0x7f121668, float:1.9418363E38)
            goto L_0x0099
        L_0x00c9:
            X.3Qf r3 = r11.A09
            X.11F r2 = r11.A0e
            X.141 r1 = r11.A0I
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x0158
            boolean r0 = X.C64983Qf.A00(r3, r1, r2)
            if (r0 == 0) goto L_0x0158
            goto L_0x0117
        L_0x00dc:
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0105
            int r1 = r11.A00
            r0 = 2
            if (r1 == r0) goto L_0x00ea
            r0 = 6
            if (r1 != r0) goto L_0x0105
        L_0x00ea:
            com.whatsapp.TextEmojiLabel r0 = r11.A0D
            X.C36391kE.A1K(r0)
            X.1LV r2 = r11.A06
            X.147 r1 = r11.A0F
            int r0 = r11.A00
            boolean r0 = r2.A0K(r1, r0)
            if (r0 == 0) goto L_0x0058
            r1 = 5
            X.4Yd r0 = new X.4Yd
            r0.<init>(r11, r1)
            r11.A03(r0)
            return
        L_0x0105:
            X.3Qf r3 = r11.A09
            X.11F r2 = r11.A0e
            X.141 r1 = r11.A0I
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x0120
            boolean r0 = X.C64983Qf.A00(r3, r1, r2)
            if (r0 == 0) goto L_0x0120
        L_0x0117:
            com.whatsapp.TextEmojiLabel r2 = r11.A0D
            android.view.View r1 = r11.A03
            r0 = 0
            r3.A03(r1, r2, r0)
            return
        L_0x0120:
            X.141 r0 = r11.A0I
            boolean r0 = r0.A0d
            if (r0 == 0) goto L_0x0133
            X.17X r1 = r11.A0C
            X.147 r0 = r11.A0F
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x0133
            com.whatsapp.TextEmojiLabel r3 = r11.A0D
            goto L_0x00c5
        L_0x0133:
            com.whatsapp.TextEmojiLabel r3 = r11.A0D
            r1 = 2131894885(0x7f122265, float:1.9424587E38)
            goto L_0x0099
        L_0x013a:
            X.3Gp r3 = r11.A0J
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x0058
            int r0 = r11.A00
            if (r0 != r1) goto L_0x015f
            X.1EL r0 = r11.A0E
            boolean r0 = r0.A00(r2)
            r1 = 1
            if (r0 != 0) goto L_0x015f
            X.0xQ r0 = r11.A0D
            int r0 = r0.A0M(r2)
            if (r0 == r1) goto L_0x015f
            r8.A0D(r7)
        L_0x0158:
            com.whatsapp.TextEmojiLabel r1 = r11.A0D
            r0 = 2131888047(0x7f1207af, float:1.9410718E38)
            goto L_0x0055
        L_0x015f:
            X.1EL r1 = r11.A0E
            X.141 r0 = r11.A0I
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0058
            X.141 r2 = r11.A0I
            boolean r0 = r1.A00(r2)
            r1 = 1
            if (r0 != 0) goto L_0x0058
            X.0xQ r0 = r11.A0D
            int r0 = r0.A0M(r2)
            if (r0 == r1) goto L_0x0058
            X.0yC r1 = r11.A0d
            X.141 r0 = r11.A0I
            boolean r0 = X.AnonymousClass3M0.A00(r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r11.A0D
            if (r0 == 0) goto L_0x018c
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x018c:
            java.lang.String r0 = r3.A01
            r1.A0I(r0)
            com.whatsapp.TextEmojiLabel r1 = r11.A0D
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Gw.A04(X.2Gw):void");
    }

    public void A0I(Activity activity) {
        super.A0I(activity);
        if (this.A00 == 3) {
            C18820ts r3 = this.A0a;
            ViewGroup viewGroup = this.A05;
            Resources resources = this.A0U.getResources();
            AnonymousClass00C.A08(resources);
            AnonymousClass1JZ.A05(viewGroup, r3, resources.getDimensionPixelOffset(R.dimen.f7nameremoved), 0);
        }
        ConversationTitleViewModel conversationTitleViewModel = (ConversationTitleViewModel) C36441kJ.A0b(this.A0I).A00(ConversationTitleViewModel.class);
        this.A05 = conversationTitleViewModel;
        C88554Td.A00(this.A0H, conversationTitleViewModel.A01, this, 17);
        this.A05.A01.A0D(new C54002sF());
        A0E(new AnonymousClass3YF(this, activity, 0));
        C33521fV.A03(this.A05, R.string.f12nameremoved);
        A02();
    }

    public void onActivityDestroyed(Activity activity) {
        Runnable runnable;
        super.onActivityDestroyed(activity);
        Handler handler = this.A02;
        if (!(handler == null || (runnable = this.A04) == null)) {
            handler.removeCallbacks(runnable);
        }
        this.A0L.A01(this.A0K);
        C62553Gp r3 = this.A0J;
        C49672jV r2 = r3.A00;
        if (r2 != null) {
            r2.A0D(false);
            Handler handler2 = r2.A00;
            if (handler2 != null) {
                handler2.removeCallbacks(r2.A01);
            }
            r2.A00 = null;
            r2.A01 = null;
            r3.A00 = null;
        }
        C64983Qf r22 = this.A09;
        r22.A03 = null;
        r22.A01 = 0;
    }

    public /* synthetic */ void A0J(AnonymousClass141 r1) {
        super.A0G(r1);
    }
}
