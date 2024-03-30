package com.facebook.wearable.mediastream.client.state;

import X.AnonymousClass000;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C07340Xg;
import X.C10810fG;
import X.C115045iF;
import X.C13170jR;
import X.C164247rV;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.client.state.DeviceStreamingStatus$isStreamingBlocked$job$1", f = "DeviceStreamingStatus.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceStreamingStatus$isStreamingBlocked$job$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C10810fG $streamingBlocked;
    public int label;
    public final /* synthetic */ C115045iF this$0;

    @DebugMetadata(c = "com.facebook.wearable.mediastream.client.state.DeviceStreamingStatus$isStreamingBlocked$job$1$1", f = "DeviceStreamingStatus.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.facebook.wearable.mediastream.client.state.DeviceStreamingStatus$isStreamingBlocked$job$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            AnonymousClass1 r0 = new AnonymousClass1(r5, r2);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                Object obj2 = this.L$0;
                AnonymousClass05L r3 = C115045iF.this.A00;
                C164247rV r0 = new C164247rV(obj2, (Object) r2, 4);
                this.label = 1;
                if (r3.B36(this, r0) == r6) {
                    return r6;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0e();
            } else {
                AnonymousClass0AN.A00(obj);
            }
            throw new C13170jR();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceStreamingStatus$isStreamingBlocked$job$1(C115045iF r2, C023509x r3, C10810fG r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$streamingBlocked = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new DeviceStreamingStatus$isStreamingBlocked$job$1(this.this$0, r5, this.$streamingBlocked);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final C115045iF r5 = this.this$0;
            final C10810fG r2 = this.$streamingBlocked;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (C07340Xg.A00(this, r0, 5000) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DeviceStreamingStatus$isStreamingBlocked$job$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
