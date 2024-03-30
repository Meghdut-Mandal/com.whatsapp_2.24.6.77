package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass6OK;
import X.C009003v;
import X.C023509x;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2", f = "WfsNativeAuthManager.kt", i = {0, 0, 0, 0}, l = {250}, m = "invokeSuspend", n = {"$this$withContext", "resultChannel", "jobs", "results"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class WfsNativeAuthManager$getSsoList$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass6OK $abOfflineProps;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass040 $coroutineScope;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ WfsNativeAuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$2(Context context, WfsNativeAuthManager wfsNativeAuthManager, AnonymousClass6OK r4, C023509x r5, AnonymousClass040 r6) {
        super(2, r5);
        this.$coroutineScope = r6;
        this.this$0 = wfsNativeAuthManager;
        this.$context = context;
        this.$abOfflineProps = r4;
    }

    public final C023509x create(Object obj, C023509x r8) {
        AnonymousClass040 r5 = this.$coroutineScope;
        WfsNativeAuthManager$getSsoList$2 wfsNativeAuthManager$getSsoList$2 = new WfsNativeAuthManager$getSsoList$2(this.$context, this.this$0, this.$abOfflineProps, r8, r5);
        wfsNativeAuthManager$getSsoList$2.L$0 = obj;
        return wfsNativeAuthManager$getSsoList$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        r0 = X.C15200mr.A05;
        r5 = new X.C15200mr(getContext());
        r5.A05(new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$2$1((X.C023509x) null, r7), r14.BEf());
        r15.L$0 = r2;
        r15.L$1 = r14;
        r15.L$2 = r6;
        r15.L$3 = r7;
        r15.label = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d2, code lost:
        if ((X.C15200mr.A05.get(r5) instanceof X.AnonymousClass0UB) == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d4, code lost:
        r0 = X.C15200mr.A01(r15, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d8, code lost:
        if (r0 != r4) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00da, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00db, code lost:
        r0 = X.C15200mr.A02(r15, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r7.element != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r15.label
            r7 = 0
            r3 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0036
            if (r0 != r3) goto L_0x00ea
            java.lang.Object r7 = r15.L$3
            X.0fG r7 = (X.C10810fG) r7
            java.lang.Object r6 = r15.L$2
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r14 = r15.L$1
            X.0sR r14 = (X.C18010sR) r14
            java.lang.Object r2 = r15.L$0
            X.040 r2 = (X.AnonymousClass040) r2
            X.AnonymousClass0AN.A00(r16)
        L_0x001e:
            java.lang.Object r0 = r7.element
            if (r0 == 0) goto L_0x0082
        L_0x0022:
            java.util.Iterator r1 = r6.iterator()
        L_0x0026:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r1.next()
            X.03e r0 = (X.C007403e) r0
            r0.B2S(r13)
            goto L_0x0026
        L_0x0036:
            X.AnonymousClass0AN.A00(r16)
            java.lang.Object r2 = r15.L$0
            X.040 r2 = (X.AnonymousClass040) r2
            java.lang.Integer r8 = X.C023109s.A00
            X.0iw r14 = new X.0iw
            r14.<init>(r7)
            X.040 r6 = r15.$coroutineScope
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager r5 = r15.this$0
            android.content.Context r1 = r15.$context
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fbJob$1 r0 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fbJob$1
            r0.<init>(r1, r5, r13, r14)
            X.03u r5 = X.C008903u.A00
            X.0A6 r6 = X.AnonymousClass0A2.A02(r8, r5, r0, r6)
            X.040 r0 = r15.$coroutineScope
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager r11 = r15.this$0
            android.content.Context r10 = r15.$context
            X.6OK r12 = r15.$abOfflineProps
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$igJob$1 r9 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$igJob$1
            r9.<init>(r10, r11, r12, r13, r14)
            r10 = 3
            X.0A6 r9 = X.AnonymousClass0A2.A02(r8, r5, r9, r0)
            X.040 r1 = r15.$coroutineScope
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fallbackJob$1 r0 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fallbackJob$1
            r0.<init>(r13, r6, r9, r14)
            X.0A6 r5 = X.AnonymousClass0A2.A02(r8, r5, r0, r1)
            X.03e[] r1 = new X.C007403e[r10]
            r1[r7] = r6
            r1[r3] = r9
            r0 = 2
            java.util.List r6 = X.C36341k9.A0m(r5, r1, r0)
            X.0fG r7 = new X.0fG
            r7.<init>()
        L_0x0082:
            boolean r0 = X.C009403z.A04(r2)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0093
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0093
            goto L_0x0022
        L_0x0093:
            java.util.Iterator r1 = r6.iterator()
        L_0x0097:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r1.next()
            X.03e r0 = (X.C007403e) r0
            boolean r0 = r0.BL7()
            if (r0 == 0) goto L_0x0097
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C15200mr.A05
            X.02h r0 = r15.getContext()
            X.0mr r5 = new X.0mr
            r5.<init>(r0)
            X.0T6 r1 = r14.BEf()
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$2$1 r0 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$2$1
            r0.<init>(r13, r7)
            r5.A05(r0, r1)
            r15.L$0 = r2
            r15.L$1 = r14
            r15.L$2 = r6
            r15.L$3 = r7
            r15.label = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C15200mr.A05
            java.lang.Object r0 = r0.get(r5)
            boolean r0 = r0 instanceof X.AnonymousClass0UB
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = X.C15200mr.A01(r15, r5)
        L_0x00d8:
            if (r0 != r4) goto L_0x001e
            return r4
        L_0x00db:
            java.lang.Object r0 = X.C15200mr.A02(r15, r5)
            goto L_0x00d8
        L_0x00e0:
            r14.B33(r13)
            java.lang.Object r4 = r7.element
            if (r4 != 0) goto L_0x00e9
            X.09w r4 = X.C023409w.A00
        L_0x00e9:
            return r4
        L_0x00ea:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsNativeAuthManager$getSsoList$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
