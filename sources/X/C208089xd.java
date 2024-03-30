package X;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9xd  reason: invalid class name and case insensitive filesystem */
public final class C208089xd implements C22766Avc {
    public static final ReentrantLock A04 = new ReentrantLock();
    public static volatile C208089xd A05;
    public B0Q A00;
    public final C208099xe A01;
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();
    public final CopyOnWriteArraySet A03;

    public C208089xd(B0Q b0q) {
        this.A00 = b0q;
        C208099xe r1 = new C208099xe(this);
        this.A01 = r1;
        B0Q b0q2 = this.A00;
        if (b0q2 != null) {
            b0q2.Bqp(r1);
        }
        this.A03 = new CopyOnWriteArraySet();
    }
}
