package X;

import com.whatsapp.settings.SettingsPasskeysViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.SettingsPasskeysViewModel", f = "SettingsPasskeysViewModel.kt", i = {0}, l = {99}, m = "revokePasskey", n = {"this"}, s = {"L$0"})
/* renamed from: X.Ad8  reason: case insensitive filesystem */
public final class C21933Ad8 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SettingsPasskeysViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21933Ad8(SettingsPasskeysViewModel settingsPasskeysViewModel, C023509x r2) {
        super(r2);
        this.this$0 = settingsPasskeysViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0T(this);
    }
}
