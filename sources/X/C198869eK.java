package X;

import java.util.List;

/* renamed from: X.9eK  reason: invalid class name and case insensitive filesystem */
public final class C198869eK {
    public final int A00;
    public final C108515Tu A01;
    public final List A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3 == X.C108515Tu.A01) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C198869eK A00(X.C108515Tu r3, com.whatsapp.jid.UserJid r4, java.lang.String r5, int r6, boolean r7, boolean r8, boolean r9) {
        /*
            X.5Tu r0 = X.C108515Tu.A0C
            r2 = 1
            if (r3 == r0) goto L_0x000a
            X.5Tu r1 = X.C108515Tu.A01
            r0 = 0
            if (r3 != r1) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.C18740tg.A0C(r0)
            X.9jB r0 = new X.9jB
            r0.<init>(r4, r5)
            r0.A0C = r2
            r0.A0L = r2
            r0.A0J = r2
            r0.A0E = r8
            r0.A0B = r2
            r0.A0F = r2
            r0.A0H = r2
            r0.A0N = r7
            r0.A0M = r9
            X.9Ok r0 = r0.A05()
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.9eK r0 = new X.9eK
            r0.<init>(r3, r1, r6, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198869eK.A00(X.5Tu, com.whatsapp.jid.UserJid, java.lang.String, int, boolean, boolean, boolean):X.9eK");
    }

    public C198869eK(C108515Tu r1, List list, int i, boolean z) {
        this.A01 = r1;
        this.A02 = list;
        this.A03 = z;
        this.A00 = i;
    }

    public static AnonymousClass777 A01(C108515Tu r4, AIC aic, String str, List list, int i) {
        return aic.A05(new C198869eK(r4, list, i, false), C202329lb.A00(str), 64000);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[mode=");
        C108515Tu r2 = this.A01;
        StringBuilder A0i = C90524aI.A0i(AnonymousClass000.A0q(r2.mode.modeString, A0u));
        A0i.append(" context=");
        A0i.append(r2.context.contextString);
        A0i.append(" requests=");
        A0i.append(this.A02.size());
        return C90474aD.A0g(A0i);
    }
}
