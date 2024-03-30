package com.whatsapp.calling.calllink.viewmodel;

import X.AnonymousClass04R;
import X.AnonymousClass08M;
import X.AnonymousClass36B;
import X.AnonymousClass3UD;
import X.AnonymousClass3XX;
import X.AnonymousClass3XZ;
import X.C001700s;
import X.C132636Up;
import X.C19600wD;
import X.C36341k9;
import X.C36431kI;
import X.C62063Ep;
import X.C88444Ss;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.R;
import java.util.Set;

public class CallLinkViewModel extends AnonymousClass04R implements C88444Ss {
    public final C001700s A00;
    public final C001700s A01;
    public final AnonymousClass08M A02;
    public final C19600wD A03;
    public final AnonymousClass36B A04;

    public static void A02(CallLinkViewModel callLinkViewModel, boolean z) {
        boolean A09 = callLinkViewModel.A03.A09();
        AnonymousClass08M r2 = callLinkViewModel.A02;
        if (!A09) {
            r2.A03("saved_state_link", new C62063Ep(3).A00());
            return;
        }
        C62063Ep r1 = new C62063Ep(0);
        r1.A01 = R.string.f12nameremoved;
        r1.A00 = R.color.f6nameremoved;
        r2.A03("saved_state_link", r1.A00());
        callLinkViewModel.A04.A01.A00(new C132636Up(Message.obtain((Handler) null, 0, z ? 1 : 0, 0), "create_call_link"));
    }

    public static boolean A03(CallLinkViewModel callLinkViewModel) {
        Boolean bool = (Boolean) callLinkViewModel.A02.A03.get("saved_state_is_video");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void A0R() {
        AnonymousClass36B r1 = this.A04;
        Set set = r1.A02;
        set.remove(this);
        if (set.size() == 0) {
            r1.A00.unregisterObserver(r1);
        }
    }

    public void BSc() {
        this.A02.A03("saved_state_link", new C62063Ep(2).A00());
    }

    public void BZh(String str, boolean z) {
        AnonymousClass08M r3 = this.A02;
        r3.A03("saved_state_is_video", Boolean.valueOf(z));
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        C62063Ep r1 = new C62063Ep(1);
        r1.A03 = AnonymousClass3UD.A05(str, z);
        r1.A04 = str;
        r1.A05 = z;
        r1.A02 = i;
        r3.A03("saved_state_link", r1.A00());
        r3.A03("saved_state_link_type", A01(this));
    }

    public CallLinkViewModel(AnonymousClass08M r4, AnonymousClass36B r5, C19600wD r6) {
        C001700s A0S = C36431kI.A0S();
        this.A01 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        this.A00 = A0S2;
        this.A04 = r5;
        r5.A02.add(this);
        this.A02 = r4;
        this.A03 = r6;
        C36341k9.A16(A0S2, R.string.f12nameremoved);
        C36341k9.A16(A0S, R.string.f12nameremoved);
        C001700s A012 = this.A02.A01("saved_state_link");
        if (A012.A04() == null || ((AnonymousClass3XZ) A012.A04()).A03 != 1) {
            A02(this, A03(this));
        }
    }

    public static AnonymousClass3XX A01(CallLinkViewModel callLinkViewModel) {
        boolean A032 = A03(callLinkViewModel);
        int i = R.drawable.ic_btn_call_audio;
        if (A032) {
            i = R.drawable.ic_btn_call_video;
        }
        int i2 = R.string.f12nameremoved;
        if (A032) {
            i2 = R.string.f12nameremoved;
        }
        return new AnonymousClass3XX(i, R.string.f12nameremoved, i2, R.string.f12nameremoved, A03(callLinkViewModel) ^ true ? 1 : 0, R.array.f3nameremoved);
    }
}
