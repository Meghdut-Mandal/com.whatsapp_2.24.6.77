package X;

import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.73P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73P implements Runnable {
    public final /* synthetic */ C159187ix A00;
    public final /* synthetic */ C24431Ck A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ byte[] A04;

    public /* synthetic */ AnonymousClass73P(C159187ix r1, C24431Ck r2, String str, byte[] bArr, boolean z) {
        this.A01 = r2;
        this.A04 = bArr;
        this.A03 = z;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void run() {
        C001700s r1;
        C24431Ck r4 = this.A01;
        byte[] bArr = this.A04;
        boolean z = this.A03;
        String str = this.A02;
        C159187ix r5 = this.A00;
        try {
            r4.A01.A02(bArr);
            C19420v0 r12 = r4.A03;
            r12.A1z(true);
            r12.A20(z);
            if (!z && str != null) {
                r4.A03(str);
            }
            C164737sI r13 = (C164737sI) r5;
            if (r13.A01 != 0) {
                Log.i("encb/EncBackupViewModel/successfully saved encryption key");
                r1 = ((EncBackupViewModel) r13.A00).A07;
            } else {
                EncBackupViewModel encBackupViewModel = (EncBackupViewModel) r13.A00;
                Log.i("encb/EncBackupViewModel/successfully retrieved and saved backup key");
                C36341k9.A17(encBackupViewModel.A04, 3);
                r1 = encBackupViewModel.A07;
            }
            C36341k9.A17(r1, -1);
        } catch (IOException unused) {
            r5.BWr("Failed to store root key", 6, 4, -1, -1);
        }
    }
}
