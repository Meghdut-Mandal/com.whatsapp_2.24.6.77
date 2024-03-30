package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.A0q  reason: case insensitive filesystem */
public class C20957A0q implements Reference {
    public AnonymousClass9GR A00;
    public Object A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public void release() {
        int i = 0;
        do {
            AtomicInteger atomicInteger = this.A02;
            int i2 = atomicInteger.get();
            if (i2 == 0) {
                throw AnonymousClass001.A09("Too many calls to CountedReference#release");
            } else if (!atomicInteger.compareAndSet(i2, i2 - 1)) {
                i++;
            } else if (i2 == 1) {
                AnonymousClass9GR r1 = this.A00;
                ((AnonymousClass9UW) this.A01).A00();
                r1.A00.offer(this);
                return;
            } else {
                return;
            }
        } while (i < 10);
        throw C90514aH.A0s("WTF: Could not release the reference after multiple tries.");
    }

    public void finalize() {
        if (this.A02.getAndSet(0) > 0) {
            AnonymousClass9GR r1 = this.A00;
            ((AnonymousClass9UW) this.A01).A00();
            r1.A00.offer(this);
        }
        super.finalize();
    }

    public Object get() {
        if (this.A02.get() > 0) {
            return this.A01;
        }
        throw AnonymousClass001.A09("Accessing released reference.");
    }

    public C20957A0q(AnonymousClass9GR r3, Object obj) {
        this.A01 = obj;
        this.A00 = r3;
    }
}
