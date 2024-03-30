package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1KT  reason: invalid class name */
public final class AnonymousClass1KT extends AnonymousClass1KS {
    public final AnonymousClass1KV A00;
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();
    public final AnonymousClass1KW A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1KT(X.C19970wo r16, X.C19630wG r17, X.AnonymousClass1KW r18, X.C19420v0 r19, X.AnonymousClass1KV r20, X.C20810yC r21, X.C21010yW r22, X.AnonymousClass1KU r23, X.C21670zc r24, X.C21690ze r25, X.C21430zE r26, X.C19770wU r27) {
        /*
            r15 = this;
            r0 = 1
            r3 = r16
            X.AnonymousClass00C.A0D(r3, r0)
            r0 = 2
            r4 = r17
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = 3
            r13 = r27
            X.AnonymousClass00C.A0D(r13, r0)
            r0 = 4
            r8 = r22
            X.AnonymousClass00C.A0D(r8, r0)
            r0 = 5
            r6 = r19
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 6
            r12 = r26
            X.AnonymousClass00C.A0D(r12, r0)
            r0 = 7
            r10 = r24
            X.AnonymousClass00C.A0D(r10, r0)
            r0 = 8
            r11 = r25
            X.AnonymousClass00C.A0D(r11, r0)
            r0 = 10
            r7 = r21
            X.AnonymousClass00C.A0D(r7, r0)
            r0 = 11
            r1 = r20
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 12
            r5 = r18
            X.AnonymousClass00C.A0D(r5, r0)
            r14 = 200750681(0xbf73659, float:9.522271E-32)
            r2 = r15
            r9 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A00 = r1
            r15.A03 = r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A02 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KT.<init>(X.0wo, X.0wG, X.1KW, X.0v0, X.1KV, X.0yC, X.0yW, X.1KU, X.0zc, X.0ze, X.0zE, X.0wU):void");
    }

    public final void A0B(int i, String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        A03(i, "error_type", str);
        if (str2 != null) {
            A03(i, "error_message", str2);
        }
    }

    public final void A0C(int i, short s) {
        A04(i, "bloks_cache_hit", true);
        A05(i, s);
    }

    public final void A0D(Jid jid, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass6BP A012;
        Integer valueOf;
        String obj;
        String str6 = str;
        int hashCode = str.hashCode();
        if (!((C21700zf) this.A05.getValue()).A06.isMarkerOn(this.A00, hashCode)) {
            A01(hashCode, str4);
            A06(jid, str2, str3, str6, hashCode);
            C20810yC r3 = this.A02;
            C21000yV r2 = C21000yV.A02;
            if (!(!C20800yB.A01(r2, r3, 6551) || (A012 = this.A00.A01(str2)) == null || (valueOf = Integer.valueOf(A012.A00)) == null || (obj = valueOf.toString()) == null)) {
                A03(hashCode, "flow_entry_point", obj);
            }
            String str7 = str5;
            if (str5 != null && str7.length() != 0 && C20800yB.A01(r2, r3, 7574)) {
                A03(hashCode, "rendering_stack", str7);
            }
        }
    }

    public final void A0E(boolean z, int i) {
        String str;
        if (z) {
            str = "encryption_1_end";
        } else {
            str = "encryption_end";
        }
        A08(Integer.valueOf(i), str);
    }

    public final void A0F(boolean z, int i) {
        String str;
        if (z) {
            str = "fetch_key_1_end";
        } else {
            str = "fetch_key_end";
        }
        A08(Integer.valueOf(i), str);
    }

    public final void A0G(boolean z, int i) {
        A04(i, "metadata_cache_hit", z);
    }
}
