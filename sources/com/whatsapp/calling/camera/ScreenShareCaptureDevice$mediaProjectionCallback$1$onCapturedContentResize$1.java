package com.whatsapp.calling.camera;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass6PE;
import X.C009003v;
import X.C023509x;
import X.C107305Nn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1", f = "ScreenShareCaptureDevice.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass6PE $newScreenShareInfo;
    public int label;
    public final /* synthetic */ C107305Nn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1(C107305Nn r2, AnonymousClass6PE r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$newScreenShareInfo = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1(this.this$0, this.$newScreenShareInfo, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.onScreenShareInfoChanged(this.$newScreenShareInfo);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
