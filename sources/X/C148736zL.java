package X;

import android.content.Context;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;

/* renamed from: X.6zL  reason: invalid class name and case insensitive filesystem */
public class C148736zL implements C88594Th {
    public final Context A00;
    public final C19730wQ A01;
    public final C19420v0 A02;

    public /* synthetic */ void BRJ() {
    }

    public void BRI() {
        AnonymousClass005 r3 = this.A02.A00;
        C36391kE.A0H(r3).getInt("c2dm_app_vers", 0);
        C36391kE.A0H(r3).getString("c2dm_reg_id", (String) null);
        C19730wQ r0 = this.A01;
        r0.A0G();
        if (r0.A00 != null) {
            Log.i("updatedappreceiver/request-refresh");
            RegistrationIntentService.A03(this.A00.getApplicationContext());
            return;
        }
        Log.i("updateappreceiver/skip-refresh");
    }

    public C148736zL(Context context, C19730wQ r2, C19420v0 r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }
}
