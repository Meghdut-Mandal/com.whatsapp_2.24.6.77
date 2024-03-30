package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3LW;
import X.AnonymousClass3QX;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C39001qm;
import X.C64533Oj;
import X.C89794Xx;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class ConversationRowContact$MessageSharedContactDialogFragment extends Hilt_ConversationRowContact_MessageSharedContactDialogFragment {
    public AnonymousClass3QX A00;

    public Dialog A1a(Bundle bundle) {
        String A0q;
        ArrayList A1F = C36431kI.A1F(A0b(), UserJid.class, "jids");
        ArrayList<String> stringArrayList = this.A0A.getStringArrayList("phones");
        ArrayList<String> stringArrayList2 = this.A0A.getStringArrayList("labels");
        String string = this.A0A.getString("business_name");
        ArrayList A0I = AnonymousClass001.A0I();
        if (!(stringArrayList2 == null || stringArrayList == null)) {
            for (int i = 0; i < A1F.size(); i++) {
                if (A1F.get(i) != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append(C36391kE.A0v(A1D(), stringArrayList.get(i), AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
                    if (TextUtils.isEmpty(stringArrayList2.get(i))) {
                        A0q = "";
                    } else {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append(" (");
                        A0u2.append(C36421kH.A0e(stringArrayList2, i));
                        A0q = AnonymousClass000.A0q(")", A0u2);
                    }
                    A0I.add(new C64533Oj((UserJid) A1F.get(i), AnonymousClass000.A0q(A0q, A0u)));
                }
            }
        }
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0O(new C89794Xx(this, A0I, string, 0), new ArrayAdapter(A1D(), R.layout.f9nameremoved, A0I));
        return A04.create();
    }
}
