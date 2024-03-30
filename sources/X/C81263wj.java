package X;

import android.os.SystemClock;
import android.widget.CompoundButton;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.group.ExitGroupsDialogFragment;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3wj  reason: invalid class name and case insensitive filesystem */
public class C81263wj implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public C81263wj(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A05 = i2;
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A03 = obj3;
    }

    public final void run() {
        switch (this.A05) {
            case 0:
                AnonymousClass3O6 r4 = (AnonymousClass3O6) this.A01;
                AnonymousClass141 r7 = (AnonymousClass141) this.A02;
                String str = this.A04;
                C225314u r5 = (C225314u) this.A03;
                int i = this.A00;
                C63633Ku r1 = r4.A04;
                r1.A01(r7, str, (List) null);
                C70383f4 r2 = new C70383f4(r5, r4, i);
                boolean z = !C36421kH.A1Z(r4.A06);
                UserJid A0k = C36351kA.A0k(r7);
                r1.A01.A0F(r5, (C51092nG) null, r7, A0k, (Integer) null, (String) null, (String) null, str);
                if (z) {
                    r1.A00.A0P(A0k, true);
                }
                r2.BkA(r7);
                return;
            case 1:
                int i2 = this.A00;
                C88424Sq r42 = (C88424Sq) this.A01;
                C62753Hk r3 = (C62753Hk) this.A02;
                String str2 = this.A04;
                AnonymousClass011 r12 = (AnonymousClass011) this.A03;
                C36321k7.A18(r42, r3, str2, r12);
                C131886Rd.A01(new C85584Hq(r42, r3, str2, r12), i2);
                return;
            case 2:
                ((VoiceServiceEventCallback) this.A01).m12lambda$rejectedDecryptionFailure$3$comwhatsappcallingserviceVoiceServiceEventCallback((DeviceJid) this.A02, this.A04, (byte[]) this.A03, this.A00);
                return;
            case 3:
                ExitGroupsDialogFragment exitGroupsDialogFragment = (ExitGroupsDialogFragment) this.A01;
                int i3 = this.A00;
                CompoundButton compoundButton = (CompoundButton) this.A02;
                AnonymousClass147 r8 = (AnonymousClass147) this.A03;
                String str3 = this.A04;
                if (i3 == 1) {
                    SystemClock.sleep(300);
                }
                if (compoundButton == null || !compoundButton.isChecked()) {
                    exitGroupsDialogFragment.A0D.A0A(new AnonymousClass2VP(exitGroupsDialogFragment.A08, exitGroupsDialogFragment, exitGroupsDialogFragment.A0C, r8, r8, i3));
                    return;
                }
                AnonymousClass141 A0D = exitGroupsDialogFragment.A02.A0D(r8);
                exitGroupsDialogFragment.A04.A01(A0D, str3, (List) null);
                exitGroupsDialogFragment.A04.A00(new C70363f2(exitGroupsDialogFragment.A00, exitGroupsDialogFragment.A08, i3), A0D, true, false);
                return;
            default:
                int i4 = this.A00;
                C006302t r22 = (C006302t) this.A02;
                C006302t r13 = (C006302t) this.A03;
                C36331k8.A1G(r22, 3, r13);
                ((AnonymousClass6CQ) this.A01).A01("wa_bwe_pl_classifier_mobile", r22, r13, i4);
                return;
        }
    }

    public C81263wj(AnonymousClass6CQ r2, C006302t r3, C006302t r4, int i) {
        this.A05 = 4;
        this.A01 = r2;
        this.A04 = "wa_bwe_pl_classifier_mobile";
        this.A00 = i;
        this.A02 = r3;
        this.A03 = r4;
    }
}
