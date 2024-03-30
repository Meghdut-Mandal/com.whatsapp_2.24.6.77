package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2Vk  reason: invalid class name and case insensitive filesystem */
public class C46192Vk extends C75173mn {
    public final /* synthetic */ NewGroup A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46192Vk(C19970wo r8, C24381Cf r9, C20310xM r10, C20350xQ r11, AnonymousClass3B9 r12, NewGroup newGroup, C238019x r14) {
        super(r8, r9, r10, r11, r12, r14);
        this.A00 = newGroup;
    }

    public void BiP(AnonymousClass39E r17, AnonymousClass147 r18) {
        NewGroup newGroup = this.A00;
        AnonymousClass147 r3 = r18;
        newGroup.A0t.set(r3);
        if (NewGroup.A07(newGroup) != null) {
            newGroup.A05.A0H(new C80293vA(this, r3, 9));
        }
        AnonymousClass39E r2 = r17;
        super.BiP(r2, r3);
        Map map = r2.A03;
        if (map.size() > 0) {
            Long l = null;
            ArrayList A0I = AnonymousClass001.A0I();
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                Jid jid = (Jid) A10.next();
                C596034o r5 = (C596034o) map.get(jid);
                if (r5 != null) {
                    if (l == null) {
                        l = Long.valueOf(r5.A00);
                    }
                    A0I.add(jid.getRawString());
                    A0I2.add(r5.A01);
                }
            }
            newGroup.A02 = PromptSendGroupInviteDialogFragment.A03(AnonymousClass190.A0f(newGroup, r2.A00, l, A0I, A0I2, r2.A01, 1), map.keySet(), false);
        } else {
            ArrayList arrayList = r2.A01;
            if (!arrayList.isEmpty() && C36441kJ.A1L(newGroup.A0D)) {
                Bundle bundle = newGroup.A02;
                if (bundle == null) {
                    bundle = AnonymousClass001.A07();
                    newGroup.A02 = bundle;
                }
                AnonymousClass147 r6 = r2.A00;
                boolean z = true;
                if (!(r2.A04.size() == 1 && r2.A02.size() == arrayList.size())) {
                    z = false;
                }
                bundle.putParcelable("sms_invite_intent", AnonymousClass190.A0g(newGroup, r6, arrayList, 1, z));
            }
        }
        String A002 = C54452sy.A00(newGroup, r2);
        if (!TextUtils.isEmpty(A002)) {
            Bundle bundle2 = newGroup.A02;
            if (bundle2 == null) {
                bundle2 = AnonymousClass001.A07();
                newGroup.A02 = bundle2;
            }
            bundle2.putString("error_message", A002);
        }
        if (newGroup.A01 != null) {
            Bundle bundle3 = newGroup.A02;
            if (bundle3 == null) {
                bundle3 = AnonymousClass001.A07();
                newGroup.A02 = bundle3;
            }
            bundle3.putBundle("messages_to_forward_bundle", newGroup.A01);
            newGroup.A02.putBoolean("include_captions", newGroup.getIntent().getBooleanExtra("include_captions", false));
            newGroup.A02.putString("appended_message", newGroup.getIntent().getStringExtra("appended_message"));
        }
        newGroup.A05.A0H(new C80293vA(newGroup, r3, 7));
    }

    public void Bj9() {
        Log.i("newgroup/CreateGroupResponseHandler/onTimeout");
        super.Bj9();
        C80253v6.A00(this.A00.A05, this, 16);
    }
}
