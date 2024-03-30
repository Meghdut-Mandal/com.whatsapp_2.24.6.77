package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import java.util.List;

/* renamed from: X.4JV  reason: invalid class name */
public final class AnonymousClass4JV extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JV(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A0h = C36421kH.A0h(obj);
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
        AnonymousClass2Gd r2 = inviteNonWhatsAppContactPickerActivity.A0D;
        if (r2 == null) {
            throw C36331k8.A0d("adapter");
        }
        r2.A01 = A0h;
        r2.A02 = A0h;
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = inviteNonWhatsAppContactPickerActivity.A0E;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C36331k8.A0a();
        }
        r2.A00 = C36401kF.A0w(inviteNonWhatsAppContactPickerViewModel.A0E);
        AnonymousClass2Gd r0 = this.this$0.A0D;
        if (r0 == null) {
            throw C36331k8.A0d("adapter");
        }
        r0.notifyDataSetChanged();
        return AnonymousClass0AJ.A00;
    }
}
