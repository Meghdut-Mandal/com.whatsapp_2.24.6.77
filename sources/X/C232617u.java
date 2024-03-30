package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.17u  reason: invalid class name and case insensitive filesystem */
public final class C232617u extends AnonymousClass12N {
    public final int A00;
    public final C232717v A01;
    public final C220412q A02;
    public final AnonymousClass12P A03;
    public final AnonymousClass12O A04;
    public final C20810yC A05;
    public final C220112n A06;
    public final Map A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C232617u(C220412q r3, AnonymousClass12P r4, AnonymousClass12O r5, C20810yC r6, C220112n r7) {
        super(r7);
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r7, 5);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C232717v r0 = new C232717v();
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A07 = concurrentHashMap;
        this.A01 = r0;
        int A002 = C20800yB.A00(C21000yV.A02, r6, 7862);
        this.A00 = A002;
        if (A002 >= 0) {
            A08();
        }
    }

    public final AnonymousClass6X6 A09(AnonymousClass144 r2) {
        AnonymousClass00C.A0D(r2, 0);
        return (AnonymousClass6X6) this.A07.get(r2);
    }

    public void Bjh(AnonymousClass5SK r3, boolean z) {
        AnonymousClass00C.A0D(r3, 1);
        if (r3.ordinal() >= this.A00) {
            this.A07.clear();
        }
    }

    public String BHv() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupParticipantCache/");
        sb.append(this.A07.size());
        return sb.toString();
    }
}
