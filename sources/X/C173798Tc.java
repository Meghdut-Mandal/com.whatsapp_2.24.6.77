package X;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import java.util.Map;

/* renamed from: X.8Tc  reason: invalid class name and case insensitive filesystem */
public final class C173798Tc extends C429721s {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C199009eY A01;
    public final /* synthetic */ AnonymousClass3T1 A02;
    public final /* synthetic */ String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C173798Tc(android.content.Context r7, X.AnonymousClass17Y r8, X.C32691e2 r9, X.C199009eY r10, X.C21060yb r11, X.AnonymousClass3T1 r12, java.lang.String r13) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r6.A00 = r7
            r5 = r13
            r6.A03 = r13
            r6.A01 = r10
            r6.A02 = r12
            r3 = r8
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173798Tc.<init>(android.content.Context, X.17Y, X.1e2, X.9eY, X.0yb, X.3T1, java.lang.String):void");
    }

    public void A01() {
        this.A01.A04.A00(Boolean.valueOf(this.A02.A1J.A02), (Boolean) null, 2);
    }

    public void onClick(View view) {
        Context context;
        Pair pair;
        String str = this.A03;
        String schemeSpecificPart = Uri.parse(str).getSchemeSpecificPart();
        C199009eY r5 = this.A01;
        Map map = r5.A05.A00;
        if (map.get(schemeSpecificPart) != null) {
            context = this.A00;
            pair = (Pair) map.get(schemeSpecificPart);
        } else if (r5.A00 != null) {
            return;
        } else {
            if (!r5.A02.A09()) {
                context = this.A00;
                pair = null;
            } else {
                AnonymousClass17Y r14 = r5.A01;
                AnonymousClass19A r17 = r5.A06;
                C183738rH r13 = new C183738rH(r14, r5.A03, new AnonymousClass9MU(this.A00, r5, this.A02, schemeSpecificPart, str), r17, schemeSpecificPart);
                C36331k8.A1F(r13, r5.A07);
                r5.A00 = r13;
                return;
            }
        }
        AnonymousClass00C.A0B(schemeSpecificPart);
        C199009eY.A00(context, pair, r5, schemeSpecificPart, str, this.A02.A1J.A02);
    }
}
