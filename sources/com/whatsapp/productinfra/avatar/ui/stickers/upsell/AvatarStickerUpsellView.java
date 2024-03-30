package com.whatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass040;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0BJ;
import X.AnonymousClass190;
import X.AnonymousClass1BF;
import X.AnonymousClass1QZ;
import X.AnonymousClass39Q;
import X.AnonymousClass3Y5;
import X.AnonymousClass6WF;
import X.AnonymousClass7O8;
import X.C000800j;
import X.C001400p;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C05250Oz;
import X.C106135Im;
import X.C106145In;
import X.C111435cH;
import X.C113325fM;
import X.C152927Mj;
import X.C152937Mk;
import X.C152947Ml;
import X.C152957Mm;
import X.C164107rH;
import X.C18700tb;
import X.C18800tq;
import X.C20810yC;
import X.C23871Ae;
import X.C24251Bs;
import X.C24261Bt;
import X.C24291Bw;
import X.C26581Ks;
import X.C27851Qb;
import X.C27861Qc;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C90474aD;
import X.C90514aH;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class AvatarStickerUpsellView extends ConstraintLayout implements C18700tb {
    public C20810yC A00;
    public AnonymousClass190 A01;
    public AnonymousClass1BF A02;
    public AnonymousClass39Q A03;
    public C24261Bt A04;
    public AnonymousClass6WF A05;
    public C24251Bs A06;
    public C23871Ae A07;
    public C111435cH A08;
    public AnonymousClass1QZ A09;
    public C005502l A0A;
    public AnonymousClass040 A0B;
    public boolean A0C;
    public final AnonymousClass00T A0D;
    public final AnonymousClass00T A0E;
    public final AnonymousClass00T A0F;
    public final AnonymousClass00T A0G;
    public final C164107rH A0H;
    public final WaImageView A0I;
    public final AnonymousClass00T A0J;

    @DebugMetadata(c = "com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView$4", f = "AvatarStickerUpsellView.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView$4  reason: invalid class name */
    public final class AnonymousClass4 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass4(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass4((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                AvatarStickerUpsellViewController A00 = AvatarStickerUpsellView.this.getViewController();
                C111435cH r0 = AvatarStickerUpsellView.this.A08;
                if (r0 == null) {
                    throw C36331k8.A0d("entryPoint");
                }
                this.label = 1;
                if (A00.A00(r0, this) == r3) {
                    return r3;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C111435cH r0;
        AnonymousClass00C.A0D(context, 1);
        if (!this.A0C) {
            this.A0C = true;
            C27861Qc r2 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r1 = r2.A0M;
            this.A00 = C36341k9.A0V(r1);
            this.A01 = C36351kA.A0h(r1);
            this.A05 = (AnonymousClass6WF) r2.A0L.A04.get();
            this.A04 = (C24261Bt) r1.AAz.get();
            this.A02 = (AnonymousClass1BF) r1.A0Q.get();
            this.A03 = (AnonymousClass39Q) r1.AAy.get();
            this.A06 = (C24251Bs) r1.AAn.get();
            this.A07 = (C23871Ae) r1.A0V.get();
            this.A0A = C24291Bw.A00();
            this.A0B = C26581Ks.A00();
        }
        C000800j r12 = C000800j.NONE;
        this.A0G = C001400p.A00(r12, new C152957Mm(context));
        this.A0E = C001400p.A00(r12, new C152937Mk(context));
        this.A0F = C001400p.A00(r12, new C152947Ml(context));
        this.A0D = C001400p.A00(r12, new C152927Mj(context));
        this.A0J = C001400p.A00(r12, new AnonymousClass7O8(context, this));
        this.A0H = new C164107rH(this, 2);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A0I = C90474aD.A0P(this, R.id.stickers_upsell_image);
        setBackgroundResource(R.drawable.stickers_upsell_background);
        C36331k8.A0q(context, this, R.string.f12nameremoved);
        View A0G2 = C36361kB.A0G(this, R.id.stickers_upsell_close);
        if (attributeSet != null) {
            int[] iArr = C113325fM.A00;
            AnonymousClass00C.A09(iArr);
            int i2 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            A0G2.setVisibility(C90514aH.A0A(obtainStyledAttributes.getBoolean(0, true) ? 1 : 0));
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            TextView A0O = C36391kE.A0O(this, R.id.stickers_upsell_publisher);
            A0O.setVisibility(!z ? 8 : i2);
            A0O.setText("Meta");
            int i3 = obtainStyledAttributes.getInt(1, -1);
            if (i3 == 0) {
                r0 = C106135Im.A00;
            } else if (i3 == 1) {
                r0 = C106145In.A00;
            } else {
                throw AnonymousClass001.A08("Avatar sticker upsell entry point must be set");
            }
            this.A08 = r0;
            obtainStyledAttributes.recycle();
        }
        setOnClickListener(new AnonymousClass3Y5(this, 28));
        AnonymousClass3Y5.A00(A0G2, this, 29);
        C36331k8.A1T(new AnonymousClass4((C023509x) null), getApplicationScope());
    }

    public static /* synthetic */ void getApplicationScope$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setApplicationScope(AnonymousClass040 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setAvatarConfigRepository(AnonymousClass1BF r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setAvatarEditorLauncher(AnonymousClass6WF r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setAvatarEventObservers(C24251Bs r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setAvatarLogger(C23871Ae r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setAvatarRepository(AnonymousClass39Q r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setAvatarSharedPreferences(C24261Bt r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setMainDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public final void setWaIntents(AnonymousClass190 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    private final int getImageHeightLandscape() {
        return C36331k8.A02(this.A0D);
    }

    private final int getImageHeightPortrait() {
        return C36331k8.A02(this.A0E);
    }

    private final int getImageWidthLandscape() {
        return C36331k8.A02(this.A0F);
    }

    private final int getImageWidthPortrait() {
        return C36331k8.A02(this.A0G);
    }

    /* access modifiers changed from: private */
    public final AvatarStickerUpsellViewController getViewController() {
        return (AvatarStickerUpsellViewController) this.A0J.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final AnonymousClass040 getApplicationScope() {
        AnonymousClass040 r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("applicationScope");
    }

    public final AnonymousClass1BF getAvatarConfigRepository() {
        AnonymousClass1BF r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("avatarConfigRepository");
    }

    public final AnonymousClass6WF getAvatarEditorLauncher() {
        AnonymousClass6WF r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("avatarEditorLauncher");
    }

    public final C24251Bs getAvatarEventObservers() {
        C24251Bs r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("avatarEventObservers");
    }

    public final C23871Ae getAvatarLogger() {
        C23871Ae r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("avatarLogger");
    }

    public final AnonymousClass39Q getAvatarRepository() {
        AnonymousClass39Q r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("avatarRepository");
    }

    public final C24261Bt getAvatarSharedPreferences() {
        C24261Bt r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("avatarSharedPreferences");
    }

    public final C005502l getMainDispatcher() {
        C005502l r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mainDispatcher");
    }

    public final AnonymousClass190 getWaIntents() {
        AnonymousClass190 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0X();
    }

    public static final void A01(AvatarStickerUpsellView avatarStickerUpsellView) {
        avatarStickerUpsellView.getAvatarLogger().A03((Boolean) null, 10);
        AvatarStickerUpsellViewController viewController = avatarStickerUpsellView.getViewController();
        if (viewController.A02.A0E(7755)) {
            Activity activity = viewController.A00;
            activity.startActivity(AnonymousClass190.A11(activity, "avatar_sticker_upsell"));
            return;
        }
        AnonymousClass6WF r2 = viewController.A04;
        Activity activity2 = viewController.A00;
        AnonymousClass00C.A0E(activity2, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        r2.A04("avatar_sticker_upsell", AnonymousClass001.A0F(activity2));
    }

    public static final void A02(AvatarStickerUpsellView avatarStickerUpsellView) {
        avatarStickerUpsellView.getAvatarLogger().A03((Boolean) null, 11);
        AvatarStickerUpsellViewController viewController = avatarStickerUpsellView.getViewController();
        viewController.A03.A02();
        viewController.A01.setVisibility(8);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAvatarEventObservers().registerObserver(this.A0H);
    }

    public void onConfigurationChanged(Configuration configuration) {
        int A022;
        int A023;
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            if (configuration.orientation == 2) {
                A022 = C36331k8.A02(this.A0F);
            } else {
                A022 = C36331k8.A02(this.A0G);
            }
            if (configuration.orientation == 2) {
                A023 = C36331k8.A02(this.A0D);
            } else {
                A023 = C36331k8.A02(this.A0E);
            }
            this.A0I.setLayoutParams(new AnonymousClass0BJ(A022, A023));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAvatarEventObservers().unregisterObserver(this.A0H);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ AvatarStickerUpsellView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
