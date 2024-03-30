package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3LW;
import X.AnonymousClass4XI;
import X.C18740tg;
import X.C19730wQ;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C39001qm;
import X.C64533Oj;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import java.util.ArrayList;

public class ConversationRow$ConversationRowDialogFragment extends Hilt_ConversationRow_ConversationRowDialogFragment {
    public C19730wQ A00;
    public AnonymousClass16D A01;
    public AnonymousClass171 A02;
    public AnonymousClass13J A03;

    public Dialog A1a(Bundle bundle) {
        String string = this.A0A.getString("jid");
        AnonymousClass11F A0N = C36421kH.A0N(string);
        C18740tg.A07(A0N, AnonymousClass000.A0p("ConversationRow/onCreateDialog/invalid jid=", string, AnonymousClass000.A0u()));
        AnonymousClass141 A0i = C36441kJ.A0i(this.A01, A0N);
        ArrayList A0I = AnonymousClass001.A0I();
        if (!A0i.A0B() && C36441kJ.A1J(this.A00)) {
            A0I.add(new C64533Oj(A1D().getString(R.string.f12nameremoved), (int) R.id.menuitem_add_to_contacts));
            A0I.add(new C64533Oj(A1D().getString(R.string.f12nameremoved), (int) R.id.menuitem_add_to_existing_contact));
        }
        String A0v = C36381kD.A0v(this.A02, A0i);
        A0I.add(new C64533Oj(C36391kE.A0v(A1D(), A0v, new Object[1], 0, R.string.f12nameremoved), (int) R.id.menuitem_message_contact));
        A0I.add(new C64533Oj(C36351kA.A0w(A1D(), A0v, 1, R.string.f12nameremoved), (int) R.id.menuitem_voice_call_contact));
        A0I.add(new C64533Oj(C36351kA.A0w(A1D(), A0v, 1, R.string.f12nameremoved), (int) R.id.menuitem_video_call_contact));
        C39001qm A022 = AnonymousClass3LW.A02(this);
        A022.A0O(new AnonymousClass4XI(A0N, A0I, this, 6), new ArrayAdapter(A1D(), 17367043, A0I));
        return A022.create();
    }
}
