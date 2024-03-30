package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaDynamicRoundCornerImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.52b  reason: invalid class name and case insensitive filesystem */
public class C1028252b extends C97034oI {
    public int A00;
    public ValueAnimator A01;
    public CircularProgressBar A02;
    public AnonymousClass60n A03;
    public AnonymousClass1RJ A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final View A0A;
    public final View A0B;
    public final ViewGroup A0C;
    public final ViewGroup A0D;
    public final ViewGroup A0E;
    public final TextView A0F;
    public final TextEmojiLabel A0G;
    public final WaDynamicRoundCornerImageView A0H;
    public final WaImageView A0I;
    public final AnonymousClass6L2 A0J;
    public final VoiceParticipantAudioWave A0K;
    public final ThumbnailButton A0L;
    public final ThumbnailButton A0M;
    public final C18820ts A0N;
    public final C20810yC A0O;
    public final AnonymousClass3SF A0P;
    public final WaImageView A0Q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1028252b(android.view.View r16, X.AnonymousClass1LI r17, X.AnonymousClass16L r18, X.C116925lQ r19, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r20, X.AnonymousClass1Pp r21, X.AnonymousClass171 r22, X.C18820ts r23, X.C20810yC r24) {
        /*
            r15 = this;
            r8 = r15
            r9 = r16
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r24
            r15.A0O = r0
            r0 = r23
            r15.A0N = r0
            r0 = 2131427781(0x7f0b01c5, float:1.8477188E38)
            android.view.ViewGroup r0 = X.C36411kG.A0O(r9, r0)
            r15.A0C = r0
            r0 = 2131427783(0x7f0b01c7, float:1.8477192E38)
            r1 = 2131427783(0x7f0b01c7, float:1.8477192E38)
            com.whatsapp.TextEmojiLabel r0 = X.C36401kF.A0P(r9, r0)
            r15.A0G = r0
            r3 = 0
            if (r0 == 0) goto L_0x0177
            r0 = r17
            X.3SF r0 = X.AnonymousClass3SF.A01(r9, r0, r1)
            r15.A0P = r0
        L_0x0038:
            r0 = 2131427784(0x7f0b01c8, float:1.8477194E38)
            android.view.View r5 = X.C012005e.A02(r9, r0)
            com.whatsapp.components.button.ThumbnailButton r5 = (com.whatsapp.components.button.ThumbnailButton) r5
            r15.A0L = r5
            r0 = 2131427785(0x7f0b01c9, float:1.8477196E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = (com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave) r0
            r15.A0K = r0
            r0 = 2131431841(0x7f0b11a1, float:1.8485423E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r15.A0I = r0
            r0 = 2131434706(0x7f0b1cd2, float:1.8491234E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r15.A0Q = r0
            r0 = 2131428466(0x7f0b0472, float:1.8478577E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = (com.whatsapp.WaDynamicRoundCornerImageView) r0
            r15.A0H = r0
            r0 = 2131429358(0x7f0b07ee, float:1.8480386E38)
            android.view.View r0 = r9.findViewById(r0)
            r15.A0A = r0
            r0 = 2131434250(0x7f0b1b0a, float:1.8490309E38)
            android.view.ViewGroup r1 = X.C36411kG.A0P(r9, r0)
            r15.A0E = r1
            r0 = 2131432715(0x7f0b150b, float:1.8487195E38)
            android.view.ViewGroup r0 = X.C36411kG.A0P(r9, r0)
            r15.A0D = r0
            r0 = 2131432716(0x7f0b150c, float:1.8487197E38)
            android.view.View r4 = r9.findViewById(r0)
            com.whatsapp.components.button.ThumbnailButton r4 = (com.whatsapp.components.button.ThumbnailButton) r4
            r15.A0M = r4
            r0 = r3
            if (r1 == 0) goto L_0x009f
            r0 = 2131434239(0x7f0b1aff, float:1.8490286E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r1, r0)
        L_0x009f:
            r15.A0F = r0
            r0 = 2131434186(0x7f0b1aca, float:1.8490179E38)
            android.view.View r7 = r9.findViewById(r0)
            r15.A0B = r7
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168750(0x7f070dee, float:1.795181E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A06 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168752(0x7f070df0, float:1.7951815E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A08 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165557(0x7f070175, float:1.7945334E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A01 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168751(0x7f070def, float:1.7951813E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A07 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168753(0x7f070df1, float:1.7951817E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A09 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168784(0x7f070e10, float:1.795188E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A05 = r0
            android.content.res.Resources$Theme r2 = X.C36361kB.A09(r9)
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            r0 = 2130968849(0x7f040111, float:1.7546363E38)
            r1 = 1
            r2.resolveAttribute(r0, r6, r1)
            int r0 = r6.resourceId
            if (r0 != 0) goto L_0x010d
            r1 = 0
        L_0x010d:
            X.C18740tg.A0B(r1)
            if (r7 == 0) goto L_0x0127
            android.graphics.drawable.Drawable r2 = r7.getBackground()
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            if (r2 == 0) goto L_0x0127
            android.content.res.Resources r1 = r9.getResources()
            int r0 = r6.resourceId
            float r0 = X.C36441kJ.A00(r1, r0)
            r2.setCornerRadius(r0)
        L_0x0127:
            r7 = r9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            android.view.ViewGroup r0 = r15.A0C
            r6.add(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = r15.A0H
            if (r0 == 0) goto L_0x013a
            r6.add(r0)
        L_0x013a:
            android.view.ViewGroup r2 = r15.A0D
            if (r2 == 0) goto L_0x014c
            X.0yC r1 = r15.A0O
            r0 = 3153(0xc51, float:4.418E-42)
            int r1 = r1.A07(r0)
            r0 = 3
            if (r1 < r0) goto L_0x014c
            r6.add(r2)
        L_0x014c:
            X.6L2 r0 = new X.6L2
            r0.<init>(r7, r6)
            r15.A0J = r0
            android.util.DisplayMetrics r0 = X.C36361kB.A0B(r9)
            int r0 = r0.widthPixels
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r5.A01 = r1
            if (r4 == 0) goto L_0x0166
            r4.A01 = r1
        L_0x0166:
            r0 = 2131429278(0x7f0b079e, float:1.8480224E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto L_0x0174
            X.1RJ r3 = new X.1RJ
            r3.<init>(r0)
        L_0x0174:
            r15.A04 = r3
            return
        L_0x0177:
            r15.A0P = r3
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1028252b.<init>(android.view.View, X.1LI, X.16L, X.5lQ, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel, X.1Pp, X.171, X.0ts, X.0yC):void");
    }

    public static void A00(C1028252b r2) {
        if (r2.A02 != null) {
            ValueAnimator valueAnimator = r2.A01;
            if (valueAnimator != null) {
                valueAnimator.end();
                r2.A01 = null;
            }
            r2.A02.setVisibility(8);
            r2.A0A.setAlpha(0.0f);
        }
    }

    private void A01(C129066Eu r6) {
        WaImageView waImageView;
        boolean z;
        String A0H2;
        TextEmojiLabel textEmojiLabel;
        if (r6 != null && (waImageView = this.A0Q) != null) {
            int i = 1;
            if (this.A0C.getVisibility() == 8 || (textEmojiLabel = this.A0G) == null || textEmojiLabel.getVisibility() == 8) {
                z = true;
                if (r6.A0J) {
                    A0H2 = waImageView.getContext().getString(R.string.f12nameremoved);
                } else {
                    A0H2 = this.A0C.A0H(r6.A0a);
                }
            } else {
                z = false;
                A0H2 = "";
            }
            waImageView.setContentDescription(A0H2);
            if (!z) {
                i = 2;
            }
            waImageView.setImportantForAccessibility(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        if (r0 != false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(int r9) {
        /*
            r8 = this;
            int r0 = r8.A02
            if (r9 == r0) goto L_0x003e
            r8.A02 = r9
            boolean r0 = r8 instanceof X.C1028152a
            if (r0 == 0) goto L_0x019c
            X.6Eu r0 = r8.A05
            if (r0 == 0) goto L_0x0034
            com.whatsapp.components.button.ThumbnailButton r3 = r8.A0L
            android.content.res.Resources r2 = X.C36341k9.A0F(r3)
            int r0 = r8.A02
            switch(r0) {
                case 4: goto L_0x018e;
                case 5: goto L_0x018e;
                case 6: goto L_0x0180;
                case 7: goto L_0x0180;
                case 8: goto L_0x0180;
                case 9: goto L_0x017b;
                default: goto L_0x0019;
            }
        L_0x0019:
            X.6Eu r0 = r8.A05
            boolean r0 = r0.A0K
            r1 = 2131168802(0x7f070e22, float:1.7951916E38)
            if (r0 == 0) goto L_0x0025
            r1 = 2131168832(0x7f070e40, float:1.7951977E38)
        L_0x0025:
            int r1 = r2.getDimensionPixelSize(r1)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r0.height = r1
            r0.width = r1
            r3.setLayoutParams(r0)
        L_0x0034:
            r0 = 0
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r2 = r8.A0K
            if (r2 == 0) goto L_0x003e
            float r1 = (float) r0
            r0 = 1
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave.A02(r2, r1, r0)
        L_0x003e:
            r5 = r8
            boolean r0 = r8 instanceof X.C1028152a
            if (r0 == 0) goto L_0x0141
            X.52a r5 = (X.C1028152a) r5
            X.6Eu r0 = r5.A05
            if (r0 == 0) goto L_0x00df
            com.whatsapp.TextEmojiLabel r4 = r5.A0G
            android.content.res.Resources r2 = X.C36341k9.A0F(r4)
            int r1 = r5.A02
            r0 = 4
            if (r1 == r0) goto L_0x0138
            r0 = 5
            if (r1 == r0) goto L_0x0138
            X.6Eu r0 = r5.A05
            boolean r1 = r0.A0K
            r0 = 2131168796(0x7f070e1c, float:1.7951904E38)
        L_0x005e:
            if (r1 == 0) goto L_0x0063
            r0 = 2131168826(0x7f070e3a, float:1.7951965E38)
        L_0x0063:
            int r0 = r2.getDimensionPixelSize(r0)
            r3 = 0
            float r0 = (float) r0
            r4.setTextSize(r3, r0)
            X.6Eu r0 = r5.A05
            if (r0 == 0) goto L_0x00df
            com.whatsapp.components.button.ThumbnailButton r0 = r5.A0L
            android.content.res.Resources r2 = X.C36341k9.A0F(r0)
            int r7 = r5.A02
            r0 = 4
            if (r7 == r0) goto L_0x0113
            r0 = 5
            if (r7 == r0) goto L_0x0113
            r0 = 6
            if (r7 == r0) goto L_0x00ef
            r0 = 7
            if (r7 == r0) goto L_0x00ef
            r1 = 9
            r0 = 2131168794(0x7f070e1a, float:1.79519E38)
            int r6 = r2.getDimensionPixelSize(r0)
            if (r7 == r1) goto L_0x00e7
            X.6Eu r0 = r5.A05
            boolean r1 = r0.A0K
            r0 = 2131168799(0x7f070e1f, float:1.795191E38)
            if (r1 == 0) goto L_0x009b
            r0 = 2131168829(0x7f070e3d, float:1.795197E38)
        L_0x009b:
            int r7 = r2.getDimensionPixelSize(r0)
            X.6Eu r0 = r5.A05
            boolean r0 = r0.A0K
            r1 = 2131168791(0x7f070e17, float:1.7951894E38)
            if (r0 == 0) goto L_0x00ab
        L_0x00a8:
            r1 = 2131168825(0x7f070e39, float:1.7951963E38)
        L_0x00ab:
            int r2 = r2.getDimensionPixelSize(r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r4)
            r0.setMargins(r3, r7, r3, r3)
            r0.height = r6
            r4.setLayoutParams(r0)
            android.widget.TextView r1 = r5.A00
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r1)
            r0.setMargins(r3, r2, r3, r3)
            r1.setLayoutParams(r0)
            android.widget.TextView r1 = r5.A01
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r1)
            r0.setMargins(r3, r2, r3, r3)
            r1.setLayoutParams(r0)
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r1 = r5.A0K
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r1)
            r0.setMargins(r3, r2, r3, r3)
            r1.setLayoutParams(r0)
        L_0x00df:
            android.view.ViewGroup r1 = r8.A0E
            android.widget.TextView r0 = r8.A0F
            r8.A0F(r1, r0)
            return
        L_0x00e7:
            r0 = 2131168829(0x7f070e3d, float:1.795197E38)
            int r7 = r2.getDimensionPixelSize(r0)
            goto L_0x00a8
        L_0x00ef:
            r0 = 2131168793(0x7f070e19, float:1.7951898E38)
            int r6 = r2.getDimensionPixelSize(r0)
            X.6Eu r0 = r5.A05
            boolean r1 = r0.A0K
            r0 = 2131168798(0x7f070e1e, float:1.7951908E38)
            if (r1 == 0) goto L_0x0102
            r0 = 2131168828(0x7f070e3c, float:1.7951969E38)
        L_0x0102:
            int r7 = r2.getDimensionPixelSize(r0)
            X.6Eu r0 = r5.A05
            boolean r0 = r0.A0K
            r1 = 2131168790(0x7f070e16, float:1.7951892E38)
            if (r0 == 0) goto L_0x00ab
            r1 = 2131168824(0x7f070e38, float:1.795196E38)
            goto L_0x00ab
        L_0x0113:
            r0 = 2131168792(0x7f070e18, float:1.7951896E38)
            int r6 = r2.getDimensionPixelSize(r0)
            X.6Eu r0 = r5.A05
            boolean r1 = r0.A0K
            r0 = 2131168797(0x7f070e1d, float:1.7951906E38)
            if (r1 == 0) goto L_0x0126
            r0 = 2131168827(0x7f070e3b, float:1.7951967E38)
        L_0x0126:
            int r7 = r2.getDimensionPixelSize(r0)
            X.6Eu r0 = r5.A05
            boolean r0 = r0.A0K
            r1 = 2131168789(0x7f070e15, float:1.795189E38)
            if (r0 == 0) goto L_0x00ab
            r1 = 2131168823(0x7f070e37, float:1.7951959E38)
            goto L_0x00ab
        L_0x0138:
            X.6Eu r0 = r5.A05
            boolean r1 = r0.A0K
            r0 = 2131168795(0x7f070e1b, float:1.7951902E38)
            goto L_0x005e
        L_0x0141:
            com.whatsapp.TextEmojiLabel r3 = r8.A0G
            if (r3 == 0) goto L_0x00df
            int r1 = r8.A02
            if (r1 == 0) goto L_0x00df
            int r4 = r8.A09
            r0 = 1
            if (r1 == r0) goto L_0x0151
            r0 = 3
            if (r1 != r0) goto L_0x016a
        L_0x0151:
            android.view.View r0 = r8.A0H
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r2 = r0.height
            int r0 = r8.A05
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x0171
            float r1 = (float) r2
            r0 = 1042536202(0x3e23d70a, float:0.16)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = r8.A07
            int r4 = java.lang.Math.min(r1, r0)
        L_0x016a:
            r1 = 0
            float r0 = (float) r4
            r3.setTextSize(r1, r0)
            goto L_0x00df
        L_0x0171:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceParticipantViewHolder/updateParticipantNameTextSize, gridHeight <= 0: "
            X.C36321k7.A1T(r0, r1, r2)
            goto L_0x016a
        L_0x017b:
            r1 = 2131168816(0x7f070e30, float:1.7951945E38)
            goto L_0x0025
        L_0x0180:
            X.6Eu r0 = r8.A05
            boolean r0 = r0.A0K
            r1 = 2131168801(0x7f070e21, float:1.7951914E38)
            if (r0 == 0) goto L_0x0025
            r1 = 2131168831(0x7f070e3f, float:1.7951975E38)
            goto L_0x0025
        L_0x018e:
            X.6Eu r0 = r8.A05
            boolean r0 = r0.A0K
            r1 = 2131168800(0x7f070e20, float:1.7951912E38)
            if (r0 == 0) goto L_0x0025
            r1 = 2131168830(0x7f070e3e, float:1.7951973E38)
            goto L_0x0025
        L_0x019c:
            r0 = 2
            r3 = 1050253722(0x3e99999a, float:0.3)
            if (r9 == r0) goto L_0x01ba
            r3 = 1051260355(0x3ea8f5c3, float:0.33)
            if (r9 == r0) goto L_0x01ba
            int r2 = r8.A06
        L_0x01a9:
            com.whatsapp.components.button.ThumbnailButton r1 = r8.A0L
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.0BJ r0 = (X.AnonymousClass0BJ) r0
            r0.A06 = r3
            r0.A0Y = r2
            r1.setLayoutParams(r0)
            goto L_0x0034
        L_0x01ba:
            int r2 = r8.A08
            goto L_0x01a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1028252b.A0D(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x021b, code lost:
        if (r2 != false) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018b, code lost:
        if (r0.A0D == r13.A0D) goto L_0x018d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C129066Eu r13) {
        /*
            r12 = this;
            X.6Eu r0 = r12.A05
            r3 = 0
            if (r0 == 0) goto L_0x000b
            boolean r0 = X.C129066Eu.A00(r0, r13)
            if (r0 != 0) goto L_0x0069
        L_0x000b:
            r12.A01(r13)
            android.view.View r4 = r12.A0H
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r13.A02
            int r1 = X.AnonymousClass3UE.A01(r1, r0)
            r12.A00 = r1
            boolean r0 = r12 instanceof X.C1028152a
            if (r0 == 0) goto L_0x02f3
            com.whatsapp.TextEmojiLabel r2 = r12.A0G
            if (r2 == 0) goto L_0x002e
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131103050(0x7f060d4a, float:1.7818555E38)
            X.C36351kA.A15(r1, r2, r0)
        L_0x002e:
            r12.A06 = r3
            android.view.View r0 = r12.A0B
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r12.A01
            if (r1 == 0) goto L_0x0041
            r1.setStroke(r0, r3)
        L_0x0041:
            A00(r12)
            r0 = 38
            X.7sz r5 = new X.7sz
            r5.<init>(r12, r0)
            r12.A09 = r5
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r12.A04
            if (r0 == 0) goto L_0x0066
            X.61t r4 = r0.A0X
            com.whatsapp.jid.UserJid r2 = r13.A0b
            java.util.Map r1 = r4.A01
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x0061
            r0 = 0
            r1.put(r2, r0)
        L_0x0061:
            java.util.Map r0 = r4.A00
            r0.put(r2, r5)
        L_0x0066:
            r12.A0J(r13, r3)
        L_0x0069:
            android.view.View r4 = r12.A0H
            float r0 = r13.A00
            r4.setAlpha(r0)
            r12.A0I(r13)
            boolean r0 = r13.A0D
            r5 = 0
            r2 = 8
            if (r0 == 0) goto L_0x02d5
            android.view.ViewGroup r0 = r12.A0D
            if (r0 == 0) goto L_0x02d5
            r1 = 0
            r5 = 8
        L_0x0081:
            android.view.ViewGroup r0 = r12.A0E
            if (r0 == 0) goto L_0x0088
            r0.setVisibility(r5)
        L_0x0088:
            android.view.ViewGroup r6 = r12.A0C
            r6.setVisibility(r2)
            android.view.ViewGroup r5 = r12.A0D
            if (r5 == 0) goto L_0x0094
            r5.setVisibility(r1)
        L_0x0094:
            r12.A01(r13)
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x010a
            boolean r0 = r13.A0E
            if (r0 == 0) goto L_0x010a
            com.whatsapp.CircularProgressBar r0 = r12.A02
            r7 = -1
            if (r0 != 0) goto L_0x00cf
            android.content.Context r1 = r4.getContext()
            com.whatsapp.CircularProgressBar r0 = new com.whatsapp.CircularProgressBar
            r0.<init>(r1)
            r12.A02 = r0
            r0.A0A = r7
            android.content.res.Resources r1 = X.C36341k9.A0F(r4)
            r0 = 2131165562(0x7f07017a, float:1.7945345E38)
            int r0 = r1.getDimensionPixelSize(r0)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r0, r0)
            r0 = 17
            r2.gravity = r0
            r1 = r4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.whatsapp.CircularProgressBar r0 = r12.A02
            r1.addView(r0, r2)
        L_0x00cf:
            com.whatsapp.CircularProgressBar r0 = r12.A02
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00db
            android.animation.ValueAnimator r0 = r12.A01
            if (r0 != 0) goto L_0x010a
        L_0x00db:
            com.whatsapp.CircularProgressBar r0 = r12.A02
            r0.setVisibility(r3)
            android.view.View r1 = r12.A0A
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            int[] r0 = X.C36441kJ.A1O()
            r0 = {0, 100} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r12.A01 = r2
            r0 = 750(0x2ee, double:3.705E-321)
            r2.setDuration(r0)
            android.animation.ValueAnimator r0 = r12.A01
            r0.setRepeatCount(r7)
            android.animation.ValueAnimator r1 = r12.A01
            r0 = 15
            X.C162337oQ.A00(r1, r12, r0)
            android.animation.ValueAnimator r0 = r12.A01
            r0.start()
        L_0x010a:
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x0119
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r1 = r12.A0K
            if (r1 == 0) goto L_0x02c6
            boolean r0 = r13.A0U
            r1.setMuteIconVisibility(r0)
        L_0x0119:
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x0182
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r2 = r12.A0K
            if (r2 == 0) goto L_0x0182
            int r1 = r13.A01
            r0 = -1
            if (r1 == r0) goto L_0x02c2
            android.content.res.Resources r1 = r2.getResources()
            int r0 = r13.A01
            int r0 = r1.getColor(r0)
        L_0x0132:
            r2.setColor(r0)
            boolean r0 = r13.A0N
            if (r0 == 0) goto L_0x013d
            r0 = 0
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave.A02(r2, r0, r3)
        L_0x013d:
            boolean r1 = r13.A0O
            android.animation.ValueAnimator r0 = r2.A03
            if (r0 == 0) goto L_0x0146
            r0.cancel()
        L_0x0146:
            if (r1 == 0) goto L_0x0177
            r8 = 2
            float[] r0 = new float[r8]
            r0 = {1036831949, 1058642330} // fill-array
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r0)
            r2.A03 = r7
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.setDuration(r0)
            android.animation.ValueAnimator r1 = r2.A03
            android.view.animation.Interpolator r0 = r2.A0H
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r2.A03
            r0 = -1
            r1.setRepeatCount(r0)
            android.animation.ValueAnimator r0 = r2.A03
            r0.setRepeatMode(r8)
            android.animation.ValueAnimator r1 = r2.A03
            r0 = 14
            X.C111565cU.A00(r1, r2, r0)
            android.animation.ValueAnimator r0 = r2.A03
            r0.start()
        L_0x0177:
            X.3Bc r0 = r13.A09
            if (r0 == 0) goto L_0x02ad
            java.lang.CharSequence r0 = X.C90474aD.A0V(r2, r0)
        L_0x017f:
            r2.setContentDescription(r0)
        L_0x0182:
            X.6Eu r0 = r12.A05
            if (r0 == 0) goto L_0x018d
            boolean r2 = r0.A0D
            boolean r0 = r13.A0D
            r1 = 1
            if (r2 != r0) goto L_0x018e
        L_0x018d:
            r1 = 0
        L_0x018e:
            int r7 = r13.A06
            int r0 = r12.A03
            if (r0 != r7) goto L_0x0221
            if (r1 != 0) goto L_0x0221
        L_0x0196:
            boolean r0 = r13.A0P
            if (r0 != 0) goto L_0x019e
            boolean r0 = r13.A0Q
            if (r0 == 0) goto L_0x01a2
        L_0x019e:
            r0 = 1
            X.AnonymousClass6UI.A00(r4, r12, r0)
        L_0x01a2:
            boolean r0 = r13.A0P
            if (r0 == 0) goto L_0x01ab
            r0 = 41
            X.C36411kG.A1C(r4, r12, r13, r0)
        L_0x01ab:
            boolean r0 = r13.A0Q
            if (r0 == 0) goto L_0x01b8
            r1 = 1
            X.7qO r0 = new X.7qO
            r0.<init>(r12, r13, r1)
            r4.setOnLongClickListener(r0)
        L_0x01b8:
            boolean r0 = r13.A0K
            if (r0 == 0) goto L_0x01ff
            boolean r5 = r13.A0F
            boolean r2 = r13.A0B
            boolean r1 = r13.A0D
            boolean r0 = r13.A01()
            if (r0 != 0) goto L_0x021d
            if (r1 == 0) goto L_0x0216
            r0 = 2131165563(0x7f07017b, float:1.7945347E38)
        L_0x01cd:
            int r2 = X.C36371kC.A03(r4, r0)
            int r0 = r12.A00
            if (r0 == r2) goto L_0x01ff
            r12.A00 = r2
            com.whatsapp.WaImageView r1 = r12.A0Q
            boolean r0 = r1 instanceof com.whatsapp.WaDynamicRoundCornerImageView
            if (r0 == 0) goto L_0x01e3
            com.whatsapp.WaDynamicRoundCornerImageView r1 = (com.whatsapp.WaDynamicRoundCornerImageView) r1
            float r0 = (float) r2
            r1.setRadius(r0)
        L_0x01e3:
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r12.A0H
            if (r1 == 0) goto L_0x01ed
            int r0 = r12.A00
            float r0 = (float) r0
            r1.setRadius(r0)
        L_0x01ed:
            android.view.View r0 = r12.A0B
            if (r0 == 0) goto L_0x01ff
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x01ff
            int r0 = r12.A00
            float r0 = (float) r0
            r1.setCornerRadius(r0)
        L_0x01ff:
            X.1RJ r1 = r12.A04
            if (r1 == 0) goto L_0x0210
            boolean r0 = r13.A0S
            if (r0 == 0) goto L_0x0213
            boolean r0 = r13.A01()
            if (r0 != 0) goto L_0x0213
        L_0x020d:
            r1.A03(r3)
        L_0x0210:
            r12.A05 = r13
            return
        L_0x0213:
            r3 = 8
            goto L_0x020d
        L_0x0216:
            if (r5 == 0) goto L_0x021d
            r0 = 2131165568(0x7f070180, float:1.7945357E38)
            if (r2 == 0) goto L_0x01cd
        L_0x021d:
            r0 = 2131165556(0x7f070174, float:1.7945332E38)
            goto L_0x01cd
        L_0x0221:
            r12.A03 = r7
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x029d
            float r2 = (float) r7
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r2 = r2 * r0
            com.whatsapp.WaDynamicRoundCornerImageView r0 = r12.A0H
            if (r0 == 0) goto L_0x0232
            X.C53412rH.A00(r0, r7)
        L_0x0232:
            int r1 = r12.A03
            r7 = 3
            r10 = 1127481344(0x43340000, float:180.0)
            r9 = 1
            r8 = 0
            if (r1 == r9) goto L_0x028e
            r0 = 2
            if (r1 == r0) goto L_0x024a
            if (r1 != r7) goto L_0x029b
            int r1 = r12.A01
            r0 = 8
            if (r1 != r0) goto L_0x029a
            float r2 = r2 - r10
            r8 = r2
            r2 = 1127481344(0x43340000, float:180.0)
        L_0x024a:
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r10 = r12.A0K
            if (r10 == 0) goto L_0x0269
            android.view.ViewGroup$MarginLayoutParams r11 = X.AnonymousClass000.A0a(r10)
            int r1 = r12.A03
            r0 = 0
            if (r1 == r9) goto L_0x0259
            if (r1 != r7) goto L_0x0264
        L_0x0259:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165345(0x7f0700a1, float:1.7944904E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x0264:
            r11.topMargin = r0
            r10.setLayoutParams(r11)
        L_0x0269:
            com.whatsapp.components.button.ThumbnailButton r0 = r12.A0L
            r0.setRotation(r8)
            if (r10 == 0) goto L_0x0273
            r10.setRotation(r8)
        L_0x0273:
            if (r5 == 0) goto L_0x0289
            X.0yC r1 = r12.A0O
            r0 = 3153(0xc51, float:4.418E-42)
            int r0 = r1.A07(r0)
            if (r0 < r7) goto L_0x0289
            r5.setRotation(r2)
            com.whatsapp.components.button.ThumbnailButton r0 = r12.A0M
            if (r0 == 0) goto L_0x0289
            r0.setRotation(r8)
        L_0x0289:
            r6.setRotation(r2)
            goto L_0x0196
        L_0x028e:
            int r1 = r12.A01
            r0 = 8
            if (r1 == r0) goto L_0x029a
            float r8 = r2 - r10
            r0 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 - r0
            goto L_0x024a
        L_0x029a:
            r8 = r2
        L_0x029b:
            r2 = 0
            goto L_0x024a
        L_0x029d:
            X.6L2 r1 = r12.A0J
            r0 = 1
            r1.A03 = r0
            int r0 = r1.A02
            if (r7 == r0) goto L_0x0196
            r1.A02 = r7
            X.AnonymousClass6L2.A00(r1)
            goto L_0x0196
        L_0x02ad:
            boolean r0 = r13.A0U
            if (r0 == 0) goto L_0x02be
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131896036(0x7f1226e4, float:1.9426922E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x017f
        L_0x02be:
            java.lang.String r0 = ""
            goto L_0x017f
        L_0x02c2:
            int r0 = r12.A00
            goto L_0x0132
        L_0x02c6:
            com.whatsapp.WaImageView r1 = r12.A0I
            if (r1 == 0) goto L_0x0119
            boolean r0 = r13.A0U
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            goto L_0x0119
        L_0x02d5:
            android.widget.TextView r1 = r12.A0F
            if (r1 == 0) goto L_0x02ec
            boolean r0 = r13.A0K
            if (r0 == 0) goto L_0x02ec
            X.3Bc r0 = r13.A09
            if (r0 == 0) goto L_0x02ec
            java.lang.CharSequence r0 = X.C90474aD.A0V(r1, r0)
            r1.setText(r0)
            r1 = 8
            goto L_0x0081
        L_0x02ec:
            r1 = 8
            r5 = 8
            r2 = 0
            goto L_0x0081
        L_0x02f3:
            com.whatsapp.TextEmojiLabel r0 = r12.A0G
            if (r0 == 0) goto L_0x002e
            r0.setTextColor(r1)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1028252b.A0H(X.6Eu):void");
    }

    public void A0I(C129066Eu r6) {
        AnonymousClass3SF r2;
        TextEmojiLabel textEmojiLabel = this.A0G;
        if (textEmojiLabel != null && (r2 = this.A0P) != null) {
            textEmojiLabel.setVisibility(C36351kA.A00(r6.A0V ? 1 : 0));
            if (r6.A0J) {
                r2.A02();
                return;
            }
            AnonymousClass141 r3 = r6.A0a;
            if (r3.A0N()) {
                C20810yC r4 = this.A0O;
                if (r4.A07(4067) >= 2 && r4.A0E(4455)) {
                    r2.A05(r3);
                    return;
                }
            }
            CallGridViewModel callGridViewModel = this.A04;
            if (callGridViewModel != null && C36351kA.A1W(callGridViewModel.A0p) && !r3.A0B()) {
                AnonymousClass171 r1 = this.A0C;
                if (AnonymousClass171.A06(r3)) {
                    r2.A01.setText(AnonymousClass171.A03(r1, r3, R.string.f12nameremoved));
                    return;
                }
            }
            String A0H2 = this.A0C.A0H(r3);
            TextEmojiLabel textEmojiLabel2 = r2.A01;
            textEmojiLabel2.setText(A0H2);
            textEmojiLabel2.A0E();
        }
    }

    public void A0J(C129066Eu r5, boolean z) {
        AnonymousClass141 r3 = r5.A0a;
        A0G(this.A0L, r3, false, false);
        ThumbnailButton thumbnailButton = this.A0M;
        if (thumbnailButton != null) {
            A0G(thumbnailButton, r3, false, false);
        }
        WaDynamicRoundCornerImageView waDynamicRoundCornerImageView = this.A0H;
        if (waDynamicRoundCornerImageView != null && r5.A0Y) {
            A0G(waDynamicRoundCornerImageView, r3, true, z);
            waDynamicRoundCornerImageView.setVisibility(0);
        }
    }

    public void A0B() {
        C129066Eu r0;
        AnonymousClass04S r4;
        if (A0A()) {
            CallGridViewModel callGridViewModel = this.A04;
            if (!(callGridViewModel == null || (r0 = this.A05) == null || (r4 = this.A09) == null)) {
                C1258961t r1 = callGridViewModel.A0X;
                UserJid userJid = r0.A0b;
                Map map = r1.A01;
                if (map.containsKey(userJid)) {
                    Map map2 = r1.A00;
                    if (r4.equals(map2.get(userJid))) {
                        map2.remove(userJid);
                        map.remove(userJid);
                    }
                }
                this.A09 = null;
            }
            this.A05 = null;
            A00(this);
        }
    }
}
