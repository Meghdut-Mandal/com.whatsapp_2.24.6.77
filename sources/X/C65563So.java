package X;

/* renamed from: X.3So  reason: invalid class name and case insensitive filesystem */
public class C65563So {
    public final C58352zj A00;
    public final C58362zk A01;
    public final C58372zl A02;
    public final C237519s A03;
    public final C19600wD A04;
    public final C19630wG A05;
    public final C19420v0 A06;
    public final C21520zN A07;
    public final C20810yC A08;
    public final AnonymousClass3PY A09;
    public final C19770wU A0A;

    public static void A00(C123815x8 r1, C88624Tk r2) {
        Integer num;
        AnonymousClass66O r12 = r1.A04;
        int i = 2;
        if (r12 != null) {
            num = (Integer) r12.A00((Object) null);
            if (num == null) {
                i = -1;
            }
            r2.BXN(num);
        }
        num = Integer.valueOf(i);
        r2.BXN(num);
    }

    public static void A01(C65563So r3, AnonymousClass37Y r4) {
        String str = r4.A00;
        C19420v0 r32 = r3.A06;
        C36341k9.A0x(C19420v0.A00(r32), "support_ban_appeal_state", str);
        if ("UNBANNED".equals(str)) {
            String str2 = r4.A01;
            C36321k7.A1Q("BanAppealRepository/storeUnbanReason ", str2, AnonymousClass000.A0u());
            C36341k9.A0x(C19420v0.A00(r32), "support_ban_appeal_unban_reason", str2);
            String str3 = r4.A02;
            C36321k7.A1Q("BanAppealRepository/storeUnbanReasonUrl ", str3, AnonymousClass000.A0u());
            C36341k9.A0x(C19420v0.A00(r32), "support_ban_appeal_unban_reason_url", str3);
        }
    }

    public C65563So(C58352zj r1, C58362zk r2, C58372zl r3, C237519s r4, C19600wD r5, C19630wG r6, C19420v0 r7, C21520zN r8, C20810yC r9, AnonymousClass3PY r10, C19770wU r11) {
        this.A05 = r6;
        this.A0A = r11;
        this.A08 = r9;
        this.A07 = r8;
        this.A06 = r7;
        this.A09 = r10;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
