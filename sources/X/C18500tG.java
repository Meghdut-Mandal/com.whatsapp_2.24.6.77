package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0tG  reason: invalid class name and case insensitive filesystem */
public class C18500tG implements AnonymousClass05H {
    public Object A00;
    public final int A01;

    public C18500tG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Object B36(C023509x r4, AnonymousClass05G r5) {
        Object B6N;
        AnonymousClass05H r2;
        int i;
        switch (this.A01) {
            case 0:
                B6N = r5.B6N(this.A00, r4);
                break;
            case 1:
                r2 = (AnonymousClass05H) this.A00;
                i = 1;
                break;
            case 2:
                r2 = (AnonymousClass05H) this.A00;
                i = 4;
                break;
            default:
                C14180lD r22 = new C14180lD((C023509x) null, (C019408g) this.A00, r5);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C007503f.A00;
                C15500nR r0 = new C15500nR(r4, r4.getContext());
                B6N = AnonymousClass0R7.A00(r0, r22, r0);
                break;
        }
        B6N = r2.B36(r4, new C18470tD(r5, i));
        return AnonymousClass0AO.A00(B6N);
    }
}
