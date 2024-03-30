package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.745  reason: invalid class name */
public final /* synthetic */ class AnonymousClass745 implements Runnable {
    public final /* synthetic */ C158247gc A00;
    public final /* synthetic */ C26461Kg A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass745(C158247gc r1, C26461Kg r2, UserJid userJid, Integer num, String str, String str2, String str3, boolean z) {
        this.A01 = r2;
        this.A03 = num;
        this.A00 = r1;
        this.A04 = str;
        this.A02 = userJid;
        this.A07 = z;
        this.A05 = str2;
        this.A06 = str3;
    }

    public final void run() {
        AnonymousClass5AZ A002;
        C26461Kg r6 = this.A01;
        Integer num = this.A03;
        C158247gc r5 = this.A00;
        String str = this.A04;
        UserJid userJid = this.A02;
        boolean z = this.A07;
        String str2 = this.A05;
        String str3 = this.A06;
        Integer num2 = null;
        if (r6.A0B(num)) {
            r5.BPu((C121585tN) null, 3, "extensions-metadata-response-error", true);
            return;
        }
        C26451Kf r3 = r6.A03;
        r3.A08(num, "metadata_network_start");
        AnonymousClass1KT r1 = r6.A02;
        if (str != null) {
            num2 = Integer.valueOf(str.hashCode());
        }
        r1.A08(num2, "metadata_network_start");
        if (str == null || !r6.A04.A0E(7352)) {
            A002 = r6.A00.A00(userJid.getRawString(), (String) null, 6712734982081747L);
        } else {
            if (num != null) {
                r3.A03(num.intValue(), "flow_id", str);
            }
            if (num != null) {
                r3.A03(num.intValue(), "endpoint_public_key_fetch_mode", "optional");
            }
            C26471Kh r32 = r6.A00;
            String rawString = userJid.getRawString();
            AnonymousClass00C.A0D(rawString, 1);
            A002 = r32.A00(rawString, str, 6848666948572627L);
        }
        A002.Blp(new C145996ur(r5, r6, userJid, num, str2, str3, str, z));
    }
}
