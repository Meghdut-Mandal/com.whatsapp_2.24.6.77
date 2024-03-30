package X;

import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.7ND  reason: invalid class name */
public final class AnonymousClass7ND extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6SX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7ND(AnonymousClass6SX r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList A14 = C36441kJ.A14(r3);
        for (AnonymousClass5TU r0 : AnonymousClass5TU.values()) {
            AnonymousClass000.A1F(A14, r0.statusColor);
        }
        AnonymousClass6SX r5 = this.this$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(A14));
        for (Object next : A14) {
            int A0I = AnonymousClass000.A0I(next);
            PorterDuffXfermode porterDuffXfermode = AnonymousClass6SX.A0Q;
            C36341k9.A1K(next, linkedHashMap, AnonymousClass00F.A00(r5.A08, A0I));
        }
        return linkedHashMap;
    }
}
