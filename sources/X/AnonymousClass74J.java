package X;

import java.util.HashMap;

/* renamed from: X.74J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass74J implements Runnable {
    public final /* synthetic */ C131556Pn A00;
    public final /* synthetic */ C128936Ee A01;
    public final /* synthetic */ C159497jS A02;
    public final /* synthetic */ C122855vX A03;
    public final /* synthetic */ C134906bn A04;
    public final /* synthetic */ C160217ke A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public /* synthetic */ AnonymousClass74J(C131556Pn r1, C128936Ee r2, C159497jS r3, C122855vX r4, C134906bn r5, C160217ke r6, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = r4;
        this.A09 = str3;
        this.A0A = z;
        this.A0B = z2;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = str4;
    }

    public final void run() {
        String str;
        C130996Nh r1;
        String str2;
        C131556Pn r8 = this.A00;
        C134906bn r7 = this.A04;
        String str3 = this.A07;
        String str4 = this.A08;
        C122855vX r6 = this.A03;
        String str5 = this.A09;
        boolean z = this.A0A;
        boolean z2 = this.A0B;
        C160217ke r9 = this.A05;
        C159497jS r15 = this.A02;
        C128936Ee r12 = this.A01;
        String str6 = this.A06;
        HashMap hashMap = null;
        if (r7 != null) {
            str = r7.A01;
        } else {
            str = "PRELOAD";
        }
        if (str != "ASYNC_COMPONENT") {
            AnonymousClass6MZ r13 = r8.A03;
            AnonymousClass00C.A0D(str3, 0);
            String str7 = (String) ((C131616Pt) r8.A08.get()).A01(new AnonymousClass5OH(r13, str3, str4), str);
            if (str7 != null) {
                r6.A03 = true;
                int length = str7.length();
                HashMap A0J = AnonymousClass001.A0J();
                A0J.put("EVENT_PARAM_UNCOMPRESSED_SIZE", String.valueOf(length));
                r8.A05.A02(str5, "PAYLOAD_SIZE", A0J);
                if (z) {
                    r8.A01(r6, r7, r9, str7, z2);
                    return;
                }
                return;
            }
        }
        if (z) {
            r1 = r8.A05;
            str2 = "REQUEST_START";
        } else {
            hashMap = AnonymousClass001.A0J();
            hashMap.put("EVENT_PARAM_APP_ID", str3);
            hashMap.put("EVENT_PARAM_BLOKS_PARAMS", str4);
            r1 = r8.A05;
            str2 = "PREFETCH_REQUEST_START";
        }
        r1.A02(str5, str2, hashMap);
        String str8 = str5;
        String str9 = str3;
        C134906bn r20 = r7;
        C160217ke r21 = r9;
        C128936Ee r18 = r12;
        C122855vX r19 = r6;
        C131556Pn r17 = r8;
        r15.Blp(new C146006us(r17, r18, r19, r20, r21, str8, str9, str4, str6, z, z2));
    }
}
