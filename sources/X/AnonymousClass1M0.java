package X;

import android.database.sqlite.SQLiteTransactionListener;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1M0  reason: invalid class name */
public class AnonymousClass1M0 implements C26911Lz {
    public boolean A00 = false;
    public final C219512b A01;
    public final C224114e A02;
    public final ReentrantReadWriteLock.ReadLock A03;

    @Deprecated
    public C1495671s A00() {
        return new C1495671s((SQLiteTransactionListener) null, this.A01, this.A02);
    }

    public C1495671s B1k() {
        Boolean bool = C18750th.A03;
        C18740tg.A00();
        return new C1495671s((SQLiteTransactionListener) null, this.A01, this.A02);
    }

    public void B5o(Runnable runnable) {
        C18740tg.A0C(this.A02.A00.inTransaction());
        C219512b r3 = this.A01;
        Object obj = new Object();
        AnonymousClass6UJ r1 = new AnonymousClass6UJ(r3, runnable, 0);
        Object obj2 = r3.A02.get();
        C18740tg.A06(obj2);
        ((AbstractMap) obj2).put(obj, r1);
    }

    public void close() {
        if (!this.A00) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03;
            if (readLock != null) {
                Thread.currentThread().getId();
                readLock.unlock();
            }
            this.A00 = true;
        }
    }

    public AnonymousClass1M0(AnonymousClass12e r3, ReentrantReadWriteLock.ReadLock readLock, boolean z) {
        this.A03 = readLock;
        this.A01 = r3.BEj();
        if (readLock != null) {
            readLock.lock();
            Thread.currentThread().getId();
        }
        if (z) {
            try {
                this.A02 = r3.BJK();
            } catch (Throwable th) {
                Log.e("DatabaseSession/failed to get database", th);
                close();
                throw th;
            }
        } else {
            this.A02 = r3.BGW();
        }
    }
}
