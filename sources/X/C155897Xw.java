package X;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7Xw  reason: invalid class name and case insensitive filesystem */
public final class C155897Xw extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C130536Ll this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155897Xw(C130536Ll r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AtomicReference atomicReference;
        Object obj3;
        Object A0S;
        C130536Ll r4 = this.this$0;
        do {
            atomicReference = r4.A06;
            obj3 = atomicReference.get();
            if (obj3 == null) {
                A0S = obj;
            } else if (obj3 instanceof Set) {
                Set[] setArr = new Set[2];
                C36331k8.A1N(obj3, obj, setArr);
                A0S = C90494aF.A0j(setArr);
            } else if (obj3 instanceof List) {
                A0S = C007103b.A0S(C36371kC.A11(obj), (Collection) obj3);
            } else {
                throw AnonymousClass6XJ.A01("Unexpected notification");
            }
        } while (!atomicReference.compareAndSet(obj3, A0S));
        if (C130536Ll.A01(this.this$0)) {
            C130536Ll r2 = this.this$0;
            r2.A07.invoke(new C152017Iw(r2));
        }
        return AnonymousClass0AJ.A00;
    }
}
