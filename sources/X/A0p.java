package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicBoolean;

public class A0p implements Reference {
    public final C20957A0q A00;
    public final AtomicBoolean A01 = C36431kI.A1H();

    public void finalize() {
        if (!this.A01.getAndSet(true)) {
            this.A00.release();
        }
        super.finalize();
    }

    public Object get() {
        if (!this.A01.get()) {
            return this.A00.get();
        }
        throw AnonymousClass001.A09("Accessing released reference.");
    }

    public void release() {
        if (!this.A01.getAndSet(true)) {
            this.A00.release();
            return;
        }
        throw AnonymousClass001.A09("Reference was already released.");
    }

    public A0p(C20957A0q a0q) {
        this.A00 = a0q;
    }
}
