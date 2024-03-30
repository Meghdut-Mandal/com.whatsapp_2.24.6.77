package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: X.6cp  reason: invalid class name and case insensitive filesystem */
public class C135516cp implements View.OnClickListener {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    public C135516cp(Object obj, int i, boolean z, boolean z2) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = z;
        this.A02 = z2;
    }

    public final void onClick(View view) {
        String str;
        int i;
        if (this.A03 != 0) {
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = (VoipCallControlBottomSheetV2) this.A00;
            boolean z = this.A01;
            boolean z2 = this.A02;
            if (z) {
                i = 3;
            } else {
                i = 0;
                if (z2) {
                    i = 2;
                }
            }
            VoipCallControlBottomSheetV2.A0B(voipCallControlBottomSheetV2, i);
            return;
        }
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
        boolean z3 = this.A01;
        boolean z4 = this.A02;
        AnonymousClass3TX r2 = restoreFromBackupActivity.A0a;
        if (z3) {
            str = "restore_successful";
        } else {
            str = "restore_unsuccessful";
        }
        r2.A08(str, "next");
        if (!z4) {
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/no media to restore");
            C19420v0 r1 = restoreFromBackupActivity.A09;
            Executor executor = AnonymousClass6Y6.A00;
            r1.A1A(0);
            restoreFromBackupActivity.A09.A0q();
        } else if (restoreFromBackupActivity.A07.A03(true) != 1) {
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/Wi-Fi not available, show dialog to restore on cellular.");
            AnonymousClass3L4 r12 = new AnonymousClass3L4(12);
            C90484aE.A12(restoreFromBackupActivity, r12, R.string.f12nameremoved);
            r12.A02(false);
            C90484aE.A11(restoreFromBackupActivity, r12, R.string.f12nameremoved);
            C36331k8.A12(C90474aD.A0S(restoreFromBackupActivity, r12, R.string.f12nameremoved), restoreFromBackupActivity);
            return;
        } else {
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/Wi-Fi available, starting media restore.");
            Log.i("restore>RestoreFromBackupActivity/start to restore media");
            C111795cr.A01(restoreFromBackupActivity, AnonymousClass190.A14(restoreFromBackupActivity, "action_restore_media"));
        }
        Iterator A0q = C90474aD.A0q(restoreFromBackupActivity.A0d);
        while (A0q.hasNext()) {
            AnonymousClass1CP r0 = (AnonymousClass1CP) A0q.next();
            String A0J = r0.A0J();
            try {
                r0.A0F();
            } catch (Exception e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("restore>RestoreFromBackupActivity/failed on post restore ");
                C36351kA.A1P(A0J, A0u, e);
            }
        }
        Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
        restoreFromBackupActivity.setResult(3);
        restoreFromBackupActivity.finish();
    }
}
