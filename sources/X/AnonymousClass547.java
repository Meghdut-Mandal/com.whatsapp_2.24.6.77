package X;

import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.547  reason: invalid class name */
public class AnonymousClass547 extends C68733cN {
    public Intent A00;
    public final /* synthetic */ VoipActivityV2 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass547(C100804vn r1, VoipActivityV2 voipActivityV2) {
        super(r1);
        this.A01 = voipActivityV2;
    }

    public void A02() {
        String str;
        List list;
        CallInfo A012;
        UserJid A0l;
        VoipActivityV2 voipActivityV2 = this.A01;
        VoipActivityV2.A0z(voipActivityV2);
        Intent intent = this.A00;
        boolean A0E = voipActivityV2.A0D.A0E(5411);
        List list2 = null;
        if (intent != null) {
            if (!A0E) {
                String stringExtra = intent.getStringExtra("contact");
                if (!(stringExtra == null || (A0l = C36431kI.A0l(stringExtra)) == null)) {
                    list = C36371kC.A11(A0l);
                }
            } else {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("jids");
                if (stringArrayListExtra != null) {
                    ArrayList A0I = AnonymousClass001.A0I();
                    Iterator<String> it = stringArrayListExtra.iterator();
                    while (it.hasNext()) {
                        UserJid A0l2 = C36431kI.A0l(AnonymousClass001.A0C(it));
                        if (A0l2 != null) {
                            A0I.add(A0l2);
                        }
                    }
                    list = A0I;
                }
            }
            boolean isEmpty = list.isEmpty();
            list2 = list;
            if (!isEmpty) {
                if (!A0E) {
                    C18740tg.A0D(AnonymousClass000.A1O(list.size()), "You can't invite more than one user when multiselect is off");
                    VoipActivityV2.A0o((UserJid) list.get(0), voipActivityV2, false);
                    VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = voipActivityV2.A1a;
                    if (voipCallControlBottomSheetV2 != null) {
                        UserJid userJid = (UserJid) list.get(0);
                        C95894mS r0 = voipCallControlBottomSheetV2.A0M;
                        if (r0 != null) {
                            r0.A0O(userJid);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!list.isEmpty() && voipActivityV2.A0r != null && (A012 = VoipActivityV2.A01(voipActivityV2)) != null && A012.callState != CallState.NONE) {
                    if (voipActivityV2.A0D.A0E(5633)) {
                        AnonymousClass6YM r4 = voipActivityV2.A0r;
                        C18740tg.A0D(C36401kF.A1a(list), "voip/invite: Empty list of peers to invite");
                        r4.A1E.execute(new AnonymousClass755(r4, list, A012, 5, false));
                        return;
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        voipActivityV2.A0r.A0Y(C36441kJ.A0o(it2), A012, false);
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoipActivityV2/handlePickerDismiss/");
        if (list2 == null) {
            str = "null";
        } else {
            str = "empty";
        }
        A0u.append(str);
        C36341k9.A1O(A0u, " user list");
    }

    public void A03(Intent intent) {
        this.A00 = intent;
    }
}
