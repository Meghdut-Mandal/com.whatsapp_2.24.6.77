package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.3d8  reason: invalid class name and case insensitive filesystem */
public abstract class C69193d8 implements C33151eo {
    public static void A02(AnonymousClass02E r5, AnonymousClass29Q r6, String str, int i) {
        AnonymousClass29Q.A00(r6, r5.A0n(R.string.f12nameremoved), str, 3, i, false);
    }

    public void BRq() {
    }

    public void BRr(boolean z) {
    }

    public void BRs(long j, long j2) {
    }

    public void BRt(long j, long j2) {
    }

    public void BRu(long j, long j2) {
    }

    public void BRv(long j, long j2) {
    }

    public void BRw(long j, long j2) {
    }

    public void BRx(int i) {
    }

    public void BRy() {
    }

    public void BRz(long j, long j2) {
    }

    public void BS0() {
    }

    public void BWS() {
    }

    public void BX0(int i, Bundle bundle) {
    }

    public void Bfx() {
    }

    public void Bjt() {
    }

    public static int A01(long j, int i, long j2) {
        if (i > 0) {
            return (int) ((j * 100) / j2);
        }
        return -1;
    }

    public void BQb(boolean z) {
        String str;
        String str2;
        if (this instanceof AnonymousClass29N) {
            AnonymousClass29N r2 = (AnonymousClass29N) this;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("settings-gdrive/gdrive-backup-deletion-finished/");
            if (z) {
                str2 = "success";
            } else {
                str2 = "failed";
            }
            C36321k7.A1a(A0u, str2);
            SettingsGoogleDrive settingsGoogleDrive = r2.A00;
            ((AnonymousClass6VR) settingsGoogleDrive.A0o.get()).A0B("com.whatsapp.backup.google.google-encrypted-re-upload-worker");
            AnonymousClass6YO.A0D(settingsGoogleDrive.A06);
            settingsGoogleDrive.A05.A0H(new C1497072l(settingsGoogleDrive, 26));
        } else if (this instanceof AnonymousClass29O) {
            AnonymousClass29O r22 = (AnonymousClass29O) this;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("deleteacctconfirm/gdrive-observer/deletion-finished/");
            if (z) {
                str = "success";
            } else {
                str = "failed";
            }
            C36321k7.A1a(A0u2, str);
            r22.A01.open();
        }
    }

    public void BX1(int i, Bundle bundle) {
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r3 = (AnonymousClass29Q) this;
            ConversationsFragment conversationsFragment = r3.A04;
            if (conversationsFragment.A12()) {
                r3.A00 = 2;
                if (i != 10) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("conversations-gdrive-observer/error-during-restore/");
                    C36321k7.A1a(A0u, C34191gb.A02(i));
                    AnonymousClass29Q.A00(r3, conversationsFragment.A0n(R.string.f12nameremoved), conversationsFragment.A0n(R.string.f12nameremoved), 1, 0, false);
                    conversationsFragment.A0o.A04();
                }
            }
        }
    }

    public void BX2(int i, Bundle bundle) {
        if (this instanceof AnonymousClass29P) {
            AnonymousClass29P r3 = (AnonymousClass29P) this;
            if (i != 10) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("restore>RestoreFromBackupActivity/observer/error during msgstore download: ");
                C36321k7.A1a(A0u, C34191gb.A02(i));
            }
            r3.A01.A05.A0H(new C81333wq(r3, i, 10, bundle));
        }
    }

    public void Bab() {
        AnonymousClass01I A0h;
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r3 = (AnonymousClass29Q) this;
            Log.i("conversations-gdrive-observer/restore-cancelled");
            ConversationsFragment conversationsFragment = r3.A04;
            if (conversationsFragment.A12() && (A0h = conversationsFragment.A0h()) != null && !A0h.isFinishing()) {
                C81193wc.A00(conversationsFragment.A0d, r3, A0h, 6);
            }
        }
    }

    public void Bac(long j, boolean z) {
        AnonymousClass01I A0h;
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r6 = (AnonymousClass29Q) this;
            C36321k7.A1X("conversations-gdrive-observer/restore-end ", AnonymousClass000.A0u(), z);
            ConversationsFragment conversationsFragment = r6.A04;
            if (conversationsFragment.A12() && (A0h = conversationsFragment.A0h()) != null) {
                r6.A00 = 8;
                r6.A01 = -1;
                String A0v = C36391kE.A0v(A0h, AnonymousClass3TF.A03(conversationsFragment.A1i, j), AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i > 0) {
                    AnonymousClass29Q.A00(r6, A0h.getString(R.string.f12nameremoved), A0v, 3, 100, false);
                } else if (i == 0) {
                    Log.i("conversations-gdrive-observer/restore-end/nothing-to-restore");
                    if (!A0h.isFinishing()) {
                        C81193wc.A00(conversationsFragment.A0d, r6, A0h, 7);
                    }
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("conversations-gdrive-observer/restore-end restored: ");
                    A0u.append(j);
                    Log.e(C36371kC.A0z(" result: ", A0u, z));
                }
            }
        }
    }

    public void Bad(long j, long j2) {
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r5 = (AnonymousClass29Q) this;
            Log.i("conversations-gdrive-observer/restore-paused/no-data-connection");
            ConversationsFragment conversationsFragment = r5.A04;
            if (conversationsFragment.A12()) {
                r5.A00 = 4;
                A02(conversationsFragment, r5, conversationsFragment.A0n(R.string.f12nameremoved), A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
        }
    }

    public void Bae(long j, long j2) {
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r5 = (AnonymousClass29Q) this;
            Log.i("conversations-gdrive-observer/restore-paused/low-battery");
            ConversationsFragment conversationsFragment = r5.A04;
            if (conversationsFragment.A12()) {
                r5.A00 = 5;
                A02(conversationsFragment, r5, conversationsFragment.A0n(R.string.f12nameremoved), A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
        }
    }

    public void Baf(long j, long j2) {
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r4 = (AnonymousClass29Q) this;
            Log.i("conversations-gdrive-observer/restore-paused/sdcard-missing");
            ConversationsFragment conversationsFragment = r4.A04;
            if (conversationsFragment.A12()) {
                r4.A00 = 7;
                AnonymousClass29Q.A00(r4, conversationsFragment.A0n(R.string.f12nameremoved), conversationsFragment.A0n(R.string.f12nameremoved), 4, A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2), false);
            }
        }
    }

    public void Bag(long j, long j2) {
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r5 = (AnonymousClass29Q) this;
            Log.i("conversations-gdrive-observer/restore-paused/sdcard-unmounted");
            ConversationsFragment conversationsFragment = r5.A04;
            if (conversationsFragment.A12()) {
                r5.A00 = 6;
                A02(conversationsFragment, r5, conversationsFragment.A0n(R.string.f12nameremoved), A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
        }
    }

    public void Bah(long j, long j2) {
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r5 = (AnonymousClass29Q) this;
            Log.i("conversations-gdrive-observer/restore-paused/no-wifi");
            ConversationsFragment conversationsFragment = r5.A04;
            if (conversationsFragment.A12()) {
                r5.A00 = 3;
                A02(conversationsFragment, r5, conversationsFragment.A0n(R.string.f12nameremoved), A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
        }
    }

    public void Bai(int i) {
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r5 = (AnonymousClass29Q) this;
            ConversationsFragment conversationsFragment = r5.A04;
            if (conversationsFragment.A12()) {
                int i2 = i;
                if (i > 0) {
                    r5.A00 = 10;
                    String A0n = conversationsFragment.A0n(R.string.f12nameremoved);
                    Object[] A0L = AnonymousClass001.A0L();
                    C36371kC.A1M(conversationsFragment.A1i, A0L, i, 0);
                    AnonymousClass29Q.A00(r5, A0n, conversationsFragment.A0o(R.string.f12nameremoved, A0L), 4, i2, true);
                }
            }
        }
    }

    public void Baj() {
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r2 = (AnonymousClass29Q) this;
            Log.i("conversations-gdrive-observer/restore-start");
            ConversationsFragment conversationsFragment = r2.A04;
            if (conversationsFragment.A12()) {
                r2.A00 = 9;
                AnonymousClass29Q.A00(r2, conversationsFragment.A0n(R.string.f12nameremoved), conversationsFragment.A0n(R.string.f12nameremoved), 4, -1, true);
            }
        }
    }

    public void Bak(long j, long j2) {
        long j3 = j;
        if (this instanceof AnonymousClass29Q) {
            AnonymousClass29Q r13 = (AnonymousClass29Q) this;
            ConversationsFragment conversationsFragment = r13.A04;
            if (conversationsFragment.A12() && conversationsFragment.A0h() != null) {
                String A03 = AnonymousClass3TF.A03(conversationsFragment.A1i, j3);
                if (r13.A00 != 1 || !A03.equals(AnonymousClass3TF.A03(conversationsFragment.A1i, r13.A01))) {
                    r13.A01 = j3;
                    String A0n = conversationsFragment.A0n(R.string.f12nameremoved);
                    Object[] A1Z = C36431kI.A1Z(A03, 3);
                    long j4 = j2;
                    A1Z[1] = AnonymousClass3TF.A03(conversationsFragment.A1i, j4);
                    AnonymousClass29Q.A00(r13, A0n, C36401kF.A0q(conversationsFragment, conversationsFragment.A1i.A0N().format(((double) j3) / ((double) j4)), A1Z, 2, R.string.f12nameremoved), 3, (int) ((j * 100) / j2), true);
                    r13.A00 = 1;
                }
            }
        }
    }

    public void Bb1(boolean z) {
        if (this instanceof AnonymousClass29P) {
            AnonymousClass29P r4 = (AnonymousClass29P) this;
            RestoreFromBackupActivity restoreFromBackupActivity = r4.A01;
            int A0E = restoreFromBackupActivity.A09.A0E();
            if (z) {
                Log.i("restore>RestoreFromBackupActivity/observer/msgstore download successful");
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("restore>RestoreFromBackupActivity/observer/msgstore download failed with ");
                C36321k7.A1Z(A0u, C34191gb.A02(A0E));
            }
            if (A0E == 10) {
                restoreFromBackupActivity.A05.A0H(new AnonymousClass75B(10, (Object) r4, z));
            }
        }
    }

    public void Bb2(long j, long j2) {
        if (this instanceof AnonymousClass29P) {
            AnonymousClass29P r2 = (AnonymousClass29P) this;
            long j3 = j;
            long j4 = j2;
            int i = (int) ((100 * j) / j2);
            if (i - r2.A00 > 0) {
                r2.A00 = i;
                if (i % 10 == 0) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("restore>RestoreFromBackupActivity/observer/msgstore download progress:");
                    A0u.append(j);
                    A0u.append("/");
                    A0u.append(j2);
                    C36421kH.A1N(A0u);
                    A0u.append(i);
                    C36321k7.A1a(A0u, "%");
                }
                r2.A01.A05.A0H(new C80493vU(r2, i, 1, j3, j4));
            }
        }
    }

    public void Bb3() {
        if (this instanceof AnonymousClass29P) {
            AnonymousClass29P r3 = (AnonymousClass29P) this;
            r3.A01.A05.A0H(new C1497072l(r3, 22));
        }
    }
}
