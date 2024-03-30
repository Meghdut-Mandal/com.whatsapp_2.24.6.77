package X;

import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.7sI  reason: invalid class name and case insensitive filesystem */
public class C164737sI implements C159187ix {
    public Object A00;
    public final int A01;

    public C164737sI(EncBackupViewModel encBackupViewModel, int i) {
        this.A01 = i;
        this.A00 = encBackupViewModel;
    }

    public void BWr(String str, int i, int i2, int i3, int i4) {
        String str2;
        C001700s r3;
        int i5;
        int i6;
        if (this.A01 != 0) {
            EncBackupViewModel encBackupViewModel = (EncBackupViewModel) this.A00;
            if (i == 0) {
                Log.i("encb/EncBackupViewModel/successfully saved encryption key");
                C36341k9.A17(encBackupViewModel.A07, -1);
                return;
            }
            Log.e("encb/EncBackupViewModel/failed to save encryption key");
            return;
        }
        EncBackupViewModel encBackupViewModel2 = (EncBackupViewModel) this.A00;
        if (i == 0) {
            Log.i("encb/EncBackupViewModel/successfully retrieved and saved backup key");
            C36341k9.A17(encBackupViewModel2.A04, 3);
            r3 = encBackupViewModel2.A07;
            i6 = -1;
        } else if (i == 404) {
            Log.i("encb/EncBackupViewModel/account not found");
            r3 = encBackupViewModel2.A04;
            i6 = 7;
        } else if (i == 8) {
            Log.i("encb/EncBackupViewModel/invalid password");
            C36341k9.A17(encBackupViewModel2.A06, i3);
            if (i4 > 0) {
                long j = ((long) i4) * 1000;
                encBackupViewModel2.A0Y(4);
                encBackupViewModel2.A08.A0C(Long.valueOf(j));
                C162367oT r0 = new C162367oT(encBackupViewModel2, j);
                encBackupViewModel2.A00 = r0;
                r0.start();
            }
            r3 = encBackupViewModel2.A04;
            i6 = 5;
        } else {
            if (i == 408) {
                Log.i("encb/EncBackupViewModel/request timeout");
                if (i4 > 0) {
                    long j2 = ((long) i4) * 1000;
                    encBackupViewModel2.A0Y(4);
                    encBackupViewModel2.A08.A0C(Long.valueOf(j2));
                    C162367oT r02 = new C162367oT(encBackupViewModel2, j2);
                    encBackupViewModel2.A00 = r02;
                    r02.start();
                    r3 = encBackupViewModel2.A04;
                    i6 = 6;
                } else {
                    str2 = "encb/EncBackupViewModel/request timeout returned from server without timeout value";
                }
            } else if (i == 3) {
                Log.e("encb/EncBackupViewModel/failed to retrieve and save backup key due to a connection error");
                r3 = encBackupViewModel2.A04;
                i5 = 8;
                r3.A0C(i5);
            } else {
                str2 = "encb/EncBackupViewModel/failed to retrieve and save backup key due to a server error";
            }
            Log.e(str2);
            r3 = encBackupViewModel2.A04;
            i5 = 4;
            r3.A0C(i5);
        }
        i5 = Integer.valueOf(i6);
        r3.A0C(i5);
    }
}
