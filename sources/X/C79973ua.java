package X;

import com.whatsapp.R;
import com.whatsapp.status.audienceselector.StatusPrivacyActivity;

/* renamed from: X.3ua  reason: invalid class name and case insensitive filesystem */
public final class C79973ua implements C159817jy {
    public final /* synthetic */ StatusPrivacyActivity A00;

    public C79973ua(StatusPrivacyActivity statusPrivacyActivity) {
        this.A00 = statusPrivacyActivity;
    }

    public void BXT(AnonymousClass5VM r8, Integer num, Integer num2) {
        StatusPrivacyActivity statusPrivacyActivity = this.A00;
        statusPrivacyActivity.A3i().A01(statusPrivacyActivity, r8, num, num2, "status_privacy_activity", true);
    }

    public void onSuccess() {
        StatusPrivacyActivity statusPrivacyActivity = this.A00;
        C132686Uv.A01((C33541fX) null, (C132686Uv) statusPrivacyActivity.A3i().A0A.get(), "status_privacy_activity", R.string.f12nameremoved, 0, true);
        statusPrivacyActivity.A05.Bp3(new C81203wd(statusPrivacyActivity, (Object) null, 9));
        C81173wa.A01(statusPrivacyActivity.A04, statusPrivacyActivity, 22);
    }
}
