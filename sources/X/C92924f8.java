package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;

/* renamed from: X.4f8  reason: invalid class name and case insensitive filesystem */
public final class C92924f8 extends FrameLayout implements C18700tb {
    public AnonymousClass17Y A00;
    public BotEmbodimentViewModel A01;
    public AnonymousClass7cZ A02;
    public AnonymousClass6WA A03;
    public C157207ca A04;
    public AnonymousClass17Z A05;
    public AnonymousClass6KH A06;
    public C19770wU A07;
    public AnonymousClass1QZ A08;
    public boolean A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;

    public C92924f8(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A09) {
            this.A09 = true;
            C27861Qc r3 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r2 = r3.A0M;
            this.A07 = C36341k9.A0Z(r2);
            this.A05 = C36411kG.A0c(r2);
            this.A06 = (AnonymousClass6KH) r2.A00.A1z.get();
            this.A04 = (C157207ca) r3.A06.get();
            this.A00 = C36351kA.A0M(r2);
            this.A02 = (AnonymousClass7cZ) r3.A07.get();
        }
        this.A0A = C36431kI.A1I(new C153167Nh(context, this));
        this.A0B = C36431kI.A1I(new C152237Js(this));
        setClipToOutline(true);
        setBackgroundResource(R.drawable.bonsai_hero_player_background);
        setId(R.id.bot_embodiment_view);
        setElevation(C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved));
    }

    public final void setClientOrchestratorFactory(AnonymousClass7cZ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setEmbodimentVideoLoggerFactory(C157207ca r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setHeroSettingProvider(AnonymousClass6KH r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setWaDebugBuildSharedPreferences(AnonymousClass17Z r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setWaWorkers(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    /* access modifiers changed from: private */
    public final C124135xe getQueuePlayer() {
        return (C124135xe) this.A0A.getValue();
    }

    private final C124135xe getWaAIBotVideoPlayer() {
        return (C124135xe) this.A0B.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A08;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass7cZ getClientOrchestratorFactory() {
        AnonymousClass7cZ r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("clientOrchestratorFactory");
    }

    public final C157207ca getEmbodimentVideoLoggerFactory() {
        C157207ca r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("embodimentVideoLoggerFactory");
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final AnonymousClass6KH getHeroSettingProvider() {
        AnonymousClass6KH r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("heroSettingProvider");
    }

    public final AnonymousClass17Z getWaDebugBuildSharedPreferences() {
        AnonymousClass17Z r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waDebugBuildSharedPreferences");
    }

    public final C19770wU getWaWorkers() {
        C19770wU r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public final void A01() {
        C124135xe waAIBotVideoPlayer = getWaAIBotVideoPlayer();
        AnonymousClass6WC r2 = waAIBotVideoPlayer.A05;
        C1255660j r1 = waAIBotVideoPlayer.A02;
        AnonymousClass00C.A0D(r1, 0);
        r2.A0B.remove(r1);
        AnonymousClass6E3[] r5 = r2.A0E;
        int i = 0;
        do {
            AnonymousClass6E3 r22 = r5[i];
            r22.A05 = null;
            r22.A0A.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            C204359ps r0 = r22.A02;
            if (r0 != null) {
                r0.A0D();
            }
            i++;
        } while (i < 2);
    }

    public final void A02() {
        AnonymousClass6WC r2 = getWaAIBotVideoPlayer().A05;
        C204359ps r0 = r2.A0E[r2.A00 % 2].A02;
        if (r0 != null) {
            r0.A0B();
        }
    }

    public final void A03() {
        AnonymousClass6WC r2 = getWaAIBotVideoPlayer().A05;
        C204359ps r0 = r2.A0E[r2.A00 % 2].A02;
        if (r0 != null) {
            r0.A0C();
        }
    }

    public final void A04(AnonymousClass01L r6, AnonymousClass11F r7) {
        BotEmbodimentViewModel botEmbodimentViewModel = (BotEmbodimentViewModel) C36441kJ.A0b(r6).A00(BotEmbodimentViewModel.class);
        this.A01 = botEmbodimentViewModel;
        if (botEmbodimentViewModel == null) {
            throw C36331k8.A0d("botEmbodimentViewModel");
        }
        botEmbodimentViewModel.A0S(r7);
        AnonymousClass7cZ clientOrchestratorFactory = getClientOrchestratorFactory();
        AnonymousClass6WA r3 = new AnonymousClass6WA((AnonymousClass66D) ((C143426qX) clientOrchestratorFactory).A00.A01.A00.A0Q.get(), getQueuePlayer(), r7);
        C18800tq r0 = ((C143436qY) getEmbodimentVideoLoggerFactory()).A00.A01;
        r3.A03.add(new C1260262g((AnonymousClass66D) r0.A00.A0Q.get(), C36351kA.A0g(r0), r7));
        getWaDebugBuildSharedPreferences();
        AnonymousClass17Z r02 = AnonymousClass17Z.$redex_init_class;
        this.A03 = r3;
        BotEmbodimentViewModel botEmbodimentViewModel2 = this.A01;
        if (botEmbodimentViewModel2 == null) {
            throw C36331k8.A0d("botEmbodimentViewModel");
        }
        C165147sx.A02(r6, botEmbodimentViewModel2.A02, AnonymousClass5X0.A02(this, 5), 45);
        BotEmbodimentViewModel botEmbodimentViewModel3 = this.A01;
        if (botEmbodimentViewModel3 == null) {
            throw C36331k8.A0d("botEmbodimentViewModel");
        }
        C165147sx.A02(r6, botEmbodimentViewModel3.A01, AnonymousClass5X0.A02(this, 6), 47);
        BotEmbodimentViewModel botEmbodimentViewModel4 = this.A01;
        if (botEmbodimentViewModel4 == null) {
            throw C36331k8.A0d("botEmbodimentViewModel");
        }
        C165147sx.A02(r6, botEmbodimentViewModel4.A05, AnonymousClass5X0.A02(this, 7), 46);
        addView(getWaAIBotVideoPlayer().A03);
        AnonymousClass6WA r03 = this.A03;
        if (r03 == null) {
            throw C36331k8.A0d("clientOrchestrator");
        }
        r03.A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = getWaAIBotVideoPlayer().A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L_0x001a
            X.5xe r0 = r2.getWaAIBotVideoPlayer()
            android.view.View r1 = r0.A03
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L_0x001a
            int r6 = r6 - r4
            r0.width = r6
            int r7 = r7 - r5
            r0.height = r7
            r1.setLayoutParams(r0)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92924f8.onLayout(boolean, int, int, int, int):void");
    }
}
