package X;

import com.whatsapp.infra.graphql.BaseMexCallback;
import com.whatsapp.infra.graphql.generated.groups.QueryInviteLinkQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.groups.QueryInviteLinkResponseImpl;
import com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput;
import java.lang.ref.WeakReference;

/* renamed from: X.2Wm  reason: invalid class name and case insensitive filesystem */
public class C46332Wm extends BaseMexCallback implements C236119d {
    public final C27591Ow A00;
    public final boolean A01;
    public final AnonymousClass17Y A02;
    public final C20810yC A03;
    public final AnonymousClass19A A04;
    public final WeakReference A05;

    private void A00(String str, int i) {
        Object obj = this.A05.get();
        if (obj != null) {
            this.A02.A0H(new C80523vX(this, obj, str, i, 5));
        }
    }

    public void A07(AnonymousClass147 r12) {
        int i;
        String str;
        if (this.A03.A0E(7908)) {
            XWA2GroupQueryInput xWA2GroupQueryInput = new XWA2GroupQueryInput();
            xWA2GroupQueryInput.A07("group_id", String.valueOf(r12));
            xWA2GroupQueryInput.A07("query_context", "INVITE_CODE");
            AnonymousClass9VA r3 = new QueryInviteLinkQueryImpl$Builder().A00;
            r3.A00(xWA2GroupQueryInput, "group_input");
            C199459fL.A00(this, this.A00.A01(new AnonymousClass9JF(r3, QueryInviteLinkResponseImpl.class, "QueryInviteLink"))).A00();
            return;
        }
        AnonymousClass19A r4 = this.A04;
        String A09 = r4.A09();
        if (this.A01) {
            i = 105;
            str = "set";
        } else {
            i = 106;
            str = "get";
        }
        C203399nx r2 = new C203399nx("invite", (AnonymousClass1AL[]) null);
        AnonymousClass1AL[] r1 = new AnonymousClass1AL[4];
        C36331k8.A1R(A09, r1, 0);
        C36341k9.A1S(r1, 1);
        C36331k8.A1B(r12, str, r1, 2);
        r4.A0E(this, C36391kE.A0m(r2, r1), A09, i, 32000);
    }

    public void BVN(String str) {
        A00((String) null, 0);
    }

    public void BiM(C203399nx r4, String str) {
        C203399nx A0b = r4.A0b(0);
        C203399nx.A0A(A0b, "invite");
        A00(C36391kE.A0x(A0b, "code"), 0);
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass9Y8 r3) {
        String A07;
        AnonymousClass9Y8 A032 = r3.A03(QueryInviteLinkResponseImpl.Xwa2GroupQueryById.class, "xwa2_group_query_by_id");
        if (A032 == null) {
            A07 = null;
        } else {
            A07 = A032.A07("invite_code");
        }
        A00(A07, 0);
    }

    public C46332Wm(AnonymousClass17Y r2, C20810yC r3, C87884Qn r4, C27591Ow r5, AnonymousClass19A r6, boolean z) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r6;
        this.A00 = r5;
        this.A05 = AnonymousClass001.A0F(r4);
        this.A01 = z;
    }

    public boolean A06(C201259jD r3) {
        A00((String) null, r3.A00().B9n());
        return false;
    }

    public void BWw(C203399nx r3, String str) {
        A00((String) null, AnonymousClass3ME.A00(r3));
    }
}
