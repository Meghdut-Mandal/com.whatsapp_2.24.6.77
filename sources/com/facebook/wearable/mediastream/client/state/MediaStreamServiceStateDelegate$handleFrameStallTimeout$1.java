package com.facebook.wearable.mediastream.client.state;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass8AI;
import X.AnonymousClass9AO;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C1695189q;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.client.state.MediaStreamServiceStateDelegate$handleFrameStallTimeout$1", f = "MediaStreamServiceStateDelegate.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
public final class MediaStreamServiceStateDelegate$handleFrameStallTimeout$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass8AI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaStreamServiceStateDelegate$handleFrameStallTimeout$1(AnonymousClass8AI r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new MediaStreamServiceStateDelegate$handleFrameStallTimeout$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MediaStreamServiceStateDelegate$handleFrameStallTimeout$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.label = 1;
            if (C07330Xf.A00(this, 3000) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass9AO.A01.A04(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE]: Frame stall detected", (Throwable) null);
        this.this$0.A00.A07(new C1695189q());
        return AnonymousClass0AJ.A00;
    }
}
