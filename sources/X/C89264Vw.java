package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.calling.views.JoinableEducationDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.4Vw  reason: invalid class name and case insensitive filesystem */
public class C89264Vw extends C33991gH {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89264Vw(Context context, Object obj, int i) {
        super(context);
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        switch (this.A01) {
            case 0:
                AnonymousClass09Y A0O = C36341k9.A0O((AnonymousClass01I) this.A00);
                A0O.A0D(JoinableEducationDialogFragment.A03(), (String) null);
                A0O.A02();
                return;
            case 1:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                contactPickerFragment.A0K.A06(contactPickerFragment.A1D(), C36391kE.A0G(contactPickerFragment.A27.A03("26000253")));
                return;
            case 2:
                C70803fk r2 = (C70803fk) this.A00;
                r2.A57.A01(3);
                C70803fk.A1R(r2, true);
                return;
            case 3:
                ChangeNumberNotifyContacts changeNumberNotifyContacts = (ChangeNumberNotifyContacts) this.A00;
                Intent A0H = C36441kJ.A0H(changeNumberNotifyContacts, NotifyContactsSelector.class);
                A0H.putStringArrayListExtra("selected", AnonymousClass143.A07(changeNumberNotifyContacts.A0C));
                changeNumberNotifyContacts.startActivityForResult(A0H, 1);
                return;
            default:
                C81253wi r1 = (C81253wi) this.A00;
                r1.A03 = 0;
                r1.A02 = 0;
                ReadMoreTextView readMoreTextView = r1.A04;
                AnonymousClass4S9 r0 = readMoreTextView.A02;
                if (r0 == null || !r0.BTf()) {
                    readMoreTextView.setExpanded(true);
                    readMoreTextView.A08.removeCallbacks(readMoreTextView.A0A);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89264Vw(Context context, Object obj, int i, int i2) {
        super(context, i);
        this.A01 = i2;
        this.A00 = obj;
    }
}
