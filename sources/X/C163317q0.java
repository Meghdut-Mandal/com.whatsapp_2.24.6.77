package X;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.profile.WebImagePicker;
import com.whatsapp.util.Log;
import com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity;

/* renamed from: X.7q0  reason: invalid class name and case insensitive filesystem */
public class C163317q0 implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public C163317q0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                Log.i("restore>RestoreFromBackupActivity/google-play-services-unavailable/user declined to install Google Play Services.");
                ((RestoreFromBackupActivity) this.A00).A0q.open();
                return;
            case 1:
                Log.w("restore>RestoreFromBackupActivity/google-play-services-error-dialog/user declined to install Google Play Services.");
                RestoreFromBackupActivity.A0i((RestoreFromBackupActivity) this.A00, true);
                return;
            case 2:
                ((AnonymousClass6V2) this.A00).A03();
                return;
            case 3:
                ((AnonymousClass51F) this.A00).A3i();
                return;
            case 4:
                C132656Ur r2 = (C132656Ur) this.A00;
                C132656Ur.A02(r2);
                C144506sM r0 = r2.A01;
                if (r0 != null) {
                    r0.A02.A0D(true);
                }
                C144506sM r1 = r2.A01;
                if (r1 != null) {
                    r1.A00 = null;
                    return;
                }
                return;
            case 5:
                C133586Zc r22 = (C133586Zc) this.A00;
                if (r22.A0R == C108135Sh.LIVE_LOCATION_MODE) {
                    C133586Zc.A08(r22);
                    return;
                }
                return;
            case 6:
                C107105Mo r3 = (C107105Mo) this.A00;
                ProgressDialog progressDialog = r3.A00;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                r3.A00 = null;
                r3.A0D(true);
                WebImagePicker webImagePicker = r3.A02;
                if (webImagePicker.A0B == r3) {
                    webImagePicker.A0B = null;
                    return;
                }
                return;
            default:
                ((ShareToFacebookActivity) this.A00).A3i().A04("TAP_UNLINK_CANCEL");
                return;
        }
    }
}
