package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.banner.view.MinimizedCallBanner$onAttach$1;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4fU  reason: invalid class name and case insensitive filesystem */
public final class C93044fU extends LinearLayout implements C88814Ud, C18700tb {
    public ValueAnimator A00;
    public MinimizedCallBannerViewModel A01;
    public C18820ts A02;
    public AnonymousClass1QZ A03;
    public Runnable A04;
    public boolean A05;
    public C16210on A06;
    public AnonymousClass7gL A07;
    public Integer A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C;
    public final AnonymousClass00T A0D;
    public final AnonymousClass00T A0E;
    public final AnonymousClass00T A0F;
    public final AnonymousClass00T A0G;
    public final AnonymousClass00T A0H;
    public final AnonymousClass00T A0I;
    public final AnonymousClass00T A0J;

    public C93044fU(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A05) {
            this.A05 = true;
            this.A02 = C36331k8.A0C(generatedComponent());
        }
        C000800j r1 = C000800j.NONE;
        this.A0H = C001400p.A00(r1, new AnonymousClass7OI(this, R.id.title));
        this.A0J = C001400p.A00(r1, new AnonymousClass7OI(this, R.id.title_layout));
        this.A0E = C001400p.A00(r1, new AnonymousClass7OI(this, R.id.end_call_btn));
        this.A0C = AnonymousClass7OF.A00(this, r1, R.id.call_av_icon);
        this.A0G = AnonymousClass7OF.A00(this, r1, R.id.mute_btn);
        this.A0A = AnonymousClass7OF.A00(this, r1, R.id.accept_btn);
        this.A0F = AnonymousClass7OF.A00(this, r1, R.id.dots_wave_view_stub);
        this.A0B = AnonymousClass7OF.A00(this, r1, R.id.audio_wave_view_stub);
        this.A0D = C001400p.A00(r1, AnonymousClass7Q1.A00);
        this.A09 = C36431kI.A1I(AnonymousClass7Q8.A00);
        this.A0I = C36431kI.A1I(new C152287Jx(this));
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        setVisibility(8);
        setBackgroundColor(C015006m.A00((Resources.Theme) null, getResources(), R.color.f6nameremoved));
        if (C011304x.A02(this)) {
            A04(this);
        } else {
            C163647qX.A00(this, 1);
        }
    }

    public static final void A05(C93044fU r6, MinimizedCallBannerViewModel minimizedCallBannerViewModel) {
        AnonymousClass00C.A0D(r6, 1);
        C144186rm r1 = minimizedCallBannerViewModel.A02.A02;
        int i = 86;
        if (r1.A01.A04) {
            i = 37;
        }
        AnonymousClass6YM r3 = r1.A00;
        AnonymousClass1PZ r2 = r1.A02;
        boolean isSelected = r6.getMuteCallButton().A01().isSelected();
        int i2 = 1;
        if (isSelected) {
            i2 = 2;
        } else if (isSelected) {
            throw C36441kJ.A18();
        }
        r2.A00(i2, i);
        if (r3 != null) {
            C90504aG.A17(new C1501574e(r3), r3);
        }
    }

    public static final void A07(C93044fU r3, boolean z) {
        int i = 0;
        r3.setVisibility(C36351kA.A00(z ? 1 : 0));
        MinimizedCallBannerViewModel minimizedCallBannerViewModel = r3.A01;
        if (minimizedCallBannerViewModel == null) {
            throw C36331k8.A0a();
        }
        AnonymousClass05L r1 = minimizedCallBannerViewModel.A05;
        if (!z) {
            i = 8;
        }
        r1.setValue(Integer.valueOf(i));
        AnonymousClass7gL r12 = r3.A07;
        if (r12 != null) {
            r12.BkW(r3.getVisibility());
        }
    }

    public void setCallLogData(AnonymousClass6BK r1) {
    }

    public void setShouldHideCallDuration(boolean z) {
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    private final int A00(C16220oo r3) {
        int i;
        Integer num;
        if ((r3 instanceof C143786r7) && (num = ((C143786r7) r3).A02) != null) {
            return AnonymousClass3UE.A01(getResources(), num.intValue());
        }
        boolean z = r3 instanceof C143796r8;
        Context context = getContext();
        if (z) {
            i = ((C143796r8) r3).A01;
        } else {
            i = R.color.f6nameremoved;
        }
        return AnonymousClass00F.A00(context, i);
    }

    private final void A02(AnonymousClass6C3 r4) {
        if (C36331k8.A1b(this.A09)) {
            r4.A02();
            AnonymousClass1RJ loadingWave = getLoadingWave();
            if (loadingWave.A00 != null) {
                loadingWave.A01().setBackground((Drawable) null);
                loadingWave.A03(8);
            }
        }
    }

    public static final void A03(C16230op r5, C93044fU r6) {
        int i;
        if (r5 instanceof C143886rH) {
            r6.A02(r6.getAvdHolder());
            A06(r6, false);
        } else if (r5 instanceof C143876rG) {
            C143876rG r52 = (C143876rG) r5;
            A06(r6, true);
            r6.setCurrentStartButton(r52.A01);
            r6.setEndCallIconRes(Integer.valueOf(r52.A00));
            C16220oo r53 = r52.A02;
            if (r53 instanceof C143796r8) {
                C143796r8 r54 = (C143796r8) r53;
                WaTextView title = r6.getTitle();
                title.setTextColor(r6.A00(r54));
                title.setText(C90474aD.A0V(title, r54.A02));
                AnonymousClass1RJ avIcon = r6.getAvIcon();
                int i2 = r54.A00;
                if (i2 == 0) {
                    i = 8;
                } else {
                    ((ImageView) r6.getAvIcon().A01()).setImageResource(i2);
                    i = 0;
                }
                avIcon.A03(i);
                r6.getAudioWave().A03(8);
                r6.A02(r6.getAvdHolder());
                boolean z = r54.A03;
                C1258861s titleAnimator = r6.getTitleAnimator();
                if (z) {
                    if (titleAnimator != null) {
                        AnonymousClass00T r2 = titleAnimator.A01;
                        if (!((Animator) r2.getValue()).isRunning()) {
                            C111565cU.A00((ValueAnimator) r2.getValue(), titleAnimator, 12);
                            ((Animator) r2.getValue()).start();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (titleAnimator != null) {
                    titleAnimator.A00();
                    return;
                } else {
                    return;
                }
            } else if (r53 instanceof C143776r6) {
                C143776r6 r55 = (C143776r6) r53;
                WaTextView title2 = r6.getTitle();
                title2.setTextColor(r6.A00(r55));
                title2.setText(C90474aD.A0V(title2, r55.A00));
                r6.getAvIcon().A03(8);
                r6.getAudioWave().A03(8);
                AnonymousClass6C3 avdHolder = r6.getAvdHolder();
                if (C36331k8.A1b(r6.A09)) {
                    AnonymousClass0BQ A002 = avdHolder.A00(C36371kC.A0B(r6), R.drawable.vec_minimized_banner_dots_wave, true);
                    AnonymousClass1RJ loadingWave = r6.getLoadingWave();
                    loadingWave.A01().setBackground(A002);
                    loadingWave.A03(0);
                }
            } else if (r53 instanceof C143786r7) {
                C143786r7 r56 = (C143786r7) r53;
                int A003 = r6.A00(r56);
                WaTextView title3 = r6.getTitle();
                title3.setText(C90474aD.A0V(title3, r56.A01));
                title3.setTextColor(A003);
                r6.getAvIcon().A03(8);
                AnonymousClass1RJ audioWave = r6.getAudioWave();
                VoiceParticipantAudioWave.A02((VoiceParticipantAudioWave) audioWave.A01(), r56.A00, true);
                ((VoiceParticipantAudioWave) audioWave.A01()).setColor(A003);
                audioWave.A03(0);
                r6.A02(r6.getAvdHolder());
            } else {
                return;
            }
        } else {
            return;
        }
        C1258861s titleAnimator2 = r6.getTitleAnimator();
        if (titleAnimator2 != null) {
            titleAnimator2.A00();
        }
    }

    private final AnonymousClass1RJ getAcceptCallButton() {
        return (AnonymousClass1RJ) this.A0A.getValue();
    }

    private final boolean getAnimateBanner() {
        return C36331k8.A1b(this.A09);
    }

    private final AnonymousClass1RJ getAudioWave() {
        return (AnonymousClass1RJ) this.A0B.getValue();
    }

    private final AnonymousClass1RJ getAvIcon() {
        return (AnonymousClass1RJ) this.A0C.getValue();
    }

    private final AnonymousClass6C3 getAvdHolder() {
        return (AnonymousClass6C3) this.A0D.getValue();
    }

    private final WDSButton getEndCallButton() {
        return (WDSButton) this.A0E.getValue();
    }

    private final AnonymousClass1RJ getLoadingWave() {
        return (AnonymousClass1RJ) this.A0F.getValue();
    }

    private final AnonymousClass1RJ getMuteCallButton() {
        return (AnonymousClass1RJ) this.A0G.getValue();
    }

    private final WaTextView getTitle() {
        return (WaTextView) this.A0H.getValue();
    }

    private final C1258861s getTitleAnimator() {
        return (C1258861s) this.A0I.getValue();
    }

    /* access modifiers changed from: private */
    public final ViewGroup getTitleLayout() {
        return (ViewGroup) this.A0J.getValue();
    }

    private final void setCurrentStartButton(C16210on r5) {
        AnonymousClass1RJ muteCallButton;
        if (!AnonymousClass00C.A0J(this.A06, r5)) {
            this.A06 = r5;
            if (r5 != null) {
                if (r5 instanceof C143766r5) {
                    getMuteCallButton().A03(0);
                    getMuteCallButton().A01().setSelected(((C143766r5) r5).A00);
                    muteCallButton = getAcceptCallButton();
                } else if (r5 instanceof C143756r4) {
                    getAcceptCallButton().A03(0);
                    Drawable A022 = AnonymousClass3UF.A02(getContext(), ((C143756r4) r5).A00, R.color.f6nameremoved);
                    AnonymousClass00C.A08(A022);
                    ((WDSButton) getAcceptCallButton().A01()).setIcon(A022);
                    muteCallButton = getMuteCallButton();
                } else {
                    return;
                }
                muteCallButton.A03(8);
            }
        }
    }

    private final void setEndCallIconRes(Integer num) {
        if (num == null) {
            C18740tg.A0D(false, "end call icon should not be null");
        } else if (!AnonymousClass00C.A0J(this.A08, num)) {
            this.A08 = num;
            Drawable A022 = AnonymousClass3UF.A02(getContext(), num.intValue(), R.color.f6nameremoved);
            AnonymousClass00C.A08(A022);
            getEndCallButton().setIcon(A022);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r1.A01 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setShouldHideBanner(boolean r4) {
        /*
            r3 = this;
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel r1 = r3.A01
            if (r1 != 0) goto L_0x0009
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0009:
            boolean r0 = r1.A00
            if (r0 == r4) goto L_0x0020
            r1.A00 = r4
            X.05L r2 = r1.A06
            if (r4 != 0) goto L_0x0018
            boolean r1 = r1.A01
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.setValue(r0)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93044fU.setShouldHideBanner(boolean):void");
    }

    public static final void A04(C93044fU r4) {
        AnonymousClass012 A002 = AnonymousClass0QD.A00(r4);
        if (A002 == null) {
            Log.i("MinimizedCallBanner/onAttach/ no lifecycle owner");
            return;
        }
        C36331k8.A1T(new MinimizedCallBanner$onAttach$1(A002, r4, (C023509x) null), C33311f5.A00(A002));
        AnonymousClass01M lifecycle = A002.getLifecycle();
        MinimizedCallBannerViewModel minimizedCallBannerViewModel = r4.A01;
        if (minimizedCallBannerViewModel == null) {
            throw C36331k8.A0d("viewModel");
        }
        lifecycle.A04(minimizedCallBannerViewModel);
        if (!C011304x.A02(r4)) {
            AnonymousClass01M lifecycle2 = A002.getLifecycle();
            MinimizedCallBannerViewModel minimizedCallBannerViewModel2 = r4.A01;
            if (minimizedCallBannerViewModel2 == null) {
                throw C36331k8.A0d("viewModel");
            }
            lifecycle2.A05(minimizedCallBannerViewModel2);
        } else {
            r4.addOnAttachStateChangeListener(new C135386cc(r4, A002, r4));
        }
        MinimizedCallBannerViewModel minimizedCallBannerViewModel3 = r4.A01;
        if (minimizedCallBannerViewModel3 == null) {
            throw C36331k8.A0d("viewModel");
        }
        C36361kB.A17(r4.getEndCallButton(), minimizedCallBannerViewModel3, 32);
        r4.getAcceptCallButton().A05(new C135506co(minimizedCallBannerViewModel3, r4, 36));
        r4.getMuteCallButton().A05(new C135506co(minimizedCallBannerViewModel3, r4, 35));
        r4.setOnClickListener(new C135506co(minimizedCallBannerViewModel3, r4, 37));
    }

    public static final void A06(C93044fU r5, boolean z) {
        ValueAnimator valueAnimator;
        if (AnonymousClass000.A1Q(r5.getVisibility()) != z || ((valueAnimator = r5.A00) != null && valueAnimator.isRunning())) {
            ValueAnimator valueAnimator2 = r5.A00;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                r5.removeCallbacks(r5.A04);
                r5.A04 = new AnonymousClass75B(15, (Object) r5, z);
            } else if (!C36331k8.A1b(r5.A09)) {
                A07(r5, z);
            } else {
                int i = 0;
                r5.setVisibility(0);
                if (z) {
                    A07(r5, true);
                }
                r5.measure(0, 0);
                if (!z) {
                    i = r5.getMeasuredHeight();
                }
                int[] A1O = C36441kJ.A1O();
                A1O[0] = i;
                A1O[1] = r5.getMeasuredHeight() - i;
                ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
                C111565cU.A00(ofInt, r5, 11);
                ofInt.setDuration(250);
                ofInt.setInterpolator(new DecelerateInterpolator());
                ofInt.addListener(new C162287oL(0, r5, z));
                ofInt.start();
                r5.A00 = ofInt;
            }
        }
    }

    public int getBackgroundColorRes() {
        return R.color.f6nameremoved;
    }

    public void setVisibilityChangeListener(AnonymousClass7gL r1) {
        this.A07 = r1;
    }
}
