package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Random;

/* renamed from: X.6F6  reason: invalid class name */
public class AnonymousClass6F6 {
    public final AnonymousClass6MK A00;
    public final AnonymousClass005 A01;
    public final ThreadLocal A02 = new ThreadLocal();
    public final C1270466s A03;

    public long A00() {
        Cursor A09;
        long j;
        AnonymousClass1M0 A012 = this.A00.A00.A01();
        try {
            A09 = A012.A02.A09("SELECT  f.file_size AS exported_file_size FROM exported_files_metadata AS f WHERE f.exported_path = ?", "XPM_EXPORT_DB_SIZE", C90474aD.A1b("migration/messages_export.zip"));
            if (!A09.moveToFirst()) {
                j = 0;
            } else {
                j = C36351kA.A07(A09, "exported_file_size");
            }
            A09.close();
            A012.close();
            return j;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A02(File file, String str, boolean z) {
        AnonymousClass6MK r3 = this.A00;
        String canonicalPath = file.getCanonicalPath();
        long length = file.length();
        ThreadLocal threadLocal = this.A02;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[16];
            threadLocal.set(bArr);
        }
        ((Random) this.A01.get()).nextBytes(bArr);
        return r3.A01(canonicalPath, str, C36441kJ.A13(bArr), length, z);
    }

    public void A04() {
        C1031154a r0;
        C1270466s r1 = this.A00.A00;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                r0 = (C1031154a) r1.A02.get();
                r1.A00 = r0;
            }
        }
        AnonymousClass1M0 A04 = r0.A04();
        try {
            A04.A02.A03("exported_files_metadata", (String) null, "XPM_EXPORT_METADATA_DELETE_ALL", (String[]) null);
            A04.close();
            C1270466s r2 = this.A03;
            synchronized (r2) {
                C1031154a r02 = r2.A00;
                if (r02 != null) {
                    r02.close();
                    r2.A00 = null;
                }
                r2.A01.deleteDatabase("migration_export_metadata.db");
                Log.i("ExportMetadata/removeDatabase/deleted");
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass6F6(C1270466s r2, AnonymousClass6MK r3, AnonymousClass005 r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r2;
    }

    public long A01() {
        Cursor A09;
        long j;
        AnonymousClass1M0 A002 = C1270466s.A00(this);
        try {
            A09 = A002.A02.A09("SELECT  SUM(files.file_size) AS total_size FROM exported_files_metadata AS files", "XPM_EXPORT_TOTAL_SIZE", (String[]) null);
            if (!A09.moveToFirst()) {
                j = 0;
            } else {
                j = C36351kA.A07(A09, "total_size");
            }
            A09.close();
            A002.close();
            return j;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C81803xe A03() {
        AnonymousClass1M0 A002 = C1270466s.A00(this);
        try {
            C81803xe r0 = new C81803xe(A002.A02.A09("SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f ORDER BY   f.required DESC , f._id ASC ", "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_ALL", (String[]) null), C145126tO.A00);
            A002.close();
            return r0;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
