package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass011;
import X.AnonymousClass1E2;
import X.AnonymousClass1GJ;
import X.AnonymousClass1GL;
import X.AnonymousClass1V6;
import X.AnonymousClass1X7;
import X.AnonymousClass3TF;
import X.AnonymousClass3UY;
import X.AnonymousClass6AP;
import X.AnonymousClass6BV;
import X.AnonymousClass6QO;
import X.AnonymousClass6VT;
import X.AnonymousClass7MM;
import X.AnonymousClass7MN;
import X.C023509x;
import X.C1273567y;
import X.C129126Fh;
import X.C132366Tg;
import X.C135466ck;
import X.C146636vv;
import X.C146806wC;
import X.C1503074t;
import X.C160827le;
import X.C163397q8;
import X.C18740tg;
import X.C18750th;
import X.C18820ts;
import X.C19960wn;
import X.C19970wo;
import X.C20810yC;
import X.C21010yW;
import X.C33311f5;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C65083Qq;
import X.C90474aD;
import X.C90504aG;
import X.C90524aI;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;

public final class VideoComposerFragment extends Hilt_VideoComposerFragment {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04 = -1;
    public long A05;
    public long A06;
    public View A07;
    public View A08;
    public ImageView A09;
    public TextView A0A;
    public AnonymousClass1V6 A0B;
    public C19970wo A0C;
    public C21010yW A0D;
    public AnonymousClass1GJ A0E;
    public AnonymousClass1E2 A0F;
    public VideoTimelineView A0G;
    public C129126Fh A0H;
    public AnonymousClass1X7 A0I;
    public C19960wn A0J;
    public C1273567y A0K;
    public C65083Qq A0L;
    public File A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public View A0T;
    public View A0U;
    public ImageView A0V;
    public TextView A0W;
    public TextView A0X;
    public boolean A0Y;
    public final View.OnClickListener A0Z;
    public final Runnable A0a;
    public final Map A0b = C36431kI.A1G();
    public final AnonymousClass00T A0c = C36431kI.A1I(new AnonymousClass7MM(this));
    public final AnonymousClass00T A0d = C36431kI.A1I(new AnonymousClass7MN(this));
    public final View.OnAttachStateChangeListener A0e;
    public final View.OnClickListener A0f;

    public static final long A03(VideoComposerFragment videoComposerFragment) {
        return videoComposerFragment.A00((AnonymousClass6BV) videoComposerFragment.A0d.getValue(), 3, videoComposerFragment.A02, videoComposerFragment.A03);
    }

    public static final long A05(VideoComposerFragment videoComposerFragment) {
        return videoComposerFragment.A00((AnonymousClass6BV) videoComposerFragment.A0c.getValue(), 0, videoComposerFragment.A03, videoComposerFragment.A02);
    }

    public static final void A06(Uri uri, VideoComposerFragment videoComposerFragment, File file) {
        C1273567y r0;
        C1273567y r2 = null;
        try {
            C160827le A1a = videoComposerFragment.A1a();
            if (A1a == null || (r0 = C132366Tg.A01(uri, A1a).A05()) == null) {
                if (file != null) {
                    r0 = new C1273567y(file);
                }
                videoComposerFragment.A0K = r2;
            }
            r2 = r0;
        } catch (AnonymousClass1GL e) {
            Log.e("VideoComposerFragment/bad video", e);
        }
        videoComposerFragment.A0K = r2;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putBoolean("key_video_is_muted", this.A0O);
    }

    public void A1S(Bundle bundle, View view) {
        File file;
        View view2 = view;
        AnonymousClass00C.A0D(view, 0);
        Bundle bundle2 = bundle;
        super.A1S(bundle, view);
        Uri uri = this.A00;
        if (uri != null) {
            C18740tg.A0C(AnonymousClass000.A1W(this.A0L));
            C160827le A1a = A1a();
            if (A1a != null) {
                file = C132366Tg.A01(uri, A1a).A08();
            } else {
                file = null;
            }
            this.A0M = file;
            C20810yC r1 = this.A0A;
            if (r1 == null) {
                throw C36321k7.A07();
            } else if (r1.A0E(7950)) {
                C36331k8.A1T(new VideoComposerFragment$onViewCreated$1(uri, bundle2, view2, this, (C023509x) null), C33311f5.A00(A0i()));
            } else {
                A06(uri, this, this.A0M);
                A1o(uri, bundle, view);
            }
        }
    }

    public void A1h(AnonymousClass6VT r3, C146636vv r4, C129126Fh r5) {
        AnonymousClass00C.A0D(r5, 0);
        C36321k7.A0x(r4, r3);
        super.A1h(r3, r4, r5);
        A1e();
        r5.A0I.setCropToolVisibility(8);
        r4.A01();
        if (this.A0Q) {
            Boolean bool = C18750th.A01;
            A1d();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
        if (r5 != true) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014b, code lost:
        if (r6 != true) goto L_0x014d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:349:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1o(android.net.Uri r40, android.os.Bundle r41, android.view.View r42) {
        /*
            r39 = this;
            r4 = 0
            r3 = r40
            r1 = r42
            int r14 = X.C36361kB.A04(r1, r3, r4)
            r0 = r39
            X.1GJ r7 = r0.A0E
            if (r7 == 0) goto L_0x05f8
            android.content.Context r6 = r0.A1D()
            X.67y r5 = r0.A0K
            r2 = 1280(0x500, float:1.794E-42)
            X.011 r6 = r7.A0F(r6, r3, r5, r2)
            X.1E2 r5 = r0.A0F
            if (r5 == 0) goto L_0x05f1
            r21 = 0
            r2 = r21
            boolean r2 = r5.A01(r2, r6)
            r0.A0N = r2
            X.7le r2 = r0.A1a()
            if (r2 == 0) goto L_0x05f0
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            X.6Fh r2 = r2.A10
            if (r2 == 0) goto L_0x05f0
            r0.A0H = r2
            r2 = 1
            X.0wo r11 = r0.A0C
            if (r11 == 0) goto L_0x05e9
            X.0yC r10 = r0.A0A
            if (r10 == 0) goto L_0x05e4
            X.0yW r9 = r0.A0D
            if (r9 == 0) goto L_0x05dd
            X.67y r5 = r0.A0K
            r12 = 0
            if (r5 == 0) goto L_0x00b0
            long r5 = r5.A03
        L_0x004c:
            long r29 = X.C36391kE.A0B(r5)
            r31 = -1
            java.lang.Integer r26 = java.lang.Integer.valueOf(r14)
            java.io.File r5 = r0.A0M
            if (r5 == 0) goto L_0x00ad
            long r33 = r5.length()
        L_0x005e:
            X.67y r5 = r0.A0K
            if (r5 == 0) goto L_0x00a8
            int r6 = r5.A02
            long r7 = (long) r6
            int r5 = r5.A00
            long r5 = (long) r5
        L_0x0068:
            X.5NL r15 = new X.5NL
            r27 = 1
            r28 = r14
            r35 = r7
            r37 = r5
            r22 = r15
            r23 = r11
            r24 = r10
            r25 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r37)
            java.io.File r11 = r0.A0M
            if (r11 == 0) goto L_0x0109
            X.0wU r5 = r0.A0R
            if (r5 == 0) goto L_0x00cf
            X.AnonymousClass736.A00(r5, r15, r0, r11, r14)
            X.0yC r10 = r0.A0A
            if (r10 == 0) goto L_0x00ca
            X.17Y r9 = r0.A02
            if (r9 == 0) goto L_0x00c5
            X.0yb r8 = r0.A04
            if (r8 == 0) goto L_0x00c0
            android.content.Context r22 = r0.A0a()
            X.0wG r7 = r0.A05
            if (r7 == 0) goto L_0x00b9
            X.7le r5 = r0.A1a()
            if (r5 == 0) goto L_0x00d9
            X.6QO r6 = X.C132366Tg.A01(r3, r5)
            monitor-enter(r6)
            goto L_0x00b3
        L_0x00a8:
            r7 = 0
            r5 = 0
            goto L_0x0068
        L_0x00ad:
            r33 = 0
            goto L_0x005e
        L_0x00b0:
            r5 = 0
            goto L_0x004c
        L_0x00b3:
            boolean r5 = r6.A0C     // Catch:{ all -> 0x00b6 }
            goto L_0x00d4
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x00b9:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c0:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x00c5:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x00ca:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x00cf:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x00d4:
            monitor-exit(r6)
            r32 = 1
            if (r5 == r2) goto L_0x00db
        L_0x00d9:
            r32 = 0
        L_0x00db:
            boolean r5 = X.AnonymousClass6YG.A01()
            boolean r33 = X.AnonymousClass000.A1P(r5)
            X.0wU r6 = r0.A0R
            if (r6 == 0) goto L_0x05d8
            X.005 r5 = r0.A0U
            if (r5 == 0) goto L_0x05d1
            java.lang.Object r5 = r5.get()
            X.6KH r5 = (X.AnonymousClass6KH) r5
            r31 = 0
            r23 = r9
            r24 = r8
            r25 = r7
            r26 = r10
            r27 = r5
            r28 = r6
            r29 = r15
            r30 = r11
            X.3Qq r5 = X.C65083Qq.A03(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0.A0L = r5
        L_0x0109:
            X.3Qq r5 = r0.A0L
            if (r5 == 0) goto L_0x0115
            r5.A0O(r14)
            android.view.View$OnAttachStateChangeListener r5 = r0.A0e
            r1.addOnAttachStateChangeListener(r5)
        L_0x0115:
            X.7le r5 = r0.A1a()
            if (r5 == 0) goto L_0x019a
            android.net.Uri r5 = r5.B8e()
        L_0x011f:
            boolean r5 = r3.equals(r5)
            r10 = 0
            if (r5 == 0) goto L_0x013c
            X.3Qq r5 = r0.A0L
            if (r5 == 0) goto L_0x0133
            android.view.View r5 = r5.A08()
            if (r5 == 0) goto L_0x0133
            r5.setAlpha(r10)
        L_0x0133:
            X.01I r5 = r0.A0h()
            if (r5 == 0) goto L_0x013c
            r5.A1q()
        L_0x013c:
            X.7le r5 = r0.A1a()
            if (r5 == 0) goto L_0x014d
            X.6QO r5 = X.C132366Tg.A01(r3, r5)
            boolean r6 = r5.A0K()
            r5 = 1
            if (r6 == r2) goto L_0x014e
        L_0x014d:
            r5 = 0
        L_0x014e:
            r0.A0Q = r5
            java.io.File r7 = r0.A0M
            if (r7 == 0) goto L_0x0198
            X.1GJ r6 = r0.A0E
            if (r6 == 0) goto L_0x05ca
            X.7le r5 = r0.A1a()
            if (r5 == 0) goto L_0x0195
            com.whatsapp.mediacomposer.MediaComposerActivity r5 = (com.whatsapp.mediacomposer.MediaComposerActivity) r5
            X.6VT r5 = r5.A0s
            X.00s r5 = r5.A02
            java.util.List r5 = X.C36401kF.A0w(r5)
            if (r5 == 0) goto L_0x0195
        L_0x016a:
            boolean r5 = X.AnonymousClass143.A0L(r5)
            if (r5 == 0) goto L_0x0192
            X.1Gl r5 = X.C25471Gl.A0X
        L_0x0172:
            boolean r5 = r6.A0I(r5, r7)
        L_0x0176:
            r0.A0Y = r5
            r0.A05 = r12
            long r5 = X.C90474aD.A0E(r0)
            r0.A01 = r5
            r0.A06 = r5
            r0.A03 = r5
            r0.A02 = r5
            X.7le r7 = r0.A1a()
            if (r7 == 0) goto L_0x01a4
            X.6QO r7 = X.C132366Tg.A01(r3, r7)
            monitor-enter(r7)
            goto L_0x019d
        L_0x0192:
            X.1Gl r5 = X.C25471Gl.A0i
            goto L_0x0172
        L_0x0195:
            X.09w r5 = X.C023409w.A00
            goto L_0x016a
        L_0x0198:
            r5 = 0
            goto L_0x0176
        L_0x019a:
            r5 = r21
            goto L_0x011f
        L_0x019d:
            r7.A02 = r5     // Catch:{ all -> 0x01a0 }
            goto L_0x01a3
        L_0x01a0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x01a3:
            monitor-exit(r7)
        L_0x01a4:
            X.7le r5 = r0.A1a()
            if (r5 == 0) goto L_0x03b1
            com.whatsapp.mediacomposer.MediaComposerActivity r5 = (com.whatsapp.mediacomposer.MediaComposerActivity) r5
            X.6VT r5 = r5.A0s
            X.00s r5 = r5.A02
            java.util.List r6 = X.C36401kF.A0w(r5)
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x03ae
            int r5 = r6.size()
            if (r5 != r2) goto L_0x03ae
            java.lang.Object r5 = r6.get(r4)
            boolean r5 = r5 instanceof X.C177528dw
        L_0x01c6:
            r0.A0S = r5
            X.7le r5 = r0.A1a()
            if (r5 == 0) goto L_0x03ab
            com.whatsapp.mediacomposer.MediaComposerActivity r5 = (com.whatsapp.mediacomposer.MediaComposerActivity) r5
            X.6VT r5 = r5.A0s
            X.00s r5 = r5.A02
            java.util.List r5 = X.C36401kF.A0w(r5)
            boolean r5 = X.AnonymousClass143.A0L(r5)
        L_0x01dc:
            r0.A0R = r5
            X.7le r7 = r0.A1a()
            if (r7 == 0) goto L_0x03a7
            com.whatsapp.mediacomposer.MediaComposerActivity r7 = (com.whatsapp.mediacomposer.MediaComposerActivity) r7
            X.6VT r5 = r7.A0s
            X.00s r5 = r5.A02
            java.util.List r6 = X.C36401kF.A0w(r5)
            X.6VT r5 = r7.A0s
            X.00s r5 = r5.A02
            java.util.List r5 = X.C36401kF.A0w(r5)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x03a3
            X.8dw r5 = X.C177528dw.A00
            boolean r20 = r6.contains(r5)
        L_0x0202:
            r5 = 2131435119(0x7f0b1e6f, float:1.8492071E38)
            android.view.View r5 = r1.findViewById(r5)
            r0.A08 = r5
            r5 = 2131432750(0x7f0b152e, float:1.8487266E38)
            android.view.View r6 = r1.findViewById(r5)
            r5 = 12
            X.C135466ck.A00(r6, r0, r5)
            r0.A07 = r6
            r5 = 2131434116(0x7f0b1a84, float:1.8490037E38)
            android.widget.TextView r5 = X.C36391kE.A0P(r1, r5)
            r0.A0X = r5
            r5 = 2131429715(0x7f0b0953, float:1.848111E38)
            android.widget.TextView r5 = X.C36391kE.A0P(r1, r5)
            r0.A0W = r5
            r5 = 2131434895(0x7f0b1d8f, float:1.8491617E38)
            android.widget.TextView r5 = X.C36391kE.A0P(r1, r5)
            r0.A0A = r5
            r5 = 2131434896(0x7f0b1d90, float:1.8491619E38)
            android.view.View r5 = r1.findViewById(r5)
            r0.A0U = r5
            r5 = 2131435123(0x7f0b1e73, float:1.849208E38)
            android.widget.ImageView r5 = X.C36391kE.A0N(r1, r5)
            r0.A09 = r5
            r5 = 2131431848(0x7f0b11a8, float:1.8485437E38)
            android.view.View r5 = r1.findViewById(r5)
            r0.A0T = r5
            r5 = 2131431847(0x7f0b11a7, float:1.8485435E38)
            android.widget.ImageView r5 = X.C36391kE.A0N(r1, r5)
            r0.A0V = r5
            X.0yC r6 = r0.A0A
            if (r6 == 0) goto L_0x05c5
            r5 = 325(0x145, float:4.55E-43)
            boolean r5 = r6.A0E(r5)
            if (r5 == 0) goto L_0x03a0
            A0B(r0)
            android.view.View r5 = r0.A0T
            if (r5 == 0) goto L_0x03a0
            r9 = 0
            r5.setVisibility(r4)
            android.view.View$OnClickListener r4 = r0.A0f
            r5.setOnClickListener(r4)
        L_0x0274:
            X.7le r8 = r0.A1a()
            if (r8 == 0) goto L_0x02ce
            long r18 = A05(r0)
            X.00T r4 = r0.A0c
            java.lang.Object r4 = r4.getValue()
            X.6BV r4 = (X.AnonymousClass6BV) r4
            int r4 = r4.A00
            long r6 = (long) r4
            r16 = 1048576(0x100000, double:5.180654E-318)
            long r14 = r6 * r16
            int r4 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x029d
            long r4 = X.C90474aD.A0E(r0)
            long r4 = r4 * r6
            long r4 = r4 * r16
            long r4 = r4 / r18
            r0.A03 = r4
        L_0x029d:
            long r4 = r0.A03
            int r8 = r8.BDu(r4)
            if (r8 <= 0) goto L_0x02ce
            long r6 = r0.A03
            long r4 = X.C36371kC.A07(r8)
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x02ce
            r0.A03 = r4
            X.0yC r5 = r0.A0A
            if (r5 == 0) goto L_0x05c0
            r4 = 4361(0x1109, float:6.111E-42)
            boolean r4 = r5.A0E(r4)
            if (r4 == 0) goto L_0x02ce
            boolean r4 = r0.A0S
            if (r4 != 0) goto L_0x0397
            if (r20 != 0) goto L_0x0397
            X.1X7 r5 = r0.A0I
            if (r5 == 0) goto L_0x05b2
            android.content.Context r4 = r0.A0a()
            r5.A02(r4, r8)
        L_0x02ce:
            X.7le r8 = r0.A1a()
            if (r8 == 0) goto L_0x030f
            boolean r4 = r0.A0N
            if (r4 == 0) goto L_0x030f
            long r18 = A03(r0)
            X.00T r4 = r0.A0c
            java.lang.Object r4 = r4.getValue()
            X.6BV r4 = (X.AnonymousClass6BV) r4
            int r4 = r4.A00
            long r6 = (long) r4
            r16 = 1048576(0x100000, double:5.180654E-318)
            long r14 = r6 * r16
            int r4 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x02fb
            long r4 = X.C90474aD.A0E(r0)
            long r4 = r4 * r6
            long r4 = r4 * r16
            long r4 = r4 / r18
            r0.A02 = r4
        L_0x02fb:
            long r4 = r0.A02
            int r4 = r8.BDu(r4)
            if (r4 <= 0) goto L_0x030f
            long r6 = r0.A02
            long r4 = X.C36371kC.A07(r4)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x030f
            r0.A02 = r4
        L_0x030f:
            int r5 = r0.A00
            r4 = 3
            if (r5 != r4) goto L_0x0394
            long r4 = r0.A02
        L_0x0316:
            r0.A01 = r4
            X.67y r6 = r0.A0K
            if (r6 == 0) goto L_0x031e
            long r12 = r6.A03
        L_0x031e:
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x032f
            X.66x r7 = r0.A0Q
            if (r7 == 0) goto L_0x05ab
            r6 = 8
            r5 = 11
            r4 = r21
            r7.A02(r4, r6, r5)
        L_0x032f:
            long r4 = r0.A01
            r0.A06 = r4
            X.7le r4 = r0.A1a()
            if (r4 == 0) goto L_0x0383
            X.6QO r4 = X.C132366Tg.A01(r3, r4)
            android.graphics.Point r6 = r4.A03()
            if (r6 == 0) goto L_0x0383
            int r4 = r6.x
            long r4 = (long) r4
            r0.A05 = r4
            int r4 = r6.y
            long r4 = (long) r4
            r0.A06 = r4
        L_0x034d:
            A05(r0)
            boolean r4 = r0.A0N
            if (r4 == 0) goto L_0x0357
            A03(r0)
        L_0x0357:
            r4 = 2131434711(0x7f0b1cd7, float:1.8491244E38)
            android.view.View r13 = r1.findViewById(r4)
            r8 = r13
            com.whatsapp.mediacomposer.VideoTimelineView r8 = (com.whatsapp.mediacomposer.VideoTimelineView) r8
            java.io.File r12 = r0.A0M
            long r4 = X.C90474aD.A0E(r0)
            r8.A0I = r12
            r7 = 0
            r8.A0J = r7
            X.6Tt r6 = r8.A0G
            if (r6 == 0) goto L_0x0375
            r6.A0D(r2)
            r8.A0G = r7
        L_0x0375:
            r6 = 0
            if (r12 == 0) goto L_0x03d7
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 != 0) goto L_0x03da
            X.1le r11 = new X.1le
            r11.<init>()
            goto L_0x03b4
        L_0x0383:
            X.7le r11 = r0.A1a()
            if (r11 == 0) goto L_0x034d
            long r6 = r0.A05
            long r4 = r0.A06
            r12 = r3
            r13 = r6
            r15 = r4
            r11.Bsc(r12, r13, r15)
            goto L_0x034d
        L_0x0394:
            long r4 = r0.A03
            goto L_0x0316
        L_0x0397:
            X.1X7 r4 = r0.A0I
            if (r4 == 0) goto L_0x05b9
            r4.A01(r8)
            goto L_0x02ce
        L_0x03a0:
            r9 = 0
            goto L_0x0274
        L_0x03a3:
            r20 = 0
            goto L_0x0202
        L_0x03a7:
            r20 = 0
            goto L_0x0202
        L_0x03ab:
            r5 = 0
            goto L_0x01dc
        L_0x03ae:
            r5 = 0
            goto L_0x01c6
        L_0x03b1:
            r5 = 0
            goto L_0x01c6
        L_0x03b4:
            java.lang.String r4 = r12.getAbsolutePath()     // Catch:{ all -> 0x03cd }
            r11.setDataSource(r4)     // Catch:{ all -> 0x03cd }
            r4 = 9
            java.lang.String r4 = r11.extractMetadata(r4)     // Catch:{ all -> 0x03cd }
            if (r4 == 0) goto L_0x03c9
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x03cd }
            r8.A08 = r4     // Catch:{ all -> 0x03cd }
        L_0x03c9:
            r11.close()
            goto L_0x03dc
        L_0x03cd:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x03d2 }
            throw r1
        L_0x03d2:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x03d7:
            r8.A08 = r6
            goto L_0x03dc
        L_0x03da:
            r8.A08 = r4
        L_0x03dc:
            r8.A0A = r6
            long r4 = r8.A08
            r8.A0B = r4
            r8.invalidate()
            long r6 = r0.A05
            long r4 = r0.A06
            r8.A0A = r6
            r8.A0B = r4
            r8.invalidate()
            boolean r6 = r0.A0Q
            long r4 = r0.A01
            if (r6 == 0) goto L_0x03fe
            r11 = 7000(0x1b58, double:3.4585E-320)
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x03fe
            r4 = 7000(0x1b58, double:3.4585E-320)
        L_0x03fe:
            r8.A09 = r4
            X.6vt r4 = new X.6vt
            r4.<init>(r0)
            r8.A0D = r4
            X.6vu r4 = new X.6vu
            r4.<init>(r0)
            r8.A0E = r4
            X.AnonymousClass00C.A08(r13)
            r0.A0G = r8
            X.3Qq r5 = r0.A0L
            if (r5 == 0) goto L_0x0594
            X.7qI r4 = new X.7qI
            r4.<init>(r0, r9)
            r5.A05 = r4
            android.view.View r7 = r5.A08()
        L_0x0422:
            boolean r4 = r7 instanceof com.whatsapp.videoplayback.VideoSurfaceView
            if (r4 == 0) goto L_0x047a
            com.whatsapp.videoplayback.VideoSurfaceView r7 = (com.whatsapp.videoplayback.VideoSurfaceView) r7
            if (r7 == 0) goto L_0x047a
            X.67y r4 = r0.A0K
            if (r4 == 0) goto L_0x0580
            r0.A1Z()
            boolean r4 = r4.A02()
            if (r4 != r2) goto L_0x0580
            X.67y r4 = r0.A0K
            if (r4 == 0) goto L_0x0588
            int r8 = r4.A00
        L_0x043d:
            r0.A1Z()
            boolean r4 = r4.A02()
            if (r4 != r2) goto L_0x0589
            X.67y r4 = r0.A0K
            if (r4 == 0) goto L_0x0591
            int r6 = r4.A02
        L_0x044c:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "videoview/setVideoDimensions: "
            r5.append(r4)
            r5.append(r8)
            java.lang.String r4 = "x"
            X.C36321k7.A1T(r4, r5, r6)
            r7.A07 = r8
            r7.A06 = r6
            X.7pl r6 = new X.7pl
            r6.<init>(r0, r2)
            X.7le r4 = r0.A1a()
            if (r4 == 0) goto L_0x047a
            com.whatsapp.mediacomposer.MediaComposerActivity r4 = (com.whatsapp.mediacomposer.MediaComposerActivity) r4
            X.3K8 r5 = r4.A0h
            if (r5 == 0) goto L_0x047a
            X.7pm r4 = new X.7pm
            r4.<init>(r7, r2)
            r5.A02(r6, r4)
        L_0x047a:
            r4 = r41
            if (r41 != 0) goto L_0x0573
            X.7le r4 = r0.A1a()
            if (r4 == 0) goto L_0x056f
            X.6QO r4 = X.C132366Tg.A01(r3, r4)
            java.lang.String r12 = r4.A0B()
        L_0x048c:
            X.7le r4 = r0.A1a()
            if (r4 == 0) goto L_0x056b
            java.lang.String r6 = r4.BBN(r3)
        L_0x0496:
            if (r12 != 0) goto L_0x0540
            X.67y r4 = r0.A0K
            if (r4 == 0) goto L_0x0535
            r0.A1Z()
            boolean r4 = r4.A02()
            if (r4 != r2) goto L_0x0535
            X.67y r5 = r0.A0K
            if (r5 == 0) goto L_0x053d
            int r4 = r5.A00
        L_0x04ab:
            float r6 = (float) r4
            if (r5 == 0) goto L_0x052e
            r0.A1Z()
            boolean r4 = r5.A02()
            if (r4 != r2) goto L_0x052e
            X.67y r2 = r0.A0K
            if (r2 == 0) goto L_0x04bd
            int r9 = r2.A02
        L_0x04bd:
            float r2 = (float) r9
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r10, r10, r6, r2)
            X.6wC r4 = r0.A0E
            if (r4 == 0) goto L_0x04d2
            X.6OT r2 = r4.A0O
            r2.A07 = r5
            com.whatsapp.mediacomposer.doodle.DoodleView r2 = r4.A0N
            r2.A00 = r10
            r4.A0B(r5)
        L_0x04d2:
            r2 = 2131435129(0x7f0b1e79, float:1.8492091E38)
            android.view.ViewGroup r6 = X.C36411kG.A0P(r1, r2)
            r2 = 2
            X.C011504z.A06(r6, r2)
            X.3Qq r8 = r0.A0L
            if (r8 == 0) goto L_0x04f8
            android.view.View r7 = r8.A08()
            r5 = 17
            r4 = -1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r4, r4, r5)
            r6.addView(r7, r2)
            long r4 = r0.A05
            int r2 = (int) r4
            int r2 = r2 + 1
            r8.A0L(r2)
        L_0x04f8:
            r2 = 2131428898(0x7f0b0622, float:1.8479453E38)
            android.view.View r4 = r1.findViewById(r2)
            int r2 = r4.getPaddingLeft()
            int r1 = r4.getPaddingTop()
            int r1 = r1 * 2
            X.C36341k9.A0z(r4, r2, r1)
            r1 = 15
            X.C135466ck.A00(r6, r0, r1)
            X.7le r1 = r0.A1a()
            if (r1 == 0) goto L_0x051b
            android.net.Uri r21 = r1.B8e()
        L_0x051b:
            r1 = r21
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x05f0
            android.view.View r1 = r0.A0d()
            r0 = 2131429151(0x7f0b071f, float:1.8479967E38)
            X.C90494aF.A0v(r1, r0)
            return
        L_0x052e:
            X.67y r2 = r0.A0K
            if (r2 == 0) goto L_0x04bd
            int r9 = r2.A00
            goto L_0x04bd
        L_0x0535:
            X.67y r5 = r0.A0K
            if (r5 == 0) goto L_0x053d
            int r4 = r5.A02
            goto L_0x04ab
        L_0x053d:
            r4 = 0
            goto L_0x04ab
        L_0x0540:
            X.6Nc r7 = X.AnonymousClass6VQ.A05
            android.content.Context r8 = r0.A0a()
            X.1H2 r5 = r0.A08
            if (r5 == 0) goto L_0x05a4
            X.0ts r4 = r0.A07
            if (r4 == 0) goto L_0x059f
            X.1HA r2 = r0.A0K
            if (r2 == 0) goto L_0x0598
            r9 = r4
            r10 = r5
            r11 = r2
            X.6VQ r5 = r7.A02(r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x04d2
            X.6wC r4 = r0.A0E
            if (r4 == 0) goto L_0x04d2
            com.whatsapp.mediacomposer.doodle.DoodleView r2 = r4.A0N
            r2.setDoodle(r5)
            X.6FV r2 = r4.A0T
            r2.A05(r6)
            goto L_0x04d2
        L_0x056b:
            r6 = r21
            goto L_0x0496
        L_0x056f:
            r12 = r21
            goto L_0x048c
        L_0x0573:
            java.lang.String r2 = "key_video_is_muted"
            boolean r2 = r4.getBoolean(r2, r9)
            r0.A0O = r2
            A0C(r0)
            goto L_0x04d2
        L_0x0580:
            X.67y r4 = r0.A0K
            if (r4 == 0) goto L_0x0588
            int r8 = r4.A02
            goto L_0x043d
        L_0x0588:
            r8 = 0
        L_0x0589:
            X.67y r4 = r0.A0K
            if (r4 == 0) goto L_0x0591
            int r6 = r4.A00
            goto L_0x044c
        L_0x0591:
            r6 = 0
            goto L_0x044c
        L_0x0594:
            r7 = r21
            goto L_0x0422
        L_0x0598:
            java.lang.String r0 = "stickerImageFileLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x059f:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x05a4:
            java.lang.String r0 = "emojiLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05ab:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05b2:
            java.lang.String r0 = "mediaUI"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05b9:
            java.lang.String r0 = "mediaUI"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05c0:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x05c5:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x05ca:
            java.lang.String r0 = "transcodeUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05d1:
            java.lang.String r0 = "heroSettingProvider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05d8:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x05dd:
            java.lang.String r0 = "wamRuntime"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05e4:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x05e9:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05f0:
            return
        L_0x05f1:
            java.lang.String r0 = "videoQuality"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05f8:
            java.lang.String r0 = "transcodeUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoComposerFragment.A1o(android.net.Uri, android.os.Bundle, android.view.View):void");
    }

    private final long A00(AnonymousClass6BV r23, int i, long j, long j2) {
        long j3;
        File file;
        long j4 = this.A06;
        long j5 = this.A05;
        long j6 = j4 - j5;
        long j7 = 0;
        int i2 = i;
        if (this.A00 == i2 || (j6 <= j && (j6 != j2 || j <= j2))) {
            j3 = j4;
        } else {
            if (j < 1000) {
                j = 1000;
            }
            j3 = j5 + j;
            long A0E2 = C90474aD.A0E(this);
            if (j3 > A0E2) {
                j3 = A0E2;
            }
        }
        C1273567y r13 = this.A0K;
        AnonymousClass6BV r12 = r23;
        if (!(r13 == null || (file = this.A0M) == null)) {
            AnonymousClass1GJ r11 = this.A0E;
            if (r11 != null) {
                Long valueOf = Long.valueOf(r11.A0B(r12, r13, file, j3, this.A05, this.A0Q, this.A0O, this.A0Y));
                if (valueOf != null) {
                    j7 = valueOf.longValue();
                }
            } else {
                throw C36331k8.A0d("transcodeUtils");
            }
        }
        if (this.A00 == i2) {
            long j8 = this.A06 - this.A05;
            if (j8 < 1000) {
                j8 = 1000;
            }
            TextView textView = this.A0W;
            if (textView != null) {
                C18820ts r6 = this.A07;
                if (r6 != null) {
                    C90504aG.A16(textView, r6, j8 / 1000);
                } else {
                    throw C36321k7.A09();
                }
            }
            TextView textView2 = this.A0X;
            if (textView2 != null) {
                C18820ts r2 = this.A07;
                if (r2 != null) {
                    textView2.setText(AnonymousClass3TF.A02(r2, j7));
                } else {
                    throw C36321k7.A09();
                }
            }
        }
        AnonymousClass1GJ r8 = this.A0E;
        if (r8 != null) {
            Uri fromFile = Uri.fromFile(this.A0M);
            AnonymousClass011 A0F2 = r8.A0F(A1D(), fromFile, this.A0K, r12.A02);
            this.A0b.put(Integer.valueOf(i2), new AnonymousClass6AP(A0F2, j7));
            return j7;
        }
        throw C36331k8.A0d("transcodeUtils");
    }

    public static final void A08(VideoComposerFragment videoComposerFragment) {
        C18820ts r2 = videoComposerFragment.A07;
        if (r2 != null) {
            StringBuilder A0i = C90524aI.A0i(AnonymousClass3UY.A07(r2, videoComposerFragment.A05 / 1000));
            A0i.append(" - ");
            C18820ts r22 = videoComposerFragment.A07;
            if (r22 != null) {
                A0i.append(AnonymousClass3UY.A07(r22, videoComposerFragment.A06 / 1000));
                TextView textView = videoComposerFragment.A0A;
                if (textView != null) {
                    textView.setText(A0i.toString());
                    return;
                }
                return;
            }
            throw C36321k7.A09();
        }
        throw C36321k7.A09();
    }

    public static final void A09(VideoComposerFragment videoComposerFragment) {
        Boolean bool = C18750th.A01;
        C65083Qq r0 = videoComposerFragment.A0L;
        if (r0 != null) {
            if (r0.A0X()) {
                videoComposerFragment.A1l();
            }
            C65083Qq r3 = videoComposerFragment.A0L;
            if (r3 != null) {
                r3.A0L((int) videoComposerFragment.A05);
            }
            videoComposerFragment.A1d();
        }
    }

    public static final void A0A(VideoComposerFragment videoComposerFragment) {
        C65083Qq r0 = videoComposerFragment.A0L;
        if (r0 == null || !r0.A0X()) {
            C65083Qq r6 = videoComposerFragment.A0L;
            if (r6 != null) {
                r6.A08().setBackground((Drawable) null);
                if (((long) r6.A04()) > videoComposerFragment.A06 - 2000) {
                    r6.A0L((int) videoComposerFragment.A05);
                }
            }
            videoComposerFragment.A1d();
            return;
        }
        videoComposerFragment.A1l();
    }

    public static final void A0C(VideoComposerFragment videoComposerFragment) {
        C160827le A1a;
        if (!videoComposerFragment.A0Q) {
            Uri uri = videoComposerFragment.A00;
            if (!(uri == null || (A1a = videoComposerFragment.A1a()) == null)) {
                boolean z = videoComposerFragment.A0O;
                AnonymousClass6QO A012 = C132366Tg.A01(uri, A1a);
                synchronized (A012) {
                    A012.A0D = z;
                }
            }
            A0B(videoComposerFragment);
            C65083Qq r1 = videoComposerFragment.A0L;
            if (r1 != null) {
                r1.A0V(videoComposerFragment.A0O);
            }
            if (videoComposerFragment.A00 == 3) {
                A03(videoComposerFragment);
            } else {
                A05(videoComposerFragment);
            }
        }
    }

    public final void A1m(float f, boolean z) {
        View view;
        DoodleView doodleView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator scaleX2;
        C65083Qq r0 = this.A0L;
        ViewPropertyAnimator viewPropertyAnimator = null;
        if (r0 != null) {
            view = r0.A08();
        } else {
            view = null;
        }
        if (z) {
            if (!(view == null || (animate2 = view.animate()) == null || (scaleX2 = animate2.scaleX(f)) == null)) {
                viewPropertyAnimator = scaleX2.scaleY(f);
            }
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.setDuration(200);
            }
            C146806wC r02 = this.A0E;
            if (r02 != null && (doodleView = r02.A0N) != null && (animate = doodleView.animate()) != null && (scaleX = animate.scaleX(f)) != null && (scaleY = scaleX.scaleY(f)) != null) {
                scaleY.setDuration(200);
                return;
            }
            return;
        }
        if (view != null) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
        C146806wC r03 = this.A0E;
        if (r03 != null) {
            DoodleView doodleView2 = r03.A0N;
            doodleView2.setScaleX(f);
            doodleView2.setScaleY(f);
        }
    }

    public final void A1n(int i, boolean z) {
        View A082;
        C65083Qq r0 = this.A0L;
        if (r0 != null && (A082 = r0.A08()) != null) {
            float bottom = (float) A082.getBottom();
            float f = ((float) 1) - ((bottom - ((float) i)) / bottom);
            float f2 = 1.0f;
            if (1.0f > f) {
                f2 = f;
            }
            float A012 = C36441kJ.A01(A082) / 2.0f;
            A082.setPivotX(A012);
            A082.setPivotY(0.0f);
            C146806wC r02 = this.A0E;
            if (r02 != null) {
                DoodleView doodleView = r02.A0N;
                doodleView.setPivotX(A012);
                doodleView.setPivotY(0.0f);
            }
            A1m(f2, z);
        }
    }

    public VideoComposerFragment() {
        C19960wn r0 = C19960wn.A01;
        AnonymousClass00C.A08(r0);
        this.A0J = r0;
        this.A0a = new C1503074t((Object) this, 33);
        this.A0e = new C163397q8(this, 3);
        this.A0Z = new C135466ck(this, 13);
        this.A0f = new C135466ck(this, 14);
    }

    public static final void A07(View view, long j) {
        AlphaAnimation A0D2 = C36351kA.A0D();
        A0D2.setDuration(j);
        if (view != null) {
            view.startAnimation(A0D2);
            view.setVisibility(0);
        }
    }

    public static final void A0B(VideoComposerFragment videoComposerFragment) {
        int i;
        View view;
        View.OnClickListener onClickListener;
        Context A0a2 = videoComposerFragment.A0a();
        ImageView imageView = videoComposerFragment.A0V;
        if (imageView != null) {
            if (videoComposerFragment.A0Q) {
                imageView.setImageResource(R.drawable.ic_unmute);
                C90504aG.A11(A0a2, imageView, R.color.f6nameremoved);
                view = videoComposerFragment.A0T;
                if (view != null) {
                    onClickListener = null;
                } else {
                    return;
                }
            } else {
                if (videoComposerFragment.A0O) {
                    imageView.setImageResource(R.drawable.ic_unmute);
                    i = R.string.f12nameremoved;
                } else {
                    imageView.setImageResource(R.drawable.ic_mute);
                    i = R.string.f12nameremoved;
                }
                C36421kH.A0z(imageView, videoComposerFragment, i);
                C90504aG.A11(A0a2, imageView, R.color.f6nameremoved);
                view = videoComposerFragment.A0T;
                if (view != null) {
                    onClickListener = videoComposerFragment.A0f;
                } else {
                    return;
                }
            }
            view.setOnClickListener(onClickListener);
        }
    }

    public void A1H() {
        super.A1H();
        C65083Qq r0 = this.A0L;
        if (r0 != null) {
            r0.A0D();
            r0.A0B();
        }
        this.A0L = null;
    }

    public void A1J() {
        super.A1J();
        VideoTimelineView videoTimelineView = this.A0G;
        if (videoTimelineView != null) {
            videoTimelineView.A0D = null;
        }
        this.A0G = null;
        C65083Qq r0 = this.A0L;
        if (r0 != null) {
            r0.A0D();
            r0.A0B();
        }
        this.A0L = null;
    }

    public void A1K() {
        super.A1K();
        A1l();
    }

    public void A1L() {
        int i;
        super.A1L();
        C65083Qq r0 = this.A0L;
        if (r0 != null) {
            i = r0.A04();
        } else {
            i = 0;
        }
        C65083Qq r1 = this.A0L;
        if (r1 != null) {
            int i2 = i + 1;
            if (i > 0) {
                i2 = i - 1;
            }
            r1.A0L(i2);
            r1.A0L(i);
        }
    }

    public void A1g(Rect rect) {
        super.A1g(rect);
        if (this.A0F != null) {
            if (rect == null) {
                rect = new Rect(0, 0, 0, 0);
            }
            View view = this.A08;
            if (view != null) {
                view.setPadding(rect.left, C36441kJ.A06(C36341k9.A0G(this), R.dimen.f7nameremoved, rect.top), rect.right, C36441kJ.A06(C36341k9.A0G(this), R.dimen.f7nameremoved, rect.bottom));
            }
            View view2 = this.A0U;
            if (view2 != null) {
                view2.setPadding(rect.left, rect.top, rect.right, 0);
            }
        }
    }

    public void A1i(boolean z) {
        super.A1i(z);
        this.A0P = z;
    }
}
