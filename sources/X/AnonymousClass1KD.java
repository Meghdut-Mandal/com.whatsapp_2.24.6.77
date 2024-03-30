package X;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1KD  reason: invalid class name */
public final class AnonymousClass1KD implements AnonymousClass1JB {
    public final C25681Hg A00;
    public final AnonymousClass1KE A01;
    public final AnonymousClass1DP A02;
    public final AnonymousClass163 A03;
    public final C220412q A04;
    public final C19770wU A05;
    public final ConcurrentHashMap A06 = new ConcurrentHashMap();

    public AnonymousClass1KD(C25681Hg r2, AnonymousClass1KE r3, AnonymousClass1DP r4, AnonymousClass163 r5, C220412q r6, C19770wU r7) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r4, 5);
        AnonymousClass00C.A0D(r3, 6);
        this.A00 = r2;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
    }

    public void BQH(AnonymousClass11F r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (C197029b1.A00(r4) && this.A00.A00()) {
            this.A05.Boy(new C35651j2(this, r4, 8));
        }
    }

    public void BQI() {
    }

    public void BQJ(AnonymousClass11F r2, boolean z) {
        AnonymousClass00C.A0D(r2, 0);
        A01(r2);
    }

    public void BQK(AnonymousClass11F r1, Collection collection, int i) {
    }

    public void BQL(AnonymousClass11F r2) {
        AnonymousClass00C.A0D(r2, 0);
        A01(r2);
    }

    public void BQM(AnonymousClass11F r1) {
    }

    private final void A01(AnonymousClass11F r4) {
        C220412q r1 = this.A04;
        if (r1.A09(r4, false) == null || r1.A0R(r4)) {
            this.A06.remove(r4);
            this.A05.Boy(new C35651j2(this, r4, 7));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass1KD r8, X.AnonymousClass2LZ r9) {
        /*
            X.11F r7 = r9.A06()
            X.AnonymousClass00C.A08(r7)
            X.1KE r0 = r8.A01
            monitor-enter(r9)
            monitor-exit(r9)
            X.12P r0 = r0.A00
            X.1M0 r5 = r0.A05()
            X.71s r6 = r5.B1k()     // Catch:{ all -> 0x004f }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0048 }
            r4.<init>()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "chat_row_id"
            java.lang.Long r0 = r9.A07()     // Catch:{ all -> 0x0048 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "pip_enabled"
            boolean r0 = r9.A00     // Catch:{ all -> 0x0048 }
            X.C54272sg.A00(r4, r1, r0)     // Catch:{ all -> 0x0048 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = "bot_chat_info"
            r1 = 5
            java.lang.String r0 = "BonsaiChatInfoStore/INSERT_BOT_CHAT_INFO"
            r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x0048 }
            r6.A00()     // Catch:{ all -> 0x0048 }
            r6.close()     // Catch:{ all -> 0x004f }
            r5.close()
            X.12q r0 = r8.A04
            r0.A0I(r9, r7)
            java.util.concurrent.ConcurrentHashMap r0 = r8.A06
            r0.put(r7, r9)
            return
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KD.A00(X.1KD, X.2LZ):void");
    }
}
