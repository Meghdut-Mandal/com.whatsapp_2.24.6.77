package X;

import java.util.LinkedHashMap;

/* renamed from: X.4Ao  reason: invalid class name and case insensitive filesystem */
public final class C83744Ao extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass3PH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83744Ao(AnonymousClass3PH r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A1G = C36431kI.A1G();
        int i = 0;
        for (Object next : this.this$0.A02()) {
            int i2 = i + 1;
            if (i < 0) {
                throw C36351kA.A0v();
            }
            C36341k9.A1K(Integer.valueOf(AnonymousClass000.A0I(next)), A1G, i);
            i = i2;
        }
        return A1G;
    }
}
