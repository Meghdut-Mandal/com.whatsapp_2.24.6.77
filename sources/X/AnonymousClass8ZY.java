package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.MediaProgressRing;
import com.whatsapp.conversation.conversationrow.MediaTimeDisplay;
import com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer;
import java.io.File;

/* renamed from: X.8ZY  reason: invalid class name */
public class AnonymousClass8ZY extends AnonymousClass2IQ {
    public static final Interpolator A0b = C017907q.A00(0.85f, 0.0f, 0.15f, 1.0f);
    public int A00 = -1;
    public int A01 = -1;
    public AnimatorSet A02;
    public AnonymousClass34K A03;
    public C21860zv A04;
    public C62683Hc A05;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;
    public C64933Qa A09 = null;
    public C64933Qa A0A = null;
    public C19960wn A0B = C19960wn.A01;
    public boolean A0C;
    public boolean A0D = false;
    public final int A0E;
    public final Animator.AnimatorListener A0F = new C23142B7c(this, 0);
    public final View A0G = C012005e.A02(this, R.id.upload_download_frame);
    public final ViewGroup A0H = C36411kG.A0O(this, R.id.media_container);
    public final ViewGroup A0I = C36411kG.A0O(this, R.id.overlay_button_container);
    public final ViewGroup A0J = C36411kG.A0O(this, R.id.progress_bar_container);
    public final ViewGroup A0K;
    public final TextView A0L = C36391kE.A0O(this, R.id.media_retry_btn);
    public final C001700s A0M = C36441kJ.A0Z((Object) null);
    public final WaImageView A0N = C36431kI.A0X(this, R.id.play_button);
    public final PushToVideoInlineVideoPlayer A0O = ((PushToVideoInlineVideoPlayer) C012005e.A02(this, R.id.inline_video_player));
    public final C34831hi A0P = new C34831hi(false);
    public final C33541fX A0Q = new C48742hy(this, 10);
    public final AnonymousClass1RJ A0R = C36341k9.A0X(this, R.id.cancel_download);
    public final AnonymousClass1RJ A0S = C36341k9.A0X(this, R.id.progress_bar);
    public final View.OnClickListener A0T = new C66953Xy(this, 44);
    public final View.OnTouchListener A0U = new C203499oB(this, 1);
    public final View A0V;
    public final AnonymousClass04S A0W = new BA7(this, 45);
    public final MediaProgressRing A0X;
    public final MediaTimeDisplay A0Y;
    public final C33541fX A0Z = new C48742hy(this, 11);
    public final AnonymousClass4SO A0a = new B8I(this, 0);

    private void A0C() {
        C64933Qa r1;
        C64933Qa r2 = this.A09;
        if (this.A0D) {
            r1 = this.A0K.A1J;
        } else {
            r1 = null;
        }
        this.A09 = r1;
        if (!C1901797e.A00(r1, r2)) {
            MediaTimeDisplay mediaTimeDisplay = this.A0Y;
            Runnable runnable = mediaTimeDisplay.A05;
            if (runnable != null) {
                runnable.run();
            }
            if (r1 != null) {
                AnonymousClass3T1 r22 = this.A0K;
                AnonymousClass012 A002 = AnonymousClass0QD.A00(getRootView());
                if (A002 != null) {
                    mediaTimeDisplay.A03(A002, new C21133A9t(this, r22));
                }
            }
        }
    }

    private void A0D() {
        C64933Qa r1;
        AnonymousClass012 A002;
        C64933Qa r2 = this.A0A;
        if (this.A0D) {
            r1 = this.A0K.A1J;
        } else {
            r1 = null;
        }
        this.A0A = r1;
        if (!C1901797e.A00(r1, r2)) {
            MediaProgressRing mediaProgressRing = this.A0X;
            Runnable runnable = mediaProgressRing.A04;
            if (runnable != null) {
                runnable.run();
            }
            if (r1 != null && (A002 = AnonymousClass0QD.A00(getRootView())) != null) {
                mediaProgressRing.A01(A002, new C21132A9s(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x021d, code lost:
        if (r11 == r6.A00) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (r15.getPlaybackState() != 3) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        if (r6.A08 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r6.A07 != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0151, code lost:
        if (r1 == 0) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0051, code lost:
        if (r15.getPlaybackState() != 3) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0E(X.AnonymousClass8ZY r27, boolean r28) {
        /*
            r6 = r27
            X.3T1 r5 = r6.A0K
            X.2bU r5 = (X.AnonymousClass2bU) r5
            X.2cZ r5 = (X.C47002cZ) r5
            if (r28 == 0) goto L_0x001e
            X.0wn r0 = X.C19960wn.A01
            r6.A0B = r0
            X.3Qa r1 = r5.A1J
            X.34K r0 = r6.A03
            X.00s r0 = r0.A01
            java.lang.Object r0 = r0.A04()
            boolean r0 = r1.equals(r0)
            r6.A06 = r0
        L_0x001e:
            X.3T1 r0 = r6.A0K
            X.3Qa r0 = r0.A1J
            boolean r1 = r0.A02
            X.3Qa r0 = r5.A1J
            r27 = r0
            r6.hashCode()
            X.2bU r0 = r6.getFMessage()
            X.C66013Ui.A0z(r0)
            X.2bU r0 = r6.getFMessage()
            X.C66013Ui.A10(r0)
            X.2bU r0 = r6.getFMessage()
            X.C54732tQ.A00(r0)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r15 = r6.A0O
            X.2ke r7 = r15.A09
            X.3Qd r0 = r7.A00
            boolean r0 = r0.A07
            r2 = 3
            r4 = 1
            if (r0 == 0) goto L_0x0053
            int r0 = r15.getPlaybackState()
            r3 = 1
            if (r0 == r2) goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            boolean r0 = r6.A06
            r12 = 2
            if (r0 == 0) goto L_0x024a
            X.3Qd r0 = r7.A00
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x0066
            int r0 = r15.getPlaybackState()
            r1 = 1
            if (r0 == r2) goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            int r0 = r15.getPlaybackState()
            boolean r0 = X.C36381kD.A1U(r0, r4)
            if (r1 != 0) goto L_0x0073
            if (r0 != 0) goto L_0x007e
        L_0x0073:
            if (r3 != 0) goto L_0x007e
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x007e
            boolean r0 = r6.A08
            r11 = 3
            if (r0 == 0) goto L_0x007f
        L_0x007e:
            r11 = 0
        L_0x007f:
            r1 = 2
            r10 = 0
        L_0x0081:
            r9 = 1
            r20 = 0
        L_0x0084:
            com.whatsapp.conversation.conversationrow.MediaProgressRing r8 = r6.A0X
            boolean r0 = r6.A06
            r7 = 8
            if (r0 == 0) goto L_0x0091
            boolean r3 = r6.A07
            r0 = 0
            if (r3 == 0) goto L_0x0093
        L_0x0091:
            r0 = 8
        L_0x0093:
            r8.setVisibility(r0)
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r3 = r6.A0Y
            r0 = 8
            if (r9 == 0) goto L_0x009d
            r0 = 0
        L_0x009d:
            r3.setVisibility(r0)
            android.view.View r0 = r6.A0V
            if (r10 == 0) goto L_0x00a5
            r7 = 0
        L_0x00a5:
            r0.setVisibility(r7)
            r14 = 0
            if (r1 == r4) goto L_0x0244
            if (r1 == r12) goto L_0x0240
            if (r1 == r2) goto L_0x023c
            r3 = r14
        L_0x00b0:
            r6.A1d()
            boolean r0 = r6.A06
            r8 = 0
            if (r0 == 0) goto L_0x0234
            r13 = 1
        L_0x00b9:
            if (r28 != 0) goto L_0x0230
            int r0 = r6.A01
            if (r13 == r0) goto L_0x012c
            r1 = 100
            if (r13 == 0) goto L_0x022a
            if (r13 == r4) goto L_0x022c
        L_0x00c5:
            android.view.ViewGroup r9 = r6.A0K
            int r10 = r9.getWidth()
            if (r13 != r4) goto L_0x0226
            int r7 = r6.getActiveBubbleSize()
        L_0x00d1:
            int[] r0 = new int[r12]
            r0[r8] = r10
            r0[r4] = r7
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofInt(r0)
            android.view.animation.Interpolator r0 = A0b
            r10.setInterpolator(r0)
            X.9p9 r7 = new X.9p9
            r7.<init>(r10, r6)
            r10.addUpdateListener(r7)
            float r16 = r9.getScaleX()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r13 != r12) goto L_0x00f3
            r9 = 1064514355(0x3f733333, float:0.95)
        L_0x00f3:
            float[] r7 = new float[r12]
            r7[r8] = r16
            r7[r4] = r9
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r7)
            r9.setInterpolator(r0)
            X.9hP r0 = new X.9hP
            r0.<init>(r6, r4)
            r9.addUpdateListener(r0)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r12]
            r0[r8] = r10
            r0[r4] = r9
            r7.playTogether(r0)
            r7.setDuration(r1)
            android.animation.Animator$AnimatorListener r0 = r6.A0F
            r7.addListener(r0)
            r6.A01 = r13
            android.animation.AnimatorSet r0 = r6.A02
            if (r0 == 0) goto L_0x0127
            r0.cancel()
        L_0x0127:
            r6.A02 = r7
            r7.start()
        L_0x012c:
            android.view.View r7 = r6.A0G
            X.1RJ r1 = r6.A0S
            X.1RJ r0 = r6.A0R
            android.widget.TextView r2 = r6.A0L
            r21 = 0
            r16 = r7
            r17 = r2
            r18 = r1
            r19 = r0
            X.AnonymousClass2IQ.A0P(r16, r17, r18, r19, r20, r21)
            android.view.ViewGroup r9 = r6.A0J
            int r1 = r1.A00()
            r7 = 8
            if (r1 == 0) goto L_0x0153
            int r1 = r0.A00()
            r0 = 8
            if (r1 != 0) goto L_0x0154
        L_0x0153:
            r0 = 0
        L_0x0154:
            r9.setVisibility(r0)
            if (r11 == 0) goto L_0x0223
            if (r11 == r4) goto L_0x0220
            if (r11 == r12) goto L_0x0220
            com.whatsapp.WaImageView r1 = r6.A0N
        L_0x015f:
            r0 = 8
            if (r1 != r2) goto L_0x0164
            r0 = 0
        L_0x0164:
            r2.setVisibility(r0)
            android.view.ViewGroup r9 = r6.A0I
            r0 = 0
            if (r1 != 0) goto L_0x016e
            r0 = 8
        L_0x016e:
            r9.setVisibility(r0)
            if (r28 == 0) goto L_0x021b
            X.3T1 r0 = r6.A0K
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2.setTag(r0)
        L_0x017c:
            r6.A00 = r11
            com.whatsapp.WaImageView r0 = r6.A0N
            if (r1 != r0) goto L_0x0183
            r7 = 0
        L_0x0183:
            r0.setVisibility(r7)
            if (r1 != r2) goto L_0x01b7
            if (r11 == r4) goto L_0x0212
            if (r11 != r12) goto L_0x0287
            r10 = 2131887288(0x7f1204b8, float:1.9409179E38)
            r9 = 2131231152(0x7f0801b0, float:1.8078377E38)
            X.1fX r7 = r6.A0Q
            X.3T1 r0 = r6.A0K
            X.2bU r0 = (X.AnonymousClass2bU) r0
            java.util.List r19 = java.util.Collections.singletonList(r0)
            long r0 = r0.A00
            r18 = 0
            r16 = r6
            r20 = r0
            r16.A1r(r17, r18, r19, r20)
        L_0x01a7:
            r2.setText(r10)
            android.content.Context r0 = r6.getContext()
            X.C36331k8.A0q(r0, r2, r10)
            r2.setCompoundDrawablesWithIntrinsicBounds(r9, r8, r8, r8)
            r2.setOnClickListener(r7)
        L_0x01b7:
            boolean r8 = r6.A06
            boolean r24 = X.C37541mm.A09(r6)
            boolean r25 = r6.A0F()
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x01ca
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x01ca
            r4 = 0
        L_0x01ca:
            X.1SV r7 = r6.A1y
            r0 = 18
            X.3v4 r2 = new X.3v4
            r2.<init>(r6, r0)
            android.view.View$OnLongClickListener r1 = r6.A2W
            X.4SO r0 = r6.A0a
            r19 = r5
            r20 = r7
            r21 = r0
            r22 = r2
            r23 = r8
            r26 = r4
            r16 = r3
            r17 = r1
            r18 = r14
            r15.A04(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6.A0D()
            r6.A0C()
            X.34K r0 = r6.A03
            X.3Qa r2 = r0.A00
            r0 = r27
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x020e
            boolean r0 = X.C37541mm.A09(r6)
            if (r0 == 0) goto L_0x020e
            X.34K r1 = r6.A03
            r0 = 0
            r1.A00 = r0
            X.00s r0 = r1.A01
            r0.A0D(r2)
        L_0x020e:
            r6.hashCode()
            return
        L_0x0212:
            r10 = 2131893722(0x7f121dda, float:1.9422229E38)
            r9 = 2131231204(0x7f0801e4, float:1.8078482E38)
            X.1fX r7 = r6.A0A
            goto L_0x01a7
        L_0x021b:
            int r0 = r6.A00
            if (r11 != r0) goto L_0x017c
            goto L_0x01b7
        L_0x0220:
            r1 = r2
            goto L_0x015f
        L_0x0223:
            r1 = 0
            goto L_0x015f
        L_0x0226:
            int r7 = r6.A0E
            goto L_0x00d1
        L_0x022a:
            if (r0 != r4) goto L_0x00c5
        L_0x022c:
            r1 = 250(0xfa, double:1.235E-321)
            goto L_0x00c5
        L_0x0230:
            r1 = 0
            goto L_0x00c5
        L_0x0234:
            boolean r0 = r6.A08
            int r13 = X.C165587tf.A03(r0)
            goto L_0x00b9
        L_0x023c:
            X.1fX r3 = r6.A0Q
            goto L_0x00b0
        L_0x0240:
            android.view.View$OnClickListener r3 = r6.A0T
            goto L_0x00b0
        L_0x0244:
            X.1fX r3 = r6.A0Z
            android.view.View$OnTouchListener r14 = r6.A0U
            goto L_0x00b0
        L_0x024a:
            X.2bU r0 = r6.getFMessage()
            boolean r0 = X.C66013Ui.A0z(r0)
            if (r0 == 0) goto L_0x025b
            r11 = 0
            r10 = 0
            r9 = 0
            r20 = 1
            goto L_0x0084
        L_0x025b:
            boolean r0 = X.C37541mm.A09(r6)
            if (r0 == 0) goto L_0x0276
            int r1 = r15.getPlaybackState()
            r0 = 4
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            r10 = r0 ^ 1
            r11 = 0
            if (r0 == 0) goto L_0x0270
            r11 = 3
        L_0x0270:
            r9 = 1
            r20 = 0
            r1 = 1
            goto L_0x0084
        L_0x0276:
            X.2bU r0 = r6.getFMessage()
            boolean r0 = X.C54732tQ.A00(r0)
            r1 = 1
            r11 = 1
            if (r0 == 0) goto L_0x0284
            r1 = 3
            r11 = 2
        L_0x0284:
            r10 = 1
            goto L_0x0081
        L_0x0287:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected overlayButtonAction: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r11)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ZY.A0E(X.8ZY, boolean):void");
    }

    private boolean A0F() {
        File file;
        Uri fromFile;
        C19960wn r1 = this.A0B;
        if (r1.A00 == null) {
            boolean z = false;
            if (!C37541mm.A09(this)) {
                return false;
            }
            C65013Qj r0 = ((AnonymousClass2bU) this.A0K).A01;
            if (!(r0 == null || (file = r0.A0I) == null || (fromFile = Uri.fromFile(file)) == null || !C90524aI.A0S(fromFile.getPath()).exists())) {
                z = true;
            }
            r1 = new C19960wn(Boolean.valueOf(z));
            this.A0B = r1;
        }
        return AnonymousClass000.A1X(r1.A00());
    }

    /* access modifiers changed from: private */
    public int getVideoDuration() {
        int A052 = this.A0O.A09.A05();
        if (A052 == 0) {
            return ((AnonymousClass2bU) this.A0K).A0B * 1000;
        }
        return A052;
    }

    public void A16() {
        if (!this.A0C) {
            this.A0C = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
            AnonymousClass8ZJ.A0Y(A0k, r4, r2, this);
            this.A03 = (AnonymousClass34K) r2.ABa.get();
            this.A05 = (C62683Hc) r2.A4H.get();
            this.A04 = (C21860zv) r2.A4A.get();
        }
    }

    public boolean A1E() {
        AnonymousClass005 r2 = this.A25;
        return C66013Ui.A0X(this.A0j, this.A0K, r2);
    }

    public boolean A1K() {
        if (!C66013Ui.A0W(this.A0V, this.A0G, this.A0K, this.A1o) || !this.A0d.BtQ()) {
            return false;
        }
        return true;
    }

    public boolean A1N() {
        if (!this.A0G.A0E(7778) || this.A0K.A1J.A02) {
            return false;
        }
        return true;
    }

    public void A1Z() {
        this.A0O.A02();
    }

    public void A1d() {
        AnonymousClass1RJ r2 = this.A0S;
        AnonymousClass1Y4 r0 = this.A04;
        C18740tg.A06(r0);
        A2E(r2, AnonymousClass3SU.A01(r0, (AnonymousClass2bU) this.A0K, r2));
    }

    public void A1f() {
        if (this.A02 != null) {
            if (!RequestPermissionActivity.A0B.A0J(getContext(), this.A02)) {
                return;
            }
        }
        AnonymousClass2bU r0 = (AnonymousClass2bU) this.A0K;
        C65013Qj r1 = r0.A01;
        C18740tg.A06(r1);
        C64933Qa r3 = r0.A1J;
        if (!r3.A02 && !r1.A0V) {
            return;
        }
        if (r1.A09 == 1) {
            this.A0R.A04(R.string.f12nameremoved, 1);
        } else if (A0F()) {
            AnonymousClass34K r12 = this.A03;
            r12.A00 = null;
            r12.A01.A0D(r3);
            this.A0O.setPlayWhenReadyAndActive(true);
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0E(this, A1W);
        }
    }

    public AnonymousClass2cY getFMessage() {
        return (AnonymousClass2cY) ((AnonymousClass2bU) this.A0K);
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2cY);
        super.setFMessage(r2);
    }

    public AnonymousClass8ZY(Context context, C89004Uw r7, AnonymousClass2cY r8) {
        super(context, r7, r8);
        A16();
        ViewGroup A0O2 = C36411kG.A0O(this, R.id.ptv_bubble_container);
        this.A0K = A0O2;
        this.A0V = C012005e.A02(this, R.id.mute_btn);
        this.A0Y = (MediaTimeDisplay) C012005e.A02(this, R.id.media_time_display);
        this.A0X = (MediaProgressRing) C012005e.A02(this, R.id.playback_progress_ring);
        this.A0E = Math.min(C36341k9.A0F(A0O2).getDimensionPixelSize(R.dimen.f7nameremoved), AnonymousClass3R4.A01(A0O2.getContext(), 65));
        ViewGroup viewGroup = this.A0H;
        C34081gQ.A01(viewGroup);
        AnonymousClass1RJ r2 = this.A0S;
        r2.A07(new AnonymousClass4ZP((Object) this, 4));
        r2.A05(this.A08);
        this.A0K.setContentDescription(getResources().getString(R.string.f12nameremoved));
        viewGroup.setContentDescription(getResources().getString(R.string.f12nameremoved));
        A0E(this, true);
    }

    private int getActiveBubbleSize() {
        int A002 = AnonymousClass3R4.A00(getContext());
        C89014Ux r1 = this.A0d;
        return ((((A002 - r1.B8x()) - r1.B8y(this.A0K)) - getPaddingLeft()) - getPaddingRight()) - getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void A1Y() {
        super.A1Y();
        A0E(this, false);
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0D = true;
        AnonymousClass012 A002 = AnonymousClass0QD.A00(getRootView());
        if (A002 != null) {
            this.A03.A01.A08(A002, this.A0W);
        }
        A0E(this, false);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C64933Qa r2 = this.A0K.A1J;
        hashCode();
        this.A0D = false;
        this.A03.A01.A0B(this.A0W);
        AnonymousClass34K r1 = this.A03;
        if (r2.equals(r1.A00)) {
            r1.A00 = null;
        }
        A0D();
        A0C();
    }
}
