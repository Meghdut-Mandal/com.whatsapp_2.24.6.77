package com.whatsapp.interopui.compose;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1", f = "InteropComposeSelectIntegratorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ InteropComposeSelectIntegratorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1(InteropComposeSelectIntegratorViewModel interopComposeSelectIntegratorViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = interopComposeSelectIntegratorViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r9 = r20
            int r0 = r9.label
            if (r0 != 0) goto L_0x00a0
            X.AnonymousClass0AN.A00(r21)
            com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel r8 = r9.this$0
            X.1eG r0 = r8.A03
            X.1eH r7 = r0.A00
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            X.12P r0 = r7.A00
            X.1M0 r5 = r0.get()
            X.14e r3 = r5.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = "SELECT integrator_id, display_name, status, icon_path, identifier_type FROM integrator_display_name WHERE opt_in_status > 0"
            java.lang.String r1 = "InteropIntegratorStoreGET_OPTED_IN_INTEGRATORS"
            r0 = 0
            android.database.Cursor r4 = r3.A09(r2, r1, r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "integrator_id"
            int r3 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "display_name"
            int r2 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "status"
            int r1 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "icon_path"
            int r0 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            java.lang.String r10 = "identifier_type"
            int r10 = r4.getColumnIndex(r10)     // Catch:{ all -> 0x0092 }
        L_0x0042:
            boolean r11 = r4.moveToNext()     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x007e
            if (r3 < 0) goto L_0x0042
            if (r2 < 0) goto L_0x0042
            if (r1 < 0) goto L_0x0042
            if (r0 < 0) goto L_0x0042
            int r16 = r4.getInt(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r14 = r4.getString(r2)     // Catch:{ all -> 0x0092 }
            X.AnonymousClass00C.A08(r14)     // Catch:{ all -> 0x0092 }
            int r17 = r4.getInt(r1)     // Catch:{ all -> 0x0092 }
            java.lang.String r15 = r4.getString(r0)     // Catch:{ all -> 0x0092 }
            X.AnonymousClass00C.A08(r15)     // Catch:{ all -> 0x0092 }
            r19 = 1
            int r18 = r4.getInt(r10)     // Catch:{ all -> 0x0092 }
            X.3Xd r13 = new X.3Xd     // Catch:{ all -> 0x0092 }
            r13.<init>((java.lang.String) r14, (java.lang.String) r15, (int) r16, (int) r17, (int) r18, (boolean) r19)     // Catch:{ all -> 0x0092 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0092 }
            java.util.Map r11 = r7.A01     // Catch:{ all -> 0x0092 }
            r11.put(r12, r13)     // Catch:{ all -> 0x0092 }
            r6.add(r13)     // Catch:{ all -> 0x0092 }
            goto L_0x0042
        L_0x007e:
            r4.close()     // Catch:{ all -> 0x0099 }
            r5.close()
            r8.A00 = r6
            com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel r0 = r9.this$0
            X.00s r1 = r0.A02
            java.lang.String r0 = ""
            r1.A0C(r0)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        L_0x00a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
