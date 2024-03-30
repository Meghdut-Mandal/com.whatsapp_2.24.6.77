package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1vu  reason: invalid class name and case insensitive filesystem */
public final class C40661vu extends AnonymousClass0CZ {
    public List A00 = C023409w.A00;
    public final C18820ts A01;
    public final C220412q A02;
    public final C006302t A03;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View inflate = C36341k9.A0J(viewGroup, 0).inflate(R.layout.f9nameremoved, viewGroup, false);
        ImageView A0N = C36391kE.A0N(inflate, R.id.right_arrow_icon);
        C36321k7.A0L(A0N.getContext(), A0N, this.A01, R.drawable.ic_fab_next);
        return new C42291ya(inflate);
    }

    public int A0J() {
        return this.A00.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        if (r3.B8g().A06(com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.A06, "state") == com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.A03) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r11, int r12) {
        /*
            r10 = this;
            X.1ya r11 = (X.C42291ya) r11
            r4 = 0
            X.AnonymousClass00C.A0D(r11, r4)
            java.util.List r0 = r10.A00
            java.lang.Object r3 = r0.get(r12)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse r3 = (com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse) r3
            android.content.Context r5 = X.C36441kJ.A0F(r11)
            X.0ts r2 = r10.A01
            r8 = r3
            X.9Y8 r8 = (X.AnonymousClass9Y8) r8
            org.json.JSONObject r0 = r8.A00
            java.lang.String r7 = "creation_time"
            java.lang.String r0 = r0.optString(r7)
            java.lang.String r9 = X.C36371kC.A0w(r2, r0)
            X.12q r0 = r10.A02
            java.lang.String r1 = X.AnonymousClass3RJ.A00(r0, r3)
            r6 = 1
            if (r1 == 0) goto L_0x00ac
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00ac
            com.whatsapp.WaTextView r0 = r11.A03
            r0.setVisibility(r4)
            r0.setText(r1)
        L_0x003a:
            X.AnonymousClass00C.A0D(r3, r4)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            java.lang.Enum r1 = r8.A06(r1, r0)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.PENDING
            if (r1 == r0) goto L_0x005a
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r8 = r3.B8g()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "state"
            java.lang.Enum r8 = r8.A06(r1, r0)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.PENDING
            r0 = 0
            if (r8 != r1) goto L_0x005b
        L_0x005a:
            r0 = 1
        L_0x005b:
            com.whatsapp.WaImageView r1 = r11.A01
            if (r0 == 0) goto L_0x00a0
            r0 = 2131234250(0x7f080dca, float:1.808466E38)
            r1.setImageResource(r0)
            com.whatsapp.WaTextView r1 = r11.A04
            r0 = 2131891528(0x7f121548, float:1.9417779E38)
        L_0x006a:
            r1.setText(r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r3.B8g()
            java.lang.String r0 = r0.A07(r7)
            if (r0 == 0) goto L_0x009a
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r3.B8g()
            java.lang.String r0 = r0.A07(r7)
            X.C18740tg.A06(r0)
            java.lang.String r9 = X.C36371kC.A0w(r2, r0)
            com.whatsapp.WaTextView r2 = r11.A02
            r1 = 2131891531(0x7f12154b, float:1.9417785E38)
        L_0x008b:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r9
            X.C36341k9.A0s(r5, r2, r0, r1)
            android.view.ViewGroup r1 = r11.A00
            r0 = 23
            X.AnonymousClass3YH.A00(r1, r10, r3, r0)
            return
        L_0x009a:
            com.whatsapp.WaTextView r2 = r11.A02
            r1 = 2131891530(0x7f12154a, float:1.9417783E38)
            goto L_0x008b
        L_0x00a0:
            r0 = 2131234101(0x7f080d35, float:1.8084358E38)
            r1.setImageResource(r0)
            com.whatsapp.WaTextView r1 = r11.A04
            r0 = 2131891529(0x7f121549, float:1.941778E38)
            goto L_0x006a
        L_0x00ac:
            com.whatsapp.WaTextView r1 = r11.A03
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40661vu.BSE(X.0D3, int):void");
    }

    public C40661vu(C18820ts r2, C220412q r3, C006302t r4) {
        C36321k7.A0x(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
