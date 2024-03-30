package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.AutoScrollView;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* renamed from: X.5NK  reason: invalid class name */
public class AnonymousClass5NK extends C92754eZ implements C18700tb {
    public AccelerateInterpolator A00;
    public Animation A01;
    public Animation A02;
    public Animation A03;
    public Animation A04;
    public Animation A05;
    public Animation A06;
    public Animation A07;
    public Animation A08;
    public Animation A09;
    public Animation A0A;
    public DecelerateInterpolator A0B;
    public C20810yC A0C;
    public C120275rF A0D;
    public C158607hm A0E;
    public C158607hm A0F;
    public C158607hm A0G;
    public C65083Qq A0H;
    public AnonymousClass1QZ A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public AnonymousClass7dD A0T;
    public final int A0U;
    public final Handler A0V;
    public final View A0W;
    public final View A0X;
    public final ViewGroup A0Y;
    public final ViewGroup A0Z;
    public final ViewGroup A0a;
    public final ViewGroup A0b;
    public final ViewGroup A0c;
    public final ViewGroup A0d;
    public final Animation.AnimationListener A0e;
    public final ImageButton A0f;
    public final ImageButton A0g;
    public final ImageButton A0h;
    public final ImageButton A0i;
    public final LinearLayout A0j;
    public final LinearLayout A0k;
    public final ProgressBar A0l;
    public final SeekBar A0m;
    public final TextView A0n;
    public final TextView A0o;
    public final AutoScrollView A0p;
    public final ReadMoreTextView A0q;
    public final C124685yd A0r;
    public final WDSButton A0s;
    public final Runnable A0t;
    public final StringBuilder A0u;
    public final Formatter A0v;
    public final int A0w;
    public final HorizontalScrollView A0x;
    public final ImageButton A0y;
    public final ImageButton A0z;
    public final ImageButton A10;
    public final ImageButton A11;
    public final ImageButton A12;
    public final ImageView A13;
    public final TextView A14;
    public final WDSButton A15;
    public final WDSButton A16;

    public static void A02(AnonymousClass5NK r5) {
        if (r5.A0j.getVisibility() != 8) {
            ImageView imageView = r5.A13;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Resources resources = r5.getResources();
            boolean z = r5.A0M;
            int i = R.dimen.f7nameremoved;
            if (z) {
                i = R.dimen.f7nameremoved;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            imageView.requestLayout();
        }
    }

    public static void A03(AnonymousClass5NK r3) {
        boolean z;
        if (!r3.A0M || !(r3.A0j.getVisibility() == 0 || r3.A0q.getVisibility() == 0)) {
            z = false;
        } else {
            z = true;
        }
        Resources resources = r3.getResources();
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        LinearLayout linearLayout = r3.A0j;
        C36341k9.A0z(linearLayout, linearLayout.getPaddingLeft(), dimensionPixelSize);
    }

    public static void A04(AnonymousClass5NK r4) {
        int i;
        if (r4.A0b.getVisibility() != 8) {
            AutoScrollView autoScrollView = r4.A0p;
            if (autoScrollView.A02) {
                HorizontalScrollView horizontalScrollView = r4.A0x;
                ViewGroup.LayoutParams layoutParams = horizontalScrollView.getLayoutParams();
                if (r4.A0M) {
                    i = autoScrollView.A05;
                } else {
                    i = -1;
                }
                layoutParams.width = i;
                horizontalScrollView.requestLayout();
            }
            autoScrollView.A00.post(new C80213v2(autoScrollView, 25));
        }
    }

    public static void A05(AnonymousClass5NK r5) {
        C65083Qq r0 = r5.A0H;
        if (r0 != null) {
            boolean A0X2 = r0.A0X();
            ImageButton imageButton = r5.A0h;
            int i = R.drawable.ic_pip_play;
            if (A0X2) {
                i = R.drawable.ic_pip_pause;
            }
            imageButton.setImageResource(i);
            Context context = r5.getContext();
            int i2 = R.string.f12nameremoved;
            if (A0X2) {
                i2 = R.string.f12nameremoved;
            }
            String string = context.getString(i2);
            imageButton.setContentDescription(string);
            ImageButton imageButton2 = r5.A0i;
            int i3 = R.drawable.ic_video_play_conv;
            if (A0X2) {
                i3 = R.drawable.ic_video_pause_conv;
            }
            imageButton2.setImageResource(i3);
            imageButton2.setContentDescription(string);
        }
    }

    public static boolean A06(AnonymousClass5NK r2) {
        int i = r2.A0U;
        if (i == 1 || i == 7 || i == 4) {
            return false;
        }
        return true;
    }

    private int getBottomContainerHorizontalPadding() {
        if (this.A0M && AnonymousClass000.A1S(C36431kI.A0H(this).orientation, 2)) {
            return R.dimen.f7nameremoved;
        }
        return R.dimen.f7nameremoved;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C() {
        /*
            r2 = this;
            boolean r0 = r2.A0L
            if (r0 != 0) goto L_0x0057
            boolean r0 = r2.A0B()
            if (r0 == 0) goto L_0x0057
            X.3Qq r0 = r2.A0H
            if (r0 == 0) goto L_0x0057
            int r0 = r2.A0w
            r1 = 1
            if (r0 != r1) goto L_0x0015
            java.lang.Boolean r0 = X.C18750th.A01
        L_0x0015:
            r2.A0L = r1
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0058
            android.widget.LinearLayout r0 = r2.A0k
            android.view.animation.Animation r1 = r2.A02
            r0.startAnimation(r1)
            android.view.ViewGroup r0 = r2.A0d
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x002f
            android.widget.ImageButton r0 = r2.A0i
            r0.startAnimation(r1)
        L_0x002f:
            android.view.animation.Animation r1 = r2.getFullscreenBottomControlsSlideOutAnimation()
            if (r1 == 0) goto L_0x003a
            android.view.ViewGroup r0 = r2.A0Y
            r0.startAnimation(r1)
        L_0x003a:
            android.content.res.Configuration r0 = X.C36431kI.A0H(r2)
            int r1 = r0.orientation
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 != 0) goto L_0x004e
            android.view.ViewGroup r1 = r2.A0a
            android.view.animation.Animation r0 = r2.A08
        L_0x004b:
            r1.startAnimation(r0)
        L_0x004e:
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0057
            r0 = 4358(0x1106, float:6.107E-42)
            r2.setSystemUiVisibility(r0)
        L_0x0057:
            return
        L_0x0058:
            android.view.ViewGroup r1 = r2.A0Y
            android.view.animation.Animation r0 = r2.A0A
            r1.startAnimation(r0)
            android.widget.ProgressBar r1 = r2.A0l
            android.view.animation.Animation r0 = r2.A02
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NK.A0C():void");
    }

    public void A0E() {
        Runnable runnable = this.A0t;
        removeCallbacks(runnable);
        C65083Qq r0 = this.A0H;
        if (r0 != null && r0.A0X()) {
            if (!this.A0N || this.A0M) {
                postDelayed(runnable, 3000);
            }
        }
    }

    public void A0F() {
        C65083Qq r0 = this.A0H;
        if (r0 != null) {
            if (!r0.A0X()) {
                this.A0H.A0C();
                C124685yd r02 = this.A0r;
                if (r02 != null) {
                    r02.A09.A02();
                }
            }
            A0E();
            A05(this);
            A09(100);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0I;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0I = r0;
        }
        return r0.generatedComponent();
    }

    public void setAuthorImage(Bitmap bitmap) {
        if (bitmap != null) {
            ImageView imageView = this.A13;
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    public void setCloseButtonListener(C158607hm r3) {
        this.A0E = r3;
        AnonymousClass3Y9.A00(this.A0f, this, 49);
        C36351kA.A1E(this.A0z, this, 0);
        C36351kA.A1E(this.A11, this, 1);
    }

    public void setFullscreenButtonClickListener(C158607hm r3) {
        this.A0F = r3;
        C36351kA.A1E(this.A0y, this, 3);
        C36351kA.A1E(this.A10, this, 4);
        C36351kA.A1E(this.A12, this, 2);
    }

    public void setMusicAttributionClickListener(C158607hm r3) {
        AnonymousClass3Y9.A00(this.A0b, r3, 47);
        AnonymousClass3Y9.A00(this.A0p, r3, 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0042, code lost:
        if (r5.A0M == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPlayer(X.C65083Qq r6) {
        /*
            r5 = this;
            r5.A0H = r6
            X.5yd r0 = r5.A0r
            if (r0 == 0) goto L_0x000e
            r1 = 0
            X.7rK r0 = new X.7rK
            r0.<init>(r5, r1)
            r6.A06 = r0
        L_0x000e:
            android.widget.ImageButton r3 = r5.A0h
            android.content.Context r1 = r5.getContext()
            r0 = 2131892143(0x7f1217af, float:1.9419026E38)
            r4 = 2131892143(0x7f1217af, float:1.9419026E38)
            X.C36331k8.A0q(r1, r3, r0)
            r0 = 46
            X.3YC r2 = new X.3YC
            r2.<init>(r5, r6, r0)
            r3.setOnClickListener(r2)
            android.widget.ImageButton r1 = r5.A0i
            android.content.Context r0 = r5.getContext()
            X.C36331k8.A0q(r0, r1, r4)
            r1.setOnClickListener(r2)
            r2 = 1
            r1.setClickable(r2)
            com.whatsapp.wds.components.button.WDSButton r4 = r5.A0s
            boolean r0 = A06(r5)
            if (r0 == 0) goto L_0x0044
            boolean r1 = r5.A0M
            r0 = 0
            if (r1 != 0) goto L_0x0046
        L_0x0044:
            r0 = 8
        L_0x0046:
            r4.setVisibility(r0)
            android.widget.ProgressBar r1 = r5.A0l
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.setMax(r0)
            r1.setSecondaryProgress(r0)
            android.widget.SeekBar r1 = r5.A0m
            r1.setMax(r0)
            X.6dp r0 = new X.6dp
            r0.<init>(r5, r6)
            r1.setOnSeekBarChangeListener(r0)
            X.70e r0 = new X.70e
            r0.<init>(r5, r6)
            r6.A0R(r0)
            X.7qI r0 = new X.7qI
            r0.<init>(r5, r2)
            r6.A05 = r0
            X.70c r0 = new X.70c
            r0.<init>(r5, r6)
            r6.A04 = r0
            r5.A0R = r2
            android.os.Handler r1 = r5.A0V
            r0 = 0
            r1.sendEmptyMessage(r0)
            r3.setClickable(r2)
            android.widget.ImageButton r0 = r5.A0y
            r0.setClickable(r2)
            android.widget.ImageButton r0 = r5.A10
            r0.setClickable(r2)
            android.widget.ImageButton r0 = r5.A12
            r0.setClickable(r2)
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x0097
            A01(r5)
        L_0x0097:
            A05(r5)
            A02(r5)
            r5.A0E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NK.setPlayer(X.3Qq):void");
    }

    public void setPlayerElevation(int i) {
        View A082;
        C65083Qq r0 = this.A0H;
        if (r0 != null && (A082 = r0.A08()) != null && A082.getParent() != null) {
            C011004s.A05((View) this.A0H.A08().getParent().getParent(), (float) i);
        }
    }

    public void setVideoAttribution(String str) {
        String str2 = str;
        if (str != null) {
            this.A0b.setVisibility(0);
            AutoScrollView autoScrollView = this.A0p;
            autoScrollView.setText(str2);
            C165077sq r7 = new C165077sq(this, 10);
            if (!autoScrollView.A01) {
                autoScrollView.A01 = true;
                WaTextView waTextView = autoScrollView.A0A;
                boolean z = false;
                waTextView.setVisibility(0);
                WaTextView waTextView2 = autoScrollView.A09;
                if (!C011304x.A03(waTextView2) || waTextView2.isLayoutRequested()) {
                    waTextView2.addOnLayoutChangeListener(new C163657qY(autoScrollView, r7, 2));
                    return;
                }
                if (AnonymousClass04F.A01(autoScrollView.getRootView()) == 0) {
                    z = true;
                }
                autoScrollView.A03 = z;
                HorizontalScrollView horizontalScrollView = autoScrollView.A00;
                AnonymousClass04F.A05(horizontalScrollView, z ^ true ? 1 : 0);
                int width = waTextView2.getWidth() + autoScrollView.A06;
                int i = 1;
                if (autoScrollView.A03) {
                    i = -1;
                }
                int i2 = -i;
                int i3 = autoScrollView.A04;
                int i4 = autoScrollView.A07;
                int i5 = i3 + width + i4;
                int i6 = autoScrollView.A05;
                if (i5 < i6) {
                    ViewGroup.LayoutParams layoutParams = waTextView2.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    layoutParams.width = i5;
                    waTextView2.setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = horizontalScrollView.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    layoutParams2.width = -2;
                    horizontalScrollView.setLayoutParams(layoutParams2);
                    waTextView2.setTranslationX((float) (i4 * i2));
                    waTextView.setVisibility(8);
                } else {
                    autoScrollView.A02 = true;
                    ViewGroup.LayoutParams layoutParams3 = horizontalScrollView.getLayoutParams();
                    Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    layoutParams3.width = i6;
                    horizontalScrollView.setLayoutParams(layoutParams3);
                    float f = (float) ((i3 + i4) * i2);
                    long j = autoScrollView.A08 * ((long) (width / i6));
                    waTextView2.setTranslationX(f);
                    waTextView.setTranslationX(waTextView2.getTranslationX() + ((float) (width * i2)));
                    AutoScrollView.A00(autoScrollView, f, width, i, i2, j);
                    if (i3 > 0) {
                        horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
                        horizontalScrollView.setFadingEdgeLength(i3);
                        horizontalScrollView.requestLayout();
                    }
                }
                horizontalScrollView.post(new C80213v2(autoScrollView, 25));
                r7.invoke();
                return;
            }
            return;
        }
        this.A0b.setVisibility(8);
    }

    public void setWatchMoreVideosText(String str) {
        if (str != null) {
            this.A16.setText(str);
        }
    }

    public AnonymousClass5NK(Context context, C124685yd r8, int i) {
        super(context);
        if (!this.A0O) {
            this.A0O = true;
            this.A0C = C36341k9.A0V(C36391kE.A0W(generatedComponent()));
        }
        int i2 = 0;
        this.A0N = false;
        this.A0S = false;
        this.A0M = false;
        this.A0R = false;
        this.A0K = false;
        this.A0J = false;
        this.A0L = false;
        this.A0P = false;
        this.A0Q = false;
        this.A0t = new C1497472p(this, 8);
        this.A0e = new C162657ow(this, 7);
        this.A0V = new Handler(Looper.myLooper(), new C163797qm(this, 9));
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        this.A0w = this.A0C.A07(820);
        this.A0U = i;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        this.A0u = A0u2;
        this.A0v = new Formatter(A0u2, Locale.getDefault());
        this.A0f = C90514aH.A0T(this, R.id.close);
        this.A0z = C90514aH.A0T(this, R.id.fullscreen_close);
        this.A10 = C90514aH.A0T(this, R.id.fullscreen_minimize);
        this.A11 = C90514aH.A0T(this, R.id.landscape_close);
        this.A12 = C90514aH.A0T(this, R.id.landscape_minimize);
        this.A0y = C90514aH.A0T(this, R.id.chat_fullscreen);
        this.A0h = C90514aH.A0T(this, R.id.play_pause);
        this.A0i = C90514aH.A0T(this, R.id.play_pause_fullscreen);
        this.A0l = (ProgressBar) C012005e.A02(this, R.id.minimized_progress_bar);
        this.A0m = (SeekBar) C012005e.A02(this, R.id.mediacontroller_progress);
        this.A0o = C36391kE.A0O(this, R.id.time);
        this.A0n = C36391kE.A0O(this, R.id.time_current);
        AutoScrollView autoScrollView = (AutoScrollView) C012005e.A02(this, R.id.music_attribution_view);
        this.A0p = autoScrollView;
        this.A0x = autoScrollView.A00;
        ImageButton A0T2 = C90514aH.A0T(this, R.id.logo_button);
        this.A0g = A0T2;
        WDSButton A0y2 = C36431kI.A0y(this, R.id.logo_box_button);
        this.A0s = A0y2;
        this.A0X = C012005e.A02(this, R.id.loading);
        this.A0W = C012005e.A02(this, R.id.background);
        this.A0k = C90514aH.A0U(this, R.id.media_controller_container);
        this.A0b = C36411kG.A0O(this, R.id.video_attribution_container);
        this.A0c = C36411kG.A0O(this, R.id.video_information_container);
        this.A0Z = C36411kG.A0O(this, R.id.pip_container);
        this.A0a = C36411kG.A0O(this, R.id.portrait_fullscreen_container);
        this.A0Y = C36411kG.A0O(this, R.id.bottom_control_container);
        this.A0d = C36411kG.A0O(this, R.id.watch_play_container);
        this.A16 = C36431kI.A0y(this, R.id.watch_more_videos_button);
        this.A15 = C36431kI.A0y(this, R.id.play_again_button);
        A0T2.setVisibility(8);
        A0y2.setVisibility(!A06(this) ? 8 : i2);
        this.A0j = C90514aH.A0U(this, R.id.authorship_container);
        this.A14 = C36391kE.A0O(this, R.id.author_name);
        this.A0q = (ReadMoreTextView) C012005e.A02(this, R.id.video_caption);
        this.A13 = C36401kF.A0G(this, R.id.author_image);
        ImageButton imageButton = this.A0g;
        imageButton.setPaddingRelative(imageButton.getPaddingStart(), imageButton.getPaddingTop(), 0, imageButton.getPaddingBottom());
        ImageButton imageButton2 = this.A0f;
        imageButton2.setPaddingRelative(imageButton2.getPaddingStart(), imageButton2.getPaddingTop(), 0, imageButton2.getPaddingBottom());
        ImageButton imageButton3 = this.A0h;
        imageButton3.setPaddingRelative(0, imageButton3.getPaddingTop(), imageButton3.getPaddingEnd(), imageButton3.getPaddingBottom());
        this.A00 = new AccelerateInterpolator();
        this.A0B = new DecelerateInterpolator();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f1nameremoved);
        loadAnimation.setDuration(200);
        loadAnimation.setInterpolator(this.A00);
        this.A08 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.f1nameremoved);
        loadAnimation2.setDuration(200);
        loadAnimation2.setInterpolator(this.A0B);
        this.A07 = loadAnimation2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(getContext(), R.anim.f1nameremoved);
        loadAnimation3.setDuration(200);
        loadAnimation3.setInterpolator(this.A00);
        this.A0A = loadAnimation3;
        Animation loadAnimation4 = AnimationUtils.loadAnimation(getContext(), R.anim.f1nameremoved);
        loadAnimation4.setDuration(200);
        loadAnimation4.setInterpolator(this.A0B);
        this.A09 = loadAnimation4;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        alphaAnimation.setInterpolator(this.A00);
        this.A02 = alphaAnimation;
        alphaAnimation.setAnimationListener(this.A0e);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(200);
        alphaAnimation2.setInterpolator(this.A0B);
        this.A01 = alphaAnimation2;
        this.A0r = r8;
        onConfigurationChanged(C36431kI.A0H(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r1 != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass5NK r5) {
        /*
            android.content.res.Resources r1 = r5.getResources()
            int r0 = r5.getBottomContainerHorizontalPadding()
            int r3 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r2 = r5.getResources()
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x0024
            android.content.res.Configuration r0 = X.C36431kI.A0H(r5)
            int r1 = r0.orientation
            r0 = 2
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            r0 = 2131166858(0x7f07068a, float:1.7947973E38)
            if (r1 == 0) goto L_0x0027
        L_0x0024:
            r0 = 2131168374(0x7f070c76, float:1.7951048E38)
        L_0x0027:
            int r2 = r2.getDimensionPixelSize(r0)
            android.view.ViewGroup r1 = r5.A0Y
            int r0 = r1.getPaddingTop()
            r1.setPadding(r3, r0, r3, r2)
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x0055
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168377(0x7f070c79, float:1.7951054E38)
            int r4 = r1.getDimensionPixelSize(r0)
        L_0x0043:
            android.view.ViewGroup r3 = r5.A0c
            int r2 = r5.getPaddingLeft()
            int r1 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            r3.setPadding(r2, r1, r0, r4)
            return
        L_0x0055:
            r4 = 0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NK.A00(X.5NK):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r6.A0N != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r6.A0N != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass5NK r6) {
        /*
            android.content.res.Configuration r0 = X.C36431kI.A0H(r6)
            int r1 = r0.orientation
            r0 = 2
            boolean r5 = X.AnonymousClass000.A1S(r1, r0)
            android.widget.ImageButton r2 = r6.A10
            r4 = 0
            r3 = 8
            if (r5 != 0) goto L_0x0017
            boolean r1 = r6.A0N
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0017:
            r0 = 8
        L_0x0019:
            r2.setVisibility(r0)
            android.widget.ImageButton r1 = r6.A0z
            int r0 = X.C36381kD.A00(r5)
            r1.setVisibility(r0)
            android.widget.ImageButton r2 = r6.A12
            if (r5 == 0) goto L_0x002e
            boolean r1 = r6.A0N
            r0 = 0
            if (r1 == 0) goto L_0x0030
        L_0x002e:
            r0 = 8
        L_0x0030:
            r2.setVisibility(r0)
            android.widget.ImageButton r1 = r6.A11
            int r0 = X.C36351kA.A00(r5)
            r1.setVisibility(r0)
            boolean r1 = r6.A0M
            android.view.ViewGroup r0 = r6.A0a
            if (r1 == 0) goto L_0x004a
            if (r5 == 0) goto L_0x0046
            r4 = 8
        L_0x0046:
            r0.setVisibility(r4)
            return
        L_0x004a:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NK.A01(X.5NK):void");
    }

    private Animation getFullscreenBottomControlsSlideInAnimation() {
        if (AnonymousClass000.A1S(C36431kI.A0H(this).orientation, 2)) {
            return this.A04;
        }
        return this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r6.A06 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r2 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, X.C36441kJ.A02(r6.A0k));
        r2.setDuration(200);
        r2.setInterpolator(r6.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r5 == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r6.A06 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r6.A04 != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r2 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, X.C36441kJ.A02(r6.A0k), 0.0f);
        r2.setDuration(200);
        r2.setInterpolator(r6.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r5 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r6.A04 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        r6.A03 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r6.A05 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        return r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r6.A05 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r6.A03 != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (X.AnonymousClass000.A1S(X.C36431kI.A0H(r6).orientation, 2) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return r6.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.animation.Animation getFullscreenBottomControlsSlideOutAnimation() {
        /*
            r6 = this;
            android.content.res.Configuration r0 = X.C36431kI.A0H(r6)
            int r0 = r0.orientation
            r3 = 2
            boolean r5 = X.AnonymousClass000.A1S(r0, r3)
            r4 = 0
            if (r5 != 0) goto L_0x0025
            android.view.animation.Animation r0 = r6.A05
            if (r0 == 0) goto L_0x0029
        L_0x0012:
            android.view.animation.Animation r0 = r6.A03
            if (r0 == 0) goto L_0x0046
        L_0x0016:
            android.content.res.Configuration r0 = X.C36431kI.A0H(r6)
            int r0 = r0.orientation
            boolean r0 = X.AnonymousClass000.A1S(r0, r3)
            if (r0 == 0) goto L_0x0066
            android.view.animation.Animation r0 = r6.A06
            return r0
        L_0x0025:
            android.view.animation.Animation r0 = r6.A06
            if (r0 != 0) goto L_0x0042
        L_0x0029:
            android.widget.LinearLayout r0 = r6.A0k
            float r0 = X.C36441kJ.A02(r0)
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r4, r4, r4, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.animation.AccelerateInterpolator r0 = r6.A00
            r2.setInterpolator(r0)
            if (r5 == 0) goto L_0x0063
            r6.A06 = r2
        L_0x0042:
            android.view.animation.Animation r0 = r6.A04
            if (r0 != 0) goto L_0x0016
        L_0x0046:
            android.widget.LinearLayout r0 = r6.A0k
            float r0 = X.C36441kJ.A02(r0)
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r4, r4, r0, r4)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = r6.A0B
            r2.setInterpolator(r0)
            if (r5 == 0) goto L_0x0060
            r6.A04 = r2
            goto L_0x0016
        L_0x0060:
            r6.A03 = r2
            goto L_0x0016
        L_0x0063:
            r6.A05 = r2
            goto L_0x0012
        L_0x0066:
            android.view.animation.Animation r0 = r6.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NK.getFullscreenBottomControlsSlideOutAnimation():android.view.animation.Animation");
    }

    public void A0D() {
        View view;
        Animation animation;
        A05(this);
        setSystemUiVisibility(0);
        A0E();
        if (!A0B()) {
            if (this.A0M) {
                A01(this);
                Animation fullscreenBottomControlsSlideInAnimation = getFullscreenBottomControlsSlideInAnimation();
                if (fullscreenBottomControlsSlideInAnimation != null) {
                    this.A0Y.startAnimation(fullscreenBottomControlsSlideInAnimation);
                }
                LinearLayout linearLayout = this.A0k;
                Animation animation2 = this.A01;
                linearLayout.startAnimation(animation2);
                linearLayout.setVisibility(0);
                if (this.A0d.getVisibility() != 0) {
                    ImageButton imageButton = this.A0i;
                    imageButton.startAnimation(animation2);
                    imageButton.setVisibility(0);
                }
                if (!AnonymousClass000.A1S(C36431kI.A0H(this).orientation, 2)) {
                    view = this.A0a;
                    animation = this.A07;
                } else {
                    return;
                }
            } else {
                this.A0Y.startAnimation(this.A09);
                view = this.A0l;
                animation = this.A01;
            }
            view.startAnimation(animation);
            view.setVisibility(0);
        }
    }

    public List getFullscreenControls() {
        ArrayList A0I2 = AnonymousClass001.A0I();
        A0I2.add(this.A0s);
        A0I2.add(this.A0f);
        A0I2.add(this.A0h);
        A0I2.add(this.A0k);
        return A0I2;
    }

    public List getInlineControls() {
        ArrayList A0I2 = AnonymousClass001.A0I();
        A0I2.add(this.A0g);
        A0I2.add(this.A0y);
        A0I2.add(this.A0l);
        return A0I2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A01(this);
        A00(this);
        A04(this);
    }

    public void setAuthorInformation(String str, C158607hm r4) {
        if (!TextUtils.isEmpty(str)) {
            this.A14.setText(str);
            LinearLayout linearLayout = this.A0j;
            linearLayout.setVisibility(0);
            AnonymousClass3Y9.A00(linearLayout, r4, 46);
        }
    }

    public void setVideoCaption(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ReadMoreTextView readMoreTextView = this.A0q;
            readMoreTextView.setText(charSequence);
            readMoreTextView.setVisibility(0);
            readMoreTextView.setOnTouchListener(new C53912s6(this, 13));
        }
    }

    public void setBlockPlayButtonInput(boolean z) {
        this.A0J = z;
    }

    public void setInStatus(boolean z) {
        this.A0N = z;
    }

    public void setPlayPauseListener(AnonymousClass7dD r1) {
        this.A0T = r1;
    }
}
