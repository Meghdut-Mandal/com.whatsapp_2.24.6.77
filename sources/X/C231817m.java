package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.17m  reason: invalid class name and case insensitive filesystem */
public class C231817m {
    public final C219712j A00;
    public final AnonymousClass12P A01;
    public final Object A02 = new Object();
    public final Map A03;

    public void A04(UserJid userJid) {
        C1495671s B1k;
        String[] strArr = {Long.toString(this.A00.A07(userJid))};
        AnonymousClass1M0 A05 = this.A01.A05();
        try {
            B1k = A05.B1k();
            A05.A02.A03("user_device_info", "user_jid_row_id=?", "deleteUserDeviceInfo/DELETE_USER_DEVICE_INFO", strArr);
            B1k.A00();
            A05.B5o(new C35701j7(this, userJid, 29));
            B1k.close();
            A05.close();
            return;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static AnonymousClass3QO A00(Cursor cursor) {
        int i;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("raw_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("expected_timestamp");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("expected_ts_last_device_job_ts");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("expected_timestamp_update_ts");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("account_encryption_type");
        if (cursor.isNull(columnIndexOrThrow6)) {
            i = 0;
        } else {
            i = cursor.getInt(columnIndexOrThrow6);
        }
        return new AnonymousClass3QO(cursor.getInt(columnIndexOrThrow), i, cursor.getLong(columnIndexOrThrow2), cursor.getLong(columnIndexOrThrow3), cursor.getLong(columnIndexOrThrow4), cursor.getLong(columnIndexOrThrow5));
    }

    public AnonymousClass3QO A01(UserJid userJid) {
        Cursor A09;
        AnonymousClass3QO r0;
        AnonymousClass3QO r02;
        synchronized (this.A02) {
            Map map = this.A03;
            if (map.containsKey(userJid)) {
                r02 = (AnonymousClass3QO) map.get(userJid);
            } else {
                String[] strArr = {Long.toString(this.A00.A07(userJid))};
                AnonymousClass1M0 A04 = this.A01.get();
                try {
                    A09 = A04.A02.A09("SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, account_encryption_type FROM user_device_info WHERE user_jid_row_id = ?", "GET_USER_DEVICE_INFO_SQL", strArr);
                    if (A09.moveToNext()) {
                        r0 = A00(A09);
                    } else {
                        r0 = null;
                    }
                    map.put(userJid, r0);
                    A09.close();
                    A04.close();
                    r02 = (AnonymousClass3QO) map.get(userJid);
                } catch (Throwable th) {
                    try {
                        A04.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return r02;
        throw th;
    }

    public HashSet A02() {
        Cursor A09;
        UserJid A022;
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            A09 = A04.A02.A09("SELECT raw_string FROM user_device_info JOIN jid ON user_device_info.user_jid_row_id=jid._id WHERE account_encryption_type=1", "GET_HOSTED_ACCOUNT_JIDS", (String[]) null);
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("raw_string");
            HashSet hashSet = new HashSet();
            while (A09.moveToNext()) {
                String string = A09.getString(columnIndexOrThrow);
                if (!TextUtils.isEmpty(string) && (A022 = UserJid.Companion.A02(string)) != null) {
                    hashSet.add(A022);
                }
            }
            A09.close();
            A04.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A03(AnonymousClass3QO r14, UserJid userJid) {
        C1495671s B1k;
        long A07 = this.A00.A07(userJid);
        AnonymousClass1M0 A05 = this.A01.A05();
        try {
            B1k = A05.B1k();
            ContentValues contentValues = new ContentValues();
            contentValues.put("raw_id", Integer.valueOf(r14.A01));
            contentValues.put("timestamp", Long.valueOf(r14.A05));
            contentValues.put("expected_timestamp", Long.valueOf(r14.A02));
            contentValues.put("expected_ts_last_device_job_ts", Long.valueOf(r14.A04));
            contentValues.put("expected_timestamp_update_ts", Long.valueOf(r14.A03));
            contentValues.put("account_encryption_type", Integer.valueOf(r14.A00));
            C224114e r7 = A05.A02;
            if (r7.A01(contentValues, "user_device_info", "user_jid_row_id = ?", "UPDATE_USER_DEVICE_INFO", new String[]{String.valueOf(A07)}) != 1) {
                contentValues.put("user_jid_row_id", Long.valueOf(A07));
                r7.A05("user_device_info", "INSERT_USER_DEVICE_INFO", contentValues);
            }
            B1k.A00();
            A05.B5o(new C35701j7(this, userJid, 30));
            B1k.close();
            A05.close();
            return;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C231817m(C219712j r2, AnonymousClass12P r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = Collections.synchronizedMap(new HashMap());
    }
}
