package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

/* renamed from: X.28c  reason: invalid class name */
public final class AnonymousClass28c extends AnonymousClass18Q {
    public final Activity A00;
    public final C68963ck A01;
    public final AnonymousClass11F A02;
    public final AnonymousClass3T0 A03;
    public final C19770wU A04;
    public final ViewGroup A05;
    public final WallPaperView A06;

    public static void A00(Drawable drawable, AnonymousClass28c r3) {
        ViewGroup viewGroup;
        int A002;
        WallPaperView wallPaperView = r3.A06;
        if (drawable != null) {
            wallPaperView.setDrawable(drawable);
            viewGroup = r3.A05;
            A002 = 0;
        } else {
            C36401kF.A1K(wallPaperView);
            viewGroup = r3.A05;
            A002 = C224514j.A00(viewGroup.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        }
        viewGroup.setBackgroundResource(A002);
    }

    public AnonymousClass28c(Activity activity, ViewGroup viewGroup, C225014r r12, AnonymousClass17Y r13, C54022sH r14, C21060yb r15, AnonymousClass11F r16, AnonymousClass3T0 r17, WallPaperView wallPaperView, C19770wU r19, Runnable runnable) {
        this.A02 = r16;
        this.A00 = activity;
        this.A04 = r19;
        this.A05 = viewGroup;
        WallPaperView wallPaperView2 = wallPaperView;
        this.A06 = wallPaperView2;
        AnonymousClass3T0 r8 = r17;
        this.A03 = r8;
        this.A01 = new C68963ck(activity, r12, r13, new C70873fr(this, wallPaperView2, runnable), r14, r15, r8);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        A00((Drawable) null, this);
        C19770wU r5 = this.A04;
        AnonymousClass11F r4 = this.A02;
        C36331k8.A1F(new C49402j3(this.A00, new AnonymousClass31U(this), r4, this.A03), r5);
    }

    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        AnonymousClass3T0 r5 = this.A03;
        if (r5.A00) {
            C36331k8.A1F(new C49402j3(this.A00, new AnonymousClass31U(this), this.A02, r5), this.A04);
            r5.A00 = false;
        }
    }
}
