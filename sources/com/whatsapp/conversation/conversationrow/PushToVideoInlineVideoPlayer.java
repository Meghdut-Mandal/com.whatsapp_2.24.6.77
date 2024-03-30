package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00C;
import X.AnonymousClass16J;
import X.AnonymousClass17Y;
import X.AnonymousClass1CM;
import X.AnonymousClass1QZ;
import X.AnonymousClass1SV;
import X.AnonymousClass1V6;
import X.AnonymousClass4SO;
import X.C05250Oz;
import X.C160527l9;
import X.C18700tb;
import X.C200099gb;
import X.C20810yC;
import X.C34831hi;
import X.C36321k7;
import X.C36331k8;
import X.C36441kJ;
import X.C47002cZ;
import X.C50372ke;
import X.C62683Hc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;

public final class PushToVideoInlineVideoPlayer extends FrameLayout implements C18700tb {
    public AnonymousClass17Y A00;
    public AnonymousClass1V6 A01;
    public AnonymousClass16J A02;
    public C20810yC A03;
    public C62683Hc A04;
    public AnonymousClass1QZ A05;
    public boolean A06;
    public final FrameLayout A07;
    public final WaImageView A08;
    public final C50372ke A09;
    public final C160527l9 A0A;
    public final C34831hi A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PushToVideoInlineVideoPlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void A04(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnTouchListener onTouchListener, C47002cZ r18, AnonymousClass1SV r19, AnonymousClass4SO r20, Runnable runnable, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass1SV r5 = r19;
        AnonymousClass00C.A0D(r5, 5);
        C200099gb uiState = getUiState();
        setUiState(new C200099gb(onClickListener, onLongClickListener, onTouchListener, r18, r5, r20, runnable, z, z2, z3, uiState.A0A, z4, uiState.A0C));
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setMessageAudioPlayerProvider(AnonymousClass1V6 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setMessageObservers(AnonymousClass16J r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setVideoPlayerPoolManager(C62683Hc r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    /* access modifiers changed from: private */
    public final C200099gb getUiState() {
        Object A042 = this.A0B.A04();
        AnonymousClass00C.A08(A042);
        return (C200099gb) A042;
    }

    private final void setUiState(C200099gb r2) {
        this.A0B.A0D(r2);
    }

    public final void A03() {
        C50372ke r3 = this.A09;
        if (r3.A00.A01() == 4) {
            r3.A0L(0);
            setPlayWhenReadyAndActive(true);
            return;
        }
        setPlayWhenReadyAndActive(!getUiState().A0C);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final int getCurrentPosition() {
        return this.A09.A04();
    }

    public final int getDuration() {
        return this.A09.A05();
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("globalUI");
    }

    public final AnonymousClass1V6 getMessageAudioPlayerProvider() {
        AnonymousClass1V6 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("messageAudioPlayerProvider");
    }

    public final AnonymousClass16J getMessageObservers() {
        AnonymousClass16J r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("messageObservers");
    }

    public final boolean getPlayWhenReady() {
        return this.A09.A00.A07;
    }

    public final int getPlaybackState() {
        return this.A09.A00.A01();
    }

    public final C62683Hc getVideoPlayerPoolManager() {
        C62683Hc r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("videoPlayerPoolManager");
    }

    public static final void A01(PushToVideoInlineVideoPlayer pushToVideoInlineVideoPlayer, int i, boolean z) {
        C47002cZ r2 = pushToVideoInlineVideoPlayer.getUiState().A03;
        if (r2 != null && pushToVideoInlineVideoPlayer.getUiState().A08 && z && i == 3 && AnonymousClass1CM.A02(r2)) {
            pushToVideoInlineVideoPlayer.getMessageObservers().A05(r2, 25);
        }
        AnonymousClass4SO r0 = pushToVideoInlineVideoPlayer.getUiState().A05;
        if (r0 != null) {
            r0.Bcs(z, i);
        }
    }

    public final void A02() {
        AnonymousClass1SV r0;
        C47002cZ r2 = getUiState().A03;
        if (r2 != null && (r0 = getUiState().A04) != null) {
            r0.A0E(this.A08, r2, this.A0A, r2.A1J, false);
        }
    }

    public final boolean getPlayWhenReadyAndActive() {
        return getUiState().A0C;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C200099gb uiState = getUiState();
        C47002cZ r4 = uiState.A03;
        boolean z = uiState.A08;
        boolean z2 = uiState.A0B;
        boolean z3 = uiState.A07;
        boolean z4 = uiState.A09;
        setUiState(new C200099gb(uiState.A00, uiState.A01, uiState.A02, r4, uiState.A04, uiState.A05, uiState.A06, z, z2, z3, true, z4, false));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C200099gb uiState = getUiState();
        C47002cZ r4 = uiState.A03;
        boolean z = uiState.A08;
        boolean z2 = uiState.A0B;
        boolean z3 = uiState.A07;
        boolean z4 = uiState.A09;
        boolean z5 = uiState.A0C;
        setUiState(new C200099gb(uiState.A00, uiState.A01, uiState.A02, r4, uiState.A04, uiState.A05, uiState.A06, z, z2, z3, false, z4, z5));
    }

    public final void setPlayWhenReadyAndActive(boolean z) {
        C200099gb uiState = getUiState();
        C47002cZ r4 = uiState.A03;
        boolean z2 = uiState.A08;
        boolean z3 = uiState.A0B;
        boolean z4 = uiState.A07;
        boolean z5 = uiState.A0A;
        boolean z6 = uiState.A09;
        setUiState(new C200099gb(uiState.A00, uiState.A01, uiState.A02, r4, uiState.A04, uiState.A05, uiState.A06, z2, z3, z4, z5, z6, z));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PushToVideoInlineVideoPlayer(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r1 = 1
            r4 = r21
            X.AnonymousClass00C.A0D(r4, r1)
            r3 = r20
            r2 = r22
            r0 = r23
            r3.<init>(r4, r2, r0)
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x004b
            r3.A06 = r1
            java.lang.Object r0 = r3.generatedComponent()
            X.1Qb r0 = (X.C27851Qb) r0
            X.1Qc r0 = (X.C27861Qc) r0
            X.0tq r2 = r0.A0M
            X.0yC r0 = X.C36341k9.A0V(r2)
            r3.A03 = r0
            X.17Y r0 = X.C36351kA.A0M(r2)
            r3.A00 = r0
            X.16J r0 = X.C36361kB.A0Z(r2)
            r3.A02 = r0
            X.0tt r0 = r2.A00
            X.004 r0 = r0.A4H
            java.lang.Object r0 = r0.get()
            X.3Hc r0 = (X.C62683Hc) r0
            r3.A04 = r0
            X.004 r0 = r2.A4v
            java.lang.Object r0 = r0.get()
            X.1V6 r0 = (X.AnonymousClass1V6) r0
            r3.A01 = r0
        L_0x004b:
            r7 = 0
            r14 = 0
            X.9gb r6 = new X.9gb
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r8 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1hi r5 = new X.1hi
            r5.<init>(r6)
            r3.A0B = r5
            android.content.res.Resources r2 = r3.getResources()
            r0 = 2131895650(0x7f122562, float:1.942614E38)
            java.lang.String r2 = r2.getString(r0)
            X.AnonymousClass00C.A08(r2)
            android.widget.FrameLayout r7 = new android.widget.FrameLayout
            r7.<init>(r4)
            r9 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r9, r9)
            r7.setLayoutParams(r0)
            r7.setClipChildren(r14)
            r0 = 8
            r7.setVisibility(r0)
            r7.setImportantForAccessibility(r1)
            r7.setContentDescription(r2)
            r3.addView(r7)
            r3.A07 = r7
            com.whatsapp.WaImageView r6 = new com.whatsapp.WaImageView
            r6.<init>(r4)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r9, r9)
            r6.setLayoutParams(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r6.setScaleType(r0)
            r6.setImportantForAccessibility(r1)
            r6.setContentDescription(r2)
            r3.addView(r6)
            r3.A08 = r6
            android.view.View r8 = new android.view.View
            r8.<init>(r4)
            r0 = 2131233563(0x7f080b1b, float:1.8083267E38)
            X.C36371kC.A13(r4, r8, r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131166112(0x7f0703a0, float:1.794646E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r1 = 80
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r9, r2, r1)
            r8.setLayoutParams(r0)
            r8.setClickable(r14)
            r8.setFocusable(r14)
            r0 = 2
            r8.setImportantForAccessibility(r0)
            r3.addView(r8)
            X.17Y r1 = r3.getGlobalUI()
            X.3Hc r0 = r3.getVideoPlayerPoolManager()
            X.2ke r2 = new X.2ke
            r2.<init>(r6, r7, r1, r0)
            r1 = 1
            X.B8I r0 = new X.B8I
            r0.<init>(r3, r1)
            r2.A0R(r0)
            r3.A09 = r2
            X.9no r0 = new X.9no
            r0.<init>(r4, r3, r14)
            r3.A0A = r0
            X.0fG r0 = new X.0fG
            r0.<init>()
            X.An8 r2 = new X.An8
            r2.<init>(r3, r0)
            r1 = 48
            X.BA7 r0 = new X.BA7
            r0.<init>(r2, r1)
            r5.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PushToVideoInlineVideoPlayer(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PushToVideoInlineVideoPlayer(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
