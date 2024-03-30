package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8UJ  reason: invalid class name */
public final class AnonymousClass8UJ extends C21186ABu implements C22994Azk {
    public final C19730wQ A00;
    public final C220412q A01;
    public final AnonymousClass17X A02;
    public final C20810yC A03;
    public final C201449jc A04;
    public final C26191Jf A05;
    public final AnonymousClass005 A06;

    public ArrayList BHq(AnonymousClass3T1 r5) {
        C203399nx[] r3 = new C203399nx[1];
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[1];
        C203399nx.A0H("meta", r2, r3, C36371kC.A1Y("event_type", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, r2) ? 1 : 0);
        return AnonymousClass03T.A02(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b0, code lost:
        if (r5 == false) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B24(X.C196159Xy r16, X.AnonymousClass3T1 r17) {
        /*
            r15 = this;
            r4 = r16
            r3 = r17
            X.C36321k7.A0w(r3, r4)
            boolean r1 = r3 instanceof X.C46762bd
            X.Ajj r0 = X.C22282Ajj.A00
            X.C1899496f.A00(r0, r1)
            X.2bd r3 = (X.C46762bd) r3
            X.2pC r0 = r3.A01
            boolean r1 = X.AnonymousClass000.A1V(r0)
            X.Ajk r0 = X.C22283Ajk.A00
            X.C1899496f.A00(r0, r1)
            X.3Qa r11 = r3.A1Z()
            boolean r1 = X.AnonymousClass000.A1V(r11)
            X.Ajl r0 = X.C22284Ajl.A00
            X.C1899496f.A00(r0, r1)
            X.11F r0 = r11.A00
            boolean r5 = r4.A07
            X.12q r1 = r15.A01
            com.whatsapp.jid.GroupJid r0 = X.C36441kJ.A0l(r0)
            int r1 = r1.A05(r0)
            r0 = 3
            if (r1 == r0) goto L_0x0131
            if (r5 != 0) goto L_0x0131
            X.0wQ r2 = r15.A00
            com.whatsapp.jid.PhoneUserJid r10 = X.C36371kC.A0e(r2)
        L_0x0041:
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            boolean r1 = X.AnonymousClass000.A1V(r10)
            X.Ajm r0 = X.C22285Ajm.A00
            X.C1899496f.A00(r0, r1)
            X.9Vv r0 = r3.A04
            if (r0 != 0) goto L_0x012d
            r0 = 0
        L_0x0051:
            boolean r6 = r11.A02
            if (r6 == 0) goto L_0x0127
            if (r5 == 0) goto L_0x0121
            X.13w r0 = r2.A09()
        L_0x005b:
            boolean r1 = X.AnonymousClass000.A1V(r0)
            X.Ajn r0 = X.C22286Ajn.A00
            X.C1899496f.A00(r0, r1)
            X.8NL r2 = r4.A00
            X.8Hz r0 = r2.A00
            X.8SX r0 = (X.AnonymousClass8SX) r0
            X.8Px r0 = r0.encEventResponseMessage_
            if (r0 != 0) goto L_0x0070
            X.8Px r0 = X.C172978Px.DEFAULT_INSTANCE
        L_0x0070:
            X.8NN r8 = r0.A0q()
            X.8P0 r0 = X.AnonymousClass8P0.DEFAULT_INSTANCE
            X.8NN r7 = r0.A0p()
            X.2pC r0 = r3.A01
            if (r0 == 0) goto L_0x009d
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x011d
            r0 = 2
            if (r1 == r0) goto L_0x0119
            r0 = 0
            if (r1 != r0) goto L_0x0139
            X.90Z r0 = X.AnonymousClass90Z.UNKNOWN
        L_0x008d:
            X.8Hz r1 = X.C90524aI.A0H(r7)
            X.8P0 r1 = (X.AnonymousClass8P0) r1
            int r0 = r0.value
            r1.response_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
        L_0x009d:
            long r3 = r3.A00
            X.8Hz r1 = X.C90524aI.A0H(r7)
            X.8P0 r1 = (X.AnonymousClass8P0) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.timestampMs_ = r3
            if (r6 == 0) goto L_0x00b2
            r14 = 1
            if (r5 != 0) goto L_0x00b3
        L_0x00b2:
            r14 = 0
        L_0x00b3:
            byte[] r13 = X.AnonymousClass8NN.A0N(r7)
            java.lang.String r12 = "Event Response"
            X.9Wx r9 = new X.9Wx
            r9.<init>(r10, r11, r12, r13, r14)
            X.9jc r0 = r15.A04
            X.0fI r4 = r0.A03(r9)
            java.lang.Object r3 = r4.first
            X.AUx r3 = (X.C21674AUx) r3
            X.8Hz r1 = X.C90524aI.A0H(r8)
            X.8Px r1 = (X.C172978Px) r1
            int r0 = X.C172978Px.ENC_IV_FIELD_NUMBER
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.encIv_ = r3
            java.lang.Object r3 = r4.second
            X.AUx r3 = (X.C21674AUx) r3
            X.8Hz r1 = X.C90524aI.A0H(r8)
            X.8Px r1 = (X.C172978Px) r1
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.encPayload_ = r3
            java.lang.Object r0 = r4.third
            X.8SW r0 = (X.AnonymousClass8SW) r0
            X.8Hz r1 = X.C90524aI.A0H(r8)
            X.8Px r1 = (X.C172978Px) r1
            r0.getClass()
            r1.eventCreationMessageKey_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.8Hz r0 = r8.A0R()
            X.8Px r0 = (X.C172978Px) r0
            X.8SX r2 = X.AnonymousClass8NN.A0F(r2, r0)
            r2.encEventResponseMessage_ = r0
            int r1 = r2.bitField1_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 | r0
            r2.bitField1_ = r1
            return
        L_0x0119:
            X.90Z r0 = X.AnonymousClass90Z.NOT_GOING
            goto L_0x008d
        L_0x011d:
            X.90Z r0 = X.AnonymousClass90Z.GOING
            goto L_0x008d
        L_0x0121:
            com.whatsapp.jid.PhoneUserJid r0 = X.C36371kC.A0e(r2)
            goto L_0x005b
        L_0x0127:
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r0)
            goto L_0x005b
        L_0x012d:
            X.11F r0 = r0.A00
            goto L_0x0051
        L_0x0131:
            X.0wQ r2 = r15.A00
            X.13w r10 = r2.A08()
            goto L_0x0041
        L_0x0139:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8UJ.B24(X.9Xy, X.3T1):void");
    }

    public AnonymousClass8UJ(C19730wQ r1, C220412q r2, AnonymousClass17X r3, C20810yC r4, C201449jc r5, C26191Jf r6, AnonymousClass005 r7) {
        C36321k7.A18(r4, r1, r2, r7);
        C36321k7.A10(r3, r5);
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
    }
}
