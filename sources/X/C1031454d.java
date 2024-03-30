package X;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.54d  reason: invalid class name and case insensitive filesystem */
public class C1031454d extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;
    public final C19660wJ A02;

    public C1031454d(Context context, C19700wN r4, AnonymousClass11g r5, AnonymousClass12S r6, Set set) {
        super(context, r4, "payments.db", 4);
        this.A01 = r6;
        this.A00 = r5;
        this.A02 = new C19660wJ(new C18910u1(set, (AnonymousClass004) null));
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("PAY: creating payments database version 4");
        sQLiteDatabase.execSQL("CREATE TABLE methods (credential_id TEXT NOT NULL PRIMARY KEY, country TEXT, readable_name TEXT, issuer_name TEXT, type INTEGER NOT NULL, subtype INTEGER, creation_ts INTEGER, updated_ts INTEGER, debit_mode INTEGER NOT NULL, credit_mode INTEGER NOT NULL, balance_1000 INTEGER, balance_ts INTEGER, country_data TEXT, icon BLOB, p2m_debit_mode INTEGER NOT NULL DEFAULT 0, p2m_credit_mode INTEGER NOT NULL DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_methods_index ON methods (credential_id)");
        sQLiteDatabase.execSQL("CREATE TABLE tmp_transactions (tmp_id TEXT NOT NULL, tmp_metadata TEXT, tmp_ts INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transactions_index ON tmp_transactions (tmp_id)");
        sQLiteDatabase.execSQL("CREATE TABLE contacts (jid NOT NULL, country_data TEXT, merchant INTEGER, consumer_status INTEGER, default_payment_type INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_constacts_index ON contacts (jid)");
    }

    public C224114e A07() {
        try {
            String databaseName = getDatabaseName();
            return C224014d.A01(super.A02(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open payment store", e);
            new SQLiteCantOpenDatabaseException();
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                AnonymousClass16S r1 = ((C117155ln) it.next()).A00;
                synchronized (r1) {
                    C1031454d r0 = r1.A00;
                    if (r0 != null) {
                        r0.A05();
                    }
                    r1.A09 = false;
                }
            }
            String databaseName2 = getDatabaseName();
            return C224014d.A01(super.A02(), this.A00, this.A01, databaseName2);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentDbHelper/onDowngrade/oldVersion:");
        A0u.append(i);
        C36321k7.A1T(", newVersion:", A0u, i2);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS methods");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tmp_transactions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String A012 = C132766Ve.A01(sQLiteDatabase, "methods");
        if (!TextUtils.isEmpty(A012)) {
            C132766Ve.A03(sQLiteDatabase, A012, "methods", PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "BLOB");
        }
        String A013 = C132766Ve.A01(sQLiteDatabase, "contacts");
        if (!TextUtils.isEmpty(A013)) {
            C132766Ve.A03(sQLiteDatabase, A013, "contacts", "merchant", "INTEGER");
            C132766Ve.A03(sQLiteDatabase, A013, "contacts", "default_payment_type", "INTEGER");
            C132766Ve.A03(sQLiteDatabase, A013, "contacts", "consumer_status", "INTEGER");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentDbHelper/onUpgrade/old version: ");
        A0u.append(i);
        C36321k7.A1T(", new version: ", A0u, i2);
        if (i == 1 || i == 2) {
            sQLiteDatabase.execSQL("ALTER TABLE methods ADD p2m_debit_mode  INTEGER NOT NULL DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE methods ADD p2m_credit_mode  INTEGER NOT NULL DEFAULT 0");
        } else if (i != 3) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("PaymentDbHelper/onUpgrade/Unknown upgrade from ");
            A0u2.append(i);
            throw new SQLiteException(AnonymousClass000.A0r(" to ", A0u2, i2));
        }
    }
}
