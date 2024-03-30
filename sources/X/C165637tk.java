package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.7tk  reason: invalid class name and case insensitive filesystem */
public class C165637tk extends AnimatorListenerAdapter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass9KS A01;
    public final /* synthetic */ AnonymousClass9NE A02;

    public C165637tk(AnonymousClass9KS r1, AnonymousClass9NE r2, long j) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = j;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass9KS r0 = this.A01;
        long j = this.A00;
        NumberEntryKeyboard numberEntryKeyboard = r0.A02;
        int i = NumberEntryKeyboard.A0J;
        Map map = numberEntryKeyboard.A0B;
        Objects.requireNonNull(map);
        map.remove(Long.valueOf(j));
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass9KS r0 = this.A01;
        Handler handler = r0.A00;
        if (handler == null) {
            handler = C36341k9.A0H();
            r0.A00 = handler;
        }
        handler.post(r0.A01);
    }
}
