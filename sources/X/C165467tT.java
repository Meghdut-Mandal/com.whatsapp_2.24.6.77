package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7tT  reason: invalid class name and case insensitive filesystem */
public class C165467tT implements C236119d {
    public Object A00;
    public Object A01;
    public final int A02;

    public C165467tT(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BVN(String str) {
        switch (this.A02) {
            case 0:
                return;
            case 1:
                C36321k7.A1Q("LocationSubscriptionSendMethods/subscribe/onDeliveryFailure; iqId=", str, AnonymousClass000.A0u());
                return;
            default:
                Log.i("PushXmppMethod/SetClientConfig delivery fail");
                C159677jk r0 = (C159677jk) this.A00;
                if (r0 != null) {
                    r0.BXH();
                    return;
                }
                return;
        }
    }

    public void BWw(C203399nx r5, String str) {
        switch (this.A02) {
            case 0:
                int A002 = AnonymousClass3ME.A00(r5);
                Iterator A13 = C90514aH.A13(this.A01);
                while (A13.hasNext()) {
                    C20320xN.A00((C20320xN) this.A00, (DeviceJid) A13.next(), A002);
                }
                return;
            case 1:
                int A003 = AnonymousClass3ME.A00(r5);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("LocationSubscriptionSendMethods/subscribe/onError; iqId=");
                A0u.append(str);
                C36321k7.A1T(", error=", A0u, A003);
                C36321k7.A1S("locationssubscriberesponsehandler/error ", AnonymousClass000.A0u(), A003);
                return;
            default:
                AnonymousClass00C.A0D(r5, 1);
                int A004 = AnonymousClass3ME.A00(r5);
                C36321k7.A1S("PushXmppMethod/clientConfigSetError/", AnonymousClass000.A0u(), A004);
                if (A004 == 409) {
                    RegistrationIntentService.A02(((C31081bF) this.A01).A00.A00);
                }
                C159677jk r0 = (C159677jk) this.A00;
                if (r0 != null) {
                    r0.BXH();
                    return;
                }
                return;
        }
    }

    public void BiM(C203399nx r21, String str) {
        int i;
        C203399nx r3 = r21;
        switch (this.A02) {
            case 0:
                List A0j = r3.A0d("list").A0j(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                Collections.sort(A0j, AnonymousClass76C.A00);
                Iterator it = A0j.iterator();
                while (it.hasNext()) {
                    C203399nx A0s = C36431kI.A0s(it);
                    DeviceJid deviceJid = (DeviceJid) A0s.A0Y(DeviceJid.class, "jid");
                    C203399nx A0c = A0s.A0c("error");
                    if (A0c != null) {
                        C20320xN.A00((C20320xN) this.A00, deviceJid, A0c.A0R("code"));
                    } else {
                        C203399nx A0d = A0s.A0d("identity");
                        C203399nx A0d2 = A0s.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        C203399nx A0c2 = A0s.A0c("device-identity");
                        byte[] bArr = A0d2.A01;
                        if (bArr == null || bArr.length != 1) {
                            throw new C235919b("type node should contain exactly 1 byte");
                        }
                        C20320xN r1 = (C20320xN) this.A00;
                        if (((AnonymousClass189) r1.A04.get()).A0X()) {
                            r1.A00.Boy(new AnonymousClass753(A0c2, this, A0d, deviceJid, A0d2, 12));
                        } else {
                            ((AnonymousClass187) r1.A05.get()).A00.execute(new AnonymousClass753(A0c2, this, A0d, deviceJid, A0d2, 13));
                        }
                    }
                }
                return;
            case 1:
                C36321k7.A1Q("LocationSubscriptionSendMethods/subscribe/onSuccess; iqId=", str, AnonymousClass000.A0u());
                int i2 = 0;
                C203399nx A0b = r3.A0b(0);
                if (A0b != null) {
                    String A0x = C36391kE.A0x(A0b, "duration");
                    if (A0x != null) {
                        i = Integer.parseInt(A0x);
                    } else {
                        i = 0;
                    }
                    C203399nx A0b2 = A0b.A0b(0);
                    if (A0b2 != null) {
                        List A0j2 = A0b2.A0j("participant");
                        ArrayList A0r = C36361kB.A0r(A0j2);
                        Iterator it2 = A0j2.iterator();
                        while (it2.hasNext()) {
                            A0r.add(C36431kI.A0s(it2).A0X(UserJid.class, "jid"));
                        }
                        AnonymousClass1PA r5 = (AnonymousClass1PA) this.A00;
                        AnonymousClass1P5 r8 = (AnonymousClass1P5) r5.A02.get();
                        AnonymousClass11F r9 = ((C1259561z) this.A01).A00;
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("LocationSharingManager/onReceiveServerSharingList; jid=");
                        A0u.append(r9);
                        A0u.append("; participants.size=");
                        C36321k7.A1Y(A0u, A0r.size());
                        HashSet A16 = C36441kJ.A16();
                        synchronized (r8.A0Q) {
                            Map A05 = AnonymousClass1P5.A05(r8);
                            Map A15 = C90514aH.A15(r9, A05);
                            if (A15 != null) {
                                A16.addAll(A15.keySet());
                                A16.removeAll(C90524aI.A0k(A0r));
                                HashSet A162 = C36441kJ.A16();
                                Iterator it3 = A16.iterator();
                                while (it3.hasNext()) {
                                    UserJid A0o = C36441kJ.A0o(it3);
                                    AnonymousClass1P5.A0D(r8, (AnonymousClass375) A15.remove(A0o));
                                    A162.add(A0o);
                                }
                                AnonymousClass1P9.A01(r9, r8.A0K, A162, false);
                                if (A15.isEmpty()) {
                                    A05.remove(r9);
                                }
                                if (!A16.isEmpty()) {
                                    AnonymousClass1P5.A0F(r8, A05);
                                }
                            }
                        }
                        Iterator it4 = A16.iterator();
                        while (it4.hasNext()) {
                            UserJid A0o2 = C36441kJ.A0o(it4);
                            for (AnonymousClass4U8 BeJ : r8.A0U) {
                                BeJ.BeJ(r9, A0o2);
                            }
                        }
                        if (!A16.isEmpty()) {
                            AnonymousClass1P5.A0B(r8);
                        }
                        Log.i("locationssubscriberesponsehandler/subscription list updated");
                        Iterator it5 = A0j2.iterator();
                        while (it5.hasNext()) {
                            C203399nx A0s2 = C36431kI.A0s(it5);
                            UserJid userJid = (UserJid) A0s2.A0X(UserJid.class, "jid");
                            C203399nx A0b3 = A0s2.A0b(0);
                            if (A0b3 != null) {
                                C36321k7.A1K(userJid, "LocationSubscriptionSendMethods/subscribe/handleLocationUpdate; from=", AnonymousClass000.A0u());
                                C203399nx A0b4 = A0b3.A0b(0);
                                if (A0b4 == null || !"enc".equals(A0b4.A00)) {
                                    throw new C235919b("invalid location node");
                                }
                                AnonymousClass630 A002 = C111475cL.A00(A0b4);
                                String A0x2 = C36391kE.A0x(A0b3, "elapsed");
                                long j = 0;
                                if (A0x2 != null) {
                                    j = (long) Integer.parseInt(A0x2);
                                }
                                ((C30221Zr) r5.A03.get()).A00(userJid, A002, j);
                            }
                        }
                    }
                    i2 = i;
                }
                ((C1259561z) this.A01).A00(i2 * 1000);
                return;
            default:
                Log.i("PushXmppMethod/read/client_config_set");
                C159677jk r0 = (C159677jk) this.A00;
                if (r0 != null) {
                    r0.onSuccess();
                    return;
                }
                return;
        }
    }
}
