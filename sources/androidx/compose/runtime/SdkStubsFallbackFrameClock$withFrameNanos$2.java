package androidx.compose.runtime;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $onFrame;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(C023509x r2, C006302t r3) {
        super(2, r2);
        this.$onFrame = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(r4, this.$onFrame);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2((C023509x) obj2, this.$onFrame).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.label = 1;
            if (C07330Xf.A00(this, 16) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return this.$onFrame.invoke(new Long(System.nanoTime()));
    }
}
