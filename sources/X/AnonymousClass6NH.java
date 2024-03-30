package X;

import android.content.Context;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.6NH  reason: invalid class name */
public class AnonymousClass6NH {
    public static final String A06 = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY, %s TEXT NOT NULL, %s INTEGER DEFAULT 0);", new Object[]{"queue", "_id", "item", "encrypted"});
    public final Context A00;
    public final C116465kd A01;
    public final ReentrantReadWriteLock A02 = new ReentrantReadWriteLock();
    public final C91034bL A03;
    public final AnonymousClass5ZT A04;
    public final AnonymousClass6HV A05;

    public void A00(long j) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.readLock().lock();
            this.A03.getWritableDatabase().delete("queue", "_id = ?", C36341k9.A1b(j));
            reentrantReadWriteLock.readLock().unlock();
        } catch (Throwable th) {
            this.A02.readLock().unlock();
            throw th;
        }
    }

    public AnonymousClass6NH(Context context, C116465kd r4, AnonymousClass5ZT r5, String str, AnonymousClass6HV r7) {
        this.A03 = new C91034bL(context, AnonymousClass000.A0p("_jobqueue-", str, AnonymousClass000.A0u()));
        this.A00 = context;
        this.A04 = r5;
        this.A05 = r7;
        this.A01 = r4;
    }
}
