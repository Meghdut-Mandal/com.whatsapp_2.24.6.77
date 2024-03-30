package com.whatsapp.interop.integrator;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C32831eG;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.integrator.IntegratorManager$optInIntegrators$2", f = "IntegratorManager.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class IntegratorManager$optInIntegrators$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $integrators;
    public int label;
    public final /* synthetic */ C32831eG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegratorManager$optInIntegrators$2(C32831eG r2, List list, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$integrators = list;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new IntegratorManager$optInIntegrators$2(this.this$0, this.$integrators, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0112, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0116, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0119, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011a, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r15.label
            r7 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r7) goto L_0x0122
            X.AnonymousClass0AN.A00(r1)
        L_0x000e:
            X.2tN r1 = (X.C54702tN) r1
            boolean r0 = r1 instanceof X.AnonymousClass2X0
            if (r0 == 0) goto L_0x0121
            java.util.List r5 = r15.$integrators
            r0 = r1
            X.2X0 r0 = (X.AnonymousClass2X0) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r4 = X.C36321k7.A0J(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0023:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r3.next()
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.first
            int r2 = X.AnonymousClass000.A0I(r0)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            r4.add(r0)
            goto L_0x0023
        L_0x003e:
            X.AnonymousClass0AN.A00(r1)
            X.1eG r0 = r15.this$0
            X.1eK r1 = r0.A03
            java.util.List r0 = r15.$integrators
            r15.label = r7
            X.0iM r4 = X.C36411kG.A16(r15)
            X.19A r8 = r1.A00
            java.lang.String r11 = r8.A09()
            java.util.ArrayList r6 = X.C36321k7.A0J(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x005b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0074
            int r0 = X.C36341k9.A0A(r5)
            long r0 = (long) r0
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            X.1jQ r0 = new X.1jQ
            r0.<init>((java.lang.Long) r2, (int) r7)
            r6.add(r0)
            goto L_0x005b
        L_0x0074:
            r0 = 8
            X.1jS r2 = new X.1jS
            r2.<init>((java.util.List) r6, (int) r0, (java.lang.String) r11)
            r12 = 394(0x18a, float:5.52E-43)
            X.9nx r10 = r2.A00
            X.AnonymousClass00C.A08(r10)
            X.32K r1 = new X.32K
            r1.<init>(r4)
            r0 = 6
            X.1jT r9 = new X.1jT
            r9.<init>(r2, r1, r0)
            r13 = 32000(0x7d00, double:1.581E-319)
            r8.A0E(r9, r10, r11, r12, r13)
            java.lang.Object r1 = r4.A00()
            if (r1 != r3) goto L_0x000e
            return r3
        L_0x0099:
            java.util.Set r0 = X.C007103b.A0f(r4)
            java.util.Set r2 = X.C007103b.A0h(r5, r0)
            X.1eG r0 = r15.this$0
            X.1eH r0 = r0.A00
            java.util.List r7 = X.C007103b.A0Y(r2)
            java.lang.String r5 = "opt_in_status"
            r4 = 0
            X.12P r0 = r0.A00
            X.1M0 r2 = r0.A05()
            X.71s r3 = r2.B1k()     // Catch:{ all -> 0x0117 }
            android.content.ContentValues r9 = X.C36441kJ.A0E()     // Catch:{ all -> 0x0110 }
            X.C36341k9.A0o(r9, r5, r4)     // Catch:{ all -> 0x0110 }
            X.14e r8 = r2.A02     // Catch:{ all -> 0x0110 }
            java.lang.String r10 = "integrator_display_name"
            java.lang.String r11 = "opt_in_status = 1"
            r13 = 0
            java.lang.String r12 = "InteropIntegratorStoreCLEAR_OPTED_IN_INTEGRATORS"
            r8.A01(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0110 }
            android.content.ContentValues r9 = X.C36441kJ.A0E()     // Catch:{ all -> 0x0110 }
            r0 = 1
            X.C36341k9.A0o(r9, r5, r0)     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "integrator_id IN "
            r5.append(r0)     // Catch:{ all -> 0x0110 }
            int r0 = r7.size()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = X.AnonymousClass000.A0q(r0, r5)     // Catch:{ all -> 0x0110 }
            java.util.ArrayList r6 = X.C36321k7.A0J(r7)     // Catch:{ all -> 0x0110 }
            java.util.Iterator r5 = r7.iterator()     // Catch:{ all -> 0x0110 }
        L_0x00ee:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0100
            int r0 = X.C36341k9.A0A(r5)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0110 }
            r6.add(r0)     // Catch:{ all -> 0x0110 }
            goto L_0x00ee
        L_0x0100:
            java.lang.String[] r13 = X.C36371kC.A1b(r6, r4)     // Catch:{ all -> 0x0110 }
            java.lang.String r12 = "InteropIntegratorStoreSET_OPTED_IN_INTEGRATORS"
            r8.A01(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0110 }
            r3.A00()     // Catch:{ all -> 0x0110 }
            r3.close()     // Catch:{ all -> 0x0117 }
            goto L_0x011e
        L_0x0110:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x011e:
            r2.close()
        L_0x0121:
            return r1
        L_0x0122:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interop.integrator.IntegratorManager$optInIntegrators$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IntegratorManager$optInIntegrators$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
