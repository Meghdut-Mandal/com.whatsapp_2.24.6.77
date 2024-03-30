package com.whatsapp.interop.blocklist;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C27251Nm;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.blocklist.InteropBlockListManager$loadBlockListFromStorage$2", f = "InteropBlockListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InteropBlockListManager$loadBlockListFromStorage$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C27251Nm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropBlockListManager$loadBlockListFromStorage$2(C27251Nm r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new InteropBlockListManager$loadBlockListFromStorage$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropBlockListManager$loadBlockListFromStorage$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x005b
            X.AnonymousClass0AN.A00(r9)
            X.1Nm r0 = r8.this$0
            java.util.Set r4 = r0.A02
            monitor-enter(r4)
            java.util.Set r7 = r0.A02     // Catch:{ all -> 0x0058 }
            X.1Nl r0 = r0.A00     // Catch:{ all -> 0x0058 }
            java.util.HashSet r6 = X.C36441kJ.A16()     // Catch:{ all -> 0x0058 }
            X.16r r0 = r0.A00     // Catch:{ all -> 0x0058 }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "SELECT jid FROM wa_block_list_interop"
            java.lang.String r1 = "INTEROP_GET_BLOCK_LIST"
            r0 = 0
            android.database.Cursor r3 = X.C229416o.A03(r5, r2, r1, r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "jid"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004a }
        L_0x0029:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003f
            X.13r r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r3.getString(r2)     // Catch:{ all -> 0x004a }
            com.whatsapp.jid.UserJid r0 = r1.A02(r0)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0029
            r6.add(r0)     // Catch:{ all -> 0x004a }
            goto L_0x0029
        L_0x003f:
            r3.close()     // Catch:{ all -> 0x0051 }
            r5.close()     // Catch:{ all -> 0x0058 }
            r7.addAll(r6)     // Catch:{ all -> 0x0058 }
            monitor-exit(r4)
            return r7
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x005b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interop.blocklist.InteropBlockListManager$loadBlockListFromStorage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
