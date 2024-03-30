package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Lk  reason: invalid class name */
public class AnonymousClass2Lk extends C201669k5 {
    public final C223313w A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public String A07() {
        return "contact";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r1[0].equals(r2) != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2Lk(X.C199769fw r13, X.C201539jo r14, X.C223313w r15, com.whatsapp.jid.UserJid r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, long r20, boolean r22) {
        /*
            r12 = this;
            r2 = r18
            r1 = r19
            r8 = 2
            r11 = 0
            java.lang.String r7 = "critical_unblock_low"
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r17
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            r0 = r16
            r12.A01 = r0
            r12.A00 = r15
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = ""
        L_0x0020:
            r12.A02 = r1
            if (r18 == 0) goto L_0x003c
            java.lang.String r0 = " "
            java.lang.String[] r1 = r1.split(r0)
            int r0 = r1.length
            if (r0 == 0) goto L_0x0035
            r0 = r1[r11]
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x003c
        L_0x0035:
            r12.A03 = r2
            r0 = r22
            r12.A04 = r0
            return
        L_0x003c:
            java.lang.String r2 = ""
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Lk.<init>(X.9fw, X.9jo, X.13w, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, long, boolean):void");
    }

    public AnonymousClass8LN A04() {
        if (this.A05.equals(C199769fw.A02)) {
            return null;
        }
        AnonymousClass8NN A0p = C173148Qo.DEFAULT_INSTANCE.A0p();
        String str = this.A02;
        A0p.A0S();
        C173148Qo r1 = (C173148Qo) A0p.A00;
        str.getClass();
        r1.bitField0_ |= 1;
        r1.fullName_ = str;
        String str2 = this.A03;
        if (!TextUtils.isEmpty(str2)) {
            A0p.A0S();
            C173148Qo r12 = (C173148Qo) A0p.A00;
            r12.bitField0_ |= 2;
            r12.firstName_ = str2;
        }
        C223313w r0 = this.A00;
        if (r0 != null) {
            String rawString = r0.getRawString();
            A0p.A0S();
            C173148Qo r13 = (C173148Qo) A0p.A00;
            rawString.getClass();
            r13.bitField0_ |= 4;
            r13.lidJid_ = rawString;
        }
        AnonymousClass8LN A042 = super.A04();
        C18740tg.A06(A042);
        A042.A0S();
        AnonymousClass8SS r2 = (AnonymousClass8SS) A042.A00;
        C173148Qo r14 = (C173148Qo) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r14.getClass();
        r2.contactAction_ = r14;
        r2.bitField0_ |= 4;
        return A042;
    }

    public String[] A0A() {
        String[] A1S = C36441kJ.A1S();
        A1S[0] = "contact";
        A1S[1] = this.A01.getRawString();
        return A1S;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContactMutation{rowId=");
        A0u.append(this.A07);
        A0u.append(", contactJid=");
        A0u.append(this.A01);
        A0u.append(", lidJid=");
        A0u.append(this.A00);
        A0u.append(", givenName=");
        A0u.append(this.A03);
        A0u.append(", displayName=");
        A0u.append(this.A02);
        A0u.append(", timestamp=");
        A0u.append(this.A04);
        A0u.append(", areDependenciesMissing=");
        A0u.append(A09());
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
