package com.whatsapp.data;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C25131Fc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.OrderRequestMessageManager$getOrderRequestMessageRowId$1", f = "OrderRequestMessageManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OrderRequestMessageManager$getOrderRequestMessageRowId$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $orderId;
    public int label;
    public final /* synthetic */ C25131Fc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderRequestMessageManager$getOrderRequestMessageRowId$1(C25131Fc r2, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$orderId = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new OrderRequestMessageManager$getOrderRequestMessageRowId$1(this.this$0, this.$orderId, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L_0x0053
            X.AnonymousClass0AN.A00(r6)
            X.1Fc r0 = r5.this$0
            X.1Ev r0 = r0.A00
            java.lang.String r1 = r5.$orderId
            X.C18740tg.A00()
            X.12P r0 = r0.A01
            X.1M0 r4 = r0.get()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x0049 }
            X.14e r2 = r4.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version FROM message_order WHERE order_id=?"
            java.lang.String r0 = "GET_ORDER_MESSAGE_BY_ORDER_ID_SQL"
            android.database.Cursor r2 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x0049 }
            r4.close()
            r1 = 0
            if (r2 == 0) goto L_0x0043
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "message_row_id"
            java.lang.String r0 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x003c }
            r2.close()
            return r0
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()
        L_0x0048:
            return r1
        L_0x0049:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x004e }
            throw r1
        L_0x004e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.OrderRequestMessageManager$getOrderRequestMessageRowId$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OrderRequestMessageManager$getOrderRequestMessageRowId$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
