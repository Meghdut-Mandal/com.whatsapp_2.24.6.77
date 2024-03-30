package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Tp  reason: invalid class name and case insensitive filesystem */
public class C65823Tp implements C236119d {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C65823Tp(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A01 = obj;
    }

    public void BVN(String str) {
        int i = this.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i != 0) {
            C36321k7.A1Q("GroupXmppMethods/sendJoinGroupByCode/onDeliveryFailure; iq=", str, A0u);
            C36321k7.A0R((C170888Hw) this.A01, "joinGroupByCode IQ was not delivered: iq=", str, AnonymousClass000.A0u());
            return;
        }
        C36321k7.A1Q("GroupXmppMethods/sendRevokeGroupInvites/onDeliveryFailure; iq=", str, A0u);
        C36321k7.A0R((C170888Hw) this.A01, "sendRevokeGroupInvites IQ was not delivered: iq=", str, AnonymousClass000.A0u());
    }

    public void BWw(C203399nx r3, String str) {
        if (this.A04 != 0) {
            ((AnonymousClass4RS) this.A02).Bou(AnonymousClass3ME.A00(r3));
        } else {
            AnonymousClass32N r0 = (AnonymousClass32N) this.A03;
            if (r0 != null) {
                r0.A00.A00 = AnonymousClass3ME.A00(r3);
            }
        }
        C36381kD.A1J(this.A01);
    }

    public void BiM(C203399nx r9, String str) {
        C87944Qu r3;
        Jid A0X;
        int i;
        if (this.A04 != 0) {
            C203399nx A0a = r9.A0a();
            String str2 = A0a.A00;
            if ("group".equals(str2)) {
                r3 = (C87944Qu) this.A03;
                A0X = A0a.A0X(AnonymousClass147.class, "jid");
                i = 0;
            } else if ("membership_approval_request".equals(str2)) {
                r3 = (C87944Qu) this.A03;
                A0X = A0a.A0X(AnonymousClass147.class, "jid");
                i = 1;
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Connection/sendJoinGroupByCode unrecognized node:");
                A0u.append(r9);
                C235919b r1 = new C235919b(AnonymousClass000.A0p(" tag:", str2, A0u));
                ((C170888Hw) this.A01).A04((Object) null);
                throw r1;
            }
            r3.Bow(A0X, i);
            ((C170888Hw) this.A01).A04((Object) null);
            return;
        }
        C227315o r32 = new C227315o();
        C20090x0 r2 = new C20090x0();
        List A0j = r9.A0d("revoke").A0j("participant");
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = A0j.iterator();
        while (it.hasNext()) {
            C203399nx A0s = C36431kI.A0s(it);
            Jid A0X2 = A0s.A0X(UserJid.class, "jid");
            Jid A0X3 = A0s.A0X(PhoneUserJid.class, "phone_number");
            if (AnonymousClass143.A0I(A0X2) && A0X3 != null) {
                A0J.put(A0X2, A0X3);
            }
            String A0x = C36391kE.A0x(A0s, "error");
            if (A0X2 != null) {
                if (A0x != null) {
                    try {
                        r2.put(A0X2, Integer.valueOf(Integer.parseInt(A0x)));
                    } catch (Exception unused) {
                    }
                } else {
                    r32.add((Object) A0X2);
                }
            }
        }
        if (!A0J.isEmpty()) {
            ((AnonymousClass1PE) ((C20510xg) this.A00).A0D.get()).A01(A0J);
        }
        C20760y7 build = r32.build();
        C20070wy build2 = r2.build();
        C20350xQ A0d = C36431kI.A0d((C20510xg) this.A00);
        A0d.A12.Boy(new C35371ia(A0d, this.A02, build, build2, 17));
        AnonymousClass32N r0 = (AnonymousClass32N) this.A03;
        if (r0 != null) {
            C50182kL r02 = r0.A00;
            r02.A02 = build;
            r02.A01 = build2;
        }
        C36381kD.A1J(this.A01);
    }
}
