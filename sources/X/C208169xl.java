package X;

import android.app.Activity;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9xl  reason: invalid class name and case insensitive filesystem */
public final class C208169xl implements C158927iT {
    public static final ReentrantLock A02 = new ReentrantLock();
    public static volatile C208169xl A03;
    public B0R A00;
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    public void BwL(AnonymousClass026 r8) {
        AnonymousClass00C.A0D(r8, 0);
        synchronized (A02) {
            B0R b0r = this.A00;
            if (b0r != null) {
                ArrayList A0I = AnonymousClass001.A0I();
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C193319Kz r1 = (C193319Kz) it.next();
                    if (r1.A02 == r8) {
                        A0I.add(r1);
                    }
                }
                copyOnWriteArrayList.removeAll(A0I);
                Iterator it2 = A0I.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((C193319Kz) it2.next()).A01;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (AnonymousClass00C.A0J(((C193319Kz) it3.next()).A01, activity)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    b0r.Bkj(activity);
                }
            }
        }
    }

    public C208169xl(B0R b0r) {
        this.A00 = b0r;
        B0R b0r2 = this.A00;
        if (b0r2 != null) {
            b0r2.Bqr(new C208119xg(this));
        }
    }

    public void BnE(Activity activity, AnonymousClass026 r9, Executor executor) {
        Object obj;
        AnonymousClass9V8 r3;
        C36321k7.A0w(activity, executor);
        ReentrantLock reentrantLock = A02;
        reentrantLock.lock();
        try {
            B0R b0r = this.A00;
            if (b0r == null) {
                r9.accept(new AnonymousClass9V8(C023409w.A00));
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                boolean z = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AnonymousClass00C.A0J(((C193319Kz) it.next()).A01, activity)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                C193319Kz r4 = new C193319Kz(activity, r9, executor);
                copyOnWriteArrayList.add(r4);
                if (!z) {
                    C208139xi r32 = (C208139xi) b0r;
                    IBinder A002 = AnonymousClass93T.A00(activity);
                    if (A002 != null) {
                        r32.A02(activity, A002);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new C207339uw(activity, r32));
                    }
                } else {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    do {
                        obj = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        obj = it2.next();
                    } while (!activity.equals(((C193319Kz) obj).A01));
                    C193319Kz r1 = (C193319Kz) obj;
                    if (!(r1 == null || (r3 = r1.A00) == null)) {
                        r4.A00 = r3;
                        r4.A03.execute(new AnonymousClass75C((Object) r4, (Object) r3, 9));
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
