package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3uX  reason: invalid class name and case insensitive filesystem */
public final class C79943uX implements B0B {
    public final AnonymousClass3DF A00;
    public final C65573Sp A01;
    public final AnonymousClass2aL A02;

    public static final void A00(C65573Sp r4, AnonymousClass2aL r5, UserJid userJid, String str) {
        AnonymousClass00C.A0D(str, 0);
        ArrayList A04 = r5.A04();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (AnonymousClass00C.A0J(((C63363Jt) next).A02, userJid)) {
                A0I.add(next);
            }
        }
        if (C007103b.A0M(A0I) != null) {
            r4.A02(str);
        }
    }

    public boolean B1C(C193229Kn r16, C16540pP r17, C87374On r18) {
        C16540pP r7 = r17;
        if (!(r7 instanceof C79843uN)) {
            Log.e("SurveyEligibilityFilter/apply qpUserFilterContext is not correct type");
            this.A01.A02("SurveyQpFilter/apply qpUserFilterContext is not correct type");
        } else {
            C65573Sp r6 = this.A01;
            AnonymousClass2aL r5 = this.A02;
            C79843uN r72 = (C79843uN) r7;
            UserJid userJid = r72.A01;
            A00(r6, r5, userJid, "SurveyQpFilter/apply enter");
            ArrayList A04 = r5.A04();
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C63363Jt r3 = (C63363Jt) next;
                if (AnonymousClass00C.A0J(r3.A02, userJid)) {
                    AnonymousClass3DF r0 = this.A00;
                    if (System.currentTimeMillis() <= r3.A00 + TimeUnit.DAYS.toMillis((long) r0.A00.A00("survey_expiry_days", 30))) {
                        A0I.add(next);
                    }
                }
            }
            C63363Jt r2 = (C63363Jt) C007103b.A0M(A0I);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SurveyQpFilter/apply exit surveyInfoStore.allObjects.size=");
            A00(r6, r5, userJid, C36381kD.A10(A0u, r5.A04().size()));
            r72.A00 = r2;
            if (r2 != null) {
                return true;
            }
        }
        return false;
    }

    public C79943uX(AnonymousClass3DF r1, C65573Sp r2, AnonymousClass2aL r3) {
        C36321k7.A11(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
