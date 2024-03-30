package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass1H2;
import X.AnonymousClass3LW;
import X.AnonymousClass3UG;
import X.AnonymousClass3VU;
import X.C18740tg;
import X.C18820ts;
import X.C20380xT;
import X.C36441kJ;
import X.C39001qm;
import X.C56662wg;
import X.C89614Xf;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

public class PushnameEmojiBlacklistDialogFragment extends Hilt_PushnameEmojiBlacklistDialogFragment {
    public C18820ts A00;
    public AnonymousClass1H2 A01;
    public C20380xT A02;

    public static PushnameEmojiBlacklistDialogFragment A03(String str) {
        PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment = new PushnameEmojiBlacklistDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        String[] strArr = C56662wg.A01;
        ArrayList A14 = C36441kJ.A14(3);
        int i = 0;
        do {
            String str2 = strArr[i];
            if (str.contains(str2)) {
                A14.add(str2);
            }
            i++;
        } while (i < 3);
        A07.putStringArrayList("invalid_emojis", A14);
        pushnameEmojiBlacklistDialogFragment.A17(A07);
        return pushnameEmojiBlacklistDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A03 = AnonymousClass3LW.A03(this);
        ArrayList<String> stringArrayList = A0b().getStringArrayList("invalid_emojis");
        C18740tg.A06(stringArrayList);
        String A05 = this.A02.A05("26000056");
        A03.A0Z(AnonymousClass3UG.A05(A0h().getApplicationContext(), this.A01, this.A00.A0L(new Object[]{TextUtils.join(" ", stringArrayList)}, R.plurals.f10nameremoved, (long) stringArrayList.size())));
        A03.A0g(new C89614Xf(0, A05, this), R.string.f12nameremoved);
        A03.setPositiveButton(R.string.f12nameremoved, AnonymousClass3VU.A00);
        AnonymousClass0FM create = A03.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
