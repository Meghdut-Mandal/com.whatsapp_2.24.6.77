package X;

import android.os.Bundle;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.6pX  reason: invalid class name and case insensitive filesystem */
public class C142826pX implements C33151eo {
    public int A00;
    public long A01 = -1;
    public long A02 = -1;
    public final AnonymousClass17Y A03;
    public final C33161ep A04;
    public final SettingsGoogleDriveViewModel A05;
    public final C19600wD A06;
    public final C19420v0 A07;

    public static void A02(C142826pX r3) {
        r3.A04((C109815Zf) null, 2, -1);
    }

    private void A03(C109815Zf r7, int i, int i2) {
        A05(r7, i, i2, true, false);
    }

    private void A04(C109815Zf r7, int i, int i2) {
        A05(r7, i, i2, false, false);
    }

    public static int A00(long j, int i, long j2) {
        if (i > 0) {
            return (int) ((j * 100) / j2);
        }
        return -1;
    }

    private void A01() {
        AnonymousClass17Y r3 = this.A03;
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A05;
        Objects.requireNonNull(settingsGoogleDriveViewModel);
        r3.A0H(new C1497072l(settingsGoogleDriveViewModel, 35));
    }

    private void A05(C109815Zf r7, int i, int i2, boolean z, boolean z2) {
        C001700s r0;
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel;
        if (i != this.A00 && i == 4) {
            Log.i("settings-gdrive/set-message/show-indeterminate");
        }
        this.A00 = i;
        boolean z3 = null;
        if (i == 1) {
            Log.i("settings-gdrive/set-message/show-nothing");
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel2 = this.A05;
            settingsGoogleDriveViewModel2.A07.A0C(false);
            settingsGoogleDriveViewModel2.A0M.A0C(false);
            settingsGoogleDriveViewModel2.A09.A0C(false);
            settingsGoogleDriveViewModel2.A0N.A0C(false);
            settingsGoogleDriveViewModel2.A0B.A0C(false);
            settingsGoogleDriveViewModel2.A06.A0C(false);
            r0 = settingsGoogleDriveViewModel2.A08;
        } else if (i != 2) {
            if (i != 3) {
                C18740tg.A06(r7);
                settingsGoogleDriveViewModel = this.A05;
                z3 = false;
                settingsGoogleDriveViewModel.A07.A0C(false);
                settingsGoogleDriveViewModel.A0N.A0C(false);
                settingsGoogleDriveViewModel.A0M.A0C(true);
                settingsGoogleDriveViewModel.A0K.A0C(true);
                C36341k9.A19(settingsGoogleDriveViewModel.A09, z);
                settingsGoogleDriveViewModel.A06.A0C(true);
                C36321k7.A1K(r7, "settings-gdrive/set-message ", AnonymousClass000.A0u());
                settingsGoogleDriveViewModel.A08.A0C(r7);
            } else {
                C18740tg.A06(r7);
                Log.i("settings-gdrive/set-message/show-determinate");
                settingsGoogleDriveViewModel = this.A05;
                z3 = false;
                settingsGoogleDriveViewModel.A07.A0C(false);
                settingsGoogleDriveViewModel.A0M.A0C(true);
                settingsGoogleDriveViewModel.A0K.A0C(false);
                C36341k9.A19(settingsGoogleDriveViewModel.A09, z);
                settingsGoogleDriveViewModel.A06.A0C(true);
                if (i2 >= 0) {
                    C36341k9.A17(settingsGoogleDriveViewModel.A0L, i2);
                }
                settingsGoogleDriveViewModel.A08.A0C(r7);
                C36341k9.A19(settingsGoogleDriveViewModel.A0N, z2);
            }
            r0 = settingsGoogleDriveViewModel.A0B;
        } else {
            Log.i("settings-gdrive/set-message/show-backup-button");
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel3 = this.A05;
            settingsGoogleDriveViewModel3.A07.A0C(true);
            settingsGoogleDriveViewModel3.A0M.A0C(false);
            settingsGoogleDriveViewModel3.A09.A0C(false);
            settingsGoogleDriveViewModel3.A0N.A0C(false);
            settingsGoogleDriveViewModel3.A0B.A0C(true);
            settingsGoogleDriveViewModel3.A06.A0C(false);
            settingsGoogleDriveViewModel3.A05.A0C(true);
            settingsGoogleDriveViewModel3.A08.A0C((Object) null);
            A01();
            if (r7 != null) {
                throw AnonymousClass001.A08("message should be null when button has to be displayed.");
            }
            return;
        }
        r0.A0C(z3);
    }

    public void BQb(boolean z) {
        Log.e("settings-gdrive-observer/account-deletion-end/unexpected-state");
    }

    public void BRq() {
        Log.i("settings-gdrive-observer/backup-cancelled");
        A02(this);
    }

    public void BRs(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/no-data-connection");
        A03(new C101944yX(8), 3, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BRt(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/low-battery");
        A03(new C101944yX(9), 3, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BRu(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/sdcard-missing");
        A03(new C101944yX(11), 3, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BRv(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/sdcard-unmounted");
        A03(new C101944yX(10), 3, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BRw(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/no-wifi");
        int A002 = A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
        int i = 7;
        if (this.A06.A03(true) == 2) {
            i = 6;
        }
        A03(new C101944yX(i), 3, A002);
    }

    public void BRx(int i) {
        if (i >= 0) {
            C18740tg.A00();
            A03(new C101924yV(i), 4, i);
        }
    }

    public void BRy() {
        Log.i("settings-gdrive-observer/backup-prep-start");
        A03(new C101944yX(5), 4, -1);
    }

    public void BRz(long j, long j2) {
        if (j2 <= 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("settings-gdrive-observer/backup-progress incorrect invocation: ");
            A0u.append(j);
            C36341k9.A1M("/", A0u, j2);
            return;
        }
        long j3 = this.A02;
        int i = (int) ((100 * j) / j2);
        if (((int) ((j3 * 100) / j2)) != i || j != j3) {
            this.A02 = j;
            A03(new C101954yY(j, j2), 3, i);
        }
    }

    public void BS0() {
        Log.i("settings-gdrive-observer/backup-start");
        this.A02 = -1;
        BRx(0);
    }

    public void BWS() {
        C19420v0 r1 = this.A07;
        if (r1.A0N(r1.A0c()) == 2) {
            A01();
        }
    }

    public void BX0(int i, Bundle bundle) {
        if (i != 10) {
            A02(this);
        }
        C36341k9.A17(this.A05.A0D, i);
    }

    public void BX1(int i, Bundle bundle) {
        if (i != 10) {
            A04((C109815Zf) null, 1, -1);
        }
        this.A05.A0E.A0C(new C119015p6(i, bundle));
    }

    public void BX2(int i, Bundle bundle) {
        Log.e("settings-gdrive-observer/msgstore-download-error/unexpected-state");
    }

    public void Bab() {
        Log.i("settings-gdrive-observer/restore-cancelled");
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A05;
        boolean A022 = C224714l.A02();
        C001700s r1 = settingsGoogleDriveViewModel.A0C;
        if (A022) {
            r1.A0D(false);
        } else {
            r1.A0C(false);
        }
        A02(this);
        this.A01 = -1;
        this.A02 = -1;
    }

    public void Bad(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/no-data-connection");
        A04(new C101944yX(1), 3, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void Bae(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/low-battery");
        int A002 = A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
        this.A05.A0c.set(true);
        A05(new C101944yX(2), 3, A002, false, true);
    }

    public void Baf(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/sdcard-missing");
        A04(new C101944yX(4), 3, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void Bag(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/sdcard-unmounted");
        A04(new C101944yX(3), 3, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void Bah(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/no-wifi");
        int A002 = A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
        this.A05.A0c.set(false);
        if (this.A06.A03(true) == 2) {
            Log.i("settings-gdrive-observer/restore-paused/cellular-available");
            A05(new C101944yX(0), 3, A002, false, true);
            return;
        }
        A04(new C101944yX(0), 3, A002);
    }

    public void Bai(int i) {
        if (i >= 0) {
            A04(new C101934yW(i), 4, i);
        }
    }

    public void Baj() {
        Log.i("settings-gdrive-observer/restore-start");
        A04(new C101944yX(13), 4, -1);
    }

    public void Bak(long j, long j2) {
        if (j != this.A01) {
            this.A01 = j;
            A04(new C101964yZ(j, j2), 3, (int) ((j * 100) / j2));
        }
    }

    public void Bb1(boolean z) {
        Log.e("settings-gdrive-observer/msgstore-download-end/unexpected-state");
    }

    public void Bb2(long j, long j2) {
        Log.e("settings-gdrive-observer/msgstore-download-progress/unexpected-state");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("settings-gdrive-observer/msgstore-download-progress/downloaded: ");
        A0u.append(j);
        C36321k7.A1V(" total: ", A0u, j2);
    }

    public void Bb3() {
        Log.e("settings-gdrive-observer/msgstore-download-start/unexpected-state");
    }

    public void Bfx() {
        Log.i("settings-gdrive-observer/post-backup-scrub-start");
        A03(new C101944yX(12), 4, -1);
    }

    public C142826pX(AnonymousClass17Y r3, C33161ep r4, SettingsGoogleDriveViewModel settingsGoogleDriveViewModel, C19600wD r6, C19420v0 r7) {
        this.A03 = r3;
        this.A07 = r7;
        this.A06 = r6;
        this.A04 = r4;
        this.A05 = settingsGoogleDriveViewModel;
    }

    public void BRr(boolean z) {
        C36321k7.A1X("settings-gdrive-observer/backup-end ", AnonymousClass000.A0u(), z);
        A02(this);
        if (z && this.A05.A0d.get()) {
            this.A04.A04();
        }
    }

    public void Bac(long j, boolean z) {
        C36321k7.A1X("settings-gdrive-observer/restore-end ", AnonymousClass000.A0u(), z);
        A02(this);
        this.A01 = -1;
        this.A02 = -1;
        if (z && this.A05.A0d.get()) {
            this.A04.A04();
        }
    }

    public void Bjt() {
        A01();
    }
}
