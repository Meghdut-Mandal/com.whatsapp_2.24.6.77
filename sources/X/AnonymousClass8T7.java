package X;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8T7  reason: invalid class name */
public class AnonymousClass8T7 extends C200269h0 {
    public final C195299Tr A00;
    public final boolean A01;
    public final boolean A02;

    public C200269h0 A07(AnonymousClass9LX r7) {
        Object A002;
        if (this.A01) {
            try {
                C194869Ro r4 = new C194869Ro();
                r4.A00 = r7.A00.A00;
                r4.A03.addAll(Arrays.asList(new C188068yz[]{C188068yz.REQUIRE_PROPERTIES}));
                if (this.A00.A00(r4.A00(), r7.A01, r7.A02).A00() == C23091B4b.A00) {
                    return B4C.A00;
                }
                return B4C.A01;
            } catch (C173698Sr unused) {
                return B4C.A00;
            }
        } else {
            try {
                C195299Tr r5 = this.A00;
                if (r5.A01) {
                    HashMap hashMap = r7.A03;
                    if (hashMap.containsKey(r5)) {
                        r5.toString();
                        A002 = hashMap.get(r5);
                    } else {
                        Object obj = r7.A02;
                        A002 = r5.A00(r7.A00, obj, obj).A00();
                        hashMap.put(r5, A002);
                    }
                } else {
                    A002 = r5.A00(r7.A00, r7.A01, r7.A02).A00();
                }
                C194879Rp r1 = r7.A00;
                if (A002 instanceof Number) {
                    return new AnonymousClass8TC((CharSequence) A002.toString());
                }
                if (A002 instanceof String) {
                    return new AnonymousClass8T8(A002.toString(), false);
                }
                if (A002 instanceof Boolean) {
                    if (Boolean.parseBoolean(A002.toString().toString())) {
                        return B4C.A01;
                    }
                    return B4C.A00;
                } else if (A002 instanceof OffsetDateTime) {
                    return new AnonymousClass8T9(A002.toString());
                } else {
                    if (A002 == null) {
                        return B4C.A02;
                    }
                    if (A002 instanceof List) {
                        return new AnonymousClass8TB(r1.A01.A01(List.class, A002));
                    }
                    if (A002 instanceof Map) {
                        return new AnonymousClass8TB(r1.A01.A01(Map.class, A002));
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Could not convert ");
                    C36351kA.A1K(A002.getClass(), A0u);
                    C165567td.A1M(A002, ":", A0u);
                    throw new C21831Ab9(AnonymousClass000.A0q(" to a ValueNode", A0u));
                }
            } catch (C173698Sr unused2) {
                return B4C.A03;
            }
        }
    }

    public String toString() {
        if (!this.A01 || this.A02) {
            return this.A00.toString();
        }
        CharSequence[] charSequenceArr = new CharSequence[2];
        charSequenceArr[0] = "!";
        C90514aH.A1Q(this.A00, charSequenceArr, 1);
        return C201749kK.A02(charSequenceArr);
    }

    public AnonymousClass8T7(C195299Tr r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }
}
