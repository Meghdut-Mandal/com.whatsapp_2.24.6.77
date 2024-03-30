package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.1Vk  reason: invalid class name and case insensitive filesystem */
public class C29121Vk {
    public final AnonymousClass17Y A00;
    public final C20050ww A01;
    public final C19970wo A02;
    public final C19630wG A03;
    public final C20310xM A04;
    public final AnonymousClass16S A05;
    public final AnonymousClass19A A06;
    public final AnonymousClass1EZ A07;
    public final C29221Vu A08;
    public final C29231Vv A09;
    public final C24601Db A0A;
    public final C24631De A0B;
    public final AnonymousClass1EV A0C;
    public final AnonymousClass1EU A0D;
    public final C29151Vn A0E;
    public final C24611Dc A0F = C24611Dc.A00("PaymentsActionManager", "network", "COMMON");
    public final C29141Vm A0G;
    public final C237919w A0H;
    public final AnonymousClass1VY A0I;
    public final C21080yd A0J;
    public final C19730wQ A0K;
    public final AnonymousClass1VZ A0L;
    public final C24871Ec A0M;
    public final C29131Vl A0N;

    public C203399nx A05(AnonymousClass16U r11, AnonymousClass16X r12, String str) {
        AnonymousClass16U r5 = r11;
        int BAW = A01(r11, this).BAW(((AnonymousClass16V) r5).A02);
        return A06(r5, str, BAW, (long) ((int) (r12.A00.doubleValue() * ((double) BAW))));
    }

    public void A0A(AnonymousClass1XD r16, B66 b66) {
        SharedPreferences sharedPreferences;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass1AL("version", 3));
        arrayList.add(new AnonymousClass1AL("action", "get-methods"));
        C29131Vl r1 = this.A0N;
        if (r1.A01() != null) {
            arrayList.add(new AnonymousClass1AL("device-id", r1.A01()));
        }
        C119985qm r8 = new C119985qm(new AnonymousClass61C((AnonymousClass1AL[]) arrayList.toArray(new AnonymousClass1AL[0])));
        C29141Vm r3 = this.A0G;
        synchronized (r3) {
            sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A01.A00("com.whatsapp_payment_sync_preferences");
                r3.A00 = sharedPreferences;
            }
        }
        String string = sharedPreferences.getString(r8.A01.A00(), (String) null);
        if (string != null) {
            arrayList.add(new AnonymousClass1AL("instance-id", string));
        }
        C203399nx r11 = new C203399nx("account", (AnonymousClass1AL[]) arrayList.toArray(new AnonymousClass1AL[0]));
        B66 b662 = b66;
        C23075B3f BBn = b662.BBn();
        if (BBn != null) {
            BBn.Buu();
        }
        AnonymousClass1XD r4 = r16;
        A0H(new C178458fy(this.A03.A00, r4, this.A08, this, b662, r8, this.A00, string), r11, "get", 0);
    }

    public void A0B(AnonymousClass1XD r11, C203399nx r12) {
        Context context = this.A03.A00;
        AnonymousClass17Y r3 = this.A00;
        B7I b7i = new B7I(context, this.A08, r3, r11, this, 1);
        A0H(b7i, r12, "set", AnonymousClass6X5.A0L);
    }

    public void A0C(AnonymousClass1XD r11, C203399nx r12) {
        Context context = this.A03.A00;
        AnonymousClass17Y r3 = this.A00;
        B7I b7i = new B7I(context, this.A08, r3, r11, this, 0);
        A0H(b7i, r12, "set", AnonymousClass6X5.A0L);
    }

    public static B66 A01(AnonymousClass16U r2, C29121Vk r3) {
        C202159l8 A022 = r3.A0B.A02();
        Objects.requireNonNull(A022);
        C198699e3 A032 = r3.A0D.A03(A022.A03);
        Objects.requireNonNull(A032);
        B66 A012 = A032.A01(((AnonymousClass16V) r2).A02);
        Objects.requireNonNull(A012);
        return A012;
    }

    public C202319lY A04(C203399nx r7) {
        C203399nx A0c;
        C207219uk r0;
        C207199ui r1;
        String A0i = r7.A0i("service", (String) null);
        if (!TextUtils.isEmpty(A0i)) {
            this.A0D.A04(A0i);
        }
        C202319lY A032 = this.A0I.A03((AZ9) null, r7);
        if (A032 == null) {
            return null;
        }
        boolean equals = "1".equals(r7.A0i("is_p2m_hybrid", (String) null));
        if (("P2M_LITE".equals(A0i) || equals) && (A0c = r7.A0c("order")) != null) {
            String A0i2 = A0c.A0i("message_id", (String) null);
            if (!TextUtils.isEmpty(A0i2)) {
                AnonymousClass2bZ r2 = (AnonymousClass2bZ) this.A0L.A00.A03(new C64933Qa(A032.A0C, A0i2, false));
                if (!(r2 == null || (r0 = r2.A00) == null || (r1 = r0.A01) == null)) {
                    r1.A06 = A032.A0K;
                    if (equals && A032.A0L()) {
                        r1.A05 = "captured";
                        if (A032.A04() != null) {
                            r1.A02 = A032.A09;
                        }
                    }
                    this.A04.A0k(r2);
                }
            }
        }
        return A032;
    }

    public void A07(C22935Ayl ayl, C203399nx r11, boolean z) {
        ArrayList A052 = this.A0I.A05(r11.A0c("account"));
        C22935Ayl ayl2 = ayl;
        if (A052 == null || A052.isEmpty()) {
            AnonymousClass1EU r0 = this.A0D;
            AnonymousClass1EU.A00(r0);
            AnonymousClass9YB r5 = r0.A00;
            C18740tg.A06(r5);
            C18740tg.A06(r5);
            C19770wU r8 = r5.A03;
            r8.Box(new C175548af(ayl2, r5, r5.A01, r5.A02, r8), new Void[0]);
        } else if (AnonymousClass16S.A04(A052)) {
            AnonymousClass1EU r02 = this.A0D;
            AnonymousClass1EU.A00(r02);
            AnonymousClass9YB r03 = r02.A00;
            C18740tg.A06(r03);
            C18740tg.A06(r03);
            r03.A06(ayl, A052);
        } else if (z) {
            A09((AnonymousClass1XD) null);
            return;
        } else {
            return;
        }
        A0J(A052);
        this.A0A.A0C();
    }

    @Deprecated
    public void A09(AnonymousClass1XD r2) {
        A0A(r2, this.A0D.A05());
    }

    public void A0E(AnonymousClass1XD r23, C16380p9 r24) {
        C16380p9 r4 = r24;
        AnonymousClass19A r9 = this.A06;
        String A092 = r9.A09();
        AnonymousClass6QB r2 = new AnonymousClass6QB("iq");
        r2.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r2.A04(new AnonymousClass1AL("xmlns", "urn:xmpp:whatsapp:account"));
        r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C203539oF.A0P(A092, 0, 9007199254740991L, false)) {
            r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092));
        }
        AnonymousClass6QB r6 = new AnonymousClass6QB("accept_pay");
        r6.A04(new AnonymousClass1AL("version", "3"));
        r6.A04(new AnonymousClass1AL("tos_version", 1));
        ConditionVariable conditionVariable = C18740tg.A00;
        r6.A06(((C592133b) r4).A00);
        r2.A05(r6.A03());
        r9.A0E(new B7I(this.A03.A00, this.A08, this.A00, r23, this, 2), r2.A03(), A092, 204, 0);
    }

    public void A0F(C236119d r8, C203399nx r9, String str) {
        A0I(r8, r9, str, "w:pay", AnonymousClass6X5.A0L);
    }

    public void A0G(C236119d r8, C203399nx r9, String str, long j) {
        this.A06.A0E(r8, r9, str, 204, j);
    }

    public void A0H(C236119d r8, C203399nx r9, String str, long j) {
        A0I(r8, r9, str, "w:pay", j);
    }

    public void A0I(C236119d r12, C203399nx r13, String str, String str2, long j) {
        AnonymousClass19A r4 = this.A06;
        String A092 = r4.A09();
        C236119d r5 = r12;
        r4.A0E(r5, new C203399nx(r13, "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", str2)}), A092, 204, j);
    }

    public void A0J(ArrayList arrayList) {
        C24601Db r0;
        boolean z;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C207249un r1 = (C207249un) it.next();
                if ((r1 instanceof C175798b4) && r1.A01 == 2) {
                    r0 = this.A0A;
                    z = true;
                    break;
                }
            }
            r0.A03().edit().putBoolean("payments_card_can_receive_payment", z).apply();
        }
        r0 = this.A0A;
        z = false;
        r0.A03().edit().putBoolean("payments_card_can_receive_payment", z).apply();
    }

    public boolean A0K(AnonymousClass16U r34, AnonymousClass16X r35, C207249un r36, C175708av r37, C135106c9 r38, AnonymousClass3T1 r39, String str, String str2, boolean z) {
        C24611Dc r2;
        StringBuilder sb;
        boolean A0G2;
        int i;
        char c;
        String str3;
        C207249un r14;
        String str4;
        C207249un r0 = r36;
        C19730wQ r1 = this.A0K;
        r1.A0G();
        AnonymousClass142 r8 = r1.A0E;
        C18740tg.A06(r8);
        ArrayList arrayList = null;
        if (!this.A0C.A04(0)) {
            r2 = this.A0F;
            sb = new StringBuilder();
            sb.append("sendPayment is not enabled for country: ");
            sb.append(this.A0B.A02());
        } else {
            AnonymousClass3T1 r6 = r39;
            AnonymousClass11F r10 = r6.A1J.A00;
            if (r10 == null || ((A0G2 = AnonymousClass143.A0G(r10)) && r6.A0J() == null)) {
                r2 = this.A0F;
                sb = new StringBuilder();
                sb.append("sendPayment found null or empty args jid: ");
                sb.append(r10);
                sb.append(" receiver: ");
                sb.append(r6.A0J());
                sb.append(" payment methods: ");
            } else {
                AnonymousClass16X r12 = r35;
                if (!r12.A02()) {
                    this.A0F.A06("sendPayment not sending payment; got invalid amount");
                    return false;
                }
                AnonymousClass16U r9 = r34;
                B66 A012 = A01(r9, this);
                C207119ua A002 = A00(r9, r12);
                C175708av r32 = r37;
                C18740tg.A06(r32);
                C175708av r22 = r32;
                r22.A01 = A002;
                if (r22.A02 != null) {
                    i = 2;
                } else {
                    i = 0;
                    if (z) {
                        i = 1;
                    }
                }
                try {
                    C24611Dc r3 = this.A0F;
                    r3.A06("sendPayment building payment to send amount");
                    UserJid userJid = (UserJid) r8.A0H;
                    if (A0G2) {
                        r10 = r6.A0J();
                    }
                    C222813r r23 = UserJid.Companion;
                    UserJid A003 = C222813r.A00(r10);
                    String str5 = ((AnonymousClass16W) r9).A02;
                    C24631De r31 = this.A0B;
                    C202159l8 A022 = r31.A02();
                    C18740tg.A06(A022);
                    String str6 = A022.A03;
                    int BHO = A012.BHO();
                    C203419nz r122 = C203419nz.$redex_init_class;
                    int i2 = 1;
                    if (z) {
                        i2 = 100;
                    }
                    C202319lY A013 = C203419nz.A01(r9, r12, userJid, A003, str5, (String) null, str6, i2, 401, AnonymousClass9ZS.A00(str6), BHO, i, -1);
                    A013.A0C(r38);
                    AnonymousClass16S r17 = this.A05;
                    ArrayList A0A2 = r17.A0A();
                    if (A0A2.size() <= 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("sendPayment not sending payment; got no methods: ");
                        sb2.append(A0A2);
                        r3.A06(sb2.toString());
                        c = 7;
                    } else {
                        Iterator it = r17.A0A().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                r14 = null;
                                break;
                            }
                            r14 = (C207249un) it.next();
                            if (r14.A01 == 1) {
                                break;
                            }
                        }
                        if (r14 != null && !TextUtils.isEmpty(r14.A0A)) {
                            int A092 = r14.A09();
                            if (A092 != r31.A02().A00) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("sendPayment not sending payment; primary methods type ");
                                sb3.append(A092);
                                sb3.append(" does not match primary account type for country: ");
                                sb3.append(r31.A02().A00);
                                r3.A06(sb3.toString());
                                c = 3;
                            } else if (A092 != 3) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("sendPayment not sending payment; primary method type unsupported: ");
                                sb4.append(A092);
                                r3.A06(sb4.toString());
                                c = 6;
                            } else {
                                C175778b2 r142 = (C175778b2) r14;
                                AnonymousClass16X r82 = r142.A01;
                                if (r82 == null || !r82.A02()) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("sendPayment not sending payment; got invalid balance: ");
                                    sb5.append(r82);
                                    r3.A06(sb5.toString());
                                    c = 5;
                                } else {
                                    ArrayList arrayList2 = new ArrayList(2);
                                    BigDecimal bigDecimal = r82.A00;
                                    BigDecimal bigDecimal2 = r12.A00;
                                    if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                                        arrayList2.add(new AnonymousClass9K8(r12, r142, 1));
                                    } else {
                                        BigDecimal bigDecimal3 = BigDecimal.ZERO;
                                        if (bigDecimal.compareTo(bigDecimal3) > 0) {
                                            arrayList2.add(new AnonymousClass9K8(r82, r142, 1));
                                        }
                                        BigDecimal subtract = bigDecimal2.subtract(bigDecimal);
                                        if (subtract.compareTo(bigDecimal3) > 0) {
                                            if (!(r36 == null && (r0 = r17.A06()) == null) && !TextUtils.isEmpty(r0.A0A)) {
                                                C202159l8 A023 = r31.A02();
                                                if (AnonymousClass6XG.A03(A023.A09, r0.A09())) {
                                                    arrayList2.add(new AnonymousClass9K8(new AnonymousClass16X(subtract, bigDecimal2.scale()), r0, 1));
                                                }
                                            }
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append("sendPayment not sending payment; got invalid secondary methods with insufficient balance: ");
                                            sb6.append(r82);
                                            str4 = sb6.toString();
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        r3.A06("sendPayment found 0 sources");
                                        c = 11;
                                    } else {
                                        c = 0;
                                        arrayList = arrayList2;
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append("findSourcesForTransfer returning sources: ");
                                        sb7.append(arrayList2);
                                        sb7.append(" for amount");
                                        r3.A06(sb7.toString());
                                    }
                                }
                            }
                        } else if (r31.A02().A08) {
                            if (!(r36 == null && (r0 = r17.A06()) == null) && !TextUtils.isEmpty(r0.A0A)) {
                                C202159l8 A024 = r31.A02();
                                if (AnonymousClass6XG.A03(A024.A09, r0.A09())) {
                                    arrayList = new ArrayList(1);
                                    arrayList.add(new AnonymousClass9K8(r12, r0, 1));
                                    c = 0;
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append("PAY PaymentsActionManager:findSourcesForTransfer found no legacy primary but found primary: ");
                                    sb8.append(arrayList);
                                    sb8.append(" for amount");
                                    Log.i(sb8.toString());
                                }
                            }
                            str4 = "sendPayment not sending payment; got invalid primary methods and no legacy primary methods";
                        } else {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("sendPayment not sending payment; got null primary methods or empty credential id: ");
                            sb9.append(r14);
                            r3.A06(sb9.toString());
                            c = 4;
                        }
                        r3.A06(str4);
                        c = 9;
                    }
                    A013.A0M = str;
                    A013.A0K = str2;
                    A013.A06 = r32.A0A();
                    if (c == 0) {
                        A013.A0E(arrayList);
                        A013.A0A = r32;
                        if (A013.A0N.size() == 1) {
                            r6.A0q((AnonymousClass11F) null);
                            A013.A0H = ((AnonymousClass9K8) A013.A0N.get(0)).A01.A0A;
                            long A004 = C19970wo.A00(this.A02);
                            r6.A0I = A004;
                            r6.A0M = A013;
                            A013.A05 = A004;
                            if (C203419nz.A07(A013.A0K)) {
                                str3 = A013.A0K;
                            } else {
                                str3 = "UNSET";
                            }
                            r6.A0t = str3;
                            return true;
                        }
                        r3.A06("PaymentsActionManager sendPayment could not send. no correct sources found.");
                        return false;
                    }
                    return false;
                } catch (Exception e) {
                    this.A0F.A0A("sendPayment blew up creating transaction info: ", e);
                    return false;
                }
            }
        }
        r2.A06(sb.toString());
        return false;
    }

    public boolean A0L(AnonymousClass16X r22, C135106c9 r23, UserJid userJid, AnonymousClass3T1 r25) {
        C24611Dc r4;
        StringBuilder sb;
        if (!this.A0C.A04(0)) {
            r4 = this.A0F;
            sb = new StringBuilder();
            sb.append("requestPayment is not enabled for country: ");
            sb.append(this.A0B.A02());
        } else {
            AnonymousClass3T1 r1 = r25;
            AnonymousClass11F r3 = r1.A1J.A00;
            UserJid userJid2 = userJid;
            if (r3 != null && (!AnonymousClass143.A0G(r3) || userJid != null)) {
                AnonymousClass16X r8 = r22;
                if (r22 != null) {
                    C24631De r5 = this.A0B;
                    C202159l8 A022 = r5.A02();
                    C18740tg.A06(A022);
                    AnonymousClass16U r2 = A022.A02;
                    B66 A012 = A01(r2, this);
                    C19730wQ r32 = this.A0K;
                    r32.A0G();
                    AnonymousClass142 r33 = r32.A0E;
                    C18740tg.A06(r33);
                    String str = ((AnonymousClass16V) r5.A01()).A02;
                    AnonymousClass16U A013 = r5.A01();
                    String str2 = this.A0H.A02(userJid2, true).A01;
                    String str3 = r5.A02().A03;
                    int BHO = A012.BHO();
                    C203419nz r34 = C203419nz.$redex_init_class;
                    C202319lY A014 = C203419nz.A01(A013, r8, userJid2, (UserJid) r33.A0H, str, str2, str3, 10, 11, AnonymousClass9ZS.A00(str3), BHO, 0, -1);
                    A014.A0C(r23);
                    C175708av BKY = A012.BKY();
                    BKY.A01 = A00(r2, r8);
                    A014.A0A = BKY;
                    long A002 = C19970wo.A00(this.A02);
                    r1.A0I = A002;
                    r1.A0t = "UNSET";
                    r1.A0M = A014;
                    A014.A05 = A002;
                    A014.A02 = 12;
                    A014.A0K = A014.A0K;
                    C175708av r42 = A014.A0A;
                    this.A0D.A05().BFN();
                    A014.A0A(r42, A002 + 604800000);
                    return true;
                }
            }
            r4 = this.A0F;
            sb = new StringBuilder();
            sb.append("requestPayment found null or empty args jid: ");
            sb.append(r3);
            sb.append(" receiver: ");
            sb.append(userJid2);
        }
        r4.A06(sb.toString());
        return false;
    }

    public C29121Vk(AnonymousClass17Y r4, C19730wQ r5, C20050ww r6, C19970wo r7, C19630wG r8, C20310xM r9, AnonymousClass1VZ r10, AnonymousClass16S r11, AnonymousClass19A r12, AnonymousClass1EZ r13, C24871Ec r14, C29221Vu r15, C29231Vv r16, C24601Db r17, C24631De r18, AnonymousClass1EV r19, AnonymousClass1EU r20, C29151Vn r21, C29141Vm r22, C29131Vl r23, C237919w r24, AnonymousClass1VY r25, C21080yd r26) {
        this.A03 = r8;
        this.A02 = r7;
        this.A00 = r4;
        this.A0K = r5;
        this.A01 = r6;
        this.A05 = r11;
        this.A06 = r12;
        this.A0N = r23;
        this.A0D = r20;
        this.A04 = r9;
        this.A0J = r26;
        this.A0H = r24;
        this.A0A = r17;
        this.A07 = r13;
        this.A0L = r10;
        this.A0G = r22;
        this.A0I = r25;
        this.A0C = r19;
        this.A0B = r18;
        this.A0M = r14;
        this.A0E = r21;
        this.A08 = r15;
        this.A09 = r16;
    }

    private C207119ua A00(AnonymousClass16U r7, AnonymousClass16X r8) {
        int i;
        B66 A012 = A01(r7, this);
        if (A012 != null) {
            i = A012.BAW(((AnonymousClass16V) r7).A02);
        } else {
            i = 1000;
        }
        C199449fK r4 = new C199449fK();
        r4.A01 = (long) ((int) (r8.A00.doubleValue() * ((double) i)));
        r4.A00 = i;
        r4.A02 = r7;
        return r4.A01();
    }

    public C207119ua A02(AnonymousClass16U r6, AnonymousClass16X r7) {
        int BAW = A01(r6, this).BAW(((AnonymousClass16V) r6).A02);
        int doubleValue = (int) (r7.A00.doubleValue() * ((double) BAW));
        C199449fK r2 = new C199449fK();
        r2.A02 = r6;
        r2.A00 = BAW;
        r2.A01 = (long) doubleValue;
        return r2.A01();
    }

    public C202319lY A03(AnonymousClass16U r5, AnonymousClass16X r6, C207249un r7, C175708av r8, C135106c9 r9, AnonymousClass3T1 r10, String str, String str2, boolean z) {
        if (!A0K(r5, r6, r7, r8, r9, r10, str, str2, z)) {
            return null;
        }
        this.A04.A0P(r10);
        C24871Ec r3 = this.A0M;
        String str3 = r10.A1J.A01;
        C202319lY r1 = r10.A0M;
        synchronized (r3) {
            if (r1 != null) {
                r3.A02.put(str3, r1);
            }
        }
        this.A0E.A01(r9, r10);
        C202319lY r0 = r10.A0M;
        C18740tg.A06(r0);
        return r0;
    }

    public C203399nx A06(AnonymousClass16U r4, String str, int i, long j) {
        C203399nx r1;
        B66 A012 = A01(r4, this);
        C199449fK r0 = new C199449fK();
        r0.A02 = r4;
        r0.A00 = i;
        r0.A01 = j;
        C207119ua A013 = r0.A01();
        if (A012 != null) {
            r1 = A012.BEM(A013);
        } else {
            r1 = null;
        }
        return new C203399nx(r1, str, (AnonymousClass1AL[]) null);
    }

    public void A08(AnonymousClass16X r2, C135106c9 r3, UserJid userJid, AnonymousClass3T1 r5) {
        if (A0L(r2, r3, userJid, r5)) {
            this.A04.A0P(r5);
        }
    }

    public void A0D(AnonymousClass1XD r6, C203399nx r7, String str, String str2) {
        C203399nx r0;
        if (TextUtils.isEmpty(str2)) {
            str2 = C237919w.A00(this.A0K, this.A02);
        }
        AnonymousClass1AL[] r4 = {new AnonymousClass1AL("action", "remove-credential"), new AnonymousClass1AL("credential-id", str), new AnonymousClass1AL("version", "2"), new AnonymousClass1AL("nonce", str2)};
        if (r7 != null) {
            r0 = new C203399nx(r7, "account", r4);
        }
        A0B(r6, r0);
    }
}
