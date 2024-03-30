package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4ZR  reason: invalid class name */
public class AnonymousClass4ZR implements AnonymousClass4U4 {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BYi(AnonymousClass147 r27, AnonymousClass147 r28, UserJid userJid, AnonymousClass3QL r30, String str, String str2, String str3, Map map, int i, int i2, int i3, long j, long j2) {
        AnonymousClass147 r3 = r27;
        UserJid userJid2 = userJid;
        AnonymousClass3QL r5 = r30;
        String str4 = str;
        String str5 = str3;
        Map map2 = map;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        long j3 = j;
        switch (this.A01) {
            case 0:
                C49722ja r1 = (C49722ja) this.A00;
                r1.A01 = new AnonymousClass3B2(r3, userJid2, r5, str4, str5, r1.A02.A0R(map2), i4, i5, i6, j3);
                return;
            case 3:
                C50262kT.A00((C50262kT) this.A00, r3, userJid2, r5, str4, str5, map2.keySet(), i4, i5, i6, j3);
                return;
            default:
                C40041ue r12 = (C40041ue) this.A00;
                ArrayList A0R = r12.A0X.A0R(map2);
                r12.A07 = r3;
                AnonymousClass147 r2 = r28;
                if (r28 != null) {
                    r12.A08 = AnonymousClass000.A1R(r12.A0J.A04(r2).size());
                }
                r12.A0S(new AnonymousClass3B2(r3, userJid2, r5, str4, str5, A0R, i4, i5, i6, j3));
                return;
        }
    }

    public void onError(int i) {
        C40041ue r1;
        int i2;
        switch (this.A01) {
            case 0:
                ((C49722ja) this.A00).A00 = i;
                return;
            case 1:
                r1 = (C40041ue) this.A00;
                i2 = 0;
                break;
            case 2:
                r1 = (C40041ue) this.A00;
                i2 = 2;
                break;
            default:
                ((C50262kT) this.A00).A00 = i;
                return;
        }
        C40041ue.A02(r1, i, i2);
    }
}
