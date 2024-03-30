package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.viewmodel.ConversationTitleViewModel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.2Gx  reason: invalid class name and case insensitive filesystem */
public class C43322Gx extends AnonymousClass28d {
    public long A00;
    public Handler A01;
    public ViewStub A02;
    public Runnable A03;
    public boolean A04 = false;
    public boolean A05;
    public AnonymousClass75A A06;
    public ConversationTitleViewModel A07;
    public final AnonymousClass164 A08;
    public final C64983Qf A09;
    public final C19970wo A0A;
    public final C20500xf A0B;
    public final AnonymousClass1CF A0C;
    public final C24961El A0D;
    public final AnonymousClass012 A0E;
    public final AnonymousClass016 A0F;
    public final C19460v5 A0G;
    public final C19730wQ A0H;
    public final C87634Po A0I = new C90194Zl(this, 0);
    public final C220412q A0J;
    public final C28331Sf A0K;
    public final C32251dE A0L;
    public final AnonymousClass005 A0M;
    public final AnonymousClass005 A0N;
    public final AnonymousClass005 A0O;

    private void A02(int i) {
        View view = this.A03;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ed, code lost:
        if (X.C36391kE.A1X(r14.A0d) == false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ac, code lost:
        if (X.AnonymousClass3SX.A01(r14.A0U, r14.A0A, r9) == null) goto L_0x02ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C43322Gx r18) {
        /*
            r14 = r18
            r14.A0D()
            android.util.Pair r8 = r14.A0J()
            int r0 = X.C36381kD.A04(r8)
            r3 = 1
            if (r0 != r3) goto L_0x00a9
            java.lang.Object r1 = r8.second
            java.lang.String r1 = (java.lang.String) r1
            r5 = 0
            X.AnonymousClass00C.A0D(r1, r5)
            android.view.View r0 = r14.A02
            X.C36331k8.A0y(r0)
            android.view.View r0 = r14.A03
            if (r0 == 0) goto L_0x0024
            r0.setVisibility(r5)
        L_0x0024:
            com.whatsapp.TextEmojiLabel r0 = r14.A0A()
            r0.setVisibility(r5)
            android.view.View r0 = r14.A03
            if (r0 == 0) goto L_0x008f
            float r8 = X.C36441kJ.A01(r0)
            com.whatsapp.TextEmojiLabel r0 = r14.A0A()
            android.text.TextPaint r0 = r0.getPaint()
            if (r0 == 0) goto L_0x008f
            float r2 = r0.measureText(r1)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
            boolean r0 = r14.A0K
            if (r0 != 0) goto L_0x00a1
            r14.A0K = r3
            com.whatsapp.TextEmojiLabel r0 = r14.A0A()
            r0.setText(r1)
            r6 = 0
            X.0ts r0 = r14.A0a
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r0 == 0) goto L_0x005c
            float r8 = -r2
        L_0x005c:
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 3000(0xbb8, double:1.482E-320)
            r4.setDuration(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.setStartOffset(r0)
            r0 = 4
            X.C89234Vt.A00(r4, r14, r0)
            com.whatsapp.TextEmojiLabel r0 = r14.A0A()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x0081
            int r0 = (int) r2
            r1.width = r0
        L_0x0081:
            com.whatsapp.TextEmojiLabel r0 = r14.A0A()
            r0.setLayoutParams(r1)
            com.whatsapp.TextEmojiLabel r0 = r14.A0A()
            r0.startAnimation(r4)
        L_0x008f:
            com.whatsapp.conversation.viewmodel.ConversationTitleViewModel r4 = r14.A07
            X.141 r2 = r14.A0I
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x00a0
            r4.A00 = r3
            X.0wU r1 = r4.A03
            r0 = 47
            X.C80283v9.A00(r1, r4, r2, r0)
        L_0x00a0:
            return
        L_0x00a1:
            com.whatsapp.TextEmojiLabel r0 = r14.A0A()
            r0.setText(r1)
            goto L_0x008f
        L_0x00a9:
            boolean r9 = r14.A0F()
            if (r9 == 0) goto L_0x00db
            X.3SF r5 = r14.A0E
            if (r5 == 0) goto L_0x00db
            X.141 r0 = r14.A0I
            java.lang.String r4 = r0.A0K()
            X.01L r2 = r14.A0U
            X.3SF r0 = r14.A0E
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            android.text.TextPaint r1 = r0.getPaint()
            X.1H2 r0 = r14.A0v
            java.lang.CharSequence r1 = X.AnonymousClass3UG.A03(r2, r1, r0, r4)
            com.whatsapp.TextEmojiLabel r0 = r5.A01
            r0.setText(r1)
            X.141 r0 = r14.A0I
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x00db
            X.3SF r0 = r14.A0E
            r0.A03(r3)
        L_0x00db:
            X.0wQ r1 = r14.A0H
            X.141 r0 = r14.A0I
            boolean r0 = X.C36361kB.A1X(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x00ef
            X.0yC r0 = r14.A0d
            boolean r0 = X.C36391kE.A1X(r0)
            r4 = 1
            if (r0 != 0) goto L_0x00f0
        L_0x00ef:
            r4 = 0
        L_0x00f0:
            X.141 r0 = r14.A0I
            boolean r0 = r0.A0i
            if (r0 == 0) goto L_0x00ff
            com.whatsapp.TextEmojiLabel r2 = r14.A0D
            r0 = 2131896209(0x7f122791, float:1.9427273E38)
        L_0x00fb:
            r2.setText(r0)
            return
        L_0x00ff:
            boolean r0 = A06(r14)
            if (r0 == 0) goto L_0x011e
            r14.A02(r2)
            com.whatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setVisibility(r2)
            X.0v5 r1 = r14.A0G
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x00a0
            com.whatsapp.TextEmojiLabel r2 = r14.A0D
            r1.A02()
            r0 = 2131887022(0x7f1203ae, float:1.940864E38)
            goto L_0x00fb
        L_0x011e:
            X.0yC r12 = r14.A0d
            boolean r0 = X.C55942vR.A00(r12)
            if (r0 == 0) goto L_0x0182
            X.141 r0 = r14.A0I
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0182
            r14.A02(r2)
            com.whatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setVisibility(r2)
            r5 = 2131887075(0x7f1203e3, float:1.9408747E38)
            X.141 r0 = r14.A0I
            java.lang.String r4 = r0.A0K()
            X.141 r0 = r14.A0I
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x01d5
            X.141 r0 = r14.A0I
            java.lang.String r0 = r0.A0J()
            if (r0 == 0) goto L_0x01d5
            android.widget.TextView r1 = r14.A0B
            X.141 r0 = r14.A0I
            java.lang.String r0 = r0.A0J()
            r1.setText(r0)
            if (r4 == 0) goto L_0x0170
            com.whatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setText(r5)
            com.whatsapp.TextEmojiLabel r3 = r14.A0D
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = " · "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)
            r3.append(r0)
        L_0x0170:
            int r1 = X.C55832vG.A00(r12)
            X.141 r0 = r14.A0I
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x00a0
            com.whatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r1, r2)
            return
        L_0x0182:
            X.141 r1 = r14.A0I
            X.AnonymousClass00C.A0D(r12, r2)
            r0 = 4873(0x1309, float:6.829E-42)
            boolean r0 = r12.A0E(r0)
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x01ac
            X.1El r0 = r14.A0D
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01ac
            r14.A02(r2)
            com.whatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r2 = r14.A0D
            r0 = 2131887068(0x7f1203dc, float:1.9408733E38)
            goto L_0x00fb
        L_0x01ac:
            if (r4 == 0) goto L_0x01ed
            r14.A02(r2)
            com.whatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setVisibility(r2)
            X.3Qf r1 = r14.A09
            X.01L r2 = r14.A0U
            X.141 r3 = r14.A0I
            long r5 = r14.A00
            X.11F r4 = r14.A0e
            android.util.Pair r0 = r1.A02(r2, r3, r4, r5)
            com.whatsapp.TextEmojiLabel r2 = r14.A0D
            if (r0 == 0) goto L_0x01d0
            android.text.SpannableStringBuilder r0 = r1.A01(r2)
            r2.setText(r0)
            return
        L_0x01d0:
            r0 = 2131891082(0x7f12138a, float:1.9416874E38)
            goto L_0x00fb
        L_0x01d5:
            android.widget.TextView r0 = r14.A0B
            r0.setText(r4)
            com.whatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setText(r5)
            X.141 r0 = r14.A0I
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x00a0
            X.3SF r0 = r14.A0F
            r0.A03(r3)
            return
        L_0x01ed:
            X.11F r0 = r14.A0e
            boolean r0 = X.AnonymousClass143.A0H(r0)
            if (r0 == 0) goto L_0x01f8
            X.AnonymousClass28d.A01(r14)
        L_0x01f8:
            int r0 = X.C36381kD.A04(r8)
            r7 = 6
            X.3Qf r6 = r14.A09
            if (r0 != r7) goto L_0x02fb
            com.whatsapp.TextEmojiLabel r0 = r14.A0D
            android.text.SpannableStringBuilder r0 = r6.A01(r0)
        L_0x0207:
            boolean r1 = X.AnonymousClass14B.A0F(r0)
            r5 = 8
            if (r1 != 0) goto L_0x032c
            r14.A02(r2)
            com.whatsapp.TextEmojiLabel r1 = r14.A0D
            r1.setVisibility(r2)
            android.view.View r1 = r14.A02
            X.C18740tg.A04(r1)
            android.widget.TextView r2 = r14.A0A
            X.C18740tg.A04(r2)
            int r1 = X.C36351kA.A00(r9)
            r2.setVisibility(r1)
            android.view.View r2 = r14.A02
            int r1 = X.C36351kA.A00(r9)
            r2.setVisibility(r1)
            android.view.View r1 = r14.A03
            if (r1 != 0) goto L_0x02f5
            r4 = 0
        L_0x0236:
            if (r9 == 0) goto L_0x02f3
            if (r4 == 0) goto L_0x02f3
            android.widget.TextView r1 = r14.A0A
            android.text.TextPaint r2 = r1.getPaint()
            java.lang.String r1 = "•"
            float r1 = r2.measureText(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r9 = (int) r1
            android.widget.TextView r1 = r14.A0A
            int r1 = r1.getPaddingLeft()
            int r9 = r9 + r1
            android.widget.TextView r1 = r14.A0A
            int r1 = r1.getPaddingRight()
            int r9 = r9 + r1
            int r11 = X.C55832vG.A00(r12)
            X.3SF r1 = r14.A0E
            com.whatsapp.TextEmojiLabel r1 = r1.A01
            android.text.TextPaint r2 = r1.getPaint()
            X.141 r1 = r14.A0I
            java.lang.String r1 = r1.A0K()
            float r1 = r2.measureText(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r10 = (int) r1
            X.01L r2 = r14.A0U
            android.content.res.Resources r1 = r2.getResources()
            X.AnonymousClass00C.A08(r1)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r11)
            int r1 = r1.getIntrinsicWidth()
            int r10 = r10 + r1
            android.content.res.Resources r2 = r2.getResources()
            X.AnonymousClass00C.A08(r2)
            r1 = 2131168705(0x7f070dc1, float:1.795172E38)
            int r1 = X.C36441kJ.A06(r2, r1, r10)
            int r1 = r1 + r9
            int r10 = r4 - r1
        L_0x0299:
            r1 = 6172(0x181c, float:8.649E-42)
            boolean r1 = r12.A0E(r1)
            if (r1 == 0) goto L_0x02ae
            X.141 r9 = r14.A0I
            X.0wo r2 = r14.A0A
            X.01L r1 = r14.A0U
            java.lang.String r2 = X.AnonymousClass3SX.A01(r1, r2, r9)
            r1 = 1
            if (r2 != 0) goto L_0x02af
        L_0x02ae:
            r1 = 0
        L_0x02af:
            r14.A04 = r1
            com.whatsapp.TextEmojiLabel r1 = r14.A0D
            android.text.TextPaint r2 = r1.getPaint()
            java.lang.String r1 = r0.toString()
            float r2 = r2.measureText(r1)
            r9 = 5
            if (r10 == 0) goto L_0x0308
            float r1 = (float) r10
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0308
            X.75A r1 = r14.A06
            if (r1 != 0) goto L_0x035c
            int r1 = X.C36381kD.A04(r8)
            if (r1 == r7) goto L_0x0354
            com.whatsapp.TextEmojiLabel r1 = r14.A0D
            r1.setText(r0)
            X.0wo r15 = r14.A0A
            X.1dv r13 = r14.A0V
            X.171 r1 = r14.A0Z
            X.0ts r0 = r14.A0a
            X.75A r11 = new X.75A
            r18 = 6
            r16 = r1
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r14.A06 = r11
            X.17Y r2 = r14.A0W
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.A0I(r11, r0)
            return
        L_0x02f3:
            r10 = r4
            goto L_0x0299
        L_0x02f5:
            int r4 = r1.getWidth()
            goto L_0x0236
        L_0x02fb:
            android.view.animation.Animation r0 = r6.A02
            if (r0 == 0) goto L_0x0302
            r0.cancel()
        L_0x0302:
            java.lang.Object r0 = r8.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x0207
        L_0x0308:
            X.75A r2 = r14.A06
            if (r2 == 0) goto L_0x0311
            X.17Y r1 = r14.A0W
            r1.A0G(r2)
        L_0x0311:
            com.whatsapp.TextEmojiLabel r1 = r14.A0D
            r1.setText(r0)
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x00a0
            int r0 = X.C36381kD.A04(r8)
            if (r0 == r9) goto L_0x00a0
            android.os.Handler r3 = r14.A01
            if (r3 == 0) goto L_0x00a0
            java.lang.Runnable r2 = r14.A03
            r0 = 2500(0x9c4, double:1.235E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x032c:
            com.whatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setVisibility(r5)
            android.widget.TextView r0 = r14.A0A
            X.C18740tg.A04(r0)
            r0.setVisibility(r5)
            if (r9 == 0) goto L_0x0350
            r14.A02(r2)
            android.view.View r0 = r14.A02
            X.C18740tg.A04(r0)
            r0.setVisibility(r2)
        L_0x0346:
            X.75A r1 = r14.A06
            if (r1 == 0) goto L_0x00a0
            X.17Y r0 = r14.A0W
            r0.A0G(r1)
            return
        L_0x0350:
            r14.A02(r5)
            goto L_0x0346
        L_0x0354:
            com.whatsapp.TextEmojiLabel r2 = r14.A0D
            android.view.View r1 = r14.A03
            r6.A03(r1, r2, r0)
            return
        L_0x035c:
            boolean r1 = r14.A0M
            if (r1 == 0) goto L_0x038a
            float r1 = (float) r4
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0384
            int r1 = X.C36381kD.A04(r8)
            if (r1 == r9) goto L_0x0384
            X.1dv r2 = r14.A0V
            X.141 r1 = r14.A0I
            java.lang.String r2 = r2.A02(r1)
            if (r2 == 0) goto L_0x0376
            r3 = 0
        L_0x0376:
            com.whatsapp.TextEmojiLabel r1 = r14.A0D
            if (r3 == 0) goto L_0x037b
            r2 = r0
        L_0x037b:
            r1.setText(r2)
        L_0x037e:
            android.view.View r0 = r14.A02
            r0.setVisibility(r5)
            return
        L_0x0384:
            com.whatsapp.TextEmojiLabel r1 = r14.A0D
            r1.setText(r0)
            goto L_0x037e
        L_0x038a:
            com.whatsapp.TextEmojiLabel r1 = r14.A0D
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43322Gx.A03(X.2Gx):void");
    }

    public static void A04(C43322Gx r4) {
        AnonymousClass3L0 r0;
        if (r4.A02 != null) {
            if (r4.A0d.A0E(5869) && (r0 = r4.A0I.A0E) != null && r0.A01 == 2) {
                r4.A0W.A0H(new AnonymousClass75B(25, (Object) r4, C30921az.A01(r4.A0e, (C30921az) r4.A0N.get())));
            }
            if (((C64733Pf) r4.A0M.get()).A02(C36351kA.A0l(r4.A0I), r4.A0I.A0C())) {
                r4.A0W.A0H(C80223v3.A00(r4, 19));
            }
        }
    }

    public static void A05(C43322Gx r4) {
        C50912mq r0;
        boolean z = true;
        int i = 0;
        if (r4.A0L) {
            AnonymousClass11F r1 = (AnonymousClass11F) C36431kI.A0h(r4.A0I);
            if (r1 == null || r4.A0J.A03(r1) <= 0) {
                z = false;
            }
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) r4.A08;
            if (z) {
                r0 = new C50912mq();
            } else {
                r0 = null;
            }
            wDSProfilePhoto.setProfileBadge(r0);
        } else if (r4.A0G != null) {
            AnonymousClass11F r12 = (AnonymousClass11F) C36431kI.A0h(r4.A0I);
            if (r12 == null || r4.A0J.A03(r12) <= 0) {
                z = false;
            }
            WaImageView waImageView = r4.A0G;
            if (!z) {
                i = 8;
            }
            waImageView.setVisibility(i);
            if (z) {
                r4.A0G.setImageResource(R.drawable.ic_ephemeral_v2);
            }
        }
    }

    public static boolean A06(C43322Gx r2) {
        C19460v5 r1 = r2.A0G;
        if (!r1.A05() || !C36441kJ.A0f(r1).BLB(r2.A0I.A0H)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        if (r0 >= 0) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0103, code lost:
        if (r17 >= r14) goto L_0x0105;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0J() {
        /*
            r25 = this;
            r2 = r25
            X.0wo r3 = r2.A0A
            long r17 = java.lang.System.currentTimeMillis()
            java.lang.Integer r4 = X.C36381kD.A0m()
            r0 = 0
            android.util.Pair r8 = X.C36441kJ.A0Q(r4, r0)
            java.lang.Object r0 = r8.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            r16 = r0 ^ 1
            r14 = 5000(0x1388, double:2.4703E-320)
            if (r16 == 0) goto L_0x0027
            long r0 = r2.A00
            long r5 = r17 - r0
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0118
        L_0x0027:
            X.0xf r0 = r2.A0B
            X.11F r6 = r2.A0e
            boolean r0 = X.AnonymousClass3M3.A01(r0, r6)
            if (r0 != 0) goto L_0x00e1
            X.0yC r0 = r2.A0d
            boolean r0 = X.AnonymousClass3RR.A00(r0, r6)
            if (r0 != 0) goto L_0x00e1
            X.141 r0 = r2.A0I
            boolean r0 = r0.A0C()
            r1 = 0
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r4 = X.C36371kC.A0n()
            X.01L r1 = r2.A0U
            r0 = 2131888438(0x7f120936, float:1.9411511E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x004f:
            android.util.Pair r8 = X.C36441kJ.A0Q(r4, r1)
            java.lang.Object r0 = r8.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            r13 = r0 ^ 1
            java.lang.Integer r4 = X.C36371kC.A0o()
            X.1dv r1 = r2.A0V
            X.141 r0 = r2.A0I
            java.lang.String r0 = r1.A00(r0)
            android.util.Pair r4 = X.C36441kJ.A0Q(r4, r0)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x00f0
            r11 = 2500(0x9c4, double:1.235E-320)
            if (r13 == 0) goto L_0x007f
            long r0 = r2.A00
            long r9 = r17 - r0
            if (r16 != 0) goto L_0x00de
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
        L_0x007d:
            if (r0 < 0) goto L_0x0118
        L_0x007f:
            X.3Qf r7 = r2.A09
            X.01L r5 = r2.A0U
            X.141 r8 = r2.A0I
            long r0 = r2.A00
            r19 = r7
            r20 = r5
            r21 = r8
            r22 = r6
            r23 = r0
            android.util.Pair r8 = r19.A02(r20, r21, r22, r23)
            if (r8 != 0) goto L_0x0118
            java.lang.Object r1 = r4.second
            java.lang.String r1 = (java.lang.String) r1
            r0 = 2131888439(0x7f120937, float:1.9411513E38)
            java.lang.String r0 = r5.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0117
            java.lang.Object r0 = r4.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.C36421kH.A1a(r0)
            if (r0 == 0) goto L_0x00db
            if (r13 != 0) goto L_0x00b6
            if (r16 == 0) goto L_0x00db
        L_0x00b6:
            X.141 r0 = r2.A0I
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x00d8
            r0 = 0
        L_0x00c0:
            long r14 = r14 + r0
            long r0 = r2.A00
            long r17 = r17 - r0
            int r0 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0117
            X.141 r0 = r2.A0I
            java.lang.String r1 = X.AnonymousClass3SX.A01(r5, r3, r0)
            java.lang.Integer r0 = X.C36371kC.A0p()
            android.util.Pair r0 = X.C36441kJ.A0Q(r0, r1)
            return r0
        L_0x00d8:
            long r0 = r7.A01
            goto L_0x00c0
        L_0x00db:
            r14 = 2500(0x9c4, double:1.235E-320)
            goto L_0x00b6
        L_0x00de:
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            goto L_0x007d
        L_0x00e1:
            java.lang.Integer r4 = X.C36361kB.A0j()
            X.01L r1 = r2.A0U
            r0 = 2131896086(0x7f122716, float:1.9427023E38)
            java.lang.String r1 = X.C44122Lf.A02(r1, r0)
            goto L_0x004f
        L_0x00f0:
            if (r13 == 0) goto L_0x0105
            int r1 = X.C36381kD.A04(r8)
            r0 = 2
            if (r1 == r0) goto L_0x0118
            long r0 = r2.A00
            long r17 = r17 - r0
            if (r16 == 0) goto L_0x0101
            r14 = 10000(0x2710, double:4.9407E-320)
        L_0x0101:
            int r0 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0118
        L_0x0105:
            X.3Qf r7 = r2.A09
            X.01L r8 = r2.A0U
            X.141 r3 = r2.A0I
            long r0 = r2.A00
            r9 = r3
            r10 = r6
            r11 = r0
            android.util.Pair r0 = r7.A02(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x0117
            return r0
        L_0x0117:
            return r4
        L_0x0118:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43322Gx.A0J():android.util.Pair");
    }

    public void onActivityDestroyed(Activity activity) {
        Runnable runnable;
        Handler handler = this.A01;
        if (!(handler == null || (runnable = this.A03) == null)) {
            handler.removeCallbacks(runnable);
        }
        C64983Qf r2 = this.A09;
        r2.A03 = null;
        r2.A01 = 0;
        super.onActivityDestroyed(activity);
    }

    public void A0H() {
        super.A0H();
        C19460v5 r3 = this.A0G;
        if (r3.A05()) {
            if (!A06(this)) {
                C20810yC r2 = this.A0d;
                AnonymousClass141 r1 = this.A0I;
                AnonymousClass00C.A0D(r2, 0);
                if (!r2.A0E(4873) || !r1.A0D() || !this.A0D.A02()) {
                    return;
                }
            }
            C36441kJ.A0f(r3).B1X(this.A0D, C224514j.A00(this.A0U, R.attr.f4nameremoved, R.color.f6nameremoved), true);
        }
    }

    public void A0I(Activity activity) {
        super.A0I(activity);
        this.A02 = C36431kI.A0M(this.A04, R.id.data_disclosure_status);
        this.A09.A03 = this.A0I;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        ConversationTitleViewModel conversationTitleViewModel = (ConversationTitleViewModel) C36441kJ.A0b(this.A0F).A00(ConversationTitleViewModel.class);
        this.A07 = conversationTitleViewModel;
        C88554Td.A00(this.A0E, conversationTitleViewModel.A01, this, 10);
        this.A07.A01.A0D(new C54002sF());
        A0E(new AnonymousClass3YE(this, activity, 47));
        C33521fV.A03(this.A05, R.string.f12nameremoved);
        A05(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C43322Gx(X.AnonymousClass01L r28, X.AnonymousClass012 r29, X.AnonymousClass016 r30, X.C19460v5 r31, X.C32621dv r32, X.AnonymousClass17Y r33, X.C19730wQ r34, X.AnonymousClass1LI r35, X.AnonymousClass164 r36, X.AnonymousClass3CG r37, X.C26421Kc r38, X.C24361Cd r39, X.AnonymousClass1Pp r40, X.AnonymousClass16I r41, X.AnonymousClass171 r42, X.C27761Ps r43, X.C64983Qf r44, X.C19970wo r45, X.C18820ts r46, X.AnonymousClass1YG r47, X.C220412q r48, X.AnonymousClass1A5 r49, X.AnonymousClass141 r50, X.AnonymousClass1H2 r51, X.C20810yC r52, X.C20500xf r53, X.C233117z r54, X.AnonymousClass1CF r55, X.AnonymousClass11F r56, X.C28331Sf r57, X.C32251dE r58, X.AnonymousClass1EM r59, X.AnonymousClass13J r60, X.C19770wU r61, X.C24961El r62, X.AnonymousClass005 r63, X.AnonymousClass005 r64, X.AnonymousClass005 r65) {
        /*
            r27 = this;
            r26 = 0
            r2 = r27
            r22 = r56
            r21 = r54
            r20 = r52
            r19 = r51
            r18 = r50
            r17 = r49
            r11 = r40
            r3 = r28
            r23 = r59
            r24 = r60
            r25 = r61
            r4 = r32
            r5 = r33
            r8 = r37
            r6 = r34
            r9 = r38
            r7 = r35
            r10 = r39
            r12 = r41
            r13 = r42
            r14 = r43
            r15 = r46
            r16 = r47
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = 0
            r2.A04 = r0
            r1 = 0
            X.4Zl r0 = new X.4Zl
            r0.<init>(r2, r1)
            r2.A0I = r0
            r0 = r45
            r2.A0A = r0
            r2.A0H = r6
            r0 = r48
            r2.A0J = r0
            r0 = r36
            r2.A08 = r0
            r0 = r53
            r2.A0B = r0
            r0 = r62
            r2.A0D = r0
            r0 = r31
            r2.A0G = r0
            r0 = r29
            r2.A0E = r0
            r0 = r30
            r2.A0F = r0
            r0 = r57
            r2.A0K = r0
            r0 = r58
            r2.A0L = r0
            r0 = r55
            r2.A0C = r0
            r0 = r63
            r2.A0O = r0
            r0 = r64
            r2.A0N = r0
            r0 = r65
            r2.A0M = r0
            r0 = r44
            r2.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43322Gx.<init>(X.01L, X.012, X.016, X.0v5, X.1dv, X.17Y, X.0wQ, X.1LI, X.164, X.3CG, X.1Kc, X.1Cd, X.1Pp, X.16I, X.171, X.1Ps, X.3Qf, X.0wo, X.0ts, X.1YG, X.12q, X.1A5, X.141, X.1H2, X.0yC, X.0xf, X.17z, X.1CF, X.11F, X.1Sf, X.1dE, X.1EM, X.13J, X.0wU, X.1El, X.005, X.005, X.005):void");
    }
}
