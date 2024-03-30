package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.4A9  reason: invalid class name */
public final class AnonymousClass4A9 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4A9(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(0);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
        C32601dt r1 = inviteNonWhatsAppContactPickerActivity.A06;
        if (r1 != null) {
            r1.A01(inviteNonWhatsAppContactPickerActivity, InviteNonWhatsAppContactPickerActivity.A07(inviteNonWhatsAppContactPickerActivity));
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("tellAFriend");
    }
}
