package X;

import java.util.Map;

/* renamed from: X.7RQ  reason: invalid class name */
public final class AnonymousClass7RQ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C136906fE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RQ(C136906fE r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        C159877k4 r4 = (C159877k4) entry.getValue();
        C1506776e r0 = this.this$0.A06;
        int i = r0.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = r0.A01;
            while (true) {
                if (!AnonymousClass00C.A0J(key, objArr[i2])) {
                    i2++;
                    if (i2 >= i) {
                        break;
                    }
                } else if (i2 >= 0 && i2 < this.this$0.A01) {
                    z = false;
                }
            }
        }
        r4.dispose();
        z = true;
        return Boolean.valueOf(z);
    }
}
