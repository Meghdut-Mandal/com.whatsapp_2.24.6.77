package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: X.5NI  reason: invalid class name */
public abstract class AnonymousClass5NI extends C92864et {
    public AlphaAnimation A00;
    public C18820ts A01;
    public C20810yC A02;
    public C127956Ah A03;
    public AnonymousClass7dE A04;
    public C158617hn A05;
    public C158627ho A06;
    public Long A07;
    public boolean A08 = true;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B;
    public final FrameLayout A0C;
    public final FrameLayout A0D;
    public final ImageView A0E;
    public final Runnable A0F = new C1497472p(this, 24);
    public final Runnable A0G = new C1497472p(this, 25);
    public final FrameLayout A0H;
    public final ImageButton A0I;
    public final LinearLayout A0J;
    public final TextView A0K;
    public final FrameLayout A0L;
    public final SeekBar A0M;
    public final TextView A0N;
    public final StringBuilder A0O;
    public final Formatter A0P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5NI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        StringBuilder A0u = AnonymousClass000.A0u();
        this.A0O = A0u;
        this.A0P = new Formatter(A0u, Locale.getDefault());
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        this.A0H = (FrameLayout) C36361kB.A0F(this, R.id.main_controls);
        this.A0K = C36351kA.A0F(this, R.id.time);
        this.A0N = C36351kA.A0F(this, R.id.time_current);
        SeekBar seekBar = (SeekBar) C36361kB.A0F(this, R.id.mediacontroller_progress);
        this.A0M = seekBar;
        ImageView A0M2 = C36361kB.A0M(this, R.id.back);
        this.A0E = A0M2;
        this.A0J = (LinearLayout) C36361kB.A0F(this, R.id.footer);
        seekBar.setMax(1000);
        this.A0L = (FrameLayout) C36361kB.A0F(this, R.id.control_frame);
        this.A0I = (ImageButton) C36361kB.A0F(this, R.id.play);
        this.A0D = (FrameLayout) C36361kB.A0F(this, R.id.left_panel);
        this.A0C = (FrameLayout) C36361kB.A0F(this, R.id.right_panel);
        boolean A0E2 = getAbProps().A0E(6082);
        FrameLayout frameLayout = this.A0C;
        if (!A0E2) {
            frameLayout.setVisibility(4);
            this.A0D.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
            FrameLayout frameLayout2 = this.A0D;
            frameLayout2.setVisibility(0);
            frameLayout.setOnClickListener(new C106795Lj(this, 0));
            frameLayout2.setOnClickListener(new C106795Lj(this, 1));
        }
        A07();
        A06();
        A08();
        if (C36401kF.A1X(getWhatsAppLocale()) && !isInEditMode()) {
            A0M2.setRotationY(180.0f);
        }
        Configuration A0H2 = C36431kI.A0H(this);
        AnonymousClass00C.A08(A0H2);
        onConfigurationChanged(A0H2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (r2 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012b, code lost:
        r6.A03.A01.A0E();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            r4 = 0
            X.AnonymousClass00C.A0D(r10, r4)
            X.6Ah r0 = r9.A03
            if (r0 == 0) goto L_0x013e
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x013e
            int r1 = r10.getKeyCode()
            r0 = 21
            r8 = 1
            if (r1 == r0) goto L_0x00d6
            r0 = 22
            if (r1 == r0) goto L_0x00bc
            r0 = 85
            r2 = 0
            if (r1 == r0) goto L_0x009e
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L_0x0097
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 == r0) goto L_0x00b2
            switch(r1) {
                case 87: goto L_0x002c;
                case 88: goto L_0x00f0;
                case 89: goto L_0x00d6;
                case 90: goto L_0x00bc;
                default: goto L_0x002b;
            }
        L_0x002b:
            return r4
        L_0x002c:
            r6 = r9
            com.whatsapp.videoplayback.HeroPlaybackControlView r6 = (com.whatsapp.videoplayback.HeroPlaybackControlView) r6
            X.6Ah r0 = r6.A03
            X.C18740tg.A06(r0)
            com.facebook.android.exoplayer2.Timeline r5 = r0.A00()
            if (r5 == 0) goto L_0x0132
            X.6Ah r0 = r6.A03
            X.9ps r0 = r0.A01
            java.util.concurrent.atomic.AtomicReference r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.9ug r0 = (X.C207179ug) r0
            int r3 = r0.A0W
            int r0 = r5.A01()
            int r0 = r0 + -1
            if (r3 < r0) goto L_0x012b
            X.9fY r2 = r6.A01
            r0 = 0
            X.9fY r0 = r5.A09(r2, r3, r0)
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0132
            X.6Ah r0 = r6.A03
            X.9ps r0 = r0.A01
            X.9ng r5 = r0.A0D
            X.9ps r3 = r5.A0B     // Catch:{ RemoteException -> 0x008b }
            long r6 = r3.A0N     // Catch:{ RemoteException -> 0x008b }
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)     // Catch:{ RemoteException -> 0x008b }
            if (r0 == 0) goto L_0x0132
            X.9lT r0 = X.C203259ng.A00(r5)     // Catch:{ RemoteException -> 0x008b }
            long r1 = r3.A0N     // Catch:{ RemoteException -> 0x008b }
            X.9UR r0 = r0.A0V     // Catch:{ RemoteException -> 0x008b }
            X.9pt r2 = r0.A01(r1)     // Catch:{ RemoteException -> 0x008b }
            if (r2 == 0) goto L_0x0132
            android.os.Handler r1 = r2.A0l     // Catch:{ RemoteException -> 0x008b }
            r0 = 47
            android.os.Message r0 = r1.obtainMessage(r0)     // Catch:{ RemoteException -> 0x008b }
            X.C204369pt.A09(r0, r2)     // Catch:{ RemoteException -> 0x008b }
            goto L_0x0132
        L_0x008b:
            r3 = move-exception
            X.9ps r2 = r5.A0B
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Error occurs while seek to default position"
            X.C204359ps.A05(r2, r0, r3, r1)
            goto L_0x0132
        L_0x0097:
            X.6Ah r0 = r9.A03
            if (r0 == 0) goto L_0x0132
            X.9ps r0 = r0.A01
            goto L_0x00ad
        L_0x009e:
            X.6Ah r1 = r9.A03
            if (r1 == 0) goto L_0x0132
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x00a9
            r2 = 1
        L_0x00a9:
            X.9ps r0 = r1.A01
            if (r2 == 0) goto L_0x00b8
        L_0x00ad:
            r0.A0C()
            goto L_0x0132
        L_0x00b2:
            X.6Ah r0 = r9.A03
            if (r0 == 0) goto L_0x0132
            X.9ps r0 = r0.A01
        L_0x00b8:
            r0.A0B()
            goto L_0x0132
        L_0x00bc:
            X.6Ah r5 = r9.A03
            if (r5 == 0) goto L_0x0132
            X.9ps r0 = r5.A01
            long r3 = r0.A08()
            r0 = 10000(0x2710, float:1.4013E-41)
            long r0 = (long) r0
            long r3 = r3 + r0
            X.9ps r0 = r5.A01
            long r1 = r0.A09()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ec
            r3 = r1
            goto L_0x00ec
        L_0x00d6:
            X.6Ah r5 = r9.A03
            if (r5 == 0) goto L_0x0132
            X.9ps r0 = r5.A01
            long r3 = r0.A08()
            r0 = 10000(0x2710, float:1.4013E-41)
            long r0 = (long) r0
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ec
            r3 = 0
        L_0x00ec:
            r5.A01(r3)
            goto L_0x0132
        L_0x00f0:
            r6 = r9
            com.whatsapp.videoplayback.HeroPlaybackControlView r6 = (com.whatsapp.videoplayback.HeroPlaybackControlView) r6
            X.6Ah r0 = r6.A03
            X.C18740tg.A06(r0)
            com.facebook.android.exoplayer2.Timeline r3 = r0.A00()
            if (r3 == 0) goto L_0x0132
            X.6Ah r0 = r6.A03
            X.9ps r0 = r0.A01
            java.util.concurrent.atomic.AtomicReference r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.9ug r0 = (X.C207179ug) r0
            int r2 = r0.A0W
            X.9fY r5 = r6.A01
            r0 = 0
            r3.A09(r5, r2, r0)
            if (r2 <= 0) goto L_0x0136
            X.6Ah r0 = r6.A03
            X.9ps r0 = r0.A01
            long r3 = r0.A08()
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x012b
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0136
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x0136
        L_0x012b:
            X.6Ah r0 = r6.A03
            X.9ps r0 = r0.A01
            r0.A0E()
        L_0x0132:
            r9.A03()
            return r8
        L_0x0136:
            X.6Ah r2 = r6.A03
            r0 = 0
            r2.A01(r0)
            goto L_0x0132
        L_0x013e:
            boolean r0 = super.dispatchKeyEvent(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NI.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int A002;
        int i;
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        int i2 = C90484aE.A0P().widthPixels;
        int i3 = configuration.orientation;
        Context context = getContext();
        if (i3 == 2) {
            A002 = (int) ((20.0f * C36341k9.A00(context)) + 0.5f);
            i = i2 / 10;
        } else {
            A002 = (int) ((30.0f * C36341k9.A00(context)) + 0.5f);
            i = i2 / 20;
        }
        if (getAbProps().A0E(6082)) {
            this.A0D.setPadding(i, 0, i, 0);
            this.A0C.setPadding(i, 0, i, 0);
        }
        TextView textView = this.A0N;
        textView.setPadding(textView.getPaddingLeft(), A002, textView.getPaddingRight(), A002);
        SeekBar seekBar = this.A0M;
        seekBar.setPadding(seekBar.getPaddingLeft(), A002, seekBar.getPaddingRight(), A002);
        TextView textView2 = this.A0K;
        textView2.setPadding(textView2.getPaddingLeft(), A002, textView2.getPaddingRight(), A002);
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public abstract void setPlayer(Object obj);

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public static final void A00(FrameLayout frameLayout) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        long j = (long) 500;
        alphaAnimation.setDuration(j);
        alphaAnimation.setInterpolator(decelerateInterpolator);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(j);
        alphaAnimation2.setInterpolator(accelerateInterpolator);
        alphaAnimation2.setStartOffset(j);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(alphaAnimation2);
        C162657ow.A00(animationSet, frameLayout, 8);
        frameLayout.startAnimation(animationSet);
    }

    public final void A02() {
        C127956Ah r2;
        if (this.A08 && this.A00 == null) {
            AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(getAlpha(), 0.0f);
            alphaAnimation.setDuration(250);
            Interpolator interpolator = accelerateInterpolator;
            alphaAnimation.setInterpolator(interpolator);
            C162657ow.A00(alphaAnimation, this, 9);
            this.A00 = alphaAnimation;
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f1nameremoved);
            loadAnimation.setDuration(250);
            loadAnimation.setInterpolator(interpolator);
            if (A0A()) {
                FrameLayout frameLayout = this.A0H;
                frameLayout.setVisibility(4);
                C158627ho r1 = this.A06;
                if (r1 != null) {
                    r1.BkV(frameLayout.getVisibility());
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.f1nameremoved);
                loadAnimation2.setDuration(250);
                loadAnimation2.setInterpolator(interpolator);
                this.A0E.startAnimation(loadAnimation2);
                frameLayout.startAnimation(this.A00);
                this.A0J.startAnimation(loadAnimation);
            }
            if (this.A0A) {
                FrameLayout frameLayout2 = this.A0L;
                if (frameLayout2.getVisibility() == 0 && (r2 = this.A03) != null && r2.A02() && r2.A01.A0M()) {
                    frameLayout2.setVisibility(4);
                    frameLayout2.startAnimation(this.A00);
                }
            }
        }
    }

    public final void A03() {
        if (this.A08) {
            FrameLayout frameLayout = this.A0H;
            frameLayout.setVisibility(0);
            C158627ho r1 = this.A06;
            if (r1 != null) {
                r1.BkV(frameLayout.getVisibility());
            }
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, getAlpha());
            alphaAnimation.setDuration(250);
            Interpolator interpolator = decelerateInterpolator;
            alphaAnimation.setInterpolator(interpolator);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f1nameremoved);
            loadAnimation.setDuration(250);
            loadAnimation.setInterpolator(interpolator);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.f1nameremoved);
            loadAnimation2.setDuration(250);
            loadAnimation2.setInterpolator(interpolator);
            FrameLayout frameLayout2 = this.A0L;
            if (frameLayout2.getVisibility() == 4 && this.A0A) {
                frameLayout2.setVisibility(0);
                frameLayout2.startAnimation(alphaAnimation);
                this.A0I.sendAccessibilityEvent(8);
            }
            frameLayout.startAnimation(alphaAnimation);
            this.A0J.startAnimation(loadAnimation);
            this.A0E.startAnimation(loadAnimation2);
            A07();
            A06();
            A08();
        }
    }

    public final void A04() {
        if (this.A0A) {
            this.A0L.setVisibility(0);
        }
        this.A0H.setVisibility(4);
        A07();
        A06();
        A08();
    }

    public final void A05() {
        this.A0H.setVisibility(0);
        if (this.A0A) {
            this.A0L.setVisibility(0);
        }
        A07();
        A06();
        A08();
    }

    public final void A07() {
        if (this.A0L.getVisibility() != 4) {
            C127956Ah r0 = this.A03;
            boolean z = true;
            if (r0 == null || !r0.A02()) {
                z = false;
            }
            ImageButton imageButton = this.A0I;
            int i = R.drawable.ic_video_play;
            if (z) {
                i = R.drawable.ic_video_pause;
            }
            imageButton.setImageResource(i);
            C18820ts whatsAppLocale = getWhatsAppLocale();
            int i2 = R.string.f12nameremoved;
            if (z) {
                i2 = R.string.f12nameremoved;
            }
            imageButton.setContentDescription(C36381kD.A0s(whatsAppLocale.A00.getResources(), i2));
        }
    }

    public final void A09(int i) {
        Runnable runnable = this.A0F;
        removeCallbacks(runnable);
        C127956Ah r0 = this.A03;
        if (r0 != null && r0.A02()) {
            postDelayed(runnable, (long) i);
        }
        if (this.A00 != null) {
            clearAnimation();
            this.A00 = null;
        }
    }

    public final boolean A0A() {
        return AnonymousClass000.A1Q(this.A0H.getVisibility());
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final long getDuration() {
        Long l = this.A07;
        if (l != null) {
            return l.longValue();
        }
        C127956Ah r0 = this.A03;
        if (r0 != null) {
            return r0.A01.A09();
        }
        return -9223372036854775807L;
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (((X.C207179ug) r1.get()).A0T != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r7 = this;
            boolean r0 = r7.A0A()
            if (r0 == 0) goto L_0x002b
            java.lang.Long r0 = r7.A07
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L_0x002e
            X.6Ah r0 = r7.A03
            if (r0 == 0) goto L_0x002c
            X.9ps r0 = r0.A01
            if (r0 == 0) goto L_0x002c
            java.util.concurrent.atomic.AtomicReference r1 = r0.A08
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r1.get()
            X.9ug r0 = (X.C207179ug) r0
            boolean r0 = r0.A0T
            if (r0 == 0) goto L_0x002c
        L_0x0026:
            android.widget.SeekBar r0 = r7.A0M
            r0.setEnabled(r5)
        L_0x002b:
            return
        L_0x002c:
            r5 = 0
            goto L_0x0026
        L_0x002e:
            long r3 = r0.longValue()
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0044
            android.widget.FrameLayout r0 = r7.A0C
            r6 = 4
        L_0x003b:
            r0.setVisibility(r6)
            android.widget.FrameLayout r0 = r7.A0D
            r0.setVisibility(r6)
            goto L_0x0026
        L_0x0044:
            X.0yC r1 = r7.getAbProps()
            r0 = 6082(0x17c2, float:8.523E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0026
            android.widget.FrameLayout r0 = r7.A0C
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NI.A06():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r11 = this;
            boolean r0 = r11.A0A()
            if (r0 == 0) goto L_0x00fa
            java.lang.Long r0 = r11.A07
            r2 = 0
            if (r0 != 0) goto L_0x003a
            X.6Ah r0 = r11.A03
            if (r0 == 0) goto L_0x010e
            X.9ps r0 = r0.A01
            long r4 = r0.A09()
        L_0x0016:
            java.lang.StringBuilder r1 = r11.A0O
            java.util.Formatter r0 = r11.A0P
            java.lang.String r4 = X.C111825cu.A00(r1, r0, r4)
            X.AnonymousClass00C.A08(r4)
            android.widget.TextView r1 = r11.A0K
            java.lang.CharSequence r0 = r1.getText()
            if (r0 == 0) goto L_0x0037
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x003a
        L_0x0037:
            r1.setText(r4)
        L_0x003a:
            boolean r0 = r11.A09
            if (r0 == 0) goto L_0x0108
            X.6Ah r0 = r11.A03
            if (r0 == 0) goto L_0x0104
            X.9ps r1 = r0.A01
            long r4 = r1.A0N
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x0104
            java.util.concurrent.atomic.AtomicReference r0 = r1.A08
            java.lang.Object r0 = r0.get()
            X.9ug r0 = (X.C207179ug) r0
            long r4 = r0.A0C
        L_0x0058:
            android.widget.SeekBar r6 = r11.A0M
            long r9 = r11.getDuration()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0101
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0101
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r4 = r4 * r0
            long r4 = r4 / r9
            int r0 = (int) r4
        L_0x0071:
            r6.setSecondaryProgress(r0)
            X.6Ah r0 = r11.A03
            if (r0 == 0) goto L_0x007e
            X.9ps r0 = r0.A01
            long r2 = r0.A08()
        L_0x007e:
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x00a6
            java.lang.StringBuilder r1 = r11.A0O
            java.util.Formatter r0 = r11.A0P
            java.lang.String r4 = X.C111825cu.A00(r1, r0, r2)
            X.AnonymousClass00C.A08(r4)
            android.widget.TextView r1 = r11.A0N
            java.lang.CharSequence r0 = r1.getText()
            if (r0 == 0) goto L_0x00a3
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a6
        L_0x00a3:
            r1.setText(r4)
        L_0x00a6:
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x00c7
            long r7 = r11.getDuration()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00ff
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00ff
            r0 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r0
            long r0 = r2 * r4
            long r0 = r0 / r7
            int r4 = (int) r0
        L_0x00c4:
            r6.setProgress(r4)
        L_0x00c7:
            java.lang.Runnable r8 = r11.A0G
            r11.removeCallbacks(r8)
            X.6Ah r0 = r11.A03
            r6 = 1
            if (r0 == 0) goto L_0x00fa
            X.9ps r0 = r0.A01
            int r1 = r0.A07()
            if (r1 == r6) goto L_0x00fa
            r0 = 4
            if (r1 == r0) goto L_0x00fa
            X.6Ah r0 = r11.A03
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r0.A02()
            if (r0 != r6) goto L_0x00fd
        L_0x00e6:
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L_0x00f7
            r0 = 3
            if (r1 != r0) goto L_0x00f7
            long r2 = r2 % r4
            long r6 = r4 - r2
            r1 = 200(0xc8, double:9.9E-322)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fb
            long r4 = r4 + r6
        L_0x00f7:
            r11.postDelayed(r8, r4)
        L_0x00fa:
            return
        L_0x00fb:
            r4 = r6
            goto L_0x00f7
        L_0x00fd:
            r6 = 0
            goto L_0x00e6
        L_0x00ff:
            r4 = 0
            goto L_0x00c4
        L_0x0101:
            r0 = 0
            goto L_0x0071
        L_0x0104:
            r4 = 0
            goto L_0x0058
        L_0x0108:
            android.widget.SeekBar r6 = r11.A0M
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0071
        L_0x010e:
            r4 = 0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NI.A08():void");
    }

    public final void setDuration(long j) {
        Long valueOf = Long.valueOf(j);
        this.A07 = valueOf;
        TextView textView = this.A0K;
        StringBuilder sb = this.A0O;
        Formatter formatter = this.A0P;
        if (valueOf != null) {
            j = valueOf.longValue();
        }
        textView.setText(C111825cu.A00(sb, formatter, j));
        A08();
        A06();
    }

    public final void setPlayControlVisibility(int i) {
        this.A0A = AnonymousClass000.A1Q(i);
        this.A0L.setVisibility(i);
    }

    public final void setAllowControlFrameVisibilityChanges(boolean z) {
        this.A08 = z;
    }

    public final void setPlayButtonClickListener(AnonymousClass7dE r1) {
        this.A04 = r1;
    }

    public final void setSeekbarStartTrackingTouchListener(C158617hn r1) {
        this.A05 = r1;
    }

    public final void setStreaming(boolean z) {
        this.A09 = z;
    }

    public final void setVisibilityListener(C158627ho r1) {
        this.A06 = r1;
    }
}
