package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.6PQ  reason: invalid class name */
public final class AnonymousClass6PQ {
    public final C101264xG A00;
    public final C101274xH A01;
    public final C101254xF A02;
    public final Map A03;
    public final Map A04 = Collections.synchronizedMap(C36431kI.A1G());
    public final AnonymousClass00T A05;

    public void A01(ARModelMetadataRequest aRModelMetadataRequest, AnonymousClass5VK r6, AnonymousClass6SG r7, boolean z) {
        short s;
        C36321k7.A0v(aRModelMetadataRequest, 0, r7);
        if (!A00(r7, this)) {
            C101254xF r3 = this.A02;
            String str = r7.A01;
            AnonymousClass00C.A08(str);
            int A0L = AnonymousClass000.A0L(aRModelMetadataRequest.mCapability.name(), C90474aD.A1a(str));
            if (!z) {
                if (r6 != null) {
                    String A002 = r6.A00();
                    AnonymousClass00C.A08(A002);
                    r3.A03(A0L, "failure_reason", A002);
                }
                s = 3;
            } else {
                s = 2;
            }
            r3.A04(A0L, s);
        }
    }

    public void A02(ARModelMetadataRequest aRModelMetadataRequest, AnonymousClass6SG r7, int i, boolean z) {
        String str;
        AnonymousClass00C.A0D(r7, 3);
        if (!A00(r7, this)) {
            C101254xF r4 = this.A02;
            String str2 = r7.A01;
            AnonymousClass00C.A08(str2);
            int A0L = AnonymousClass000.A0L(aRModelMetadataRequest.mCapability.name(), C90474aD.A1a(str2));
            if (z) {
                str = "model_cache_check_hit";
            } else {
                str = "model_cache_check_miss";
            }
            r4.A02(A0L, str);
            r4.A00.markerAnnotate(22413317, A0L, "version", i);
            if (z) {
                r4.A04(A0L, 2);
            }
        }
    }

    public void A03(C135056c3 r10, AnonymousClass5VK r11, AnonymousClass6SG r12, boolean z) {
        String str;
        int i;
        String str2;
        C36321k7.A0v(r10, 0, r12);
        this.A04.remove(r10.A01.A0A);
        if (!A00(r12, this)) {
            C101274xH r3 = this.A01;
            long A002 = C101274xH.A00(r12, r3);
            synchronized (r3) {
                if (r3.A00 == A002) {
                    r3.A00 = 0;
                }
            }
            if (z) {
                AnonymousClass5JT r0 = r3.A01;
                if (r0 != null) {
                    r0.flowEndSuccess(A002);
                } else {
                    UserFlowLogger userFlowLogger = r3.A00;
                    if (userFlowLogger != null) {
                        userFlowLogger.flowEndSuccess(A002);
                    } else {
                        throw C36381kD.A0l();
                    }
                }
            } else {
                if (r11 != null) {
                    r3.A04(A002, "failure_reason", r11.toString());
                    str = r11.mType.name();
                    i = 0;
                    str2 = r11.A00();
                    AnonymousClass00C.A08(str2);
                } else {
                    str = "unknown";
                    i = 0;
                    str2 = str;
                }
                r3.A03(A002, str, i, str2);
            }
            this.A03.remove(r12.A01);
        }
    }

    public static final boolean A00(AnonymousClass6SG r1, AnonymousClass6PQ r2) {
        if (C36331k8.A1b(r2.A05) || r1.A02) {
            return true;
        }
        return false;
    }

    public AnonymousClass6PQ(C116505kh r3, C19970wo r4, C20810yC r5, C21690ze r6, AnonymousClass5JT r7) {
        C36321k7.A18(r4, r5, r7, r6);
        this.A05 = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass7JY(r5));
        Map synchronizedMap = Collections.synchronizedMap(C36431kI.A1G());
        this.A03 = synchronizedMap;
        AnonymousClass00C.A08(synchronizedMap);
        this.A01 = new C101274xH(r3, r7, synchronizedMap);
        this.A02 = new C101254xF(r4, r6, synchronizedMap);
        this.A00 = new C101264xG(r3, r4, r6, synchronizedMap);
    }
}
