package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.1jT  reason: invalid class name and case insensitive filesystem */
public class C35921jT extends C192069Fo implements C236119d {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35921jT(C50502l1 r1, Object obj, int i) {
        super(r1);
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C119075pC r11, C203399nx r12, AnonymousClass2lL r13) {
        ArrayList arrayList = new ArrayList();
        try {
            C186138vT r6 = new C186138vT(r12, r13);
            Log.i("UpdateOptOutListResponseSuccessWithMatch");
            AnonymousClass1NQ r5 = r11.A00;
            C121305sv r8 = r11.A01;
            C184898tB r0 = r6.A00;
            AnonymousClass00C.A08(r0);
            C10810fG r4 = new C10810fG();
            r0.A00.Azu(new C121295su(r5, r0.A01, r4));
            Object obj = r4.element;
            String str = r6.A01;
            AnonymousClass00C.A08(str);
            if (obj != null) {
                AnonymousClass1NP r52 = r8.A01;
                int i = r8.A00;
                UserJid userJid = r8.A02;
                AnonymousClass9HR r1 = new AnonymousClass9HR(new AnonymousClass9HQ(userJid, (String) null), i);
                List singletonList = Collections.singletonList(obj);
                AnonymousClass00C.A08(singletonList);
                AnonymousClass1NP.A01(r1, r52, str, singletonList);
                r52.A00.A0H(new C35621iz(r52, userJid, 46));
            }
        } catch (C235919b e) {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateOptOutListResponseSuccessWithMatch: ");
            sb.append(e.getMessage());
            arrayList.add(sb.toString());
            try {
                AnonymousClass5Po r14 = new AnonymousClass5Po(r12, r13);
                Log.i("UpdateOptOutListResponseSuccessWithMismatch");
                AnonymousClass1NQ r9 = r11.A00;
                C121305sv r82 = r11.A01;
                ArrayList arrayList2 = new ArrayList();
                List<C35831jK> list = r14.A01;
                String str2 = r14.A00;
                AnonymousClass00C.A08(str2);
                for (C35831jK r02 : list) {
                    C184898tB r03 = (C184898tB) r02.A00;
                    AnonymousClass00C.A08(r03);
                    C10810fG r42 = new C10810fG();
                    r03.A00.Azu(new C121295su(r9, r03.A01, r42));
                    Object obj2 = r42.element;
                    if (obj2 != null) {
                        arrayList2.add(obj2);
                    }
                    AnonymousClass1NP r53 = r82.A01;
                    int i2 = r82.A00;
                    UserJid userJid2 = r82.A02;
                    AnonymousClass1NP.A01(new AnonymousClass9HR(new AnonymousClass9HQ(userJid2, (String) null), i2), r53, str2, arrayList2);
                    r53.A00.A0H(new C35621iz(r53, userJid2, 46));
                }
            } catch (C235919b e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UpdateOptOutListResponseSuccessWithMismatch: ");
                sb2.append(e2.getMessage());
                arrayList.add(sb2.toString());
                try {
                    new C186278vh(r12, r13, 0);
                    Log.e("UpdateOptOutListResponseInvalidRequest");
                    C121305sv r2 = r11.A01;
                    AnonymousClass1NP r54 = r2.A01;
                    AnonymousClass17Y r43 = r54.A00;
                    r43.A07(R.string.f12nameremoved, 1);
                    r43.A0H(new C35621iz(r54, r2.A02, 46));
                } catch (C235919b e3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("UpdateOptOutListResponseInvalidRequest: ");
                    sb3.append(e3.getMessage());
                    arrayList.add(sb3.toString());
                    try {
                        new C186278vh(r12, r13, 1);
                        Log.e("UpdateOptOutListResponseServerError");
                        C121305sv r15 = r11.A01;
                        AnonymousClass1NP r55 = r15.A01;
                        AnonymousClass17Y r44 = r55.A00;
                        r44.A07(R.string.f12nameremoved, 1);
                        r44.A0H(new C35621iz(r55, r15.A02, 46));
                    } catch (C235919b e4) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("UpdateOptOutListResponseServerError: ");
                        sb4.append(e4.getMessage());
                        arrayList.add(sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
                        sb5.append(AnonymousClass14B.A07("\n", arrayList));
                        throw new C235919b(sb5.toString());
                    }
                }
            }
        }
    }

    public static void A01(AnonymousClass30Z r9, C203399nx r10, C35911jS r11) {
        C52232p6 r6;
        ArrayList arrayList = new ArrayList();
        try {
            String str = new C186208va(r10, r11).A00;
            int hashCode = str.hashCode();
            if (hashCode != -960387887) {
                if (hashCode == -362366888 ? str.equals("Added to waitlist") : !(hashCode != 66974734 || !str.equals("In waitlist"))) {
                    r6 = C52232p6.IN_WAITLIST;
                }
                r9.A00.A00();
                return;
            }
            if (str.equals("AI available")) {
                r6 = C52232p6.AI_AVAILABLE;
            }
            r9.A00.A00();
            return;
            C61683Da r1 = r9.A00;
            AnonymousClass1KA r5 = r1.A02;
            r5.A05.Boy(new C1503474x((Object) r1.A00, (Object) r5, (Object) r6, (Object) r1.A01, 16));
        } catch (C235919b e) {
            StringBuilder sb = new StringBuilder();
            sb.append("AddToWaitlistResponseSuccess: ");
            sb.append(e.getMessage());
            arrayList.add(sb.toString());
            try {
                new C186278vh(r10, r11, 2);
                r9.A00.A00();
            } catch (C235919b e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AddToWaitlistResponseError: ");
                sb2.append(e2.getMessage());
                arrayList.add(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
                sb3.append(AnonymousClass14B.A07("\n", arrayList));
                throw new C235919b(sb3.toString());
            }
        }
    }

    public static void A02(C585230a r7, C203399nx r8, C35911jS r9) {
        C52232p6 r6;
        ArrayList arrayList = new ArrayList();
        try {
            String str = new C186218vb(r8, r9).A00;
            int hashCode = str.hashCode();
            if (hashCode != -960387887) {
                if (hashCode == 66974734 && str.equals("In waitlist")) {
                    r6 = C52232p6.IN_WAITLIST;
                }
                r7.A00.A00.BXH();
                return;
            }
            if (str.equals("AI available")) {
                r6 = C52232p6.AI_AVAILABLE;
            }
            r7.A00.A00.BXH();
            return;
            C594333x r0 = r7.A00;
            AnonymousClass1KA r5 = r0.A01;
            r5.A05.Boy(new C1502474n(r5, r6, r0.A00, 15));
        } catch (C235919b e) {
            StringBuilder sb = new StringBuilder();
            sb.append("UserStateResponseSuccess: ");
            sb.append(e.getMessage());
            arrayList.add(sb.toString());
            try {
                new C186278vh(r8, r9, 4);
                r7.A00.A00.BXH();
            } catch (C235919b e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UserStateResponseError: ");
                sb2.append(e2.getMessage());
                arrayList.add(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
                sb3.append(AnonymousClass14B.A07("\n", arrayList));
                throw new C235919b(sb3.toString());
            }
        }
    }

    public static void A03(C585430c r4, C203399nx r5, C35911jS r6) {
        ArrayList arrayList = new ArrayList();
        try {
            new C186278vh(r5, r6, 27);
            r4.A00.onSuccess();
        } catch (C235919b e) {
            StringBuilder sb = new StringBuilder();
            sb.append("SetResponseSuccess: ");
            sb.append(e.getMessage());
            arrayList.add(sb.toString());
            try {
                new C186278vh(r5, r6, 25);
                r4.A00.BXH();
            } catch (C235919b e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SetResponseClientError: ");
                sb2.append(e2.getMessage());
                arrayList.add(sb2.toString());
                try {
                    new C186278vh(r5, r6, 26);
                    r4.A00.BXH();
                } catch (C235919b e3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SetResponseServerError: ");
                    sb3.append(e3.getMessage());
                    arrayList.add(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
                    sb4.append(AnonymousClass14B.A07("\n", arrayList));
                    throw new C235919b(sb4.toString());
                }
            }
        }
    }

    public static void A04(C585530d r11, C203399nx r12, C35911jS r13) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        try {
            C186278vh r0 = new C186278vh(r12, r13, 23);
            C88414Sp r9 = r11.A00;
            List<C184288sC> list = (List) r0.A01;
            AnonymousClass00C.A08(list);
            int A02 = C000300d.A02(AnonymousClass03U.A06(list, 10));
            if (A02 < 16) {
                A02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A02);
            for (C184288sC r02 : list) {
                C184818t3 r03 = (C184818t3) r02.A00;
                Object obj = r03.A00;
                Number number = (Number) r03.A01;
                if (number != null) {
                    int i = (number.longValue() > 5 ? 1 : (number.longValue() == 5 ? 0 : -1));
                    z = true;
                    if (i == 0) {
                        linkedHashMap.put(obj, Boolean.valueOf(z));
                    }
                }
                z = false;
                linkedHashMap.put(obj, Boolean.valueOf(z));
            }
            r9.BiH(linkedHashMap);
        } catch (C235919b e) {
            StringBuilder sb = new StringBuilder();
            sb.append("GetDisclosureStageByIdsResponseClientSuccess: ");
            sb.append(e.getMessage());
            arrayList.add(sb.toString());
            try {
                new C186278vh(r12, r13, 22);
                r11.A00.BXH();
            } catch (C235919b e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GetDisclosureStageByIdsResponseClientError: ");
                sb2.append(e2.getMessage());
                arrayList.add(sb2.toString());
                try {
                    new C186278vh(r12, r13, 24);
                    r11.A00.BXH();
                } catch (C235919b e3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("GetDisclosureStageByIdsResponseServerError: ");
                    sb3.append(e3.getMessage());
                    arrayList.add(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
                    sb4.append(AnonymousClass14B.A07("\n", arrayList));
                    throw new C235919b(sb4.toString());
                }
            }
        }
    }

    public static void A05(AnonymousClass32I r4, C203399nx r5, C50682lJ r6) {
        ArrayList arrayList = new ArrayList();
        try {
            new C186268vg(r5, r6);
            r4.A00.resumeWith(AnonymousClass0AJ.A00);
        } catch (C235919b e) {
            StringBuilder sb = new StringBuilder();
            sb.append("SetBlocklistByWAClientResponseSuccess: ");
            sb.append(e.getMessage());
            arrayList.add(sb.toString());
            try {
                C186278vh r1 = new C186278vh(r5, r6);
                C023509x r42 = r4.A00;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("InteropBlocklistHelper/getInteropBlocklist/error code: ");
                sb2.append(((C23006Azw) r1.A00).B9o().longValue());
                IOException iOException = new IOException(sb2.toString());
                AnonymousClass00C.A0D(iOException, 0);
                r42.resumeWith(new AnonymousClass03N(iOException));
            } catch (C235919b e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SetBlocklistByWAClientResponseError: ");
                sb3.append(e2.getMessage());
                arrayList.add(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
                sb4.append(AnonymousClass14B.A07("\n", arrayList));
                throw new C235919b(sb4.toString());
            }
        }
    }

    public static void A06(AnonymousClass32J r5, C203399nx r6, C35911jS r7) {
        ArrayList arrayList = new ArrayList();
        try {
            new C186228vc(r6, r7);
            throw new NullPointerException("$continuation");
        } catch (C235919b e) {
            StringBuilder sb = new StringBuilder();
            sb.append("FetchResponseSuccess: ");
            sb.append(e.getMessage());
            arrayList.add(sb.toString());
            long longValue = ((C23003Azt) new C186278vh(r6, r7, 6).A00).B9o().longValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("GetIntegratorsHelper/getIntegrators/error from server; code=");
            sb2.append(longValue);
            Log.e(sb2.toString());
            throw new NullPointerException("$continuation");
        } catch (C235919b e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("FetchResponseRequestError: ");
            sb3.append(e2.getMessage());
            arrayList.add(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
            sb4.append(AnonymousClass14B.A07("\n", arrayList));
            throw new C235919b(sb4.toString());
        }
    }

    public static void A07(AnonymousClass32K r8, C203399nx r9, C35911jS r10) {
        C23005Azv azv;
        ArrayList arrayList = new ArrayList();
        try {
            List<C184818t3> list = (List) new C186278vh(r9, r10, 11).A01;
            AnonymousClass00C.A08(list);
            ArrayList arrayList2 = new ArrayList();
            for (C184818t3 r1 : list) {
                C184068rq r0 = (C184068rq) r1.A01;
                if (!(r0 == null || (azv = (C23005Azv) r0.A00) == null)) {
                    arrayList2.add(new AnonymousClass011(Integer.valueOf((int) ((Number) r1.A00).longValue()), Integer.valueOf((int) azv.B9o().longValue())));
                }
            }
            r8.A00.resumeWith(new AnonymousClass2X0(arrayList2));
        } catch (C235919b e) {
            StringBuilder sb = new StringBuilder();
            sb.append("SetOptInIntegratorsResponseSuccess: ");
            sb.append(e.getMessage());
            arrayList.add(sb.toString());
            try {
                r8.A00.resumeWith(new AnonymousClass2Wz(((C23007Azx) new C186278vh(r9, r10, 10).A00).B9o().longValue()));
            } catch (C235919b e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SetOptInIntegratorsResponseRequestError: ");
                sb2.append(e2.getMessage());
                arrayList.add(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
                sb3.append(AnonymousClass14B.A07("\n", arrayList));
                throw new C235919b(sb3.toString());
            }
        }
    }

    public static void A08(AnonymousClass32L r11, C203399nx r12, C35911jS r13) {
        ArrayList arrayList = new ArrayList();
        try {
            C186278vh r0 = new C186278vh(r12, r13, 8);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (C184958tH r9 : (List) r0.A01) {
                AnonymousClass011 r7 = new AnonymousClass011(r9.A02, Integer.valueOf((int) ((Number) r9.A00).longValue()));
                C184238s7 r8 = (C184238s7) r9.A01;
                AnonymousClass00C.A08(r8);
                if (r8.A01 == 1) {
                    Object obj = r8.A00;
                    AnonymousClass00C.A08(obj);
                    linkedHashMap.put(r7, obj);
                } else {
                    Object obj2 = r8.A00;
                    if (obj2 instanceof C185198tl) {
                        arrayList4.add(r7);
                    } else if (obj2 instanceof C185218tn) {
                        arrayList2.add(r7);
                    } else if (obj2 instanceof C185208tm) {
                        arrayList3.add(r7);
                    }
                }
            }
            r11.A00.resumeWith(new AnonymousClass2X2(arrayList2, arrayList3, arrayList4, linkedHashMap));
        } catch (C235919b e) {
            StringBuilder sb = new StringBuilder();
            sb.append("FetchUsersResponseSuccess: ");
            sb.append(e.getMessage());
            arrayList.add(sb.toString());
            try {
                r11.A00.resumeWith(new AnonymousClass2X1((int) ((C23004Azu) new C186278vh(r12, r13, 7).A00).B9o().longValue()));
            } catch (C235919b e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FetchUsersResponseRequestError: ");
                sb2.append(e2.getMessage());
                arrayList.add(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
                sb3.append(AnonymousClass14B.A07("\n", arrayList));
                throw new C235919b(sb3.toString());
            }
        }
    }

    public void BVN(String str) {
        switch (this.A01) {
            case 1:
                AnonymousClass00C.A0D(str, 0);
                ((AnonymousClass30Z) this.A00).A00.A00();
                return;
            case 2:
                AnonymousClass00C.A0D(str, 0);
                ((C585230a) this.A00).A00.A00.BXH();
                return;
            case 7:
                AnonymousClass00C.A0D(str, 0);
                ((C585530d) this.A00).A00.BXH();
                return;
            case 8:
                AnonymousClass00C.A0D(str, 0);
                ((C585430c) this.A00).A00.BXH();
                return;
            default:
                return;
        }
    }

    public void BWw(C203399nx r3, String str) {
        int i = this.A01;
        C50502l1 r1 = this.A00;
        switch (i) {
            case 0:
                A00((C119075pC) this.A00, r3, (AnonymousClass2lL) r1);
                return;
            case 1:
                A01((AnonymousClass30Z) this.A00, r3, (C35911jS) r1);
                return;
            case 2:
                A02((C585230a) this.A00, r3, (C35911jS) r1);
                return;
            case 3:
                A06((AnonymousClass32J) null, r3, (C35911jS) r1);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 4:
                A08((AnonymousClass32L) this.A00, r3, (C35911jS) r1);
                return;
            case 5:
                A05((AnonymousClass32I) this.A00, r3, (C50682lJ) r1);
                return;
            case 6:
                A07((AnonymousClass32K) this.A00, r3, (C35911jS) r1);
                return;
            case 7:
                A04((C585530d) this.A00, r3, (C35911jS) r1);
                return;
            default:
                A03((C585430c) this.A00, r3, (C35911jS) r1);
                return;
        }
    }

    public void BiM(C203399nx r3, String str) {
        int i = this.A01;
        C50502l1 r1 = this.A00;
        switch (i) {
            case 0:
                A00((C119075pC) this.A00, r3, (AnonymousClass2lL) r1);
                return;
            case 1:
                A01((AnonymousClass30Z) this.A00, r3, (C35911jS) r1);
                return;
            case 2:
                A02((C585230a) this.A00, r3, (C35911jS) r1);
                return;
            case 3:
                A06((AnonymousClass32J) null, r3, (C35911jS) r1);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 4:
                A08((AnonymousClass32L) this.A00, r3, (C35911jS) r1);
                return;
            case 5:
                A05((AnonymousClass32I) this.A00, r3, (C50682lJ) r1);
                return;
            case 6:
                A07((AnonymousClass32K) this.A00, r3, (C35911jS) r1);
                return;
            case 7:
                A04((C585530d) this.A00, r3, (C35911jS) r1);
                return;
            default:
                A03((C585430c) this.A00, r3, (C35911jS) r1);
                return;
        }
    }
}
