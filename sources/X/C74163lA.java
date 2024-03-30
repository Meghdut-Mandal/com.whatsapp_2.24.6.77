package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment;

/* renamed from: X.3lA  reason: invalid class name and case insensitive filesystem */
public final class C74163lA implements AnonymousClass00M {
    public ReportToAdminDialogFragment A00(AnonymousClass3T1 r9) {
        C64933Qa r7 = r9.A1J;
        AnonymousClass00C.A07(r7);
        ReportToAdminDialogFragment reportToAdminDialogFragment = new ReportToAdminDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("title_res", R.string.f12nameremoved);
        A07.putInt("message_res", R.string.f12nameremoved);
        A07.putInt("primary_action_text_id_res", R.string.f12nameremoved);
        A07.putInt("secondary_action_text_res", R.string.f12nameremoved);
        reportToAdminDialogFragment.A17(A07);
        AnonymousClass3UJ.A08(reportToAdminDialogFragment.A0b(), r7);
        return reportToAdminDialogFragment;
    }
}
