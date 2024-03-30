package X;

import android.content.Context;
import com.whatsapp.payments.ui.PaymentDeleteAccountActivity;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrActivity;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity;
import com.whatsapp.profile.AboutStatusBlockListPickerActivity;
import com.whatsapp.profile.ProfilePhotoBlockListPickerActivity;
import com.whatsapp.profile.ViewProfilePhoto;
import com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity;

/* renamed from: X.B7a  reason: case insensitive filesystem */
public class C23140B7a implements C004101v {
    public Object A00;
    public final int A01;

    public C23140B7a(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new C23140B7a(r1, i));
    }

    public void BUZ(Context context) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 1:
                ((PaymentDeleteAccountActivity) obj).A2F();
                return;
            case 2:
                ((PaymentGroupParticipantPickerActivity) obj).A2F();
                return;
            case 4:
                ((C179188jN) obj).A2F();
                return;
            case 5:
                ((C173918Tq) obj).A2F();
                return;
            case 6:
                ((C173928Tr) obj).A2F();
                return;
            case 7:
                ((IndiaUpiInternationalActivationActivity) obj).A2F();
                return;
            case 8:
                ((IndiaUpiInternationalDeactivationActivity) obj).A2F();
                return;
            case 9:
                ((IndiaUpiInternationalValidateQrActivity) obj).A2F();
                return;
            case 10:
                ((IndiaUpiCreateCustomNumberActivity) obj).A2F();
                return;
            case 11:
                ((AboutStatusBlockListPickerActivity) obj).A2F();
                return;
            case 13:
                ((ProfilePhotoBlockListPickerActivity) obj).A2F();
                return;
            case 14:
                ((ViewProfilePhoto) obj).A2F();
                return;
            case 15:
                ((AnonymousClass8TT) obj).A2F();
                return;
            case 16:
                ((StatusTemporalRecipientsActivity) obj).A2F();
                return;
            default:
                ((C225514w) obj).A2F();
                return;
        }
    }
}
