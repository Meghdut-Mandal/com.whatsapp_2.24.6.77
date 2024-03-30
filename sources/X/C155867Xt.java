package X;

import androidx.compose.runtime.Recomposer;
import java.util.Set;

/* renamed from: X.7Xt  reason: invalid class name and case insensitive filesystem */
public final class C155867Xt extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155867Xt(Recomposer recomposer) {
        super(2);
        this.this$0 = recomposer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass0AP r1;
        Set set = (Set) obj;
        Recomposer recomposer = this.this$0;
        AnonymousClass05L r0 = Recomposer.A0M;
        synchronized (recomposer.A0C) {
            if (((C108185Sm) recomposer.A0K.getValue()).compareTo(C108185Sm.Idle) >= 0) {
                if (set instanceof C1506876f) {
                    C1506876f r9 = (C1506876f) set;
                    Object[] objArr = r9.A01;
                    int size = r9.size();
                    for (int i = 0; i < size; i++) {
                        Object A0d = C90524aI.A0d(objArr, i);
                        if (!(A0d instanceof C137226fn) || (1 & ((C137226fn) A0d).A00.get()) != 0) {
                            recomposer.A01.add(A0d);
                        }
                    }
                } else {
                    for (Object next : set) {
                        if (!(next instanceof C137226fn) || (1 & ((C137226fn) next).A00.get()) != 0) {
                            recomposer.A01.add(next);
                        }
                    }
                }
                r1 = Recomposer.A01(recomposer);
            } else {
                r1 = null;
            }
        }
        if (r1 != null) {
            r1.resumeWith(AnonymousClass0AJ.A00);
        }
        return AnonymousClass0AJ.A00;
    }
}
