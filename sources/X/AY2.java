package X;

import java.util.Iterator;

public class AY2 implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ C21889AcH A03;

    public /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        C21889AcH acH = this.A03;
        if (i < acH.A00.size()) {
            return acH.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AnonymousClass000.A0y(acH.A01);
            this.A01 = it;
        }
        return it.next();
    }

    public AY2(C21889AcH acH) {
        this.A03 = acH;
    }

    public boolean hasNext() {
        int i = this.A00 + 1;
        C21889AcH acH = this.A03;
        if (i >= acH.A00.size()) {
            if (acH.A01.isEmpty()) {
                return false;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass000.A0y(acH.A01);
                this.A01 = it;
            }
            if (it.hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void remove() {
        if (this.A02) {
            this.A02 = false;
            C21889AcH acH = this.A03;
            C21889AcH.A03(acH);
            if (this.A00 < acH.A00.size()) {
                int i = this.A00;
                this.A00 = i - 1;
                C21889AcH.A01(acH, i);
                return;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass000.A0y(acH.A01);
                this.A01 = it;
            }
            it.remove();
            return;
        }
        throw AnonymousClass001.A09("remove() was called before next()");
    }
}
