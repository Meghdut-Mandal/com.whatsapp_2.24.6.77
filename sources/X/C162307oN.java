package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.7oN  reason: invalid class name and case insensitive filesystem */
public class C162307oN extends AnimatorListenerAdapter {
    public float A00;
    public Object A01;
    public final int A02;

    public C162307oN(Object obj, float f, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = f;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A02 != 0) {
            ((AnonymousClass6X3) this.A01).A0D.setAlpha(this.A00);
            onAnimationEnd(animator);
            return;
        }
        ((View) this.A01).setX(this.A00);
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A02 == 0) {
            ((View) this.A01).setX(this.A00);
        } else if (this.A00 == 0.0f) {
            AnonymousClass6X3 r3 = (AnonymousClass6X3) this.A01;
            r3.A0D.setVisibility(8);
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r3.A0H;
            AnonymousClass61I r0 = voipCallControlBottomSheetV2.A0d;
            if (r0 != null) {
                r0.A00(false);
            }
            VoipCallControlBottomSheetV2.A0A(voipCallControlBottomSheetV2, 0.0f);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A02 != 0) {
            super.onAnimationStart(animator);
        } else if (this.A00 == 1.0f) {
            AnonymousClass6X3 r3 = (AnonymousClass6X3) this.A01;
            r3.A0D.setVisibility(0);
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r3.A0H;
            AnonymousClass61I r0 = voipCallControlBottomSheetV2.A0d;
            if (r0 != null) {
                r0.A00(true);
            }
            VoipCallControlBottomSheetV2.A0A(voipCallControlBottomSheetV2, 1.0f);
        }
    }
}
