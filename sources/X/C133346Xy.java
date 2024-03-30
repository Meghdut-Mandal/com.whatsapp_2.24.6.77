package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Xy  reason: invalid class name and case insensitive filesystem */
public final class C133346Xy {
    public final C19630wG A00;
    public final AnonymousClass11g A01;
    public final AnonymousClass12S A02;
    public final C20840yF A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass7JV(this));
    public final AnonymousClass00T A05 = C36431kI.A1I(AnonymousClass7Q0.A00);
    public final AnonymousClass00T A06 = C36431kI.A1I(new AnonymousClass7JW(this));
    public final C131086Nr A07;
    public final C229516p A08;
    public final AnonymousClass171 A09;
    public final C19970wo A0A;

    public static final File A00(C133346Xy r3, String str) {
        String A0q;
        AnonymousClass00T r1 = r3.A06;
        if (!C90474aD.A1Y(r1)) {
            A0q = "AccountSwitchingFileManager/getInactiveAccountDatabasesDir/staging dir does not exist";
        } else {
            File A0L = C90464aC.A0L(str, r1);
            if (A0L.exists()) {
                return C90524aI.A0T(A0L.getAbsolutePath(), "databases");
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            C90464aC.A1H("AccountSwitchingFileManager/getInactiveAccountDatabasesDir/account ", str, A0u);
            C36321k7.A1a(A0u, " dir does not exist");
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("AccountSwitchingFileManager/getInactiveAccountDatabasesDir/stagingDirLogString/");
            A0q = AnonymousClass000.A0q(AnonymousClass3LV.A00(r3), A0u2);
        }
        Log.i(A0q);
        return null;
    }

    private final void A03(RandomAccessFile randomAccessFile, String str, String str2) {
        boolean renameTo;
        boolean renameTo2;
        Iterator A13 = C90514aH.A13(this.A05.getValue());
        while (A13.hasNext()) {
            String A0C = AnonymousClass001.A0C(A13);
            boolean A072 = A07(str2, A0C);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("AccountSwitchingFileManager/moveDirectories/delete ");
            A0u.append(str2);
            A0u.append('/');
            A0u.append(A0C);
            C36321k7.A1X(" directory: ", A0u, A072);
            C36321k7.A11(A0C, str, str2);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("moving:");
            A0u2.append(A0C);
            A0u2.append(":from:");
            A0u2.append(str);
            String A0p = AnonymousClass000.A0p(":to:", str2, A0u2);
            randomAccessFile.writeBytes(A0p);
            C36321k7.A1Q("AccountSwitchingRecoveryManager/recordPreFileMoving/recorded: ", A0p, AnonymousClass000.A0u());
            File A0T = C90524aI.A0T(str, A0C);
            if (!A0T.exists()) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("AccountSwitchingFileManager/moveToDir/");
                A0u3.append(A0C);
                C36321k7.A1P(" doesn't exist in ", str, A0u3);
                renameTo = false;
            } else {
                renameTo = A0T.renameTo(C90524aI.A0T(str2, A0C));
            }
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append("AccountSwitchingFileManager/moveDirectories/move ");
            A0u4.append(A0C);
            A0u4.append(" from ");
            A0u4.append(str);
            A0u4.append(" to ");
            A0u4.append(str2);
            C36321k7.A1X(": ", A0u4, renameTo);
            if (!renameTo) {
                StringBuilder A0u5 = AnonymousClass000.A0u();
                C36321k7.A1O("AccountSwitchingFileManager/moveDirectories/failed to move ", A0C, " from ", str, A0u5);
                A0u5.append(" to ");
                A0u5.append(str2);
                C36321k7.A1Z(A0u5, ". Trying again after delay");
                SystemClock.sleep(50);
                boolean A073 = A07(str2, A0C);
                StringBuilder A0u6 = AnonymousClass000.A0u();
                C90464aC.A1J("AccountSwitchingFileManager/moveDirectories/retry delete ", str2, A0u6, '/');
                A0u6.append(A0C);
                C36321k7.A1X(" directory: ", A0u6, A073);
                File A0T2 = C90524aI.A0T(str, A0C);
                if (!A0T2.exists()) {
                    StringBuilder A0u7 = AnonymousClass000.A0u();
                    A0u7.append("AccountSwitchingFileManager/moveToDir/");
                    A0u7.append(A0C);
                    C36321k7.A1P(" doesn't exist in ", str, A0u7);
                    renameTo2 = false;
                } else {
                    renameTo2 = A0T2.renameTo(C90524aI.A0T(str2, A0C));
                }
                StringBuilder A0u8 = AnonymousClass000.A0u();
                C36321k7.A1O("AccountSwitchingFileManager/moveDirectories/retry move ", A0C, " from ", str, A0u8);
                A0u8.append(" to ");
                A0u8.append(str2);
                C36321k7.A1X(": ", A0u8, renameTo2);
                if (!renameTo2) {
                    StringBuilder A0u9 = AnonymousClass000.A0u();
                    C36321k7.A1O("Failed to move ", A0C, " from ", str, A0u9);
                    A0u9.append(" to ");
                    throw AnonymousClass000.A0g(str2, A0u9);
                }
            }
            StringBuilder A0u10 = AnonymousClass000.A0u();
            C36321k7.A1O("moved:", A0C, ":from:", str, A0u10);
            A0u10.append(":to:");
            A0u10.append(str2);
            String A0t = AnonymousClass000.A0t(A0u10, 10);
            long length = randomAccessFile.length() - 1;
            while (length > 0) {
                randomAccessFile.seek(length);
                if (randomAccessFile.readByte() == 10) {
                    break;
                }
                length--;
            }
            long j = 0;
            if (length != 0) {
                j = 1 + length;
            }
            randomAccessFile.seek(j);
            randomAccessFile.writeBytes(A0t);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            C36321k7.A1Q("AccountSwitchingRecoveryManager/recordPostFileMoving/recorded: ", A0t, AnonymousClass000.A0u());
        }
    }

    public static final boolean A05(C133346Xy r7, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1a(A0u, C90524aI.A0g("AccountSwitchingFileManager/copySharedPrefFileFromStaging/", str, A0u));
        AnonymousClass00T r1 = r7.A06;
        if (C90474aD.A1Y(r1)) {
            File A0L = C90464aC.A0L(str, r1);
            if (A0L.exists()) {
                File A0T = C90524aI.A0T(A0L.getAbsolutePath(), "shared_prefs");
                if (!A0T.exists()) {
                    C90464aC.A13(r7, "AccountSwitchingFileManager/copySharedPrefFileFromStaging/stagingDirLogString/", AnonymousClass000.A0u());
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C90464aC.A1H("AccountSwitchingFileManager/copySharedPrefFileFromStaging/shared prefs for ", str, A0u2);
                    C36321k7.A1Z(A0u2, " does not exist");
                    return false;
                }
                File A0T2 = C90524aI.A0T(A0T.getAbsolutePath(), "com.google.android.gms.appid.xml");
                if (!A0T2.exists()) {
                    StringBuilder A0k = C36331k8.A0k("AccountSwitchingFileManager/copySharedPrefFileFromStaging/", "com.google.android.gms.appid.xml");
                    C90464aC.A1H(" file for ", str, A0k);
                    C36321k7.A1Z(A0k, " doesn't exist");
                    return false;
                }
                File A0T3 = C90524aI.A0T(C36431kI.A1E(r7.A04), "shared_prefs");
                if (A0T3.exists() || A0T3.mkdirs()) {
                    AnonymousClass6YY.A0O(r7.A03, A0T2, C36441kJ.A0w(A0T3, "com.google.android.gms.appid.xml"));
                    return true;
                }
                throw AnonymousClass001.A09("Unable to create shared_prefs directory");
            }
            C90464aC.A13(r7, "AccountSwitchingFileManager/copySharedPrefFileFromStaging/stagingDirLogString/", AnonymousClass000.A0u());
            StringBuilder A0u3 = AnonymousClass000.A0u();
            C90464aC.A1H("Account ", str, A0u3);
            throw AnonymousClass000.A0g(" directory does not exist", A0u3);
        }
        throw AnonymousClass001.A09("Staging Directory don't exist");
    }

    public final AnonymousClass141 A09(AnonymousClass3KU r10, Jid jid) {
        Cursor A092;
        String str = r10.A08;
        File A002 = A00(this, str);
        if (A002 == null || !A002.exists()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C90464aC.A1H("getContactFromInactiveAccount/account ", str, A0u);
            C36321k7.A1Z(A0u, " databases dir does not exist");
            C90464aC.A13(this, "AccountSwitchingFileManager/getContactFromInactiveAccount/stagingDirLogString/", AnonymousClass000.A0u());
            return null;
        }
        File A0T = C90524aI.A0T(A002.getAbsolutePath(), "wa.db");
        C229516p r8 = this.A08;
        AnonymousClass12S r2 = this.A02;
        AnonymousClass11g r1 = this.A01;
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(A0T.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 0);
            try {
                A092 = C224014d.A01(openDatabase, r1, r2, "wa.db").A09(AnonymousClass2x7.A04, "CONTACTS_FOR_INACTIVE_ACCOUNT", C90504aG.A1b(jid));
                AnonymousClass141 r12 = null;
                while (A092.moveToNext()) {
                    r12 = C229516p.A06(C53712rl.A00(A092), r12);
                }
                A092.close();
                if (openDatabase != null) {
                    openDatabase.close();
                }
                C229516p.A0C(r8, r12);
                return r12;
            } catch (Throwable th) {
                if (openDatabase != null) {
                    openDatabase.close();
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            C229516p.A0L(e, "contact-mgr-db/getContactByJidFromInactiveAccount/", 0, 0);
            return null;
        } catch (SQLiteException e2) {
            Log.e("contact-mgr-db/getContactByJidFromInactiveAccount/", e2);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public final List A0A() {
        String str;
        int length;
        AnonymousClass00T r1 = this.A06;
        if (!C90474aD.A1Y(r1)) {
            str = "AccountSwitchingFileManager/getLidsInStagedDir/staging directory doesn't exist";
        } else {
            File[] listFiles = ((File) r1.getValue()).listFiles();
            int i = 0;
            if (listFiles == null || (length = listFiles.length) == 0) {
                str = "AccountSwitchingFileManager/getLidsInStagedDir/no accounts found in staged directory";
            } else {
                ArrayList A14 = C36441kJ.A14(length);
                do {
                    A14.add(listFiles[i].getName());
                    i++;
                } while (i < length);
                return A14;
            }
        }
        Log.e(str);
        return C023409w.A00;
    }

    public C133346Xy(C131086Nr r2, C229516p r3, AnonymousClass171 r4, C19970wo r5, C19630wG r6, AnonymousClass11g r7, AnonymousClass12S r8, C20840yF r9) {
        C36321k7.A1B(r5, r6, r8, r4, r3);
        C36321k7.A13(r7, r9, r2);
        this.A0A = r5;
        this.A00 = r6;
        this.A02 = r8;
        this.A09 = r4;
        this.A08 = r3;
        this.A01 = r7;
        this.A03 = r9;
        this.A07 = r2;
    }

    public static final void A01(C133346Xy r4, RandomAccessFile randomAccessFile, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1a(A0u, C90524aI.A0g("AccountSwitchingFileManager/restoreAccountDataForLid/", str, A0u));
        AnonymousClass00T r1 = r4.A06;
        if (C90474aD.A1Y(r1)) {
            File A0L = C90464aC.A0L(str, r1);
            if (A0L.exists()) {
                r4.A03(randomAccessFile, C90514aH.A0w(A0L), C36431kI.A1E(r4.A04));
                boolean delete = A0L.delete();
                StringBuilder A0u2 = AnonymousClass000.A0u();
                C90464aC.A1A(A0L, "AccountSwitchingFileManager/restoreAccountDataForLid/cleaned up ", A0u2);
                C36321k7.A1X(": ", A0u2, delete);
                return;
            }
            C90464aC.A13(r4, "AccountSwitchingFileManager/restoreAccountDataForLid/stagingDirLogString/", AnonymousClass000.A0u());
            StringBuilder A0u3 = AnonymousClass000.A0u();
            C90464aC.A1H("Account ", str, A0u3);
            throw AnonymousClass000.A0g(" directory does not exist", A0u3);
        }
        throw AnonymousClass001.A09("Staging Directory don't exist");
    }

    public static final void A02(C133346Xy r3, RandomAccessFile randomAccessFile, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1a(A0u, C90524aI.A0g("AccountSwitchingFileManager/stageAccountDataForLid/", str, A0u));
        AnonymousClass00T r1 = r3.A06;
        if (C90474aD.A1Y(r1) || ((File) r1.getValue()).mkdirs()) {
            File A0L = C90464aC.A0L(str, r1);
            if (A0L.exists() || A0L.mkdirs()) {
                r3.A03(randomAccessFile, C36431kI.A1E(r3.A04), C90514aH.A0w(A0L));
                return;
            }
            throw AnonymousClass001.A09("Unable to create directory for current account");
        }
        throw AnonymousClass001.A09("Unable to create staging directory");
    }

    public static final boolean A04(C133346Xy r9, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1a(A0u, C90524aI.A0g("AccountSwitchingFileManager/copyDbFileFromStaging/", str, A0u));
        AnonymousClass00T r1 = r9.A06;
        if (C90474aD.A1Y(r1)) {
            File A0L = C90464aC.A0L(str, r1);
            if (A0L.exists()) {
                File A0T = C90524aI.A0T(A0L.getAbsolutePath(), "databases");
                if (!A0T.exists()) {
                    C90464aC.A13(r9, "AccountSwitchingFileManager/copyDbFileFromStaging/stagingDirLogString/", AnonymousClass000.A0u());
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C90464aC.A1H("AccountSwitchingFileManager/copyDbFileFromStaging/db dir for ", str, A0u2);
                    C36321k7.A1a(A0u2, " does not exist");
                    return false;
                }
                File A0T2 = C90524aI.A0T(A0T.getAbsolutePath(), "account_switcher.db");
                if (!A0T2.exists()) {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    C90464aC.A1H("AccountSwitchingFileManager/copyDbFileFromStaging/account_switcher.db file for ", str, A0u3);
                    C36321k7.A1Z(A0u3, " doesn't exist");
                    return false;
                }
                File A0T3 = C90524aI.A0T(C36431kI.A1E(r9.A04), "databases");
                if (A0T3.exists() || A0T3.mkdirs()) {
                    File A0w = C36441kJ.A0w(A0T3, "account_switcher.db");
                    C20840yF r6 = r9.A03;
                    AnonymousClass6YY.A0O(r6, A0T2, A0w);
                    List list = C113085ey.A00;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A0C = AnonymousClass001.A0C(it);
                        File A0S = C90524aI.A0S(AnonymousClass000.A0p(A0T2.getPath(), A0C, AnonymousClass000.A0u()));
                        if (A0S.exists()) {
                            AnonymousClass6YY.A0O(r6, A0S, C36441kJ.A0w(A0T3, C36321k7.A0D("account_switcher.db", A0C)));
                        }
                    }
                    A0T2.delete();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C90464aC.A18(C90524aI.A0S(AnonymousClass000.A0p(A0T2.getPath(), AnonymousClass001.A0C(it2), AnonymousClass000.A0u())));
                    }
                    return true;
                }
                throw AnonymousClass001.A09("Unable to create databases directory");
            }
            C90464aC.A13(r9, "AccountSwitchingFileManager/copyDbFileFromStaging/stagingDirLogString/", AnonymousClass000.A0u());
            StringBuilder A0u4 = AnonymousClass000.A0u();
            C90464aC.A1H("Account ", str, A0u4);
            throw AnonymousClass000.A0g(" directory does not exist", A0u4);
        }
        throw AnonymousClass001.A09("Staging directory does not exist");
    }

    public static final boolean A06(C133346Xy r3, String str, boolean z) {
        File file;
        StringBuilder A0u = AnonymousClass000.A0u();
        C90464aC.A1H("AccountSwitchingFileManager/moveLogsDirectory/lid: ", str, A0u);
        C36321k7.A1X(" restoring: ", A0u, z);
        AnonymousClass00T r1 = r3.A06;
        if (C90474aD.A1Y(r1)) {
            File A0L = C90464aC.A0L(str, r1);
            if (A0L.exists()) {
                File A0T = C90524aI.A0T(A0L.getAbsolutePath(), "files/Logs");
                String A1E = C36431kI.A1E(r3.A04);
                if (!z) {
                    file = C90524aI.A0T(A1E, "files/Logs");
                } else {
                    file = A0T;
                    A0T = C90524aI.A0T(A1E, "files/Logs");
                }
                if (!A0T.exists()) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("AccountSwitchingFileManager/moveLogsDirectory/");
                    A0u2.append(A0T);
                    C36341k9.A1O(A0u2, " directory not found");
                    return false;
                } else if (file.exists() || file.mkdirs()) {
                    if (!z && file.exists()) {
                        C14360lV.A00(file);
                    }
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append("AccountSwitchingFileManager/moveLogsDirectory/Moving Logs from ");
                    A0u3.append(A0T);
                    C36321k7.A1K(file, " to ", A0u3);
                    Log.flush();
                    return A0T.renameTo(file);
                } else {
                    C36321k7.A1J(file, "AccountSwitchingFileManager/moveLogsDirectory/Unable to create ", AnonymousClass000.A0u());
                    return false;
                }
            } else {
                C90464aC.A13(r3, "AccountSwitchingFileManager/moveLogsDirectory/stagingDirLogString/", AnonymousClass000.A0u());
                StringBuilder A0u4 = AnonymousClass000.A0u();
                C90464aC.A1H("Account ", str, A0u4);
                throw AnonymousClass000.A0g(" directory does not exist", A0u4);
            }
        } else {
            throw AnonymousClass001.A09("Staging Directory don't exist");
        }
    }

    public static final boolean A07(String str, String str2) {
        File A0T = C90524aI.A0T(str, str2);
        if (A0T.exists()) {
            return C14360lV.A00(A0T);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountSwitchingFileManager/deleteDirectoryInPath/");
        A0u.append(str2);
        C36321k7.A1Q(" doesn't exist in ", str, A0u);
        return true;
    }

    public final C142546p3 A08(String str, String str2) {
        StringBuilder A0i = C36341k9.A0i(str);
        C90464aC.A1H("AccountSwitchingFileManager/switchAccount/active:", str, A0i);
        C36321k7.A1a(A0i, C90524aI.A0g("/inactive:", str2, A0i));
        return new C142546p3(this, str2, str);
    }
}
