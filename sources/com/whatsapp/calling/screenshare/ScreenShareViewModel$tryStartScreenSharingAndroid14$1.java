package com.whatsapp.calling.screenshare;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C36441kJ;
import com.whatsapp.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel$tryStartScreenSharingAndroid14$1", f = "ScreenShareViewModel.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareViewModel$tryStartScreenSharingAndroid14$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareViewModel$tryStartScreenSharingAndroid14$1(ScreenShareViewModel screenShareViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = screenShareViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ScreenShareViewModel$tryStartScreenSharingAndroid14$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ScreenShareViewModel$tryStartScreenSharingAndroid14$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            long A0B = C36441kJ.A0B(this.this$0.A0C, 5479);
            this.label = 1;
            if (C07330Xf.A00(this, A0B) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        ScreenShareViewModel screenShareViewModel = this.this$0;
        ScreenShareViewModel.A0C(screenShareViewModel);
        screenShareViewModel.A0A.unregisterObserver(screenShareViewModel);
        C007403e r1 = screenShareViewModel.A04;
        if (r1 != null) {
            r1.B2S((CancellationException) null);
        }
        screenShareViewModel.A04 = null;
        Log.i("ScreenShareViewModel timed out waiting for FgService to start with MediaProjection type");
        return AnonymousClass0AJ.A00;
    }
}
