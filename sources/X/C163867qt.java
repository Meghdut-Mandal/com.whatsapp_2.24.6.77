package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7qt  reason: invalid class name and case insensitive filesystem */
public class C163867qt implements C160217ke {
    public Object A00;
    public final int A01;

    public C163867qt(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bf6(C121065sX r2) {
        if (this.A01 != 0) {
            throw C90464aC.A0o();
        }
    }

    public void BfE(C122855vX r10) {
        Exception exc;
        if (this.A01 != 0) {
            C123505wc r8 = (C123505wc) this.A00;
            String str = r8.A03;
            String str2 = r8.A04;
            if (r10 == null || r10.A00 != 5) {
                AnonymousClass64K r1 = r8.A00;
                if (r1 != null) {
                    AnonymousClass66U r3 = r1.A04.A04;
                    if (r3 == null) {
                        throw C36331k8.A0d("fcsLoadingEventManager");
                    }
                    String str3 = r1.A05;
                    AnonymousClass00C.A07(str3);
                    r3.A01((AnonymousClass6PH) null, "onLoadingFailure", str3, (Map) null);
                    return;
                }
                return;
            }
            C134906bn r7 = r8.A02;
            if (r7 != null) {
                AnonymousClass6D3 r0 = r8.A01;
                C131616Pt r6 = r0.A01;
                String str4 = r7.A01;
                AnonymousClass6MZ r12 = r0.A00;
                AnonymousClass00C.A0D(str, 0);
                r6.A02(new AnonymousClass5OH(r12, str, str2), new AnonymousClass6S9((Object) r10, r7.A00, r7.A02), str4);
            }
            AnonymousClass64K r02 = r8.A00;
            if (r02 != null) {
                r02.A00();
            }
        } else if (r10 != null && (exc = r10.A02) != null) {
            C123685wu r13 = (C123685wu) this.A00;
            C100484v6 r32 = new C100484v6();
            Set set = r13.A00.A04;
            String str5 = r13.A03;
            set.remove(str5);
            r13.A04.invoke(new C100544vC(r32, str5, exc));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: X.5on[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.5on[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: X.5on[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        X.C05600Qi.A00(r21, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ca, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0318 A[LOOP:8: B:154:0x0312->B:156:0x0318, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0320  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BfG(java.lang.String r30) {
        /*
            r29 = this;
            r1 = r29
            int r0 = r1.A01
            if (r0 != 0) goto L_0x03ee
            if (r30 == 0) goto L_0x03cb
            int r0 = r30.length()
            if (r0 == 0) goto L_0x03cb
            java.lang.Object r3 = r1.A00
            X.5wu r3 = (X.C123685wu) r3
            X.09w r26 = X.C023409w.A00
            X.4v6 r1 = new X.4v6
            r1.<init>()
            r4 = 1
            r0 = r26
            X.AnonymousClass00C.A0D(r0, r4)
            r0 = 2
            X.5on[] r6 = new X.C118825on[r0]
            r25 = 0
            r6[r25] = r1
            X.4v4 r5 = r3.A01
            X.5vw r0 = r3.A00
            r28 = r0
            X.7kt r0 = r0.A00
            r27 = r0
            long r1 = r27.currentMonotonicTimestamp()
            java.lang.String r0 = "request_end"
            r5.A00(r0, r1)
            java.util.Map r0 = r5.A01
            java.util.Map r2 = X.C000400e.A0B(r0)
            java.util.Map r0 = r5.A00
            java.util.Map r1 = X.C000400e.A0B(r0)
            X.4v7 r0 = new X.4v7
            r0.<init>(r2, r1)
            r6[r4] = r0
            X.5on r24 = A00(r6)
            r23 = 0
            java.lang.String r22 = "ComponentQueryParser"
            java.lang.String r1 = "ComponentQueryParser.parseBatched"
            r0 = r22
            java.lang.String r0 = X.C90464aC.A0d(r0, r1)     // Catch:{ all -> 0x03c6 }
            X.AnonymousClass6RN.A00(r0)     // Catch:{ all -> 0x03c6 }
            long r17 = r27.currentMonotonicTimestamp()     // Catch:{ all -> 0x03c6 }
            android.util.JsonReader r21 = X.C90484aE.A0Q(r30)     // Catch:{ Exception -> 0x02cb }
            X.6oM r14 = new X.6oM     // Catch:{ all -> 0x02c2 }
            r0 = r21
            r14.<init>(r0)     // Catch:{ all -> 0x02c2 }
            r14.BQE()     // Catch:{ all -> 0x02c2 }
            X.5iR r12 = new X.5iR     // Catch:{ all -> 0x02c2 }
            r12.<init>()     // Catch:{ all -> 0x02c2 }
            java.lang.Integer r0 = r14.A01     // Catch:{ all -> 0x02c2 }
            java.lang.Integer r13 = X.C023109s.A0C     // Catch:{ all -> 0x02c2 }
            if (r0 == r13) goto L_0x0083
            r14.BuF()     // Catch:{ all -> 0x02c2 }
            r12 = r23
            goto L_0x0203
        L_0x0083:
            java.lang.Integer r0 = r14.BQE()     // Catch:{ all -> 0x02c2 }
            java.lang.Integer r11 = X.C023109s.A0G     // Catch:{ all -> 0x02c2 }
            if (r0 == r11) goto L_0x0203
            java.lang.String r1 = r14.A02     // Catch:{ all -> 0x02c2 }
            int r0 = X.AnonymousClass5ZE.A00(r1)     // Catch:{ all -> 0x02c2 }
            r10 = 32
            boolean r0 = X.C36371kC.A1T(r0, r10)
            r14.BQE()     // Catch:{ all -> 0x02c2 }
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = "component_query_responses"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x01fe
            r9 = 0
            java.lang.Integer r0 = r14.A01     // Catch:{ all -> 0x02c2 }
            java.lang.Integer r8 = X.C023109s.A00     // Catch:{ all -> 0x02c2 }
            if (r0 != r8) goto L_0x01fc
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x02c2 }
        L_0x00af:
            java.lang.Integer r0 = r14.BQE()     // Catch:{ all -> 0x02c2 }
            java.lang.Integer r7 = X.C023109s.A01     // Catch:{ all -> 0x02c2 }
            if (r0 == r7) goto L_0x01fc
            X.5uW r6 = new X.5uW     // Catch:{ all -> 0x02c2 }
            r6.<init>()     // Catch:{ all -> 0x02c2 }
            java.lang.Integer r0 = r14.A01     // Catch:{ all -> 0x02c2 }
            if (r0 == r13) goto L_0x00c4
            r14.BuF()     // Catch:{ all -> 0x02c2 }
            goto L_0x00af
        L_0x00c4:
            java.lang.Integer r0 = r14.BQE()     // Catch:{ all -> 0x02c2 }
            if (r0 == r11) goto L_0x01f7
            java.lang.String r2 = r14.A02     // Catch:{ all -> 0x02c2 }
            int r0 = X.AnonymousClass5ZE.A00(r2)     // Catch:{ all -> 0x02c2 }
            boolean r0 = X.C36371kC.A1T(r0, r10)
            r14.BQE()     // Catch:{ all -> 0x02c2 }
            r1 = 0
            if (r0 != 0) goto L_0x0105
            java.lang.String r20 = "app_id"
            r0 = r20
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x00f5
            X.6oP r1 = r14.A00     // Catch:{ all -> 0x02c2 }
            boolean r0 = r1.BMV()     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x00ee
            r0 = 0
            goto L_0x00f2
        L_0x00ee:
            java.lang.String r0 = r1.BvC()     // Catch:{ all -> 0x02c2 }
        L_0x00f2:
            r6.A02 = r0     // Catch:{ all -> 0x02c2 }
            goto L_0x0105
        L_0x00f5:
            java.lang.String r19 = "consumed_params"
            r0 = r19
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x0109
            java.util.HashMap r0 = X.C129296Gi.A01(r14)     // Catch:{ all -> 0x02c2 }
            r6.A03 = r0     // Catch:{ all -> 0x02c2 }
        L_0x0105:
            r14.BuF()     // Catch:{ all -> 0x02c2 }
            goto L_0x00c4
        L_0x0109:
            java.lang.String r0 = "payload"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x0118
            android.util.Pair r0 = X.C129996Jh.A00(r14)     // Catch:{ all -> 0x02c2 }
            r6.A00 = r0     // Catch:{ all -> 0x02c2 }
            goto L_0x0105
        L_0x0118:
            java.lang.String r0 = "resources"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x0105
            X.72B r16 = new X.72B     // Catch:{ all -> 0x02c2 }
            r16.<init>()     // Catch:{ all -> 0x02c2 }
            java.lang.Integer r0 = r14.A01     // Catch:{ all -> 0x02c2 }
            if (r0 == r13) goto L_0x012f
            r14.BuF()     // Catch:{ all -> 0x02c2 }
        L_0x012c:
            r6.A01 = r1     // Catch:{ all -> 0x02c2 }
            goto L_0x0105
        L_0x012f:
            java.lang.Integer r0 = r14.BQE()     // Catch:{ all -> 0x02c2 }
            if (r0 == r11) goto L_0x01f3
            java.lang.String r1 = r14.A02     // Catch:{ all -> 0x02c2 }
            int r0 = X.AnonymousClass5ZE.A00(r1)     // Catch:{ all -> 0x02c2 }
            boolean r0 = X.C36371kC.A1T(r0, r10)
            r14.BQE()     // Catch:{ all -> 0x02c2 }
            if (r0 != 0) goto L_0x01ee
            java.lang.String r0 = "acq"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x01ee
            r5 = 0
            java.lang.Integer r0 = r14.A01     // Catch:{ all -> 0x02c2 }
            if (r0 != r8) goto L_0x01ea
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x02c2 }
        L_0x0155:
            java.lang.Integer r0 = r14.BQE()     // Catch:{ all -> 0x02c2 }
            if (r0 == r7) goto L_0x01ea
            X.72E r15 = new X.72E     // Catch:{ all -> 0x02c2 }
            r15.<init>()     // Catch:{ all -> 0x02c2 }
            java.lang.Integer r0 = r14.A01     // Catch:{ all -> 0x02c2 }
            if (r0 == r13) goto L_0x0168
            r14.BuF()     // Catch:{ all -> 0x02c2 }
            goto L_0x0155
        L_0x0168:
            java.lang.Integer r0 = r14.BQE()     // Catch:{ all -> 0x02c2 }
            if (r0 == r11) goto L_0x01e5
            java.lang.String r2 = r14.A02     // Catch:{ all -> 0x02c2 }
            int r0 = X.AnonymousClass5ZE.A00(r2)     // Catch:{ all -> 0x02c2 }
            boolean r0 = X.C36371kC.A1T(r0, r10)
            r14.BQE()     // Catch:{ all -> 0x02c2 }
            if (r0 != 0) goto L_0x0194
            r0 = r20
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x02c2 }
            r1 = 0
            if (r0 == 0) goto L_0x0198
            X.6oP r2 = r14.A00     // Catch:{ all -> 0x02c2 }
            boolean r0 = r2.BMV()     // Catch:{ all -> 0x02c2 }
            if (r0 != 0) goto L_0x0192
            java.lang.String r1 = r2.BvC()     // Catch:{ all -> 0x02c2 }
        L_0x0192:
            r15.appId = r1     // Catch:{ all -> 0x02c2 }
        L_0x0194:
            r14.BuF()     // Catch:{ all -> 0x02c2 }
            goto L_0x0168
        L_0x0198:
            r0 = r19
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x01a7
            java.util.HashMap r0 = X.C129296Gi.A01(r14)     // Catch:{ all -> 0x02c2 }
            r15.consumedParams = r0     // Catch:{ all -> 0x02c2 }
            goto L_0x0194
        L_0x01a7:
            java.lang.String r0 = "cache_keys"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x01d0
            java.lang.Integer r0 = r14.A01     // Catch:{ all -> 0x02c2 }
            if (r0 != r8) goto L_0x01cd
            java.util.HashSet r1 = X.C36441kJ.A16()     // Catch:{ all -> 0x02c2 }
        L_0x01b7:
            java.lang.Integer r0 = r14.BQE()     // Catch:{ all -> 0x02c2 }
            if (r0 == r7) goto L_0x01cd
            X.6oP r2 = r14.A00     // Catch:{ all -> 0x02c2 }
            boolean r0 = r2.BMV()     // Catch:{ all -> 0x02c2 }
            if (r0 != 0) goto L_0x01b7
            java.lang.String r0 = r2.BvC()     // Catch:{ all -> 0x02c2 }
            r1.add(r0)     // Catch:{ all -> 0x02c2 }
            goto L_0x01b7
        L_0x01cd:
            r15.cacheKeys = r1     // Catch:{ all -> 0x02c2 }
            goto L_0x0194
        L_0x01d0:
            java.lang.String r0 = "cache_ttl"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x0194
            X.6oP r0 = r14.A00     // Catch:{ all -> 0x02c2 }
            long r0 = r0.BOz()     // Catch:{ all -> 0x02c2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02c2 }
            r15.cacheTtl = r0     // Catch:{ all -> 0x02c2 }
            goto L_0x0194
        L_0x01e5:
            r5.add(r15)     // Catch:{ all -> 0x02c2 }
            goto L_0x0155
        L_0x01ea:
            r0 = r16
            r0.asyncComponentQueries = r5     // Catch:{ all -> 0x02c2 }
        L_0x01ee:
            r14.BuF()     // Catch:{ all -> 0x02c2 }
            goto L_0x012f
        L_0x01f3:
            r1 = r16
            goto L_0x012c
        L_0x01f7:
            r9.add(r6)     // Catch:{ all -> 0x02c2 }
            goto L_0x00af
        L_0x01fc:
            r12.A00 = r9     // Catch:{ all -> 0x02c2 }
        L_0x01fe:
            r14.BuF()     // Catch:{ all -> 0x02c2 }
            goto L_0x0083
        L_0x0203:
            java.util.List r0 = r12.A00     // Catch:{ all -> 0x02c2 }
            if (r0 != 0) goto L_0x021e
            java.lang.String r1 = "Expected a valid set of batched component responses but found none"
            r0 = r22
            X.AnonymousClass6RS.A01(r1, r0)     // Catch:{ all -> 0x02c2 }
            X.4v6 r1 = new X.4v6     // Catch:{ all -> 0x02c2 }
            r1.<init>()     // Catch:{ all -> 0x02c2 }
            r0 = r23
            X.011 r1 = X.C36441kJ.A19(r0, r1)     // Catch:{ all -> 0x02c2 }
            r21.close()     // Catch:{ Exception -> 0x02cb }
            goto L_0x02dc
        L_0x021e:
            long r0 = r27.currentMonotonicTimestamp()     // Catch:{ all -> 0x02c2 }
            java.util.List r2 = r12.A00     // Catch:{ all -> 0x02c2 }
            X.AnonymousClass00C.A07(r2)     // Catch:{ all -> 0x02c2 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x02c2 }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x02c2 }
        L_0x022f:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x02c2 }
            if (r2 == 0) goto L_0x0285
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x02c2 }
            X.5uW r7 = (X.C122235uW) r7     // Catch:{ all -> 0x02c2 }
            android.util.Pair r2 = r7.A00     // Catch:{ all -> 0x02c2 }
            r6 = 0
            if (r2 == 0) goto L_0x0283
            java.lang.Object r13 = r2.first     // Catch:{ all -> 0x02c2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x02c2 }
            java.lang.Object r6 = r2.second     // Catch:{ all -> 0x02c2 }
            X.6Jh r6 = (X.C129996Jh) r6     // Catch:{ all -> 0x02c2 }
        L_0x0248:
            java.lang.String r12 = r7.A02     // Catch:{ all -> 0x02c2 }
            java.util.Map r14 = r7.A03     // Catch:{ all -> 0x02c2 }
            if (r13 == 0) goto L_0x0265
            if (r6 == 0) goto L_0x0265
            if (r12 == 0) goto L_0x0268
            if (r14 == 0) goto L_0x0268
            r2 = r26
            X.69R r10 = X.AnonymousClass5ZB.A00(r6, r2)     // Catch:{ all -> 0x02c2 }
            X.72B r11 = r7.A01     // Catch:{ all -> 0x02c2 }
            X.6Ci r9 = new X.6Ci     // Catch:{ all -> 0x02c2 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x02c2 }
            r5.add(r9)     // Catch:{ all -> 0x02c2 }
            goto L_0x022f
        L_0x0265:
            java.lang.String r6 = "Got null payload in multi component response"
            goto L_0x027d
        L_0x0268:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02c2 }
            java.lang.String r2 = "Unexpected null in metadata: {appId: "
            r6.append(r2)     // Catch:{ all -> 0x02c2 }
            r6.append(r12)     // Catch:{ all -> 0x02c2 }
            java.lang.String r2 = "}, {consumed_params: "
            r6.append(r2)     // Catch:{ all -> 0x02c2 }
            java.lang.String r6 = X.C90464aC.A0X(r14, r6)     // Catch:{ all -> 0x02c2 }
        L_0x027d:
            r2 = r22
            X.AnonymousClass6RS.A01(r6, r2)     // Catch:{ all -> 0x02c2 }
            goto L_0x022f
        L_0x0283:
            r13 = r6
            goto L_0x0248
        L_0x0285:
            X.68Z r9 = new X.68Z     // Catch:{ all -> 0x02c2 }
            r9.<init>(r5)     // Catch:{ all -> 0x02c2 }
            long r7 = r27.currentMonotonicTimestamp()     // Catch:{ all -> 0x02c2 }
            X.4v3 r10 = new X.4v3     // Catch:{ all -> 0x02c2 }
            r10.<init>()     // Catch:{ all -> 0x02c2 }
            java.lang.String r2 = "parse_start"
            r5 = r17
            r10.A00(r2, r5)     // Catch:{ all -> 0x02c2 }
            java.lang.String r2 = "json_parse_start"
            r10.A00(r2, r5)     // Catch:{ all -> 0x02c2 }
            java.lang.String r2 = "json_parse_end"
            r10.A00(r2, r0)     // Catch:{ all -> 0x02c2 }
            java.lang.String r0 = "parse_end"
            r10.A00(r0, r7)     // Catch:{ all -> 0x02c2 }
            java.util.Map r0 = r10.A01     // Catch:{ all -> 0x02c2 }
            java.util.Map r2 = X.C000400e.A0B(r0)     // Catch:{ all -> 0x02c2 }
            java.util.Map r0 = r10.A00     // Catch:{ all -> 0x02c2 }
            java.util.Map r1 = X.C000400e.A0B(r0)     // Catch:{ all -> 0x02c2 }
            X.4v8 r0 = new X.4v8     // Catch:{ all -> 0x02c2 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x02c2 }
            X.011 r1 = X.C36441kJ.A19(r9, r0)     // Catch:{ all -> 0x02c2 }
            r21.close()     // Catch:{ Exception -> 0x02cb }
            goto L_0x02dc
        L_0x02c2:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x02c4 }
        L_0x02c4:
            r1 = move-exception
            r0 = r21
            X.C05600Qi.A00(r0, r2)     // Catch:{ Exception -> 0x02cb }
            throw r1     // Catch:{ Exception -> 0x02cb }
        L_0x02cb:
            r1 = move-exception
            r0 = r22
            X.AnonymousClass6RS.A02(r0, r1)     // Catch:{ all -> 0x03c6 }
            X.4v6 r1 = new X.4v6     // Catch:{ all -> 0x03c6 }
            r1.<init>()     // Catch:{ all -> 0x03c6 }
            r0 = r23
            X.011 r1 = X.C36441kJ.A19(r0, r1)     // Catch:{ all -> 0x03c6 }
        L_0x02dc:
            X.AnonymousClass68E.A00()
            java.lang.Object r0 = r1.first
            X.68Z r0 = (X.AnonymousClass68Z) r0
            java.lang.Object r8 = r1.second
            if (r0 != 0) goto L_0x0320
            java.lang.String r5 = r3.A03
            java.lang.String r0 = "Expected a valid component query response but found empty"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r0)
            r0 = 2
            X.5on[] r0 = new X.C118825on[r0]
            r0[r25] = r24
            r0[r4] = r8
            X.5on r1 = A00(r0)
            X.4vC r0 = new X.4vC
            r0.<init>(r1, r5, r2)
            java.util.List r7 = X.C36371kC.A11(r0)
        L_0x0303:
            r0 = r28
            java.util.Set r1 = r0.A04
            java.lang.String r0 = r3.A03
            r1.remove(r0)
            X.02t r2 = r3.A04
            java.util.Iterator r1 = r7.iterator()
        L_0x0312:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03ee
            java.lang.Object r0 = r1.next()
            r2.invoke(r0)
            goto L_0x0312
        L_0x0320:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.List r0 = r0.A00
            X.6C0 r6 = r3.A02
            java.util.Iterator r13 = r0.iterator()
        L_0x032c:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0303
            java.lang.Object r10 = r13.next()
            X.6Ci r10 = (X.C128456Ci) r10
            java.lang.String r12 = r10.A02
            java.util.Map r11 = r6.A03
            java.util.Map r0 = r10.A04
            java.util.LinkedHashMap r9 = X.C36431kI.A1G()
            java.util.Iterator r5 = X.AnonymousClass000.A0y(r0)
        L_0x0346:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0366
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r5)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r11.containsKey(r1)
            if (r0 == 0) goto L_0x0346
            java.lang.Object r0 = r11.get(r1)
            r9.put(r2, r0)
            goto L_0x0346
        L_0x0366:
            java.lang.String r5 = X.AnonymousClass6Vs.A00(r12, r9)
            X.69R r9 = r10.A00
            X.72B r2 = r10.A01
            r0 = r28
            X.5iO r0 = r0.A01     // Catch:{ Exception -> 0x0386 }
            X.62a r11 = r0.A00     // Catch:{ Exception -> 0x0386 }
            long r0 = r6.A00     // Catch:{ Exception -> 0x0386 }
            java.lang.Integer r10 = r6.A01     // Catch:{ Exception -> 0x0386 }
            r14 = r11
            r15 = r9
            r16 = r2
            r17 = r10
            r18 = r5
            r19 = r0
            r14.A00(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0386 }
            goto L_0x039c
        L_0x0386:
            r10 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 0
            X.C90514aH.A1U(r10, r1, r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r0 = "Component query fetcher successfully fetched from network but failed to write to cache: %s"
            java.lang.String r1 = X.C90504aG.A0m(r0, r1)
            java.lang.String r0 = "BloksComponentQueryFetcher"
            X.AnonymousClass6RS.A01(r0, r1)
        L_0x039c:
            r0 = 2
            X.5on[] r0 = new X.C118825on[r0]
            r0[r25] = r24
            r0[r4] = r8
            X.5on r1 = A00(r0)
            X.4v9 r0 = new X.4v9
            r0.<init>(r9, r1, r5)
            r7.add(r0)
            if (r2 == 0) goto L_0x032c
            r0 = 2
            X.5on[] r0 = new X.C118825on[r0]
            r0[r25] = r24
            r0[r4] = r8
            X.5on r1 = A00(r0)
            X.4vA r0 = new X.4vA
            r0.<init>(r1, r2, r5)
            r7.add(r0)
            goto L_0x032c
        L_0x03c6:
            r0 = move-exception
            X.AnonymousClass68E.A00()
            throw r0
        L_0x03cb:
            java.lang.Object r1 = r1.A00
            X.5wu r1 = (X.C123685wu) r1
            java.lang.String r0 = "AsyncComponentFetcherErrorNoData"
            java.lang.Throwable r4 = new java.lang.Throwable
            r4.<init>(r0)
            X.4v6 r3 = new X.4v6
            r3.<init>()
            X.5vw r0 = r1.A00
            java.util.Set r0 = r0.A04
            java.lang.String r2 = r1.A03
            r0.remove(r2)
            X.02t r1 = r1.A04
            X.4vC r0 = new X.4vC
            r0.<init>(r3, r2, r4)
            r1.invoke(r0)
        L_0x03ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163867qt.BfG(java.lang.String):void");
    }

    public static final C118825on A00(C118825on... r6) {
        LinkedHashMap A1G = C36431kI.A1G();
        LinkedHashMap A1G2 = C36431kI.A1G();
        int i = 0;
        do {
            C118825on r1 = r6[i];
            A1G.putAll(r1.A00);
            A1G2.putAll(r1.A01);
            i++;
        } while (i < 2);
        return new C118825on(C000400e.A0B(A1G2), C000400e.A0B(A1G));
    }
}
