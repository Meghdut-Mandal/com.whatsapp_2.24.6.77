package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import java.util.List;

/* renamed from: X.4JX  reason: invalid class name */
public final class AnonymousClass4JX extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JX(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A0h = C36421kH.A0h(obj);
        MenuItem menuItem = this.this$0.A00;
        if (menuItem == null) {
            throw C36331k8.A0d("searchMenuItem");
        }
        menuItem.setVisible(C36401kF.A1a(A0h));
        return AnonymousClass0AJ.A00;
    }
}
