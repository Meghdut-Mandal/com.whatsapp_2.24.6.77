package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl;
import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.8fT  reason: invalid class name */
public final class AnonymousClass8fT extends C68993cn {
    public C159607jd A00;
    public String A01;
    public final C19730wQ A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final AnonymousClass12O A05;
    public final long A06;
    public final C28981Uw A07;
    public final Integer A08;

    public /* bridge */ /* synthetic */ void A02(AnonymousClass9Y8 r19) {
        C23931Ak A042;
        String str;
        long j;
        AnonymousClass141 r13;
        AnonymousClass141 A082;
        String A0J;
        AnonymousClass9Y8 r2 = r19;
        AnonymousClass00C.A0D(r2, 0);
        if (!this.A01) {
            LinkedHashMap A1G = C36431kI.A1G();
            AnonymousClass9Y8 A032 = r2.A03(NewsletterPollVoterListResponseImpl.Xwa2NewslettersPollVoterList.class, "xwa2_newsletters_poll_voter_list");
            if (!(A032 == null || (A042 = A032.A04(NewsletterPollVoterListResponseImpl.Xwa2NewslettersPollVoterList.Votes.class, "votes")) == null)) {
                Iterator it = A042.iterator();
                while (it.hasNext()) {
                    AnonymousClass9Y8 A0C = C165617ti.A0C(it);
                    String A10 = C36411kG.A10("vote_hash", A0C.A00);
                    C23931Ak A043 = A0C.A03(NewsletterPollVoterListResponseImpl.Xwa2NewslettersPollVoterList.Votes.VoterList.class, "voter_list").A04(NewsletterPollVoterListResponseImpl.Xwa2NewslettersPollVoterList.Votes.VoterList.Edges.class, "edges");
                    ArrayList A13 = C36411kG.A13(A043);
                    Iterator it2 = A043.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass9Y8 A0C2 = C165617ti.A0C(it2);
                        String A022 = AnonymousClass9Y8.A02(A0C2.A03(NewsletterPollVoterListResponseImpl.Xwa2NewslettersPollVoterList.Votes.VoterList.Edges.Node.class, "node"));
                        if (A022 != null) {
                            str = AnonymousClass098.A05(A022, "@lid", "", false);
                        } else {
                            str = null;
                        }
                        String A072 = A0C2.A07("action_time");
                        if (A072 != null) {
                            j = Long.parseLong(A072);
                        } else {
                            j = 0;
                        }
                        C223313w A012 = C223313w.A01.A01(str);
                        if (A012 != null) {
                            AnonymousClass12O r6 = this.A05;
                            if (!this.A02.A0M(r6.A0A(A012))) {
                                PhoneUserJid A0A = r6.A0A(A012);
                                if (A0A != null) {
                                    r13 = this.A03.A08(A0A);
                                } else {
                                    r13 = null;
                                }
                                String str2 = null;
                                if (r13 == null || ((A0J = r13.A0J()) == null && (A0J = r13.A0a) == null)) {
                                    PhoneUserJid A0A2 = r6.A0A(A012);
                                    if (A0A2 == null || (A082 = this.A03.A08(A0A2)) == null || !A082.A0B() || (str2 = this.A04.A0H(A082)) == null) {
                                        r13 = null;
                                    }
                                } else {
                                    str2 = A0J;
                                }
                                A13.add(new AnonymousClass6CR(r13, A012, str2, j));
                            }
                        }
                    }
                    A1G.put(A10, C007103b.A0c(A13, new C163907qx(16)));
                }
            }
            C159607jd r0 = this.A00;
            if (r0 != null) {
                r0.BiH(A1G);
            }
        }
    }

    public boolean A04(C201259jD r4) {
        C159607jd r1;
        AnonymousClass00C.A0D(r4, 0);
        if (!this.A01 && (r1 = this.A00) != null) {
            r1.onError(C1900696t.A00(r4));
        }
        return false;
    }

    public AnonymousClass9JF A00() {
        NewsletterPollVoterListQueryImpl$Builder newsletterPollVoterListQueryImpl$Builder = new NewsletterPollVoterListQueryImpl$Builder();
        String rawString = this.A07.getRawString();
        AnonymousClass9VA r3 = newsletterPollVoterListQueryImpl$Builder.A00;
        newsletterPollVoterListQueryImpl$Builder.A01 = C36341k9.A1Y(r3, "jid", rawString);
        newsletterPollVoterListQueryImpl$Builder.A02 = C36341k9.A1Y(r3, "serverId", String.valueOf(this.A06));
        Integer num = this.A08;
        if (num != null) {
            AnonymousClass84G.A00(r3.A00.A02(), num, "limit");
        }
        String str = this.A01;
        if (str != null) {
            r3.A02("vote_hash", str);
        }
        C20740y5.A06(newsletterPollVoterListQueryImpl$Builder.A01);
        C20740y5.A06(newsletterPollVoterListQueryImpl$Builder.A02);
        return new AnonymousClass9JF(r3, NewsletterPollVoterListResponseImpl.class, "NewsletterPollVoterList");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8fT(C19730wQ r2, AnonymousClass16D r3, AnonymousClass171 r4, AnonymousClass12O r5, C27591Ow r6, C28981Uw r7, AnonymousClass4OL r8, C159607jd r9, C19770wU r10, Integer num, String str, long j) {
        super(r6, r8, r10);
        C36321k7.A18(r2, r5, r4, r3);
        AnonymousClass00C.A0D(r10, 10);
        C36341k9.A1G(r6, r8);
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
        this.A07 = r7;
        this.A06 = j;
        this.A08 = num;
        this.A01 = str;
        this.A00 = r9;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
