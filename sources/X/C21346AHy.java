package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AHy  reason: case insensitive filesystem */
public final class C21346AHy implements C236119d {
    public final /* synthetic */ C188508zh A00;
    public final /* synthetic */ AnonymousClass3K1 A01;
    public final /* synthetic */ AnonymousClass39D A02;
    public final /* synthetic */ C023509x A03;

    public void BWw(C203399nx r8, String str) {
        C188458zc r1;
        AnonymousClass00C.A0D(r8, 1);
        int A002 = C203399nx.A00(r8.A0d("error"), "code");
        C023509x r5 = this.A03;
        C188458zc[] values = C188458zc.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r1 = C188458zc.DEFAULT;
                break;
            }
            r1 = values[i];
            if (r1.code == A002) {
                break;
            }
            i++;
        }
        r5.resumeWith(new ACZ(r1));
    }

    public void BiM(C203399nx r8, String str) {
        C023509x r1;
        Object obj;
        C188538zk r3;
        AnonymousClass00C.A0D(r8, 1);
        Jid A0Y = r8.A0Y(GroupJid.class, "from");
        AnonymousClass3K1 r6 = this.A01;
        boolean A0J = AnonymousClass00C.A0J(A0Y, r6.A01);
        C18740tg.A0D(A0J, "Group Jid in request and response don't match.");
        if (A0J) {
            C203399nx A0d = r8.A0d("membership_requests_action").A0d(this.A00.value).A0d("participant");
            UserJid userJid = (UserJid) A0d.A0Y(UserJid.class, "jid");
            PhoneUserJid phoneUserJid = (PhoneUserJid) A0d.A0X(PhoneUserJid.class, "phone_number");
            if (AnonymousClass143.A0I(userJid) && phoneUserJid != null) {
                this.A02.A03.A00((C223313w) userJid, phoneUserJid);
            }
            boolean A0J2 = AnonymousClass00C.A0J(userJid, r6.A04);
            C18740tg.A0D(A0J2, "Requester Jid in request and response don't match.");
            if (A0J2) {
                String A0x = C36391kE.A0x(A0d, "error");
                if (A0x == null) {
                    r1 = this.A03;
                    obj = C21194ACc.A00;
                    r1.resumeWith(obj);
                }
                int parseInt = Integer.parseInt(A0x);
                C188538zk[] values = C188538zk.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        r3 = C188538zk.A02;
                        break;
                    }
                    r3 = values[i];
                    if (r3.value == parseInt) {
                        break;
                    }
                    i++;
                }
                AnonymousClass39D r2 = this.A02;
                C80403vL.A01(r2.A04, r3, r6, r2, 41);
                this.A03.resumeWith(new C21192ACa(r3));
                return;
            }
        }
        r1 = this.A03;
        obj = C21193ACb.A00;
        r1.resumeWith(obj);
    }

    public C21346AHy(C188508zh r1, AnonymousClass3K1 r2, AnonymousClass39D r3, C023509x r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void BVN(String str) {
        this.A03.resumeWith(C21193ACb.A00);
    }
}
