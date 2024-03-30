package com.whatsapp.calling.camera;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C107305Nn;
import X.C36321k7;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1", f = "ScreenShareCaptureDevice.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C107305Nn this$0;

    @DebugMetadata(c = "com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1$1", f = "ScreenShareCaptureDevice.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(r3, r5, BwF);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                int i = BwF;
                if (i != 0) {
                    r3.A0B.A01(i);
                    C36321k7.A1S("ScreenShareCaptureDevice Failed to stop screen sharing: ", AnonymousClass000.A0u(), i);
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(C107305Nn r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final int BwF = this.this$0.A09.BwF();
            final C107305Nn r3 = this.this$0;
            C005502l r2 = r3.A0E;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r2, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
