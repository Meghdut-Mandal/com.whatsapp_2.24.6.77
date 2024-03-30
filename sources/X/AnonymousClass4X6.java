package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.BaseBundle;
import com.whatsapp.R;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;

/* renamed from: X.4X6  reason: invalid class name */
public class AnonymousClass4X6 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4X6(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj2;
        this.A00 = i;
        this.A02 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A03) {
            case 0:
                C65373Ru r2 = (C65373Ru) this.A01;
                C65373Ru.A01(r2, 1, 1, (long) this.A00, r2.A00.A01().getTime());
                AnonymousClass3SJ.A00((Activity) this.A02, 115);
                return;
            case 1:
                SingleChoiceListDialogFragment singleChoiceListDialogFragment = (SingleChoiceListDialogFragment) this.A01;
                singleChoiceListDialogFragment.A01.Bgl(((BaseBundle) this.A02).getStringArray("items"), this.A00, i);
                singleChoiceListDialogFragment.A02.set(true);
                break;
            case 2:
                AnonymousClass28b r6 = (AnonymousClass28b) this.A01;
                AnonymousClass141 r5 = (AnonymousClass141) this.A02;
                int i2 = this.A00;
                AnonymousClass1NG r3 = r6.A09;
                AnonymousClass01L r22 = r6.A03;
                C18740tg.A06(r5);
                r3.A0G(r22, r5, "chat", false);
                AnonymousClass3SJ.A00(r22, i2);
                C20500xf r1 = r6.A0V;
                C19770wU r4 = r6.A0d;
                C65093Qs.A01(r6.A0L, r1, r6.A0W, C36351kA.A0j(r5), r4, C36371kC.A0o(), (Integer) null, 2);
                return;
            default:
                C63583Kp r62 = (C63583Kp) this.A01;
                UserJid userJid = (UserJid) this.A02;
                int i3 = this.A00;
                AnonymousClass00C.A0D(dialogInterface, 3);
                if (!r62.A02.A0O(userJid)) {
                    RequestPhoneNumberViewModel requestPhoneNumberViewModel = r62.A05;
                    C81333wq.A00(requestPhoneNumberViewModel.A06, requestPhoneNumberViewModel, userJid, i3, 31);
                    break;
                } else {
                    C53472rN r52 = new C53472rN(new AnonymousClass4X5(r62, i3, 2, userJid), userJid, r62, 2);
                    AnonymousClass141 A0D = r62.A03.A0D(userJid);
                    AnonymousClass155 r42 = r62.A01;
                    r42.Btm(UnblockDialogFragment.A03(r52, C36391kE.A0v(r42, r62.A04.A0H(A0D), AnonymousClass001.A0L(), 0, R.string.f12nameremoved), 0, false));
                    return;
                }
        }
        dialogInterface.dismiss();
    }
}
