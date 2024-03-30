package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass16D;
import X.AnonymousClass1Pp;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RY;
import X.C011504z;
import X.C012005e;
import X.C124725yh;
import X.C162337oQ;
import X.C163797qm;
import X.C18700tb;
import X.C20810yC;
import X.C21060yb;
import X.C27731Pn;
import X.C27851Qb;
import X.C27861Qc;
import X.C33511fU;
import X.C36321k7;
import X.C36381kD;
import X.C36401kF;
import X.C36441kJ;
import X.C88514Sz;
import X.C90524aI;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.views.MultiContactThumbnail;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;

public class VoipInCallNotifBanner extends LinearLayout implements C18700tb {
    public int A00;
    public int A01;
    public int A02;
    public Animator A03;
    public InCallBannerViewModel A04;
    public C124725yh A05;
    public AnonymousClass1Pp A06;
    public AnonymousClass16D A07;
    public C88514Sz A08;
    public C27731Pn A09;
    public C21060yb A0A;
    public C20810yC A0B;
    public AnonymousClass1QZ A0C;
    public boolean A0D;
    public int A0E;
    public final Handler A0F;
    public final ImageView A0G;
    public final TextEmojiLabel A0H;
    public final TextEmojiLabel A0I;
    public final WaImageButton A0J;
    public final MultiContactThumbnail A0K;
    public final VoipCallControlRingingDotsIndicator A0L;
    public final AnonymousClass1RY A0M;

    private void setupBannerBackground(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C36381kD.A05(this, i));
        gradientDrawable.setCornerRadius(getResources().getDimension(R.dimen.f7nameremoved));
        C011504z.A04(gradientDrawable, this);
    }

    public void A00() {
        this.A0F.removeMessages(0);
        if (getVisibility() != 8) {
            float[] A0v = C90524aI.A0v();
            A0v[0] = 0.0f;
            A0v[1] = (float) this.A02;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", A0v);
            this.A03 = ofFloat;
            ofFloat.setDuration(600);
            this.A03.setInterpolator(new DecelerateInterpolator(2.0f));
            C162337oQ.A00(this.A03, this, 16);
            this.A03.start();
        }
        this.A0L.clearAnimation();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A01(X.C124725yh r12) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x011e
            android.content.Context r2 = r11.getContext()
            android.animation.Animator r0 = r11.A03
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0015
            android.animation.Animator r0 = r11.A03
            r0.cancel()
        L_0x0015:
            com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator r6 = r11.A0L
            r6.clearAnimation()
            r3 = 8
            r6.setVisibility(r3)
            android.widget.ImageView r7 = r11.A0G
            r5 = 0
            r7.setImageDrawable(r5)
            r7.setVisibility(r3)
            android.widget.ImageView$ScaleType r0 = r12.A02
            r7.setScaleType(r0)
            com.whatsapp.calling.views.MultiContactThumbnail r9 = r11.A0K
            r9.setVisibility(r3)
            X.5yh r0 = r11.A05
            if (r0 == 0) goto L_0x003c
            int r1 = r12.A00
            int r0 = r0.A00
            if (r1 == r0) goto L_0x0041
        L_0x003c:
            int r0 = r12.A00
            r11.setupBannerBackground(r0)
        L_0x0041:
            X.4QR r0 = r12.A03
            if (r0 == 0) goto L_0x0084
            android.graphics.drawable.Drawable r1 = r0.BBE(r2)
        L_0x0049:
            boolean r0 = r12.A09
            r4 = 0
            if (r0 == 0) goto L_0x0091
            java.util.List r10 = r12.A07
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0091
            X.4Sz r0 = r11.A08
            if (r0 == 0) goto L_0x005e
            X.5yh r0 = r11.A05
            if (r0 != 0) goto L_0x0068
        L_0x005e:
            X.1Pp r7 = r11.A06
            r1 = 1
            X.3U5 r0 = new X.3U5
            r0.<init>(r7, r1)
            r11.A08 = r0
        L_0x0068:
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Iterator r7 = r10.iterator()
        L_0x0070:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0086
            X.11F r1 = X.C36401kF.A0a(r7)
            X.16D r0 = r11.A07
            X.141 r0 = r0.A0D(r1)
            r8.add(r0)
            goto L_0x0070
        L_0x0084:
            r1 = r5
            goto L_0x0049
        L_0x0086:
            r9.setVisibility(r4)
            X.1RY r1 = r11.A0M
            X.4Sz r0 = r11.A08
            r9.A00(r0, r1, r8)
            goto L_0x0099
        L_0x0091:
            if (r1 == 0) goto L_0x0099
            r7.setImageDrawable(r1)
            r7.setVisibility(r4)
        L_0x0099:
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x00ac
            r6.setVisibility(r4)
            X.4eA r1 = new X.4eA
            r1.<init>(r6)
            r0 = -1
            r1.setRepeatCount(r0)
            r6.startAnimation(r1)
        L_0x00ac:
            if (r2 == 0) goto L_0x00d6
            com.whatsapp.TextEmojiLabel r1 = r11.A0I
            X.3Bc r0 = r12.A06
            java.lang.CharSequence r0 = r0.A00(r2)
            r1.setText(r0)
            X.3Bc r0 = r12.A05
            com.whatsapp.TextEmojiLabel r1 = r11.A0H
            if (r0 == 0) goto L_0x012b
            r1.setVisibility(r4)
            java.lang.CharSequence r0 = r0.A00(r2)
            r1.setText(r0)
        L_0x00c9:
            X.3Bc r0 = r12.A04
            if (r0 == 0) goto L_0x00d6
            X.0yb r1 = r11.A0A
            java.lang.CharSequence r0 = r0.A00(r2)
            X.C33521fV.A00(r2, r1, r0)
        L_0x00d6:
            int r1 = r12.A01
            r0 = 11
            if (r1 == r0) goto L_0x0126
            r0 = 14
            if (r1 == r0) goto L_0x0126
            r0 = 12
            if (r1 == r0) goto L_0x0126
            r0 = 15
            if (r1 != r0) goto L_0x0123
            X.0yC r1 = r11.A0B
            r0 = 5874(0x16f2, float:8.231E-42)
        L_0x00ec:
            long r1 = X.C36441kJ.A0B(r1, r0)
        L_0x00f0:
            int r0 = r11.getVisibility()
            if (r0 == 0) goto L_0x00ff
            r3 = 2
            X.3vB r0 = new X.3vB
            r0.<init>(r11, r1, r3)
            r11.post(r0)
        L_0x00ff:
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x011f
            r3 = 42
            X.6co r0 = new X.6co
            r0.<init>(r11, r12, r3)
            r11.setOnClickListener(r0)
        L_0x010d:
            android.os.Handler r0 = r11.A0F
            r0.removeMessages(r4)
            r0.sendEmptyMessageDelayed(r4, r1)
            r11.A05 = r12
            com.whatsapp.WaImageButton r1 = r11.A0J
            r0 = 36
            X.C36361kB.A17(r1, r11, r0)
        L_0x011e:
            return
        L_0x011f:
            r11.setOnClickListener(r5)
            goto L_0x010d
        L_0x0123:
            r1 = 3000(0xbb8, double:1.482E-320)
            goto L_0x00f0
        L_0x0126:
            X.0yC r1 = r11.A0B
            r0 = 4183(0x1057, float:5.862E-42)
            goto L_0x00ec
        L_0x012b:
            r1.setVisibility(r3)
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner.A01(X.5yh):void");
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0C;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public int getBannerHeight() {
        int i = this.A0E;
        if (i != 0) {
            return i;
        }
        int dimension = (((int) getResources().getDimension(R.dimen.f7nameremoved)) + (((int) getResources().getDimension(R.dimen.f7nameremoved)) * 2)) - ((int) getResources().getDimension(R.dimen.f7nameremoved));
        this.A0E = dimension;
        return dimension;
    }

    public VoipInCallNotifBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0D) {
            this.A0D = true;
            C27861Qc.A0e((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    public VoipInCallNotifBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0D) {
            this.A0D = true;
            C27861Qc.A0e((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        this.A0F = new Handler(new C163797qm(this, 3));
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        setVisibility(8);
        TextEmojiLabel A0O = C36401kF.A0O(this, R.id.title);
        this.A0I = A0O;
        this.A0H = C36401kF.A0O(this, R.id.subtitle);
        this.A0G = C36401kF.A0G(this, R.id.leftAddOn);
        this.A0K = (MultiContactThumbnail) C012005e.A02(this, R.id.avatar);
        this.A0L = (VoipCallControlRingingDotsIndicator) C012005e.A02(this, R.id.ringing_dots);
        this.A0J = (WaImageButton) C012005e.A02(this, R.id.close_button);
        C33511fU.A03(A0O);
        C36321k7.A0M(context, A0O, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A0M = this.A09.A06("voip-in-call-notif-banner-multi", 0.0f, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        C011504z.A06(this, 4);
    }

    public VoipInCallNotifBanner(Context context) {
        this(context, (AttributeSet) null);
    }
}
