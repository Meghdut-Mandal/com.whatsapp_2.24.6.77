package X;

import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.gallery.MediaGalleryActivity;
import java.util.ArrayList;

/* renamed from: X.4Z3  reason: invalid class name */
public class AnonymousClass4Z3 implements MenuItem.OnActionExpandListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4Z3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        switch (this.A01) {
            case 0:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                contactPickerFragment.A2i = null;
                ContactPickerFragment.A0F(contactPickerFragment);
                return true;
            case 1:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A00;
                phoneContactsSelector.A0Y = null;
                phoneContactsSelector.A3j();
                return true;
            case 2:
                ((AnonymousClass2JG) this.A00).A0I = null;
                return true;
            case 3:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                mediaGalleryActivity.A0h = null;
                ((AnonymousClass0Ey) mediaGalleryActivity.findViewById(R.id.toolbar).getLayoutParams()).A00 = 21;
                return true;
            default:
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = ((InviteNonWhatsAppContactPickerActivity) ((C87254Ob) this.A00)).A0E;
                if (inviteNonWhatsAppContactPickerViewModel == null) {
                    throw C36331k8.A0a();
                }
                inviteNonWhatsAppContactPickerViewModel.A00 = null;
                ArrayList A03 = C202859mm.A03(inviteNonWhatsAppContactPickerViewModel.A0H, (String) null);
                AnonymousClass00C.A08(A03);
                C36341k9.A16(inviteNonWhatsAppContactPickerViewModel.A0D, 0);
                inviteNonWhatsAppContactPickerViewModel.A0E.A0D(A03);
                return true;
        }
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        if (3 - this.A01 != 0) {
            return true;
        }
        ((AnonymousClass0Ey) ((AnonymousClass01L) this.A00).findViewById(R.id.toolbar).getLayoutParams()).A00 = 0;
        return true;
    }
}
