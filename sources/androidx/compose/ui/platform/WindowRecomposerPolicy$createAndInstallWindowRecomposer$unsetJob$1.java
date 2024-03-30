package androidx.compose.ui.platform;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C07350Xh;
import X.C63963Mc;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.Recomposer$join$2;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Recomposer $newRecomposer;
    public final /* synthetic */ View $rootView;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(View view, Recomposer recomposer, C023509x r4) {
        super(2, r4);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.$rootView, this.$newRecomposer, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            Recomposer recomposer = this.$newRecomposer;
            this.label = 1;
            Object A00 = C07350Xh.A00(this, new Recomposer$join$2((C023509x) null), recomposer.A0K);
            if (A00 != r3) {
                A00 = AnonymousClass0AJ.A00;
            }
            if (A00 == r3) {
                return r3;
            }
        } else if (i == 1) {
            try {
                AnonymousClass0AN.A00(obj);
            } catch (Throwable th) {
                th = th;
                if (C63963Mc.A00(this.$rootView) == this.$newRecomposer) {
                    this.$rootView.setTag(R.id.androidx_compose_ui_view_composition_context, (Object) null);
                    throw th;
                }
            }
        } else {
            th = AnonymousClass000.A0e();
            throw th;
        }
        if (C63963Mc.A00(this.$rootView) == this.$newRecomposer) {
            this.$rootView.setTag(R.id.androidx_compose_ui_view_composition_context, (Object) null);
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
