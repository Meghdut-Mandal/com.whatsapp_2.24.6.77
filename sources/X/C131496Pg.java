package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Pg  reason: invalid class name and case insensitive filesystem */
public final class C131496Pg {
    public final C20810yC A00;
    public final AnonymousClass166 A01 = new AnonymousClass166(5);
    public final C19760wT A02;

    public ArrayList A01(UserJid userJid, String str) {
        ArrayList A0I;
        AnonymousClass00C.A0D(str, 0);
        synchronized (this) {
            Map map = A00(userJid).A01;
            C128506Cn r1 = (C128506Cn) map.get(str);
            A0I = AnonymousClass001.A0I();
            if (r1 != null && !r1.A04) {
                Iterator it = r1.A03.iterator();
                while (it.hasNext()) {
                    C128506Cn r0 = (C128506Cn) map.get(AnonymousClass001.A0C(it));
                    if (r0 != null) {
                        A0I.add(r0);
                    }
                }
            }
        }
        return A0I;
    }

    public void A02(A90 a90, UserJid userJid, boolean z) {
        synchronized (this) {
            for (C1276969h r0 : a90.A01) {
                C128506Cn r4 = r0.A00;
                List list = r4.A03;
                list.clear();
                for (C128506Cn r2 : r0.A01) {
                    String str = r2.A01;
                    list.add(str);
                    A00(userJid).A01.put(str, r2);
                }
                String str2 = r4.A01;
                AnonymousClass6A3 A002 = A00(userJid);
                if (z) {
                    C128506Cn r02 = (C128506Cn) A00(userJid).A01.get("catalog_category_dummy_root_id");
                    if (r02 != null) {
                        r02.A03.add(str2);
                    } else {
                        continue;
                    }
                }
                A002.A01.put(str2, r4);
            }
        }
    }

    public void A03(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            this.A01.remove(userJid);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(com.whatsapp.jid.UserJid r12, java.lang.String r13) {
        /*
            r11 = this;
            r10 = r11
            r7 = 0
            X.AnonymousClass00C.A0D(r13, r7)
            monitor-enter(r10)
            java.lang.String r0 = "catalog_category_dummy_root_id"
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0034
            X.166 r8 = r11.A01     // Catch:{ all -> 0x0056 }
            java.lang.Object r9 = r8.get(r12)     // Catch:{ all -> 0x0056 }
            X.6A3 r9 = (X.AnonymousClass6A3) r9     // Catch:{ all -> 0x0056 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ all -> 0x0056 }
            X.0yC r1 = r11.A00     // Catch:{ all -> 0x0056 }
            r0 = 2081(0x821, float:2.916E-42)
            long r0 = X.C36441kJ.A0B(r1, r0)     // Catch:{ all -> 0x0056 }
            long r5 = r2.toMillis(r0)     // Catch:{ all -> 0x0056 }
            if (r9 == 0) goto L_0x0034
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0056 }
            long r1 = r9.A00     // Catch:{ all -> 0x0056 }
            long r1 = r1 + r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            r8.remove(r12)     // Catch:{ all -> 0x0056 }
        L_0x0034:
            X.6A3 r0 = r11.A00(r12)     // Catch:{ all -> 0x0054 }
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0054 }
            java.lang.Object r2 = r0.get(r13)     // Catch:{ all -> 0x0054 }
            X.6Cn r2 = (X.C128506Cn) r2     // Catch:{ all -> 0x0054 }
            r1 = 0
            if (r2 != 0) goto L_0x0045
            monitor-exit(r10)
            return r7
        L_0x0045:
            boolean r0 = r2.A04     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0052
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x0056 }
            boolean r0 = X.C36401kF.A1a(r0)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0052
            r1 = 1
        L_0x0052:
            monitor-exit(r10)
            return r1
        L_0x0054:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131496Pg.A04(com.whatsapp.jid.UserJid, java.lang.String):boolean");
    }

    private final AnonymousClass6A3 A00(UserJid userJid) {
        AnonymousClass166 r4 = this.A01;
        AnonymousClass6A3 r3 = (AnonymousClass6A3) r4.get(userJid);
        if (r3 != null) {
            return r3;
        }
        AnonymousClass6A3 r32 = new AnonymousClass6A3(C36431kI.A1G(), System.currentTimeMillis());
        r32.A01.put("catalog_category_dummy_root_id", new C128506Cn(new C206759tv("catalog_category_dummy_root_id", (String) null, (String) null, 0, 0), "catalog_category_dummy_root_id", "root", AnonymousClass001.A0I(), false));
        r4.put(userJid, r32);
        return r32;
    }

    public C131496Pg(C19760wT r3, C20810yC r4) {
        C36321k7.A0x(r3, r4);
        this.A02 = r3;
        this.A00 = r4;
    }
}
