package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.53z  reason: invalid class name */
public class AnonymousClass53z extends AnonymousClass1LZ {
    public final C19730wQ A00;
    public final C19970wo A01;

    public C201669k5 A0A(C202599mH r12, String str, boolean z) {
        AnonymousClass00C.A0D(r12, 1);
        String[] strArr = r12.A06;
        AnonymousClass00C.A07(strArr);
        if (strArr.length == 2 && "primary_version".equals(strArr[0])) {
            String str2 = strArr[1];
            if (AnonymousClass00C.A0J(str2, "current") || AnonymousClass00C.A0J(str2, "session_start")) {
                C199769fw r1 = r12.A01;
                AnonymousClass00C.A07(r1);
                AnonymousClass8SS r2 = r12.A03;
                if (AnonymousClass00C.A0J(C199769fw.A03, r1) && r2 != null && r2.A0u() && (r2.bitField0_ & 67108864) != 0) {
                    C99824u1 r0 = r2.primaryVersionAction_;
                    if (r0 == null) {
                        r0 = C99824u1.DEFAULT_INSTANCE;
                    }
                    if ((r0.bitField0_ & 1) != 0) {
                        long j = r2.timestamp_;
                        AnonymousClass00C.A0B(str2);
                        C99824u1 r02 = r2.primaryVersionAction_;
                        if (r02 == null) {
                            r02 = C99824u1.DEFAULT_INSTANCE;
                        }
                        String str3 = r02.version_;
                        AnonymousClass00C.A08(str3);
                        return new C1032254l(r12.A02, str2, str3, str, j);
                    }
                }
            }
        }
        return null;
    }

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "primary_version";
    }

    public List A0D(boolean z) {
        ArrayList A14 = C36441kJ.A14(2);
        A14.add(A0I("current"));
        if (!z) {
            A14.add(A0I("session_start"));
        }
        return A14;
    }

    public boolean A0H() {
        return true;
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r3) {
        C18740tg.A0D(false, "PrimaryVersionMutation shouldn't have dependencies");
        A05(r3);
    }

    public C1032254l A0I(String str) {
        C18740tg.A0C(!this.A00.A0L());
        long A002 = C19970wo.A00(this.A01);
        Objects.requireNonNull("2.24.6.77");
        return new C1032254l((C201539jo) null, str, "2.24.6.77", (String) null, A002);
    }

    public AnonymousClass53z(C19730wQ r1, C19970wo r2, AnonymousClass1AC r3) {
        super(r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r1) {
        A06(r1);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r1, C201669k5 r2) {
        A07(r1);
    }
}
