package androidx.compose.ui.platform;

import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass4Z8;
import X.C009003v;
import X.C023509x;
import X.C13170jR;
import X.C137316fw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05K $durationScaleStateFlow;
    public final /* synthetic */ C137316fw $it;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(C137316fw r2, C023509x r3, AnonymousClass05K r4) {
        super(2, r3);
        this.$durationScaleStateFlow = r4;
        this.$it = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.$it, r5, this.$durationScaleStateFlow);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05K r3 = this.$durationScaleStateFlow;
            AnonymousClass4Z8 r0 = new AnonymousClass4Z8(this.$it, 0);
            this.label = 1;
            if (r3.B36(this, r0) == r5) {
                return r5;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0e();
        } else {
            AnonymousClass0AN.A00(obj);
        }
        throw new C13170jR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
