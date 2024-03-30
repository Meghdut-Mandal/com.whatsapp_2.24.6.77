package com.whatsapp.invites;

import X.AnonymousClass001;
import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C89344We;
import android.os.Bundle;
import com.whatsapp.R;

public final class SMSPreviewInviteGroupParticipantsActivity extends AnonymousClass155 {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public SMSPreviewInviteGroupParticipantsActivity(int i) {
        this.A00 = false;
        C89344We.A00(this, 8);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("invite_trigger_source", 0);
        if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
            setTitle(R.string.f12nameremoved);
            C36331k8.A0l(this);
            C36361kB.A0u(this);
            Bundle A07 = AnonymousClass001.A07();
            A07.putStringArrayList("sms_invites_jids", getIntent().getStringArrayListExtra("sms_invites_jids"));
            A07.putString("group_jid", getIntent().getStringExtra("group_jid"));
            SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = new SMSPreviewInviteBottomSheetFragment();
            Bundle A072 = AnonymousClass001.A07();
            A072.putStringArrayList("sms_invites_jids", getIntent().getStringArrayListExtra("sms_invites_jids"));
            A072.putString("group_jid", getIntent().getStringExtra("group_jid"));
            A072.putBoolean("all_participants_non_wa_in_request", getIntent().getBooleanExtra("all_participants_non_wa_in_request", true));
            A072.putInt("invite_trigger_source", intExtra);
            sMSPreviewInviteBottomSheetFragment.A17(A072);
            sMSPreviewInviteBottomSheetFragment.A1f(getSupportFragmentManager(), "SMSPreviewInviteGroupParticipantsActivity");
            return;
        }
        finish();
    }

    public SMSPreviewInviteGroupParticipantsActivity() {
        this(0);
    }
}
