package X;

import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7tV  reason: invalid class name and case insensitive filesystem */
public class C165487tV implements C236119d {
    public Object A00;
    public Object A01;
    public final int A02;

    public C165487tV(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BVN(String str) {
        Object A002;
        switch (this.A02) {
            case 0:
                AnonymousClass00C.A0D(str, 0);
                ((AnonymousClass777) this.A00).BVM(new C52812qD(str));
                return;
            case 1:
                Log.e("EncryptionProtocolHelper failed with a server error");
                ((C160047kN) this.A01).BVK();
                return;
            case 2:
                ((C160067kP) this.A01).BVM(new C52812qD(str));
                return;
            case 3:
                C36321k7.A1P("fpm/ChatTransferProtocolHelper/sendSetFirstPartyMigrationIntentIq/onDeliveryFailure id=", str, AnonymousClass000.A0u());
                ((C159587jb) this.A01).BWY();
                return;
            case 4:
                C36341k9.A19((C001600r) this.A00, false);
                return;
            default:
                Log.e("DisclosureResultSendWorker/onDeliveryFailure");
                int i = ((C128916Ec) this.A00).A01.A00;
                AnonymousClass0UQ r1 = (AnonymousClass0UQ) this.A01;
                if (i > 4) {
                    A002 = C97334ow.A00();
                } else {
                    A002 = C97324ov.A00();
                }
                r1.A00(A002);
                return;
        }
    }

    public void BWw(C203399nx r5, String str) {
        Object A002;
        switch (this.A02) {
            case 0:
                C36321k7.A0w(str, r5);
                ((AnonymousClass777) this.A00).BVM(new AnonymousClass5V6(r5, str));
                return;
            case 1:
                Log.e("EncryptionProtocolHelper failed with a server error");
                ((C160047kN) this.A01).BWj(new AnonymousClass5V6(r5, str));
                return;
            case 2:
                ((AnonymousClass6CN) this.A00).A01.A0E("BaseFetchCertificateProtocolHelper failed with a server error", (String) null, false);
                ((C160067kP) this.A01).BWk(new AnonymousClass5V6(r5, str));
                return;
            case 3:
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("fpm/ChatTransferProtocolHelper/sendSetFirstPartyMigrationIntentIq/onError id=");
                A0u.append(str);
                C36321k7.A1J(r5, ", node=", A0u);
                ((C159587jb) this.A01).BWY();
                return;
            case 4:
                C36341k9.A19((C001600r) this.A00, false);
                return;
            default:
                Pair A012 = AnonymousClass3ME.A01(r5);
                C36321k7.A1J(A012, "disclosureresultsendWorker/onError ", AnonymousClass000.A0u());
                if (A012 != null && C36381kD.A04(A012) == 400) {
                    Log.i("disclosusreresultsendworker/onError invalid stanza");
                }
                int i = ((C128916Ec) this.A00).A01.A00;
                AnonymousClass0UQ r1 = (AnonymousClass0UQ) this.A01;
                if (i > 4) {
                    A002 = C97334ow.A00();
                } else {
                    A002 = C97324ov.A00();
                }
                r1.A00(A002);
                return;
        }
    }

    public void BiM(C203399nx r15, String str) {
        C235919b r1;
        Integer num;
        String A0e;
        switch (this.A02) {
            case 0:
                AnonymousClass00C.A0D(r15, 1);
                AnonymousClass147 r7 = (AnonymousClass147) r15.A0Y(AnonymousClass147.class, "from");
                List A0j = r15.A0d("membership_approval_requests").A0j("membership_approval_request");
                AnonymousClass00C.A08(A0j);
                ArrayList A0J = C36321k7.A0J(A0j);
                Iterator it = A0j.iterator();
                while (it.hasNext()) {
                    C203399nx A0s = C36431kI.A0s(it);
                    String A0h = A0s.A0h("request_method");
                    String A002 = C181468nW.A00(A0h);
                    if (A002 != null) {
                        A0J.add(new AnonymousClass3K1(r7, (AnonymousClass147) null, (UserJid) A0s.A0Y(UserJid.class, "jid"), (UserJid) null, A002, A0s.A0V("request_time", 0)));
                    } else {
                        throw new C235919b(AnonymousClass000.A0p("GetAllGroupMembershipApprovalRequestsApiHandler/onSuccess/incorrect membership_approval_request.requestMethod=", A0h, AnonymousClass000.A0u()));
                    }
                }
                AnonymousClass1PF r0 = (AnonymousClass1PF) this.A01;
                r0.A01(r7);
                r0.A03(A0J);
                ((AnonymousClass777) this.A00).BVO((Object) null);
                return;
            case 1:
                C122515uy A003 = C131116Nu.A00(r15);
                C203399nx A0c = r15.A0c("tos_id");
                Integer num2 = null;
                if (!(A0c == null || (A0e = A0c.A0e()) == null)) {
                    num2 = Integer.valueOf(Integer.parseInt(A0e));
                }
                ((C160047kN) this.A01).BiS(A003, num2);
                return;
            case 2:
                try {
                    AnonymousClass6CN r12 = (AnonymousClass6CN) this.A00;
                    C160067kP r3 = (C160067kP) this.A01;
                    C203399nx A0d = r15.A0d("reply");
                    if ((r12 instanceof AnonymousClass57S) || (r12 instanceof AnonymousClass57T) || (r12 instanceof AnonymousClass57R) || (r12 instanceof AnonymousClass57Q)) {
                        A0d.A0d("password_pem");
                    }
                    String str2 = null;
                    String A0i = A0d.A0i("algorithm", (String) null);
                    if (A0i == null) {
                        A0i = "rsa2048";
                    }
                    C203399nx A0d2 = A0d.A0d("encryption_pem");
                    C203399nx A0d3 = A0d.A0d("signature_pem");
                    String A0e2 = A0d2.A0e();
                    if (A0e2 != null) {
                        String A0e3 = A0d3.A0e();
                        if (A0e3 != null) {
                            C203399nx A0c2 = A0d.A0c("password_pem");
                            String str3 = null;
                            if (A0c2 != null) {
                                str3 = A0c2.A0e();
                                if (!TextUtils.isEmpty(str3)) {
                                    str2 = A0c2.A0h("key_id");
                                    try {
                                        num = Integer.valueOf(A0c2.A0h("ttl"));
                                    } catch (NumberFormatException e) {
                                        r1 = new C235919b((Throwable) e);
                                    }
                                } else {
                                    r1 = new C235919b("empty key");
                                }
                            } else {
                                num = null;
                            }
                            r3.BiU(num, A0i, A0e2, A0e3, str3, str2);
                            return;
                        }
                        r1 = new C235919b("missing sig");
                    } else {
                        r1 = new C235919b("missing cert");
                    }
                    throw r1;
                } catch (C235919b e2) {
                    ((C160067kP) this.A01).BWk(e2);
                    throw e2;
                }
            case 3:
                C36321k7.A1Q("fpm/ChatTransferProtocolHelper/sendSetFirstPartyMigrationIntentIq/onSuccess id=", str, AnonymousClass000.A0u());
                ((C159587jb) this.A01).onSuccess();
                return;
            case 4:
                AnonymousClass00C.A0D(r15, 1);
                AnonymousClass6FH r4 = (AnonymousClass6FH) this.A01;
                C203399nx A0c3 = r15.A0d("privacy").A0c("list");
                if (A0c3 != null) {
                    HashSet A16 = C36441kJ.A16();
                    String A0x = C36391kE.A0x(A0c3, "dhash");
                    Iterator it2 = A0c3.A0j(PublicKeyCredentialControllerUtility.JSON_KEY_USER).iterator();
                    while (it2.hasNext()) {
                        A16.add(C36431kI.A0s(it2).A0Y(UserJid.class, "jid"));
                    }
                    AnonymousClass6AU r02 = new AnonymousClass6AU(A0x, A16);
                    r4.A05(r02.A00, r02.A01, false);
                }
                C36341k9.A19((C001600r) this.A00, true);
                return;
            default:
                Log.i("disclosuresendworker/onsuccess");
                C203399nx A0c4 = r15.A0c("trackable");
                if (A0c4 != null) {
                    A0c4.A0R("result");
                }
                ((AnonymousClass0UQ) this.A01).A00(C97344ox.A00());
                return;
        }
    }
}
