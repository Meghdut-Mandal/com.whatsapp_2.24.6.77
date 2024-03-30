package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.wds.components.search.WDSSearchBar;

/* renamed from: X.4JU  reason: invalid class name */
public final class AnonymousClass4JU extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JU(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1X = AnonymousClass000.A1X(obj);
        WDSSearchBar wDSSearchBar = this.this$0.A0G;
        if (A1X) {
            if (wDSSearchBar == null) {
                throw C36331k8.A0d("wdsSearchBar");
            }
            wDSSearchBar.A01();
        } else if (wDSSearchBar == null) {
            throw C36331k8.A0d("wdsSearchBar");
        } else {
            wDSSearchBar.A02(true);
        }
        return AnonymousClass0AJ.A00;
    }
}
