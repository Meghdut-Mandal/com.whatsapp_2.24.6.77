package X;

import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.AAt  reason: case insensitive filesystem */
public class C21159AAt implements AnonymousClass00M {
    public AIC A00;
    public final C19730wQ A01;
    public final AnonymousClass1KL A02;
    public final C19600wD A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass1OT A05;
    public final AnonymousClass1O6 A06;
    public final C19970wo A07;
    public final AnonymousClass1ER A08;
    public final C20810yC A09;
    public final ConcurrentHashMap A0A = C90524aI.A0s();
    public final C19700wN A0B;
    public final AnonymousClass12O A0C;
    public final AnonymousClass1OD A0D;
    public final AnonymousClass19A A0E;
    public final ConcurrentHashMap A0F = C90524aI.A0s();
    public final ConcurrentHashMap A0G = C90524aI.A0s();

    public static synchronized AIC A00(C21159AAt aAt) {
        AIC aic;
        synchronized (aAt) {
            aic = aAt.A00;
            if (aic == null) {
                C20810yC r4 = aAt.A09;
                C19700wN r1 = aAt.A0B;
                AnonymousClass19A r5 = aAt.A0E;
                aic = new AIC(r1, new C21131A9r(aAt), aAt.A0C, r4, r5);
                aAt.A00 = aic;
            }
        }
        return aic;
    }

    public C21159AAt(C19700wN r2, C19730wQ r3, AnonymousClass1KL r4, C19600wD r5, AnonymousClass16D r6, AnonymousClass1OT r7, AnonymousClass1O6 r8, C19970wo r9, AnonymousClass1ER r10, AnonymousClass12O r11, AnonymousClass1OD r12, C20810yC r13, AnonymousClass19A r14) {
        this.A07 = r9;
        this.A09 = r13;
        this.A0B = r2;
        this.A01 = r3;
        this.A0E = r14;
        this.A04 = r6;
        this.A08 = r10;
        this.A0C = r11;
        this.A02 = r4;
        this.A0D = r12;
        this.A05 = r7;
        this.A03 = r5;
        this.A06 = r8;
    }

    public static void A01(C21159AAt aAt, String str, ExecutionException executionException) {
        if ((executionException.getCause() instanceof RuntimeException) || ((executionException.getCause() instanceof Error) && !(executionException.getCause() instanceof AssertionError) && !(executionException.getCause() instanceof OutOfMemoryError))) {
            aAt.A0B.A0E(AnonymousClass000.A0p("ContactQuerySync/", str, AnonymousClass000.A0u()), executionException.getMessage(), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r8 == X.C108515Tu.A01) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A02(X.C108515Tu r18, java.lang.String r19) {
        /*
            r17 = this;
            long r15 = android.os.SystemClock.elapsedRealtime()
            X.5Tu r0 = X.C108515Tu.A0C
            r5 = 0
            r7 = 1
            r8 = r18
            if (r8 == r0) goto L_0x0011
            X.5Tu r1 = X.C108515Tu.A01
            r0 = 0
            if (r8 != r1) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.C18740tg.A0C(r0)
            r2 = r17
            X.0wD r0 = r2.A03
            boolean r0 = r0.A09()
            r9 = 0
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6Pu r0 = X.C131626Pu.A04
        L_0x0027:
            android.util.Pair r5 = android.util.Pair.create(r0, r9)
            return r5
        L_0x002c:
            java.util.concurrent.ConcurrentHashMap r4 = r2.A0G
            r10 = r19
            java.lang.Object r0 = r4.putIfAbsent(r10, r10)
            if (r0 == 0) goto L_0x0039
            X.6Pu r0 = X.C131626Pu.A08
            goto L_0x0027
        L_0x0039:
            java.lang.String r0 = "sync_sid_query"
            java.lang.String r3 = X.C202329lb.A00(r0)
            X.AIC r6 = A00(r2)     // Catch:{ all -> 0x0130 }
            X.1KL r0 = r2.A02     // Catch:{ all -> 0x0130 }
            int r11 = r0.A00()     // Catch:{ all -> 0x0130 }
            X.0yC r1 = r2.A09     // Catch:{ all -> 0x0130 }
            r0 = 5290(0x14aa, float:7.413E-42)
            boolean r12 = r1.A0E(r0)     // Catch:{ all -> 0x0130 }
            r0 = 5751(0x1677, float:8.059E-42)
            boolean r13 = r1.A0E(r0)     // Catch:{ all -> 0x0130 }
            r0 = 4921(0x1339, float:6.896E-42)
            boolean r14 = r1.A0E(r0)     // Catch:{ all -> 0x0130 }
            X.9eK r8 = X.C198869eK.A00(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0130 }
            r0 = 32000(0x7d00, double:1.581E-319)
            X.777 r8 = r6.A05(r8, r3, r0)     // Catch:{ all -> 0x0130 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x011c, ExecutionException -> 0x010f, InterruptedException -> 0x00fe }
            r8.get(r0, r6)     // Catch:{ TimeoutException -> 0x011c, ExecutionException -> 0x010f, InterruptedException -> 0x00fe }
            java.util.concurrent.ConcurrentHashMap r1 = r2.A0A     // Catch:{ all -> 0x0130 }
            java.lang.Object r8 = r1.get(r3)     // Catch:{ all -> 0x0130 }
            X.9Hh r8 = (X.C192519Hh) r8     // Catch:{ all -> 0x0130 }
            if (r8 != 0) goto L_0x0096
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: empty sync result for "
            r5.append(r0)     // Catch:{ all -> 0x0130 }
            r5.append(r10)     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = " (syncId is "
            r5.append(r0)     // Catch:{ all -> 0x0130 }
            r5.append(r3)     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = ")"
            X.C36321k7.A1Z(r5, r0)     // Catch:{ all -> 0x0130 }
            X.6Pu r0 = X.C131626Pu.A03     // Catch:{ all -> 0x0130 }
            android.util.Pair r5 = android.util.Pair.create(r0, r9)     // Catch:{ all -> 0x0130 }
            goto L_0x00f7
        L_0x0096:
            X.9Oj[] r6 = r8.A01     // Catch:{ all -> 0x0130 }
            int r0 = r6.length     // Catch:{ all -> 0x0130 }
            if (r0 != 0) goto L_0x00cd
            X.9OU r0 = r8.A00     // Catch:{ all -> 0x0130 }
            X.9Rr r0 = r0.A02     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x00bd
            java.lang.Integer r0 = r0.A00     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x00bd
            int r5 = r0.intValue()     // Catch:{ all -> 0x0130 }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r5 != r0) goto L_0x00bd
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: rate-limit-error "
            X.C36321k7.A1P(r0, r10, r5)     // Catch:{ all -> 0x0130 }
            X.6Pu r0 = X.C131626Pu.A05     // Catch:{ all -> 0x0130 }
            android.util.Pair r5 = android.util.Pair.create(r0, r9)     // Catch:{ all -> 0x0130 }
            goto L_0x00f7
        L_0x00bd:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: no users for "
            X.C36321k7.A1P(r0, r10, r5)     // Catch:{ all -> 0x0130 }
            X.6Pu r0 = X.C131626Pu.A03     // Catch:{ all -> 0x0130 }
            android.util.Pair r5 = android.util.Pair.create(r0, r9)     // Catch:{ all -> 0x0130 }
            goto L_0x00f7
        L_0x00cd:
            r12 = r6[r5]     // Catch:{ all -> 0x0130 }
            int r0 = r12.A04     // Catch:{ all -> 0x0130 }
            if (r0 != r7) goto L_0x00e2
            X.16D r6 = r2.A04     // Catch:{ all -> 0x0130 }
            com.whatsapp.jid.UserJid r0 = r12.A0D     // Catch:{ all -> 0x0130 }
            X.141 r14 = X.C36441kJ.A0i(r6, r0)     // Catch:{ all -> 0x0130 }
            X.1OT r11 = r2.A05     // Catch:{ all -> 0x0130 }
            X.9OU r13 = r8.A00     // Catch:{ all -> 0x0130 }
            r11.A00(r12, r13, r14, r15)     // Catch:{ all -> 0x0130 }
        L_0x00e2:
            java.util.List r0 = r12.A0K     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x00f1
            int r0 = r0.size()     // Catch:{ all -> 0x0130 }
            if (r0 <= 0) goto L_0x00f1
            java.util.List r0 = r12.A0K     // Catch:{ all -> 0x0130 }
            r0.get(r5)     // Catch:{ all -> 0x0130 }
        L_0x00f1:
            X.6Pu r0 = X.C131626Pu.A06     // Catch:{ all -> 0x0130 }
            android.util.Pair r5 = android.util.Pair.create(r0, r12)     // Catch:{ all -> 0x0130 }
        L_0x00f7:
            r4.remove(r10)
            r1.remove(r3)
            return r5
        L_0x00fe:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "ContactQuerySync/querySyncPhoneNumber: exception during Query Sync "
            X.C90464aC.A1L(r0, r10, r1, r5)     // Catch:{ all -> 0x0130 }
            X.6Pu r0 = X.C131626Pu.A02     // Catch:{ all -> 0x0130 }
            android.util.Pair r5 = android.util.Pair.create(r0, r9)     // Catch:{ all -> 0x0130 }
            goto L_0x0127
        L_0x010f:
            r1 = move-exception
            java.lang.String r0 = "querySyncPhoneNumber"
            A01(r2, r0, r1)     // Catch:{ all -> 0x0130 }
            X.6Pu r0 = X.C131626Pu.A03     // Catch:{ all -> 0x0130 }
            android.util.Pair r5 = android.util.Pair.create(r0, r9)     // Catch:{ all -> 0x0130 }
            goto L_0x0127
        L_0x011c:
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber/timeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0130 }
            X.6Pu r0 = X.C131626Pu.A03     // Catch:{ all -> 0x0130 }
            android.util.Pair r5 = android.util.Pair.create(r0, r9)     // Catch:{ all -> 0x0130 }
        L_0x0127:
            r4.remove(r10)
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0A
            r0.remove(r3)
            return r5
        L_0x0130:
            r1 = move-exception
            r4.remove(r10)
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0A
            r0.remove(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21159AAt.A02(X.5Tu, java.lang.String):android.util.Pair");
    }

    public Pair A03(C108515Tu r18, List list) {
        String A002;
        List list2;
        Pair pair;
        Pair pair2;
        Integer num;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C108515Tu r8 = C108515Tu.A0C;
        boolean z = true;
        C108515Tu r13 = r18;
        if (r13 != r8) {
            z = false;
        }
        C18740tg.A0C(z);
        if (!this.A03.A09()) {
            Log.i("ContactQuerySyncManager/querySyncPhoneNumbers: network_unavailable");
            return Pair.create(C131626Pu.A04, (Object) null);
        }
        A002 = C202329lb.A00("sync_sid_query");
        try {
            AIC A003 = A00(this);
            int A004 = this.A02.A00();
            boolean A0E2 = this.A09.A0E(4921);
            boolean z2 = true;
            if (r13 != r8) {
                z2 = false;
            }
            C18740tg.A0C(z2);
            ArrayList A0I = AnonymousClass001.A0I();
            list2 = list;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AnonymousClass9jB r0 = new AnonymousClass9jB((UserJid) null, AnonymousClass001.A0C(it));
                r0.A0C = true;
                r0.A0L = true;
                r0.A0J = true;
                r0.A0B = true;
                r0.A0F = true;
                r0.A0H = true;
                r0.A0M = A0E2;
                AnonymousClass9jB.A04(r0, A0I);
            }
            A003.A05(new C198869eK(r13, A0I, A004, true), A002, 32000).get(32000, TimeUnit.MILLISECONDS);
            ConcurrentHashMap concurrentHashMap = this.A0A;
            C192519Hh r9 = (C192519Hh) concurrentHashMap.get(A002);
            if (r9 == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("ContactQuerySyncManager/querySyncPhoneNumbers: empty sync result for ");
                A0u.append(list2);
                A0u.append(" (syncId is ");
                A0u.append(A002);
                C36321k7.A1Z(A0u, ")");
                pair2 = Pair.create(C131626Pu.A03, (Object) null);
            } else {
                if (r0 == 0) {
                    C194899Rr r02 = r9.A00.A02;
                    if (r02 == null || (num = r02.A00) == null || num.intValue() != 429) {
                        C36321k7.A1J(list2, "ContactQuerySyncManager/querySyncPhoneNumbers: no users for ", AnonymousClass000.A0u());
                        pair2 = Pair.create(C131626Pu.A03, (Object) null);
                    } else {
                        C36321k7.A1J(list2, "ContactQuerySyncManager/querySyncPhoneNumbers: rate-limit-error ", AnonymousClass000.A0u());
                        pair2 = Pair.create(C131626Pu.A05, (Object) null);
                    }
                } else {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    for (C194169Oj r12 : r9.A01) {
                        if (r12.A04 == 1) {
                            this.A05.A00(r12, r9.A00, C36441kJ.A0i(this.A04, r12.A0D), elapsedRealtime);
                            A0I2.add(r12);
                        }
                        List list3 = r12.A0K;
                        if (list3 != null && list3.size() > 0) {
                            r12.A0K.get(0);
                        }
                    }
                    pair2 = Pair.create(C131626Pu.A06, (C194169Oj[]) A0I2.toArray(new C194169Oj[0]));
                }
            }
            concurrentHashMap.remove(A002);
            return pair2;
        } catch (TimeoutException unused) {
            Log.e("ContactQuerySyncManager/querySyncPhoneNumbers/timeout");
            pair = Pair.create(C131626Pu.A03, (Object) null);
        } catch (ExecutionException e) {
            A01(this, "querySyncPhoneNumber", e);
            pair = Pair.create(C131626Pu.A03, (Object) null);
        } catch (InterruptedException e2) {
            Log.e(AnonymousClass000.A0l(list2, "ContactQuerySync/querySyncPhoneNumbers: exception during Query Sync ", AnonymousClass000.A0u()), e2);
            pair = Pair.create(C131626Pu.A02, (Object) null);
        } catch (Throwable th) {
            this.A0A.remove(A002);
            throw th;
        }
        this.A0A.remove(A002);
        return pair;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r9 == X.C108515Tu.A01) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C131626Pu A04(X.C108515Tu r19, com.whatsapp.jid.UserJid r20) {
        /*
            r18 = this;
            long r16 = android.os.SystemClock.elapsedRealtime()
            X.5Tu r0 = X.C108515Tu.A0C
            r8 = 0
            r5 = 1
            r9 = r19
            if (r9 == r0) goto L_0x0011
            X.5Tu r1 = X.C108515Tu.A01
            r0 = 0
            if (r9 != r1) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.C18740tg.A0C(r0)
            r1 = r18
            X.0wD r0 = r1.A03
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "ContactQuerySyncManager/querySyncJid: network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6Pu r2 = X.C131626Pu.A04
            return r2
        L_0x0027:
            java.util.concurrent.ConcurrentHashMap r4 = r1.A0F
            r10 = r20
            java.lang.Object r0 = r4.putIfAbsent(r10, r10)
            if (r0 == 0) goto L_0x0034
            X.6Pu r2 = X.C131626Pu.A08
            return r2
        L_0x0034:
            java.lang.String r0 = "sync_sid_query"
            java.lang.String r0 = X.C202329lb.A00(r0)
            X.AIC r6 = A00(r1)     // Catch:{ Exception -> 0x00ec }
            r11 = 0
            X.1KL r2 = r1.A02     // Catch:{ Exception -> 0x00ec }
            int r12 = r2.A00()     // Catch:{ Exception -> 0x00ec }
            X.0yC r3 = r1.A09     // Catch:{ Exception -> 0x00ec }
            r2 = 5290(0x14aa, float:7.413E-42)
            boolean r13 = r3.A0E(r2)     // Catch:{ Exception -> 0x00ec }
            r2 = 5751(0x1677, float:8.059E-42)
            boolean r14 = r3.A0E(r2)     // Catch:{ Exception -> 0x00ec }
            r2 = 4921(0x1339, float:6.896E-42)
            boolean r15 = r3.A0E(r2)     // Catch:{ Exception -> 0x00ec }
            X.9eK r7 = X.C198869eK.A00(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00ec }
            r2 = 32000(0x7d00, double:1.581E-319)
            X.777 r7 = r6.A05(r7, r0, r2)     // Catch:{ Exception -> 0x00ec }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x00e4, ExecutionException -> 0x00db }
            r7.get(r2, r6)     // Catch:{ TimeoutException -> 0x00e4, ExecutionException -> 0x00db }
            java.util.concurrent.ConcurrentHashMap r6 = r1.A0A     // Catch:{ Exception -> 0x00ec }
            java.lang.Object r7 = r6.get(r0)     // Catch:{ Exception -> 0x00ec }
            X.9Hh r7 = (X.C192519Hh) r7     // Catch:{ Exception -> 0x00ec }
            if (r7 != 0) goto L_0x008e
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00ec }
            java.lang.String r2 = "ContactQuerySyncManager/querySyncJid: empty sync result for "
            r3.append(r2)     // Catch:{ Exception -> 0x00ec }
            r3.append(r10)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r2 = " (syncId is "
            r3.append(r2)     // Catch:{ Exception -> 0x00ec }
            r3.append(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r2 = ")"
            X.C36321k7.A1Z(r3, r2)     // Catch:{ Exception -> 0x00ec }
            X.6Pu r2 = X.C131626Pu.A03     // Catch:{ Exception -> 0x00ec }
            goto L_0x00d4
        L_0x008e:
            X.9Oj[] r3 = r7.A01     // Catch:{ Exception -> 0x00ec }
            int r2 = r3.length     // Catch:{ Exception -> 0x00ec }
            if (r2 != 0) goto L_0x00bd
            X.9OU r2 = r7.A00     // Catch:{ Exception -> 0x00ec }
            X.9Rr r2 = r2.A02     // Catch:{ Exception -> 0x00ec }
            if (r2 == 0) goto L_0x00b1
            java.lang.Integer r2 = r2.A00     // Catch:{ Exception -> 0x00ec }
            if (r2 == 0) goto L_0x00b1
            int r3 = r2.intValue()     // Catch:{ Exception -> 0x00ec }
            r2 = 429(0x1ad, float:6.01E-43)
            if (r3 != r2) goto L_0x00b1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00ec }
            java.lang.String r2 = "ContactQuerySyncManager/querySyncJid: rate-limit-error "
            X.C36321k7.A1J(r10, r2, r3)     // Catch:{ Exception -> 0x00ec }
            X.6Pu r2 = X.C131626Pu.A05     // Catch:{ Exception -> 0x00ec }
            goto L_0x00d4
        L_0x00b1:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00ec }
            java.lang.String r2 = "ContactQuerySyncManager/querySyncJid: no users for "
            X.C36321k7.A1J(r10, r2, r3)     // Catch:{ Exception -> 0x00ec }
            X.6Pu r2 = X.C131626Pu.A03     // Catch:{ Exception -> 0x00ec }
            goto L_0x00d4
        L_0x00bd:
            r13 = r3[r8]     // Catch:{ Exception -> 0x00ec }
            int r2 = r13.A04     // Catch:{ Exception -> 0x00ec }
            if (r2 != r5) goto L_0x00d2
            X.16D r3 = r1.A04     // Catch:{ Exception -> 0x00ec }
            com.whatsapp.jid.UserJid r2 = r13.A0D     // Catch:{ Exception -> 0x00ec }
            X.141 r15 = X.C36441kJ.A0i(r3, r2)     // Catch:{ Exception -> 0x00ec }
            X.1OT r12 = r1.A05     // Catch:{ Exception -> 0x00ec }
            X.9OU r14 = r7.A00     // Catch:{ Exception -> 0x00ec }
            r12.A00(r13, r14, r15, r16)     // Catch:{ Exception -> 0x00ec }
        L_0x00d2:
            X.6Pu r2 = X.C131626Pu.A06     // Catch:{ Exception -> 0x00ec }
        L_0x00d4:
            r4.remove(r10)
            r6.remove(r0)
            return r2
        L_0x00db:
            r3 = move-exception
            java.lang.String r2 = "querySyncJid"
            A01(r1, r2, r3)     // Catch:{ Exception -> 0x00ec }
            X.6Pu r2 = X.C131626Pu.A03     // Catch:{ Exception -> 0x00ec }
            goto L_0x00ff
        L_0x00e4:
            java.lang.String r2 = "ContactQuerySyncManager/querySyncJid/timeout"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x00ec }
            X.6Pu r2 = X.C131626Pu.A03     // Catch:{ Exception -> 0x00ec }
            goto L_0x00ff
        L_0x00ec:
            r7 = move-exception
            java.lang.String r2 = "ContactQuerySync/querySyncJid/exception thrown"
            com.whatsapp.util.Log.e(r2, r7)     // Catch:{ all -> 0x0108 }
            X.0wN r6 = r1.A0B     // Catch:{ all -> 0x0108 }
            java.lang.String r3 = "ContactQuerySync/querySyncJid"
            java.lang.String r2 = r7.getMessage()     // Catch:{ all -> 0x0108 }
            r6.A0E(r3, r2, r5)     // Catch:{ all -> 0x0108 }
            X.6Pu r2 = X.C131626Pu.A02     // Catch:{ all -> 0x0108 }
        L_0x00ff:
            r4.remove(r10)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A0A
            r1.remove(r0)
            return r2
        L_0x0108:
            r2 = move-exception
            r4.remove(r10)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A0A
            r1.remove(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21159AAt.A04(X.5Tu, com.whatsapp.jid.UserJid):X.6Pu");
    }
}
