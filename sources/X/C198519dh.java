package X;

import java.util.LinkedList;

/* renamed from: X.9dh  reason: invalid class name and case insensitive filesystem */
public class C198519dh {
    public LinkedList A00 = C90524aI.A0l();

    public C198529di A00() {
        LinkedList linkedList = this.A00;
        if (!linkedList.isEmpty()) {
            return (C198529di) C36441kJ.A12(linkedList);
        }
        throw new AnonymousClass18F("No key state in record!");
    }

    public C198519dh(byte[] bArr) {
        for (AnonymousClass8QS r2 : ((C172248Nc) C170918Hz.A08(C172248Nc.DEFAULT_INSTANCE, bArr)).senderKeyStates_) {
            this.A00.add(new C198529di(r2));
        }
    }

    public C198519dh() {
    }
}
