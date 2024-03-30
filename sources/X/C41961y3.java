package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.1y3  reason: invalid class name and case insensitive filesystem */
public final class C41961y3 extends AnonymousClass0D3 {
    public final AnonymousClass3SF A00;
    public final WDSProfilePhoto A01;

    public C41961y3(View view, AnonymousClass1LI r5) {
        super(view);
        this.A00 = AnonymousClass3SF.A01(view, r5, R.id.report_to_admin_reporter_name);
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) C36361kB.A0F(view, R.id.report_to_admin_reporter_photo);
        this.A01 = wDSProfilePhoto;
        C36331k8.A0q(view.getContext(), wDSProfilePhoto, R.string.f12nameremoved);
        C011504z.A06(wDSProfilePhoto, 2);
    }
}
