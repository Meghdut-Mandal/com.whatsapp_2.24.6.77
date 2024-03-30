package X;

import com.whatsapp.settings.SettingsPasskeysEnabledFragment;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.SettingsPasskeysEnabledFragment", f = "SettingsPasskeysEnabledFragment.kt", i = {0, 0}, l = {85}, m = "revokePasskey", n = {"passkeyLogger", "activity"}, s = {"L$0", "L$1"})
/* renamed from: X.3zD  reason: invalid class name and case insensitive filesystem */
public final class C82753zD extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SettingsPasskeysEnabledFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82753zD(SettingsPasskeysEnabledFragment settingsPasskeysEnabledFragment, C023509x r2) {
        super(r2);
        this.this$0 = settingsPasskeysEnabledFragment;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SettingsPasskeysEnabledFragment.A00(this.this$0, this);
    }
}
