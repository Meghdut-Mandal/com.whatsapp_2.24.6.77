package com.facebook.wearable.mediastream.client.state;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass8AH;
import X.C009003v;
import X.C023509x;
import com.facebook.wearable.mediastream.client.processor.OutgoingMessageProcessor;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.client.state.MediaStreamServiceTcpStateDelegate$setupMessageProcessors$1$1$1", f = "MediaStreamServiceTcpStateDelegate.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
public final class MediaStreamServiceTcpStateDelegate$setupMessageProcessors$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ ByteBuffer $header;
    public final /* synthetic */ OutgoingMessageProcessor $outgoingMessageProcessor;
    public final /* synthetic */ ByteBuffer $payload;
    public int label;
    public final /* synthetic */ AnonymousClass8AH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaStreamServiceTcpStateDelegate$setupMessageProcessors$1$1$1(OutgoingMessageProcessor outgoingMessageProcessor, AnonymousClass8AH r3, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, C023509x r6) {
        super(2, r6);
        this.$outgoingMessageProcessor = outgoingMessageProcessor;
        this.this$0 = r3;
        this.$header = byteBuffer;
        this.$payload = byteBuffer2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new MediaStreamServiceTcpStateDelegate$setupMessageProcessors$1$1$1(this.$outgoingMessageProcessor, this.this$0, this.$header, this.$payload, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            OutgoingMessageProcessor outgoingMessageProcessor = this.$outgoingMessageProcessor;
            ByteBuffer byteBuffer = this.$header;
            ByteBuffer byteBuffer2 = this.$payload;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(AnonymousClass8AH.A02(byteBuffer).length + AnonymousClass8AH.A02(byteBuffer2).length);
            allocateDirect.put(AnonymousClass8AH.A02(byteBuffer));
            allocateDirect.put(AnonymousClass8AH.A02(byteBuffer2));
            allocateDirect.rewind();
            this.label = 1;
            if (outgoingMessageProcessor.A00(allocateDirect, this) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaStreamServiceTcpStateDelegate$setupMessageProcessors$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
