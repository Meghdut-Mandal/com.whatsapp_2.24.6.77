package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass04R;
import X.AnonymousClass08M;
import X.AnonymousClass16J;
import X.AnonymousClass17Y;
import X.AnonymousClass1A1;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.C001700s;
import X.C36321k7;
import X.C36341k9;
import X.C36381kD;
import X.C36441kJ;
import X.C62473Gh;
import X.C64933Qa;
import X.C68233bZ;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class MessageSelectionViewModel extends AnonymousClass04R {
    public final C001700s A00;
    public final C001700s A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass16J A03;
    public final AnonymousClass1A1 A04;

    public final void A0S() {
        C36341k9.A16(this.A01, 0);
        C001700s r1 = this.A00;
        C62473Gh r0 = (C62473Gh) r1.A04();
        if (r0 != null) {
            r0.A02();
            r1.A0D((Object) null);
        }
    }

    public final boolean A0T(int i) {
        C001700s r1 = this.A01;
        Number A0z = C36441kJ.A0z(r1);
        if (A0z == null || A0z.intValue() != 0) {
            return false;
        }
        C36341k9.A16(r1, i);
        return true;
    }

    public MessageSelectionViewModel(AnonymousClass08M r7, AnonymousClass17Y r8, AnonymousClass16J r9, AnonymousClass1A1 r10) {
        ArrayList A05;
        C36321k7.A18(r7, r8, r10, r9);
        this.A02 = r8;
        this.A04 = r10;
        this.A03 = r9;
        this.A01 = r7.A00(C36381kD.A0m(), "selectionUiLiveData");
        Bundle bundle = (Bundle) r7.A03.get("selectedMessagesLiveData");
        C62473Gh r5 = null;
        if (!(bundle == null || (A05 = AnonymousClass3UJ.A05(bundle)) == null)) {
            r5 = C62473Gh.A00(this.A02, (C62473Gh) null, this.A03, this, 0);
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 A032 = this.A04.A03((C64933Qa) it.next());
                if (A032 != null) {
                    r5.A03.put(A032.A1J, A032);
                }
            }
        }
        this.A00 = C36441kJ.A0Z(r5);
        r7.A04.put("selectedMessagesLiveData", new C68233bZ(this));
    }
}
