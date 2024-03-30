package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.66Q  reason: invalid class name */
public class AnonymousClass66Q {
    public final C19970wo A00;
    public final AnonymousClass1DD A01;

    public synchronized void A00(String str, long j, long j2, long j3) {
        AnonymousClass1M0 A04;
        synchronized (this) {
            C18740tg.A00();
            C19970wo r7 = this.A00;
            C19970wo.A00(r7);
            try {
                A04 = this.A01.A04();
                C224114e r5 = A04.A02;
                ContentValues A0E = C36441kJ.A0E();
                A0E.put("enc_file_hash", str);
                A0E.put("ep_saved_time_ms", Long.valueOf(j));
                A0E.put("ep_saved_bytes", Long.valueOf(j2));
                A0E.put("last_update_time", Long.valueOf(j3));
                C36341k9.A0p(A0E, "enc_file_restored", 0);
                r5.A08("express_path_download_data", "ExpressPathDownloadDataStore/insert", A0E, 4);
                C19970wo.A00(r7);
                A04.close();
            } catch (SQLiteDatabaseCorruptException e) {
                e = e;
                Log.e("expresspathdownloaddb/insert", e);
                throw e;
            } catch (Error | RuntimeException e2) {
                e = e2;
                Log.e(e);
                throw e;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return;
        throw th;
    }

    public synchronized boolean A01(String str) {
        C1495671s B1k;
        C18740tg.A00();
        try {
            AnonymousClass1M0 A04 = this.A01.A04();
            try {
                B1k = A04.B1k();
                A04.A02.A03("express_path_download_data", "enc_file_hash = ?", "ExpressPathDownloadDataStore/delete", new String[]{str});
                B1k.A00();
                B1k.close();
                A04.close();
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("expresspathdownloaddb/delete", e);
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        return true;
        throw th;
    }

    public AnonymousClass66Q(C19970wo r1, AnonymousClass1DD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
