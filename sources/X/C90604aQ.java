package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.R;
import java.util.AbstractMap;

/* renamed from: X.4aQ  reason: invalid class name and case insensitive filesystem */
public final class C90604aQ extends AnimatorListenerAdapter {
    public final /* synthetic */ C1271967i A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C90604aQ(C1271967i r1, String str, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = str;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A02) {
            C1271967i r2 = this.A00;
            ((AbstractMap) r2.A01(R.id.bk_context_key_animations)).remove(this.A01);
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A02) {
            C1271967i r2 = this.A00;
            ((AbstractMap) r2.A01(R.id.bk_context_key_animations)).remove(this.A01);
        }
    }
}
