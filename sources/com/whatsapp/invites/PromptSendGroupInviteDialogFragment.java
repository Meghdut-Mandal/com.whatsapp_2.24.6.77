package com.whatsapp.invites;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass171;
import X.AnonymousClass1EM;
import X.AnonymousClass3LW;
import X.AnonymousClass3VI;
import X.C18820ts;
import X.C36411kG;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;

public class PromptSendGroupInviteDialogFragment extends Hilt_PromptSendGroupInviteDialogFragment {
    public AnonymousClass171 A00;
    public AnonymousClass1EM A01;

    public Dialog A1a(Bundle bundle) {
        String str;
        int i;
        int i2;
        Bundle A0b = A0b();
        AnonymousClass01I A0i = A0i();
        ArrayList A1F = C36431kI.A1F(A0b, UserJid.class, "jids");
        Intent intent = (Intent) A0b.getParcelable("invite_intent");
        int i3 = A0b.getInt("invite_intent_code");
        boolean z = A0b.getBoolean("is_cag_and_community_add");
        ArrayList<String> arrayList = null;
        if (intent != null) {
            str = intent.getStringExtra("group_jid");
        } else {
            str = null;
        }
        AnonymousClass147 A06 = AnonymousClass147.A01.A06(str);
        boolean A062 = this.A01.A06(A06);
        if (intent != null) {
            arrayList = intent.getStringArrayListExtra("sms_invites_jids");
        }
        if (intent != null) {
            i = intent.getIntExtra("invite_trigger_source", 0);
        } else {
            i = 0;
        }
        AnonymousClass3VI r11 = new AnonymousClass3VI(intent, this, A06, arrayList, i3, i);
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        C18820ts r9 = this.A01;
        if (A062) {
            i2 = R.plurals.f10nameremoved;
        } else {
            i2 = R.plurals.f10nameremoved;
            if (z) {
                i2 = R.plurals.f10nameremoved;
            }
        }
        long size = (long) A1F.size();
        Object[] A0L = AnonymousClass001.A0L();
        C36411kG.A1H(r9, this.A00.A0W(A1F, 3), A0L, 0);
        A002.A0Z(r9.A0L(A0L, i2, size));
        int i4 = R.string.f12nameremoved;
        if (A062) {
            i4 = R.string.f12nameremoved;
        }
        A002.setPositiveButton(i4, r11);
        AnonymousClass0FM A0R = C36431kI.A0R(r11, A002, R.string.f12nameremoved);
        A0R.setCanceledOnTouchOutside(false);
        return A0R;
    }

    public static Bundle A03(Intent intent, Collection collection, boolean z) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putStringArrayList("jids", AnonymousClass143.A07(collection));
        A07.putParcelable("invite_intent", intent);
        A07.putBoolean("is_cag_and_community_add", z);
        return A07;
    }
}
