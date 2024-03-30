package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.97R  reason: invalid class name */
public abstract class AnonymousClass97R {
    public static AnonymousClass8N7 A00(AnonymousClass8NL r7, AnonymousClass3F4 r8) {
        AnonymousClass8SJ r1;
        int i;
        AnonymousClass8SL r0 = ((AnonymousClass8SX) r7.A00).templateMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8SL.DEFAULT_INSTANCE;
        }
        AnonymousClass8N7 r4 = (AnonymousClass8N7) C170918Hz.A0N(r0).A0q();
        String str = r8.A02;
        AnonymousClass8SO r12 = (AnonymousClass8SO) C90524aI.A0H(r4);
        int i2 = AnonymousClass8SO.DOCUMENT_MESSAGE_FIELD_NUMBER;
        str.getClass();
        r12.bitField0_ |= 32;
        r12.hydratedContentText_ = str;
        String str2 = r8.A03;
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass8SO r13 = (AnonymousClass8SO) C90524aI.A0H(r4);
            str2.getClass();
            r13.bitField0_ |= 64;
            r13.hydratedFooterText_ = str2;
        }
        List<AnonymousClass3P8> list = r8.A06;
        if (list != null && !list.isEmpty()) {
            ArrayList A0I = AnonymousClass001.A0I();
            for (AnonymousClass3P8 r6 : list) {
                AnonymousClass8NN A0p = AnonymousClass8SJ.DEFAULT_INSTANCE.A0p();
                int i3 = r6.A06;
                if (i3 == 1) {
                    AnonymousClass8NN A0p2 = C172688Ou.DEFAULT_INSTANCE.A0p();
                    String str3 = r6.A01;
                    C172688Ou r14 = (C172688Ou) C90524aI.A0H(A0p2);
                    str3.getClass();
                    r14.bitField0_ |= 2;
                    r14.id_ = str3;
                    String str4 = r6.A08;
                    C172688Ou r15 = (C172688Ou) C90524aI.A0H(A0p2);
                    str4.getClass();
                    r15.bitField0_ |= 1;
                    r15.displayText_ = str4;
                    r1 = (AnonymousClass8SJ) C90524aI.A0H(A0p);
                    C170918Hz A0R = A0p2.A0R();
                    A0R.getClass();
                    r1.hydratedButton_ = A0R;
                    i = 1;
                } else if (i3 == 3) {
                    AnonymousClass8NN A0p3 = C172678Ot.DEFAULT_INSTANCE.A0p();
                    String str5 = r6.A08;
                    C172678Ot r16 = (C172678Ot) C90524aI.A0H(A0p3);
                    str5.getClass();
                    r16.bitField0_ |= 1;
                    r16.displayText_ = str5;
                    String str6 = r6.A01;
                    C172678Ot r17 = (C172678Ot) C90524aI.A0H(A0p3);
                    str6.getClass();
                    r17.bitField0_ |= 2;
                    r17.phoneNumber_ = str6;
                    r1 = (AnonymousClass8SJ) C90524aI.A0H(A0p);
                    C170918Hz A0R2 = A0p3.A0R();
                    A0R2.getClass();
                    r1.hydratedButton_ = A0R2;
                    i = 3;
                } else if (i3 == 2) {
                    AnonymousClass8NN A0p4 = C173048Qe.DEFAULT_INSTANCE.A0p();
                    String str7 = r6.A08;
                    C173048Qe r18 = (C173048Qe) C90524aI.A0H(A0p4);
                    str7.getClass();
                    r18.bitField0_ |= 1;
                    r18.displayText_ = str7;
                    String str8 = r6.A01;
                    C173048Qe r19 = (C173048Qe) C90524aI.A0H(A0p4);
                    str8.getClass();
                    r19.bitField0_ |= 2;
                    r19.url_ = str8;
                    C170918Hz A0R3 = A0p4.A0R();
                    r1 = (AnonymousClass8SJ) C90524aI.A0H(A0p);
                    A0R3.getClass();
                    r1.hydratedButton_ = A0R3;
                    i = 2;
                } else {
                    int i4 = r6.A05;
                    AnonymousClass8SJ r110 = (AnonymousClass8SJ) C90524aI.A0H(A0p);
                    r110.bitField0_ |= 8;
                    r110.index_ = i4;
                    A0I.add(A0p.A0R());
                }
                r1.hydratedButtonCase_ = i;
                int i42 = r6.A05;
                AnonymousClass8SJ r1102 = (AnonymousClass8SJ) C90524aI.A0H(A0p);
                r1102.bitField0_ |= 8;
                r1102.index_ = i42;
                A0I.add(A0p.A0R());
            }
            AnonymousClass8SO r2 = (AnonymousClass8SO) C90524aI.A0H(r4);
            C23122B6c b6c = r2.hydratedButtons_;
            if (!((C21886AcE) b6c).A00) {
                b6c = C170918Hz.A0A(b6c);
                r2.hydratedButtons_ = b6c;
            }
            C21071A7i.A0O(A0I, b6c);
        }
        return r4;
    }
}
