package X;

/* renamed from: X.6xe  reason: invalid class name and case insensitive filesystem */
public final class C147706xe implements C236119d {
    public final /* synthetic */ C27701Pj A00;
    public final /* synthetic */ String A01;

    public C147706xe(C27701Pj r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public void BVN(String str) {
        StringBuilder A0i = C36341k9.A0i(str);
        A0i.append("VoiceChatAcceptPingManager/sendPing/onDeliveryFailure: callId = ");
        String str2 = this.A01;
        A0i.append(str2);
        C36321k7.A1P(", iqId = ", str, A0i);
        C27701Pj r5 = this.A00;
        C122795vR r4 = (C122795vR) r5.A04.remove(str2);
        if (r4 != null) {
            AnonymousClass1MN r3 = r5.A02;
            r3.A07.post(new C35711j8(r3, 14));
            r5.A00.A01(r4);
        }
    }

    public void BWw(C203399nx r4, String str) {
        StringBuilder A0i = C36341k9.A0i(str);
        A0i.append("VoiceChatAcceptPingManager/sendPing/onError: callId = ");
        String str2 = this.A01;
        A0i.append(str2);
        C36321k7.A1P(", iqId = ", str, A0i);
        this.A00.A04.remove(str2);
    }

    public void BiM(C203399nx r4, String str) {
        StringBuilder A0i = C36341k9.A0i(str);
        A0i.append("VoiceChatAcceptPingManager/sendPing/onSuccess: callId = ");
        String str2 = this.A01;
        A0i.append(str2);
        C36321k7.A1Q(", iqId = ", str, A0i);
        this.A00.A04.remove(str2);
    }
}
