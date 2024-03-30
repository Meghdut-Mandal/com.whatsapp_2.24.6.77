package com.whatsapp.usernames;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C61123Aq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.UsernameSearchManager$queryUsername$2", f = "UsernameSearchManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameSearchManager$queryUsername$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $usernameSearchString;
    public int label;
    public final /* synthetic */ C61123Aq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameSearchManager$queryUsername$2(C61123Aq r2, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$usernameSearchString = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new UsernameSearchManager$queryUsername$2(this.this$0, this.$usernameSearchString, r5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.00I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.00I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: X.00I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.141} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.00I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.00I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: X.00I} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            if (r0 != 0) goto L_0x01b1
            X.AnonymousClass0AN.A00(r14)
            X.3Aq r0 = r13.this$0
            X.AAt r3 = r0.A04
            java.lang.String r5 = r13.$usernameSearchString
            long r11 = android.os.SystemClock.elapsedRealtime()
            X.0wD r0 = r3.A03
            boolean r0 = r0.A09()
            r10 = 0
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = "ContactQuerySyncManager/querySyncUsername: network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x001f:
            if (r10 == 0) goto L_0x0084
            java.lang.Object r4 = r10.A01
            X.141 r4 = (X.AnonymousClass141) r4
            if (r4 == 0) goto L_0x0084
            java.lang.String r8 = r13.$usernameSearchString
            java.lang.Object r7 = r10.A00
            X.9Oj r7 = (X.C194169Oj) r7
            java.lang.String r6 = r7.A0J
            r5 = 1
            if (r8 == 0) goto L_0x0087
            if (r6 == 0) goto L_0x0087
            boolean r0 = r8.equalsIgnoreCase(r6)
        L_0x0038:
            if (r0 == 0) goto L_0x0084
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 64
            r1.append(r0)
            java.lang.String r0 = r7.A0J
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r4.A0P = r0
            X.3Aq r2 = r13.this$0
            java.lang.Class<X.13w> r0 = X.C223313w.class
            com.whatsapp.jid.Jid r1 = r4.A06(r0)
            X.13w r1 = (X.C223313w) r1
            if (r1 == 0) goto L_0x0079
            X.12O r0 = r2.A05
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0A(r1)
            if (r1 == 0) goto L_0x0079
            X.16D r0 = r2.A03
            X.141 r4 = r0.A0D(r1)
            X.3IL r0 = r4.A0F
            boolean r0 = X.AnonymousClass000.A1V(r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r1 = r1.user
            X.9oI r0 = X.C203559oI.A00()
            java.lang.String r0 = X.AnonymousClass3U8.A01(r0, r1)
            r4.A0P = r0
        L_0x0079:
            X.3Aq r0 = r13.this$0
            X.08S r1 = r0.A02
            java.util.List r0 = X.C36371kC.A11(r4)
            r1.A0C(r0)
        L_0x0084:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0087:
            if (r8 == r6) goto L_0x00ad
            if (r8 == 0) goto L_0x00ab
            if (r6 == 0) goto L_0x00ab
            int r3 = r8.length()
            int r0 = r6.length()
            if (r3 != r0) goto L_0x00ab
            r2 = 0
        L_0x0098:
            if (r2 >= r3) goto L_0x00ad
            char r1 = r8.charAt(r2)
            char r0 = r6.charAt(r2)
            boolean r0 = X.C15100mh.A02(r1, r0, r5)
            if (r0 == 0) goto L_0x00ab
            int r2 = r2 + 1
            goto L_0x0098
        L_0x00ab:
            r0 = 0
            goto L_0x0038
        L_0x00ad:
            r0 = 1
            goto L_0x0038
        L_0x00af:
            java.lang.String r0 = "sync_sid_query"
            java.lang.String r2 = X.C202329lb.A00(r0)
            X.AIC r6 = X.C21159AAt.A00(r3)     // Catch:{ all -> 0x01aa }
            X.5Tu r9 = X.C108515Tu.A0C     // Catch:{ all -> 0x01aa }
            X.1KL r0 = r3.A02     // Catch:{ all -> 0x01aa }
            int r8 = r0.A00()     // Catch:{ all -> 0x01aa }
            X.0yC r1 = r3.A09     // Catch:{ all -> 0x01aa }
            r0 = 4921(0x1339, float:6.896E-42)
            boolean r1 = r1.A0E(r0)     // Catch:{ all -> 0x01aa }
            r7 = 1
            X.C18740tg.A0C(r7)     // Catch:{ all -> 0x01aa }
            X.9jB r0 = new X.9jB     // Catch:{ all -> 0x01aa }
            r0.<init>((java.lang.String) r5)     // Catch:{ all -> 0x01aa }
            r0.A0C = r7     // Catch:{ all -> 0x01aa }
            r0.A0L = r7     // Catch:{ all -> 0x01aa }
            r0.A0J = r7     // Catch:{ all -> 0x01aa }
            r0.A0B = r7     // Catch:{ all -> 0x01aa }
            r0.A0F = r7     // Catch:{ all -> 0x01aa }
            r0.A0H = r7     // Catch:{ all -> 0x01aa }
            r0.A0N = r7     // Catch:{ all -> 0x01aa }
            r0.A0M = r1     // Catch:{ all -> 0x01aa }
            X.9Ok r0 = r0.A05()     // Catch:{ all -> 0x01aa }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x01aa }
            X.9eK r4 = new X.9eK     // Catch:{ all -> 0x01aa }
            r4.<init>(r9, r0, r8, r7)     // Catch:{ all -> 0x01aa }
            r0 = 32000(0x7d00, double:1.581E-319)
            X.777 r6 = r6.A05(r4, r2, r0)     // Catch:{ all -> 0x01aa }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x019e, ExecutionException -> 0x0197, InterruptedException -> 0x018c }
            r6.get(r0, r4)     // Catch:{ TimeoutException -> 0x019e, ExecutionException -> 0x0197, InterruptedException -> 0x018c }
            java.util.concurrent.ConcurrentHashMap r4 = r3.A0A     // Catch:{ all -> 0x01aa }
            java.lang.Object r6 = r4.get(r2)     // Catch:{ all -> 0x01aa }
            X.9Hh r6 = (X.C192519Hh) r6     // Catch:{ all -> 0x01aa }
            if (r6 != 0) goto L_0x011e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncUsername: empty sync result for "
            r1.append(r0)     // Catch:{ all -> 0x01aa }
            r1.append(r5)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = " (syncId is "
            r1.append(r0)     // Catch:{ all -> 0x01aa }
            r1.append(r2)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = ")"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x01aa }
            goto L_0x0148
        L_0x011e:
            X.9Oj[] r1 = r6.A01     // Catch:{ all -> 0x01aa }
            int r0 = r1.length     // Catch:{ all -> 0x01aa }
            if (r0 != 0) goto L_0x014d
            X.9OU r0 = r6.A00     // Catch:{ all -> 0x01aa }
            X.9Rr r0 = r0.A02     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x013f
            java.lang.Integer r0 = r0.A00     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x013f
            int r1 = r0.intValue()     // Catch:{ all -> 0x01aa }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 != r0) goto L_0x013f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncUsername: rate-limit-error "
            X.C36321k7.A1P(r0, r5, r1)     // Catch:{ all -> 0x01aa }
            goto L_0x0148
        L_0x013f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncUsername: no users for "
            X.C36321k7.A1P(r0, r5, r1)     // Catch:{ all -> 0x01aa }
        L_0x0148:
            r4.remove(r2)
            goto L_0x001f
        L_0x014d:
            r5 = 0
            r8 = r1[r5]     // Catch:{ all -> 0x01aa }
            int r0 = r8.A04     // Catch:{ all -> 0x01aa }
            if (r0 != r7) goto L_0x0172
            X.16D r1 = r3.A04     // Catch:{ all -> 0x01aa }
            com.whatsapp.jid.UserJid r0 = r8.A0D     // Catch:{ all -> 0x01aa }
            X.141 r10 = X.C36441kJ.A0i(r1, r0)     // Catch:{ all -> 0x01aa }
            X.0wQ r0 = r3.A01     // Catch:{ all -> 0x01aa }
            boolean r0 = X.C36361kB.A1X(r0, r10)     // Catch:{ all -> 0x01aa }
            if (r0 != 0) goto L_0x0172
            X.1ER r1 = r3.A08     // Catch:{ all -> 0x01aa }
            com.whatsapp.jid.UserJid r0 = r8.A0D     // Catch:{ all -> 0x01aa }
            r1.A01(r0, r5)     // Catch:{ all -> 0x01aa }
            X.1OT r7 = r3.A05     // Catch:{ all -> 0x01aa }
            X.9OU r9 = r6.A00     // Catch:{ all -> 0x01aa }
            r7.A00(r8, r9, r10, r11)     // Catch:{ all -> 0x01aa }
        L_0x0172:
            java.util.List r0 = r8.A0K     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0181
            int r0 = r0.size()     // Catch:{ all -> 0x01aa }
            if (r0 <= 0) goto L_0x0181
            java.util.List r0 = r8.A0K     // Catch:{ all -> 0x01aa }
            r0.get(r5)     // Catch:{ all -> 0x01aa }
        L_0x0181:
            X.00I r0 = new X.00I     // Catch:{ all -> 0x01aa }
            r0.<init>(r8, r10)     // Catch:{ all -> 0x01aa }
            r4.remove(r2)
            r10 = r0
            goto L_0x001f
        L_0x018c:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "ContactQuerySync/querySyncUsername: exception during Query Sync "
            X.C90464aC.A1L(r0, r5, r1, r4)     // Catch:{ all -> 0x01aa }
            goto L_0x01a3
        L_0x0197:
            r1 = move-exception
            java.lang.String r0 = "querySyncUsername"
            X.C21159AAt.A01(r3, r0, r1)     // Catch:{ all -> 0x01aa }
            goto L_0x01a3
        L_0x019e:
            java.lang.String r0 = "ContactQuerySyncManager/querySyncUsername/timeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01aa }
        L_0x01a3:
            java.util.concurrent.ConcurrentHashMap r0 = r3.A0A
            r0.remove(r2)
            goto L_0x001f
        L_0x01aa:
            r1 = move-exception
            java.util.concurrent.ConcurrentHashMap r0 = r3.A0A
            r0.remove(r2)
            throw r1
        L_0x01b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usernames.UsernameSearchManager$queryUsername$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameSearchManager$queryUsername$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
