package X;

import com.whatsapp.R;
import com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity;

/* renamed from: X.3GC  reason: invalid class name */
public final class AnonymousClass3GC {
    public final /* synthetic */ AnonymousClass3GB A00;
    public final /* synthetic */ ShareToFacebookActivity A01;

    public AnonymousClass3GC(AnonymousClass3GB r1, ShareToFacebookActivity shareToFacebookActivity) {
        this.A01 = shareToFacebookActivity;
        this.A00 = r1;
    }

    public void A00() {
        ShareToFacebookActivity shareToFacebookActivity = this.A01;
        AnonymousClass1UZ A3i = shareToFacebookActivity.A3i();
        AnonymousClass005 r0 = shareToFacebookActivity.A05;
        if (r0 != null) {
            AnonymousClass1UM A10 = C36431kI.A10(r0);
            AnonymousClass1US r2 = ShareToFacebookActivity.A07;
            A3i.A02(Boolean.valueOf(C36341k9.A1Z(A10.A01(r2))), "final_auto_setting");
            A3i.A04("SEE_UNLINK_SUCCESS");
            A3i.A01();
            this.A00.A00();
            AnonymousClass005 r02 = shareToFacebookActivity.A05;
            if (r02 == null) {
                throw C36331k8.A0d("fbAccountManagerLazy");
            } else if (!C36431kI.A10(r02).A06(r2)) {
                C36331k8.A0m(shareToFacebookActivity);
            }
        } else {
            throw C36331k8.A0d("fbAccountManagerLazy");
        }
    }

    public void A01(AnonymousClass5VM r9) {
        ShareToFacebookActivity shareToFacebookActivity = this.A01;
        AnonymousClass1UZ A3i = shareToFacebookActivity.A3i();
        AnonymousClass005 r0 = shareToFacebookActivity.A05;
        if (r0 != null) {
            A3i.A02(Boolean.valueOf(C36341k9.A1Z(C36431kI.A10(r0).A01(ShareToFacebookActivity.A07))), "final_auto_setting");
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Class: ");
            Class<?> cls = r9.getClass();
            A0u.append(cls);
            A3i.A05("SEE_UNLINK_ERROR", C36331k8.A0i(", message: ", A0u, r9));
            this.A00.A00();
            boolean A0J = AnonymousClass00C.A0J(cls, AnonymousClass5QX.class);
            C132686Uv r3 = shareToFacebookActivity.A03;
            if (r3 != null) {
                int i = R.string.f12nameremoved;
                if (A0J) {
                    i = R.string.f12nameremoved;
                }
                C132686Uv.A01((C33541fX) null, r3, "share_to_fb_activity", i, 0, false);
                return;
            }
            throw C36331k8.A0d("crosspostSnackbarManager");
        }
        throw C36331k8.A0d("fbAccountManagerLazy");
    }
}
