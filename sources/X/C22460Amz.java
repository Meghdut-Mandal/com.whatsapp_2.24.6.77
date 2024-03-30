package X;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.Amz  reason: case insensitive filesystem */
public final class C22460Amz extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $onDeviceFound;
    public final /* synthetic */ A32 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22460Amz(A32 a32, C006302t r3) {
        super(1);
        this.this$0 = a32;
        this.$onDeviceFound = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        UUID uuid;
        String str2;
        List list = (List) obj;
        AnonymousClass00C.A0D(list, 0);
        C200159gk r5 = AnonymousClass9AO.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36371kC.A1R("Found ", A0u, list);
        r5.A01("sup:LAMDeviceDiscoveryManager", AnonymousClass000.A0q(" device config(s).", A0u));
        AnonymousClass88C r1 = (AnonymousClass88C) C007103b.A0M(list);
        if (r1 != null) {
            AnonymousClass931.A02 = r1.A06;
            AnonymousClass931.A00 = r1.A02;
            AnonymousClass931.A01 = r1.A05;
            AnonymousClass931.A03 = r1.A07;
        }
        ArrayList<AnonymousClass88C> A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            AnonymousClass88C r12 = (AnonymousClass88C) next;
            if ((!AnonymousClass098.A06(C36381kD.A0y(r12.A09))) && (str2 = r12.A01) != null && (!AnonymousClass098.A06(str2)) && r12.A00 != null) {
                A0I.add(next);
            }
        }
        ArrayList<AnonymousClass88I> A0J = C36321k7.A0J(A0I);
        for (AnonymousClass88C r3 : A0I) {
            A0J.add(new AnonymousClass88I((C199069ee) null, r3, r3.A09));
        }
        if (C36401kF.A1a(A0J)) {
            for (AnonymousClass88I r2 : A0J) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Device Config:");
                StringBuilder A0y = C165607th.A0y(A0u2);
                A0y.append("  - BtcAddress = ");
                AnonymousClass88C r32 = r2.A01;
                AnonymousClass887 r22 = null;
                if (r32 != null) {
                    str = r32.A01;
                } else {
                    str = null;
                }
                A0y.append(str);
                C36351kA.A1K(A0y, A0u2);
                StringBuilder A0y2 = C165607th.A0y(A0u2);
                A0y2.append("  - serviceUUID = ");
                if (r32 != null) {
                    uuid = r32.A09;
                } else {
                    uuid = null;
                }
                A0y2.append(uuid);
                C36351kA.A1K(A0y2, A0u2);
                StringBuilder A0y3 = C165607th.A0y(A0u2);
                A0y3.append("  - linkSecurity = ");
                if (r32 != null) {
                    r22 = r32.A00;
                }
                A0y3.append(r22);
                C36351kA.A1K(A0y3, A0u2);
                String A0t = AnonymousClass000.A0t(A0u2, 10);
                AnonymousClass00C.A08(A0t);
                r5.A01("sup:LAMDeviceDiscoveryManager", A0t);
            }
            this.$onDeviceFound.invoke(A0J);
        } else {
            r5.A06("sup:LAMDeviceDiscoveryManager", "No valid devices found.", (Throwable) null);
        }
        return AnonymousClass0AJ.A00;
    }
}
