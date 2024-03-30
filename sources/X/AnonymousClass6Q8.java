package X;

import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.6Q8  reason: invalid class name */
public abstract class AnonymousClass6Q8 {
    public C162147o6 A00;
    public List A01;
    public Map A02 = C36431kI.A1G();
    public Executor A03;
    public Executor A04;
    public boolean A05;
    public final AnonymousClass65D A06 = new AnonymousClass65D(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    public final Map A07;
    public final ReentrantReadWriteLock A08 = new ReentrantReadWriteLock();
    public final ThreadLocal A09 = new ThreadLocal();
    public final Map A0A;
    public volatile C162177o9 A0B;

    public C162147o6 A02() {
        C162147o6 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("internalOpenHelper");
    }

    public void A04() {
        if (!this.A05 && C90514aH.A11() == Thread.currentThread()) {
            throw AnonymousClass001.A09("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public AnonymousClass6Q8() {
        Map synchronizedMap = Collections.synchronizedMap(C36431kI.A1G());
        AnonymousClass00C.A08(synchronizedMap);
        this.A0A = synchronizedMap;
        this.A07 = C36431kI.A1G();
    }

    public static SQLiteDatabase A00(AnonymousClass6Q8 r0) {
        return ((C138616iP) ((C91044bM) ((C138666iU) r0.A02()).A04.getValue()).A00()).A00;
    }

    public static final void A01(AnonymousClass6Q8 r2) {
        A00(r2).endTransaction();
        if (!A00(r2).inTransaction()) {
            AnonymousClass65D r22 = r2.A06;
            if (C90504aG.A1Z(r22.A04)) {
                Executor executor = r22.A01.A03;
                if (executor == null) {
                    throw C36331k8.A0d("internalQueryExecutor");
                }
                executor.execute(r22.A03);
            }
        }
    }

    public Object A03(Callable callable) {
        A06();
        try {
            Object call = callable.call();
            A07();
            return call;
        } finally {
            A01(this);
        }
    }

    public void A05() {
        if (!A00(this).inTransaction() && this.A09.get() != null) {
            throw AnonymousClass001.A09("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void A06() {
        A04();
        A04();
        C162177o9 A002 = ((C91044bM) ((C138666iU) A02()).A04.getValue()).A00();
        this.A06.A00(A002);
        SQLiteDatabase sQLiteDatabase = ((C138616iP) A002).A00;
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            sQLiteDatabase.beginTransactionNonExclusive();
        } else {
            sQLiteDatabase.beginTransaction();
        }
    }

    public void A07() {
        ((C138616iP) ((C91044bM) ((C138666iU) A02()).A04.getValue()).A00()).A00.setTransactionSuccessful();
    }
}
