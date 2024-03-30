package com.facebook.avatar.autogen.view;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.view.AESelfieViewProvider$decreaseBrightness$1", f = "AESelfieViewProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AESelfieViewProvider$decreaseBrightness$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Activity $activity;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AESelfieViewProvider$decreaseBrightness$1(Activity activity, C023509x r3) {
        super(2, r3);
        this.$activity = activity;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AESelfieViewProvider$decreaseBrightness$1(this.$activity, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AESelfieViewProvider$decreaseBrightness$1(this.$activity, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Window window;
        Window window2;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            Activity activity = this.$activity;
            WindowManager.LayoutParams layoutParams = null;
            if (!(activity == null || (window2 = activity.getWindow()) == null || (layoutParams = window2.getAttributes()) == null)) {
                layoutParams.screenBrightness = -1.0f;
            }
            Activity activity2 = this.$activity;
            if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
                window.setAttributes(layoutParams);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
