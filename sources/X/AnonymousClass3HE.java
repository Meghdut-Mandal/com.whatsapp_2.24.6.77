package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;

/* renamed from: X.3HE  reason: invalid class name */
public class AnonymousClass3HE {
    public ObjectAnimator A00;
    public AnonymousClass4QD A01;
    public AnonymousClass399 A02;
    public C78053rU A03;
    public C88234Rx A04;
    public AnonymousClass5H9 A05;
    public final AnonymousClass3BO A06;
    public final C20810yC A07;
    public final AnonymousClass633 A08;
    public final C24031Au A09;
    public final AnonymousClass1HA A0A;
    public final AnonymousClass1BB A0B;
    public final AnonymousClass1AP A0C;
    public final C88234Rx A0D = new C55842vH(this, 2);
    public final AnonymousClass3GT A0E;
    public final C95494lK A0F;
    public final C63513Ki A0G;
    public final C133356Xz A0H;
    public final C33541fX A0I = C48742hy.A00(this, 30);
    public final AnonymousClass005 A0J;

    public void A00(boolean z) {
        int i;
        AnonymousClass00T r0;
        if (!z) {
            i = 8;
            r0 = this.A02.A02;
        } else {
            C36341k9.A1R(this.A02.A02, 0);
            boolean z2 = C36341k9.A0E(this.A06.A04).getBoolean("sticker_store_onboarding_badge_shown", false);
            AnonymousClass399 r02 = this.A02;
            if (!z2) {
                C36341k9.A1R(r02.A01, 0);
                ObjectAnimator objectAnimator = this.A00;
                if (objectAnimator == null) {
                    Object value = this.A02.A01.getValue();
                    PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
                    C36381kD.A1S(new float[1], propertyValuesHolderArr);
                    propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{0.4f, 0.0f});
                    objectAnimator = ObjectAnimator.ofPropertyValuesHolder(value, propertyValuesHolderArr);
                    this.A00 = objectAnimator;
                }
                objectAnimator.setDuration(1500);
                this.A00.setRepeatCount(-1);
                this.A00.setRepeatMode(1);
                this.A00.start();
                return;
            }
            i = 8;
            r0 = r02.A01;
        }
        C36341k9.A1R(r0, i);
    }

    public boolean A01() {
        C95494lK r0;
        if (this.A0E.A01() && (r0 = this.A0F) != null) {
            C001700s r1 = r0.A02;
            if (r1.A04() == null || C36401kF.A0w(r1).isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass3HE(AnonymousClass3BO r3, C20810yC r4, AnonymousClass633 r5, C24031Au r6, AnonymousClass1HA r7, AnonymousClass1BB r8, AnonymousClass1AP r9, AnonymousClass3GT r10, C95494lK r11, C63513Ki r12, C133356Xz r13, AnonymousClass005 r14) {
        this.A07 = r4;
        this.A0H = r13;
        this.A0B = r8;
        this.A0C = r9;
        this.A0J = r14;
        this.A06 = r3;
        this.A0A = r7;
        this.A09 = r6;
        this.A0G = r12;
        this.A0F = r11;
        this.A08 = r5;
        this.A0E = r10;
    }
}
