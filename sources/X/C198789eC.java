package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.9eC  reason: invalid class name and case insensitive filesystem */
public class C198789eC {
    public boolean A00;
    public final C197209bJ A01;
    public final LinkedList A02;

    public C198789eC(byte[] bArr) {
        this.A02 = C90524aI.A0l();
        this.A00 = false;
        AnonymousClass8PZ r2 = (AnonymousClass8PZ) C170918Hz.A08(AnonymousClass8PZ.DEFAULT_INSTANCE, bArr);
        AnonymousClass8S2 r1 = r2.currentSession_;
        this.A01 = new C197209bJ(r1 == null ? AnonymousClass8S2.DEFAULT_INSTANCE : r1);
        this.A00 = false;
        for (AnonymousClass8S2 r22 : r2.previousSessions_) {
            this.A02.add(new C197209bJ(r22));
        }
    }

    public byte[] A00() {
        LinkedList A0l = C90524aI.A0l();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            A0l.add(((C197209bJ) it.next()).A00);
        }
        C172218Mz r2 = (C172218Mz) AnonymousClass8PZ.DEFAULT_INSTANCE.A0p();
        AnonymousClass8S2 r0 = this.A01.A00;
        AnonymousClass8PZ r1 = (AnonymousClass8PZ) C90524aI.A0H(r2);
        r0.getClass();
        r1.currentSession_ = r0;
        r1.bitField0_ |= 1;
        r2.A0U(A0l);
        return AnonymousClass8NN.A0N(r2);
    }

    public C198789eC() {
        this.A02 = C90524aI.A0l();
        this.A00 = true;
        this.A01 = new C197209bJ();
    }
}
