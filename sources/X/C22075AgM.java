package X;

import java.util.UUID;

/* renamed from: X.AgM  reason: case insensitive filesystem */
public final class C22075AgM extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8AB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22075AgM(AnonymousClass8AB r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        UUID uuid;
        UUID uuid2;
        C22075AgM.super.A07();
        C200159gk r6 = AnonymousClass9AO.A01;
        AnonymousClass8AB r2 = this.this$0;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[WIFI_DIRECT]: start ");
        AnonymousClass88I r0 = r2.A00.A01.A07;
        if (r0 != null) {
            uuid = r0.A02;
        } else {
            uuid = null;
        }
        r6.A01("sup:WiFiDirectStateDelegate", AnonymousClass000.A0o(uuid, A0u));
        AnonymousClass8AB r4 = this.this$0;
        AnonymousClass84B r22 = r4.A00;
        AnonymousClass9Y3 r1 = r22.A01;
        AnonymousClass88I r02 = r1.A07;
        if (!(r02 == null || (uuid2 = r02.A02) == null)) {
            C203689oX r12 = r1.A08;
            if (r12 != null) {
                r12.A05 = new C22339Al1(r4);
            }
            C23090B4a b4a = r22.A0H;
            if (b4a != null) {
                b4a.BPK("wifi_direct_connection_request");
            }
            r6.A01("sup:WiFiDirectStateDelegate", "[WIFI_DIRECT]: Requesting WiFi Direct");
            C203689oX r23 = r4.A00.A01.A08;
            if (r23 != null) {
                C203689oX.A06(r23, C023109s.A0C, uuid2, new C22560Aop(r23, uuid2));
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
