package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.73g  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1499173g implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C121845to A03;
    public final /* synthetic */ AnonymousClass6L7 A04;
    public final /* synthetic */ short A05;

    public /* synthetic */ C1499173g(C121845to r1, AnonymousClass6L7 r2, int i, int i2, long j, short s) {
        this.A04 = r2;
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = s;
        this.A02 = j;
    }

    public final void run() {
        AnonymousClass6L7 r5 = this.A04;
        C121845to r4 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        short s = this.A05;
        long j = this.A02;
        HashMap A0J = AnonymousClass001.A0J();
        String str = r5.A03;
        if (str != null) {
            A0J.put("direct_connection_status", str);
        }
        String str2 = r5.A01;
        if (str2 != null) {
            A0J.put("biz_id", str2);
        }
        String str3 = r5.A02;
        if (str3 != null) {
            A0J.put("biz_type", str3);
        }
        String str4 = r5.A04;
        if (str4 != null) {
            A0J.put("server_origin", str4);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(A0J);
        AnonymousClass00C.A08(unmodifiableMap);
        Iterator A0y = AnonymousClass000.A0y(unmodifiableMap);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            r4.A00.markerAnnotate(i, i2, C90494aF.A0f(A11), C90514aH.A10(A11));
        }
        HashMap A0J2 = AnonymousClass001.A0J();
        Boolean bool = r5.A00;
        if (bool != null && bool.booleanValue()) {
            A0J2.put("cached", C36371kC.A0m());
        }
        Map unmodifiableMap2 = Collections.unmodifiableMap(A0J2);
        AnonymousClass00C.A08(unmodifiableMap2);
        Iterator A0y2 = AnonymousClass000.A0y(unmodifiableMap2);
        while (A0y2.hasNext()) {
            Map.Entry A112 = AnonymousClass000.A11(A0y2);
            r4.A00.markerAnnotate(i, i2, C90494aF.A0f(A112), AnonymousClass000.A1X(A112.getValue()));
        }
        r4.A00.markerEnd(i, i2, s, j, TimeUnit.MILLISECONDS);
    }
}
