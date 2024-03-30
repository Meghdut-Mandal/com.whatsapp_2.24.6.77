package X;

import com.whatsapp.R;
import com.whatsapp.interopui.setting.InteropSettingsActivity;
import com.whatsapp.interopui.setting.InteropSettingsOptinFragment;

/* renamed from: X.4KT  reason: invalid class name */
public final class AnonymousClass4KT extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InteropSettingsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KT(InteropSettingsActivity interopSettingsActivity) {
        super(1);
        this.this$0 = interopSettingsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int ordinal = ((AnonymousClass3JA) obj).A00.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            InteropSettingsActivity interopSettingsActivity = this.this$0;
            if (AnonymousClass15V.A02) {
                interopSettingsActivity.Bnv();
            }
            AnonymousClass09Y A0O = C36341k9.A0O(interopSettingsActivity);
            A0O.A0F(new InteropSettingsOptinFragment(), "InteropSettingsOptinFragment", R.id.interop_settings_fragment);
            A0O.A02();
        } else if (ordinal == 1) {
            this.this$0.Bu1(R.string.f12nameremoved);
        }
        return AnonymousClass0AJ.A00;
    }
}
