package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.54Y  reason: invalid class name */
public class AnonymousClass54Y extends AnonymousClass1CP {
    public static final String[] A0C = {"wa_trusted_contacts", "wa_trusted_contacts_send"};
    public final C19700wN A00;
    public final C19630wG A01;
    public final C19900wh A02;
    public final AnonymousClass11g A03;
    public final AnonymousClass12S A04;
    public final AnonymousClass12X A05;
    public final C19730wQ A06;
    public final C24341Cb A07;
    public final AnonymousClass1CY A08;
    public final C24391Cg A09;
    public final AnonymousClass1CS A0A;
    public final C229716r A0B;

    public static boolean A00(C229716r r15, C229716r r16) {
        Cursor A092;
        try {
            AnonymousClass1M0 A042 = r15.A04();
            try {
                AnonymousClass1M0 A043 = r16.A04();
                try {
                    C1495671s B1k = A042.B1k();
                    try {
                        C1495671s B1k2 = A043.B1k();
                        try {
                            String[] strArr = A0C;
                            int i = 0;
                            do {
                                String str = strArr[i];
                                C224114e r6 = A043.A02;
                                r6.A03(str, (String) null, AnonymousClass000.A0p("WaDatabaseBackupProducer/copyBackupTables/delete/", str, AnonymousClass000.A0u()), (String[]) null);
                                A092 = A042.A02.A09(AnonymousClass000.A0p("SELECT * FROM ", str, AnonymousClass000.A0u()), AnonymousClass000.A0p("WaDatabaseBackupProducer/copyBackupTables/read/", str, AnonymousClass000.A0u()), (String[]) null);
                                while (A092.moveToNext()) {
                                    ContentValues A0E = C36441kJ.A0E();
                                    DatabaseUtils.cursorRowToContentValues(A092, A0E);
                                    r6.A04(str, AnonymousClass000.A0p("WaDatabaseBackupProducer/copyBackupTables/write/", str, AnonymousClass000.A0u()), A0E);
                                }
                                A092.close();
                                i++;
                            } while (i < 2);
                            B1k.A00();
                            B1k2.A00();
                            B1k2.close();
                            B1k.close();
                            A043.close();
                            A042.close();
                            return true;
                        } catch (Throwable th) {
                            B1k2.close();
                            throw th;
                        }
                        throw th;
                    } catch (Throwable th2) {
                        B1k.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    A043.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                A042.close();
                throw th4;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("WaDatabaseBackupProducer/copyBackupTables/exception", e);
            return false;
        } catch (Throwable th5) {
            th4.addSuppressed(th5);
        }
    }

    public String A0J() {
        return "wa-db";
    }

    public ArrayList A0K(File file) {
        return AnonymousClass6YO.A07(file, "wa.db", AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT14));
    }

    public boolean A0N(Context context, File file) {
        C19630wG r2 = this.A01;
        C19700wN r7 = this.A00;
        AnonymousClass12S r6 = this.A04;
        AnonymousClass11g r5 = this.A03;
        C229716r r62 = new C229716r(r7, r2, this.A02, r5, r6, this.A05, "wa-backup.db");
        ReentrantReadWriteLock.WriteLock writeLock = r62.A02.writeLock();
        writeLock.lock();
        try {
            r62.A05();
            File databasePath = r62.A00.A00.getDatabasePath(r62.getDatabaseName());
            File file2 = file;
            file2.getAbsolutePath();
            databasePath.getAbsolutePath();
            AnonymousClass5U6 A022 = AnonymousClass5U6.A02(AnonymousClass6YO.A01(file2.getName(), "wa.db"));
            AnonymousClass1CS r14 = this.A0A;
            C19730wQ r63 = this.A06;
            AnonymousClass1CY r10 = this.A08;
            C109765Za.A00(r63, (C132716Uy) null, this.A01, this.A07, r10, this.A04, this.A09, A022, r14, file2, (Boolean) null).A05(r2, (C158587hk) null, databasePath, 0, 0, false);
            try {
                A00(r62, this.A0B);
                r62.A05();
                return true;
            } catch (Exception e) {
                Log.e("WaDatabaseBackupProducer/restore copy backup tables failed", e);
                return false;
            }
        } catch (Exception e2) {
            Log.e("WaDatabaseBackupProducer/restore backup file failed", e2);
            return false;
        } finally {
            writeLock.unlock();
        }
    }

    public AnonymousClass6PN A0O(AnonymousClass5U6 r23) {
        AnonymousClass6PN r2;
        C24341Cb r6 = this.A07;
        if (r6.A02()) {
            Log.i("WaDatabaseBackupProducer/skip no media or read-only media");
            return new AnonymousClass6PN("wa-db");
        }
        C19630wG r0 = this.A01;
        C19700wN r15 = this.A00;
        AnonymousClass12S r5 = this.A04;
        AnonymousClass11g r4 = this.A03;
        C19630wG r16 = r0;
        C229716r r14 = new C229716r(r15, r16, this.A02, r4, r5, this.A05, "wa-backup.db");
        try {
            if (!A00(this.A0B, r14)) {
                Log.e("WaDatabaseBackupProducer/failed-to-copy");
                r14.A05();
                r2 = new AnonymousClass6PN("wa-db");
            } else if (!r14.A06()) {
                Log.e("WaDatabaseBackupProducer/wal checkpoint failed");
                r14.A05();
                r2 = new AnonymousClass6PN("wa-db");
            } else {
                Log.i("WaDatabaseBackupProducer/close-backup-db");
                r14.close();
                AnonymousClass5U6 r10 = r23;
                File A032 = AnonymousClass5U6.A03(this, r10, "wa.db.crypt", AnonymousClass000.A0u());
                Iterator it = A0K(A0E(r10)).iterator();
                while (it.hasNext()) {
                    File A0a = C90504aG.A0a(it);
                    if (!A0a.equals(A032)) {
                        C90464aC.A18(A0a);
                    }
                }
                C36321k7.A1K(A032, "WaDatabaseBackupProducer/to ", AnonymousClass000.A0u());
                AnonymousClass1CS r11 = this.A0A;
                C19730wQ r3 = this.A06;
                AnonymousClass1CY r7 = this.A08;
                AnonymousClass6QE A002 = C109765Za.A00(r3, (C132716Uy) null, this.A01, r6, r7, this.A04, this.A09, r10, r11, A032, (Boolean) null);
                if (!A002.A08(r0.A00)) {
                    Log.w("WaDatabaseBackupProducer/prepare for backup failed");
                    r2 = new AnonymousClass6PN("wa-db");
                } else {
                    A002.A07((AnonymousClass7fT) null, r14.A00.A00.getDatabasePath(r14.getDatabaseName()));
                    r2 = new AnonymousClass6PN(A032, (Long) null, "wa-db", C90514aH.A0K(this, r10), true);
                }
            }
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            Log.e("WaDatabaseBackupProducer failed", e);
            r2 = new AnonymousClass6PN("wa-db");
        } catch (Throwable th) {
            r14.A05();
            throw th;
        }
        r14.A05();
        return r2;
    }

    public AnonymousClass54Y(C19700wN r1, C19730wQ r2, C24341Cb r3, C19630wG r4, C19900wh r5, AnonymousClass1CY r6, C24421Cj r7, AnonymousClass11g r8, AnonymousClass12S r9, AnonymousClass12X r10, C24391Cg r11, AnonymousClass1CS r12, C229716r r13) {
        super(r7);
        this.A01 = r4;
        this.A00 = r1;
        this.A0A = r12;
        this.A06 = r2;
        this.A04 = r9;
        this.A08 = r6;
        this.A05 = r10;
        this.A0B = r13;
        this.A07 = r3;
        this.A03 = r8;
        this.A09 = r11;
        this.A02 = r5;
    }

    public void A0L(C1042758y r2, double d) {
        r2.A0Q = Double.valueOf(d);
    }

    public void A0M(C1042758y r2, double d) {
        r2.A0P = Double.valueOf(d);
    }
}
