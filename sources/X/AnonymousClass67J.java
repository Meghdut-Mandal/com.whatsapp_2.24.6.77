package X;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.67J  reason: invalid class name */
public final class AnonymousClass67J {
    public final AnonymousClass5DQ A00;
    public final C20810yC A01;
    public final AnonymousClass32W A02;
    public final List A03 = AnonymousClass001.A0I();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if ((!X.AnonymousClass6TR.A00(r3).contains(r1)) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List A01() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.List r2 = r11.A03     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0047
            r2.clear()     // Catch:{ all -> 0x0049 }
            X.0yC r3 = r11.A01     // Catch:{ all -> 0x0049 }
            r0 = 6743(0x1a57, float:9.449E-42)
            boolean r0 = r3.A0E(r0)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x002e
            X.32W r0 = r11.A02     // Catch:{ all -> 0x0049 }
            X.3N5 r0 = r0.A00     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = X.AnonymousClass3N5.A00(r0)     // Catch:{ all -> 0x0049 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x0049 }
            java.util.HashSet r0 = X.AnonymousClass6TR.A00(r3)     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0049 }
            r0 = r0 ^ 1
            r10 = 1
            if (r0 != 0) goto L_0x002f
        L_0x002e:
            r10 = 0
        L_0x002f:
            X.5DM r4 = new X.5DM     // Catch:{ all -> 0x0049 }
            r4.<init>(r11)     // Catch:{ all -> 0x0049 }
            r5 = 0
            r6 = 0
            r7 = 2131433581(0x7f0b186d, float:1.8488952E38)
            r8 = 2131889586(0x7f120db2, float:1.941384E38)
            r9 = 2131232069(0x7f080545, float:1.8080237E38)
            X.6bf r3 = new X.6bf     // Catch:{ all -> 0x0049 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0049 }
            r2.add(r3)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r11)
            return r2
        L_0x0049:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass67J.A01():java.util.List");
    }

    public AnonymousClass67J(AnonymousClass5DQ r2, C20810yC r3, AnonymousClass32W r4) {
        C36321k7.A11(r3, r4, r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final C134826bf A00() {
        for (C134826bf r1 : A01()) {
            if (r1.A03 == 0) {
                return r1;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
