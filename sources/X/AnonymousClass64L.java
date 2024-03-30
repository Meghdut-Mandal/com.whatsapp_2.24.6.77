package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.64L  reason: invalid class name */
public class AnonymousClass64L {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1X4 A01;
    public final AnonymousClass1D5 A02;
    public final C29121Vk A03;
    public final C29151Vn A04;
    public final C29951Yq A05;

    public C202319lY A00(AnonymousClass16U r17, AnonymousClass16X r18, C207249un r19, C175708av r20, C135106c9 r21, AnonymousClass11F r22, UserJid userJid, C146506vi r24, AnonymousClass3T1 r25, C135066c4 r26, Integer num, String str, String str2, String str3, boolean z) {
        C146506vi r5 = r24;
        C135066c4 r1 = r26;
        C46962bx A022 = this.A05.A02(r22, userJid, r25, r1, num);
        AnonymousClass16U r7 = r17;
        C207249un r9 = r19;
        C175708av r10 = r20;
        C135106c9 r11 = r21;
        boolean A0K = this.A03.A0K(r7, r18, r9, r10, r11, A022, str2, str3, z);
        if (r24 == null) {
            AnonymousClass1D5 r2 = this.A02;
            C65233Rg A002 = C29951Yq.A00(r1, str);
            C18740tg.A06(A002);
            r5 = r2.A01(A002, true);
        }
        this.A00.A0H(new AnonymousClass736(this, A022, r5, 33));
        this.A04.A01(r11, A022);
        if (A0K) {
            return A022.A0M;
        }
        return null;
    }

    public AnonymousClass64L(AnonymousClass17Y r1, AnonymousClass1X4 r2, AnonymousClass1D5 r3, C29121Vk r4, C29951Yq r5, C29151Vn r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r6;
        this.A05 = r5;
    }
}
