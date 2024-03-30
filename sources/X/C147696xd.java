package X;

/* renamed from: X.6xd  reason: invalid class name and case insensitive filesystem */
public final class C147696xd implements C236119d {
    public final /* synthetic */ C148246yY A00;
    public final /* synthetic */ String A01;

    public C147696xd(C148246yY r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public void BVN(String str) {
        StringBuilder A0i = C36341k9.A0i(str);
        A0i.append("CallingIncomingPushObserver/sendPing/onDeliveryFailure: callId = ");
        A0i.append(this.A01);
        C36321k7.A1P(", iqId = ", str, A0i);
        AnonymousClass1MN r3 = this.A00.A04;
        r3.A07.post(new C35711j8(r3, 14));
    }

    public void BWw(C203399nx r3, String str) {
        StringBuilder A0i = C36341k9.A0i(str);
        A0i.append("CallingIncomingPushObserver/sendPing/onError: callId = ");
        A0i.append(this.A01);
        C36321k7.A1P(", iqId = ", str, A0i);
    }

    public void BiM(C203399nx r3, String str) {
        StringBuilder A0i = C36341k9.A0i(str);
        A0i.append("CallingIncomingPushObserver/sendPing/onSuccess: callId = ");
        A0i.append(this.A01);
        C36321k7.A1Q(", iqId = ", str, A0i);
    }
}
