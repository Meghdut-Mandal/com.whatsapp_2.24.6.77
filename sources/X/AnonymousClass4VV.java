package X;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.gallery.views.GalleryPartialPermissionBanner;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4VV  reason: invalid class name */
public class AnonymousClass4VV extends ClickableSpan {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4VV(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void onClick(View view) {
        switch (this.A02) {
            case 0:
            case 1:
                AnonymousClass02E r2 = (AnonymousClass02E) this.A00;
                r2.A1C(AnonymousClass190.A0u(r2.A0a(), (UserJid) this.A01));
                return;
            case 2:
                AnonymousClass00S r0 = ((GalleryPartialPermissionBanner) this.A01).A00;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
            default:
                C36411kG.A1O(this.A01);
                return;
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        switch (this.A02) {
            case 0:
            case 1:
                textPaint.setColor(C36341k9.A0G((AnonymousClass02E) this.A00).getColor(R.color.f6nameremoved));
                textPaint.clearShadowLayer();
                return;
            case 2:
                AnonymousClass00C.A0D(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setColor(C015006m.A00((Resources.Theme) null, ((View) this.A00).getResources(), R.color.f6nameremoved));
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
