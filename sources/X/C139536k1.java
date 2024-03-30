package X;

import android.content.Context;
import com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager;
import com.facebook.avatar.autogen.presenter.AECapturePresenter$1;

/* renamed from: X.6k1  reason: invalid class name and case insensitive filesystem */
public final class C139536k1 implements C23063B2m {
    public boolean A00 = true;
    public boolean A01;
    public final AEFaceTrackerManager A02;
    public final C134956bt A03;
    public final C132676Uu A04;
    public final AnonymousClass05L A05 = AnonymousClass05E.A00((Object) null);
    public final C005502l A06;

    public C139536k1(Context context, C134956bt r5, C132676Uu r6, C005502l r7) {
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r7;
        this.A02 = new AEFaceTrackerManager(context, r5, this);
        C36331k8.A1T(new AECapturePresenter$1(this, (C023509x) null), C009403z.A02(r7));
    }

    public void BSt(Exception exc) {
    }

    public void BSw() {
    }

    public void BSx(String str, String str2) {
    }

    public void BSz() {
    }
}
