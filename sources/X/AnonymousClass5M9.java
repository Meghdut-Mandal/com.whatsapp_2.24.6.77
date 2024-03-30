package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.privacy.usernotice.UserNoticeModalIconView;
import java.lang.ref.WeakReference;

/* renamed from: X.5M9  reason: invalid class name */
public class AnonymousClass5M9 extends C132446Tt {
    public final int A00;
    public final AnonymousClass647 A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Drawable drawable = (Drawable) obj;
        AnonymousClass5HR r4 = (AnonymousClass5HR) this.A02.get();
        if (r4 == null) {
            return;
        }
        if (drawable == null) {
            r4.A05(this.A01);
            return;
        }
        Context context = r4.getContext();
        AnonymousClass647 r0 = this.A01;
        AnonymousClass6TW A002 = C111325c6.A00(context, r0.A02, r0.A03);
        if (A002 != null) {
            Context context2 = r4.getContext();
            AnonymousClass00C.A0D(context2, 0);
            int A003 = AnonymousClass00F.A00(context2, A002.A00);
            Drawable A04 = AnonymousClass3UF.A04(context2, drawable, A002.A01);
            AnonymousClass00C.A08(A04);
            drawable = new C91254bi(A04, A003);
        }
        if (r4 instanceof UserNoticeModalIconView) {
            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) r4;
            C011504z.A04((Drawable) null, userNoticeModalIconView);
            userNoticeModalIconView.setImageDrawable(drawable);
            userNoticeModalIconView.A00.setVisibility(8);
            return;
        }
        r4.clearColorFilter();
        r4.setImageDrawable(drawable);
    }

    public AnonymousClass5M9(AnonymousClass647 r2, AnonymousClass5HR r3) {
        this.A01 = r2;
        this.A02 = AnonymousClass001.A0F(r3);
        this.A00 = r3.getTargetIconSize();
    }
}
