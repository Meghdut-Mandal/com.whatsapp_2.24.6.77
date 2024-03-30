package X;

import com.whatsapp.account.remove.RemoveAccountActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6yZ  reason: invalid class name and case insensitive filesystem */
public final class C148256yZ implements C159677jk {
    public final /* synthetic */ RemoveAccountActivity A00;

    public C148256yZ(RemoveAccountActivity removeAccountActivity) {
        this.A00 = removeAccountActivity;
    }

    public void BXH() {
        RemoveAccountActivity removeAccountActivity = this.A00;
        C19650wI r2 = removeAccountActivity.A04;
        if (r2 != null) {
            r2.A00(new C1496972k(removeAccountActivity, 14));
            return;
        }
        throw C36331k8.A0d("mainThreadHandler");
    }

    public void onSuccess() {
        Log.i("RemoveAccountActivity/startRemoveAccount/launch switch and remove activity");
        RemoveAccountActivity removeAccountActivity = this.A00;
        removeAccountActivity.A04.BpM(new C1496972k(removeAccountActivity, 15), "RemoveAccountActivity/startRemoveAccountIntent", TimeUnit.SECONDS.toMillis(2));
    }
}
