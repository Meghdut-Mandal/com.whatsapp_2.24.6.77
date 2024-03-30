package com.whatsapp.chatinfo.viewModel;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass2EI;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$getContactProfileBadge$1", f = "ContactInfoViewModel.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
public final class ContactInfoViewModel$getContactProfileBadge$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass2EI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactInfoViewModel$getContactProfileBadge$1(AnonymousClass2EI r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ContactInfoViewModel$getContactProfileBadge$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ContactInfoViewModel$getContactProfileBadge$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0148, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0150, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0153, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            X.0AO r9 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r8 = r24
            int r0 = r8.label
            r7 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r7) goto L_0x0141
            X.AnonymousClass0AN.A00(r25)
        L_0x000e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0011:
            X.AnonymousClass0AN.A00(r25)
            X.2EI r0 = r8.this$0
            X.34s r2 = r0.A0P
            X.11F r1 = r0.A0F
            X.12q r0 = r2.A00
            java.util.concurrent.ConcurrentHashMap r0 = X.C220412q.A00(r0)
            r0.get(r1)
            r0 = 0
            X.1eG r1 = r2.A01
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            java.util.List r0 = X.C36371kC.A11(r16)
            X.1eH r6 = r1.A00
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.util.Map r0 = r6.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x005f
            r5.put(r1, r0)
            goto L_0x003f
        L_0x005f:
            r4.add(r1)
            goto L_0x003f
        L_0x0063:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0124
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r4, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r4.iterator()
        L_0x0078:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x0078
        L_0x0090:
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r10 = r2.toArray(r0)
            java.lang.String[] r10 = (java.lang.String[]) r10
            X.12P r0 = r6.A00
            X.1M0 r4 = r0.get()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x014d }
            int r2 = r10.length     // Catch:{ all -> 0x014d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014d }
            r1.<init>()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "SELECT integrator_id, display_name, status, icon_path, opt_in_status, identifier_type FROM integrator_display_name WHERE integrator_id IN "
            r1.append(r0)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r2)     // Catch:{ all -> 0x014d }
            r1.append(r0)     // Catch:{ all -> 0x014d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "InteropIntegratorStoreGET_INTEGRATOR_INFO"
            android.database.Cursor r3 = r3.A09(r1, r0, r10)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "integrator_id"
            int r13 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "display_name"
            int r12 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "status"
            int r11 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "icon_path"
            int r10 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "opt_in_status"
            int r2 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "identifier_type"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0146 }
        L_0x00e0:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0146 }
            if (r0 == 0) goto L_0x011e
            int r20 = r3.getInt(r13)     // Catch:{ all -> 0x0146 }
            java.lang.String r18 = r3.getString(r12)     // Catch:{ all -> 0x0146 }
            X.AnonymousClass00C.A08(r18)     // Catch:{ all -> 0x0146 }
            int r21 = r3.getInt(r11)     // Catch:{ all -> 0x0146 }
            java.lang.String r19 = r3.getString(r10)     // Catch:{ all -> 0x0146 }
            X.AnonymousClass00C.A08(r19)     // Catch:{ all -> 0x0146 }
            int r0 = r3.getInt(r2)     // Catch:{ all -> 0x0146 }
            r23 = 0
            if (r0 <= 0) goto L_0x0106
            r23 = 1
        L_0x0106:
            int r22 = r3.getInt(r1)     // Catch:{ all -> 0x0146 }
            X.3Xd r0 = new X.3Xd     // Catch:{ all -> 0x0146 }
            r17 = r0
            r17.<init>((java.lang.String) r18, (java.lang.String) r19, (int) r20, (int) r21, (int) r22, (boolean) r23)     // Catch:{ all -> 0x0146 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0146 }
            java.util.Map r14 = r6.A01     // Catch:{ all -> 0x0146 }
            r14.put(r15, r0)     // Catch:{ all -> 0x0146 }
            r5.put(r15, r0)     // Catch:{ all -> 0x0146 }
            goto L_0x00e0
        L_0x011e:
            r3.close()     // Catch:{ all -> 0x014d }
            r4.close()
        L_0x0124:
            r0 = r16
            java.lang.Object r4 = r5.get(r0)
            X.3Xd r4 = (X.C66743Xd) r4
            if (r4 == 0) goto L_0x000e
            X.2EI r3 = r8.this$0
            X.02l r2 = r3.A0Y
            r1 = 0
            com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$getContactProfileBadge$1$1 r0 = new com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$getContactProfileBadge$1$1
            r0.<init>(r3, r4, r1)
            r8.label = r7
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r8, r2, r0)
            if (r0 != r9) goto L_0x000e
            return r9
        L_0x0141:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0146:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x014d }
            throw r0     // Catch:{ all -> 0x014d }
        L_0x014d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014f }
        L_0x014f:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$getContactProfileBadge$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
