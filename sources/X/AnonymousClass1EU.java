package X;

import android.text.TextUtils;
import com.whatsapp.payments.PaymentConfiguration;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1EU  reason: invalid class name */
public class AnonymousClass1EU {
    public AnonymousClass9YB A00;
    public PaymentConfiguration A01;
    public AF9 A02;
    public boolean A03;
    public final C19630wG A04;
    public final C24881Ed A05;
    public final AnonymousClass16S A06;
    public final AnonymousClass1EV A07;
    public final C24861Eb A08;
    public final C21100yf A09;
    public final C18820ts A0A;
    public final C24871Ec A0B;
    public final C24631De A0C;
    public final C24611Dc A0D = C24611Dc.A00("PaymentsManager", "infra", "COMMON");
    public final C19770wU A0E;
    public final Map A0F;

    public static synchronized void A00(AnonymousClass1EU r11) {
        synchronized (r11) {
            if (!r11.A03) {
                PaymentConfiguration paymentConfiguration = r11.A01;
                if (paymentConfiguration == null) {
                    paymentConfiguration = (PaymentConfiguration) ((C18800tq) C18810tr.A00(r11.A04.A00, C18800tq.class)).AfI.A00.A38.get();
                    r11.A01 = paymentConfiguration;
                }
                r11.A01 = paymentConfiguration;
                if (paymentConfiguration == null) {
                    r11.A0D.A05("initialize/paymentConfig is null");
                } else {
                    r11.A02 = new AF9(r11.A09, r11.A0A, r11.A0C, paymentConfiguration.A01());
                    AnonymousClass16S r4 = r11.A06;
                    PaymentConfiguration paymentConfiguration2 = r11.A01;
                    synchronized (r4) {
                        r4.A01 = paymentConfiguration2;
                        if (!r4.A09) {
                            r4.A00 = new C1031454d(r4.A04.A00, r4.A02, r4.A05, r4.A06, Collections.singleton(new C117155ln(r4)));
                            r4.A09 = true;
                        }
                    }
                    C24881Ed r3 = r11.A05;
                    PaymentConfiguration paymentConfiguration3 = r11.A01;
                    r3.A00 = paymentConfiguration3;
                    r11.A08.A00 = paymentConfiguration3;
                    r11.A00 = new AnonymousClass9YB(r3, r4, paymentConfiguration3, r11.A0E);
                    r11.A03 = true;
                    r11.A0D.A06("initialized");
                }
            }
        }
    }

    public synchronized C198699e3 A03(String str) {
        C198699e3 r0;
        A00(this);
        PaymentConfiguration paymentConfiguration = this.A01;
        if (paymentConfiguration == null) {
            r0 = null;
        } else {
            r0 = paymentConfiguration.A00(str);
        }
        return r0;
    }

    @Deprecated
    public synchronized B66 A05() {
        AF9 af9;
        A00(this);
        af9 = this.A02;
        C18740tg.A06(af9);
        return af9;
    }

    public synchronized void A08(boolean z, boolean z2) {
        C24601Db r1;
        this.A0D.A06("reset");
        A00(this);
        this.A03 = false;
        C24631De r3 = this.A0C;
        synchronized (r3) {
            try {
                C24611Dc.A02(r3.A02, (String) null, "reset country");
                r3.A00 = null;
                r3.A01 = false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
        if (this.A06.A09 && !z2) {
            AnonymousClass9YB r0 = this.A00;
            r0.A03.Box(new C175588aj(r0), new Void[0]);
        }
        this.A0B.A00();
        if (z) {
            if (C20800yB.A01(C21000yV.A02, this.A07.A02, 2928)) {
                A02("p2m_context").A07();
            }
            A02("p2p_context").A07();
        } else {
            if (C20800yB.A01(C21000yV.A02, this.A07.A02, 2928)) {
                A02("p2m_context").A08();
            }
            A02("p2p_context").A08();
        }
        C200169gl BFJ = A05().BFJ();
        if (BFJ != null) {
            synchronized (BFJ) {
                try {
                    if (C200169gl.A00(BFJ, C004702c.A00)) {
                        BFJ.A00.clear();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        B34 BAG = this.A02.BAG();
        if (BAG != null) {
            BAG.B5C();
        }
        C196129Xv BAH = this.A02.BAH();
        if (BAH != null) {
            synchronized (BAH) {
                try {
                    Log.i("PAY: IndiaUpiBlockListManager clear");
                    BAH.A09.clear();
                    r1 = BAH.A08;
                    r1.A0L("");
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            synchronized (BAH) {
                Log.i("PAY: IndiaUpiBlockListManager setShouldFetch called");
                BAH.A00 = -1;
                r1.A03().edit().putLong("payments_block_list_last_sync_time", -1).apply();
            }
        }
    }

    public String A06(String str) {
        PaymentConfiguration paymentConfiguration = this.A01;
        if (paymentConfiguration != null) {
            paymentConfiguration.A01.A02();
            if (str != null) {
                str = str.toUpperCase(Locale.US);
            }
            if (!TextUtils.isEmpty(str)) {
                switch (str.hashCode()) {
                    case 66044:
                        if (str.equals("BRL")) {
                            return "BR";
                        }
                        break;
                    case 72653:
                        if (str.equals("INR")) {
                            return "IN";
                        }
                        break;
                    case 82032:
                        if (str.equals("SGD")) {
                            return "SG";
                        }
                        break;
                }
            }
        }
        C202159l8 r0 = C202159l8.A0E;
        return "UNSET";
    }

    public AnonymousClass1EU(C21100yf r4, C19630wG r5, C18820ts r6, C24881Ed r7, AnonymousClass16S r8, C24871Ec r9, C24631De r10, AnonymousClass1EV r11, C24861Eb r12, C19770wU r13, Map map) {
        this.A04 = r5;
        this.A0E = r13;
        this.A09 = r4;
        this.A06 = r8;
        this.A0A = r6;
        this.A08 = r12;
        this.A07 = r11;
        this.A0C = r10;
        this.A0F = map;
        this.A0B = r9;
        this.A05 = r7;
    }

    public AnonymousClass9YB A01() {
        A00(this);
        AnonymousClass9YB r0 = this.A00;
        C18740tg.A06(r0);
        return r0;
    }

    public AnonymousClass1EY A02(String str) {
        A00(this);
        Object obj = this.A0F.get(str);
        C18740tg.A06(obj);
        return (AnonymousClass1EY) obj;
    }

    public AF8 A04(String str) {
        AF8 af8;
        A00(this);
        PaymentConfiguration paymentConfiguration = this.A01;
        if (paymentConfiguration == null) {
            return null;
        }
        AnonymousClass9F1 r4 = (AnonymousClass9F1) paymentConfiguration.A01.A02();
        synchronized (r4) {
            af8 = null;
            for (Map.Entry value : r4.A00.entrySet()) {
                AF8 af82 = (AF8) ((AnonymousClass004) value.getValue()).get();
                if (str.equalsIgnoreCase(af82.A07)) {
                    af8 = af82;
                }
            }
        }
        return af8;
    }

    public void A07(AnonymousClass1XD r7) {
        Map map;
        boolean z;
        A00(this);
        C24871Ec r5 = this.A0B;
        if (r5 != null) {
            synchronized (r5) {
                map = r5.A00;
                z = false;
                if (map.size() > 0) {
                    z = true;
                }
            }
            if (z) {
                synchronized (r5) {
                    HashSet hashSet = new HashSet();
                    for (String str : map.keySet()) {
                        if (map.get(str) == r7) {
                            hashSet.add(str);
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        map.remove((String) it.next());
                    }
                }
            }
        }
    }
}
