package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass3LW;
import X.AnonymousClass3Os;
import X.C012005e;
import X.C133516Yv;
import X.C133556Yz;
import X.C18740tg;
import X.C19770wU;
import X.C225314u;
import X.C36321k7;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C39001qm;
import X.C63633Ku;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.R;

public class CommunitySpamReportDialogFragment extends Hilt_CommunitySpamReportDialogFragment {
    public AnonymousClass17Y A00;
    public AnonymousClass16D A01;
    public C63633Ku A02;
    public AnonymousClass3Os A03;
    public C19770wU A04;

    public Dialog A1a(Bundle bundle) {
        C225314u r7 = (C225314u) A0h();
        AnonymousClass11F A0N = C36421kH.A0N(C36411kG.A0x(this));
        C18740tg.A06(A0N);
        String string = A0b().getString("spamFlow");
        AnonymousClass141 A0D = this.A01.A0D(A0N);
        AnonymousClass3Os r1 = this.A03;
        boolean A1a = C36341k9.A1a(string, A0N);
        AnonymousClass3Os.A00(r1, A0N, string, 0);
        View A0K = C36381kD.A0K(LayoutInflater.from(A1D()), R.layout.f9nameremoved);
        TextView A0O = C36391kE.A0O(A0K, R.id.report_spam_dialog_message);
        CheckBox checkBox = (CheckBox) C012005e.A02(A0K, R.id.block_checkbox);
        C18740tg.A06(r7);
        C39001qm A002 = AnonymousClass3LW.A00(r7);
        A002.A0j(A0K);
        A002.A0L(R.string.f12nameremoved);
        A0O.setText(R.string.f12nameremoved);
        boolean z = A0b().getBoolean("shouldUpsellExit");
        if (z) {
            View findViewById = A0K.findViewById(R.id.block_checkbox_text);
            C18740tg.A04(findViewById);
            ((TextView) findViewById).setText(R.string.f12nameremoved);
        } else {
            C012005e.A02(A0K, R.id.block_container).setVisibility(8);
        }
        A002.setPositiveButton(R.string.f12nameremoved, new C133556Yz(checkBox, r7, this, A0D, string, z));
        A002.setNegativeButton(R.string.f12nameremoved, new C133516Yv(this, A0N, string));
        AnonymousClass0FM create = A002.create();
        create.setCanceledOnTouchOutside(A1a);
        return create;
    }

    public static CommunitySpamReportDialogFragment A03(AnonymousClass147 r4, boolean z) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("jid", r4.getRawString());
        A07.putString("spamFlow", "community_home");
        A07.putBoolean("shouldUpsellExit", z);
        CommunitySpamReportDialogFragment communitySpamReportDialogFragment = new CommunitySpamReportDialogFragment();
        communitySpamReportDialogFragment.A17(A07);
        return communitySpamReportDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        String string = A0b().getString("spamFlow");
        AnonymousClass11F A0N = C36421kH.A0N(C36411kG.A0x(this));
        C18740tg.A06(A0N);
        AnonymousClass3Os r1 = this.A03;
        C36321k7.A0w(string, A0N);
        AnonymousClass3Os.A00(r1, A0N, string, 2);
    }
}
