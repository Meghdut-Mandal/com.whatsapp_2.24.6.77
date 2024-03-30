package X;

import android.database.Cursor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1AA  reason: invalid class name */
public class AnonymousClass1AA {
    public final AnonymousClass18P A00;

    public static C195589Va A00(Cursor cursor) {
        try {
            C200039gT A002 = C200039gT.A00((AnonymousClass8QY) C170918Hz.A08(AnonymousClass8QY.DEFAULT_INSTANCE, cursor.getBlob(cursor.getColumnIndexOrThrow("fingerprint"))));
            C18740tg.A06(A002);
            return new C195589Va(new AnonymousClass9W7(A002, cursor.getBlob(cursor.getColumnIndexOrThrow("key_data")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"))), new C201539jo((int) cursor.getLong(cursor.getColumnIndexOrThrow("device_id")), (int) cursor.getLong(cursor.getColumnIndexOrThrow("epoch"))));
        } catch (AnonymousClass186 e) {
            throw new IllegalStateException("SyncdCryptoStore/createSyncdKey", e);
        }
    }

    public int A01() {
        Cursor A09;
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT MAX ( epoch ) as max_epoch FROM crypto_info", "SyncdCryptoInfoTable.SELECT_MAX_EPOCH", (String[]) null);
            if (A09.moveToFirst()) {
                int i = (int) A09.getLong(A09.getColumnIndexOrThrow("max_epoch"));
                A09.close();
                A03.close();
                return i;
            }
            A09.close();
            A03.close();
            return 0;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C195589Va A02() {
        Cursor A09;
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info ORDER BY epoch DESC, device_id ASC LIMIT 1", "SyncdCryptoInfoTable.SELECT_LATEST_KEY", (String[]) null);
            if (A09.moveToFirst()) {
                C195589Va A002 = A00(A09);
                A09.close();
                A03.close();
                return A002;
            }
            A09.close();
            A03.close();
            return null;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A03(Collection collection, long j) {
        HashSet hashSet = new HashSet(collection);
        hashSet.remove((Object) null);
        if (!hashSet.isEmpty()) {
            AnonymousClass1M0 A04 = this.A00.A04();
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C201539jo r6 = (C201539jo) it.next();
                    A04.A02.A0E("UPDATE crypto_info SET stale_timestamp = ?  WHERE device_id = ?  AND epoch = ? ", "SyncdCryptoInfoTable.UPDATE_STALE_TIMESTAMP_BY_KEY_ID", new String[]{String.valueOf(j), String.valueOf(r6.A00()), String.valueOf(C203239na.A01(r6.A00, 2))});
                }
                A04.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public AnonymousClass1AA(AnonymousClass18P r1) {
        this.A00 = r1;
    }
}
