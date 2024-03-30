package com.whatsapp.comments;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C65513Sj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$loadMessages$1", f = "CommentListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$loadMessages$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C65513Sj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$loadMessages$1(C65513Sj r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CommentListManager$loadMessages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommentListManager$loadMessages$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0093, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x0094
            X.AnonymousClass0AN.A00(r9)
            X.3Sj r5 = r8.this$0
            X.05L r4 = r5.A0A
        L_0x000b:
            java.lang.Object r6 = r4.getValue()
            X.12P r0 = r5.A02
            X.1M0 r3 = r0.get()
            X.3T1 r0 = r5.A03     // Catch:{ all -> 0x008d }
            long r0 = r0.A1N     // Catch:{ all -> 0x008d }
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.String[] r7 = X.C36441kJ.A1S()     // Catch:{ all -> 0x008d }
            X.C36341k9.A1W(r7, r0)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x008d }
            r0 = 1
            r7[r0] = r1     // Catch:{ all -> 0x008d }
            X.14e r2 = r3.A02     // Catch:{ all -> 0x008d }
            java.lang.String r1 = X.C56792wt.A01     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "SELECT_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID"
            android.database.Cursor r2 = r2.A09(r1, r0, r7)     // Catch:{ all -> 0x008d }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x0086 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0056
            int r0 = r2.getCount()     // Catch:{ all -> 0x0086 }
            java.util.ArrayList r1 = X.C36441kJ.A14(r0)     // Catch:{ all -> 0x0086 }
        L_0x0044:
            X.1A1 r0 = r5.A04     // Catch:{ all -> 0x0086 }
            X.3T1 r0 = r0.A00(r2)     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x004f
            r1.add(r0)     // Catch:{ all -> 0x0086 }
        L_0x004f:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0044
            goto L_0x0058
        L_0x0056:
            X.09w r1 = X.C023409w.A00     // Catch:{ all -> 0x0086 }
        L_0x0058:
            r2.close()     // Catch:{ all -> 0x008d }
            java.util.Comparator r0 = X.C65513Sj.A0D     // Catch:{ all -> 0x008d }
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch:{ all -> 0x008d }
            r2.<init>(r0)     // Catch:{ all -> 0x008d }
            X.C007103b.A0i(r1, r2)     // Catch:{ all -> 0x008d }
            int r0 = r2.size()     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0073
            java.util.concurrent.atomic.AtomicReference r1 = r5.A05     // Catch:{ all -> 0x008d }
            X.2oI r0 = X.C51732oI.COMPLETE     // Catch:{ all -> 0x008d }
            r1.set(r0)     // Catch:{ all -> 0x008d }
            goto L_0x007a
        L_0x0073:
            java.util.concurrent.atomic.AtomicReference r1 = r5.A05     // Catch:{ all -> 0x008d }
            X.2oI r0 = X.C51732oI.INCOMPLETE     // Catch:{ all -> 0x008d }
            r1.set(r0)     // Catch:{ all -> 0x008d }
        L_0x007a:
            r3.close()
            boolean r0 = r4.B3B(r6, r2)
            if (r0 == 0) goto L_0x000b
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0086:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x008d }
            throw r0     // Catch:{ all -> 0x008d }
        L_0x008d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x0094:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.comments.CommentListManager$loadMessages$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
