package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.6yY  reason: invalid class name and case insensitive filesystem */
public final class C148246yY implements C161247mR {
    public AnonymousClass5JN A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass19J A02;
    public final C20810yC A03;
    public final AnonymousClass1MN A04;
    public final AnonymousClass1PW A05;

    public void BJc(String str, Map map) {
        AnonymousClass00C.A0D(map, 1);
        if (C108905Vk.A00) {
            C132636Up.A00(this.A05, "start_foreground_service_from_push");
        }
        Object obj = map.get("push_payload");
        if (obj != null && (obj instanceof AnonymousClass5JN)) {
            C20810yC r2 = this.A03;
            if (r2.A07(4116) >= 2) {
                AnonymousClass5JN r3 = (AnonymousClass5JN) obj;
                String str2 = r3.A07;
                if (AnonymousClass00C.A0J(str2, "voip_call_offer_1on1")) {
                    if (!r2.A0E(6334)) {
                        A00(this, r3);
                    } else {
                        this.A01.A0H(new C1501974i(this, r3, 5));
                    }
                } else if (AnonymousClass00C.A0J(str2, "call_terminate") && C108905Vk.A00 && r2.A0E(6405)) {
                    this.A05.A00(new C132636Up("handle_push_payload", obj));
                }
            }
        }
    }

    public static final void A00(C148246yY r7, AnonymousClass5JN r8) {
        Log.i("CallingIncomingPushObserver/postPushPayloadWithPing");
        AnonymousClass19J r1 = r7.A02;
        if (r1.A06 && r1.A04 == 2) {
            String str = r8.A06;
            C20810yC r12 = r7.A03;
            if (r12.A0E(6005)) {
                Log.i("CallingIncomingPushObserver/sendPing");
                AnonymousClass1MN r6 = r7.A04;
                C147696xd r5 = new C147696xd(r7, str);
                long A0B = C36441kJ.A0B(r12, 6006);
                if (1000 > A0B || A0B >= 32001) {
                    A0B = 8000;
                }
                r6.A0A(r5, A0B);
            }
        }
        r7.A05.A00(new C132636Up("handle_push_payload", (Object) r8));
    }

    public boolean BtD(C1267065d r3, Long l, String str) {
        String str2;
        if (!C108905Vk.A00) {
            if (r3 != null) {
                str2 = r3.A00();
            } else {
                str2 = null;
            }
            if (AnonymousClass00C.A0J(str2, "voip_call_offer_1on1")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C148246yY(AnonymousClass17Y r1, AnonymousClass19J r2, AnonymousClass1PW r3, C20810yC r4, AnonymousClass1MN r5) {
        C36321k7.A1B(r4, r1, r2, r5, r3);
        this.A03 = r4;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r5;
        this.A05 = r3;
    }
}
