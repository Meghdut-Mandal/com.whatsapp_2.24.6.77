package X;

import android.content.res.Resources;
import android.view.animation.Animation;
import com.whatsapp.R;

/* renamed from: X.4vQ  reason: invalid class name and case insensitive filesystem */
public class C100684vQ extends C67243Zb {
    public final /* synthetic */ AnonymousClass6WU A00;
    public final /* synthetic */ boolean A01;

    public C100684vQ(AnonymousClass6WU r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void onAnimationEnd(Animation animation) {
        AnonymousClass6WU r3 = this.A00;
        boolean z = this.A01;
        Resources A0F = C36341k9.A0F(r3.A0A);
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        r3.A0I.setContentDescription(A0F.getString(i));
    }
}
