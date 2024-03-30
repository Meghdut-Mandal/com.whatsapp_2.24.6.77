package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8YD  reason: invalid class name */
public class AnonymousClass8YD extends AnonymousClass1LZ {
    public final C19730wQ A00;
    public final AnonymousClass1A9 A01;
    public final C19970wo A02;

    public String A0B() {
        return null;
    }

    public String A0C() {
        return "sentinel";
    }

    public boolean A0H() {
        return true;
    }

    public C201669k5 A0A(C202599mH r14, String str, boolean z) {
        String[] strArr = r14.A06;
        C199769fw r3 = r14.A01;
        AnonymousClass8SS r2 = r14.A03;
        if (strArr.length == 2 && "sentinel".equals(C165617ti.A0a(strArr))) {
            String str2 = strArr[1];
            if (!C201669k5.A08.contains(str2)) {
                C36321k7.A1P("sentinel-mutation/from-key-value unknown collectionName: ", str2, AnonymousClass000.A0u());
            } else if (C199769fw.A03.equals(r3) && r2 != null && C165577te.A1W(r2.bitField0_) && (r2.bitField0_ & 16384) != 0) {
                AnonymousClass8OC r0 = r2.keyExpiration_;
                AnonymousClass8OC r1 = r0;
                if (r0 == null) {
                    r0 = AnonymousClass8OC.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 1) != 0) {
                    long j = r2.timestamp_;
                    if (r1 == null) {
                        r1 = AnonymousClass8OC.DEFAULT_INSTANCE;
                    }
                    return new C175988bO(r14.A02, str, str2, r1.expiredKeyEpoch_, j, z);
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r3) {
        C175988bO r32 = (C175988bO) r3;
        this.A01.A08(r32.A00);
        A05(r32);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r3, C201669k5 r4) {
        C175988bO r32 = (C175988bO) r3;
        C175988bO r42 = (C175988bO) r4;
        if (r42 == null || r42.A00 <= r32.A00) {
            this.A01.A08(r32.A00);
            A09(r32, r42);
            return;
        }
        A07(r32);
    }

    public AnonymousClass8YD(C19730wQ r1, AnonymousClass1A9 r2, C19970wo r3, AnonymousClass1AC r4) {
        super(r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public static ArrayList A00(AnonymousClass8YD r11, boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        int A012 = r11.A01.A09.A01();
        if (A012 != 0) {
            Iterator it = C201669k5.A08.iterator();
            while (it.hasNext()) {
                A0I.add(new C175988bO((C201539jo) null, (String) null, AnonymousClass001.A0C(it), A012, C19970wo.A00(r11.A02), z));
            }
        }
        return A0I;
    }

    public List A0D(boolean z) {
        return Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r1) {
    }
}
