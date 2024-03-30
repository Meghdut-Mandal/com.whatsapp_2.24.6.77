package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* renamed from: X.7rZ  reason: invalid class name and case insensitive filesystem */
public class C164287rZ implements C159957kE {
    public Object A00;
    public String A01;
    public final int A02;

    public C164287rZ(C133346Xy r1, String str, int i) {
        this.A02 = i;
        if (i != 0) {
            this.A00 = r1;
            this.A01 = str;
        } else {
            this.A01 = str;
            this.A00 = r1;
        }
    }

    public void B2m(RandomAccessFile randomAccessFile) {
        if (this.A02 != 0) {
            AnonymousClass00C.A0D(randomAccessFile, 0);
            Log.i("AccountSwitchingFileManager/restoreAccount/checkpointOps");
            C133346Xy.A01((C133346Xy) this.A00, randomAccessFile, this.A01);
            return;
        }
        StringBuilder A0i = C36341k9.A0i(randomAccessFile);
        A0i.append("AccountSwitchingFileManager/prepForAddingNewAccount/checkpointOps/");
        String str = this.A01;
        C36321k7.A1a(A0i, AnonymousClass3LV.A01(str));
        C133346Xy.A02((C133346Xy) this.A00, randomAccessFile, str);
    }

    public void Blr() {
        boolean z;
        StringBuilder A0u;
        String str;
        String A0q;
        if (this.A02 == 0) {
            C133346Xy r4 = (C133346Xy) this.A00;
            String str2 = this.A01;
            C36321k7.A1X("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/moveLogsBackToActiveDirectory: ", AnonymousClass000.A0u(), C133346Xy.A06(r4, str2, false));
            C36321k7.A1X("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyGoogleGcmFile:", AnonymousClass000.A0u(), C133346Xy.A05(r4, str2));
            C36321k7.A1X("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyDbFile:", AnonymousClass000.A0u(), C133346Xy.A04(r4, str2));
            StringBuilder A0u2 = AnonymousClass000.A0u();
            C36321k7.A1a(A0u2, C90524aI.A0g("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/", str2, A0u2));
            AnonymousClass00T r1 = r4.A06;
            if (!C90474aD.A1Y(r1)) {
                A0q = "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/staging Directory doesn't exist";
            } else {
                File A0L = C90464aC.A0L(str2, r1);
                if (!A0L.exists()) {
                    C90464aC.A13(r4, "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/stagingDirLogString/", AnonymousClass000.A0u());
                    A0u = AnonymousClass000.A0u();
                    C90464aC.A1H("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/account ", str2, A0u);
                    str = " directory does not exist";
                } else {
                    File A0T = C90524aI.A0T(A0L.getAbsolutePath(), "cache");
                    if (!A0T.exists()) {
                        C90464aC.A13(r4, "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/stagingDirLogString/", AnonymousClass000.A0u());
                        A0u = AnonymousClass000.A0u();
                        C90464aC.A1H("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/cache directory for ", str2, A0u);
                        str = " does not exist";
                    } else {
                        File A002 = AnonymousClass10P.A00(r4.A00, "anr_detector_secondary_process");
                        File A0T2 = C90524aI.A0T(A0T.getAbsolutePath(), A002.getName());
                        if (!A0T2.exists()) {
                            StringBuilder A0v = AnonymousClass000.A0v("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/");
                            A0v.append(A0T2);
                            C90464aC.A1H(" file for ", str2, A0v);
                            C36321k7.A1a(A0v, " doesn't exist");
                            z = false;
                            C36321k7.A1X("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyAnrHealthFile:", AnonymousClass000.A0u(), z);
                        }
                        File A0T3 = C90524aI.A0T(C36431kI.A1E(r4.A04), "cache");
                        if (!A0T3.exists() && !A0T3.mkdirs()) {
                            C90464aC.A13(r4, "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/stagingDirLogString/", AnonymousClass000.A0u());
                            Log.e("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/unable to create cache directory");
                        }
                        AnonymousClass6YY.A0O(r4.A03, A0T2, A002);
                        z = true;
                        C36321k7.A1X("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyAnrHealthFile:", AnonymousClass000.A0u(), z);
                    }
                }
                A0q = AnonymousClass000.A0q(str, A0u);
            }
            Log.e(A0q);
            z = false;
            C36321k7.A1X("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyAnrHealthFile:", AnonymousClass000.A0u(), z);
        }
    }

    public void Bm0() {
        String str;
        if (this.A02 != 0) {
            Log.i("AccountSwitchingFileManager/restoreAccount/preCheckpointOps");
            C133346Xy r6 = (C133346Xy) this.A00;
            String str2 = this.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            C36321k7.A1a(A0u, C90524aI.A0g("AccountSwitchingFileManager/copyDbFileToStaging/", str2, A0u));
            File A0T = C90524aI.A0T(C36431kI.A1E(r6.A04), "databases");
            if (!A0T.exists()) {
                str = "AccountSwitchingFileManager/copyDbFileToStaging/App database directory doesn't exist";
            } else {
                File A0T2 = C90524aI.A0T(A0T.getAbsolutePath(), "account_switcher.db");
                if (!A0T2.exists()) {
                    str = "AccountSwitchingFileManager/copyDbFileToStaging/account_switcher.db file for current account doesn't exist";
                } else {
                    AnonymousClass00T r1 = r6.A06;
                    if (C90474aD.A1Y(r1)) {
                        File A0L = C90464aC.A0L(str2, r1);
                        if (A0L.exists()) {
                            File A0w = C36441kJ.A0w(A0L, "databases");
                            if (A0w.exists()) {
                                File A0w2 = C36441kJ.A0w(A0w, "account_switcher.db");
                                C20840yF r3 = r6.A03;
                                AnonymousClass6YY.A0O(r3, A0T2, A0w2);
                                Iterator it = C113085ey.A00.iterator();
                                while (it.hasNext()) {
                                    String A0C = AnonymousClass001.A0C(it);
                                    File A0S = C90524aI.A0S(AnonymousClass000.A0p(A0T2.getPath(), A0C, AnonymousClass000.A0u()));
                                    if (A0S.exists()) {
                                        AnonymousClass6YY.A0O(r3, A0S, C36441kJ.A0w(A0w, C36321k7.A0D("account_switcher.db", A0C)));
                                    }
                                }
                                C133346Xy.A06(r6, str2, true);
                            }
                            C90464aC.A13(r6, "AccountSwitchingFileManager/copyDbFileToStaging/stagingDirLogString/", AnonymousClass000.A0u());
                            throw AnonymousClass001.A09("databases directory does not exist in staged directory");
                        }
                        C90464aC.A13(r6, "AccountSwitchingFileManager/copyDbFileToStaging/stagingDirLogString/", AnonymousClass000.A0u());
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        C90464aC.A1H("Account ", str2, A0u2);
                        throw AnonymousClass000.A0g(" directory does not exist", A0u2);
                    }
                    throw AnonymousClass001.A09("Staging directory don't exist");
                }
            }
            Log.i(str);
            C133346Xy.A06(r6, str2, true);
        }
    }
}
