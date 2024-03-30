package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.12f  reason: invalid class name */
public class AnonymousClass12f extends SQLiteOpenHelper implements AnonymousClass12e {
    public static final String[] A0D = {"messages", "messages_fts", "messages_links", "quoted_message_order", "quoted_message_product", "messages_quotes", "messages_vcards", "messages_vcards_jids", "pay_transactions", "messages_quotes_payment_invite_legacy", "message_quoted_ui_elements_reply_legacy", "message_quoted_group_invite_legacy", "receipts", "group_participants", "chat_list", "conversion_tuples", "status_list", "group_participants_history"};
    public C224114e A00;
    public Boolean A01;
    public Integer A02;
    public boolean A03;
    public final C19700wN A04;
    public final C219512b A05;
    public final AnonymousClass12Z A06;
    public final AnonymousClass11g A07;
    public final AnonymousClass12S A08;
    public final C19660wJ A09;
    public final AnonymousClass005 A0A;
    public final File A0B;
    public final Object A0C = new Object();

    public synchronized C224114e BGW() {
        return BJK();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: X.78M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: android.database.sqlite.SQLiteException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: android.database.sqlite.SQLiteException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: android.database.sqlite.SQLiteException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: android.database.sqlite.SQLiteFullException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: android.database.sqlite.SQLiteException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: android.database.sqlite.SQLiteException} */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0123, code lost:
        if (r9 != false) goto L_0x0125;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C224114e BJK() {
        /*
            r11 = this;
            r10 = r11
            monitor-enter(r10)     // Catch:{ all -> 0x034a }
            boolean r0 = r11.A03     // Catch:{ all -> 0x0347 }
            if (r0 != 0) goto L_0x0016
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x001c
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0347 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x001c
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            goto L_0x0345
        L_0x0016:
            X.78M r1 = new X.78M     // Catch:{ all -> 0x0347 }
            r1.<init>()     // Catch:{ all -> 0x0347 }
            goto L_0x0069
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0347 }
            r1.<init>()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "databasehelper/open-existing-db"
            r1.append(r0)     // Catch:{ all -> 0x0347 }
            java.io.File r3 = r11.A0B     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x0347 }
            r1.append(r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0347 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0347 }
            r9 = 0
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = "databasehelper/open-existing-db/no-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0347 }
            r1.<init>()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "Message store missing, no message store file"
            r1.append(r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x0347 }
            r1.append(r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0347 }
            android.database.sqlite.SQLiteCantOpenDatabaseException r0 = new android.database.sqlite.SQLiteCantOpenDatabaseException     // Catch:{ all -> 0x0347 }
            r0.<init>(r1)     // Catch:{ all -> 0x0347 }
            A01(r0, r11)     // Catch:{ all -> 0x0347 }
        L_0x005f:
            r11.close()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "Unable to open writable db: failed to open db"
            android.database.sqlite.SQLiteException r1 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0347 }
            r1.<init>(r0)     // Catch:{ all -> 0x0347 }
        L_0x0069:
            throw r1     // Catch:{ all -> 0x0347 }
        L_0x006a:
            r8 = 0
            r5 = -1
            r7 = 0
        L_0x006d:
            r2 = 0
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r6 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            X.C18740tg.A06(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            java.lang.String r4 = r11.getDatabaseName()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            X.12S r1 = r11.A08     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            X.11g r0 = r11.A07     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            X.14e r0 = X.C224014d.A01(r6, r0, r1, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            r11.A00 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            X.C18740tg.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            int r5 = r0.getVersion()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            java.lang.String r0 = "databasehelper/open-existing-db/version "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            r1.append(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00a8 }
            goto L_0x00ce
        L_0x00a8:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0347 }
            r1.<init>()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "databasehelper/open-existing-db/nodb/sqlerror"
            r1.append(r0)     // Catch:{ all -> 0x0347 }
            if (r8 != 0) goto L_0x00b8
            java.lang.String r0 = "/will-retry "
            goto L_0x00ba
        L_0x00b8:
            java.lang.String r0 = " "
        L_0x00ba:
            r1.append(r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0347 }
            com.whatsapp.util.Log.w(r0, r4)     // Catch:{ all -> 0x0347 }
            if (r8 <= 0) goto L_0x00d1
            goto L_0x00d8
        L_0x00c7:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/open-existing-db/corrupt"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0347 }
            r5 = -1
        L_0x00ce:
            if (r7 == 0) goto L_0x00e0
            goto L_0x00d2
        L_0x00d1:
            r7 = 1
        L_0x00d2:
            int r0 = r8 + 1
            if (r8 != 0) goto L_0x00e0
            r8 = r0
            goto L_0x006d
        L_0x00d8:
            java.lang.String r0 = "databasehelper/open-existing-db/stack"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
            X.C224714l.A01()     // Catch:{ all -> 0x0347 }
        L_0x00e0:
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x00e8
            if (r5 <= 0) goto L_0x00e8
            r9 = 1
            goto L_0x0105
        L_0x00e8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0347 }
            r1.<init>()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "Can't open message store file "
            r1.append(r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x0347 }
            r1.append(r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0347 }
            android.database.sqlite.SQLiteCantOpenDatabaseException r0 = new android.database.sqlite.SQLiteCantOpenDatabaseException     // Catch:{ all -> 0x0347 }
            r0.<init>(r1)     // Catch:{ all -> 0x0347 }
            A01(r0, r11)     // Catch:{ all -> 0x0347 }
        L_0x0105:
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x0123
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0347 }
            boolean r0 = r0.isReadOnly()     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = "databasehelper/open-existing-db/ is read only"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
        L_0x0116:
            if (r9 != 0) goto L_0x0125
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0347 }
            r0.close()     // Catch:{ all -> 0x0347 }
            r11.A00 = r2     // Catch:{ all -> 0x0347 }
            goto L_0x005f
        L_0x0123:
            if (r9 == 0) goto L_0x005f
        L_0x0125:
            java.lang.String r1 = "databasehelper/canQueryDb"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0347 }
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x0336
            X.14g r4 = new X.14g     // Catch:{ all -> 0x0347 }
            r4.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0347 }
            android.database.sqlite.SQLiteDatabase r1 = r0.A00     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            java.lang.String r0 = "SELECT EXISTS (SELECT 1 FROM message LIMIT 1)"
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r0)     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            long r5 = r0.simpleQueryForLong()     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r5 = 0
            if (r0 < 0) goto L_0x0147
            r5 = 1
        L_0x0147:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            r2.<init>()     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            java.lang.String r0 = "databasehelper/canQueryDb "
            r2.append(r0)     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            r2.append(r5)     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            java.lang.String r0 = " | time spent:"
            r2.append(r0)     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            long r0 = r4.A01()     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            r2.append(r0)     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            java.lang.String r0 = r2.toString()     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDoneException -> 0x01ba, SQLiteFullException -> 0x01b4, SQLiteDatabaseCorruptException -> 0x017d, SQLiteException -> 0x016a }
            if (r5 == 0) goto L_0x01a8
            goto L_0x01d2
        L_0x016a:
            r2 = move-exception
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "file is encrypted"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x033f
            java.lang.String r0 = "databasehelper/canQueryDb/cursor/encrypted-file-error"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
            goto L_0x0183
        L_0x017d:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/canQueryDb/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0347 }
        L_0x0183:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0347 }
            r2.<init>()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "databasehelper/canQueryDb/nocursor | time spent:"
            r2.append(r0)     // Catch:{ all -> 0x0347 }
            long r0 = r4.A01()     // Catch:{ all -> 0x0347 }
            r2.append(r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0347 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "databasehelper/canQueryDb/deletedb"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
            r3.delete()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "databasehelper"
            X.C224014d.A04(r3, r0)     // Catch:{ all -> 0x0347 }
        L_0x01a8:
            r11.close()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "Unable to open writable db: failed to query db"
            android.database.sqlite.SQLiteException r1 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0347 }
            r1.<init>(r0)     // Catch:{ all -> 0x0347 }
            goto L_0x0069
        L_0x01b4:
            r1 = move-exception
            A01(r1, r11)     // Catch:{ all -> 0x0347 }
            goto L_0x0069
        L_0x01ba:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0347 }
            r2.<init>()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "databasehelper/canQueryDb/noRow | time spent:"
            r2.append(r0)     // Catch:{ all -> 0x0347 }
            long r0 = r4.A01()     // Catch:{ all -> 0x0347 }
            r2.append(r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0347 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
        L_0x01d2:
            X.12Z r0 = r11.A06     // Catch:{ all -> 0x0347 }
            boolean r0 = r0.A06     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = "databasehelper/canUpdateDb skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
            goto L_0x022c
        L_0x01de:
            java.lang.String r0 = "databasehelper/canUpdateDb"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
            X.14g r4 = new X.14g     // Catch:{ all -> 0x0347 }
            r4.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
            X.14e r0 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            if (r0 == 0) goto L_0x02e1
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            X.14e r2 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            java.lang.String r1 = "UPDATE message SET receipt_server_timestamp = -1 WHERE _id = 1"
            java.lang.String r0 = "DB_HELPER_CAN_UPDATE_DB"
            r2.A0D(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            X.14e r0 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            r2.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            java.lang.String r0 = "databasehelper/canUpdateDb | time spent:"
            r2.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            long r0 = r4.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            r2.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            java.lang.String r0 = r2.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x022c
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0347 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x022c
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0347 }
            r0.endTransaction()     // Catch:{ all -> 0x0347 }
        L_0x022c:
            X.14e r1 = r11.A00     // Catch:{ SQLiteException -> 0x02d9 }
            if (r1 == 0) goto L_0x02d1
            java.lang.String r0 = "databasehelper/prepareWritableDatabase"
            X.14g r3 = new X.14g     // Catch:{ SQLiteException -> 0x02d9 }
            r3.<init>((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x02d9 }
            java.lang.String r4 = "msgtore_db_schema_version"
            boolean r0 = r11.A08(r1, r4)     // Catch:{ SQLiteException -> 0x02d9 }
            if (r0 != 0) goto L_0x029c
            X.14e r0 = r11.A00     // Catch:{ SQLiteException -> 0x02d9 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteException -> 0x02d9 }
            r0.beginTransaction()     // Catch:{ SQLiteException -> 0x02d9 }
            X.38G r0 = A00(r11)     // Catch:{ all -> 0x0286 }
            X.38H r1 = new X.38H     // Catch:{ all -> 0x0286 }
            r1.<init>(r0)     // Catch:{ all -> 0x0286 }
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0286 }
            r11.A03(r0, r1)     // Catch:{ all -> 0x0286 }
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0286 }
            r11.A06(r0, r1)     // Catch:{ all -> 0x0286 }
            r3.A00()     // Catch:{ all -> 0x0286 }
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0286 }
            r11.A05(r0)     // Catch:{ all -> 0x0286 }
            r3.A00()     // Catch:{ all -> 0x0286 }
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0286 }
            r11.A07(r0, r1)     // Catch:{ all -> 0x0286 }
            r3.A00()     // Catch:{ all -> 0x0286 }
            X.14e r2 = r11.A00     // Catch:{ all -> 0x0286 }
            java.lang.String r1 = "Consumer-acf654a9551f9650b5d041186562fb72"
            java.lang.String r0 = "DatabaseHelper"
            X.AnonymousClass14m.A03(r2, r4, r1, r0)     // Catch:{ all -> 0x0286 }
            r3.A00()     // Catch:{ all -> 0x0286 }
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0286 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0286 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0286 }
            r3.A00()     // Catch:{ all -> 0x0286 }
            r3.A00()     // Catch:{ all -> 0x0286 }
            goto L_0x0292
        L_0x0286:
            r1 = move-exception
            X.14e r0 = r11.A00     // Catch:{ SQLiteException -> 0x02d9 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteException -> 0x02d9 }
            r0.endTransaction()     // Catch:{ SQLiteException -> 0x02d9 }
            r3.A01()     // Catch:{ SQLiteException -> 0x02d9 }
            throw r1     // Catch:{ SQLiteException -> 0x02d9 }
        L_0x0292:
            X.14e r0 = r11.A00     // Catch:{ SQLiteException -> 0x02d9 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteException -> 0x02d9 }
            r0.endTransaction()     // Catch:{ SQLiteException -> 0x02d9 }
            r3.A01()     // Catch:{ SQLiteException -> 0x02d9 }
        L_0x029c:
            X.0wJ r0 = r11.A09     // Catch:{ SQLiteException -> 0x02d9 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ SQLiteException -> 0x02d9 }
        L_0x02a2:
            boolean r0 = r3.hasNext()     // Catch:{ SQLiteException -> 0x02d9 }
            if (r0 == 0) goto L_0x02c1
            java.lang.Object r0 = r3.next()     // Catch:{ SQLiteException -> 0x02d9 }
            X.12a r0 = (X.AnonymousClass12a) r0     // Catch:{ SQLiteException -> 0x02d9 }
            X.0wh r0 = r0.A01     // Catch:{ SQLiteException -> 0x02d9 }
            r2 = 0
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ SQLiteException -> 0x02d9 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ SQLiteException -> 0x02d9 }
            java.lang.String r0 = "force_db_check"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)     // Catch:{ SQLiteException -> 0x02d9 }
            r0.apply()     // Catch:{ SQLiteException -> 0x02d9 }
            goto L_0x02a2
        L_0x02c1:
            X.14e r0 = r11.A00     // Catch:{ SQLiteException -> 0x02c9 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteException -> 0x02c9 }
            r11.onOpen(r0)     // Catch:{ SQLiteException -> 0x02c9 }
            goto L_0x0340
        L_0x02c9:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getWritableLoggableDatabase/onopen"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0347 }
            goto L_0x0069
        L_0x02d1:
            java.lang.String r1 = "databasehelper/prepareWritableDatabase/database is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SQLiteException -> 0x02d9 }
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x02d9 }
            throw r0     // Catch:{ SQLiteException -> 0x02d9 }
        L_0x02d9:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getWritableLoggableDatabase/prepare"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0347 }
            goto L_0x0069
        L_0x02e1:
            java.lang.String r1 = "databasehelper/canUpdateDb/database is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            r0.<init>(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x02f3, SQLiteFullException -> 0x02ee, SQLiteException -> 0x02e9 }
        L_0x02e9:
            r0 = move-exception
            A01(r0, r11)     // Catch:{ all -> 0x0320 }
            goto L_0x02f2
        L_0x02ee:
            r0 = move-exception
            A01(r0, r11)     // Catch:{ all -> 0x0320 }
        L_0x02f2:
            throw r0     // Catch:{ all -> 0x0320 }
        L_0x02f3:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/canUpdateDb/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0320 }
            r3.delete()     // Catch:{ all -> 0x0320 }
            java.lang.String r0 = "databasehelper"
            X.C224014d.A04(r3, r0)     // Catch:{ all -> 0x0320 }
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x0314
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0347 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x0314
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0347 }
            r0.endTransaction()     // Catch:{ all -> 0x0347 }
        L_0x0314:
            r11.close()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "Unable to open writable db: failed to update db"
            android.database.sqlite.SQLiteException r1 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0347 }
            r1.<init>(r0)     // Catch:{ all -> 0x0347 }
            goto L_0x0069
        L_0x0320:
            r1 = move-exception
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x0069
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0347 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x0069
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0347 }
            r0.endTransaction()     // Catch:{ all -> 0x0347 }
            goto L_0x0069
        L_0x0336:
            java.lang.String r0 = "databasehelper/canQueryDb/database is not initialized"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0347 }
            r1.<init>(r0)     // Catch:{ all -> 0x0347 }
            goto L_0x0069
        L_0x033f:
            throw r2     // Catch:{ all -> 0x0347 }
        L_0x0340:
            X.14e r0 = r11.A00     // Catch:{ all -> 0x0347 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0347 }
        L_0x0345:
            monitor-exit(r10)     // Catch:{ all -> 0x034a }
            return r0
        L_0x0347:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x034a }
            throw r0     // Catch:{ all -> 0x034a }
        L_0x034a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12f.BJK():X.14e");
    }

    public synchronized void close() {
        C224114e r0 = this.A00;
        if (r0 != null && r0.A00.isOpen()) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/close, ");
            sb.append(this.A00.A00);
            Log.i(sb.toString());
            this.A00.A00.close();
        }
        this.A00 = null;
        this.A02 = null;
    }

    @Deprecated
    public synchronized SQLiteDatabase getReadableDatabase() {
        C18740tg.A0D(false, "Use getReadableLoggableDatabase instead");
        return BGW().A00;
    }

    @Deprecated
    public synchronized SQLiteDatabase getWritableDatabase() {
        C18740tg.A0D(false, "Use getWritableLoggableDatabase instead");
        return BJK().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (this) {
            String databaseName = getDatabaseName();
            C224114e A012 = C224014d.A01(sQLiteDatabase, this.A07, this.A08, databaseName);
            try {
                AnonymousClass6UJ r0 = new AnonymousClass6UJ(this, atomicBoolean, 1);
                SQLiteDatabase sQLiteDatabase2 = A012.A00;
                sQLiteDatabase2.beginTransactionWithListener(r0);
                Log.i("msgstore/create");
                AnonymousClass38H r7 = new AnonymousClass38H(A00(this));
                C65063Qo r2 = new C65063Qo();
                for (AnonymousClass15z B7q : (Set) this.A0A.get()) {
                    B7q.B7q(r7, r2);
                }
                r2.A05(A012, "DatabaseHelper");
                if (TextUtils.isEmpty(C224614k.A00(A012, "table", "props"))) {
                    A012.A0D("CREATE TABLE props (_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT UNIQUE, value TEXT)", "CREATE_PROPS_TABLE");
                }
                AnonymousClass14m.A02(A012, "fts_ready", "DatabaseHelper", 5);
                AnonymousClass14m.A01(A012, "message_streaming_sidecar_timestamp");
                Log.i("DatabaseHelper/using migrated DB");
                AnonymousClass14m.A02(A012, "drop_deprecated_tables_status", "DatabaseHelper", 1);
                A03(A012, r7);
                A06(A012, r7);
                A05(A012);
                A07(A012, r7);
                AnonymousClass14m.A03(A012, "msgtore_db_schema_version", "Consumer-acf654a9551f9650b5d041186562fb72", "DatabaseHelper");
                sQLiteDatabase2.setTransactionSuccessful();
                Iterator it = this.A09.iterator();
                while (it.hasNext()) {
                    AnonymousClass12a r22 = (AnonymousClass12a) it.next();
                    C19420v0.A00((C19420v0) r22.A04.get()).putBoolean("md_messaging_enabled", true).apply();
                    r22.A01.A01.edit().putBoolean("force_db_check", false).apply();
                }
                sQLiteDatabase2.endTransaction();
                this.A00 = A012;
            } catch (Throwable th) {
                A012.A00.endTransaction();
                throw th;
            }
        }
    }

    public AnonymousClass12f(Context context, C19700wN r5, C219512b r6, AnonymousClass12Z r7, AnonymousClass11g r8, AnonymousClass12S r9, AnonymousClass12X r10, File file, Set set) {
        super(context, "msgstore.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A04 = r5;
        this.A08 = r9;
        this.A07 = r8;
        this.A05 = r6;
        this.A0B = file;
        this.A06 = r7;
        this.A0A = r10.A00;
        this.A09 = new C19660wJ(new C18910u1(set, (AnonymousClass004) null));
    }

    public static AnonymousClass38G A00(AnonymousClass12f r3) {
        boolean z;
        AnonymousClass38G r2 = new AnonymousClass38G();
        AnonymousClass12Z r1 = r3.A06;
        synchronized (r1) {
            z = r1.A05;
        }
        r2.A03 = z;
        r2.A00 = r1.A01;
        r2.A01 = r1.A02;
        r2.A02 = r1.A03;
        return r2;
    }

    public static void A01(SQLiteException sQLiteException, AnonymousClass12f r5) {
        AnonymousClass12T r1;
        int i;
        Iterator it = r5.A09.iterator();
        while (it.hasNext()) {
            AnonymousClass12a r2 = (AnonymousClass12a) it.next();
            if (sQLiteException instanceof SQLiteFullException) {
                r1 = r2.A02;
                i = 0;
            } else if (sQLiteException instanceof SQLiteCantOpenDatabaseException) {
                if (r2.A03.A03()) {
                    r1 = r2.A02;
                    i = 2;
                }
            } else if (sQLiteException.toString().contains("unable to open")) {
                r1 = r2.A02;
                i = 3;
            } else if (sQLiteException.toString().contains("attempt to write a readonly database")) {
                r1 = r2.A02;
                i = 4;
            }
            r1.A00(i);
        }
    }

    public static void A02(AnonymousClass12f r9, C224114e r10, AnonymousClass38H r11) {
        C65063Qo r5 = new C65063Qo();
        for (AnonymousClass15z B7n : (Set) r9.A0A.get()) {
            B7n.B7n(r10, r11, r5);
        }
        if (r9.A06.A04) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append("DatabaseHelper");
            sb.append("/SELECT_INDEXES");
            Cursor A092 = r10.A09("SELECT name,sql FROM sqlite_master WHERE type='index'", sb.toString(), new String[0]);
            try {
                int columnIndexOrThrow = A092.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("sql");
                while (A092.moveToNext()) {
                    String string = A092.getString(columnIndexOrThrow2);
                    if (!TextUtils.isEmpty(string)) {
                        String string2 = A092.getString(columnIndexOrThrow);
                        if (!TextUtils.isEmpty(string2)) {
                            String str = (String) r5.A01.get(string2);
                            if (TextUtils.isEmpty(str)) {
                                str = (String) r5.A00.get(string2);
                            }
                            if (TextUtils.isEmpty(str) || !C65063Qo.A00(str).equalsIgnoreCase(C65063Qo.A00(string))) {
                                arrayList.add(string2);
                            }
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DatabaseHelper");
                    sb2.append("/dropExtraIndexes");
                    C224614k.A02(r10, sb2.toString(), (String) it.next());
                }
                A092.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        r5.A03(r10, "DatabaseHelper");
        AnonymousClass14m.A02(r10, "MessagesDBHelper_CreateAsyncIndexes", "DatabaseHelper", 1);
        AnonymousClass14m.A01(r10, "MessagesDBHelper_CreateAsyncIndexesFailedAttempts");
    }

    private void A03(C224114e r5, AnonymousClass38H r6) {
        C224214g r3 = new C224214g("databasehelper/createDatabaseTables");
        r5.A00.setVersion(1);
        C224614k.A03(r5, "DatabaseHelper", "messages_dehydrated_hsm");
        r5.A0D("DROP INDEX IF EXISTS message_view_once_index", "DROP_DEPRECATED_INDEX");
        r5.A0D("DROP TABLE IF EXISTS message_view_once", "DROP_DEPRECATED_TABLE");
        C224614k.A02(r5, "MessagesDBHelper", "jid_key_index");
        C224614k.A02(r5, "MessagesDBHelper", "message_comment_parent_message_row_id_index");
        C224614k.A03(r5, "MessageViewOnceTable", "message_quoted_view_once_media");
        C224614k.A03(r5, "MessageViewOnceTable", "message_quoted_view_once_media_legacy");
        C65063Qo r2 = new C65063Qo();
        for (AnonymousClass15z B7q : (Set) this.A0A.get()) {
            B7q.B7q(r6, r2);
        }
        r2.A02(r5, r6);
        r3.A01();
    }

    public void A04(C26911Lz r6) {
        if (this.A00 != null) {
            C1495671s B1k = r6.B1k();
            try {
                String str = AnonymousClass161.A00[0];
                StringBuilder sb = new StringBuilder();
                sb.append("message_fts");
                sb.append(str);
                String obj = sb.toString();
                C224614k.A03(this.A00, "DatabaseHelper", obj);
                String lowerCase = String.format("%s_bd_for_%s_trigger", new Object[]{"message", obj}).toLowerCase(Locale.getDefault());
                C224114e r2 = this.A00;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DROP TRIGGER IF EXISTS ");
                sb2.append(lowerCase);
                r2.A0D(sb2.toString(), "DROP_OLD_FTS_TABLES_TRIGGERS");
                B1k.A00();
                B1k.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            throw new IllegalStateException("databasehelper/dropOldFtsTables/database is not initialized");
        }
    }

    @Deprecated
    public void A05(C224114e r4) {
        SQLiteDatabase sQLiteDatabase = r4.A00;
        sQLiteDatabase.beginTransaction();
        try {
            r4.A0D("DROP VIEW IF EXISTS available_messages_view", "DROP_DEPRECATED_AVAILABLE_MESSAGES_VIEW");
            r4.A0D("DROP VIEW IF EXISTS message_view", "DROP_VIEW_MESSAGE");
            r4.A0D("DROP VIEW IF EXISTS available_message_view", "DROP_VIEW_AVAILABLE_MESSAGE");
            r4.A0D("DROP VIEW IF EXISTS deleted_messages_view", "DROP_VIEW_DELETED_MESSAGES");
            r4.A0D("DROP VIEW IF EXISTS deleted_messages_ids_view", "DROP_VIEW_DELETED_MESSAGES_IDS");
            r4.A0D("CREATE VIEW message_view AS SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, message_add_on_flags, view_mode, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, NULL AS future_message_type, 2 AS table_version FROM message", "CREATE_MESSAGE_VIEW_FROM_V2");
            r4.A0D("CREATE VIEW available_message_view AS  SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, message_add_on_flags, view_mode, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, NULL AS future_message_type, 2 AS table_version, expire_timestamp, keep_in_chat FROM message LEFT JOIN deleted_chat_job AS job ON job.chat_row_id = message.chat_row_id LEFT JOIN message_ephemeral AS message_ephemeral ON message._id = message_ephemeral.message_row_id WHERE  IFNULL(NOT((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%'))), 0)", "CREATE_AVAILABLE_MESSAGE_VIEW_FROM_V2");
            r4.A0D("CREATE VIEW IF NOT EXISTS deleted_messages_view AS   SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, message_add_on_flags, view_mode, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, NULL AS future_message_type, 2 AS table_version, ((((job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%') AND (job.delete_files_singular_delete== 1)) OR ((job.deleted_messages_remove_files == 1) AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)))) OR ((job.deleted_categories_remove_files == 1) AND ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808))))))) as remove_files FROM  deleted_chat_job AS job JOIN message AS message  ON job.chat_row_id = message.chat_row_id   WHERE  IFNULL((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%')), 0) ORDER BY message._id", "CREATE_DELETED_MESSAGES_VIEW_FROM_V2");
            r4.A0D("CREATE VIEW IF NOT EXISTS deleted_messages_ids_view AS  SELECT message._id, message.sort_id, message.chat_row_id, message.message_type FROM deleted_chat_job AS job  JOIN message AS message  ON job.chat_row_id = message.chat_row_id WHERE  IFNULL((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%')), 0)", "CREATE_DELETED_MESSAGES_IDS_VIEW_FROM_V2");
            r4.A0D("DROP VIEW IF EXISTS chat_view", "DROP_VIEW_CHAT");
            r4.A0D("CREATE VIEW chat_view AS SELECT chat._id AS _id, jid.raw_string AS raw_string_jid, hidden AS hidden, subject AS subject, created_timestamp AS created_timestamp, display_message_row_id AS display_message_row_id, last_message_row_id AS last_message_row_id, last_read_message_row_id AS last_read_message_row_id, last_read_receipt_sent_message_row_id AS last_read_receipt_sent_message_row_id, last_important_message_row_id AS last_important_message_row_id, archived AS archived, sort_timestamp AS sort_timestamp, mod_tag AS mod_tag, gen AS gen, spam_detection AS spam_detection, unseen_earliest_message_received_time AS unseen_earliest_message_received_time, unseen_message_count AS unseen_message_count, unseen_missed_calls_count AS unseen_missed_calls_count, unseen_row_count AS unseen_row_count, unseen_message_reaction_count AS unseen_message_reaction_count, unseen_comment_message_count AS unseen_comment_message_count, last_message_reaction_row_id AS last_message_reaction_row_id, last_seen_message_reaction_row_id AS last_seen_message_reaction_row_id, plaintext_disabled AS plaintext_disabled, vcard_ui_dismissed AS vcard_ui_dismissed, change_number_notified_message_row_id AS change_number_notified_message_row_id, show_group_description AS show_group_description, ephemeral_expiration AS ephemeral_expiration, last_read_ephemeral_message_row_id AS last_read_ephemeral_message_row_id, ephemeral_setting_timestamp AS ephemeral_setting_timestamp, ephemeral_displayed_exemptions AS ephemeral_displayed_exemptions, ephemeral_disappearing_messages_initiator AS ephemeral_disappearing_messages_initiator, unseen_important_message_count AS unseen_important_message_count, group_type AS group_type, growth_lock_level AS growth_lock_level, growth_lock_expiration_ts AS growth_lock_expiration_ts, last_read_message_sort_id AS last_read_message_sort_id, display_message_sort_id AS display_message_sort_id, last_message_sort_id AS last_message_sort_id, last_read_receipt_sent_message_sort_id AS last_read_receipt_sent_message_sort_id, has_new_community_admin_dialog_been_acknowledged AS has_new_community_admin_dialog_been_acknowledged, history_sync_progress AS history_sync_progress, chat_lock AS chat_lock, chat_origin AS chat_origin FROM chat chat LEFT JOIN jid jid ON chat.jid_row_id = jid._id", "CREATE_VIEW_CHAT_V2");
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public void A06(C224114e r4, AnonymousClass38H r5) {
        if (!A08(r4, "msgtore_db_schema_indexes_version")) {
            synchronized (this) {
                A02(this, r4, r5);
                AnonymousClass14m.A03(r4, "msgtore_db_schema_indexes_version", "Consumer-acf654a9551f9650b5d041186562fb72", "DatabaseHelper");
            }
        }
    }

    public void A07(C224114e r4, AnonymousClass38H r5) {
        C65063Qo r2 = new C65063Qo();
        for (AnonymousClass15z B7s : (Set) this.A0A.get()) {
            B7s.B7s(r4, r5, r2);
        }
        r2.A04(r4, "DatabaseHelper");
    }

    public boolean A08(C224114e r3, String str) {
        boolean z;
        AnonymousClass12Z r1 = this.A06;
        synchronized (r1) {
            z = r1.A00;
        }
        if (z) {
            return false;
        }
        String str2 = "";
        if (!TextUtils.isEmpty(C224614k.A00(r3, "table", "props"))) {
            str2 = AnonymousClass14m.A00(r3, str, str2);
        }
        return str2.equals("Consumer-acf654a9551f9650b5d041186562fb72");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/upgrade version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public C219512b BEj() {
        return this.A05;
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery;
        sQLiteDatabase.getVersion();
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
        try {
            rawQuery = sQLiteDatabase.rawQuery("PRAGMA secure_delete=1", (String[]) null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    rawQuery.getInt(0);
                }
                rawQuery.close();
                return;
            }
            return;
        } catch (SQLiteDiskIOException e) {
            Log.e("msgstore/enable_secure_delete", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
