package com.whatsapp.calling.screenshare;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass17Z;
import X.C009003v;
import X.C023509x;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel$startScreenSharing$res$1", f = "ScreenShareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareViewModel$startScreenSharing$res$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareViewModel$startScreenSharing$res$1(ScreenShareViewModel screenShareViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = screenShareViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ScreenShareViewModel$startScreenSharing$res$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ScreenShareViewModel$startScreenSharing$res$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
            CallState currentCallState = Voip.getCurrentCallState();
            if (currentCallState == null || currentCallState == CallState.NONE || currentCallState == CallState.ENDING) {
                Log.w("turnScreenSharingOn ignored as no call active");
                i = 670007;
            } else {
                i = Voip.turnScreenShareOn();
            }
            return new Integer(i);
        }
        throw AnonymousClass000.A0e();
    }
}
