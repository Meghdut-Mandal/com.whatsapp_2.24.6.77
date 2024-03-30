package X;

import java.util.AbstractCollection;
import java.util.HashMap;

/* renamed from: X.7It  reason: invalid class name and case insensitive filesystem */
public final class C151987It extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass64B this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151987It(AnonymousClass64B r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object valueOf;
        HashMap A0J = AnonymousClass001.A0J();
        AnonymousClass64B r6 = this.this$0;
        int size = r6.A03.size();
        for (int i = 0; i < size; i++) {
            C122025uB r3 = (C122025uB) r6.A03.get(i);
            Object obj = r3.A03;
            int i2 = r3.A00;
            if (obj != null) {
                valueOf = new C62713Hg(Integer.valueOf(i2), obj);
            } else {
                valueOf = Integer.valueOf(i2);
            }
            Object obj2 = A0J.get(valueOf);
            if (obj2 == null) {
                obj2 = C36441kJ.A17();
                A0J.put(valueOf, obj2);
            }
            ((AbstractCollection) obj2).add(r3);
        }
        return A0J;
    }
}
