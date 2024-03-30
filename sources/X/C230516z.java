package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.16z  reason: invalid class name and case insensitive filesystem */
public class C230516z extends AnonymousClass12N {
    public final AnonymousClass005 A00;
    public final Map A01 = Collections.synchronizedMap(new HashMap());
    public final int A02;

    public AnonymousClass141 A09(AnonymousClass11F r2) {
        Object obj;
        if (r2 instanceof C177638e7) {
            obj = this.A00.get();
        } else {
            obj = this.A01.get(r2);
        }
        return (AnonymousClass141) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.AnonymousClass141 r4) {
        /*
            r3 = this;
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r2 = r4.A06(r0)
            if (r2 == 0) goto L_0x0015
            java.util.Map r1 = r3.A01
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x0015
            if (r0 == r4) goto L_0x0015
            r1.remove(r2)
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230516z.A0A(X.141):void");
    }

    public String BHv() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactCache/");
        sb.append(this.A01.size());
        return sb.toString();
    }

    public C230516z(C20810yC r3, C220112n r4, AnonymousClass005 r5) {
        super(r4);
        this.A00 = r5;
        int A002 = C20800yB.A00(C21000yV.A02, r3, 7864);
        this.A02 = A002;
        if (A002 >= 0) {
            A08();
        }
    }

    public void Bjh(AnonymousClass5SK r3, boolean z) {
        if (r3.ordinal() >= this.A02) {
            this.A01.clear();
        }
    }
}
