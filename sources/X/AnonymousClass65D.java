package X;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.65D  reason: invalid class name */
public class AnonymousClass65D {
    public final C001800t A00;
    public final AnonymousClass6Q8 A01;
    public final Object A02;
    public final Runnable A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final C118415nr A05;
    public final C125215zV A06 = new C125215zV();
    public final Object A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public volatile C161957nk A0B;
    public volatile boolean A0C;

    public final void A00(C162177o9 r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (!((C138616iP) r4).A00.inTransaction()) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.A01.A08.readLock();
                AnonymousClass00C.A08(readLock);
                readLock.lock();
                try {
                    synchronized (this.A07) {
                        synchronized (this.A06) {
                        }
                    }
                    readLock.unlock();
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }

    public AnonymousClass65D(AnonymousClass6Q8 r6, Map map, Map map2, String... strArr) {
        this.A01 = r6;
        this.A08 = map;
        this.A0A = map2;
        int i = 0;
        this.A05 = new C118415nr(r6);
        this.A00 = new C001800t();
        this.A07 = C36441kJ.A11();
        this.A02 = C36441kJ.A11();
        this.A09 = C36431kI.A1G();
        do {
            String str = strArr[i];
            Locale locale = Locale.US;
            AnonymousClass00C.A09(locale);
            this.A09.put(C36431kI.A1D(locale, str), Integer.valueOf(i));
            String A1A = C36431kI.A1A(strArr[i], this.A08);
            if (A1A != null) {
                Locale locale2 = Locale.US;
                AnonymousClass00C.A09(locale2);
                AnonymousClass00C.A08(A1A.toLowerCase(locale2));
            }
            i++;
        } while (i < 7);
        Iterator A0y = AnonymousClass000.A0y(this.A08);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String A10 = C90514aH.A10(A11);
            Locale locale3 = Locale.US;
            AnonymousClass00C.A09(locale3);
            String A1D = C36431kI.A1D(locale3, A10);
            if (this.A09.containsKey(A1D)) {
                String A0f = C90494aF.A0f(A11);
                Locale locale4 = Locale.US;
                AnonymousClass00C.A09(locale4);
                String A1D2 = C36431kI.A1D(locale4, A0f);
                Map map3 = this.A09;
                map3.put(A1D2, C90494aF.A0Y(A1D, map3));
            }
        }
        this.A03 = new AnonymousClass759((Object) this, 14);
    }
}
