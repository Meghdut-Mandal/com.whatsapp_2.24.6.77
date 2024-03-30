package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.53w  reason: invalid class name */
public final class AnonymousClass53w extends AnonymousClass1LZ {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C236419g A02;
    public final AnonymousClass1AC A03;
    public final C20810yC A04;

    public C201669k5 A0A(C202599mH r18, String str, boolean z) {
        C100074uQ r6;
        String str2;
        C107265Nh A042;
        long j;
        C201539jo r12;
        AnonymousClass6BL r10;
        C202599mH r4 = r18;
        AnonymousClass00C.A0D(r4, 2);
        C19730wQ r9 = this.A00;
        String[] strArr = r4.A06;
        AnonymousClass00C.A07(strArr);
        if (strArr.length == 4 && "call_log".equals(strArr[0])) {
            UserJid A022 = UserJid.Companion.A02(strArr[1]);
            if (A022 == null) {
                str2 = "CallLogSyncMutation/fromKeyValue unable to create call creator jid";
            } else {
                Boolean A002 = C201839kV.A00(strArr[3]);
                if (A002 == null) {
                    str2 = "CallLogSyncMutation/fromKeyValue unable to create is incoming value";
                } else {
                    String str3 = strArr[2];
                    C199769fw r62 = r4.A01;
                    AnonymousClass00C.A07(r62);
                    AnonymousClass8SS r5 = r4.A03;
                    if (r5 != null && r5.A0u()) {
                        C199769fw r11 = C199769fw.A02;
                        if (r11.equals(r62)) {
                            r12 = r4.A02;
                            AnonymousClass00C.A0B(str3);
                            r10 = new AnonymousClass6BL(A022, str3, A002.booleanValue());
                            A042 = null;
                            j = 0;
                        } else {
                            C99804tz r0 = r5.callLogAction_;
                            if ((r0 == null && (r0 = C99804tz.DEFAULT_INSTANCE) == null) || ((r6 = r0.callLogRecord_) == null && (r6 = C100074uQ.DEFAULT_INSTANCE) == null)) {
                                return null;
                            }
                            if (!AnonymousClass00C.A0J(A022.getRawString(), r6.callCreatorJid_) || !AnonymousClass00C.A0J(str3, r6.callId_) || !A002.equals(Boolean.valueOf(r6.isIncoming_))) {
                                str2 = "CallLogSyncMutation/fromKeyValue critical values are not matched in mutation index and value";
                            } else {
                                A042 = AnonymousClass6W3.A00.A04(r6);
                                if (A042 != null) {
                                    j = r5.timestamp_;
                                    r12 = r4.A02;
                                    r11 = C199769fw.A03;
                                    AnonymousClass00C.A09(r11);
                                    AnonymousClass00C.A0B(str3);
                                    r10 = new AnonymousClass6BL(A022, str3, A002.booleanValue());
                                }
                            }
                        }
                        return new C1032054j(r9, r10, r11, r12, A042, str, j);
                    }
                }
            }
            Log.e(str2);
        }
        return null;
    }

    public String A0B() {
        return "regular";
    }

    public String A0C() {
        return "call_log";
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r3) {
        AnonymousClass00C.A0D(r3, 0);
        C18740tg.A0D(false, "CallLogSyncMutation shouldn't have dependencies");
        A05(r3);
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A06(r2);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r2, C201669k5 r3) {
        AnonymousClass00C.A0D(r2, 0);
        A07(r2);
    }

    public boolean A0H() {
        C20810yC r2 = this.A04;
        if (r2.A07(5417) >= 1 || r2.A07(6646) >= 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass53w(C19730wQ r1, C19970wo r2, C236419g r3, AnonymousClass1AC r4, C20810yC r5) {
        super(r4);
        C36321k7.A1B(r2, r5, r1, r4, r3);
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public List A0D(boolean z) {
        return C023409w.A00;
    }
}
