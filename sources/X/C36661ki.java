package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.io.IOException;

/* renamed from: X.1ki  reason: invalid class name and case insensitive filesystem */
public class C36661ki extends BroadcastReceiver {
    public C19970wo A00;
    public C19420v0 A01;
    public AnonymousClass1QE A02;
    public final Object A03 = C36441kJ.A11();
    public volatile boolean A04 = false;

    public void onReceive(Context context, Intent intent) {
        String str;
        Context context2 = context;
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    C18830tt.APq(C56042vd.A00(context), this);
                    this.A04 = true;
                }
            }
        }
        Log.i("ProcessProviderMigrationInfo/on-receive");
        Bundle resultExtras = getResultExtras(true);
        int resultCode = getResultCode();
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProcessProviderMigrationInfo/on-receive/result-code=");
        A0u.append(resultCode);
        C36321k7.A1Q("/action=", str, A0u);
        if (resultCode == -1 && resultExtras != null && intent != null) {
            boolean z = false;
            if ("com.whatsapp.registration.directmigration.initialMigrationInfoAction".equals(str)) {
                Log.i("ProcessProviderMigrationInfo/received-phone-number");
                C36341k9.A0x(C19420v0.A00(this.A01), "registration_sibling_app_country_code", resultExtras.getString("me_country_code", (String) null));
                C36341k9.A0x(C19420v0.A00(this.A01), "registration_sibling_app_phone_number", resultExtras.getString("phone_number", (String) null));
                C36321k7.A0q(this.A01, "direct_db_migration_timeout_in_secs", resultExtras.getInt("direct_db_migration_timeout_in_secs", VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT));
                boolean z2 = resultExtras.getBoolean("sister_app_content_provider_enabled", false);
                C36331k8.A0w(C19420v0.A00(this.A01), "sister_app_content_provider_is_enabled", z2);
                C36321k7.A1X("ProcessProviderMigrationInfo/sister-app-content-provider-is-enabled = ", AnonymousClass000.A0u(), z2);
                boolean z3 = resultExtras.getBoolean("sister_app_is_auth_protected", false);
                C36331k8.A18(this.A01, "sister_app_is_auth_protected", z3);
                if (z3) {
                    C36341k9.A0w(C19420v0.A00(this.A01), "sister_app_auth_timeout", resultExtras.getLong("sister_app_privacy_auth_timeout", 60000));
                }
                C36321k7.A1X("ProcessProviderMigrationInfo/sister-app-is-auth-protected = ", AnonymousClass000.A0u(), z3);
            } else if ("com.whatsapp.registration.directmigration.recoveryTokenAction".equals(intent.getAction())) {
                Log.i("ProcessProviderMigrationInfo/received-token");
                String string = C36341k9.A0E(this.A01).getString("registration_sibling_app_country_code", (String) null);
                String string2 = C36341k9.A0E(this.A01).getString("registration_sibling_app_phone_number", (String) null);
                String A002 = C55212uG.A00(C36321k7.A0D(string, string2));
                byte[] byteArray = resultExtras.getByteArray("key_recovery_token");
                if (!TextUtils.isEmpty(A002) && byteArray != null) {
                    C18750th.A0E(context, A002, byteArray);
                    z = true;
                }
                byte[] byteArray2 = resultExtras.getByteArray("key_backup_token");
                if (!TextUtils.isEmpty(string2) && byteArray2 != null) {
                    try {
                        C133306Xt.A01(context2, this.A00, this.A01, (C590532l) null, string2, byteArray2, 1);
                    } catch (IOException e) {
                        Log.e("ProcessProviderMigrationInfo/encryptAndSaveToken failed with IOException:", e);
                    }
                    z = true;
                }
                C36321k7.A1X("ProcessProviderMigrationInfo/onReceive/did-receive-token=", AnonymousClass000.A0u(), z);
                if (z) {
                    this.A02.A00.A00 = true;
                }
            }
        }
    }
}
