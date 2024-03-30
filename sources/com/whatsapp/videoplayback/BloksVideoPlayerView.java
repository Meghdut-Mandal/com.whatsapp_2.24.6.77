package com.whatsapp.videoplayback;

import X.AnonymousClass00C;
import X.AnonymousClass17Y;
import X.AnonymousClass1AV;
import X.AnonymousClass1QZ;
import X.AnonymousClass5NR;
import X.AnonymousClass6D1;
import X.AnonymousClass6KH;
import X.C128186Bg;
import X.C133456Yo;
import X.C163387q7;
import X.C18700tb;
import X.C18800tq;
import X.C19630wG;
import X.C19700wN;
import X.C19770wU;
import X.C20810yC;
import X.C21060yb;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import X.C65083Qq;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.whatsapp.Mp4Ops;
import com.whatsapp.R;

public final class BloksVideoPlayerView extends FrameLayout implements C18700tb {
    public ViewTreeObserver.OnScrollChangedListener A00;
    public C19700wN A01;
    public AnonymousClass17Y A02;
    public Mp4Ops A03;
    public AnonymousClass1AV A04;
    public C21060yb A05;
    public C19630wG A06;
    public C20810yC A07;
    public AnonymousClass6KH A08;
    public C19770wU A09;
    public ExoPlayerErrorFrame A0A;
    public C128186Bg A0B;
    public C65083Qq A0C;
    public AnonymousClass1QZ A0D;
    public boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksVideoPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A0B = new C128186Bg(false, false, false);
        A00();
    }

    public final void A03(Activity activity, AnonymousClass6D1 r7) {
        if (r7.A01 != null || r7.A00 != null) {
            C65083Qq r0 = this.A0C;
            if (r0 == null) {
                r0 = AnonymousClass5NR.A00(C36361kB.A06(this), getGlobalUI(), getSystemServices(), this);
            }
            addView(r0.A08(), 0, new FrameLayout.LayoutParams(-1, -1));
            boolean z = r7.A02;
            if (z) {
                C163387q7 r1 = new C163387q7(this, 2);
                getViewTreeObserver().addOnScrollChangedListener(r1);
                this.A00 = r1;
            }
            C65083Qq r12 = this.A0C;
            if (r12 != null) {
                r12.A0A = r7.A03;
                r12.A0V(r7.A04);
            }
            C65083Qq r02 = this.A0C;
            if (r02 != null) {
                r02.A0M(0);
            }
            C65083Qq r03 = this.A0C;
            if (r03 != null) {
                r03.A0F();
            }
            this.A0B = new C128186Bg(z, this.A0B.A02, true);
            A02();
            if (Build.VERSION.SDK_INT > 29) {
                activity.registerActivityLifecycleCallbacks(new C133456Yo(this));
            }
        }
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setCrashLogs(C19700wN r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setExoPlayerErrorElements(ExoPlayerErrorFrame exoPlayerErrorFrame) {
        AnonymousClass00C.A0D(exoPlayerErrorFrame, 0);
        this.A0A = exoPlayerErrorFrame;
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setHeroSettingProvider(AnonymousClass6KH r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setMp4Ops(Mp4Ops mp4Ops) {
        AnonymousClass00C.A0D(mp4Ops, 0);
        this.A03 = mp4Ops;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setWaContext(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setWaWorkers(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public final void setWamediaWamLogger(AnonymousClass1AV r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public void A01() {
        if (!this.A0E) {
            this.A0E = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A02 = C36351kA.A0M(A0W);
            this.A05 = C36351kA.A0U(A0W);
            this.A06 = C36351kA.A0W(A0W);
            this.A03 = (Mp4Ops) A0W.ATn.get();
            this.A07 = C36341k9.A0V(A0W);
            this.A01 = C36391kE.A0V(A0W);
            this.A04 = (AnonymousClass1AV) A0W.A9R.get();
            this.A08 = (AnonymousClass6KH) A0W.A00.A1z.get();
            this.A09 = C36341k9.A0Z(A0W);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r2 = this;
            X.6Bg r1 = r2.A0B
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.A02
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            X.3Qq r0 = r2.A0C
            if (r1 == 0) goto L_0x001a
            if (r0 == 0) goto L_0x0019
            r0.A0C()
        L_0x0019:
            return
        L_0x001a:
            if (r0 == 0) goto L_0x0019
            r0.A0A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.videoplayback.BloksVideoPlayerView.A02():void");
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0D;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C19700wN getCrashLogs() {
        C19700wN r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("crashLogs");
    }

    public final ExoPlayerErrorFrame getExoPlayerErrorElements() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A0A;
        if (exoPlayerErrorFrame != null) {
            return exoPlayerErrorFrame;
        }
        throw C36331k8.A0d("exoPlayerErrorElements");
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final AnonymousClass6KH getHeroSettingProvider() {
        AnonymousClass6KH r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("heroSettingProvider");
    }

    public final Mp4Ops getMp4Ops() {
        Mp4Ops mp4Ops = this.A03;
        if (mp4Ops != null) {
            return mp4Ops;
        }
        throw C36331k8.A0d("mp4Ops");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final C19630wG getWaContext() {
        C19630wG r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waContext");
    }

    public final C19770wU getWaWorkers() {
        C19770wU r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public final AnonymousClass1AV getWamediaWamLogger() {
        AnonymousClass1AV r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("wamediaWamLogger");
    }

    private final void A00() {
        setExoPlayerErrorElements((ExoPlayerErrorFrame) C36361kB.A0F(View.inflate(getContext(), R.layout.f9nameremoved, this), R.id.exoplayer_error_elements));
    }

    public BloksVideoPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksVideoPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A0B = new C128186Bg(false, false, false);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksVideoPlayerView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A0B = new C128186Bg(false, false, false);
        A00();
    }
}
