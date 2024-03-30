package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.3H8  reason: invalid class name */
public final class AnonymousClass3H8 {
    public ObjectAnimator A00;
    public AnonymousClass38A A01;
    public AnonymousClass4QD A02;
    public C88234Rx A03;
    public AnonymousClass5HA A04;
    public final C55842vH A05 = new C55842vH(this, 1);
    public final AnonymousClass3BO A06;
    public final AnonymousClass1HA A07;
    public final AnonymousClass1AP A08;
    public final AnonymousClass3GT A09;
    public final C95494lK A0A;
    public final C63513Ki A0B;
    public final C33541fX A0C = C48742hy.A00(this, 27);

    public final void A00() {
        AnonymousClass38A r3 = this.A01;
        if (r3 != null && r3.A00.getVisibility() == 0) {
            C36331k8.A0w(C36351kA.A0A(this.A06.A09.A01), "pref_avatar_sticker_onboarding_shown", true);
            View view = r3.A00;
            view.setVisibility(8);
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
        }
    }

    public final void A01(int i) {
        View view;
        AnonymousClass38A r0 = this.A01;
        if (r0 != null) {
            r0.A01.setVisibility(i);
        }
        if (i == 0) {
            AnonymousClass38A r02 = this.A01;
            if (r02 == null || r02.A00.getVisibility() != 0) {
                AnonymousClass00T r2 = this.A06.A09.A01;
                if (!C36411kG.A0E(r2).getBoolean("pref_avatar_sticker_onboarding_shown", false)) {
                    C36331k8.A0w(C36351kA.A0A(r2), "pref_avatar_sticker_onboarding_shown", true);
                    AnonymousClass38A r03 = this.A01;
                    if (r03 != null) {
                        r03.A00.setVisibility(0);
                    }
                    if (this.A00 == null) {
                        AnonymousClass38A r04 = this.A01;
                        if (r04 != null) {
                            view = r04.A00;
                        } else {
                            view = null;
                        }
                        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
                        C36381kD.A1S(new float[1], propertyValuesHolderArr);
                        propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{0.4f, 0.0f});
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
                        ofPropertyValuesHolder.setDuration(1500);
                        ofPropertyValuesHolder.setRepeatCount(-1);
                        ofPropertyValuesHolder.setRepeatMode(1);
                        ofPropertyValuesHolder.start();
                        this.A00 = ofPropertyValuesHolder;
                        return;
                    }
                    return;
                }
                AnonymousClass38A r05 = this.A01;
                if (r05 != null) {
                    r05.A00.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        A00();
    }

    public AnonymousClass3H8(AnonymousClass3BO r3, AnonymousClass1HA r4, AnonymousClass1AP r5, AnonymousClass3GT r6, C95494lK r7, C63513Ki r8) {
        this.A08 = r5;
        this.A07 = r4;
        this.A0B = r8;
        this.A06 = r3;
        this.A0A = r7;
        this.A09 = r6;
    }
}
