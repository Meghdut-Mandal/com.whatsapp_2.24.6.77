package X;

import android.util.Log;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9ip  reason: invalid class name and case insensitive filesystem */
public final class C201089ip {
    public static final ReentrantLock A02 = new ReentrantLock();
    public static volatile C201089ip A03;
    public Set A00;
    public final C22766Avc A01;

    public final void A00(C53012qZ r4) {
        C208089xd r2 = (C208089xd) this.A01;
        CopyOnWriteArraySet copyOnWriteArraySet = r2.A03;
        if (!copyOnWriteArraySet.contains(r4)) {
            copyOnWriteArraySet.add(r4);
            B0Q b0q = r2.A00;
            if (b0q != null) {
                b0q.BsH(copyOnWriteArraySet);
            }
        }
    }

    public C201089ip() {
        C208109xf r0;
        if (C208089xd.A05 == null) {
            ReentrantLock reentrantLock = C208089xd.A04;
            reentrantLock.lock();
            try {
                if (C208089xd.A05 == null) {
                    C208109xf r5 = null;
                    C201019ie r2 = C208109xf.A03;
                    Integer A002 = C201019ie.A00();
                    if (A002 != null && A002.intValue() >= 1 && C201019ie.A01()) {
                        ClassLoader classLoader = C22766Avc.class.getClassLoader();
                        if (classLoader != null) {
                            r0 = new C208109xf(new C190969Ba(classLoader), new AnonymousClass9TL(new AnonymousClass9P6(classLoader)), r2.A02());
                        } else {
                            r0 = null;
                        }
                        r5 = r0;
                        if (r0 == null) {
                        }
                        C208089xd.A05 = new C208089xd(r5);
                    }
                    Log.d("EmbeddingBackend", "No supported embedding extension found");
                    C208089xd.A05 = new C208089xd(r5);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
            reentrantLock.unlock();
        }
        C208089xd r02 = C208089xd.A05;
        AnonymousClass00C.A0B(r02);
        this.A01 = r02;
        this.A00 = C004702c.A00;
    }
}
