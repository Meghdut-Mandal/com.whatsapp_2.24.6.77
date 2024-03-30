package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Y8  reason: invalid class name */
public class AnonymousClass8Y8 extends AnonymousClass1LZ {
    public final C19970wo A00;
    public final C20310xM A01;
    public final C26171Jd A02;
    public final AnonymousClass1A1 A03;

    public String A0B() {
        return "regular_high";
    }

    public String A0C() {
        return "deleteMessageForMe";
    }

    public boolean A0H() {
        return true;
    }

    public C201669k5 A0A(C202599mH r22, String str, boolean z) {
        StringBuilder A0u;
        String str2;
        C202599mH r4 = r22;
        String[] strArr = r4.A06;
        C199769fw r9 = r4.A01;
        AnonymousClass8SS r2 = r4.A03;
        if (strArr.length == 5 && "deleteMessageForMe".equals(C165617ti.A0a(strArr))) {
            String str3 = strArr[1];
            C222713q r3 = AnonymousClass11F.A00;
            AnonymousClass11F A022 = r3.A02(str3);
            if (A022 == null) {
                A0u = AnonymousClass000.A0u();
                A0u.append("delete-message-for-me-mutation/from-key-value unable to create chat jid from ");
                str2 = strArr[1];
            } else {
                String str4 = strArr[3];
                Boolean A002 = C201839kV.A00(str4);
                if (A002 == null) {
                    A0u = AnonymousClass000.A0u();
                    A0u.append("delete-message-for-me-mutation/from-key-value value=");
                    A0u.append(str4);
                    A0u.append(" at index=");
                    A0u.append(3);
                    str2 = " is not one of the valid strings";
                } else if (C199769fw.A03.equals(r9) && r2 != null && C165577te.A1W(r2.bitField0_) && (r2.bitField0_ & DefaultCrypto.BUFFER_SIZE) != 0) {
                    AnonymousClass8PP r0 = r2.deleteMessageForMeAction_;
                    AnonymousClass8PP r1 = r0;
                    if (r0 == null) {
                        r0 = AnonymousClass8PP.DEFAULT_INSTANCE;
                    }
                    if ((r0.bitField0_ & 1) != 0) {
                        if (r1 == null) {
                            r1 = AnonymousClass8PP.DEFAULT_INSTANCE;
                        }
                        if ((r1.bitField0_ & 2) != 0) {
                            C64933Qa A0R = C165617ti.A0R(A022, strArr[2], A002.booleanValue());
                            AnonymousClass11F A023 = r3.A02(strArr[4]);
                            AnonymousClass8PP r12 = r2.deleteMessageForMeAction_;
                            AnonymousClass8PP r02 = r12;
                            if (r12 == null) {
                                r12 = AnonymousClass8PP.DEFAULT_INSTANCE;
                            }
                            boolean z2 = r12.deleteMedia_;
                            long j = r2.timestamp_;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            if (r02 == null) {
                                r02 = AnonymousClass8PP.DEFAULT_INSTANCE;
                            }
                            return new C176118bb(r4.A02, A023, A0R, str, j, timeUnit.toMillis(r02.messageTimestamp_), z2, z);
                        }
                    }
                }
            }
            C36321k7.A1Z(A0u, str2);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r4) {
        C176118bb r42 = (C176118bb) r4;
        AnonymousClass3T1 A032 = this.A03.A03(r42.A02);
        if (A032 != null) {
            this.A01.A0u(Collections.singleton(A032), r42.A03 ? 1 : 0);
            A05(r42);
        }
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r4) {
        C176118bb r42 = (C176118bb) r4;
        AnonymousClass3T1 A032 = this.A03.A03(r42.A02);
        if (A032 != null) {
            this.A01.A0u(Collections.singleton(A032), r42.A03 ? 1 : 0);
        }
        A06(r42);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r4, C201669k5 r5) {
        C176118bb r42 = (C176118bb) r4;
        C176118bb r52 = (C176118bb) r5;
        if (r52 == null) {
            AnonymousClass1A1 r0 = this.A03;
            C64933Qa r1 = r42.A02;
            AnonymousClass3T1 A032 = r0.A03(r1);
            if (A032 == null && (A032 = this.A02.A08(r1)) == null) {
                A08(r42);
                return;
            } else {
                this.A01.A0u(Collections.singleton(A032), r42.A03 ? 1 : 0);
            }
        } else if (r42.A03 || !r52.A03) {
            A09(r42, r52);
            return;
        }
        A07(r42);
    }

    public AnonymousClass8Y8(C19970wo r1, C20310xM r2, C26171Jd r3, AnonymousClass1AC r4, AnonymousClass1A1 r5) {
        super(r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r5;
        this.A02 = r3;
    }

    public List A0D(boolean z) {
        return AnonymousClass001.A0I();
    }
}
