package X;

import com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer;

/* renamed from: X.An8  reason: case insensitive filesystem */
public final class C22469An8 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C10810fG $currentUiState;
    public final /* synthetic */ PushToVideoInlineVideoPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22469An8(PushToVideoInlineVideoPlayer pushToVideoInlineVideoPlayer, C10810fG r3) {
        super(1);
        this.$currentUiState = r3;
        this.this$0 = pushToVideoInlineVideoPlayer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (X.AnonymousClass00C.A0J(r0, r3) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            X.9gb r9 = (X.C200099gb) r9
            X.0fG r0 = r8.$currentUiState
            java.lang.Object r2 = r0.element
            X.9gb r2 = (X.C200099gb) r2
            r0.element = r9
            X.2cZ r7 = r9.A03
            r3 = 0
            if (r7 == 0) goto L_0x00da
            X.3Qa r1 = r7.A1J
        L_0x0011:
            if (r2 == 0) goto L_0x00d7
            X.2cZ r0 = r2.A03
            if (r0 == 0) goto L_0x00d7
            X.3Qa r0 = r0.A1J
        L_0x0019:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r5 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x002e
            X.1SV r0 = r9.A04
            if (r2 == 0) goto L_0x0028
            X.1SV r3 = r2.A04
        L_0x0028:
            boolean r0 = X.AnonymousClass00C.A0J(r0, r3)
            if (r0 != 0) goto L_0x003d
        L_0x002e:
            if (r7 == 0) goto L_0x003d
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            X.1SV r3 = r9.A04
            if (r3 == 0) goto L_0x003d
            com.whatsapp.WaImageView r1 = r0.A08
            X.7l9 r0 = r0.A0A
            r3.A0C(r1, r7, r0)
        L_0x003d:
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            com.whatsapp.WaImageView r0 = r0.A08
            android.view.View$OnClickListener r1 = r9.A00
            r0.setOnClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.widget.FrameLayout r0 = r0.A07
            r0.setOnClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            com.whatsapp.WaImageView r0 = r0.A08
            android.view.View$OnTouchListener r1 = r9.A02
            r0.setOnTouchListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.widget.FrameLayout r0 = r0.A07
            r0.setOnTouchListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.view.View$OnLongClickListener r1 = r9.A01
            r0.setOnLongClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            com.whatsapp.WaImageView r0 = r0.A08
            r0.setOnLongClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.widget.FrameLayout r0 = r0.A07
            r0.setOnLongClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.widget.FrameLayout r1 = r0.A07
            r0 = 2131886166(0x7f120056, float:1.9406903E38)
            X.C33521fV.A05(r1, r0)
            if (r2 == 0) goto L_0x00d5
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            X.0yC r0 = r0.getAbProps()
            boolean r6 = r2.A00(r0)
        L_0x0088:
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            X.0yC r0 = r0.getAbProps()
            boolean r4 = r9.A00(r0)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r1 = r8.this$0
            X.2ke r3 = r1.A09
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x009d
            r3.A0D()
        L_0x009d:
            boolean r2 = r9.A08
            X.0yC r1 = r1.getAbProps()
            r0 = 1
            if (r2 != 0) goto L_0x00b1
            r0 = 3483(0xd9b, float:4.881E-42)
            int r0 = r1.A07(r0)
            if (r0 > 0) goto L_0x00b1
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x00b1:
            r3.A0e(r7, r0)
            r3.A0f(r4)
            r0 = r2 ^ 1
            r3.A0V(r0)
            if (r4 == 0) goto L_0x00c3
            if (r6 != 0) goto L_0x00c3
            r3.A0d()
        L_0x00c3:
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.widget.FrameLayout r1 = r0.A07
            if (r2 == 0) goto L_0x00d3
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x00d3
        L_0x00cd:
            r1.setKeepScreenOn(r5)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00d3:
            r5 = 0
            goto L_0x00cd
        L_0x00d5:
            r6 = 0
            goto L_0x0088
        L_0x00d7:
            r0 = r3
            goto L_0x0019
        L_0x00da:
            r1 = r3
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22469An8.invoke(java.lang.Object):java.lang.Object");
    }
}
