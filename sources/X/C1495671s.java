package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.AbstractMap;

/* renamed from: X.71s  reason: invalid class name and case insensitive filesystem */
public class C1495671s implements Closeable {
    public boolean A00 = false;
    public boolean A01;
    public final C224114e A02;

    public void A00() {
        this.A01 = true;
        this.A02.A00.setTransactionSuccessful();
    }

    public boolean A01() {
        if (!this.A02.A00.inTransaction() || this.A00 || this.A01) {
            return false;
        }
        return true;
    }

    public void close() {
        if (!this.A00) {
            if (!this.A01) {
                Log.w("DatabaseTransaction/close/was not set successful");
            }
            this.A02.A00.endTransaction();
            this.A00 = true;
        }
    }

    public C1495671s(SQLiteTransactionListener sQLiteTransactionListener, C219512b r7, C224114e r8) {
        this.A02 = r8;
        ThreadLocal threadLocal = r7.A01;
        Object obj = threadLocal.get();
        C18740tg.A06(obj);
        if (!AnonymousClass000.A1X(obj)) {
            SQLiteDatabase sQLiteDatabase = r8.A00;
            C18740tg.A0D(!sQLiteDatabase.inTransaction(), "OuterTransactionManager/already-in-transaction");
            sQLiteDatabase.beginTransactionWithListener(r7);
            threadLocal.set(true);
        } else {
            r8.A00.beginTransaction();
        }
        if (sQLiteTransactionListener != null) {
            Object A11 = C36441kJ.A11();
            Object obj2 = r7.A02.get();
            C18740tg.A06(obj2);
            ((AbstractMap) obj2).put(A11, sQLiteTransactionListener);
            sQLiteTransactionListener.onBegin();
        }
    }
}
