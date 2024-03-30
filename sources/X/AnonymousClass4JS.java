package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.4JS  reason: invalid class name */
public final class AnonymousClass4JS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JS(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
        C65383Rv r2 = inviteNonWhatsAppContactPickerActivity.A0B;
        if (r2 != null) {
            r2.A02(inviteNonWhatsAppContactPickerActivity, InviteNonWhatsAppContactPickerActivity.A07(inviteNonWhatsAppContactPickerActivity), str, "sms:");
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("inviteContactUtils");
    }
}
