package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass141;
import X.AnonymousClass15E;
import X.AnonymousClass16D;
import X.AnonymousClass3LW;
import X.AnonymousClass3U8;
import X.AnonymousClass3V8;
import X.C19740wR;
import X.C19970wo;
import X.C222813r;
import X.C36351kA;
import X.C36401kF;
import X.C36411kG;
import X.C39001qm;
import X.C66243Vf;
import X.C89714Xp;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class ChangeNumberNotificationDialogFragment extends Hilt_ChangeNumberNotificationDialogFragment {
    public AnonymousClass16D A00;
    public AnonymousClass15E A01;
    public C19970wo A02;

    public static ChangeNumberNotificationDialogFragment A03(UserJid userJid, UserJid userJid2, String str) {
        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = new ChangeNumberNotificationDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("convo_jid", userJid.getRawString());
        A07.putString("new_jid", userJid2.getRawString());
        A07.putString("old_display_name", str);
        changeNumberNotificationDialogFragment.A17(A07);
        return changeNumberNotificationDialogFragment;
    }

    public void A1O(Context context) {
        super.A1O(context);
        try {
            this.A01 = (AnonymousClass15E) context;
        } catch (ClassCastException unused) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C36351kA.A1K(context, A0u);
            throw new ClassCastException(AnonymousClass000.A0q(" must implement ChangeNumberNotificationDialogListener", A0u));
        }
    }

    public Dialog A1a(Bundle bundle) {
        Bundle A0b = A0b();
        try {
            String string = A0b.getString("convo_jid");
            C222813r r0 = UserJid.Companion;
            UserJid A012 = C222813r.A01(string);
            UserJid A013 = C222813r.A01(A0b.getString("new_jid"));
            String string2 = A0b.getString("old_display_name");
            if (TextUtils.isEmpty(string2)) {
                string2 = "UNKNOWN";
            }
            AnonymousClass141 A0D = this.A00.A0D(A013);
            boolean A1V = AnonymousClass000.A1V(A0D.A0F);
            C39001qm A022 = AnonymousClass3LW.A02(this);
            C66243Vf r5 = C66243Vf.A00;
            C89714Xp r6 = new C89714Xp(A0D, this, 7);
            AnonymousClass3V8 r2 = new AnonymousClass3V8(this, A0D, A1V);
            if (A012.equals(A013)) {
                if (A1V) {
                    A022.A0Z(C36401kF.A0q(this, AnonymousClass3U8.A02(this.A01, A0D), new Object[1], 0, R.string.f12nameremoved));
                    A022.setPositiveButton(R.string.f12nameremoved, r5);
                } else {
                    A022.A0Z(C36401kF.A0q(this, AnonymousClass3U8.A04(C36351kA.A0j(A0D)), C36411kG.A1b(string2), 1, R.string.f12nameremoved));
                    A022.setNegativeButton(R.string.f12nameremoved, r5);
                    A022.setPositiveButton(R.string.f12nameremoved, r2);
                }
            } else if (A1V) {
                A022.A0Z(C36401kF.A0q(this, AnonymousClass3U8.A02(this.A01, A0D), new Object[1], 0, R.string.f12nameremoved));
                A022.setPositiveButton(R.string.f12nameremoved, r5);
                A022.A0g(r6, R.string.f12nameremoved);
            } else {
                A022.A0Z(C36401kF.A0q(this, string2, new Object[1], 0, R.string.f12nameremoved));
                A022.A0g(r6, R.string.f12nameremoved);
                C36401kF.A11(r2, r5, A022, R.string.f12nameremoved);
            }
            AnonymousClass0FM create = A022.create();
            create.setCanceledOnTouchOutside(true);
            return create;
        } catch (C19740wR e) {
            throw new RuntimeException(e);
        }
    }
}
