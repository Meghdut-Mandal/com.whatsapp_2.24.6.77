package X;

import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.1Fx  reason: invalid class name and case insensitive filesystem */
public class C25341Fx {
    public final C20810yC A00;
    public final C220412q A01;
    public final C21010yW A02;

    public static void A00(C20810yC r7, C196159Xy r8, AnonymousClass8NL r9, AnonymousClass3T1 r10) {
        List list = r10.A0w;
        if (list != null && !C65713Te.A02(GroupJid.class, list).isEmpty()) {
            AnonymousClass8NL r6 = r8.A00;
            C172328Nk r0 = ((AnonymousClass8SX) r6.A00).groupMentionedMessage_;
            if (r0 == null) {
                r0 = C172328Nk.DEFAULT_INSTANCE;
            }
            AnonymousClass8NC r5 = (AnonymousClass8NC) r0.A0q();
            C173348Ri A0U = r9.A0U();
            C203359nq.A0A(r7, r9);
            r5.A0U(r9);
            C170918Hz r1 = r6.A01;
            if (!r1.A0t()) {
                r6.A00 = (C170918Hz) r1.A0r(C023109s.A0G, (Object) null, (Object) null);
                r6.A0S();
                AnonymousClass8SX r2 = (AnonymousClass8SX) r6.A00;
                C172328Nk r02 = (C172328Nk) r5.A0R();
                r02.getClass();
                r2.groupMentionedMessage_ = r02;
                r2.bitField1_ |= C132986Wc.A0F;
                if (A0U != null && A0U.A0k((C23073B3d) null) > 0) {
                    r6.A0j(A0U);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
    }

    public void A01(C196159Xy r6, AnonymousClass3T1 r7) {
        int A1X;
        if (r7 instanceof AnonymousClass2bM) {
            C20810yC r3 = this.A00;
            AnonymousClass2bM r72 = (AnonymousClass2bM) r7;
            if (r72.A1d() && (A1X = r72.A1X()) >= 0) {
                AnonymousClass8N8 r0 = r6.A01;
                r0.A0S();
                C173348Ri r1 = (C173348Ri) r0.A00;
                C173348Ri r02 = C173348Ri.DEFAULT_INSTANCE;
                r1.bitField0_ |= 16;
                r1.messageAddOnDurationInSecs_ = A1X;
                if (!C20800yB.A01(C21000yV.A01, r3, 7772)) {
                    AnonymousClass8NL r4 = r6.A00;
                    C173348Ri A0U = r4.A0U();
                    AnonymousClass8NN A0p = C173348Ri.DEFAULT_INSTANCE.A0p();
                    A0p.A0T(A0U);
                    int A1X2 = r72.A1X();
                    A0p.A0S();
                    C173348Ri r12 = (C173348Ri) A0p.A00;
                    r12.bitField0_ |= 16;
                    r12.messageAddOnDurationInSecs_ = A1X2;
                    r4.A0j((C173348Ri) A0p.A0R());
                }
            }
        }
    }

    public void A02(C196159Xy r7, AnonymousClass3T1 r8) {
        if (C66013Ui.A0Y(this.A01, r8) && !r7.A08) {
            C20810yC r2 = this.A00;
            byte[] bArr = r8.A1b;
            if (bArr != null) {
                AnonymousClass8N8 r1 = r7.A01;
                int length = bArr.length;
                r1.A0U(C21674AUx.A01(bArr, 0, length));
                if (!C20800yB.A01(C21000yV.A01, r2, 7772)) {
                    AnonymousClass8NL r3 = r7.A00;
                    C173348Ri A0U = r3.A0U();
                    AnonymousClass8NN A0p = C173348Ri.DEFAULT_INSTANCE.A0p();
                    A0p.A0T(A0U);
                    AnonymousClass8N8 r12 = (AnonymousClass8N8) A0p;
                    r12.A0U(C21674AUx.A01(bArr, 0, length));
                    r3.A0j((C173348Ri) r12.A0R());
                }
            }
        }
    }

    public C25341Fx(C220412q r1, C20810yC r2, C21010yW r3) {
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = r3;
    }
}
