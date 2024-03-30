package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5Lr  reason: invalid class name and case insensitive filesystem */
public final class C106875Lr extends C132446Tt {
    public final C19970wo A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        StringBuilder A0v;
        StringBuilder A0u;
        String str;
        String str2;
        AnonymousClass005 r5 = this.A03;
        AnonymousClass00T r0 = ((AnonymousClass66L) r5.get()).A01;
        r0.getValue();
        C20070wy copyOf = C20070wy.copyOf((Map) (ConcurrentHashMap) r0.getValue());
        AnonymousClass00C.A08(copyOf);
        Iterator it = copyOf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            String A0f = C90494aF.A0f(A11);
            Object value = A11.getValue();
            AnonymousClass00C.A08(value);
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it2 = ((List) value).iterator();
            while (it2.hasNext()) {
                long A0D = C36391kE.A0D(it2);
                AnonymousClass3T1 A0R = C36421kH.A0R(((AnonymousClass632) this.A02.get()).A02, A0D);
                if (A0R == null || C66013Ui.A0n(A0R)) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("CrosspostSendUnsentStatusTask/getMessageFromMessageRowIds encountered empty or revoked message: ");
                    A0u2.append(A0D);
                    C90464aC.A1R(A0u2, ", skipping and retrying the rest");
                    ((C132396Tl) this.A04.get()).A06(C36371kC.A11(Long.valueOf(A0D)), 4);
                } else {
                    A0I.add(A0R);
                }
            }
            AnonymousClass00C.A0B(A0f);
            long A002 = C19970wo.A00(this.A00);
            if (!(A0I instanceof Collection) || !A0I.isEmpty()) {
                Iterator it3 = A0I.iterator();
                while (it3.hasNext()) {
                    AnonymousClass3T1 A0l = C36391kE.A0l(it3);
                    if (!AnonymousClass6Y4.A07(A0l)) {
                        A0v = AnonymousClass000.A0v("CrosspostSendUnsentStatusTask/message ");
                        A0v.append(A0l.A1N);
                        A0v.append(" invalid for retry due to incompatible type: ");
                        A0v.append(A0l.A1I);
                    } else if (Math.abs(A002 - A0l.A0I) > 10800000) {
                        A0v = AnonymousClass000.A0v("CrosspostSendUnsentStatusTask/message ");
                        A0v.append(A0l.A1N);
                        A0v.append(" invalid for retry due to timestamp expiration: ");
                        A0v.append(A0l.A0I);
                    }
                    String obj = A0v.toString();
                    i = 0;
                    AnonymousClass00C.A0D(AnonymousClass000.A0p("CrosspostSendUnsentStatusTask/getEnforcedUniqueIdIfEligibleForRetry contains non retryable message in session: ", A0f, C36401kF.A0t(obj, 0)), 0);
                }
            }
            C132396Tl r7 = (C132396Tl) this.A04.get();
            ArrayList A0J = C36321k7.A0J(A0I);
            Iterator it4 = A0I.iterator();
            while (it4.hasNext()) {
                C90464aC.A1T(A0J, it4);
            }
            HashMap A022 = r7.A02(A0J);
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it5 = A0I.iterator();
            while (it5.hasNext()) {
                AnonymousClass3T1 A0l2 = C36391kE.A0l(it5);
                C128556Cs r1 = (C128556Cs) A022.get(Long.valueOf(A0l2.A1N));
                if (r1 == null) {
                    A0u = AnonymousClass000.A0u();
                    str = "CrosspostSendUnsentStatusTask/db entry not found for message id: ";
                } else if (!(A0l2 instanceof AnonymousClass2bV) || !((str2 = r1.A04) == null || str2.length() == 0)) {
                    A0I2.add(r1.A02);
                } else {
                    A0u = AnonymousClass000.A0u();
                    str = "CrosspostSendUnsentStatusTask/text status empty media path: ";
                }
                A0u.append(str);
                AnonymousClass00C.A0D(C36411kG.A11(A0u, A0l2.A1N), 0);
                C18740tg.A0D(false, C36411kG.A11(AnonymousClass000.A0v(str), A0l2.A1N));
            }
            if (A0I2.size() == A0I.size()) {
                AnonymousClass6V7 r8 = (AnonymousClass6V7) this.A01.get();
                StringBuilder A0t = C36401kF.A0t(A0f, 0);
                A0t.append("XFamilyCrosspostRequestSessionManager/handleCrosspostRetry started for session: ");
                A0t.append(A0f);
                A0t.append(" with messages: ");
                ArrayList A0J2 = C36321k7.A0J(A0I);
                Iterator it6 = A0I.iterator();
                while (it6.hasNext()) {
                    C90464aC.A1T(A0J2, it6);
                }
                AnonymousClass00C.A0D(AnonymousClass000.A0o(A0J2, A0t), 0);
                ((AnonymousClass66L) r8.A0A.get()).A00(A0f);
                ((C1266264t) r8.A05.get()).A00(new C1494671i(new C107595Qc(r8, (Boolean) null, A0f, A0I, false), r8, A0f), A0f, A0I, A0I2);
            }
            i = 0;
            AnonymousClass00C.A0D(AnonymousClass000.A0p("CrosspostSendUnsentStatusTask/uniqueId validation failed for session: ", A0f, AnonymousClass000.A0u()), 0);
            C18740tg.A0D(false, C36321k7.A0D("CrosspostSendUnsentStatusTask/uniqueId validation failed for session: ", A0f));
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("CrosspostSendUnsentStatusTask/doInBackground sessionId: ");
            A0u3.append(A0f);
            AnonymousClass00C.A0D(AnonymousClass000.A0q(" not eligible for retry, updating db", A0u3), i);
            ((AnonymousClass66L) r5.get()).A00(A0f);
            C132396Tl r4 = (C132396Tl) this.A04.get();
            ArrayList A0J3 = C36321k7.A0J(A0I);
            Iterator it7 = A0I.iterator();
            while (it7.hasNext()) {
                C90464aC.A1T(A0J3, it7);
            }
            r4.A06(A0J3, 4);
        }
        return null;
    }

    public C106875Lr(C19970wo r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
