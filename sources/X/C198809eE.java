package X;

import java.util.LinkedList;

/* renamed from: X.9eE  reason: invalid class name and case insensitive filesystem */
public class C198809eE {
    public LinkedList A00 = C90524aI.A0l();
    public C202719mV A01 = new C202719mV();
    public boolean A02 = true;

    public void A00() {
        C202719mV r1 = new C202719mV();
        LinkedList linkedList = this.A00;
        linkedList.addFirst(this.A01);
        this.A01 = r1;
        if (linkedList.size() > 40) {
            linkedList.removeLast();
        }
    }

    public C198809eE(byte[] bArr) {
        AnonymousClass8PZ r2 = (AnonymousClass8PZ) C170918Hz.A08(AnonymousClass8PZ.DEFAULT_INSTANCE, bArr);
        AnonymousClass8S2 r1 = r2.currentSession_;
        this.A01 = new C202719mV(r1 == null ? AnonymousClass8S2.DEFAULT_INSTANCE : r1);
        this.A02 = false;
        for (AnonymousClass8S2 r22 : r2.previousSessions_) {
            this.A00.add(new C202719mV(r22));
        }
    }

    public C198809eE() {
    }
}
