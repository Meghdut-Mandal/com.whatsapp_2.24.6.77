package com.whatsapp.product.newsletterenforcements.userreports.detail;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1RJ;
import X.C18820ts;
import X.C20810yC;
import X.C220412q;
import X.C27731Pn;
import X.C32681e1;
import X.C33751fs;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesDecisionProcessBottomSheet;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;

public final class NewsletterUserReportDetailFragment extends Hilt_NewsletterUserReportDetailFragment {
    public C27731Pn A00;
    public C33751fs A01;
    public C18820ts A02;
    public C220412q A03;
    public C20810yC A04;
    public NewsletterUserReportsViewModel A05;
    public C32681e1 A06;
    public AnonymousClass1RJ A07;
    public AnonymousClass1RJ A08;

    public static final void A00(TextView textView, C20810yC r6, C32681e1 r7, Runnable runnable, int i) {
        AnonymousClass00C.A0D(textView, 0);
        textView.setText(r7.A02(textView.getContext(), runnable, C36391kE.A0v(textView.getContext(), "clickable-span", AnonymousClass001.A0L(), 0, i), "clickable-span"));
        C36331k8.A10(textView, r6);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        this.A05 = (NewsletterUserReportsViewModel) C36381kD.A0P(this).A00(NewsletterUserReportsViewModel.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c3, code lost:
        if (r4.B8g().A06(r9, "state") != com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.NOT_APPEALED) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d9, code lost:
        if (r1 != 4) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e3, code lost:
        if (r1 == com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.REJECT) goto L_0x01e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r16, android.view.View r17) {
        /*
            r15 = this;
            r0 = 0
            r5 = r17
            X.AnonymousClass00C.A0D(r5, r0)
            android.os.Bundle r1 = r15.A0b()
            java.lang.String r0 = "arg-report-id"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "NewsletterUserReportDetailFragment: reportID is null"
            X.C18740tg.A07(r2, r0)
            r0 = 2131433439(0x7f0b17df, float:1.8488664E38)
            X.1RJ r0 = X.C36341k9.A0Y(r5, r0)
            r15.A08 = r0
            r0 = 2131431969(0x7f0b1221, float:1.8485682E38)
            X.1RJ r0 = X.C36341k9.A0Y(r5, r0)
            r15.A07 = r0
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r15.A05
            if (r0 != 0) goto L_0x0030
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0030:
            X.C36361kB.A1I(r2)
            X.32d r0 = r0.A04
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r4 = r0.get(r2)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse r4 = (com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "getReportDataFromCache reportId: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", report in cache?: "
            r1.append(r0)
            boolean r0 = X.AnonymousClass000.A1V(r4)
            X.C36331k8.A1S(r1, r0)
            X.C18740tg.A06(r4)
            X.AnonymousClass00C.A08(r4)
            r0 = 2131430735(0x7f0b0d4f, float:1.848318E38)
            android.widget.TextView r7 = X.C36351kA.A0F(r5, r0)
            X.12q r0 = r15.A03
            if (r0 == 0) goto L_0x0317
            java.lang.String r6 = X.AnonymousClass3RJ.A00(r0, r4)
            r2 = 0
            r12 = r4
            X.9Y8 r12 = (X.AnonymousClass9Y8) r12
            java.lang.String r3 = "server_msg_id"
            java.lang.String r0 = r12.A07(r3)
            boolean r1 = X.AnonymousClass000.A1V(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0126
            if (r6 != 0) goto L_0x0131
            r0 = 2131891537(0x7f121551, float:1.9417797E38)
        L_0x0080:
            r7.setText(r0)
        L_0x0083:
            r0 = 2131430722(0x7f0b0d42, float:1.8483153E38)
            android.widget.TextView r8 = X.C36351kA.A0F(r5, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r4.B8g()
            java.lang.String r2 = "creation_time"
            java.lang.String r0 = r0.A07(r2)
            if (r0 == 0) goto L_0x00be
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r6 = r4.B8g()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "state"
            java.lang.Enum r0 = r6.A06(r1, r0)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00be;
                case 1: goto L_0x00f3;
                case 2: goto L_0x0112;
                case 3: goto L_0x00dc;
                case 4: goto L_0x0116;
                case 5: goto L_0x00be;
                case 6: goto L_0x00be;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r0 = 2131432983(0x7f0b1617, float:1.8487739E38)
            android.view.View r13 = r5.findViewById(r0)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r13 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r13
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r8 = r15.A05
            r7 = 0
            if (r8 != 0) goto L_0x013d
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x00be:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            java.lang.Enum r0 = r12.A06(r1, r0)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r0 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus) r0
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0112
            r0 = 2
            if (r1 == r0) goto L_0x00f3
            r0 = 3
            if (r1 == r0) goto L_0x00dc
            r0 = 0
            if (r1 == r0) goto L_0x0116
            r0 = 4
            if (r1 == r0) goto L_0x0116
            goto L_0x00ab
        L_0x00dc:
            java.lang.String r0 = r12.A07(r3)
            r7 = 2131891513(0x7f121539, float:1.9417748E38)
            if (r0 == 0) goto L_0x00e8
            r7 = 2131891534(0x7f12154e, float:1.941779E38)
        L_0x00e8:
            X.1e1 r6 = r15.A06
            if (r6 == 0) goto L_0x0308
            X.0yC r3 = r15.A04
            if (r3 == 0) goto L_0x0303
            r1 = 43
            goto L_0x0109
        L_0x00f3:
            java.lang.String r0 = r12.A07(r3)
            r7 = 2131891520(0x7f121540, float:1.9417762E38)
            if (r0 == 0) goto L_0x00ff
            r7 = 2131891535(0x7f12154f, float:1.9417793E38)
        L_0x00ff:
            X.1e1 r6 = r15.A06
            if (r6 == 0) goto L_0x0312
            X.0yC r3 = r15.A04
            if (r3 == 0) goto L_0x030d
            r1 = 44
        L_0x0109:
            X.72o r0 = new X.72o
            r0.<init>(r15, r1)
            X.C55132u7.A00(r8, r3, r6, r0, r7)
            goto L_0x00ab
        L_0x0112:
            r1 = 2131891511(0x7f121537, float:1.9417744E38)
            goto L_0x0122
        L_0x0116:
            java.lang.String r0 = r12.A07(r3)
            r1 = 2131891514(0x7f12153a, float:1.941775E38)
            if (r0 == 0) goto L_0x0122
            r1 = 2131891533(0x7f12154d, float:1.9417789E38)
        L_0x0122:
            r8.setText(r1)
            goto L_0x00ab
        L_0x0126:
            if (r6 != 0) goto L_0x012d
            r0 = 2131891524(0x7f121544, float:1.941777E38)
            goto L_0x0080
        L_0x012d:
            r1 = 2131891523(0x7f121543, float:1.9417768E38)
            goto L_0x0134
        L_0x0131:
            r1 = 2131891536(0x7f121550, float:1.9417795E38)
        L_0x0134:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            X.C36381kD.A1E(r7, r15, r0, r1)
            goto L_0x0083
        L_0x013d:
            X.4MK r3 = new X.4MK
            r3.<init>(r15, r13)
            r6 = 0
            X.040 r1 = X.C109325Xd.A00(r8)
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$loadContactForReport$1 r0 = new com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$loadContactForReport$1
            r0.<init>(r4, r8, r7, r3)
            X.C36331k8.A1T(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r11 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r10 = "status"
            java.lang.Enum r1 = r12.A06(r11, r10)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.PENDING
            if (r1 == r0) goto L_0x01fb
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r3 = r4.B8g()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "state"
            java.lang.Enum r1 = r3.A06(r1, r0)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.PENDING
            if (r1 == r0) goto L_0x01fb
            r13.setProfileBadge(r7)
        L_0x016e:
            r0 = 2131429378(0x7f0b0802, float:1.8480427E38)
            android.widget.TextView r8 = X.C36391kE.A0P(r5, r0)
            r7 = 2131891530(0x7f12154a, float:1.9417783E38)
            java.lang.Object[] r3 = X.AnonymousClass001.A0L()
            X.0ts r1 = r15.A02
            if (r1 == 0) goto L_0x02fe
            org.json.JSONObject r0 = r12.A00
            java.lang.String r0 = r0.optString(r2)
            java.lang.String r0 = X.C36371kC.A0w(r1, r0)
            r3[r6] = r0
            X.C36381kD.A1E(r8, r15, r3, r7)
            r0 = 2131429379(0x7f0b0803, float:1.848043E38)
            android.widget.TextView r3 = X.C36391kE.A0P(r5, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r4.B8g()
            java.lang.String r0 = r0.A07(r2)
            if (r0 == 0) goto L_0x01f5
            r3.setVisibility(r6)
            X.0ts r1 = r15.A02
            if (r1 == 0) goto L_0x02f9
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r4.B8g()
            java.lang.String r0 = r0.A07(r2)
            X.C18740tg.A06(r0)
            java.lang.String r2 = X.C36371kC.A0w(r1, r0)
            r1 = 2131891531(0x7f12154b, float:1.9417785E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            r0[r6] = r2
            X.C36381kD.A1E(r3, r15, r0, r1)
        L_0x01c2:
            java.lang.Enum r2 = r12.A06(r11, r10)
            X.AnonymousClass00C.A08(r2)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r4.B8g()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r9 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r8 = "state"
            java.lang.Enum r1 = r0.A06(r9, r8)
            X.AnonymousClass00C.A08(r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r7 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.FAIL
            if (r2 != r7) goto L_0x01e0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.NOT_APPEALED
            if (r1 == r0) goto L_0x01e5
        L_0x01e0:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.REJECT
            r3 = 0
            if (r1 != r0) goto L_0x01e6
        L_0x01e5:
            r3 = 1
        L_0x01e6:
            java.lang.String r2 = "guidelinesViewStubHolder"
            r1 = 8
            X.1RJ r0 = r15.A07
            if (r3 == 0) goto L_0x02a1
            if (r0 != 0) goto L_0x0228
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x01f5:
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x01c2
        L_0x01fb:
            android.content.Context r1 = r15.A0a()
            r0 = 2131234252(0x7f080dcc, float:1.8084664E38)
            android.graphics.drawable.Drawable r9 = X.C013105r.A01(r1, r0)
            if (r9 == 0) goto L_0x016e
            X.2mo r8 = new X.2mo
            r8.<init>()
            r14 = 2131168869(0x7f070e65, float:1.7952052E38)
            r7 = 2131168870(0x7f070e66, float:1.7952054E38)
            r3 = 2131168871(0x7f070e67, float:1.7952056E38)
            r0 = 2131169005(0x7f070eed, float:1.7952328E38)
            X.6Ca r1 = new X.6Ca
            r1.<init>(r14, r7, r3, r0)
            X.2mr r0 = new X.2mr
            r0.<init>(r9, r1, r8)
            r13.setProfileBadge(r0)
            goto L_0x016e
        L_0x0228:
            r2 = 0
            r0.A03(r6)
            r0 = 2131432030(0x7f0b125e, float:1.8485806E38)
            X.C36341k9.A10(r5, r0, r1)
            r0 = 2131431946(0x7f0b120a, float:1.8485636E38)
            android.widget.TextView r14 = X.C36391kE.A0P(r5, r0)
            X.AnonymousClass00C.A0B(r14)
            r13 = 2131891420(0x7f1214dc, float:1.941756E38)
            X.1e1 r6 = r15.A06
            if (r6 == 0) goto L_0x029c
            X.0yC r3 = r15.A04
            if (r3 == 0) goto L_0x0297
            r1 = 41
            X.72o r0 = new X.72o
            r0.<init>(r15, r1)
            A00(r14, r3, r6, r0, r13)
            X.0yC r1 = r15.A04
            if (r1 == 0) goto L_0x0292
            r0 = 7592(0x1da8, float:1.0639E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x02ab
            r0 = 2131431959(0x7f0b1217, float:1.8485662E38)
            X.1RJ r0 = X.C36341k9.A0X(r5, r0)
            android.view.View r1 = X.C36391kE.A0L(r0, r2)
            r0 = 2131431960(0x7f0b1218, float:1.8485664E38)
            android.widget.TextView r13 = X.C36391kE.A0P(r1, r0)
            X.AnonymousClass00C.A0B(r13)
            r6 = 2131891421(0x7f1214dd, float:1.9417562E38)
            X.1e1 r3 = r15.A06
            if (r3 == 0) goto L_0x028d
            X.0yC r2 = r15.A04
            if (r2 == 0) goto L_0x0288
            r1 = 42
            X.72o r0 = new X.72o
            r0.<init>(r15, r1)
            A00(r13, r2, r3, r0, r6)
            goto L_0x02ab
        L_0x0288:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x028d:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x0292:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0297:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x029c:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x02a1:
            if (r0 != 0) goto L_0x02a8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x02a8:
            r0.A03(r1)
        L_0x02ab:
            r0 = 2131433438(0x7f0b17de, float:1.8488662E38)
            android.view.View r3 = r5.findViewById(r0)
            java.lang.Enum r0 = r12.A06(r11, r10)
            if (r0 != r7) goto L_0x02c5
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r4.B8g()
            java.lang.Enum r2 = r0.A06(r9, r8)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.NOT_APPEALED
            r0 = 1
            if (r2 == r1) goto L_0x02c6
        L_0x02c5:
            r0 = 0
        L_0x02c6:
            java.lang.String r2 = "reviewButtonViewStubHolder"
            if (r0 == 0) goto L_0x02e7
            r1 = 0
            r3.setVisibility(r1)
            X.1RJ r0 = r15.A08
            if (r0 != 0) goto L_0x02d7
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x02d7:
            r0.A03(r1)
            r0 = 2131433437(0x7f0b17dd, float:1.848866E38)
            android.view.View r1 = r5.findViewById(r0)
            r0 = 22
            X.AnonymousClass3YH.A00(r1, r15, r4, r0)
            return
        L_0x02e7:
            r1 = 8
            r3.setVisibility(r1)
            X.1RJ r0 = r15.A08
            if (r0 != 0) goto L_0x02f5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x02f5:
            r0.A03(r1)
            return
        L_0x02f9:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x02fe:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x0303:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0308:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x030d:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0312:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x0317:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.userreports.detail.NewsletterUserReportDetailFragment.A1S(android.os.Bundle, android.view.View):void");
    }

    public static final void A03(NewsletterUserReportDetailFragment newsletterUserReportDetailFragment) {
        NewsletterGuidelinesDecisionProcessBottomSheet newsletterGuidelinesDecisionProcessBottomSheet = new NewsletterGuidelinesDecisionProcessBottomSheet();
        Bundle A072 = AnonymousClass001.A07();
        A072.putBoolean("user-report-content-arg", true);
        newsletterGuidelinesDecisionProcessBottomSheet.A17(A072);
        newsletterGuidelinesDecisionProcessBottomSheet.A1f(newsletterUserReportDetailFragment.A0l(), "how-we-made-this-decision");
    }

    public void A1L() {
        super.A1L();
        A0i().setTitle(R.string.f12nameremoved);
    }
}
