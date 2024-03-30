package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.4JT  reason: invalid class name */
public final class AnonymousClass4JT extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JT(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
        C32611du r4 = inviteNonWhatsAppContactPickerActivity.A0C;
        if (r4 != null) {
            Integer A07 = InviteNonWhatsAppContactPickerActivity.A07(inviteNonWhatsAppContactPickerActivity);
            C45602Rz r2 = new C45602Rz();
            r2.A03 = 1;
            r2.A04 = A07;
            r2.A02 = true;
            r4.A03.Bly(r2);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("inviteFlowLogger");
    }
}
