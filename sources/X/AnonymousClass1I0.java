package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1I0  reason: invalid class name */
public abstract class AnonymousClass1I0 {
    public AnonymousClass9TX A00(UserJid userJid) {
        AnonymousClass1IB r0;
        if (this instanceof AnonymousClass1I2) {
            AnonymousClass00C.A0D(userJid, 0);
            r0 = ((AnonymousClass1I2) this).A05;
        } else if (this instanceof AnonymousClass1IM) {
            AnonymousClass00C.A0D(userJid, 0);
            r0 = ((AnonymousClass1IM) this).A00;
        } else {
            if (!(this instanceof AnonymousClass1I1)) {
                Map map = ((AnonymousClass1IN) this).A00;
                Object obj = map.get(1);
                C18740tg.A06(obj);
                AnonymousClass9TX A00 = ((AnonymousClass1I0) obj).A00(userJid);
                if (A00 != null) {
                    return A00;
                }
                Object obj2 = map.get(2);
                C18740tg.A06(obj2);
                AnonymousClass9TX A002 = ((AnonymousClass1I0) obj2).A00(userJid);
                if (A002 != null) {
                    return A002;
                }
            }
            return new AnonymousClass54P();
        }
        return (AnonymousClass9TX) r0.A01(userJid);
    }

    public void A01() {
        if (this instanceof AnonymousClass1I2) {
            AnonymousClass1IB r7 = ((AnonymousClass1I2) this).A05;
            Iterator it = r7.A04().iterator();
            while (it.hasNext()) {
                C175418aS r5 = (C175418aS) it.next();
                if (System.currentTimeMillis() - r5.A01 > C175418aS.A09) {
                    r7.A05(r5.A00);
                }
            }
        } else if (this instanceof AnonymousClass1IM) {
            AnonymousClass1IL r6 = ((AnonymousClass1IM) this).A00;
            ArrayList A04 = r6.A04();
            ArrayList<C175468aX> arrayList = new ArrayList<>();
            Iterator it2 = A04.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (System.currentTimeMillis() - ((C175408aR) next).A00 > C175408aR.A05) {
                    arrayList.add(next);
                }
            }
            for (C175468aX r0 : arrayList) {
                r6.A05(r0.A00);
            }
        } else if (!(this instanceof AnonymousClass1I1)) {
            for (Map.Entry value : ((AnonymousClass1IN) this).A00.entrySet()) {
                ((AnonymousClass1I0) value.getValue()).A01();
            }
        }
    }

    public void A03(AnonymousClass9TX r5) {
        C175468aX r52;
        AnonymousClass1IB r1;
        if (this instanceof AnonymousClass1I2) {
            AnonymousClass1I2 r3 = (AnonymousClass1I2) this;
            r52 = (C175468aX) r5;
            AnonymousClass00C.A0D(r52, 0);
            if (!C20800yB.A01(C21000yV.A02, r3.A04, 7136)) {
                r1 = r3.A05;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass1IM) {
            r52 = (C175468aX) r5;
            AnonymousClass00C.A0D(r52, 0);
            r1 = ((AnonymousClass1IM) this).A00;
        } else if (!(this instanceof AnonymousClass1I1)) {
            Object obj = ((AnonymousClass1IN) this).A00.get(Integer.valueOf(r5.A00));
            C18740tg.A06(obj);
            ((AnonymousClass1I0) obj).A03(r5);
            return;
        } else {
            return;
        }
        r1.A05(r52.A00);
    }

    public void A04(AnonymousClass9TX r7) {
        if (this instanceof AnonymousClass1I2) {
            AnonymousClass1I2 r1 = (AnonymousClass1I2) this;
            C175468aX r72 = (C175468aX) r7;
            AnonymousClass00C.A0D(r72, 0);
            r1.A05.A07(r72);
            AnonymousClass1IE r12 = r1.A01;
            String rawString = r72.A00.getRawString();
            AnonymousClass00C.A0D(rawString, 0);
            ((SharedPreferences) r12.A01.getValue()).edit().putBoolean(rawString, true).apply();
        } else if (this instanceof AnonymousClass1IM) {
            C175468aX r73 = (C175468aX) r7;
            AnonymousClass00C.A0D(r73, 0);
            UserJid userJid = r73.A00;
            AnonymousClass1IL r5 = ((AnonymousClass1IM) this).A00;
            C175408aR r0 = (C175408aR) r5.A01(userJid);
            if (r0 == null || System.currentTimeMillis() - r0.A00 > C175408aR.A05) {
                r5.A07(r73);
            }
        } else if (!(this instanceof AnonymousClass1I1)) {
            Object obj = ((AnonymousClass1IN) this).A00.get(Integer.valueOf(r7.A00));
            C18740tg.A06(obj);
            ((AnonymousClass1I0) obj).A04(r7);
        }
    }

    public void A05(AnonymousClass9TX r7, C99534tY r8) {
        if (this instanceof AnonymousClass1I2) {
            AnonymousClass1I2 r3 = (AnonymousClass1I2) this;
            C175418aS r72 = (C175418aS) r7;
            AnonymousClass00C.A0D(r72, 1);
            if (!r3.A02.A00(r72)) {
                return;
            }
            if (r3.A00.A00(r72)) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    String str = r72.A02;
                    String str2 = C19430v1.A0B;
                    C22898AyA ayA = C21674AUx.A01;
                    AnonymousClass8I5 r5 = new AnonymousClass8I5(str.getBytes(str2));
                    r8.A0S();
                    C99944uD r4 = (C99944uD) r8.A00;
                    int i = C99944uD.CALL_KEY_FIELD_NUMBER;
                    r4.bitField0_ |= 4;
                    r4.conversionData_ = r5;
                    String str3 = r72.A03;
                    r8.A0S();
                    C99944uD r42 = (C99944uD) r8.A00;
                    r42.bitField0_ |= 2;
                    r42.conversionSource_ = str3;
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - r72.A01);
                    r8.A0S();
                    C99944uD r1 = (C99944uD) r8.A00;
                    r1.bitField0_ |= 8;
                    r1.conversionDelaySeconds_ = seconds;
                } catch (Exception e) {
                    Log.e("CtwaAdsEntryPoint/fillE2ECallInfo/failed to fill E2E context info/exception=", e);
                }
                r3.A03.A01(r72.A00, 0);
                return;
            }
            r3.A03.A01(r72.A00, 1);
        } else if (!(this instanceof AnonymousClass1IM) && !(this instanceof AnonymousClass1I1)) {
            Object obj = ((AnonymousClass1IN) this).A00.get(Integer.valueOf(r7.A00));
            C18740tg.A06(obj);
            ((AnonymousClass1I0) obj).A05(r7, r8);
        }
    }

    public void A06(AnonymousClass9TX r5, AnonymousClass3T1 r6) {
        if (this instanceof AnonymousClass1I2) {
            AnonymousClass1I2 r3 = (AnonymousClass1I2) this;
            C175418aS r52 = (C175418aS) r5;
            AnonymousClass00C.A0D(r52, 1);
            if (!r3.A02.A00(r52)) {
                return;
            }
            if (r3.A00.A00(r52)) {
                boolean z = r52.A08;
                synchronized (r6.A1M) {
                    r6.A0z = z;
                }
                r6.A0j(1073741824);
                r6.A0K = r52;
                r3.A03.A01(r52.A00, 0);
                return;
            }
            r3.A03.A01(r52.A00, 1);
        } else if (this instanceof AnonymousClass1IM) {
            AnonymousClass00C.A0D(r5, 1);
            r6.A0K = r5;
        } else if (!(this instanceof AnonymousClass1I1)) {
            Object obj = ((AnonymousClass1IN) this).A00.get(Integer.valueOf(r5.A00));
            C18740tg.A06(obj);
            ((AnonymousClass1I0) obj).A06(r5, r6);
        }
    }

    public void A02(AnonymousClass9TX r1) {
        A03(r1);
    }
}
