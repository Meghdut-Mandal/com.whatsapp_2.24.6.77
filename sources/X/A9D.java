package X;

import com.whatsapp.jid.UserJid;

public final class A9D implements C23024B0u {
    public final /* synthetic */ C202279lS A00;
    public final /* synthetic */ AnonymousClass9HH A01;
    public final /* synthetic */ UserJid A02;

    public A9D(C202279lS r1, AnonymousClass9HH r2, UserJid userJid) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = userJid;
    }

    public void Bd9(String str, int i) {
        if (406 == i || 421 == i) {
            C202279lS.A00(this.A00, this.A02);
        }
        this.A01.A00.A0C.A0C(str);
    }

    public void BdA(C119055pA r11) {
        AnonymousClass9HH r7 = this.A01;
        String str = r11.A01;
        if (AnonymousClass00C.A0J(str, "success")) {
            C167637yT r1 = r7.A00;
            C001700s r0 = r1.A07;
            String str2 = r7.A01;
            r0.A0C(str2);
            C001700s r02 = r1.A06;
            String str3 = r11.A00;
            r02.A0C(str3);
            C19420v0 r6 = r1.A0A;
            UserJid userJid = r1.A0B;
            C36341k9.A0x(C19420v0.A00(r6), AnonymousClass000.A0p("dc_user_postcode_", userJid.getRawString(), AnonymousClass000.A0u()), str2);
            if (str3 != null) {
                C36341k9.A0x(C19420v0.A00(r6), AnonymousClass000.A0p("dc_location_name_", userJid.getRawString(), AnonymousClass000.A0u()), str3);
            }
        }
        r7.A00.A0C.A0C(str);
    }
}
