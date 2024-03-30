package com.facebook.avatar.autogen.facetracker;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C17990sP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$getModels$2", f = "AEFaceTrackerManager.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class AEFaceTrackerManager$getModels$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C17990sP $modelFetching;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AEFaceTrackerManager$getModels$2(C023509x r2, C17990sP r3) {
        super(2, r2);
        this.$modelFetching = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AEFaceTrackerManager$getModels$2(r4, this.$modelFetching);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AEFaceTrackerManager$getModels$2((C023509x) obj2, this.$modelFetching).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C17990sP r0 = this.$modelFetching;
            this.label = 1;
            if (r0.B1c(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
