package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.whatsapp.blockui.BlockConfirmationDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3VM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VM implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CheckBox A02;
    public final /* synthetic */ C225314u A03;
    public final /* synthetic */ BlockConfirmationDialogFragment A04;
    public final /* synthetic */ AnonymousClass141 A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass3VM(CheckBox checkBox, C225314u r2, BlockConfirmationDialogFragment blockConfirmationDialogFragment, AnonymousClass141 r4, int i, int i2, boolean z, boolean z2) {
        this.A04 = blockConfirmationDialogFragment;
        this.A02 = checkBox;
        this.A05 = r4;
        this.A03 = r2;
        this.A00 = i;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A04;
        CheckBox checkBox = this.A02;
        AnonymousClass141 r4 = this.A05;
        C225314u r11 = this.A03;
        int i2 = this.A00;
        boolean z = this.A06;
        boolean z2 = this.A07;
        int i3 = this.A01;
        if (checkBox == null || !checkBox.isChecked()) {
            AnonymousClass3PR r2 = blockConfirmationDialogFragment.A06;
            String str = blockConfirmationDialogFragment.A0A;
            UserJid userJid = blockConfirmationDialogFragment.A08;
            boolean A1a = C36341k9.A1a(str, userJid);
            AnonymousClass3PR.A00(r2, userJid, str, A1a ? 1 : 0);
            AnonymousClass3O6 r3 = blockConfirmationDialogFragment.A01;
            String str2 = blockConfirmationDialogFragment.A0A;
            if (z) {
                C19770wU r1 = r3.A07;
                AnonymousClass1X4 r13 = r3.A01;
                AnonymousClass141 r17 = r4;
                C63633Ku r16 = r3.A04;
                C36391kE.A1Q(new C50102kD(r11, r11, r13, new AnonymousClass4X5(r11, i3, 0, r3), (C51092nG) null, r16, r17, (Integer) null, (String) null, (String) null, str2, false, false, A1a, A1a), r1);
                return;
            }
            AnonymousClass1NG r12 = r3.A02;
            AnonymousClass4X5 r0 = new AnonymousClass4X5(r11, i3, A1a, r3);
            C36341k9.A1E(r11, 0, str2);
            AnonymousClass1NG.A03(r11, r0, r12, (C51092nG) null, r4, (Integer) null, (String) null, (String) null, str2, A1a, z2);
            return;
        }
        AnonymousClass3PR r32 = blockConfirmationDialogFragment.A06;
        String str3 = blockConfirmationDialogFragment.A0A;
        UserJid userJid2 = blockConfirmationDialogFragment.A08;
        C36331k8.A1I(str3, userJid2);
        AnonymousClass3PR.A00(r32, userJid2, str3, 3);
        AnonymousClass3O6 r5 = blockConfirmationDialogFragment.A01;
        String str4 = blockConfirmationDialogFragment.A0A;
        AnonymousClass4PK r22 = blockConfirmationDialogFragment.A00;
        if (r5.A04.A02(r11)) {
            r5.A00.A0B((C225014r) null);
            if (r22 != null) {
                r22.BoF();
            }
            r5.A07.Boy(new C81263wj(r5, r4, r11, str4, i2, 0));
        }
    }
}
