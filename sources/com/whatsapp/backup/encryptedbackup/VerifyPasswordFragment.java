package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass17Y;
import X.C19700wN;
import X.C36341k9;
import android.content.Intent;
import com.whatsapp.deviceauth.BiometricAuthPlugin;

public class VerifyPasswordFragment extends Hilt_VerifyPasswordFragment {
    public C19700wN A00;
    public AnonymousClass17Y A01;
    public BiometricAuthPlugin A02;

    public static void A00(VerifyPasswordFragment verifyPasswordFragment, int i) {
        EncBackupViewModel encBackupViewModel;
        int i2;
        if (i == -1 || i == 4) {
            verifyPasswordFragment.A03.A0X(6);
            C36341k9.A19(verifyPasswordFragment.A03.A0A, true);
            int A0S = verifyPasswordFragment.A03.A0S();
            if (A0S == 4) {
                C36341k9.A16(verifyPasswordFragment.A03.A03, 302);
                return;
            }
            if (A0S != 5) {
                if (A0S == 7) {
                    encBackupViewModel = verifyPasswordFragment.A03;
                    i2 = 8;
                } else if (A0S == 9) {
                    encBackupViewModel = verifyPasswordFragment.A03;
                    i2 = 10;
                } else {
                    return;
                }
                C36341k9.A16(encBackupViewModel.A09, i2);
            }
            C36341k9.A16(verifyPasswordFragment.A03.A03, 300);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r15, android.view.View r16) {
        /*
            r14 = this;
            r0 = r16
            super.A1S(r15, r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A03
            int r1 = r0.A0S()
            r3 = 7
            r0 = 8
            if (r1 != r0) goto L_0x0017
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A03
            X.00s r0 = r0.A09
            X.C36341k9.A16(r0, r3)
        L_0x0017:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A03
            int r1 = r0.A0S()
            r0 = 10
            r4 = 9
            if (r1 != r0) goto L_0x002a
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A03
            X.00s r0 = r0.A09
            X.C36341k9.A16(r0, r4)
        L_0x002a:
            X.0yC r11 = r14.A06
            X.17Y r8 = r14.A01
            X.0wN r7 = r14.A00
            X.0yb r9 = r14.A04
            X.01I r6 = r14.A0i()
            r12 = 2131889115(0x7f120bdb, float:1.9412884E38)
            r13 = 2131889114(0x7f120bda, float:1.9412882E38)
            r2 = 0
            X.7pb r10 = new X.7pb
            r10.<init>(r14, r2)
            com.whatsapp.deviceauth.BiometricAuthPlugin r5 = new com.whatsapp.deviceauth.BiometricAuthPlugin
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A02 = r5
            int r1 = r14.A00
            r0 = 4
            if (r1 != r0) goto L_0x007a
            android.widget.TextView r1 = r14.A09
            r0 = 2131889201(0x7f120c31, float:1.9413059E38)
            X.C90484aE.A18(r1, r14, r0)
            android.widget.TextView r1 = r14.A08
            r0 = 2131889200(0x7f120c30, float:1.9413057E38)
        L_0x005b:
            X.C90484aE.A18(r1, r14, r0)
        L_0x005e:
            X.72l r0 = new X.72l
            r0.<init>(r14, r2)
            r14.A1b(r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A03
            X.1Ck r0 = r0.A0B
            X.1Ci r0 = r0.A01
            X.5sm r0 = r0.A00()
            if (r0 == 0) goto L_0x009d
            r0 = 1
            r14.A1d(r0)
            r14.A1a()
            return
        L_0x007a:
            r0 = 5
            if (r1 != r0) goto L_0x008b
            android.widget.TextView r1 = r14.A09
            r0 = 2131889201(0x7f120c31, float:1.9413059E38)
            X.C90484aE.A18(r1, r14, r0)
            android.widget.TextView r1 = r14.A08
            r0 = 2131889199(0x7f120c2f, float:1.9413055E38)
            goto L_0x005b
        L_0x008b:
            if (r1 == r3) goto L_0x008f
            if (r1 != r4) goto L_0x005e
        L_0x008f:
            android.widget.TextView r1 = r14.A09
            r0 = 2131889191(0x7f120c27, float:1.9413039E38)
            X.C90484aE.A18(r1, r14, r0)
            android.widget.TextView r1 = r14.A08
            r0 = 2131889190(0x7f120c26, float:1.9413037E38)
            goto L_0x005b
        L_0x009d:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A03
            X.00s r0 = r0.A04
            X.C36341k9.A16(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment.A1S(android.os.Bundle, android.view.View):void");
    }

    public void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        if (i == 12345) {
            A00(this, i2);
        }
    }
}
