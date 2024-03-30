package com.facebook.wearable.mediastream.codec;

import X.AnonymousClass000;
import X.AnonymousClass00S;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass883;
import X.C009003v;
import X.C023509x;
import android.media.MediaCodec;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.codec.VideoDecoderBufferHandler$onOutputBuffer$1", f = "VideoDecoderBufferHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VideoDecoderBufferHandler$onOutputBuffer$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ MediaCodec.BufferInfo $decodeInfo;
    public final /* synthetic */ AnonymousClass883 $decoderData;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoDecoderBufferHandler$onOutputBuffer$1(MediaCodec.BufferInfo bufferInfo, AnonymousClass883 r3, C023509x r4) {
        super(2, r4);
        this.$decoderData = r3;
        this.$decodeInfo = bufferInfo;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new VideoDecoderBufferHandler$onOutputBuffer$1(this.$decodeInfo, this.$decoderData, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass00S r0 = this.$decoderData.A00;
            if (r0 != null) {
                r0.invoke();
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VideoDecoderBufferHandler$onOutputBuffer$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
