package X;

import androidx.compose.runtime.Recomposer;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Vf  reason: invalid class name and case insensitive filesystem */
public final class C155217Vf extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C1506876f $alreadyComposed;
    public final /* synthetic */ C1506876f $modifiedValues;
    public final /* synthetic */ List $toApply;
    public final /* synthetic */ Set $toComplete;
    public final /* synthetic */ List $toInsert;
    public final /* synthetic */ Set $toLateApply;
    public final /* synthetic */ List $toRecompose;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155217Vf(Recomposer recomposer, C1506876f r3, C1506876f r4, List list, List list2, List list3, Set set, Set set2) {
        super(1);
        this.this$0 = recomposer;
        this.$modifiedValues = r3;
        this.$alreadyComposed = r4;
        this.$toRecompose = list;
        this.$toInsert = list2;
        this.$toLateApply = set;
        this.$toApply = list3;
        this.$toComplete = set2;
    }

    public static void A00(C1506876f r0, C1506876f r1, List list, Set set, Set set2) {
        list.clear();
        set.clear();
        set2.clear();
        r0.clear();
        r1.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        r9 = r6.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02b2, code lost:
        if (r1 >= r9) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02b4, code lost:
        r2.add((X.C161477my) r6.get(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02c0, code lost:
        r9 = r6.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02c5, code lost:
        if (r1 >= r9) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02c7, code lost:
        ((X.C161477my) r6.get(r1)).B1G();
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02ec, code lost:
        r6.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02f3, code lost:
        if (X.C90514aH.A1a(r7) == false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        X.AnonymousClass03Y.A0B(r7, r2);
        r1 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0300, code lost:
        if (r1.hasNext() == false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0302, code lost:
        ((X.C161477my) r1.next()).B1J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x030c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        androidx.compose.runtime.Recomposer.A02((X.C161477my) null, r5, r1);
        r22.clear();
        r21.clear();
        A00(r4, r3, r6, r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r7.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x031f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r7.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0325, code lost:
        r7.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x032c, code lost:
        if (X.C90514aH.A1a(r2) == false) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        r11 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0336, code lost:
        if (r11.hasNext() == false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0338, code lost:
        r10 = (X.C136986fP) ((X.C161477my) r11.next());
        r9 = r10.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0342, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        r10.A05.A0J = null;
        X.C136986fP.A02(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x034d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        X.C136986fP.A02(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0351, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0352, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        X.C136986fP.A03(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0356, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x035a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        androidx.compose.runtime.Recomposer.A02((X.C161477my) null, r5, r1);
        r22.clear();
        r21.clear();
        A00(r4, r3, r6, r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x036d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0373, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0376, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        androidx.compose.runtime.Recomposer.A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x037b, code lost:
        X.AnonymousClass6YQ.A00().A0E();
        r3.clear();
        r4.clear();
        r5.A04 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x038c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        r0 = X.AnonymousClass6XJ.A01("Preparing a composition while composing is not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a5, code lost:
        if (X.C36401kF.A1a(r6) == false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        r5.A00++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            long r9 = X.C36431kI.A09(r24)
            r8 = r23
            androidx.compose.runtime.Recomposer r0 = r8.this$0
            java.lang.Object r1 = r0.A0C
            monitor-enter(r1)
            boolean r0 = androidx.compose.runtime.Recomposer.A04(r0)     // Catch:{ all -> 0x0416 }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = "Recomposer:animation"
            androidx.compose.runtime.Recomposer r0 = r8.this$0
            android.os.Trace.beginSection(r1)
            X.6fM r1 = r0.A0A     // Catch:{ all -> 0x0411 }
            java.lang.Object r6 = r1.A03     // Catch:{ all -> 0x0411 }
            monitor-enter(r6)     // Catch:{ all -> 0x0411 }
            java.util.List r5 = r1.A01     // Catch:{ all -> 0x040e }
            java.util.List r0 = r1.A02     // Catch:{ all -> 0x040e }
            r1.A01 = r0     // Catch:{ all -> 0x040e }
            r1.A02 = r5     // Catch:{ all -> 0x040e }
            r4 = 0
            int r3 = r5.size()     // Catch:{ all -> 0x040e }
        L_0x002b:
            if (r4 >= r3) goto L_0x004b
            java.lang.Object r0 = r5.get(r4)     // Catch:{ all -> 0x040e }
            X.5nc r0 = (X.C118275nc) r0     // Catch:{ all -> 0x040e }
            X.09x r2 = r0.A00     // Catch:{ all -> 0x040e }
            X.02t r1 = r0.A01     // Catch:{ all -> 0x0040 }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0040 }
            java.lang.Object r0 = r1.invoke(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0045
        L_0x0040:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x040e }
        L_0x0045:
            r2.resumeWith(r0)     // Catch:{ all -> 0x040e }
            int r4 = r4 + 1
            goto L_0x002b
        L_0x004b:
            r5.clear()     // Catch:{ all -> 0x040e }
            monitor-exit(r6)     // Catch:{ all -> 0x0411 }
            X.AnonymousClass6VV.A04()     // Catch:{ all -> 0x0411 }
            android.os.Trace.endSection()
        L_0x0055:
            java.lang.String r1 = "Recomposer:recompose"
            androidx.compose.runtime.Recomposer r5 = r8.this$0
            X.76f r4 = r8.$modifiedValues
            X.76f r3 = r8.$alreadyComposed
            java.util.List r0 = r8.$toRecompose
            r22 = r0
            java.util.List r0 = r8.$toInsert
            r21 = r0
            java.util.Set r7 = r8.$toLateApply
            java.util.List r6 = r8.$toApply
            java.util.Set r2 = r8.$toComplete
            android.os.Trace.beginSection(r1)
            androidx.compose.runtime.Recomposer.A06(r5)     // Catch:{ all -> 0x0411 }
            java.lang.Object r8 = r5.A0C     // Catch:{ all -> 0x0411 }
            monitor-enter(r8)     // Catch:{ all -> 0x0411 }
            java.util.List r11 = r5.A0E     // Catch:{ all -> 0x040b }
            int r10 = r11.size()     // Catch:{ all -> 0x040b }
            r9 = 0
        L_0x007b:
            if (r9 >= r10) goto L_0x008b
            java.lang.Object r1 = r11.get(r9)     // Catch:{ all -> 0x040b }
            X.7my r1 = (X.C161477my) r1     // Catch:{ all -> 0x040b }
            r0 = r22
            r0.add(r1)     // Catch:{ all -> 0x040b }
            int r9 = r9 + 1
            goto L_0x007b
        L_0x008b:
            r11.clear()     // Catch:{ all -> 0x040b }
            monitor-exit(r8)     // Catch:{ all -> 0x0411 }
            r4.clear()     // Catch:{ all -> 0x0411 }
            r3.clear()     // Catch:{ all -> 0x0411 }
        L_0x0095:
            boolean r0 = X.C36401kF.A1a(r22)     // Catch:{ all -> 0x0411 }
            if (r0 != 0) goto L_0x00b0
            boolean r0 = X.C36401kF.A1a(r21)     // Catch:{ all -> 0x0411 }
            if (r0 != 0) goto L_0x00b0
            boolean r0 = X.C36401kF.A1a(r6)     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x02ef
            long r0 = r5.A00     // Catch:{ all -> 0x0411 }
            r9 = 1
            long r0 = r0 + r9
            r5.A00 = r0     // Catch:{ all -> 0x0411 }
            goto L_0x02ad
        L_0x00b0:
            int r18 = r22.size()     // Catch:{ Exception -> 0x03ef }
            r13 = 0
        L_0x00b5:
            r0 = r18
            if (r13 >= r0) goto L_0x0150
            r0 = r22
            java.lang.Object r15 = r0.get(r13)     // Catch:{ Exception -> 0x03ef }
            X.7my r15 = (X.C161477my) r15     // Catch:{ Exception -> 0x03ef }
            r3.add(r15)     // Catch:{ Exception -> 0x03ef }
            r10 = r15
            X.6fP r10 = (X.C136986fP) r10     // Catch:{ Exception -> 0x03ef }
            X.6fF r14 = r10.A05     // Catch:{ Exception -> 0x03ef }
            boolean r0 = r14.A0M     // Catch:{ Exception -> 0x03ef }
            r12 = 0
            if (r0 != 0) goto L_0x014c
            boolean r0 = r10.A02     // Catch:{ Exception -> 0x03ef }
            if (r0 != 0) goto L_0x014c
            java.util.Set r0 = r5.A04     // Catch:{ Exception -> 0x03ef }
            r1 = 1
            if (r0 == 0) goto L_0x00de
            boolean r0 = r0.contains(r15)     // Catch:{ Exception -> 0x03ef }
            if (r0 != r1) goto L_0x00de
            goto L_0x014c
        L_0x00de:
            X.7R9 r9 = new X.7R9     // Catch:{ Exception -> 0x03ef }
            r9.<init>(r15)     // Catch:{ Exception -> 0x03ef }
            X.7Tl r0 = new X.7Tl     // Catch:{ Exception -> 0x03ef }
            r0.<init>(r15, r4)     // Catch:{ Exception -> 0x03ef }
            X.4hK r17 = X.AnonymousClass6VV.A00(r9, r0)     // Catch:{ Exception -> 0x03ef }
            androidx.compose.runtime.snapshots.Snapshot r16 = r17.A06()     // Catch:{ all -> 0x03b8 }
            int r0 = r4.size()     // Catch:{ all -> 0x03b3 }
            if (r0 <= 0) goto L_0x0109
            X.7NS r9 = new X.7NS     // Catch:{ all -> 0x03b3 }
            r9.<init>(r15, r4)     // Catch:{ all -> 0x03b3 }
            boolean r0 = r14.A0M     // Catch:{ all -> 0x03b3 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0390
            r14.A0M = r1     // Catch:{ all -> 0x03b3 }
            r1 = 0
            r9.invoke()     // Catch:{ all -> 0x03af }
            r14.A0M = r1     // Catch:{ all -> 0x03b3 }
        L_0x0109:
            java.lang.Object r9 = r10.A0C     // Catch:{ all -> 0x03b3 }
            monitor-enter(r9)     // Catch:{ all -> 0x03b3 }
            X.C136986fP.A04(r10)     // Catch:{ all -> 0x03ac }
            X.6Si r11 = r10.A00     // Catch:{ all -> 0x03a2 }
            r1 = 16
            X.6Si r0 = new X.6Si     // Catch:{ all -> 0x03a2 }
            r0.<init>(r1)     // Catch:{ all -> 0x03a2 }
            r10.A00 = r0     // Catch:{ all -> 0x03a2 }
            X.5h1 r1 = r14.A0F     // Catch:{ Exception -> 0x039e }
            X.6Ek r0 = r1.A00     // Catch:{ Exception -> 0x039e }
            int r0 = r0.A02     // Catch:{ Exception -> 0x039e }
            if (r0 != 0) goto L_0x0397
            int r0 = r11.A00     // Catch:{ Exception -> 0x039e }
            if (r0 > 0) goto L_0x0133
            java.util.List r0 = r14.A0c     // Catch:{ Exception -> 0x039e }
            boolean r0 = X.C36401kF.A1a(r0)     // Catch:{ Exception -> 0x039e }
            if (r0 != 0) goto L_0x0133
        L_0x012e:
            r0 = 0
            X.C136986fP.A05(r10)     // Catch:{ Exception -> 0x039e }
            goto L_0x013e
        L_0x0133:
            X.C136916fF.A0J(r14, r11, r12)     // Catch:{ Exception -> 0x039e }
            X.6Ek r0 = r1.A00     // Catch:{ Exception -> 0x039e }
            int r1 = r0.A02     // Catch:{ Exception -> 0x039e }
            r0 = 1
            if (r1 != 0) goto L_0x013e
            goto L_0x012e
        L_0x013e:
            monitor-exit(r9)     // Catch:{ all -> 0x03b3 }
            X.C1269066c.A00(r16)     // Catch:{ all -> 0x03b8 }
            androidx.compose.runtime.Recomposer.A03(r17)     // Catch:{ Exception -> 0x03ef }
            if (r0 == 0) goto L_0x014c
            if (r15 == 0) goto L_0x014c
            r6.add(r15)     // Catch:{ Exception -> 0x03ef }
        L_0x014c:
            int r13 = r13 + 1
            goto L_0x00b5
        L_0x0150:
            r22.clear()     // Catch:{ all -> 0x0411 }
            int r0 = r4.size()     // Catch:{ all -> 0x0411 }
            if (r0 <= 0) goto L_0x01a4
            monitor-enter(r8)     // Catch:{ all -> 0x0411 }
            java.util.List r16 = androidx.compose.runtime.Recomposer.A00(r5)     // Catch:{ all -> 0x040b }
            int r12 = r16.size()     // Catch:{ all -> 0x040b }
            r11 = 0
        L_0x0163:
            if (r11 >= r12) goto L_0x01a3
            r0 = r16
            java.lang.Object r13 = r0.get(r11)     // Catch:{ all -> 0x040b }
            X.7my r13 = (X.C161477my) r13     // Catch:{ all -> 0x040b }
            boolean r0 = r3.contains(r13)     // Catch:{ all -> 0x040b }
            if (r0 != 0) goto L_0x01a0
            r14 = r13
            X.6fP r14 = (X.C136986fP) r14     // Catch:{ all -> 0x040b }
            java.lang.Object[] r10 = r4.A01     // Catch:{ all -> 0x040b }
            int r9 = r4.size()     // Catch:{ all -> 0x040b }
            r1 = 0
            goto L_0x0180
        L_0x017e:
            int r1 = r1 + 1
        L_0x0180:
            if (r1 >= r9) goto L_0x01a0
            java.lang.Object r15 = X.C90524aI.A0d(r10, r1)     // Catch:{ all -> 0x040b }
            X.68K r0 = r14.A0B     // Catch:{ all -> 0x040b }
            X.0GA r0 = r0.A00     // Catch:{ all -> 0x040b }
            boolean r0 = r0.A03(r15)     // Catch:{ all -> 0x040b }
            if (r0 != 0) goto L_0x019b
            X.68K r0 = r14.A0A     // Catch:{ all -> 0x040b }
            X.0GA r0 = r0.A00     // Catch:{ all -> 0x040b }
            boolean r0 = r0.A03(r15)     // Catch:{ all -> 0x040b }
            if (r0 != 0) goto L_0x019b
            goto L_0x017e
        L_0x019b:
            r0 = r22
            r0.add(r13)     // Catch:{ all -> 0x040b }
        L_0x01a0:
            int r11 = r11 + 1
            goto L_0x0163
        L_0x01a3:
            monitor-exit(r8)     // Catch:{ all -> 0x0411 }
        L_0x01a4:
            boolean r0 = r22.isEmpty()     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x0095
            goto L_0x01ae
        L_0x01ab:
            X.AnonymousClass03Y.A0B(r0, r7)     // Catch:{ Exception -> 0x03e0 }
        L_0x01ae:
            r21.clear()     // Catch:{ Exception -> 0x03e0 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x03e0 }
            java.util.List r11 = r5.A0F     // Catch:{ all -> 0x03dd }
            r10 = 0
            int r9 = r11.size()     // Catch:{ all -> 0x03dd }
        L_0x01b9:
            if (r10 >= r9) goto L_0x01c7
            r11.get(r10)     // Catch:{ all -> 0x03dd }
            r1 = 0
            r0 = r21
            r0.add(r1)     // Catch:{ all -> 0x03dd }
            int r10 = r10 + 1
            goto L_0x01b9
        L_0x01c7:
            r11.clear()     // Catch:{ all -> 0x03dd }
            monitor-exit(r8)     // Catch:{ Exception -> 0x03e0 }
            boolean r0 = X.C36401kF.A1a(r21)     // Catch:{ Exception -> 0x03e0 }
            if (r0 == 0) goto L_0x0095
            int r1 = r21.size()     // Catch:{ Exception -> 0x03e0 }
            java.util.HashMap r20 = new java.util.HashMap     // Catch:{ Exception -> 0x03e0 }
            r0 = r20
            r0.<init>(r1)     // Catch:{ Exception -> 0x03e0 }
            int r0 = r21.size()     // Catch:{ Exception -> 0x03e0 }
            r1 = 0
            if (r1 >= r0) goto L_0x01f0
            r0 = r21
            r0.get(r1)     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r0 = "getComposition$runtime_release"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ Exception -> 0x03e0 }
            goto L_0x03df
        L_0x01f0:
            java.util.Iterator r19 = X.C36371kC.A10(r20)     // Catch:{ Exception -> 0x03e0 }
        L_0x01f4:
            boolean r0 = r19.hasNext()     // Catch:{ Exception -> 0x03e0 }
            if (r0 == 0) goto L_0x02a3
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r19)     // Catch:{ Exception -> 0x03e0 }
            java.lang.Object r9 = r0.getKey()     // Catch:{ Exception -> 0x03e0 }
            X.7my r9 = (X.C161477my) r9     // Catch:{ Exception -> 0x03e0 }
            java.lang.Object r15 = r0.getValue()     // Catch:{ Exception -> 0x03e0 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ Exception -> 0x03e0 }
            r10 = r9
            X.6fP r10 = (X.C136986fP) r10     // Catch:{ Exception -> 0x03e0 }
            X.6fF r11 = r10.A05     // Catch:{ Exception -> 0x03e0 }
            boolean r0 = r11.A0M     // Catch:{ Exception -> 0x03e0 }
            r0 = r0 ^ 1
            X.AnonymousClass6XJ.A06(r0)     // Catch:{ Exception -> 0x03e0 }
            X.7R9 r1 = new X.7R9     // Catch:{ Exception -> 0x03e0 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x03e0 }
            X.7Tl r0 = new X.7Tl     // Catch:{ Exception -> 0x03e0 }
            r0.<init>(r9, r4)     // Catch:{ Exception -> 0x03e0 }
            X.4hK r18 = X.AnonymousClass6VV.A00(r1, r0)     // Catch:{ Exception -> 0x03e0 }
            androidx.compose.runtime.snapshots.Snapshot r17 = r18.A06()     // Catch:{ all -> 0x03d8 }
            monitor-enter(r8)     // Catch:{ all -> 0x03d3 }
            java.util.ArrayList r14 = X.C36361kB.A0r(r15)     // Catch:{ all -> 0x03d0 }
            int r13 = r15.size()     // Catch:{ all -> 0x03d0 }
            r12 = 0
        L_0x0232:
            if (r12 >= r13) goto L_0x0256
            r15.get(r12)     // Catch:{ all -> 0x03d0 }
            r9 = 0
            java.util.Map r1 = r5.A0I     // Catch:{ all -> 0x03d0 }
            java.util.List r16 = X.C90524aI.A0o(r9, r1)     // Catch:{ all -> 0x03d0 }
            if (r16 == 0) goto L_0x0251
            java.lang.Object r0 = X.AnonymousClass03Y.A09(r16)     // Catch:{ all -> 0x03d0 }
            boolean r16 = r16.isEmpty()     // Catch:{ all -> 0x03d0 }
            if (r16 == 0) goto L_0x024d
            r1.remove(r9)     // Catch:{ all -> 0x03d0 }
        L_0x024d:
            X.C90494aF.A1F(r9, r0, r14)     // Catch:{ all -> 0x03d0 }
            goto L_0x0253
        L_0x0251:
            r0 = 0
            goto L_0x024d
        L_0x0253:
            int r12 = r12 + 1
            goto L_0x0232
        L_0x0256:
            monitor-exit(r8)     // Catch:{ all -> 0x03d3 }
            int r1 = r14.size()     // Catch:{ all -> 0x03d3 }
            r0 = 0
            if (r0 >= r1) goto L_0x0269
            r14.get(r0)     // Catch:{ all -> 0x03d3 }
            java.lang.String r0 = "getComposition$runtime_release"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x03d3 }
            goto L_0x03d2
        L_0x0269:
            X.6WG r12 = r11.A0b     // Catch:{ all -> 0x03c1 }
            X.5h1 r0 = r11.A0H     // Catch:{ all -> 0x03c1 }
            X.5h1 r9 = r12.A05     // Catch:{ all -> 0x03c1 }
            r12.A05 = r0     // Catch:{ all -> 0x03bd }
            X.6Ek r1 = r0.A00     // Catch:{ all -> 0x03bd }
            X.4gs r0 = X.C93624gs.A00     // Catch:{ all -> 0x03bd }
            r1.A04(r0)     // Catch:{ all -> 0x03bd }
            int r0 = r14.size()     // Catch:{ all -> 0x03bd }
            r13 = 0
            if (r13 >= r0) goto L_0x0289
            r14.get(r13)     // Catch:{ all -> 0x03bd }
            java.lang.String r0 = "getAnchor$runtime_release"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x03bd }
            throw r0     // Catch:{ all -> 0x03bd }
        L_0x0289:
            X.5h1 r0 = r12.A05     // Catch:{ all -> 0x03bd }
            X.6Ek r1 = r0.A00     // Catch:{ all -> 0x03bd }
            X.4gp r0 = X.C93594gp.A00     // Catch:{ all -> 0x03bd }
            r1.A04(r0)     // Catch:{ all -> 0x03bd }
            r12.A03 = r13     // Catch:{ all -> 0x03bd }
            r12.A03 = r13     // Catch:{ all -> 0x03bd }
            r12.A05 = r9     // Catch:{ all -> 0x03c1 }
            X.C136916fF.A0I(r11)     // Catch:{ all -> 0x03c6 }
            X.C1269066c.A00(r17)     // Catch:{ all -> 0x03d8 }
            androidx.compose.runtime.Recomposer.A03(r18)     // Catch:{ Exception -> 0x03e0 }
            goto L_0x01f4
        L_0x02a3:
            java.util.Set r0 = r20.keySet()     // Catch:{ Exception -> 0x03e0 }
            java.util.List r0 = X.C007103b.A0Y(r0)     // Catch:{ Exception -> 0x03e0 }
            goto L_0x01ab
        L_0x02ad:
            int r9 = r6.size()     // Catch:{ Exception -> 0x02d3 }
            r1 = 0
        L_0x02b2:
            if (r1 >= r9) goto L_0x02c0
            java.lang.Object r0 = r6.get(r1)     // Catch:{ Exception -> 0x02d3 }
            X.7my r0 = (X.C161477my) r0     // Catch:{ Exception -> 0x02d3 }
            r2.add(r0)     // Catch:{ Exception -> 0x02d3 }
            int r1 = r1 + 1
            goto L_0x02b2
        L_0x02c0:
            int r9 = r6.size()     // Catch:{ Exception -> 0x02d3 }
            r1 = 0
        L_0x02c5:
            if (r1 >= r9) goto L_0x02ec
            java.lang.Object r0 = r6.get(r1)     // Catch:{ Exception -> 0x02d3 }
            X.7my r0 = (X.C161477my) r0     // Catch:{ Exception -> 0x02d3 }
            r0.B1G()     // Catch:{ Exception -> 0x02d3 }
            int r1 = r1 + 1
            goto L_0x02c5
        L_0x02d3:
            r1 = move-exception
            r0 = 0
            androidx.compose.runtime.Recomposer.A02(r0, r5, r1)     // Catch:{ all -> 0x02e6 }
            r22.clear()     // Catch:{ all -> 0x02e6 }
            r21.clear()     // Catch:{ all -> 0x02e6 }
            A00(r4, r3, r6, r7, r2)     // Catch:{ all -> 0x02e6 }
            r6.clear()     // Catch:{ all -> 0x0411 }
            goto L_0x0400
        L_0x02e6:
            r0 = move-exception
            r6.clear()     // Catch:{ all -> 0x0411 }
            goto L_0x0410
        L_0x02ec:
            r6.clear()     // Catch:{ all -> 0x0411 }
        L_0x02ef:
            boolean r0 = X.C90514aH.A1a(r7)     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x0328
            X.AnonymousClass03Y.A0B(r7, r2)     // Catch:{ Exception -> 0x030c }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ Exception -> 0x030c }
        L_0x02fc:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x030c }
            if (r0 == 0) goto L_0x0325
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x030c }
            X.7my r0 = (X.C161477my) r0     // Catch:{ Exception -> 0x030c }
            r0.B1J()     // Catch:{ Exception -> 0x030c }
            goto L_0x02fc
        L_0x030c:
            r1 = move-exception
            r0 = 0
            androidx.compose.runtime.Recomposer.A02(r0, r5, r1)     // Catch:{ all -> 0x031f }
            r22.clear()     // Catch:{ all -> 0x031f }
            r21.clear()     // Catch:{ all -> 0x031f }
            A00(r4, r3, r6, r7, r2)     // Catch:{ all -> 0x031f }
            r7.clear()     // Catch:{ all -> 0x0411 }
            goto L_0x0400
        L_0x031f:
            r0 = move-exception
            r7.clear()     // Catch:{ all -> 0x0411 }
            goto L_0x0410
        L_0x0325:
            r7.clear()     // Catch:{ all -> 0x0411 }
        L_0x0328:
            boolean r0 = X.C90514aH.A1a(r2)     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x0376
            java.util.Iterator r11 = r2.iterator()     // Catch:{ Exception -> 0x035a }
        L_0x0332:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x035a }
            if (r0 == 0) goto L_0x0373
            java.lang.Object r10 = r11.next()     // Catch:{ Exception -> 0x035a }
            X.7my r10 = (X.C161477my) r10     // Catch:{ Exception -> 0x035a }
            X.6fP r10 = (X.C136986fP) r10     // Catch:{ Exception -> 0x035a }
            java.lang.Object r9 = r10.A0C     // Catch:{ Exception -> 0x035a }
            monitor-enter(r9)     // Catch:{ Exception -> 0x035a }
            X.6fF r1 = r10.A05     // Catch:{ all -> 0x034d }
            r0 = 0
            r1.A0J = r0     // Catch:{ all -> 0x034d }
            X.C136986fP.A02(r10)     // Catch:{ all -> 0x034d }
            monitor-exit(r9)     // Catch:{ Exception -> 0x035a }
            goto L_0x0332
        L_0x034d:
            r0 = move-exception
            X.C136986fP.A02(r10)     // Catch:{ Exception -> 0x0352 }
            throw r0     // Catch:{ Exception -> 0x0352 }
        L_0x0352:
            r0 = move-exception
            X.C136986fP.A03(r10)     // Catch:{ all -> 0x0357 }
            throw r0     // Catch:{ all -> 0x0357 }
        L_0x0357:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ Exception -> 0x035a }
            throw r0     // Catch:{ Exception -> 0x035a }
        L_0x035a:
            r1 = move-exception
            r0 = 0
            androidx.compose.runtime.Recomposer.A02(r0, r5, r1)     // Catch:{ all -> 0x036d }
            r22.clear()     // Catch:{ all -> 0x036d }
            r21.clear()     // Catch:{ all -> 0x036d }
            A00(r4, r3, r6, r7, r2)     // Catch:{ all -> 0x036d }
            r2.clear()     // Catch:{ all -> 0x0411 }
            goto L_0x0400
        L_0x036d:
            r0 = move-exception
            r2.clear()     // Catch:{ all -> 0x0411 }
            goto L_0x0410
        L_0x0373:
            r2.clear()     // Catch:{ all -> 0x0411 }
        L_0x0376:
            monitor-enter(r8)     // Catch:{ all -> 0x0411 }
            androidx.compose.runtime.Recomposer.A01(r5)     // Catch:{ all -> 0x038c }
            monitor-exit(r8)     // Catch:{ all -> 0x0411 }
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass6YQ.A00()     // Catch:{ all -> 0x0411 }
            r0.A0E()     // Catch:{ all -> 0x0411 }
            r3.clear()     // Catch:{ all -> 0x0411 }
            r4.clear()     // Catch:{ all -> 0x0411 }
            r0 = 0
            r5.A04 = r0     // Catch:{ all -> 0x0411 }
            goto L_0x0400
        L_0x038c:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0411 }
            goto L_0x0410
        L_0x0390:
            java.lang.String r0 = "Preparing a composition while composing is not supported"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)     // Catch:{ all -> 0x03b3 }
            goto L_0x03b2
        L_0x0397:
            java.lang.String r0 = "Expected applyChanges() to have been called"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)     // Catch:{ Exception -> 0x039e }
            throw r0     // Catch:{ Exception -> 0x039e }
        L_0x039e:
            r0 = move-exception
            r10.A00 = r11     // Catch:{ all -> 0x03a2 }
            throw r0     // Catch:{ all -> 0x03a2 }
        L_0x03a2:
            r0 = move-exception
            X.C136986fP.A02(r10)     // Catch:{ Exception -> 0x03a7 }
            throw r0     // Catch:{ Exception -> 0x03a7 }
        L_0x03a7:
            r0 = move-exception
            X.C136986fP.A03(r10)     // Catch:{ all -> 0x03ac }
            throw r0     // Catch:{ all -> 0x03ac }
        L_0x03ac:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x03b3 }
            goto L_0x03b2
        L_0x03af:
            r0 = move-exception
            r14.A0M = r1     // Catch:{ all -> 0x03b3 }
        L_0x03b2:
            throw r0     // Catch:{ all -> 0x03b3 }
        L_0x03b3:
            r0 = move-exception
            X.C1269066c.A00(r16)     // Catch:{ all -> 0x03b8 }
            throw r0     // Catch:{ all -> 0x03b8 }
        L_0x03b8:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A03(r17)     // Catch:{ Exception -> 0x03ef }
            throw r0     // Catch:{ Exception -> 0x03ef }
        L_0x03bd:
            r0 = move-exception
            r12.A05 = r9     // Catch:{ all -> 0x03c1 }
            throw r0     // Catch:{ all -> 0x03c1 }
        L_0x03c1:
            r0 = move-exception
            X.C136916fF.A0H(r11)     // Catch:{ all -> 0x03c6 }
            throw r0     // Catch:{ all -> 0x03c6 }
        L_0x03c6:
            r0 = move-exception
            X.C136986fP.A02(r10)     // Catch:{ Exception -> 0x03cb }
            throw r0     // Catch:{ Exception -> 0x03cb }
        L_0x03cb:
            r0 = move-exception
            X.C136986fP.A03(r10)     // Catch:{ all -> 0x03d3 }
            goto L_0x03d2
        L_0x03d0:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03d3 }
        L_0x03d2:
            throw r0     // Catch:{ all -> 0x03d3 }
        L_0x03d3:
            r0 = move-exception
            X.C1269066c.A00(r17)     // Catch:{ all -> 0x03d8 }
            throw r0     // Catch:{ all -> 0x03d8 }
        L_0x03d8:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A03(r18)     // Catch:{ Exception -> 0x03e0 }
            goto L_0x03df
        L_0x03dd:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ Exception -> 0x03e0 }
        L_0x03df:
            throw r0     // Catch:{ Exception -> 0x03e0 }
        L_0x03e0:
            r1 = move-exception
            r0 = 0
            androidx.compose.runtime.Recomposer.A02(r0, r5, r1)     // Catch:{ all -> 0x0411 }
            r22.clear()     // Catch:{ all -> 0x0411 }
            r21.clear()     // Catch:{ all -> 0x0411 }
            A00(r4, r3, r6, r7, r2)     // Catch:{ all -> 0x0411 }
            goto L_0x0400
        L_0x03ef:
            r1 = move-exception
            r0 = 0
            androidx.compose.runtime.Recomposer.A02(r0, r5, r1)     // Catch:{ all -> 0x0406 }
            r22.clear()     // Catch:{ all -> 0x0406 }
            r21.clear()     // Catch:{ all -> 0x0406 }
            A00(r4, r3, r6, r7, r2)     // Catch:{ all -> 0x0406 }
            r22.clear()     // Catch:{ all -> 0x0411 }
        L_0x0400:
            android.os.Trace.endSection()
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0406:
            r0 = move-exception
            r22.clear()     // Catch:{ all -> 0x0411 }
            goto L_0x0410
        L_0x040b:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0411 }
            goto L_0x0410
        L_0x040e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0411 }
        L_0x0410:
            throw r0     // Catch:{ all -> 0x0411 }
        L_0x0411:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x0416:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155217Vf.invoke(java.lang.Object):java.lang.Object");
    }
}
