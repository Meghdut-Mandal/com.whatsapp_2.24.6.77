package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.whatsapp.Mp4Ops;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.YoutubePlayerTouchOverlay;
import java.net.URL;

/* renamed from: X.70b  reason: invalid class name and case insensitive filesystem */
public class C1491570b implements C88974Ut {
    public int A00 = 3;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public FrameLayout A05;
    public C64933Qa A06;
    public AnonymousClass5ND A07;
    public C92754eZ A08;
    public AnonymousClass3DS A09;
    public C65083Qq A0A;
    public String A0B;
    public URL A0C;
    public URL A0D;
    public boolean A0E;
    public double A0F;
    public int A0G = 0;
    public int A0H = 0;
    public AnonymousClass31H A0I;
    public boolean A0J;
    public final Context A0K;
    public final Rect A0L = AnonymousClass001.A06();
    public final C24801Dv A0M;
    public final AnonymousClass17Y A0N;
    public final C21060yb A0O;
    public final C18820ts A0P;
    public final C20810yC A0Q;
    public final C19770wU A0R;
    public final C124685yd A0S;
    public final C19700wN A0T;
    public final C115275ic A0U;
    public final Mp4Ops A0V;
    public final AnonymousClass1AV A0W;
    public final C19630wG A0X;
    public final C21010yW A0Y;
    public final AnonymousClass1DU A0Z;
    public final C24811Dw A0a;
    public final AnonymousClass005 A0b;

    public static void A00(Context context, Rect rect, Rect rect2, View view, AnonymousClass5ND r13, C92754eZ r14, boolean z) {
        float f;
        float width;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        r14.getFullscreenControls();
        r14.getInlineControls();
        context.getResources().getColor(R.color.f6nameremoved);
        context.getResources().getColor(R.color.f6nameremoved);
        float f2 = 1.0f;
        if (r13 == null || !z) {
            f = 1.0f;
        } else {
            f = r13.A00;
        }
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 0.0f) == 0.0f) {
            view.setX((float) rect.left);
            view.setY((float) rect.top);
            view.setScaleX(f);
            view.setScaleY(f);
            view.requestLayout();
            return;
        }
        float width2 = ((float) rect2.width()) / ((float) rect2.height());
        float width3 = ((float) rect.width()) / ((float) rect.height());
        if (z ? width2 >= width3 : width2 <= width3) {
            width = ((float) rect.width()) / ((float) rect2.width());
            float height = ((((float) rect2.height()) * width) - ((float) rect.height())) / 2.0f;
            rect.top = (int) (((float) rect.top) - height);
            rect.bottom = (int) (((float) rect.bottom) + height);
        } else {
            width = ((float) rect.height()) / ((float) rect2.height());
            float width4 = ((((float) rect2.width()) * width) - ((float) rect.width())) / 2.0f;
            rect.left = (int) (((float) rect.left) - width4);
            rect.right = (int) (((float) rect.right) + width4);
        }
        if (Float.isNaN(width) || Float.isInfinite(width)) {
            width = 1.0f;
        }
        if (!Float.isNaN(f) && !Float.isInfinite(f)) {
            f2 = f;
        }
        AnimatorSet A0C2 = C36441kJ.A0C();
        Property property = View.X;
        float[] fArr = new float[2];
        fArr[0] = (float) rect.left;
        AnimatorSet.Builder play = A0C2.play(C90524aI.A08(property, view, fArr, (float) rect2.left, 1));
        Property property2 = View.Y;
        float[] fArr2 = new float[2];
        fArr2[0] = (float) rect.top;
        AnimatorSet.Builder with = play.with(C90524aI.A08(property2, view, fArr2, (float) rect2.top, 1));
        Property property3 = View.SCALE_X;
        float[] fArr3 = new float[2];
        fArr3[0] = width;
        AnimatorSet.Builder with2 = with.with(C90524aI.A08(property3, view, fArr3, f2, 1));
        Property property4 = View.SCALE_Y;
        float[] fArr4 = new float[2];
        fArr4[0] = width;
        with2.with(C90524aI.A08(property4, view, fArr4, f2, 1));
        A0C2.setDuration(250);
        C36391kE.A13(A0C2);
        A0C2.start();
    }

    public static void A01(C1491570b r5) {
        String str = r5.A0B;
        Context context = r5.A0K;
        C124685yd r3 = r5.A0S;
        C24801Dv r2 = r5.A0M;
        if (str != null) {
            r2.Bp7(context, Uri.parse(str), (AnonymousClass3T1) null);
        }
        r3.A02 = true;
        r3.A00 = null;
        r5.B34();
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [X.3Qq] */
    /* JADX WARNING: type inference failed for: r16v5, types: [X.5NR] */
    /* JADX WARNING: type inference failed for: r14v9, types: [X.5NQ] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r11v0 X.3Qa) = (r31v0 X.3Qa)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public void A02(X.C145166tS r28, X.AnonymousClass5BJ r29, X.AnonymousClass3T1 r30, X.C64933Qa r31, android.graphics.Bitmap[] r32, int r33) {
        /*
            r27 = this;
            r4 = r27
            X.3Qq r0 = r4.A0A
            if (r0 != 0) goto L_0x039b
            X.3Qa r0 = r4.A06
            r11 = r31
            if (r11 != r0) goto L_0x039b
            r0 = 2
            r6 = r33
            if (r6 == r0) goto L_0x0018
            r0 = 5
            if (r6 == r0) goto L_0x0018
            r0 = 3
            r14 = 0
            if (r6 != r0) goto L_0x0019
        L_0x0018:
            r14 = 1
        L_0x0019:
            r9 = 0
            r8 = r28
            if (r28 == 0) goto L_0x0045
            if (r14 == 0) goto L_0x0045
            java.lang.String r5 = r8.A0D
            java.lang.String r3 = r8.A0E
            if (r5 == 0) goto L_0x003d
            if (r3 == 0) goto L_0x003d
            X.0ts r0 = r4.A0P
            boolean r2 = X.C36401kF.A1X(r0)
            java.lang.String r1 = " - "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            if (r2 == 0) goto L_0x0056
            X.AnonymousClass000.A1D(r3, r1, r5, r0)
        L_0x0039:
            java.lang.String r9 = r0.toString()
        L_0x003d:
            java.net.URL r0 = r8.A0J
            r4.A0D = r0
            java.net.URL r0 = r8.A0H
            r4.A0C = r0
        L_0x0045:
            r7 = r29
            if (r29 != 0) goto L_0x0065
            java.lang.String r0 = "InlineVideoPlaybackImplHandler/startInlinePlayback - loadPage returned null.  Opening video externally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r4.A0B
            X.166 r1 = X.C64033Mj.A00
            monitor-enter(r1)
            if (r0 == 0) goto L_0x005d
            goto L_0x005a
        L_0x0056:
            X.AnonymousClass000.A1D(r5, r1, r3, r0)
            goto L_0x0039
        L_0x005a:
            r1.remove(r0)     // Catch:{ all -> 0x0062 }
        L_0x005d:
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            A01(r4)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            throw r0
        L_0x0065:
            X.5yd r5 = r4.A0S
            X.6Ea r0 = r5.A07
            r0.A02()
            X.6Ea r0 = r5.A08
            r0.A02()
            X.0wU r13 = r4.A0R
            X.1Dw r2 = r4.A0a
            java.util.Objects.requireNonNull(r2)
            r1 = 9
            X.72p r0 = new X.72p
            r0.<init>(r2, r1)
            r13.Boy(r0)
            X.3DS r1 = r4.A09
            if (r1 == 0) goto L_0x008c
            r0 = 2
            r1.A00(r11, r0)
            r4.A00 = r0
        L_0x008c:
            int r1 = r7.A00
            r10 = -1
            if (r1 == r10) goto L_0x0380
            int r0 = r7.A01
            if (r0 == r10) goto L_0x0380
            double r2 = (double) r0
            double r0 = (double) r1
            double r2 = r2 / r0
        L_0x0098:
            double r0 = r4.A0F
            double r0 = r0 / r2
            double r0 = java.lang.Math.sqrt(r0)
            int r12 = (int) r0
            r4.A02 = r12
            double r0 = (double) r12
            double r0 = r0 * r2
            int r2 = (int) r0
            r4.A04 = r2
            r4.A01 = r12
            android.content.Context r1 = r4.A0K
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131166825(0x7f070669, float:1.7947906E38)
            int r2 = r2.getDimensionPixelSize(r0)
            int r0 = r4.A01
            int r0 = r0 + r2
            r4.A01 = r0
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131166826(0x7f07066a, float:1.7947908E38)
            float r0 = r2.getDimension(r0)
            int r0 = (int) r0
            X.5NF r2 = new X.5NF
            r2.<init>(r1, r0)
            r4.A05 = r2
            boolean r0 = r4.A0E
            r2.setIsFullscreen(r0)
            r0 = 2131890483(0x7f121133, float:1.941566E38)
            X.C36331k8.A0q(r1, r2, r0)
            android.widget.FrameLayout r0 = r4.A05
            r3 = 1
            r0.setFocusable(r3)
            android.widget.FrameLayout r0 = r4.A05
            r0.setImportantForAccessibility(r3)
            android.widget.FrameLayout r0 = r4.A05
            r0.setFocusableInTouchMode(r3)
            X.5ND r2 = r4.A07
            X.70Z r0 = new X.70Z
            r0.<init>(r4)
            r2.A0H = r0
            r4.A0J = r3
            android.widget.FrameLayout r2 = r4.A05
            r0 = 1086324736(0x40c00000, float:6.0)
            X.C011004s.A05(r2, r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r1)
            android.widget.FrameLayout r2 = r4.A05
            r2.addView(r0)
            X.5NK r2 = new X.5NK
            r2.<init>(r1, r5, r6)
            r4.A08 = r2
            r2 = 0
            r3 = r32[r2]
            if (r3 == 0) goto L_0x0129
            X.0yC r5 = r4.A0Q
            r3 = 1052(0x41c, float:1.474E-42)
            boolean r3 = r5.A0E(r3)
            if (r3 != 0) goto L_0x0129
            X.4eZ r5 = r4.A08
            r3 = 2131427893(0x7f0b0235, float:1.8477415E38)
            android.widget.ImageView r5 = X.C36401kF.A0G(r5, r3)
            r3 = r32[r2]
            r5.setImageBitmap(r3)
        L_0x0129:
            if (r9 == 0) goto L_0x0147
            X.0yC r5 = r4.A0Q
            r3 = 1912(0x778, float:2.679E-42)
            boolean r3 = r5.A0E(r3)
            if (r3 == 0) goto L_0x0147
            X.4eZ r3 = r4.A08
            X.5NK r3 = (X.AnonymousClass5NK) r3
            r3.setVideoAttribution(r9)
            X.4eZ r9 = r4.A08
            r5 = 3
            X.7qE r3 = new X.7qE
            r3.<init>(r4, r5)
            r9.setMusicAttributionClickListener(r3)
        L_0x0147:
            if (r14 == 0) goto L_0x017d
            if (r28 == 0) goto L_0x017d
            java.lang.String r5 = r8.A0B
            java.lang.String r12 = r8.A08
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x015b
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            if (r3 != 0) goto L_0x017d
        L_0x015b:
            X.0yC r9 = r4.A0Q
            r3 = 2299(0x8fb, float:3.222E-42)
            boolean r3 = r9.A0E(r3)
            if (r3 == 0) goto L_0x017d
            X.4eZ r3 = r4.A08
            X.5NK r3 = (X.AnonymousClass5NK) r3
            r3.setVideoCaption(r5)
            X.4eZ r9 = r4.A08
            X.5NK r9 = (X.AnonymousClass5NK) r9
            r5 = 2
            X.7qE r3 = new X.7qE
            r3.<init>(r4, r5)
            r9.setAuthorInformation(r12, r3)
            r3 = 1
            X.C1498172w.A02(r13, r4, r8, r3)
        L_0x017d:
            X.4eZ r5 = r4.A08
            X.7qE r3 = new X.7qE
            r3.<init>(r4, r2)
            r5.setCloseButtonListener(r3)
            X.4eZ r14 = r4.A08
            r5 = 1
            X.7qE r3 = new X.7qE
            r3.<init>(r4, r5)
            X.5NK r14 = (X.AnonymousClass5NK) r14
            r14.A0G = r3
            boolean r3 = X.AnonymousClass5NK.A06(r14)
            r9 = 8
            if (r3 == 0) goto L_0x0374
            android.widget.ImageButton r12 = r14.A0g
            int r3 = X.AnonymousClass3TO.A00(r6)
            r12.setImageResource(r3)
            r3 = 5
            X.C36351kA.A1E(r12, r14, r3)
            com.whatsapp.wds.components.button.WDSButton r8 = r14.A0s
            switch(r33) {
                case 1: goto L_0x0351;
                case 2: goto L_0x0356;
                case 3: goto L_0x035b;
                case 4: goto L_0x0360;
                case 5: goto L_0x0356;
                case 6: goto L_0x0365;
                case 7: goto L_0x036a;
                case 8: goto L_0x036f;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            r3 = -1
        L_0x01ae:
            r8.setIcon((int) r3)
            r3 = 6
            X.C36351kA.A1E(r8, r14, r3)
            boolean r3 = r14.A0M
            if (r3 == 0) goto L_0x0349
            r8.setVisibility(r2)
            r12.setVisibility(r9)
        L_0x01bf:
            X.4eZ r9 = r4.A08
            r3 = 4
            X.7qE r8 = new X.7qE
            r8.<init>(r4, r3)
            r9.setFullscreenButtonClickListener(r8)
            X.4eZ r8 = r4.A08
            r0.addView(r8)
            android.widget.FrameLayout r9 = r4.A05
            X.6d1 r8 = new X.6d1
            r8.<init>(r4)
            r9.setOnHoverListener(r8)
            android.widget.FrameLayout r9 = r4.A05
            r8 = 7
            X.C36351kA.A1E(r9, r4, r8)
            X.5ND r15 = r4.A07
            android.widget.FrameLayout r14 = r4.A05
            X.3DS r9 = r4.A09
            X.3T1 r8 = r9.A00
            X.3Qa r8 = r8.A1J
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L_0x0346
            X.4V9 r8 = r9.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r8 = (com.whatsapp.webpagepreview.WebPagePreviewView) r8
            android.widget.FrameLayout r12 = r8.A05
        L_0x01f5:
            int r9 = r4.A04
            int r8 = r4.A01
            r18 = r9
            r19 = r8
            r16 = r14
            r17 = r12
            r20 = r9
            r21 = r8
            r15.A0G(r16, r17, r18, r19, r20, r21)
            java.lang.String r7 = r7.A02
            r26 = r7
            if (r6 != r3) goto L_0x02ef
            r8 = r32[r2]
            int r7 = r4.A04
            int r6 = r4.A02
            if (r8 == 0) goto L_0x02da
            android.graphics.Bitmap r16 = android.graphics.Bitmap.createScaledBitmap(r8, r7, r6, r2)
        L_0x021a:
            X.5ic r6 = r4.A0U
            X.4eZ r12 = r4.A08
            X.5NK r12 = (X.AnonymousClass5NK) r12
            int r14 = r4.A02
            X.1Mz r7 = r6.A00
            X.1My r6 = r7.A00
            android.app.Activity r13 = r6.A5d
            X.0tq r6 = r7.A01
            X.17Y r18 = X.C36351kA.A0M(r6)
            X.004 r7 = r6.A4T
            java.lang.Object r9 = r7.get()
            X.1DU r9 = (X.AnonymousClass1DU) r9
            X.1Dv r17 = X.C36351kA.A0J(r6)
            X.004 r7 = r6.A2T
            java.lang.Object r8 = r7.get()
            X.1FU r8 = (X.AnonymousClass1FU) r8
            X.0tt r6 = r6.A00
            X.004 r6 = r6.A1B
            java.lang.Object r7 = r6.get()
            X.6Sm r7 = (X.C132166Sm) r7
            X.5NQ r6 = new X.5NQ
            r22 = r30
            r21 = r7
            r23 = r12
            r24 = r26
            r25 = r14
            r19 = r9
            r20 = r8
            r14 = r6
            r15 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0261:
            r4.A0A = r6
            android.view.View r6 = r6.A08()
            r0.addView(r6, r2)
            r0.setClipChildren(r2)
            X.4eZ r6 = r4.A08
            r6.setClipChildren(r2)
            X.3Qq r2 = r4.A0A
            android.view.View r7 = r2.A08()
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            int r2 = r4.A02
            r6.height = r2
            r6.width = r10
            r7.setLayoutParams(r6)
            android.content.res.Resources r6 = r1.getResources()
            r2 = 2131102671(0x7f060bcf, float:1.7817787E38)
            X.C36391kE.A1C(r6, r0, r2)
            X.3Qq r0 = r4.A0A
            android.view.View r2 = r0.A08()
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131099848(0x7f0600c8, float:1.781206E38)
            X.C36391kE.A1C(r1, r2, r0)
            X.3Qq r1 = r4.A0A
            X.7rK r0 = new X.7rK
            r0.<init>(r4, r5)
            r1.A06 = r0
            X.70d r0 = new X.70d
            r0.<init>(r11, r4)
            r1.A07 = r0
            X.4eZ r0 = r4.A08
            r0.setPlayer(r1)
            X.4eZ r1 = r4.A08
            X.5NK r1 = (X.AnonymousClass5NK) r1
            android.widget.ImageButton r0 = r1.A0h
            r0.setVisibility(r3)
            android.widget.ImageButton r1 = r1.A0i
            r0 = 8
            r1.setVisibility(r0)
            X.5ND r1 = r4.A07
            X.4eZ r0 = r4.A08
            r1.setControlView(r0)
            X.3Qq r0 = r4.A0A
            r0.A0C()
            X.5ND r1 = r4.A07
            X.70a r0 = new X.70a
            r0.<init>(r4)
            r1.A0J = r0
            return
        L_0x02da:
            android.graphics.Bitmap r16 = X.C90524aI.A09(r7, r6)
            android.graphics.Canvas r7 = X.C90524aI.A0A(r16)
            int r6 = X.C36411kG.A01(r1)
            int r6 = X.AnonymousClass00F.A00(r1, r6)
            r7.drawColor(r6)
            goto L_0x021a
        L_0x02ef:
            X.17Y r15 = r4.A0N
            X.0yb r14 = r4.A0O
            android.app.Activity r17 = X.C24801Dv.A00(r1)
            X.0wG r12 = r4.A0X
            com.whatsapp.Mp4Ops r9 = r4.A0V
            X.0wN r7 = r4.A0T
            X.1AV r6 = r4.A0W
            r8 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r8 = r1.getString(r8)
            java.lang.String r23 = com.facebook.android.exoplayer2.util.Util.A09(r1, r8)
            X.5NV r8 = new X.5NV
            r18 = r8
            r19 = r7
            r20 = r9
            r21 = r6
            r22 = r12
            r18.<init>(r19, r20, r21, r22, r23)
            r9 = 0
            X.005 r6 = r4.A0b
            java.lang.Object r7 = r6.get()
            X.6KH r7 = (X.AnonymousClass6KH) r7
            X.5NR r6 = new X.5NR
            r24 = 0
            r25 = 0
            r23 = r9
            r19 = r14
            r20 = r12
            r21 = r7
            r22 = r13
            r16 = r6
            r18 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6.A0e(r8)
            android.net.Uri r7 = android.net.Uri.parse(r26)
            r6.A04 = r7
            r6.A05 = r9
            goto L_0x0261
        L_0x0346:
            r12 = 0
            goto L_0x01f5
        L_0x0349:
            r8.setVisibility(r9)
            r12.setVisibility(r2)
            goto L_0x01bf
        L_0x0351:
            r3 = 2131232588(0x7f08074c, float:1.808129E38)
            goto L_0x01ae
        L_0x0356:
            r3 = 2131232572(0x7f08073c, float:1.8081257E38)
            goto L_0x01ae
        L_0x035b:
            r3 = 2131232577(0x7f080741, float:1.8081267E38)
            goto L_0x01ae
        L_0x0360:
            r3 = 2131232589(0x7f08074d, float:1.8081292E38)
            goto L_0x01ae
        L_0x0365:
            r3 = 2131232578(0x7f080742, float:1.808127E38)
            goto L_0x01ae
        L_0x036a:
            r3 = 2131232579(0x7f080743, float:1.8081271E38)
            goto L_0x01ae
        L_0x036f:
            r3 = 2131232587(0x7f08074b, float:1.8081287E38)
            goto L_0x01ae
        L_0x0374:
            com.whatsapp.wds.components.button.WDSButton r3 = r14.A0s
            r3.setVisibility(r9)
            android.widget.ImageButton r3 = r14.A0g
            r3.setVisibility(r9)
            goto L_0x01bf
        L_0x0380:
            r0 = 4
            if (r6 != r0) goto L_0x0394
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "/shorts/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0394
            r2 = 4603237813974170650(0x3fe1fc671e937c1a, double:0.5620608899297423)
            goto L_0x0098
        L_0x0394:
            r2 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            goto L_0x0098
        L_0x039b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1491570b.A02(X.6tS, X.5BJ, X.3T1, X.3Qa, android.graphics.Bitmap[], int):void");
    }

    public void B34() {
        long j;
        C64933Qa r0;
        long j2;
        int i;
        Integer valueOf;
        if (this.A0J) {
            boolean A0E2 = this.A0Q.A0E(2431);
            C124685yd r8 = this.A0S;
            int i2 = this.A03;
            C65083Qq r02 = this.A0A;
            if (r02 != null) {
                j = (long) r02.A05();
            } else {
                j = 0;
            }
            C128896Ea r7 = r8.A09;
            if (r7.A01) {
                r7.A00();
            }
            C128896Ea r9 = r8.A07;
            r9.A00();
            C1040458b r6 = new C1040458b();
            if (!r8.A02 || A0E2) {
                boolean z = r8.A04;
                long j3 = 0;
                if (z) {
                    j2 = 0;
                } else {
                    j2 = r9.A00;
                }
                r6.A04 = Long.valueOf(j2);
                r6.A06 = Long.valueOf(Math.round(((double) j) / 10000.0d) * 10000);
                if (z) {
                    j3 = r8.A08.A00;
                }
                r6.A07 = Long.valueOf(j3);
                r6.A01 = Boolean.valueOf(z);
                r6.A08 = Long.valueOf(r8.A06.A00);
                long j4 = r7.A00;
                r6.A09 = Long.valueOf(Math.round(((double) j4) / 10000.0d) * 10000);
                switch (i2) {
                    case 1:
                        i = 5;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 2;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 6;
                        break;
                    case 8:
                        i = 8;
                        break;
                    default:
                        valueOf = null;
                        break;
                }
                valueOf = Integer.valueOf(i);
                r6.A03 = valueOf;
                if (A0E2) {
                    r6.A05 = Long.valueOf((long) ((((float) j4) * 100.0f) / ((float) j)));
                    r6.A00 = Boolean.valueOf(r8.A03);
                    r6.A0A = r8.A01;
                    r6.A02 = r8.A00;
                }
                r8.A05.Bly(r6);
            }
            r8.A02 = false;
            r8.A04 = false;
            r8.A03 = false;
            r8.A00 = null;
            r8.A01 = null;
            r8.A08.A01();
            r9.A01();
            r7.A01();
            r8.A06.A01();
            this.A00 = 3;
            AnonymousClass3DS r1 = this.A09;
            if (!(r1 == null || (r0 = this.A06) == null)) {
                r1.A00(r0, 3);
                this.A09 = null;
            }
            C92754eZ r03 = this.A08;
            if (r03 != null) {
                r03.A08();
            }
            C65083Qq r04 = this.A0A;
            if (r04 != null) {
                r04.A0D();
                this.A0A = null;
            }
            this.A07.setSystemUiVisibility(0);
            AnonymousClass5ND r12 = this.A07;
            r12.A0S = false;
            r12.A0O = false;
            r12.A0M = true;
            r12.A0A = 0;
            r12.A0B = 0;
            r12.removeAllViews();
            this.A0J = false;
            this.A0E = false;
            this.A06 = null;
            this.A0B = null;
        }
    }

    public void B6h() {
        Context context = this.A0K;
        if (!C24801Dv.A00(context).isFinishing()) {
            C65083Qq r0 = this.A0A;
            if (r0 != null) {
                View A082 = r0.A08();
                ViewGroup.LayoutParams layoutParams = A082.getLayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                A082.setLayoutParams(layoutParams);
                if (this.A0A instanceof AnonymousClass5NQ) {
                    int A042 = C36341k9.A04(context);
                    YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = ((AnonymousClass5NQ) this.A0A).A0E;
                    if (A042 == 2) {
                        youtubePlayerTouchOverlay.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
                    } else {
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, youtubePlayerTouchOverlay.A00);
                        layoutParams2.addRule(13);
                        youtubePlayerTouchOverlay.setLayoutParams(layoutParams2);
                    }
                    youtubePlayerTouchOverlay.requestLayout();
                }
            }
            C36331k8.A0q(context, this.A05, R.string.f12nameremoved);
            AnonymousClass5ND r1 = this.A07;
            r1.A0M = false;
            r1.A0S = false;
            r1.A0O = true;
            r1.A0N = false;
            AnonymousClass5ND.A08(r1, 1.0f);
            AnonymousClass5ND r4 = this.A07;
            FrameLayout frameLayout = this.A05;
            if (!(frameLayout.getX() == 0.0f || frameLayout.getY() == 0.0f)) {
                r4.A0A = r4.A0A(r4.A03);
                r4.A0B = r4.A0B(r4.A02);
            }
            AnonymousClass09G.A00(C36361kB.A0C(C24801Dv.A00(context)));
            this.A05.setScaleX(1.0f);
            this.A05.setScaleY(1.0f);
            C70803fk r12 = this.A0I.A00;
            r12.A2l.getImeUtils();
            if (AnonymousClass1N2.A00(r12.A0C)) {
                r12.A1o();
            } else {
                C70803fk.A1Y(r12);
            }
            FrameLayout frameLayout2 = this.A05;
            AnonymousClass5ND r02 = this.A07;
            Rect A062 = AnonymousClass001.A06();
            Rect A063 = AnonymousClass001.A06();
            Point point = new Point();
            Point point2 = new Point();
            frameLayout2.getGlobalVisibleRect(A062, point2);
            r02.getGlobalVisibleRect(A063, point);
            A062.offset(point2.x - A062.left, point2.y - A062.top);
            A063.offset(-point.x, -point.y);
            this.A0L.set(A062);
            C90474aD.A0z(frameLayout2);
            A00(context, A062, A063, frameLayout2, this.A07, this.A08, this.A0E);
            this.A0E = true;
            AnonymousClass5NK r2 = (AnonymousClass5NK) this.A08;
            r2.A0M = true;
            if (r2.A0H != null) {
                AnonymousClass5NK.A01(r2);
            }
            if (!r2.A0N) {
                r2.A0l.setVisibility(8);
            }
            r2.A0Z.setVisibility(8);
            if (AnonymousClass5NK.A06(r2)) {
                r2.A0s.setVisibility(0);
                if (!r2.A0N) {
                    r2.A0g.setVisibility(8);
                }
            }
            if (r2.A0j.getVisibility() == 0) {
                AnonymousClass5NK.A02(r2);
            }
            if (!TextUtils.isEmpty(r2.A0p.getText())) {
                r2.A0b.setVisibility(0);
            }
            r2.setVideoCaption(r2.A0q.getText());
            AnonymousClass5NK.A03(r2);
            AnonymousClass5NK.A04(r2);
            AnonymousClass5NK.A00(r2);
            r2.A0D();
            r2.A0E();
            this.A07.requestLayout();
            FrameLayout frameLayout3 = this.A05;
            if (frameLayout3 instanceof AnonymousClass5NF) {
                ((AnonymousClass5NF) frameLayout3).setIsFullscreen(this.A0E);
            }
        }
    }

    public void B76(boolean z) {
        C65083Qq r0 = this.A0A;
        if (r0 != null) {
            View A082 = r0.A08();
            ViewGroup.LayoutParams layoutParams = A082.getLayoutParams();
            layoutParams.height = this.A02;
            layoutParams.width = -1;
            A082.setLayoutParams(layoutParams);
            C65083Qq r1 = this.A0A;
            if (r1 instanceof AnonymousClass5NQ) {
                YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = ((AnonymousClass5NQ) r1).A0E;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, youtubePlayerTouchOverlay.A00);
                layoutParams2.addRule(13);
                youtubePlayerTouchOverlay.setLayoutParams(layoutParams2);
                youtubePlayerTouchOverlay.requestLayout();
            }
        }
        FrameLayout frameLayout = this.A05;
        Context context = this.A0K;
        C36331k8.A0q(context, frameLayout, R.string.f12nameremoved);
        AnonymousClass5ND r12 = this.A07;
        boolean z2 = true;
        r12.A0M = true;
        r12.A0S = false;
        AnonymousClass5ND.A08(r12, r12.A00);
        if (z || this.A0H != this.A0G) {
            this.A05.setLayoutParams(new FrameLayout.LayoutParams(this.A04, this.A01));
        } else {
            FrameLayout frameLayout2 = this.A05;
            AnonymousClass5ND r02 = this.A07;
            Rect A062 = AnonymousClass001.A06();
            Rect A063 = AnonymousClass001.A06();
            Point point = new Point();
            r02.getGlobalVisibleRect(A062, point);
            A062.offset(-point.x, -point.y);
            A063.set(this.A0L);
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(this.A04, this.A01));
            A00(context, A062, A063, frameLayout2, this.A07, this.A08, this.A0E);
        }
        this.A0E = false;
        AnonymousClass5NK r2 = (AnonymousClass5NK) this.A08;
        r2.A0M = false;
        r2.A0a.setVisibility(8);
        r2.A0i.setVisibility(8);
        r2.A0k.setVisibility(8);
        r2.A0l.setVisibility(0);
        if (!r2.A0N) {
            r2.A0Z.setVisibility(0);
        }
        if (AnonymousClass5NK.A06(r2) && !r2.A0N) {
            r2.A0s.setVisibility(8);
            r2.A0g.setVisibility(0);
        }
        if (r2.A0j.getVisibility() == 0) {
            AnonymousClass5NK.A02(r2);
        }
        r2.A0b.setVisibility(8);
        r2.A0q.setVisibility(8);
        AnonymousClass5NK.A03(r2);
        AnonymousClass5NK.A04(r2);
        AnonymousClass5NK.A00(r2);
        r2.A0E();
        this.A08.setSystemUiVisibility(0);
        AnonymousClass5ND r22 = this.A07;
        r22.A0N = true;
        if (this.A0H != this.A0G) {
            z2 = false;
        }
        r22.A0H(z2);
        this.A07.A0O = false;
        AnonymousClass09G.A00(C36361kB.A0C(C24801Dv.A00(context)));
        this.A0H = this.A0G;
        FrameLayout frameLayout3 = this.A05;
        if (frameLayout3 instanceof AnonymousClass5NF) {
            ((AnonymousClass5NF) frameLayout3).setIsFullscreen(this.A0E);
        }
    }

    public void B7D(C145166tS r18, AnonymousClass3T1 r19, C64933Qa r20, AnonymousClass3DS r21, String str, String str2, Bitmap[] bitmapArr, int i) {
        C64933Qa r2 = r20;
        String str3 = str2;
        int i2 = i;
        if (this.A06 != r2) {
            B34();
            this.A06 = r2;
            this.A0B = str3;
            this.A09 = r21;
            this.A03 = i2;
        }
        if (i2 != 3) {
            str = str3;
        }
        String A0b2 = C90474aD.A0b(C90504aG.A0I(str).appendQueryParameter("wa_logging_event", "video_play_open"));
        AnonymousClass17Y r8 = this.A0N;
        C19770wU r14 = this.A0R;
        C18820ts r10 = this.A0P;
        C20810yC r11 = this.A0Q;
        C21010yW r12 = this.A0Y;
        AnonymousClass3T1 r5 = r19;
        Bitmap[] bitmapArr2 = bitmapArr;
        if (i2 != 4) {
            C145166tS A002 = C64033Mj.A00(A0b2);
            if (A002 == null) {
                try {
                    AnonymousClass3DS r0 = this.A09;
                    if (r0 != null) {
                        r0.A00(r2, 1);
                        this.A00 = 1;
                    }
                    C63983Me.A00(r8, r18, r10, r11, r12, new C146326vQ(r5, r2, this, bitmapArr2), r14, A0b2, false);
                } catch (Exception unused) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("InlineVideoPlaybackImplHandler/onPlaybackError=");
                    A0u.append("InlineVideoPlaybackImplHandler/fetchPageInfo - loadPage failed");
                    Log.e(C36371kC.A0z(" isTransient=", A0u, true));
                    A01(this);
                }
            } else if (r20 != null) {
                int i3 = i2;
                A02(A002, A002.A06, r5, r2, bitmapArr2, i3);
            }
        } else if (r20 != null && str2 != null) {
            A02((C145166tS) null, new AnonymousClass5BJ(str3, -1, -1), r5, r2, bitmapArr2, 4);
        }
    }

    public void BlK() {
        C65083Qq r0 = this.A0A;
        if (r0 != null && r0.A0X()) {
            this.A08.A07();
        }
    }

    public void Bux(AnonymousClass31H r6, AnonymousClass5ND r7, int i) {
        this.A07 = r7;
        this.A0I = r6;
        Context context = this.A0K;
        int dimensionPixelSize = i - (context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2);
        this.A0F = (((double) (dimensionPixelSize * dimensionPixelSize)) * 9.0d) / 16.0d;
        AnonymousClass5ND r3 = this.A07;
        int[] viewIdsToIgnoreScaling = C92754eZ.getViewIdsToIgnoreScaling();
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        r3.A0U = viewIdsToIgnoreScaling;
        r3.A06 = dimensionPixelSize2;
    }

    public C1491570b(Context context, C24801Dv r3, C19700wN r4, C115275ic r5, AnonymousClass17Y r6, Mp4Ops mp4Ops, AnonymousClass1AV r8, C21060yb r9, C19630wG r10, C18820ts r11, C20810yC r12, C21010yW r13, AnonymousClass1DU r14, C24811Dw r15, C19770wU r16, AnonymousClass005 r17) {
        this.A0X = r10;
        this.A0K = context;
        this.A0V = mp4Ops;
        this.A0Q = r12;
        this.A0N = r6;
        this.A0T = r4;
        this.A0R = r16;
        this.A0Z = r14;
        this.A0Y = r13;
        this.A0M = r3;
        this.A0O = r9;
        this.A0P = r11;
        this.A0W = r8;
        this.A0a = r15;
        this.A0S = new C124685yd(r13);
        this.A0U = r5;
        this.A0b = r17;
    }

    public int BAZ() {
        return this.A00;
    }

    public C64933Qa BAa() {
        return this.A06;
    }

    public boolean BCh() {
        return this.A0E;
    }

    public boolean BCi() {
        return this.A0J;
    }

    public void Bqg(int i) {
        this.A0G = i;
    }

    public void Bqy(AnonymousClass3DS r1) {
        this.A09 = r1;
    }

    public void BrO(int i) {
        this.A0H = i;
    }
}
