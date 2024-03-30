package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3TH  reason: invalid class name */
public class AnonymousClass3TH implements C236119d {
    public Object A00;
    public final int A01;

    public AnonymousClass3TH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BVN(String str) {
        switch (this.A01) {
            case 1:
                C36321k7.A1P("BroadcastXmppMethods/sendGetBroadcastLists/onDeliveryFailure: iq=", str, AnonymousClass000.A0u());
                return;
            case 3:
                Log.i("clientActionLog/SetClientConfig delivery fail");
                ((C592333d) ((C10810fG) this.A00).element).A00 = -2;
                return;
            default:
                return;
        }
    }

    public void BWw(C203399nx r5, String str) {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                C36321k7.A1P("BroadcastXmppMethods/sendGetBroadcastLists/onError: iq=", str, AnonymousClass000.A0u());
                return;
            case 2:
                JniBridge.jvidispatchIOO(2, str, r5);
                return;
            default:
                AnonymousClass00C.A0D(r5, 1);
                int A002 = AnonymousClass3ME.A00(r5);
                C36321k7.A1S("clientActionLog/clientConfigSetError/", AnonymousClass000.A0u(), A002);
                ((C592333d) ((C10810fG) this.A00).element).A00 = -1;
                AnonymousClass00C.A0D(AnonymousClass000.A0r("clientActionLog/clientConfigSetError/", AnonymousClass000.A0u(), A002), 0);
                return;
        }
    }

    public void BiM(C203399nx r16, String str) {
        String A0y;
        C203399nx r3 = r16;
        String str2 = str;
        switch (this.A01) {
            case 0:
                C203399nx A0a = r3.A0a();
                C203399nx.A0A(A0a, "disappearing_mode");
                ((C27371Ny) this.A00).A04.A05(A0a.A0R("duration"), A0a.A0U("t") * 1000);
                return;
            case 1:
                C36321k7.A1Q("BroadcastXmppMethods/sendGetBroadcastLists/onSuccess: iq=", str2, AnonymousClass000.A0u());
                C203399nx A0c = r3.A0c("lists");
                if (A0c != null) {
                    Iterator it = A0c.A0j("list").iterator();
                    while (it.hasNext()) {
                        C203399nx A0s = C36431kI.A0s(it);
                        C177538dx r10 = (C177538dx) A0s.A0X(C177538dx.class, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        String A0x = C36391kE.A0x(A0s, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        List A0j = A0s.A0j("recipient");
                        Object[] objArr = new UserJid[A0j.size()];
                        int i = 0;
                        Iterator it2 = A0j.iterator();
                        while (it2.hasNext()) {
                            objArr[i] = C36431kI.A0s(it2).A0X(UserJid.class, "jid");
                            i++;
                        }
                        C65913Ty r2 = (C65913Ty) ((C27331Nu) this.A00).A01.get();
                        List asList = Arrays.asList(objArr);
                        AnonymousClass00C.A0D(r10, 0);
                        C36321k7.A0v(A0x, 1, asList);
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("BroadcastListManager/onParticipatingList/jid:");
                        A0u.append(r10);
                        A0u.append("/name:");
                        A0u.append(A0x);
                        A0u.append("/recipients:");
                        Object[] array = asList.toArray(new UserJid[0]);
                        if (array == null) {
                            A0y = "null";
                        } else {
                            int length = array.length;
                            if (length > 429496729) {
                                length = 429496729;
                            }
                            StringBuilder sb = new StringBuilder((length * 5) + 2);
                            AnonymousClass02P.A01(sb, AnonymousClass001.A0I(), array);
                            A0y = C36381kD.A0y(sb);
                        }
                        C36321k7.A1a(A0u, A0y);
                        if (r2.A04.A0M(r10) || r2.A06.A07.containsKey(r10)) {
                            StringBuilder A0v = AnonymousClass000.A0v("BroadcastListManager/onParticipatingList/jid:");
                            A0v.append(r10);
                            C36321k7.A1a(A0v, " already exists");
                        } else {
                            r2.A0B.BJb(C65913Ty.A00(r2, r10, asList), 1);
                        }
                        AnonymousClass16D r9 = r2.A02;
                        if (r9.A08(r10) == null) {
                            r9.A06(r10, A0x, "pn", System.currentTimeMillis());
                        }
                    }
                }
                Log.i("BroadcastListManager/onParticipatingList/onParticipatingListsComplete");
                C36331k8.A0w(C19420v0.A00(((C65913Ty) ((C27331Nu) this.A00).A01.get()).A03), "refresh_broadcast_lists", false);
                return;
            case 2:
                JniBridge.jvidispatchIOO(2, str2, r3);
                return;
            default:
                Log.i("clientActionLog/read/client_config_set");
                return;
        }
    }
}
