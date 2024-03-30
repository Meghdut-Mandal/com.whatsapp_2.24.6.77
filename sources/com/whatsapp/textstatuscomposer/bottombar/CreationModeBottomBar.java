package com.whatsapp.textstatuscomposer.bottombar;

import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.AnonymousClass3Dv;
import X.AnonymousClass3G2;
import X.AnonymousClass3MU;
import X.AnonymousClass3UF;
import X.AnonymousClass4SR;
import X.AnonymousClass6E4;
import X.AnonymousClass7d6;
import X.C012005e;
import X.C100744vb;
import X.C130156Jy;
import X.C130366Ku;
import X.C135726dA;
import X.C160677lP;
import X.C162457oc;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C21060yb;
import X.C224514j;
import X.C27111My;
import X.C27851Qb;
import X.C27861Qc;
import X.C28331Sf;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C65103Qt;
import X.C67103Yn;
import X.C90484aE;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class CreationModeBottomBar extends FrameLayout implements C160677lP, C18700tb {
    public float A00;
    public float A01;
    public LayerDrawable A02;
    public ImageButton A03;
    public ImageButton A04;
    public C21060yb A05;
    public C18820ts A06;
    public AnonymousClass3G2 A07;
    public C28331Sf A08;
    public AnonymousClass7d6 A09;
    public AnonymousClass4SR A0A;
    public AnonymousClass3Dv A0B;
    public AnonymousClass1QZ A0C;
    public AnonymousClass6E4 A0D;
    public WaTextView A0E;
    public boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A00 = -1.0f;
        A00(context);
    }

    public void BsD(int i, String str) {
        AnonymousClass00C.A0D(str, 1);
        ImageButton imageButton = this.A04;
        if (imageButton == null) {
            throw C36331k8.A0d("sendButton");
        }
        C90484aE.A16(imageButton);
        imageButton.setEnabled(true);
        imageButton.setImageDrawable(new C100744vb(AnonymousClass3UF.A02(imageButton.getContext(), i, C224514j.A00(imageButton.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)), getWhatsAppLocale()));
        imageButton.setContentDescription(str);
        ImageButton imageButton2 = this.A04;
        if (imageButton2 == null) {
            throw C36331k8.A0d("sendButton");
        }
        AnonymousClass3MU.A01(imageButton2, true, false);
        ImageButton imageButton3 = this.A03;
        if (imageButton3 == null) {
            throw C36331k8.A0d("micButton");
        }
        AnonymousClass3MU.A01(imageButton3, false, false);
    }

    public final void setRecipientsControllerFactory(AnonymousClass3G2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setStatusConfig(C28331Sf r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public void setViewCallback(AnonymousClass7d6 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public final void setVoiceNotePermissionCheckerFactory(AnonymousClass4SR r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public void A01() {
        if (!this.A0F) {
            this.A0F = true;
            C27861Qc r2 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r1 = r2.A0M;
            this.A08 = (C28331Sf) r1.A7w.get();
            this.A05 = C36351kA.A0U(r1);
            this.A06 = C36341k9.A0T(r1);
            C27111My r12 = r2.A0L;
            this.A07 = C27111My.A2d(r12);
            this.A0A = (AnonymousClass4SR) r12.A46.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0C;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public ImageButton getMicButton() {
        ImageButton imageButton = this.A03;
        if (imageButton != null) {
            return imageButton;
        }
        throw C36331k8.A0d("micButton");
    }

    public LayerDrawable getMicButtonBackgroundDrawable() {
        LayerDrawable layerDrawable = this.A02;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        throw C36331k8.A0d("micButtonBackgroundDrawable");
    }

    public final AnonymousClass3G2 getRecipientsControllerFactory() {
        AnonymousClass3G2 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("recipientsControllerFactory");
    }

    public ImageButton getSendButton() {
        ImageButton imageButton = this.A04;
        if (imageButton != null) {
            return imageButton;
        }
        throw C36331k8.A0d("sendButton");
    }

    public WaTextView getSlidToCancelLabel() {
        WaTextView waTextView = this.A0E;
        if (waTextView != null) {
            return waTextView;
        }
        throw C36331k8.A0d("slideToCancelLabel");
    }

    public final C28331Sf getStatusConfig() {
        C28331Sf r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("statusConfig");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final AnonymousClass4SR getVoiceNotePermissionCheckerFactory() {
        AnonymousClass4SR r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("voiceNotePermissionCheckerFactory");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    private final void A00(Context context) {
        boolean A002 = getStatusConfig().A00();
        int i = R.layout.f9nameremoved;
        if (A002) {
            i = R.layout.f9nameremoved;
        }
        View.inflate(context, i, this);
        this.A04 = (ImageButton) C36361kB.A0G(this, R.id.send);
        this.A03 = (ImageButton) C36361kB.A0G(this, R.id.mic_button);
        this.A0E = C36341k9.A0Q(this, R.id.mic_slide_to_cancel);
        ImageButton imageButton = this.A04;
        if (imageButton == null) {
            throw C36331k8.A0d("sendButton");
        }
        C67103Yn.A00(imageButton, this, 46);
        setClipChildren(false);
        AnonymousClass6E4 A003 = C130366Ku.A00();
        this.A0D = A003;
        A003.A03 = new C130156Jy(440.0d, 21.0d);
        ImageButton imageButton2 = this.A03;
        if (imageButton2 == null) {
            throw C36331k8.A0d("micButton");
        }
        imageButton2.setOnTouchListener(new C135726dA(this));
        ImageButton imageButton3 = this.A03;
        if (imageButton3 == null) {
            throw C36331k8.A0d("micButton");
        }
        C012005e.A0V(imageButton3, new C162457oc(this, 9));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        C90484aE.A14(getResources(), shapeDrawable.getPaint(), R.color.f6nameremoved);
        C36421kH.A0q(shapeDrawable.getPaint());
        float f = (float) dimensionPixelSize;
        shapeDrawable.getPaint().setStrokeWidth(f);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new OvalShape());
        shapeDrawable2.getPaint().setStrokeWidth(f);
        shapeDrawable2.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        C90484aE.A14(getResources(), shapeDrawable2.getPaint(), C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable});
        this.A02 = layerDrawable;
        layerDrawable.getDrawable(1).setAlpha(0);
        ImageButton imageButton4 = this.A03;
        if (imageButton4 == null) {
            throw C36331k8.A0d("micButton");
        }
        LayerDrawable layerDrawable2 = this.A02;
        if (layerDrawable2 == null) {
            throw C36331k8.A0d("micButtonBackgroundDrawable");
        }
        imageButton4.setBackground(layerDrawable2);
        this.A01 = ((float) ViewConfiguration.get(context).getScaledTouchSlop()) * 1.5f;
    }

    public ViewGroup getBottomBarSceneRoot() {
        return this;
    }

    public int getBottomBarWidth() {
        return getWidth();
    }

    public float getMaxCancellationTransition() {
        return this.A00;
    }

    public float getMinCancellationTransition() {
        return 0.0f;
    }

    public float getTouchSlop() {
        return this.A01;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A00 == -1.0f) {
            int A012 = C65103Qt.A01(getContext(), 16.0f);
            WaTextView waTextView = this.A0E;
            if (waTextView == null) {
                throw C36331k8.A0d("slideToCancelLabel");
            }
            this.A00 = (float) (A012 - waTextView.getLeft());
            if (C36401kF.A1X(getWhatsAppLocale())) {
                this.A00 = -this.A00;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A00 = -1.0f;
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationModeBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A00 = -1.0f;
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationModeBottomBar(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A00 = -1.0f;
        A00(context);
    }

    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
