package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.gallery.views.GalleryPartialPermissionBanner;

/* renamed from: X.3GM  reason: invalid class name */
public final class AnonymousClass3GM {
    public GalleryPartialPermissionBanner A00;
    public boolean A01;
    public final C20830yE A02;

    public AnonymousClass3GM(C20830yE r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
    }

    public final void A00(View view, AnonymousClass01I r6) {
        GalleryPartialPermissionBanner galleryPartialPermissionBanner;
        if (C19550w8.A0A() && this.A02.A04() == C51512nw.PARTIAL) {
            ViewStub A0S = C36441kJ.A0S(view, R.id.partial_permission_banner_view_stub);
            View inflate = A0S.inflate();
            if ((inflate instanceof GalleryPartialPermissionBanner) && (galleryPartialPermissionBanner = (GalleryPartialPermissionBanner) inflate) != null) {
                this.A00 = galleryPartialPermissionBanner;
                galleryPartialPermissionBanner.A00 = new AnonymousClass4GJ(r6, this);
                galleryPartialPermissionBanner.setVisibility(0);
                A0S.requestLayout();
            }
        }
    }

    public final void A01(AnonymousClass00S r6) {
        if (C19550w8.A0A()) {
            GalleryPartialPermissionBanner galleryPartialPermissionBanner = this.A00;
            if (galleryPartialPermissionBanner != null) {
                int i = 0;
                if (this.A02.A04() != C51512nw.PARTIAL) {
                    i = 8;
                }
                galleryPartialPermissionBanner.setVisibility(i);
            }
            if (this.A01 && this.A02.A04() != C51512nw.DENIED) {
                r6.invoke();
            }
            this.A01 = false;
        }
    }
}
