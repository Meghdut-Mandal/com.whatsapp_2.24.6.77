package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.73K  reason: invalid class name */
public class AnonymousClass73K implements Runnable {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;

    public AnonymousClass73K(Object obj, String str, String str2, String str3, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void run() {
        AnonymousClass3T1 A032;
        C23043B1o b1o;
        C207219uk BA8;
        C207089uX r0;
        C20310xM r02;
        C23043B1o b1o2;
        C207219uk BA82;
        C207089uX r03;
        C23043B1o b1o3;
        C207219uk BA83;
        C207089uX r04;
        C23043B1o b1o4;
        C207219uk BA84;
        C207089uX r05;
        switch (this.A04) {
            case 0:
                ((C98544rb) this.A00).A00.Bkb(this.A01, this.A02, this.A03);
                return;
            case 1:
                AnonymousClass6PZ r6 = (AnonymousClass6PZ) this.A00;
                String str = this.A01;
                String str2 = this.A02;
                String str3 = this.A03;
                C1042158s r2 = new C1042158s();
                AnonymousClass6PZ.A00(r6, r2);
                r2.A07 = Long.valueOf(r6.A00);
                r2.A0N = r6.A04;
                r2.A0C = str;
                r2.A0D = str2;
                r2.A0B = str3;
                r6.A09.Blv(r2);
                return;
            case 2:
                String str4 = this.A01;
                String str5 = this.A02;
                AnonymousClass6TM r62 = (AnonymousClass6TM) this.A00;
                String str6 = this.A03;
                A032 = r62.A01.A03(C90504aG.A0T(C36421kH.A0N(str4), str5));
                Object obj = null;
                if ((A032 instanceof C23043B1o) && (b1o3 = (C23043B1o) A032) != null && (BA83 = b1o3.BA8()) != null && BA83.A00 == 5 && (r04 = BA83.A04) != null) {
                    Iterator it = r04.A03.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (C90504aG.A1X(next, str6)) {
                                obj = next;
                            }
                        }
                    }
                    C206569tc r4 = (C206569tc) obj;
                    if (r4 != null) {
                        r4.A00 = true;
                    }
                    r02 = r62.A00;
                    break;
                } else {
                    return;
                }
            case 3:
                C124305xw r5 = (C124305xw) this.A00;
                String str7 = this.A01;
                String str8 = this.A02;
                String str9 = this.A03;
                AnonymousClass00C.A0D(r5, 0);
                AnonymousClass00C.A0B(str8);
                JSONObject A1B = C36441kJ.A1B();
                try {
                    A1B.put("cta", str9);
                } catch (JSONException e) {
                    Log.w(C36331k8.A0i("ExtensionsLogger/WaBkCommerceInterpreterCallbackImpl/updateNativeFlowMessageWithSelectedState/", AnonymousClass000.A0u(), e));
                }
                r5.A03.A00((Jid) null, (Integer) null, A1B.toString(), (String) null, 2, 4, 1, true);
                A032 = r5.A04.A03(new C64933Qa(C36421kH.A0N(str8), str7, false));
                Object obj2 = null;
                if ((A032 instanceof C23043B1o) && (b1o2 = (C23043B1o) A032) != null && (BA82 = b1o2.BA8()) != null && BA82.A00 == 5 && (r03 = BA82.A04) != null) {
                    Iterator it2 = r03.A03.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (C90504aG.A1X(next2, str9)) {
                                obj2 = next2;
                            }
                        }
                    }
                    C206569tc r63 = (C206569tc) obj2;
                    if (r63 != null) {
                        r63.A00 = true;
                    }
                    r02 = r5.A02;
                    break;
                } else {
                    return;
                }
            case 4:
                String str10 = this.A01;
                String str11 = this.A02;
                C145356tl r64 = (C145356tl) this.A00;
                String str12 = this.A03;
                A032 = r64.A07.A03(C90504aG.A0T(C36421kH.A0N(str10), str11));
                Object obj3 = null;
                if ((A032 instanceof C23043B1o) && (b1o = (C23043B1o) A032) != null && (BA8 = b1o.BA8()) != null && BA8.A00 == 5 && (r0 = BA8.A04) != null) {
                    Iterator it3 = r0.A03.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            if (C90504aG.A1X(next3, str12)) {
                                obj3 = next3;
                            }
                        }
                    }
                    C206569tc r42 = (C206569tc) obj3;
                    if (r42 != null) {
                        r42.A00 = true;
                    }
                    r02 = r64.A05;
                    break;
                } else {
                    return;
                }
            default:
                String str13 = this.A01;
                String str14 = this.A02;
                C145366tm r52 = (C145366tm) this.A00;
                String str15 = this.A03;
                A032 = r52.A0A.A03(C90504aG.A0T(C36421kH.A0N(str13), str14));
                Object obj4 = null;
                if ((A032 instanceof C23043B1o) && (b1o4 = (C23043B1o) A032) != null && (BA84 = b1o4.BA8()) != null && BA84.A00 == 5 && (r05 = BA84.A04) != null) {
                    Iterator it4 = r05.A03.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next4 = it4.next();
                            if (C90504aG.A1X(next4, str15)) {
                                obj4 = next4;
                            }
                        }
                    }
                    C206569tc r43 = (C206569tc) obj4;
                    if (r43 != null) {
                        r43.A00 = true;
                    }
                    r02 = r52.A07;
                    break;
                } else {
                    return;
                }
                break;
        }
        r02.A0k(A032);
    }
}
