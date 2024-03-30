package X;

import android.app.ProgressDialog;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.accountsync.LoginActivity;

/* renamed from: X.5Lw  reason: invalid class name and case insensitive filesystem */
public class C106925Lw extends C132446Tt {
    public final ProgressDialog A00;
    public final /* synthetic */ LoginActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106925Lw(Context context, LoginActivity loginActivity) {
        super(loginActivity, true);
        this.A01 = loginActivity;
        ProgressDialog show = ProgressDialog.show(context, "", loginActivity.getString(R.string.f12nameremoved), true, false);
        this.A00 = show;
        show.setCancelable(true);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A00.dismiss();
        if (((Boolean) obj).booleanValue()) {
            this.A01.finish();
        }
    }
}
