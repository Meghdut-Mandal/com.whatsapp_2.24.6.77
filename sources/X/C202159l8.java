package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.9l8  reason: invalid class name and case insensitive filesystem */
public class C202159l8 {
    public static final C202159l8 A0E;
    public static final C202159l8 A0F;
    public static final C202159l8 A0G;
    public static final C202159l8[] A0H;
    public final int A00;
    public final int A01;
    public final AnonymousClass16U A02;
    public final String A03;
    public final String A04;
    public final LinkedHashSet A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final int[] A09;
    public final int[] A0A;
    public final C24851Ea[] A0B;
    public final C24851Ea[] A0C;
    public final C24851Ea[] A0D;

    static {
        AnonymousClass16U r14 = AnonymousClass16W.A06;
        C202159l8 r13 = new C202159l8(r14, "UNSET", "UNSET", new LinkedHashSet(Collections.singletonList(r14)), (int[]) null, (int[]) null, (C24851Ea[]) null, (C24851Ea[]) null, new C24851Ea[0], 0, 0, false, false, false);
        A0G = r13;
        AnonymousClass16U r15 = AnonymousClass16W.A05;
        LinkedHashSet linkedHashSet = new LinkedHashSet(Collections.singletonList(r15));
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        int[] iArr = {2};
        int[] iArr2 = {2};
        C202159l8 r142 = new C202159l8(r15, "IN", "91", linkedHashSet2, iArr, iArr2, new C24851Ea[]{new C24851Ea("tos_no_wallet", "1", false), new C24851Ea("add_bank", "1", false), new C24851Ea("2fa", "1", false)}, new C24851Ea[]{new C24851Ea("add_payment_service", "1", false)}, new C24851Ea[0], 3, 3, true, true, true);
        A0F = r142;
        AnonymousClass16U r16 = AnonymousClass16W.A04;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet(Collections.singletonList(r16));
        LinkedHashSet linkedHashSet4 = linkedHashSet3;
        int[] iArr3 = {1, 4, 6};
        C202159l8 r152 = new C202159l8(r16, "BR", "55", linkedHashSet4, iArr3, new int[]{1, 4, 6}, new C24851Ea[]{new C24851Ea("tos_no_wallet", "1", false), new C24851Ea("kyc", "1", false), new C24851Ea("add_card", "1", false)}, new C24851Ea[]{new C24851Ea("add_business", "1", false)}, new C24851Ea[]{new C24851Ea("custom_payment_method_tos", "1", false)}, 1, 1, true, true, false);
        A0E = r152;
        A0H = new C202159l8[]{r13, r142, r152};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r1.A03.equalsIgnoreCase(r6) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C202159l8 A00(java.lang.String r6) {
        /*
            if (r6 == 0) goto L_0x0022
            X.9l8[] r5 = A0H
            r4 = 3
            r3 = 0
            r2 = 0
        L_0x0007:
            r1 = r5[r2]
            java.lang.String r0 = r1.A03
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x0021
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x0007
            X.9l8[] r0 = X.C190909Au.A00
            r1 = r0[r3]
            java.lang.String r0 = r1.A03
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            return r1
        L_0x0022:
            X.9l8 r0 = A0G
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202159l8.A00(java.lang.String):X.9l8");
    }

    public AnonymousClass16U A02() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            AnonymousClass16U r1 = (AnonymousClass16U) it.next();
            if (((AnonymousClass16V) r1).A00 == 0) {
                return r1;
            }
        }
        return null;
    }

    public C24851Ea[] A03(String str) {
        if ("merchant_account_linking_context".equals(str)) {
            return this.A0C;
        }
        if ("custom_payment_method_linking".equals(str)) {
            return this.A0B;
        }
        return this.A0D;
    }

    public C202159l8(AnonymousClass16U r1, String str, String str2, LinkedHashSet linkedHashSet, int[] iArr, int[] iArr2, C24851Ea[] r7, C24851Ea[] r8, C24851Ea[] r9, int i, int i2, boolean z, boolean z2, boolean z3) {
        C18740tg.A05(str);
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A05 = linkedHashSet;
        this.A08 = z2;
        this.A09 = iArr;
        this.A0A = iArr2;
        this.A0D = r7;
        this.A0C = r8;
        this.A0B = r9;
        this.A07 = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1.A04.equalsIgnoreCase(r6) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C202159l8 A01(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0026
            X.9l8[] r5 = A0H
            r4 = 3
            r3 = 0
            r2 = 0
        L_0x000b:
            r1 = r5[r2]
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0025
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x000b
            X.9l8[] r0 = X.C190909Au.A00
            r1 = r0[r3]
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            return r1
        L_0x0026:
            X.9l8 r0 = A0G
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202159l8.A01(java.lang.String):X.9l8");
    }
}
