package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.6Gp  reason: invalid class name and case insensitive filesystem */
public abstract class C129356Gp {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.6B4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.6B4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.6B4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.6B4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(X.C207269up r7, java.util.List r8) {
        /*
            r0 = 1
            X.AnonymousClass00C.A0D(r8, r0)
            X.6bW r0 = r7.A0B
            r6 = 0
            if (r0 == 0) goto L_0x006a
            X.6bD r0 = r0.A00
            if (r0 == 0) goto L_0x006a
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x006a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x006a
            java.util.ArrayList r2 = X.C36321k7.A0J(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r1.next()
            X.6bO r0 = (X.C134656bO) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L_0x001f
        L_0x0031:
            java.util.Iterator r7 = r2.iterator()
            r4 = 0
        L_0x0037:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r3 = r7.next()
            java.util.Iterator r2 = r8.iterator()
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6B4 r0 = (X.AnonymousClass6B4) r0
            X.9up r0 = r0.A02
            java.lang.String r0 = r0.A0F
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0045
        L_0x005c:
            X.6B4 r1 = (X.AnonymousClass6B4) r1
            if (r1 == 0) goto L_0x0064
            long r0 = r1.A00
        L_0x0062:
            long r4 = r4 + r0
            goto L_0x0037
        L_0x0064:
            r0 = 0
            goto L_0x0062
        L_0x0067:
            r1 = r6
            goto L_0x005c
        L_0x0069:
            return r4
        L_0x006a:
            r1 = 0
            java.util.Iterator r5 = r8.iterator()
        L_0x0070:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r4 = r5.next()
            r0 = r4
            X.6B4 r0 = (X.AnonymousClass6B4) r0
            X.9up r0 = r0.A02
            java.lang.String r3 = r0.A0F
            java.lang.String r0 = r7.A0F
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0070
            r6 = r4
        L_0x008a:
            X.6B4 r6 = (X.AnonymousClass6B4) r6
            if (r6 == 0) goto L_0x0090
            long r1 = r6.A01
        L_0x0090:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129356Gp.A00(X.9up, java.util.List):long");
    }

    public static final void A01(AnonymousClass6MH r1, AnonymousClass6VE r2, Jid jid) {
        try {
            List list = (List) r2.A04(jid).get();
            if (list == null || list.isEmpty()) {
                r1.A01(jid);
            }
        } catch (Exception e) {
            Log.e("CartUtil/cleanPromotionIfCartIsEmpty", e);
        }
    }
}
