package X;

import java.util.List;

/* renamed from: X.7JG  reason: invalid class name */
public final class AnonymousClass7JG extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C138026h9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7JG(C138026h9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A0t;
        float f;
        List list = this.this$0.A01;
        if (list.isEmpty()) {
            A0t = null;
        } else {
            A0t = C36391kE.A0t(list);
            float BEH = ((C128056Ar) A0t).A02.BEH();
            int A07 = C36431kI.A07(list);
            int i = 1;
            if (1 <= A07) {
                while (true) {
                    Object obj = list.get(i);
                    float BEH2 = ((C128056Ar) obj).A02.BEH();
                    if (Float.compare(BEH, BEH2) < 0) {
                        A0t = obj;
                        BEH = BEH2;
                    }
                    if (i == A07) {
                        break;
                    }
                    i++;
                }
            }
        }
        C128056Ar r6 = (C128056Ar) A0t;
        if (r6 != null) {
            f = r6.A02.BEH();
        } else {
            f = 0.0f;
        }
        return Float.valueOf(f);
    }
}
