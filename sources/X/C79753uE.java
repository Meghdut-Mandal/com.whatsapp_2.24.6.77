package X;

import android.view.View;
import com.whatsapp.inappsupport.ui.SupportVideoActivity;

/* renamed from: X.3uE  reason: invalid class name and case insensitive filesystem */
public final class C79753uE implements C158627ho {
    public final /* synthetic */ SupportVideoActivity A00;

    public C79753uE(SupportVideoActivity supportVideoActivity) {
        this.A00 = supportVideoActivity;
    }

    public void BkV(int i) {
        SupportVideoActivity supportVideoActivity = this.A00;
        View A0C = C36361kB.A0C(supportVideoActivity);
        if (i == 0) {
            A0C.setSystemUiVisibility(0);
            AnonymousClass07B supportActionBar = supportVideoActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0E();
                return;
            }
            return;
        }
        A0C.setSystemUiVisibility(4358);
        AnonymousClass07B supportActionBar2 = supportVideoActivity.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.A0D();
        }
    }
}
