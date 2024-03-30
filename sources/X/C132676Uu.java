package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.FrameLayout;
import com.facebook.avatar.autogen.view.AESelfieViewProvider$decreaseBrightness$1;

/* renamed from: X.6Uu  reason: invalid class name and case insensitive filesystem */
public final class C132676Uu {
    public FrameLayout A00;
    public C139536k1 A01;
    public C23114B5t A02;
    public C157737eb A03;
    public boolean A04;
    public final Context A05;
    public final C134956bt A06;
    public final C119115pG A07;
    public final C116685kz A08;

    public C132676Uu(Context context, C134956bt r3, C119115pG r4, C116685kz r5) {
        C36331k8.A1G(r4, 3, r5);
        this.A05 = context;
        this.A06 = r3;
        this.A07 = r4;
        this.A08 = r5;
    }

    public static final Activity A00(Context context, C132676Uu r2) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        AnonymousClass00C.A08(baseContext);
        return A00(baseContext, r2);
    }

    public static final void A01(Activity activity, C132676Uu r4) {
        if (r4.A06.A01) {
            C005502l r0 = C006702x.A00;
            C36331k8.A1T(new AESelfieViewProvider$decreaseBrightness$1(activity, (C023509x) null), C009403z.A02(AnonymousClass03K.A00));
        }
    }
}
