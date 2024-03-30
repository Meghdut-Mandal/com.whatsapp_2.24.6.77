package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.12j  reason: invalid class name and case insensitive filesystem */
public class C219712j {
    public final C19700wN A00;
    public final AnonymousClass12P A01;
    public final Map A02 = new ConcurrentHashMap();
    public final Map A03 = new ConcurrentHashMap();
    public final C219612i A04;

    public long A08(Jid jid) {
        Jid jid2 = jid;
        Number number = (Number) this.A02.get(jid);
        if (number != null) {
            return number.longValue();
        }
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            long A012 = A01(jid);
            if (A012 > 0) {
                if (A042.A02.A00.inTransaction()) {
                    A042.B5o(new C35251iO(this, jid2, 2, A012));
                } else {
                    A05(this, jid, A012);
                }
            }
            A042.close();
            return A012;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Jid A09(long j) {
        Cursor A09;
        Jid jid = null;
        long j2 = j;
        if (j <= 0) {
            return null;
        }
        Map map = this.A03;
        Long valueOf = Long.valueOf(j2);
        if (map.containsKey(valueOf)) {
            return (Jid) map.get(valueOf);
        }
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            A09 = A042.A02.A09("SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?", "GET_JID_BY_ROW_ID_SQL", new String[]{Long.toString(j2)});
            if (A09.moveToLast()) {
                jid = A0A(A09, A042, A09.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER), A09.getColumnIndexOrThrow("server"), A09.getColumnIndexOrThrow("agent"), A09.getColumnIndexOrThrow("device"), A09.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), A09.getColumnIndexOrThrow("raw_string"), j2);
            }
            A09.close();
            A042.close();
            return jid;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Jid A0B(Cursor cursor, C26901Ly r16, Class cls, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        long j2 = j;
        try {
            return (Jid) cls.cast(A0A(cursor, r16, i, i2, i3, i4, i5, i6, j2));
        } catch (ClassCastException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("JidStore/readJidByRowId/jid wrong class; rowId=");
            sb.append(j2);
            sb.append("; db_data=");
            sb.append(A03(j2));
            Log.e(sb.toString(), e);
            this.A00.A0E("invalid-jid-in-store", (String) null, false);
            return null;
        }
    }

    public static long A00(C224114e r8, Jid jid) {
        Cursor cursor;
        long j;
        if (jid instanceof DeviceJid) {
            cursor = r8.A09("SELECT _id FROM jid WHERE user = ? AND server = ? AND agent = ? AND device = ? AND type = ?", "GET_JID_ROW_ID_FROM_DEVICE_JID", new String[]{jid.user, jid.getServer(), Integer.toString(jid.getAgent()), Integer.toString(jid.getDevice()), Integer.toString(jid.getType())});
            try {
                if (cursor.moveToLast()) {
                    j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                }
                cursor.close();
                return -1;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            cursor = r8.A09("SELECT _id FROM jid WHERE user = ? AND server = ? AND agent = ? AND type = ?", "GET_JID_ROW_ID_FROM_JID", new String[]{jid.user, jid.getServer(), Integer.toString(jid.getAgent()), Integer.toString(jid.getType())});
            if (cursor.moveToLast()) {
                j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            }
            cursor.close();
            return -1;
        }
        cursor.close();
        return j;
    }

    private long A01(Jid jid) {
        AnonymousClass1M0 A05 = this.A01.A05();
        try {
            long A002 = A00(A05.A02, jid);
            A05.close();
            return A002;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    private String A03(long j) {
        Cursor A09;
        int i;
        String str;
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            A09 = A042.A02.A09("SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?", "GET_JID_BY_ROW_ID_SQL", new String[]{Long.toString(j)});
            if (A09.moveToLast()) {
                String string = A09.getString(A09.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER));
                String string2 = A09.getString(A09.getColumnIndexOrThrow("server"));
                int i2 = A09.getInt(A09.getColumnIndexOrThrow("agent"));
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("device");
                if (A09.isNull(columnIndexOrThrow)) {
                    i = 0;
                } else {
                    i = A09.getInt(columnIndexOrThrow);
                }
                int i3 = A09.getInt(A09.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
                String string3 = A09.getString(A09.getColumnIndexOrThrow("raw_string"));
                boolean isNull = A09.isNull(columnIndexOrThrow);
                if (string != null) {
                    String A092 = AnonymousClass14B.A09('*', string);
                    if (string3 != null) {
                        string3 = string3.replace(string, A092);
                    }
                    string = A092;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("user=");
                sb.append(string);
                sb.append("; server=");
                sb.append(string2);
                sb.append("; agent=");
                sb.append(i2);
                sb.append("; device=");
                sb.append(i);
                sb.append("; type=");
                sb.append(i3);
                sb.append("; rawString=");
                sb.append(string3);
                sb.append("; has_device=");
                if (isNull) {
                    str = "no";
                } else {
                    str = "yes";
                }
                sb.append(str);
                String obj = sb.toString();
                A09.close();
                A042.close();
                return obj;
            }
            A09.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static String A04(Cursor cursor, int i) {
        try {
            return cursor.getString(i);
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading string or blob", e);
            throw e;
        } catch (SQLiteException e2) {
            if (e2.getMessage() == null || !e2.getMessage().contains("Unable to convert BLOB to string")) {
                Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading string or blob", e2);
                throw e2;
            }
            byte[] blob = cursor.getBlob(i);
            if (blob == null) {
                return null;
            }
            try {
                String str = new String(blob, C19430v1.A0B);
                StringBuilder sb = new StringBuilder();
                sb.append("DatabaseUtils/tryGetStringOrGetBlob/converting from blob; string=");
                sb.append(str);
                Log.i(sb.toString());
                return str;
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
    }

    public static void A05(C219712j r2, Jid jid, long j) {
        Map map = r2.A03;
        Long valueOf = Long.valueOf(j);
        map.put(valueOf, jid);
        r2.A02.put(jid, valueOf);
    }

    public static void A06(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" user=");
        sb.append(str2);
        sb.append(" server=");
        sb.append(str3);
        sb.append(" agent=");
        sb.append(i);
        sb.append(" device=");
        sb.append(i2);
        sb.append(" type=");
        sb.append(i3);
        sb.append(" rawString=");
        sb.append(str4);
        Log.e(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0231 A[Catch:{ all -> 0x0240, SQLiteConstraintException -> 0x00bb, all -> 0x02a4, all -> 0x0239 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A07(com.whatsapp.jid.Jid r23) {
        /*
            r22 = this;
            java.lang.String r10 = "jid"
            java.lang.String r12 = "raw_string"
            java.lang.String r13 = "type"
            java.lang.String r8 = "device"
            java.lang.String r15 = "agent"
            java.lang.String r14 = "server"
            java.lang.String r0 = "user"
            r4 = r22
            java.util.Map r1 = r4.A02
            r5 = r23
            java.lang.Object r1 = r1.get(r5)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0021
            long r0 = r1.longValue()
            return r0
        L_0x0021:
            java.lang.String r1 = r5.user
            r2 = -1
            if (r1 != 0) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "JidStore/getRowIdForJid/Error creating a valid Jid object; jid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x003c:
            X.12P r1 = r4.A01
            X.1M0 r3 = r1.A05()
            long r1 = r4.A01(r5)     // Catch:{ all -> 0x02ae }
            r16 = 0
            java.lang.String r19 = "; rowId="
            int r6 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x006b
            X.14e r0 = r3.A02     // Catch:{ all -> 0x02ae }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x02ae }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x02ae }
            if (r0 == 0) goto L_0x0066
            r9 = 0
            X.1iO r6 = new X.1iO     // Catch:{ all -> 0x02ae }
            r7 = r4
            r8 = r5
            r10 = r1
            r6.<init>(r7, r8, r9, r10)     // Catch:{ all -> 0x02ae }
            r3.B5o(r6)     // Catch:{ all -> 0x02ae }
            goto L_0x02a0
        L_0x0066:
            A05(r4, r5, r1)     // Catch:{ all -> 0x02ae }
            goto L_0x02a0
        L_0x006b:
            X.71s r18 = r3.A00()     // Catch:{ all -> 0x02ae }
            long r1 = r4.A01(r5)     // Catch:{ all -> 0x02a4 }
            int r6 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r6 > 0) goto L_0x0262
            r6 = 6
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ SQLiteConstraintException -> 0x00bb }
            r9.<init>(r6)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            java.lang.String r6 = r5.user     // Catch:{ SQLiteConstraintException -> 0x00bb }
            r9.put(r0, r6)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            java.lang.String r6 = r5.getServer()     // Catch:{ SQLiteConstraintException -> 0x00bb }
            r9.put(r14, r6)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            int r6 = r5.getAgent()     // Catch:{ SQLiteConstraintException -> 0x00bb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            r9.put(r15, r6)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            int r6 = r5.getDevice()     // Catch:{ SQLiteConstraintException -> 0x00bb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            r9.put(r8, r6)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            int r6 = r5.getType()     // Catch:{ SQLiteConstraintException -> 0x00bb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            r9.put(r13, r6)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            java.lang.String r6 = r5.getRawString()     // Catch:{ SQLiteConstraintException -> 0x00bb }
            r9.put(r12, r6)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            X.14e r7 = r3.A02     // Catch:{ SQLiteConstraintException -> 0x00bb }
            java.lang.String r6 = "INSERT_JID_SQL"
            long r1 = r7.A05(r10, r6, r9)     // Catch:{ SQLiteConstraintException -> 0x00bb }
            goto L_0x0262
        L_0x00bb:
            r17 = move-exception
            X.14e r9 = r3.A02     // Catch:{ all -> 0x02a4 }
            java.lang.String r6 = "SELECT _id, user, server, agent, device, type, raw_string FROM jid WHERE raw_string = ?"
            r20 = r1
            r1 = 1
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ all -> 0x02a4 }
            java.lang.String r2 = r5.getRawString()     // Catch:{ all -> 0x02a4 }
            r1 = 0
            r7[r1] = r2     // Catch:{ all -> 0x02a4 }
            java.lang.String r1 = "GET_JID_FROM_RAW_STRING"
            android.database.Cursor r6 = r9.A09(r6, r1, r7)     // Catch:{ all -> 0x02a4 }
            boolean r1 = r6.moveToLast()     // Catch:{ all -> 0x0239 }
            if (r1 == 0) goto L_0x0211
            java.lang.String r1 = "_id"
            int r1 = r6.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0239 }
            long r1 = r6.getLong(r1)     // Catch:{ all -> 0x0239 }
            java.util.Map r11 = r4.A03     // Catch:{ all -> 0x0239 }
            java.lang.Long r7 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0239 }
            boolean r16 = r11.containsKey(r7)     // Catch:{ all -> 0x0239 }
            com.whatsapp.jid.Jid r7 = r4.A09(r1)     // Catch:{ all -> 0x0239 }
            java.lang.String r11 = "; errorRowId="
            if (r7 == 0) goto L_0x01e3
            int r9 = r6.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0239 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0239 }
            r8.<init>()     // Catch:{ all -> 0x0239 }
            java.lang.String r10 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed; jid="
            r8.append(r10)     // Catch:{ all -> 0x0239 }
            java.lang.String r10 = r5.getRawString()     // Catch:{ all -> 0x0239 }
            r8.append(r10)     // Catch:{ all -> 0x0239 }
            java.lang.String r10 = "; db.user="
            r8.append(r10)     // Catch:{ all -> 0x0239 }
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; db.server="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            int r0 = r6.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; db.agent="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            int r0 = r6.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x0239 }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; db.device="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            boolean r0 = r6.isNull(r9)     // Catch:{ all -> 0x0239 }
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = "<null>"
        L_0x0146:
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; db.type="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            int r0 = r6.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x0239 }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; db.raw_string="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            int r0 = r6.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            r8.append(r11)     // Catch:{ all -> 0x0239 }
            r8.append(r1)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; inCache="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            r0 = r16
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; jidFromDb.user="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r7.user     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; jidFromDb.server="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r7.getServer()     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; jidFromDb.agent="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            int r0 = r7.getAgent()     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; jidFromDb.device="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            int r0 = r7.getDevice()     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; jidFromDb.type="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            int r0 = r7.getType()     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; jidFromDb.raw_string="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "; matchingJid="
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            boolean r0 = r5.equals(r7)     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0239 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0239 }
            boolean r0 = r5.equals(r7)     // Catch:{ all -> 0x0239 }
            if (r0 == 0) goto L_0x0229
            goto L_0x022b
        L_0x01d9:
            int r0 = r6.getInt(r9)     // Catch:{ all -> 0x0239 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0239 }
            goto L_0x0146
        L_0x01e3:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0239 }
            r7.<init>()     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed, but jid not found by row_id; jid="
            r7.append(r0)     // Catch:{ all -> 0x0239 }
            r7.append(r5)     // Catch:{ all -> 0x0239 }
            r7.append(r11)     // Catch:{ all -> 0x0239 }
            r7.append(r1)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0239 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r8 = "raw_string = ?"
            r7 = 1
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch:{ all -> 0x0239 }
            java.lang.String r1 = r5.getRawString()     // Catch:{ all -> 0x0239 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "getRowIdForJid/DELETE_JID_ON_MISMATCH"
            r9.A03(r10, r8, r0, r2)     // Catch:{ all -> 0x0239 }
            r1 = r20
            goto L_0x022c
        L_0x0211:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0239 }
            r1.<init>()     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed, but jid not found by raw_string; jid="
            r1.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x0239 }
            r1.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0239 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0239 }
        L_0x0229:
            r1 = r20
        L_0x022b:
            r7 = 0
        L_0x022c:
            r6.close()     // Catch:{ all -> 0x02a4 }
            if (r7 != 0) goto L_0x0262
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0238
            goto L_0x0245
        L_0x0238:
            throw r17     // Catch:{ all -> 0x02a4 }
        L_0x0239:
            r1 = move-exception
            if (r6 == 0) goto L_0x0244
            r6.close()     // Catch:{ all -> 0x0240 }
            goto L_0x0244
        L_0x0240:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02a4 }
        L_0x0244:
            throw r1     // Catch:{ all -> 0x02a4 }
        L_0x0245:
            X.0wN r8 = r4.A00     // Catch:{ all -> 0x02a4 }
            java.lang.String r7 = "JidStore/raw_string-constraint-failed"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a4 }
            r6.<init>()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "jid found by raws string; jid="
            r6.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x02a4 }
            r6.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x02a4 }
            r0 = 0
            r8.A0E(r7, r6, r0)     // Catch:{ all -> 0x02a4 }
        L_0x0262:
            r18.A00()     // Catch:{ all -> 0x02a4 }
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0290
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a4 }
            r4.<init>()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "JidStore/getRowIdForJid/Error inserting jid; jid="
            r4.append(r0)     // Catch:{ all -> 0x02a4 }
            r4.append(r5)     // Catch:{ all -> 0x02a4 }
            r0 = r19
            r4.append(r0)     // Catch:{ all -> 0x02a4 }
            r4.append(r1)     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x02a4 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02a4 }
            r18.close()     // Catch:{ all -> 0x02ae }
            r3.close()
            r0 = -1
            return r0
        L_0x0290:
            r9 = 1
            X.1iO r0 = new X.1iO     // Catch:{ all -> 0x02a4 }
            r6 = r0
            r7 = r4
            r8 = r5
            r10 = r1
            r6.<init>(r7, r8, r9, r10)     // Catch:{ all -> 0x02a4 }
            r3.B5o(r0)     // Catch:{ all -> 0x02a4 }
            r18.close()     // Catch:{ all -> 0x02ae }
        L_0x02a0:
            r3.close()
            return r1
        L_0x02a4:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x02a9 }
            goto L_0x02ad
        L_0x02a9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02ae }
        L_0x02ad:
            throw r1     // Catch:{ all -> 0x02ae }
        L_0x02ae:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x02b3 }
            throw r1
        L_0x02b3:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219712j.A07(com.whatsapp.jid.Jid):long");
    }

    public Jid A0A(Cursor cursor, C26901Ly r14, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        long j2 = j;
        if (j <= 0) {
            return null;
        }
        Map map = this.A03;
        Long valueOf = Long.valueOf(j2);
        if (map.containsKey(valueOf)) {
            return (Jid) map.get(valueOf);
        }
        Jid A022 = A02(cursor, i, i2, i3, i4, i5, i6);
        if (A022 == null) {
            return A022;
        }
        if (((AnonymousClass1M0) r14).A02.A00.inTransaction()) {
            r14.B5o(new C35251iO(this, A022, 3, j2));
            return A022;
        }
        A05(this, A022, j2);
        return A022;
    }

    public HashMap A0D(Class cls, Collection collection) {
        Class cls2;
        Cursor A09;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            cls2 = cls;
            if (!it.hasNext()) {
                break;
            }
            Number number = (Number) it.next();
            long longValue = number.longValue();
            if (this.A03.containsKey(number)) {
                hashMap.put(number, A0C(cls2, longValue));
            } else {
                arrayList.add(Long.toString(longValue));
            }
        }
        AnonymousClass72Z r1 = new AnonymousClass72Z(arrayList.toArray(C19430v1.A0N), 975);
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            Iterator it2 = r1.iterator();
            while (it2.hasNext()) {
                String[] strArr = (String[]) it2.next();
                C224114e r4 = A042.A02;
                int length = strArr.length;
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT _id, user, server, agent, device, type, raw_string FROM jid WHERE _id IN ");
                sb.append(AnonymousClass1M2.A00(length));
                A09 = r4.A09(sb.toString(), "GET_JIDS_BY_ROW_IDS_SQL", strArr);
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = A09.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("server");
                int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("agent");
                int columnIndexOrThrow5 = A09.getColumnIndexOrThrow("device");
                int columnIndexOrThrow6 = A09.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                int columnIndexOrThrow7 = A09.getColumnIndexOrThrow("raw_string");
                while (A09.moveToNext()) {
                    long j = A09.getLong(columnIndexOrThrow);
                    hashMap.put(Long.valueOf(j), A0B(A09, A042, cls2, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, columnIndexOrThrow7, j));
                }
                A09.close();
            }
            A042.close();
            for (Object next : collection) {
                if (!hashMap.containsKey(next)) {
                    hashMap.put(next, (Object) null);
                }
            }
            return hashMap;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C219712j(C19700wN r2, AnonymousClass12P r3, C219612i r4) {
        this.A00 = r2;
        this.A04 = r4;
        this.A01 = r3;
    }

    public static Jid A02(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        String A042 = A04(cursor, i);
        String A043 = A04(cursor, i2);
        int i8 = cursor.getInt(i3);
        if (cursor.isNull(i4)) {
            i7 = 0;
        } else {
            i7 = cursor.getInt(i4);
        }
        int i9 = cursor.getInt(i5);
        String A044 = A04(cursor, i6);
        try {
            C222613p r0 = Jid.JID_FACTORY;
            Jid A002 = C222513o.A00(A044);
            if (i9 == 0) {
                if (A002 instanceof DeviceJid) {
                    A002 = ((DeviceJid) A002).userJid;
                }
            } else if (i9 == 17 && (A002 instanceof UserJid)) {
                A002 = DeviceJid.of(A002);
                C18740tg.A06(A002);
            }
            if (AnonymousClass14B.A0G(A042, A002.user) && AnonymousClass14B.A0G(A043, A002.getServer()) && i8 == A002.getAgent() && i7 == A002.getDevice() && i9 == A002.getType()) {
                return A002;
            }
            A06("jidstore/readjidfromcursor/cursormismatch", A042, A043, A044, i8, i7, i9);
            return null;
        } catch (C19740wR unused) {
            if (i9 == 11 && TextUtils.isEmpty(A042) && TextUtils.isEmpty(A043) && i8 == 0 && i7 == 0 && TextUtils.isEmpty(A044)) {
                return C223613z.A00;
            }
            A06("jidstore/readjidfromcursor/invalidjid", A042, A043, A044, i8, i7, i9);
            return null;
        }
    }

    public Jid A0C(Class cls, long j) {
        try {
            return (Jid) cls.cast(A09(j));
        } catch (ClassCastException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("JidStore/readJidByRowId/jid wrong class; rowId=");
            sb.append(j);
            sb.append("; db_data=");
            sb.append(A03(j));
            Log.e(sb.toString(), e);
            this.A00.A0E("JidStore/readJidByRowId", "invalid-jid-in-store", true);
            return null;
        }
    }
}
