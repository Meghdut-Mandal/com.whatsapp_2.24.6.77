package X;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class A2V implements C23115B5u {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public boolean B2Q(C207229ul r3, File file) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (!((C23115B5u) it.next()).B2Q(r3, file)) {
                return false;
            }
        }
        return true;
    }

    public void Bdn(C207229ul r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23115B5u) it.next()).Bdn(r3);
        }
    }

    public void Bdo(C207229ul r3, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23115B5u) it.next()).Bdo(r3, i);
        }
    }

    public void BjG(C207229ul r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23115B5u) it.next()).BjG(r3);
        }
    }

    public void BjH(int i, int i2, int i3, int i4) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23115B5u) it.next()).BjH(i, i2, i3, i4);
        }
    }

    public void BjI(C207229ul r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23115B5u) it.next()).BjI(r3);
        }
    }

    public void BjJ(C207229ul r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23115B5u) it.next()).BjJ(r3);
        }
    }

    public void BjK(C207229ul r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23115B5u) it.next()).BjK(r3);
        }
    }

    public void BjL(C207229ul r3, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23065B2p) it.next()).BjL(r3, i);
        }
    }

    public void BjM(C207229ul r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23065B2p) it.next()).BjM(r3);
        }
    }

    public void BjN(C207229ul r3, Throwable th) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23065B2p) it.next()).BjN(r3, th);
        }
    }

    public void BjO(C207229ul r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C23065B2p) it.next()).BjO(r3);
        }
    }
}
