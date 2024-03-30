package com.facebook.wearable.mediastream.controller.wa;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass88E;
import X.AnonymousClass9AO;
import X.AnonymousClass9DD;
import X.C009003v;
import X.C023109s;
import X.C023509x;
import X.C07330Xf;
import X.C1695489t;
import X.C169678Ag;
import X.C200219gt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.controller.wa.MediaStreamController$init$6$1", f = "MediaStreamController.kt", i = {}, l = {341}, m = "invokeSuspend", n = {}, s = {})
public final class MediaStreamController$init$6$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C200219gt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaStreamController$init$6$1(C200219gt r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new MediaStreamController$init$6$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MediaStreamController$init$6$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass9AO.A01.A04("sup:MediaStreamController", "Latency has built up beyond reproach!!!  Disconnect!!", (Throwable) null);
            AnonymousClass9DD r0 = this.this$0.A0F;
            if (r0 != null) {
                r0.A00.A06(C169678Ag.A00);
            }
            this.this$0.A0A(C023109s.A0W);
            this.label = 1;
            if (C07330Xf.A00(this, 500) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.this$0.A09((AnonymousClass88E) null, new C1695489t("STREAM_STOPPED_REASON_HIGH_LATENCY"));
        return AnonymousClass0AJ.A00;
    }
}
