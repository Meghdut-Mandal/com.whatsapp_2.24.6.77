package X;

import com.whatsapp.bonsai.sync.discovery.DiscoveryBots;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.8uv  reason: invalid class name and case insensitive filesystem */
public class C185868uv extends C192069Fo implements C236119d {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C185868uv(C50502l1 r1, Object obj, int i) {
        super(r1);
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A04(C203399nx r2, C185868uv r3) {
        int i = r3.A01;
        C50502l1 r1 = r3.A00;
        switch (i) {
            case 0:
                A00((AnonymousClass9HT) r3.A00, r2, (C107535Pi) r1);
                return;
            case 1:
                A02(r2, (AnonymousClass33G) r3.A00, (C186008vG) r1);
                return;
            case 2:
                A01(r2, (AnonymousClass33F) r3.A00, (C186008vG) r1);
                return;
            default:
                A03(r2, (AnonymousClass33G) r3.A00, (C186008vG) r1);
                return;
        }
    }

    public void BVN(String str) {
        switch (this.A01) {
            case 0:
                Log.w("GetChatbotListProtocolHelper/onDeliveryFailure");
                ((AnonymousClass9HT) this.A00).A00.A00.A00.A0C(C36381kD.A0j());
                return;
            case 2:
                ((AnonymousClass33F) this.A00).A00.BfC(C48672hq.A00);
                return;
            default:
                ((AnonymousClass33G) this.A00).A00.A0S(C48692hs.A00);
                return;
        }
    }

    public static void A00(AnonymousClass9HT r14, C203399nx r15, C107535Pi r16) {
        long j;
        C1277169j r8;
        AnonymousClass777 r10;
        ArrayList A0I = AnonymousClass001.A0I();
        C107535Pi r5 = r16;
        C203399nx r6 = r15;
        AnonymousClass9HT r2 = r14;
        try {
            new C186228vc(r15, r5);
            Log.e("GetChatbotListProtocolHelper/v1 not implemented, deprecated");
            r14.A00.A00.A00.A0C(C36381kD.A0j());
        } catch (C235919b e) {
            C165567td.A1R("BotListResponseSuccessV1: ", AnonymousClass000.A0u(), e, A0I);
            try {
                AnonymousClass011 A19 = C36441kJ.A19(new C186168vW(r15, r5), Long.valueOf(C19970wo.A00(r14.A01.A00)));
                C186168vW r4 = (C186168vW) A19.first;
                AnonymousClass00C.A0D(r4, 0);
                UserJid userJid = r4.A00;
                String str = r4.A01;
                if (userJid == null) {
                    r8 = null;
                } else {
                    r8 = new C1277169j(userJid, str);
                }
                List<AnonymousClass5PY> list = ((C186168vW) A19.first).A02;
                ArrayList A13 = C36411kG.A13(list);
                for (AnonymousClass5PY r1 : list) {
                    AnonymousClass00C.A0D(r1, 0);
                    String str2 = r1.A00;
                    String str3 = r1.A01;
                    List<AnonymousClass5PV> list2 = r1.A02;
                    ArrayList A132 = C36411kG.A13(list2);
                    for (AnonymousClass5PV r12 : list2) {
                        AnonymousClass00C.A0D(r12, 0);
                        UserJid userJid2 = r12.A00;
                        String str4 = r12.A01;
                        if (userJid2 != null) {
                            A132.add(new C1277169j(userJid2, str4));
                        }
                    }
                    if (!(str2 == null || str3 == null)) {
                        A13.add(new AnonymousClass6BC(str2, str3, A132));
                    }
                }
                long A09 = C36431kI.A09(A19.second);
                if (r8 == null) {
                    r2.A00.A00.A00.A0C(C36381kD.A0j());
                    return;
                }
                DiscoveryBots discoveryBots = new DiscoveryBots(r8, A13, A09);
                List list3 = discoveryBots.A02;
                list3.size();
                AnonymousClass9QZ r13 = r2.A00;
                list3.size();
                r13.A01.A02.A01(discoveryBots);
                AnonymousClass9HS r9 = r13.A00;
                C79593ty r82 = new C79593ty();
                List<C1277169j> A002 = C110115a9.A00(discoveryBots);
                LinkedHashSet A17 = C36441kJ.A17();
                for (C1277169j r0 : A002) {
                    A17.add(r0.A00);
                }
                C79593ty r42 = new C79593ty();
                C199099eh r17 = r9.A01;
                C20430xY r11 = r17.A05;
                C19460v5 r102 = r11.A00;
                if (!r102.A05() || !((AnonymousClass1HX) r102.A02()).A00.A00()) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    C36341k9.A1N("contactsyncmethods/requestSyncBotWithRetry/bonsai disabled, size=", A0u, A17);
                    Log.w(A0u.toString());
                    C131626Pu r02 = C131626Pu.A03;
                    r10 = new AnonymousClass777();
                    r10.BVO(r02);
                } else {
                    A17.size();
                    r10 = r11.A03(AnonymousClass6NS.A0E, C108515Tu.A05, C90524aI.A0k(A17), true, true);
                }
                C19770wU r122 = r17.A0E;
                C1501874h.A01(r122, r10, r42, 18);
                C79593ty r112 = new C79593ty();
                r122.Boy(new C1502474n(A17, r17, r112, 12));
                C79593ty[] r03 = new C79593ty[2];
                C90494aF.A1H(r42, r112, r03);
                new AnonymousClass8UW(Arrays.asList(r03)).A0A(new C23207B9p(r82, 1));
                r82.A0A(new C23207B9p(r9.A00, 2));
            } catch (C235919b e2) {
                C165567td.A1R("BotListResponseSuccessV2: ", AnonymousClass000.A0u(), e2, A0I);
                try {
                    C186278vh r18 = new C186278vh(r6, r5);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("GetChatbotListProtocolHelper/get list error code=");
                    switch (((C184438sR) r18.A00).A00) {
                        case 0:
                            j = 400;
                            break;
                        case 1:
                            j = 403;
                            break;
                        case 2:
                            j = 500;
                            break;
                        default:
                            j = 405;
                            break;
                    }
                    A0u2.append(Long.valueOf(j).longValue());
                    C90504aG.A1G(A0u2);
                    r2.A00.A00.A00.A0C(C36381kD.A0j());
                } catch (C235919b e3) {
                    throw C165567td.A0H("BotListResponseError: ", AnonymousClass000.A0u(), e3, A0I);
                }
            }
        }
    }

    public static void A01(C203399nx r6, AnonymousClass33F r7, C186008vG r8) {
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            C186198vZ r0 = new C186198vZ(r6, r8);
            AnonymousClass4SE r2 = r7.A00;
            String str = r0.A01;
            AnonymousClass00C.A08(str);
            r2.BfC(new C48652ho(str));
        } catch (C235919b e) {
            C165567td.A1R("GetResponseSuccess: ", AnonymousClass000.A0u(), e, A0I);
            try {
                C23050B1v b1v = (C23050B1v) new C186278vh(r6, r8, 20).A00;
                r7.A00.BfC(new C48662hp(b1v.B9o().longValue(), b1v.BIF()));
            } catch (C235919b e2) {
                throw C165567td.A0H("GetResponseError: ", AnonymousClass000.A0u(), e2, A0I);
            }
        }
    }

    public static void A02(C203399nx r6, AnonymousClass33G r7, C186008vG r8) {
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            new C186268vg(r6, r8, 15);
            r7.A00.A0S(C48702ht.A00);
        } catch (C235919b e) {
            C165567td.A1R("DeleteResponseSuccess: ", AnonymousClass000.A0u(), e, A0I);
            try {
                C23049B1u b1u = (C23049B1u) new C186278vh(r6, r8, 19).A00;
                r7.A00.A0S(new C48682hr(b1u.B9o().longValue(), b1u.BIF()));
            } catch (C235919b e2) {
                throw C165567td.A0H("DeleteResponseError: ", AnonymousClass000.A0u(), e2, A0I);
            }
        }
    }

    public static void A03(C203399nx r6, AnonymousClass33G r7, C186008vG r8) {
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            new C186268vg(r6, r8, 16);
            r7.A00.A0S(C48702ht.A00);
        } catch (C235919b e) {
            C165567td.A1R("SetResponseSuccess: ", AnonymousClass000.A0u(), e, A0I);
            try {
                C23051B1w b1w = (C23051B1w) new C186278vh(r6, r8, 21).A00;
                Long B9o = b1w.B9o();
                AnonymousClass00C.A08(B9o);
                long longValue = B9o.longValue();
                String BIF = b1w.BIF();
                AnonymousClass00C.A08(BIF);
                r7.A00.A0S(new C48682hr(longValue, BIF));
            } catch (C235919b e2) {
                throw C165567td.A0H("SetResponseError: ", AnonymousClass000.A0u(), e2, A0I);
            }
        }
    }

    public void BWw(C203399nx r1, String str) {
        A04(r1, this);
    }

    public void BiM(C203399nx r1, String str) {
        A04(r1, this);
    }
}
