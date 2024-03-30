package X;

import com.whatsapp.util.Log;

/* renamed from: X.6xj  reason: invalid class name and case insensitive filesystem */
public final class C147756xj implements C236119d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass67G A01;
    public final /* synthetic */ C128936Ee A02;
    public final /* synthetic */ AnonymousClass6KM A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public void BWw(C203399nx r13, String str) {
        AnonymousClass00C.A0D(r13, 1);
        Log.e("RecordDisclosureAcceptanceAction/sendData:onError");
        int A002 = AnonymousClass3ME.A00(r13);
        AnonymousClass6KM r7 = this.A03;
        AnonymousClass67G r5 = this.A01;
        C128936Ee r6 = this.A02;
        C1501073z r4 = new C1501073z(r5, r6, r7, this.A06, this.A05, this.A04, this.A00);
        if (A002 != 304) {
            if (A002 != 405) {
                if (A002 != 429) {
                    if (A002 != 481) {
                        if (A002 != 500) {
                            if (!(A002 == 503 || A002 == 400 || A002 == 401)) {
                                if (!(A002 == 408 || A002 == 409)) {
                                    return;
                                }
                            }
                        }
                    } else if (r6.A04()) {
                        r4.run();
                        return;
                    }
                }
                Long A012 = r6.A01();
                if (A012 != null) {
                    r7.A01.BpM(r4, "RecordDisclosureAcceptanceAction/retryWithBackoff", A012.longValue());
                    return;
                }
            }
            AnonymousClass17Y r3 = r5.A00.A00;
            if (r3 != null) {
                r3.A0H(AnonymousClass74N.A00(r5.A03, r5.A01, 40));
                return;
            }
            throw C36321k7.A06();
        }
        AnonymousClass17Y r32 = r5.A00.A00;
        if (r32 != null) {
            r32.A0H(AnonymousClass74N.A00(r5.A03, r5.A02, 39));
            return;
        }
        throw C36321k7.A06();
    }

    public C147756xj(AnonymousClass67G r1, C128936Ee r2, AnonymousClass6KM r3, String str, String str2, String str3, int i) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
    }

    public void BVN(String str) {
        Log.e("RecordDisclosureAcceptanceAction/sendData:onDeliveryFailure");
        AnonymousClass67G r1 = this.A01;
        AnonymousClass17Y r3 = r1.A00.A00;
        if (r3 != null) {
            r3.A0H(AnonymousClass74N.A00(r1.A03, r1.A01, 40));
            return;
        }
        throw C36321k7.A06();
    }

    public void BiM(C203399nx r5, String str) {
        Log.i("RecordDisclosureAcceptanceAction/sendData:onSuccess");
        AnonymousClass67G r1 = this.A01;
        AnonymousClass17Y r3 = r1.A00.A00;
        if (r3 != null) {
            r3.A0H(AnonymousClass74N.A00(r1.A03, r1.A02, 39));
            return;
        }
        throw C36321k7.A06();
    }
}
