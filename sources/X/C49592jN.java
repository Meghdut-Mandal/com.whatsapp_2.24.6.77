package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.2jN  reason: invalid class name and case insensitive filesystem */
public final class C49592jN extends C132446Tt {
    public final C20810yC A00;
    public final C65573Sp A01;
    public final AnonymousClass2aL A02;
    public final UserJid A03;
    public final C31351bg A04;
    public final WeakReference A05;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C63363Jt r1;
        try {
            UserJid userJid = this.A03;
            C79843uN r6 = new C79843uN(userJid);
            C21642ATi A002 = this.A04.A00.A00(r6, "whatsapp_biz_integrity_survey_notification_load", 11389);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SurveyConversationBanner/GetQuickPromotionsTask/doInBackground chooseBestPromotion qp.isNotNull=");
            boolean z = true;
            A0u.append(AnonymousClass000.A1V(A002));
            A0u.append(" filterContext.surveyInfo.isNotNull=");
            if (r6.A00 == null) {
                z = false;
            }
            C53832rx.A00(this.A00, this.A01, this.A02, userJid, C36421kH.A0d(A0u, z));
            if (A002 != null) {
                if (r6.A00 == null) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("SurveyConversationBanner/canShow surveyInfo is null when qp=");
                    C36321k7.A1Z(A0u2, A002.A0F);
                }
                r1 = r6.A00;
            } else {
                r1 = null;
            }
            return new AnonymousClass3I7(r1, A002);
        } catch (Exception e) {
            C65573Sp r2 = this.A01;
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("SurveyConversationBanner/GetQuickPromotionsTask/doInBackground exception=");
            r2.A02(AnonymousClass000.A0q(AnonymousClass0VY.A00(e), A0u3));
            return new AnonymousClass3I7((C63363Jt) null, (C87374On) null);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C87374On r3;
        C63363Jt r1;
        AnonymousClass2HI r6;
        AnonymousClass3I7 r8 = (AnonymousClass3I7) obj;
        if (r8 != null && (r3 = r8.A00) != null && (r1 = r8.A01) != null && (r6 = (AnonymousClass2HI) this.A05.get()) != null) {
            r6.A02 = r3;
            r6.A01 = r1;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SurveyConversationBanner/updateQuickPromotionsResult qp.IsNull=");
            A0u.append(AnonymousClass000.A1W(r3));
            String A0z = C36371kC.A0z(" surveyInfo.isNull=", A0u, false);
            C53832rx.A00(r6.A05, r6.A07, r6.A08, r6.A09, A0z);
            if (r6.A02 == null || r6.A01 == null) {
                r6.A0A(true);
            } else {
                r6.A08();
            }
        }
    }

    public C49592jN(C20810yC r1, C65573Sp r2, AnonymousClass2aL r3, UserJid userJid, C31351bg r5, WeakReference weakReference) {
        this.A03 = userJid;
        this.A04 = r5;
        this.A05 = weakReference;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
