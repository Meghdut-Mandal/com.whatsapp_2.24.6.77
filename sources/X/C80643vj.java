package X;

import java.util.Map;

/* renamed from: X.3vj  reason: invalid class name and case insensitive filesystem */
public class C80643vj implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public C80643vj(Object obj, Object obj2, String str, String str2, String str3, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = obj2;
    }

    public final void run() {
        AnonymousClass005 r1;
        String A0f;
        String A0h;
        if (this.A05 != 0) {
            C145366tm r12 = (C145366tm) this.A00;
            String str = this.A02;
            String str2 = this.A03;
            String str3 = this.A04;
            Map map = (Map) this.A01;
            AnonymousClass00C.A0D(map, 4);
            r12.A08.A03(str, str2, r12.A0E, str3, map);
            return;
        }
        AnonymousClass3TX r3 = (AnonymousClass3TX) this.A00;
        String str4 = this.A02;
        String str5 = this.A03;
        String str6 = this.A04;
        Map map2 = (Map) this.A01;
        AnonymousClass00C.A0D(map2, 4);
        AnonymousClass3UV r2 = (AnonymousClass3UV) r3.A01.get();
        synchronized (r3) {
            r1 = r3.A02;
            A0f = ((C19420v0) r1.get()).A0f();
            AnonymousClass00C.A08(A0f);
        }
        synchronized (r3) {
            A0h = ((C19420v0) r1.get()).A0h();
            AnonymousClass00C.A08(A0h);
        }
        synchronized (r3) {
        }
        if (r2.A0I()) {
            byte[] A0K = r2.A0K(A0f, A0h);
            byte[] A0J = r2.A0J("sendClientFunnelLog");
            AnonymousClass3PM.A00(new C50432ku(r2.A08, r2.A09, A0f, A0h, str4, str5, str6, map2, A0K, A0J));
        }
    }
}
