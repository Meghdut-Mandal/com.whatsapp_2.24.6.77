package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass04R;
import X.AnonymousClass14B;
import X.AnonymousClass164;
import X.AnonymousClass19A;
import X.AnonymousClass2NP;
import X.AnonymousClass2OO;
import X.AnonymousClass673;
import X.AnonymousClass73P;
import X.AnonymousClass751;
import X.C000100b;
import X.C001700s;
import X.C101514xp;
import X.C116535kk;
import X.C164737sI;
import X.C18740tg;
import X.C19420v0;
import X.C19770wU;
import X.C21010yW;
import X.C21060yb;
import X.C24431Ck;
import X.C29501Ww;
import X.C35671j4;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C90524aI;
import android.os.CountDownTimer;
import com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.whatsapp.util.Log;

public class EncBackupViewModel extends AnonymousClass04R {
    public CountDownTimer A00;
    public final C001700s A01 = C36441kJ.A0Z(false);
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final C001700s A04 = C36441kJ.A0Z(C36361kB.A0i());
    public final C001700s A05 = C36431kI.A0S();
    public final C001700s A06 = C36441kJ.A0Z(0);
    public final C001700s A07 = C36431kI.A0S();
    public final C001700s A08 = C36441kJ.A0Z(C36411kG.A0t());
    public final C001700s A09 = C36431kI.A0S();
    public final C001700s A0A = C36441kJ.A0Z(false);
    public final C24431Ck A0B;
    public final C21060yb A0C;
    public final C19420v0 A0D;
    public final AnonymousClass19A A0E;
    public final C29501Ww A0F;
    public final C19770wU A0G;
    public final C21010yW A0H;

    public static void A01(EncBackupViewModel encBackupViewModel, int i) {
        C001700s r1;
        int i2;
        if (i == 0) {
            C36341k9.A17(encBackupViewModel.A04, 3);
            if (encBackupViewModel.A0S() == 1) {
                Log.i("encb/EncBackupViewModel/enabled encrypted backup");
                encBackupViewModel.A0W(5);
                r1 = encBackupViewModel.A07;
                i2 = -1;
            } else {
                Log.i("encb/EncBackupViewModel/successfully re-registered with the hsm");
                r1 = encBackupViewModel.A03;
                i2 = 502;
            }
        } else if (i == 3) {
            Log.e("encb/EncBackupViewModel/failed to enable encrypted backup due to a connection error");
            r1 = encBackupViewModel.A04;
            i2 = 8;
        } else {
            Log.e("encb/EncBackupViewModel/failed to enable encrypted backup due to a server error");
            r1 = encBackupViewModel.A04;
            i2 = 4;
        }
        C36341k9.A17(r1, i2);
    }

    public int A0S() {
        return AnonymousClass000.A0I(C90524aI.A0c(this.A09));
    }

    public void A0T() {
        C24431Ck r3 = this.A0B;
        r3.A06.Boy(new C35671j4(r3, 5));
        if (!r3.A03.A2J()) {
            AnonymousClass164 r2 = r3.A00;
            AnonymousClass673 r1 = new AnonymousClass673();
            r1.A00 = "DeleteAccountFromHsmServerJob";
            AnonymousClass673.A00(r1);
            r2.A01(new DeleteAccountFromHsmServerJob(r1.A01()));
        }
        Log.i("encb/EncBackupViewModel//encrypted backup disabled");
        C36341k9.A16(this.A03, 402);
    }

    public void A0U() {
        C001700s r1 = this.A01;
        if (r1.A04() == null || !C36351kA.A1W(r1)) {
            C36341k9.A17(this.A04, 2);
            C24431Ck r12 = this.A0B;
            C116535kk r2 = new C116535kk(this);
            C000100b r7 = r12.A07;
            C19770wU r6 = r12.A06;
            new C101514xp(r12, r2, r12.A03, r12.A04, r12.A05, r6, r7, (String) C90524aI.A0c(this.A05)).A02();
            return;
        }
        C19420v0 r13 = this.A0B.A03;
        r13.A1z(true);
        r13.A20(true);
        A0W(5);
        C36341k9.A17(this.A07, -1);
    }

    public void A0V() {
        String str = (String) this.A02.A04();
        if (str == null) {
            return;
        }
        if (A0S() == 2) {
            C24431Ck r5 = this.A0B;
            C164737sI r4 = new C164737sI(this, 1);
            C18740tg.A0B(AnonymousClass000.A1S(str.length(), 64));
            r5.A06.Boy(new AnonymousClass73P(r4, r5, (String) null, AnonymousClass14B.A0H(str), true));
            return;
        }
        C36341k9.A16(this.A04, 2);
        this.A0G.Boy(new AnonymousClass751(12, str, this));
    }

    public void A0W(int i) {
        AnonymousClass2OO r1 = new AnonymousClass2OO();
        r1.A00 = Integer.valueOf(i);
        this.A0H.Bly(r1);
    }

    public void A0X(int i) {
        AnonymousClass2OO r1 = new AnonymousClass2OO();
        r1.A01 = Integer.valueOf(i);
        this.A0H.Bly(r1);
    }

    public void A0Y(int i) {
        AnonymousClass2NP r1 = new AnonymousClass2NP();
        r1.A00 = Integer.valueOf(i);
        this.A0H.Bly(r1);
    }

    public void A0Z(boolean z) {
        C001700s r1;
        int i;
        if (z) {
            Log.i("encb/EncBackupViewModel/successfully verified encryption key");
            C36331k8.A13(this.A0A);
            C36341k9.A17(this.A04, 3);
            A0X(4);
            if (A0S() == 4) {
                r1 = this.A03;
                i = 302;
            } else if (A0S() == 6) {
                r1 = this.A03;
                i = 300;
            } else {
                return;
            }
        } else {
            Log.i("encb/EncBackupViewModel/invalid encryption key");
            r1 = this.A04;
            i = 5;
        }
        C36341k9.A17(r1, i);
    }

    public boolean A0a() {
        return AnonymousClass000.A1X(C90524aI.A0c(this.A0A));
    }

    public EncBackupViewModel(C24431Ck r3, C21060yb r4, C19420v0 r5, C21010yW r6, AnonymousClass19A r7, C29501Ww r8, C19770wU r9) {
        this.A0G = r9;
        this.A0H = r6;
        this.A0E = r7;
        this.A0C = r4;
        this.A0B = r3;
        this.A0F = r8;
        this.A0D = r5;
    }
}
