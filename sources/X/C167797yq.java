package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.7yq  reason: invalid class name and case insensitive filesystem */
public class C167797yq extends AnonymousClass04R implements C22956Az8 {
    public int A00;
    public C001700s A01 = C36441kJ.A0Z(AnonymousClass001.A0I());
    public C207109uZ A02;
    public C202319lY A03;
    public C183748rI A04;
    public C183758rJ A05;
    public C193689Ml A06;
    public C64933Qa A07;
    public C28201Rs A08 = C36441kJ.A0t();
    public Boolean A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D = false;
    public int A0E = R.string.f12nameremoved;
    public String A0F;
    public boolean A0G = false;
    public final Bundle A0H;
    public final AnonymousClass17Y A0I;
    public final C19730wQ A0J;
    public final AnonymousClass1KK A0K;
    public final AnonymousClass1NG A0L;
    public final AnonymousClass16D A0M;
    public final C21060yb A0N;
    public final C19970wo A0O;
    public final C19630wG A0P;
    public final C18820ts A0Q;
    public final C24881Ed A0R;
    public final C25251Fo A0S;
    public final AnonymousClass1EZ A0T;
    public final C24601Db A0U;
    public final B2Z A0V;
    public final AnonymousClass1DR A0W;
    public final AnonymousClass1EV A0X;
    public final AnonymousClass1EU A0Y;
    public final AnonymousClass1XC A0Z;
    public final AnonymousClass6PS A0a;
    public final C23075B3f A0b;
    public final C24611Dc A0c = C165607th.A0c("PaymentTransactionDetailsViewModel", "payment-settings");
    public final AnonymousClass1YQ A0d;
    public final AnonymousClass39O A0e;
    public final C200899iR A0f;
    public final AnonymousClass1FR A0g;
    public final C19770wU A0h;
    public final C20310xM A0i;
    public final AnonymousClass1FF A0j;
    public final AnonymousClass1VZ A0k;
    public final AnonymousClass16T A0l;
    public final AnonymousClass16S A0m;
    public final C199849g7 A0n;

    public static void A02(C207079uW r6, C167797yq r7, Integer num, Integer num2) {
        C131606Ps r3 = new C131606Ps((String) null, new C131606Ps[0]);
        r3.A02("num_installments", r6.A01);
        r3.A04("has_installments_fees", false);
        r7.A0b.BOp(r3, num, num2, "payment_transaction_details", r7.A0F);
    }

    public void A0a() {
        C202319lY r0;
        C194139Og r3 = new C194139Og(0);
        C193689Ml r02 = this.A06;
        if (!(r02 == null || (r0 = r02.A01) == null || !r0.A0J())) {
            this.A0E = R.string.f12nameremoved;
        }
        Bundle bundle = r3.A02;
        bundle.putInt("action_bar_title_res_id", this.A0E);
        bundle.putBoolean("action_bar_on_configuration_change", this.A0G);
        this.A08.A0D(r3);
        this.A0G = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (X.C200899iR.A01(r6) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0o(java.util.List r10) {
        /*
            r9 = this;
            r4 = r9
            java.lang.String r1 = r9.A0A
            java.lang.String r0 = "non_native"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003b
            X.9Ml r0 = r9.A06
            X.9lY r6 = r0.A01
            X.9un r5 = r0.A00
            X.8l8 r2 = new X.8l8
            r2.<init>()
            X.1EV r0 = r9.A0X
            X.0yC r1 = r0.A02
            r0 = 1359(0x54f, float:1.904E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x002b
            boolean r1 = X.C200899iR.A01(r6)
            r0 = 1
            r7 = 22
            if (r1 != 0) goto L_0x002e
        L_0x002b:
            r0 = 0
            r7 = 10
        L_0x002e:
            r8 = 6
            X.6cs r3 = new X.6cs
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A00 = r3
            r2.A01 = r0
            r10.add(r2)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167797yq.A0o(java.util.List):void");
    }

    public void A0p(boolean z) {
        C194139Og r1 = new C194139Og(1);
        r1.A0H = z;
        this.A08.A0D(r1);
    }

    public void BcW() {
        A0q(false);
    }

    public static void A03(C167797yq r3) {
        if ("native".equals(r3.A0A)) {
            r3.A0Z();
        }
        C001700s r2 = r3.A01;
        List A0w = C36401kF.A0w(r2);
        A0w.clear();
        r3.A0p(false);
        C193689Ml r0 = r3.A06;
        if (r0 != null && r0.A01 != null) {
            r3.A0g(A0w);
            r2.A0D(A0w);
        }
    }

    public static void A04(List list) {
        list.add(new C179968kz());
    }

    public static void A05(List list) {
        list.add(new C179978l0());
    }

    public B66 A0S() {
        if (this instanceof C180318lZ) {
            AF8 A042 = this.A0Y.A04("P2M_LITE");
            AnonymousClass00C.A0B(A042);
            return A042;
        } else if (!(this instanceof C180298lX)) {
            return this.A0Y.A05();
        } else {
            AF8 A043 = this.A0Y.A04("GLOBAL_ORDER");
            C18740tg.A06(A043);
            AnonymousClass00C.A08(A043);
            return A043;
        }
    }

    public AnonymousClass9FU A0T() {
        boolean z;
        Context context;
        int i;
        int i2;
        C193689Ml r0 = this.A06;
        C180118lE r2 = null;
        if (r0 != null) {
            C202319lY r5 = r0.A01;
            C207249un r3 = r0.A00;
            boolean z2 = false;
            if (r3 != null) {
                synchronized (r5) {
                    if (!r5.A0K() || !((i2 = r5.A02) == 13 || i2 == 14 || i2 == 15 || i2 == 16)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    if ("non_native".equals(this.A0A)) {
                        context = this.A0P.A00;
                        i = R.string.f12nameremoved;
                    } else {
                        int i3 = r5.A03;
                        if (i3 != 1) {
                            context = this.A0P.A00;
                            i = R.string.f12nameremoved;
                            if (i3 != 100) {
                                i = R.string.f12nameremoved;
                            }
                        } else {
                            context = this.A0P.A00;
                            i = R.string.f12nameremoved;
                        }
                    }
                    String string = context.getString(i);
                    r2 = new C180118lE();
                    r2.A04 = string;
                    r2.A03 = this.A0n.A02(r3, true);
                    if (r5.A03 != 200 && !(r3 instanceof C175788b3)) {
                        z2 = true;
                    }
                    if (this.A06.A04 && z2) {
                        r2.A01 = new AnonymousClass3YH(this, r3, 6);
                        return r2;
                    }
                }
            }
        }
        return r2;
    }

    public C180118lE A0U() {
        int i;
        C202319lY r0;
        C175708av r1;
        String str;
        if (this instanceof C180318lZ) {
            C180118lE r2 = new C180118lE();
            A01(this.A0P.A00, r2, R.string.f12nameremoved);
            C193689Ml r02 = this.A06;
            if (r02 == null || (r0 = r02.A01) == null || (r1 = r0.A0A) == null) {
                return null;
            }
            if (r1 instanceof C175938bJ) {
                str = ((C175938bJ) r1).A06;
            } else if (!(r1 instanceof C175918bH)) {
                return null;
            } else {
                str = ((C175918bH) r1).A04;
            }
            if (str == null) {
                return null;
            }
            r2.A03 = str;
            return r2;
        }
        C193689Ml r03 = this.A06;
        if (r03 != null) {
            C202319lY r04 = r03.A01;
            C180118lE r3 = new C180118lE();
            String A0X2 = A0X(r04);
            if (C203419nz.A07(A0X2)) {
                Context context = this.A0P.A00;
                if (this instanceof C180338lb) {
                    i = R.string.f12nameremoved;
                } else {
                    i = R.string.f12nameremoved;
                }
                A01(context, r3, i);
                r3.A03 = A0X2;
                r3.A02 = new B8M(this, A0X2, 1);
                return r3;
            }
        }
        return null;
    }

    public C180118lE A0V() {
        C202319lY r0;
        C175708av r1;
        C135086c7 r12;
        C193689Ml r02 = this.A06;
        if (r02 == null || (r0 = r02.A01) == null || (r1 = r0.A0A) == null || !(r1 instanceof C175928bI) || (r12 = ((C175928bI) r1).A07) == null || C202349ld.A02(r12)) {
            return null;
        }
        C180118lE r2 = new C180118lE();
        r2.A03 = C165577te.A0k(r12);
        A01(this.A0P.A00, r2, R.string.f12nameremoved);
        return r2;
    }

    public String A0W() {
        C193689Ml r0 = this.A06;
        if (r0 != null) {
            Boolean A062 = r0.A01.A06();
            C175708av r1 = this.A06.A01.A0A;
            C18740tg.A06(r1);
            if (A062 != null) {
                if (A062.booleanValue()) {
                    return r1.A0F();
                }
                return r1.A0G();
            }
        }
        return null;
    }

    public void A0Y() {
        AnonymousClass3T1 r0;
        C194139Og r2;
        String str;
        C194139Og r1;
        C24611Dc r4 = this.A0c;
        r4.A06("Parent- HANDLE_SEND_AGAIN child did not handle");
        C193689Ml r02 = this.A06;
        if (r02 != null) {
            r0 = r02.A02;
        } else {
            r0 = null;
        }
        if (r0 != null) {
            C202319lY r22 = r0.A0M;
            if (r22 != null) {
                UserJid userJid = r22.A0D;
                if (userJid != null) {
                    if (!this.A0L.A0O(userJid)) {
                        C175708av r03 = r22.A0A;
                        if (r03 == null || r03.A02 == null) {
                            r2 = new C194139Og(12);
                            this.A08.A0D(r2);
                        }
                        r1 = new C194139Og(21);
                        r1.A0D = r22.A0A.A02.A01;
                        C193689Ml r04 = this.A06;
                        C18740tg.A06(r04);
                        r1.A08 = r04.A03;
                        r1.A01 = this.A00;
                    } else {
                        r1 = new C194139Og(13);
                        r1.A06 = r22.A0D;
                    }
                    this.A08.A0D(r1);
                    return;
                }
                str = "Parent- HANDLE_SEND_AGAIN pmtTxnInfo.receiverJid is null";
            } else {
                str = "Parent- HANDLE_SEND_AGAIN pmtTxnInfo is null";
            }
        } else {
            str = "Parent- HANDLE_SEND_AGAIN FMessage is null";
        }
        r4.A06(str);
        r2 = new C194139Og(8);
        r2.A0C = this.A0P.A00.getString(R.string.f12nameremoved);
        this.A08.A0D(r2);
    }

    public void A0Z() {
        C202319lY r6;
        C193689Ml r1 = this.A06;
        if (r1 != null && !this.A0D && (r6 = r1.A01) != null) {
            this.A0D = true;
            if (this.A0T.A0F() && A0r()) {
                C24611Dc r2 = this.A0c;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("syncing pending transaction: ");
                A0u.append(r6.A0K);
                A0u.append(" status: ");
                C165577te.A1D(r2, A0u, r6.A02);
                C23075B3f BBn = A0S().BBn();
                if (BBn != null) {
                    BBn.Buu();
                }
                this.A0Z.A00(new C23175B8j(this, BBn, 6), A0S(), r6.A0K, r6.A0N());
            }
        }
    }

    public void A0b(C202319lY r5) {
        if (TextUtils.isEmpty(r5.A0K) || !r5.A0K.equals(this.A0B)) {
            C64933Qa r2 = this.A07;
            if (r2 == null) {
                return;
            }
            if ((TextUtils.isEmpty(r5.A0L) || !r5.A0L.equals(r2.A01)) && (TextUtils.isEmpty(r5.A0M) || !r5.A0M.equals(r2.A01))) {
                return;
            }
        }
        A0q(false);
    }

    public void A0c(C180148lH r3) {
        C202319lY r1 = this.A06.A01;
        r3.A04 = AnonymousClass1FR.A01(this.A0P.A00, r1);
        r3.A02 = AnonymousClass1FR.A00(r1);
    }

    public void A0d(AnonymousClass9FZ r3) {
        if (r3.A00 == 2) {
            A0q(true);
        }
    }

    public void A0e(List list) {
        C193689Ml r0;
        C179988l1 r2;
        int i;
        C193689Ml r02;
        if (this instanceof C180308lY) {
            A0f(list);
            A0k(list);
            A0h(list);
            A0j(list);
            if (this.A0X.A02.A0E(1905) && (r02 = this.A06) != null && this.A0g.A0e(r02.A01)) {
                r2 = new C179988l1();
                i = 28;
            }
            A0l(list);
            A0i(list);
        }
        boolean z = this instanceof C180328la;
        A0f(list);
        A0k(list);
        A0h(list);
        if (z) {
            A0j(list);
            if (this.A0X.A02.A0E(1905) && (r0 = this.A06) != null && this.A0g.A0e(r0.A01)) {
                r2 = new C179988l1();
                i = 23;
            }
        } else {
            A0j(list);
        }
        A0l(list);
        A0i(list);
        r2.A00 = new AnonymousClass9v0(this, i);
        list.add(r2);
        A0l(list);
        A0i(list);
    }

    public void A0f(List list) {
        SpannableStringBuilder spannableStringBuilder;
        C193689Ml r0 = this.A06;
        if (r0 != null) {
            C202319lY r2 = r0.A01;
            AnonymousClass16X r5 = r2.A08;
            if (r5 != null) {
                Context context = this.A0P.A00;
                spannableStringBuilder = C36441kJ.A0P(AnonymousClass9Zb.A01(this.A0Q, r2.A03(), r5, 0, false));
                if (C1892492v.A00 == null) {
                    try {
                        C1892492v.A00 = C015006m.A03(context, R.font.payment_icons_regular);
                    } catch (Resources.NotFoundException unused) {
                        Log.e("PAY: PaymentsTypeface/loadTypefaceSync could not load font R.font.payment_icons_regular");
                    }
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            C135106c9 A052 = r2.A05();
            boolean A002 = A0S().BFK().A00(r2);
            AnonymousClass1FR r02 = this.A0g;
            int A0C2 = r02.A0C(r2);
            Context context2 = r02.A04.A00;
            if (A0C2 == 0) {
                A0C2 = R.string.f12nameremoved;
            }
            String string = context2.getString(A0C2);
            Object[] A0M2 = AnonymousClass001.A0M();
            C36331k8.A1N(spannableStringBuilder, string, A0M2);
            list.add(new C180108lD(A052, spannableStringBuilder, context2.getString(R.string.f12nameremoved, A0M2), (CharSequence) null, A002));
        }
    }

    public void A0h(List list) {
        C180088lB r1 = new C180088lB();
        r1.A02 = this.A06;
        r1.A01 = this;
        r1.A00 = A0S().BAj();
        list.add(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (((X.C175928bI) r1).A0X == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012d, code lost:
        if (r12.A0T.A0E() == false) goto L_0x012f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0i(java.util.List r13) {
        /*
            r12 = this;
            X.8lG r7 = new X.8lG
            r7.<init>()
            X.9Ml r0 = r12.A06
            X.9lY r6 = r0.A01
            X.0wG r0 = r12.A0P
            android.content.Context r5 = r0.A00
            int r2 = r6.A03
            r4 = 1
            r1 = 2131894967(0x7f1222b7, float:1.9424754E38)
            if (r2 == r4) goto L_0x0053
            r0 = 2
            if (r2 == r0) goto L_0x0050
            r0 = 9
            if (r2 == r0) goto L_0x0050
            r0 = 10
            r1 = 2131894969(0x7f1222b9, float:1.9424758E38)
            if (r2 == r0) goto L_0x0053
            r0 = 20
            if (r2 == r0) goto L_0x004c
            r0 = 40
            if (r2 == r0) goto L_0x004c
            r0 = 100
            r1 = 2131894964(0x7f1222b4, float:1.9424748E38)
            if (r2 == r0) goto L_0x0053
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x0050
            java.lang.String r0 = ""
        L_0x0038:
            r7.A09 = r0
            X.1FR r0 = r12.A0g
            java.lang.String r0 = r0.A0Q(r6)
            r7.A08 = r0
            long r0 = r6.A05
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0093
            monitor-enter(r6)
            goto L_0x0058
        L_0x004c:
            r1 = 2131894968(0x7f1222b8, float:1.9424756E38)
            goto L_0x0053
        L_0x0050:
            r1 = 2131894970(0x7f1222ba, float:1.942476E38)
        L_0x0053:
            java.lang.String r0 = r5.getString(r1)
            goto L_0x0038
        L_0x0058:
            X.8av r1 = r6.A0A     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x006b
            boolean r0 = r1 instanceof X.C175928bI     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x006b
            X.8bI r1 = (X.C175928bI) r1     // Catch:{ all -> 0x0065 }
            boolean r1 = r1.A0X     // Catch:{ all -> 0x0065 }
            goto L_0x0068
        L_0x0065:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0068:
            r0 = 1
            if (r1 != 0) goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            monitor-exit(r6)
            if (r0 != 0) goto L_0x0093
            r10 = 2131894927(0x7f12228f, float:1.9424673E38)
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r8 = 0
            X.0ts r3 = r12.A0Q
            X.0wo r2 = r12.A0O
            long r0 = r6.A05
            long r0 = r2.A08(r0)
            java.lang.String r11 = X.C20040wv.A05(r3, r0)
            long r0 = r6.A05
            java.lang.String r0 = X.C165607th.A0q(r2, r3, r0)
            java.lang.String r0 = X.AnonymousClass6XI.A03(r3, r11, r0)
            java.lang.String r0 = X.C36391kE.A0v(r5, r0, r9, r8, r10)
            r7.A0A = r0
        L_0x0093:
            X.B66 r0 = r12.A0S()
            X.9Yc r3 = r0.BFZ()
            if (r3 == 0) goto L_0x00e5
            X.0yC r1 = r3.A07
            r0 = 842(0x34a, float:1.18E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00e5
            int r1 = r6.A03
            r0 = 9
            if (r1 != r0) goto L_0x0138
            int r2 = r6.A01
            r1 = 2131232402(0x7f080692, float:1.8080912E38)
            if (r2 == r4) goto L_0x00bd
            r0 = 2
            r1 = 2131232401(0x7f080691, float:1.808091E38)
            if (r2 == r0) goto L_0x00bd
            r1 = 2131231033(0x7f080139, float:1.8078136E38)
        L_0x00bd:
            r7.A00 = r1
            X.9lY r8 = r12.A03
            if (r8 == 0) goto L_0x00e5
            boolean r0 = r3 instanceof X.C178418fu
            if (r0 == 0) goto L_0x0134
            r2 = 2131890426(0x7f1210fa, float:1.9415543E38)
        L_0x00ca:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.1FR r0 = r3.A08
            java.lang.String r0 = r0.A0Q(r8)
            java.lang.String r0 = android.text.Html.escapeHtml(r0)
            java.lang.String r0 = X.C36381kD.A0r(r5, r0, r1, r2)
            r7.A07 = r0
            r1 = 35
            X.9v0 r0 = new X.9v0
            r0.<init>(r12, r1)
            r7.A03 = r0
        L_0x00e5:
            java.lang.Boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0131
            com.whatsapp.jid.UserJid r1 = r6.A0D
        L_0x00f3:
            if (r1 == 0) goto L_0x00fd
            X.16D r0 = r12.A0M
            X.141 r0 = r0.A0D(r1)
            r7.A05 = r0
        L_0x00fd:
            X.141 r0 = r7.A05
            if (r0 == 0) goto L_0x0115
            r1 = 23
        L_0x0103:
            X.72v r2 = new X.72v
            r2.<init>(r12, r7, r1)
            r1 = 37
            X.9v0 r0 = new X.9v0
            r0.<init>(r2, r1)
        L_0x010f:
            r7.A04 = r0
            r13.add(r7)
            return
        L_0x0115:
            X.B66 r0 = r12.A0S()
            X.B1E r0 = r0.BFN()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r12.A0W()
            if (r0 == 0) goto L_0x012f
            X.1EZ r0 = r12.A0T
            boolean r0 = r0.A0E()
            r1 = 22
            if (r0 != 0) goto L_0x0103
        L_0x012f:
            r0 = 0
            goto L_0x010f
        L_0x0131:
            com.whatsapp.jid.UserJid r1 = r6.A0E
            goto L_0x00f3
        L_0x0134:
            r2 = 2131890425(0x7f1210f9, float:1.9415541E38)
            goto L_0x00ca
        L_0x0138:
            X.1YQ r2 = r12.A0d
            X.8av r0 = r6.A0A
            if (r0 == 0) goto L_0x0171
            X.9ue r8 = r0.A00
            if (r8 == 0) goto L_0x0171
            java.lang.String r0 = r8.A02
            java.lang.Long r1 = X.C36431kI.A15(r0)
            X.1YS r0 = r2.A05
            java.util.concurrent.ConcurrentHashMap r0 = r0.A01
            java.lang.Object r2 = r0.get(r1)
            X.9dE r2 = (X.C198299dE) r2
            if (r2 == 0) goto L_0x0171
            java.lang.String r0 = r8.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0171
            int r1 = r6.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x0181
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0181
            r0 = 419(0x1a3, float:5.87E-43)
            if (r1 == r0) goto L_0x0181
            r0 = 420(0x1a4, float:5.89E-43)
            if (r1 == r0) goto L_0x0181
            switch(r1) {
                case 401: goto L_0x0181;
                case 402: goto L_0x0181;
                case 403: goto L_0x0181;
                default: goto L_0x0171;
            }
        L_0x0171:
            r0 = 0
        L_0x0172:
            r7.A07 = r0
            boolean r0 = r3 instanceof X.C178418fu
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/cant-see-cashback-in-bank-account/"
        L_0x017a:
            r7.A06 = r0
            goto L_0x00e5
        L_0x017e:
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/cant-see-cashback-in-bank-account-br-p2p/"
            goto L_0x017a
        L_0x0181:
            X.9ua r0 = r2.A07
            X.0ts r2 = r3.A06
            X.16X r1 = r0.A02
            X.16U r0 = r0.A01
            android.text.SpannableStringBuilder r0 = X.AnonymousClass9Zb.A00(r5, r2, r0, r1)
            java.lang.String r2 = r0.toString()
            boolean r0 = r3 instanceof X.C178418fu
            if (r0 == 0) goto L_0x019f
            r1 = 2131890424(0x7f1210f8, float:1.941554E38)
        L_0x0198:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C36381kD.A0r(r5, r2, r0, r1)
            goto L_0x0172
        L_0x019f:
            r1 = 2131890423(0x7f1210f7, float:1.9415537E38)
            goto L_0x0198
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167797yq.A0i(java.util.List):void");
    }

    public void A0j(List list) {
        if (this.A0X.A04(0) && A0s(this.A06.A01)) {
            list.add(new C180008l3(new AnonymousClass9v0(this, 36)));
        }
    }

    public void A0k(List list) {
        String str;
        Context context;
        int i;
        Object[] objArr;
        C180028l5 r6 = new C180028l5();
        C202319lY r5 = this.A06.A01;
        if (r5.A0K()) {
            int i2 = r5.A02;
            if (i2 == 12 || i2 == 11) {
                str = (String) this.A0g.A0H(r5).second;
            }
            str = null;
        } else {
            AnonymousClass1FR r0 = this.A0g;
            String A0R2 = r0.A0R(r5);
            String A0U2 = r0.A0U(r5);
            int i3 = r5.A02;
            if (i3 == 406 || i3 == 407) {
                context = this.A0P.A00;
                i = R.string.f12nameremoved;
                objArr = new Object[]{A0R2};
            } else {
                if (i3 == 102 && this.A0J.A0M(r5.A0D)) {
                    context = this.A0P.A00;
                    i = R.string.f12nameremoved;
                    objArr = new Object[]{A0U2};
                }
                str = null;
            }
            str = context.getString(i, objArr);
        }
        if (!C202319lY.A02(r5) && !TextUtils.isEmpty(str)) {
            r6.A01 = str;
            r6.A00 = 0;
            list.add(r6);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0296, code lost:
        r2 = r2.A01.A00;
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        if (r8.A08 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03d3, code lost:
        r2 = r2.A01.A00;
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03f5, code lost:
        r10 = X.C36351kA.A0w(r2, r12, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03fb, code lost:
        r2 = r2.A01.A00;
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04c7, code lost:
        r2 = r2.A01.A00;
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0513, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0185, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b0, code lost:
        r2 = r2.A01.A00;
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e3, code lost:
        r2 = r2.A01.A00;
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01eb, code lost:
        r2 = r2.A01.A00;
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0l(java.util.List r15) {
        /*
            r14 = this;
            X.9Ml r0 = r14.A06
            X.9lY r9 = r0.A01
            X.9un r8 = r0.A00
            X.8lH r7 = new X.8lH
            r7.<init>()
            r14.A0c(r7)
            X.0wG r0 = r14.A0P
            android.content.Context r6 = r0.A00
            boolean r1 = r9.A0K()
            r0 = 2131892146(0x7f1217b2, float:1.9419032E38)
            if (r1 == 0) goto L_0x001e
            r0 = 2131892255(0x7f12181f, float:1.9419253E38)
        L_0x001e:
            java.lang.String r0 = r6.getString(r0)
            r7.A05 = r0
            X.1FR r0 = r14.A0g
            int r0 = r0.A0C(r9)
            r7.A01 = r0
            if (r0 == 0) goto L_0x066a
            long r0 = r9.A06
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x005a
            r10 = 2131894927(0x7f12228f, float:1.9424673E38)
            java.lang.Object[] r5 = X.AnonymousClass001.A0L()
            r4 = 0
            X.0ts r3 = r14.A0Q
            X.0wo r2 = r14.A0O
            long r0 = r2.A08(r0)
            java.lang.String r11 = X.C20040wv.A05(r3, r0)
            long r0 = r9.A06
            java.lang.String r0 = X.C165607th.A0q(r2, r3, r0)
            java.lang.String r0 = X.AnonymousClass6XI.A03(r3, r11, r0)
            java.lang.String r0 = X.C36391kE.A0v(r6, r0, r5, r4, r10)
            r7.A07 = r0
        L_0x005a:
            X.B66 r0 = r14.A0S()
            X.B3q r3 = r0.BAJ()
            X.9iR r2 = r14.A0f
            if (r3 == 0) goto L_0x064b
            java.lang.String r1 = r9.A0J
            if (r1 == 0) goto L_0x064b
            if (r8 == 0) goto L_0x0071
            X.8bF r0 = r8.A08
            r5 = 1
            if (r0 != 0) goto L_0x0072
        L_0x0071:
            r5 = 0
        L_0x0072:
            r0 = -1
            int r1 = X.AnonymousClass6R8.A00(r1, r0)
            int r4 = r9.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r4 == r0) goto L_0x063c
            r0 = 108(0x6c, float:1.51E-43)
            if (r4 == r0) goto L_0x063c
            r0 = 406(0x196, float:5.69E-43)
            if (r4 != r0) goto L_0x064b
            boolean r0 = r3.BM6(r1)
            if (r0 == 0) goto L_0x05f9
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894978(0x7f1222c2, float:1.9424776E38)
            if (r5 != 0) goto L_0x0097
            r0 = 2131894980(0x7f1222c4, float:1.942478E38)
        L_0x0097:
            java.lang.String r0 = r1.getString(r0)
        L_0x009b:
            r7.A0B = r0
            if (r0 == 0) goto L_0x0146
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            r7.A0C = r2
            r0 = 38
            X.736 r4 = new X.736
            r4.<init>(r14, r8, r9, r0)
            r0 = 20
            X.72v r1 = new X.72v
            r1.<init>(r14, r8, r0)
            java.lang.String r0 = "forgot-pin"
            r2.put(r0, r1)
            java.util.Map r2 = r7.A0C
            r0 = 21
            X.72v r1 = new X.72v
            r1.<init>(r14, r8, r0)
            java.lang.String r0 = "view-balance"
            r2.put(r0, r1)
            java.util.Map r1 = r7.A0C
            java.lang.String r0 = "learn-more"
            r1.put(r0, r4)
            java.util.Map r1 = r7.A0C
            java.lang.String r0 = "refund_failed_learn_more"
            r1.put(r0, r4)
            java.util.Map r2 = r7.A0C
            boolean r0 = r14 instanceof X.C180338lb
            if (r0 == 0) goto L_0x00e6
            r0 = 15
            X.72v r1 = new X.72v
            r1.<init>(r14, r8, r0)
            java.lang.String r0 = "verify-now"
            r2.put(r0, r1)
        L_0x00e6:
            java.util.Map r2 = r7.A0C
            boolean r0 = r14 instanceof X.C180308lY
            if (r0 == 0) goto L_0x013f
            r0 = 44
        L_0x00ee:
            X.AVY r1 = new X.AVY
            r1.<init>(r14, r0)
            java.lang.String r0 = "incoming_payment_limit_learn_more"
            r2.put(r0, r1)
        L_0x00f8:
            if (r3 == 0) goto L_0x013d
            java.lang.String r1 = r9.A0J
            if (r1 == 0) goto L_0x013d
            r0 = -1
            int r2 = X.AnonymousClass6R8.A00(r1, r0)
            int r1 = r9.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x010d
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x013d
        L_0x010d:
            java.lang.String r0 = r3.BAN(r2)
        L_0x0111:
            r7.A09 = r0
            if (r3 == 0) goto L_0x013b
            java.lang.String r1 = r9.A0J
            if (r1 == 0) goto L_0x013b
            r0 = -1
            int r2 = X.AnonymousClass6R8.A00(r1, r0)
            int r1 = r9.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x0128
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x013b
        L_0x0128:
            java.lang.String r0 = r3.BAL(r2)
        L_0x012c:
            r7.A08 = r0
            r1 = 19
            X.3YM r0 = new X.3YM
            r0.<init>(r14, r9, r3, r1)
            r7.A03 = r0
            r15.add(r7)
            return
        L_0x013b:
            r0 = 0
            goto L_0x012c
        L_0x013d:
            r0 = 0
            goto L_0x0111
        L_0x013f:
            boolean r0 = r14 instanceof X.C180328la
            if (r0 == 0) goto L_0x00f8
            r0 = 42
            goto L_0x00ee
        L_0x0146:
            X.1FR r5 = r2.A04
            java.lang.String r12 = r5.A0Q(r9)
            boolean r0 = r9.A0K()
            r6 = 0
            r8 = 0
            if (r0 == 0) goto L_0x05f5
            java.lang.String r6 = r5.A0S(r9)
            java.lang.String r11 = r5.A0T(r9)
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r0 = r1.getString(r0)
            boolean r13 = r11.equals(r0)
        L_0x016b:
            X.1EU r0 = r2.A03
            X.B66 r0 = r0.A05()
            X.B2X r1 = r0.BAP()
            if (r1 == 0) goto L_0x018b
            X.0wG r0 = r2.A01
            android.content.res.Resources r0 = X.C36421kH.A0B(r0)
            java.lang.String r10 = r1.BIY(r0, r9, r12)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x018b
        L_0x0187:
            r7.A0A = r10
            goto L_0x00f8
        L_0x018b:
            int r0 = r9.A02
            if (r0 == 0) goto L_0x0529
            r1 = 418(0x1a2, float:5.86E-43)
            if (r0 == r1) goto L_0x0520
            r1 = -1
            java.lang.String r10 = ""
            r4 = 1
            switch(r0) {
                case 11: goto L_0x01b0;
                case 12: goto L_0x047c;
                case 13: goto L_0x0503;
                case 14: goto L_0x0187;
                case 15: goto L_0x04ef;
                case 16: goto L_0x04db;
                case 17: goto L_0x04c7;
                case 18: goto L_0x04d0;
                default: goto L_0x019a;
            }
        L_0x019a:
            r11 = 3
            r6 = 2
            switch(r0) {
                case 101: goto L_0x01b0;
                case 102: goto L_0x0404;
                case 103: goto L_0x0590;
                case 104: goto L_0x0590;
                case 105: goto L_0x0473;
                case 106: goto L_0x043d;
                case 107: goto L_0x046a;
                case 108: goto L_0x0187;
                case 109: goto L_0x0461;
                case 110: goto L_0x0458;
                case 111: goto L_0x044f;
                case 112: goto L_0x03dc;
                default: goto L_0x019f;
            }
        L_0x019f:
            r13 = 402(0x192, float:5.63E-43)
            switch(r0) {
                case 401: goto L_0x01b0;
                case 402: goto L_0x054d;
                case 403: goto L_0x024e;
                case 404: goto L_0x03e4;
                case 405: goto L_0x023c;
                case 406: goto L_0x029f;
                case 407: goto L_0x029f;
                case 408: goto L_0x0283;
                case 409: goto L_0x0187;
                case 410: goto L_0x0269;
                case 411: goto L_0x03e4;
                case 412: goto L_0x053b;
                case 413: goto L_0x0260;
                case 414: goto L_0x0257;
                case 415: goto L_0x03d3;
                case 416: goto L_0x0233;
                default: goto L_0x01a4;
            }
        L_0x01a4:
            switch(r0) {
                case 420: goto L_0x022b;
                case 421: goto L_0x0223;
                case 422: goto L_0x0296;
                case 423: goto L_0x03d3;
                case 424: goto L_0x03fb;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            switch(r0) {
                case 601: goto L_0x021b;
                case 602: goto L_0x021b;
                case 603: goto L_0x0213;
                case 604: goto L_0x04c7;
                case 605: goto L_0x020b;
                case 606: goto L_0x0203;
                case 607: goto L_0x01fb;
                case 608: goto L_0x01f3;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            switch(r0) {
                case 801: goto L_0x01eb;
                case 802: goto L_0x01e3;
                case 803: goto L_0x01eb;
                case 804: goto L_0x01e3;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            switch(r0) {
                case 901: goto L_0x01db;
                case 902: goto L_0x01db;
                case 903: goto L_0x01c4;
                case 904: goto L_0x01bc;
                case 905: goto L_0x01db;
                case 906: goto L_0x01db;
                case 907: goto L_0x01eb;
                case 908: goto L_0x01e3;
                default: goto L_0x01b0;
            }
        L_0x01b0:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892652(0x7f1219ac, float:1.9420058E38)
        L_0x01b7:
            java.lang.String r10 = r2.getString(r1)
            goto L_0x0187
        L_0x01bc:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892647(0x7f1219a7, float:1.9420048E38)
            goto L_0x01b7
        L_0x01c4:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            X.0yC r0 = r5.A06
            int r0 = X.C165587tf.A05(r0)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r1 = 2131892644(0x7f1219a4, float:1.9420042E38)
            if (r0 == 0) goto L_0x01b7
            r1 = 2131892638(0x7f12199e, float:1.942003E38)
            goto L_0x01b7
        L_0x01db:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892648(0x7f1219a8, float:1.942005E38)
            goto L_0x01b7
        L_0x01e3:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892646(0x7f1219a6, float:1.9420046E38)
            goto L_0x01b7
        L_0x01eb:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892649(0x7f1219a9, float:1.9420052E38)
            goto L_0x01b7
        L_0x01f3:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892756(0x7f121a14, float:1.942027E38)
            goto L_0x01b7
        L_0x01fb:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892757(0x7f121a15, float:1.9420271E38)
            goto L_0x01b7
        L_0x0203:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892760(0x7f121a18, float:1.9420277E38)
            goto L_0x01b7
        L_0x020b:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892640(0x7f1219a0, float:1.9420034E38)
            goto L_0x01b7
        L_0x0213:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892758(0x7f121a16, float:1.9420273E38)
            goto L_0x01b7
        L_0x021b:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892759(0x7f121a17, float:1.9420275E38)
            goto L_0x01b7
        L_0x0223:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895059(0x7f122313, float:1.942494E38)
            goto L_0x01b7
        L_0x022b:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895048(0x7f122308, float:1.9424918E38)
            goto L_0x01b7
        L_0x0233:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895061(0x7f122315, float:1.9424944E38)
            goto L_0x03f5
        L_0x023c:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            boolean r0 = X.C200899iR.A01(r9)
            r1 = 2131892063(0x7f12175f, float:1.9418864E38)
            if (r0 == 0) goto L_0x03f5
            r1 = 2131892053(0x7f121755, float:1.9418843E38)
            goto L_0x03f5
        L_0x024e:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895046(0x7f122306, float:1.9424914E38)
            goto L_0x03f5
        L_0x0257:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895027(0x7f1222f3, float:1.9424875E38)
            goto L_0x01b7
        L_0x0260:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895028(0x7f1222f4, float:1.9424877E38)
            goto L_0x01b7
        L_0x0269:
            java.lang.String r1 = r9.A0G
            X.9l8 r0 = X.C202159l8.A0E
            java.lang.String r0 = "BR"
            boolean r1 = r1.equals(r0)
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            if (r1 == 0) goto L_0x027e
            r1 = 2131895038(0x7f1222fe, float:1.9424898E38)
            goto L_0x01b7
        L_0x027e:
            r1 = 2131895037(0x7f1222fd, float:1.9424896E38)
            goto L_0x03f5
        L_0x0283:
            X.8av r0 = r9.A0A
            if (r0 == 0) goto L_0x0296
            int r0 = r0.A08()
            if (r0 != r13) goto L_0x0296
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895056(0x7f122310, float:1.9424934E38)
            goto L_0x03f5
        L_0x0296:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895055(0x7f12230f, float:1.9424932E38)
            goto L_0x01b7
        L_0x029f:
            java.lang.String r0 = r9.A0J
            if (r0 == 0) goto L_0x03d3
            if (r3 == 0) goto L_0x03d3
            int r1 = X.AnonymousClass6R8.A00(r0, r1)
            boolean r0 = r3.BNT(r1)
            if (r0 == 0) goto L_0x02d8
            X.0wG r0 = r2.A01
            android.content.Context r11 = r0.A00
            r10 = 2131895042(0x7f122302, float:1.9424906E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r0 = r3.BPY()
            X.AnonymousClass000.A1L(r6, r0, r8)
            X.16U r5 = r9.A03()
            X.0ts r2 = r2.A02
            int r1 = r3.BPX()
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.lang.String r0 = r5.B7e(r2, r0)
            java.lang.String r10 = X.C36391kE.A0v(r11, r0, r6, r4, r10)
            goto L_0x0187
        L_0x02d8:
            boolean r0 = r3.BM5(r1)
            if (r0 == 0) goto L_0x02ef
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r0 = 2131894982(0x7f1222c6, float:1.9424784E38)
        L_0x02e5:
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r10 = r3.BBd(r0, r1)
            goto L_0x0187
        L_0x02ef:
            boolean r0 = r3.BM7(r1)
            if (r0 == 0) goto L_0x02fd
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r0 = 2131894986(0x7f1222ca, float:1.9424792E38)
            goto L_0x02e5
        L_0x02fd:
            boolean r0 = r3.BMB(r1)
            if (r0 == 0) goto L_0x030b
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r0 = 2131894984(0x7f1222c8, float:1.9424788E38)
            goto L_0x02e5
        L_0x030b:
            boolean r0 = r3.BLX(r1)
            if (r0 == 0) goto L_0x0319
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r0 = 2131895057(0x7f122311, float:1.9424936E38)
            goto L_0x02e5
        L_0x0319:
            boolean r0 = r3.BMA(r1)
            if (r0 == 0) goto L_0x0328
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131894989(0x7f1222cd, float:1.9424798E38)
            goto L_0x01b7
        L_0x0328:
            boolean r0 = r3.BM9(r1)
            if (r0 == 0) goto L_0x0337
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131894988(0x7f1222cc, float:1.9424796E38)
            goto L_0x01b7
        L_0x0337:
            boolean r0 = r3.BM8(r1)
            if (r0 == 0) goto L_0x0346
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131894987(0x7f1222cb, float:1.9424794E38)
            goto L_0x01b7
        L_0x0346:
            boolean r0 = r3.BMC(r1)
            if (r0 == 0) goto L_0x0355
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131894985(0x7f1222c9, float:1.942479E38)
            goto L_0x01b7
        L_0x0355:
            boolean r0 = r3.BMg(r1)
            if (r0 == 0) goto L_0x0364
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131894998(0x7f1222d6, float:1.9424817E38)
            goto L_0x01b7
        L_0x0364:
            boolean r0 = r3.BNY(r1)
            if (r0 == 0) goto L_0x0373
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895001(0x7f1222d9, float:1.9424823E38)
            goto L_0x01b7
        L_0x0373:
            boolean r0 = r3.BMM(r1)
            if (r0 != 0) goto L_0x03ca
            boolean r0 = r3.BMK(r1)
            if (r0 != 0) goto L_0x03ca
            boolean r0 = r3.BML(r1)
            if (r0 == 0) goto L_0x038e
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131894992(0x7f1222d0, float:1.9424804E38)
            goto L_0x01b7
        L_0x038e:
            boolean r0 = r3.BMQ(r1)
            if (r0 == 0) goto L_0x039d
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131894990(0x7f1222ce, float:1.94248E38)
            goto L_0x01b7
        L_0x039d:
            boolean r0 = r3.BMR(r1)
            if (r0 == 0) goto L_0x03ac
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131894991(0x7f1222cf, float:1.9424802E38)
            goto L_0x01b7
        L_0x03ac:
            boolean r0 = r3.BMf(r1)
            if (r0 == 0) goto L_0x03bb
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131894997(0x7f1222d5, float:1.9424815E38)
            goto L_0x01b7
        L_0x03bb:
            java.lang.String r10 = r3.BGm(r1)
            if (r10 != 0) goto L_0x0187
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r0 = 2131895036(0x7f1222fc, float:1.9424894E38)
            goto L_0x02e5
        L_0x03ca:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131894993(0x7f1222d1, float:1.9424806E38)
            goto L_0x01b7
        L_0x03d3:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895036(0x7f1222fc, float:1.9424894E38)
            goto L_0x01b7
        L_0x03dc:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895053(0x7f12230d, float:1.9424928E38)
            goto L_0x03f5
        L_0x03e4:
            X.8av r0 = r9.A0A
            if (r0 == 0) goto L_0x03fb
            int r0 = r0.A08()
            if (r0 != r13) goto L_0x03fb
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895058(0x7f122312, float:1.9424938E38)
        L_0x03f5:
            java.lang.String r10 = X.C36351kA.A0w(r2, r12, r4, r1)
            goto L_0x0187
        L_0x03fb:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895057(0x7f122311, float:1.9424936E38)
            goto L_0x01b7
        L_0x0404:
            java.lang.Long r0 = r5.A0L(r9)
            if (r0 == 0) goto L_0x0187
            long r0 = r0.longValue()
            java.lang.String r6 = r5.A0M(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x042b
            X.0wG r0 = r2.A01
            android.content.res.Resources r2 = X.C36421kH.A0B(r0)
            r1 = 2131755391(0x7f10017f, float:1.914166E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r8] = r6
            java.lang.String r10 = r2.getQuantityString(r1, r4, r0)
            goto L_0x0187
        L_0x042b:
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895047(0x7f122307, float:1.9424916E38)
            if (r4 <= 0) goto L_0x01b7
            r1 = 2131895051(0x7f12230b, float:1.9424924E38)
            goto L_0x01b7
        L_0x043d:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            boolean r0 = X.C200899iR.A01(r9)
            r1 = 2131892062(0x7f12175e, float:1.9418862E38)
            if (r0 == 0) goto L_0x01b7
            r1 = 2131892052(0x7f121754, float:1.9418841E38)
            goto L_0x01b7
        L_0x044f:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131897100(0x7f122b0c, float:1.942908E38)
            goto L_0x01b7
        L_0x0458:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131897099(0x7f122b0b, float:1.9429078E38)
            goto L_0x01b7
        L_0x0461:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131897101(0x7f122b0d, float:1.9429082E38)
            goto L_0x01b7
        L_0x046a:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895052(0x7f12230c, float:1.9424926E38)
            goto L_0x01b7
        L_0x0473:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892643(0x7f1219a3, float:1.942004E38)
            goto L_0x01b7
        L_0x047c:
            int r1 = r9.A03
            r0 = 20
            if (r1 != r0) goto L_0x05a2
            X.0wQ r1 = r2.A00
            com.whatsapp.jid.UserJid r0 = r9.A0E
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x05a2
            java.lang.Long r0 = r5.A0L(r9)
            if (r0 == 0) goto L_0x0187
            long r0 = r0.longValue()
            android.util.Pair r10 = r5.A0G(r0)
            if (r10 == 0) goto L_0x04b5
            X.0wG r0 = r2.A01
            android.content.res.Resources r6 = X.C36421kH.A0B(r0)
            r5 = 2131755388(0x7f10017c, float:1.9141654E38)
            int r2 = X.C36381kD.A04(r10)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Object r0 = r10.second
            r1[r8] = r0
            java.lang.String r10 = r6.getQuantityString(r5, r2, r1)
            goto L_0x0187
        L_0x04b5:
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895030(0x7f1222f6, float:1.9424881E38)
            if (r4 <= 0) goto L_0x01b7
            r1 = 2131895031(0x7f1222f7, float:1.9424884E38)
            goto L_0x01b7
        L_0x04c7:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892639(0x7f12199f, float:1.9420032E38)
            goto L_0x01b7
        L_0x04d0:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            if (r13 == 0) goto L_0x05ec
            r1 = 2131892534(0x7f121936, float:1.941982E38)
            goto L_0x01b7
        L_0x04db:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            if (r13 == 0) goto L_0x04ea
            r0 = 2131892536(0x7f121938, float:1.9419823E38)
            java.lang.String r10 = X.C36351kA.A0w(r2, r6, r4, r0)
            goto L_0x0187
        L_0x04ea:
            r1 = 2131892535(0x7f121937, float:1.9419821E38)
            goto L_0x01b7
        L_0x04ef:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            if (r13 == 0) goto L_0x04fe
            r0 = 2131892538(0x7f12193a, float:1.9419827E38)
            java.lang.String r10 = X.C36351kA.A0w(r2, r6, r4, r0)
            goto L_0x0187
        L_0x04fe:
            r1 = 2131892537(0x7f121939, float:1.9419825E38)
            goto L_0x01b7
        L_0x0503:
            if (r3 == 0) goto L_0x0517
            java.lang.String r0 = r9.A0J
            int r0 = X.AnonymousClass6R8.A00(r0, r1)
            java.lang.String r10 = r3.BAO(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0517
            goto L_0x0187
        L_0x0517:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131892528(0x7f121930, float:1.9419807E38)
            goto L_0x01b7
        L_0x0520:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895029(0x7f1222f5, float:1.942488E38)
            goto L_0x01b7
        L_0x0529:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            boolean r0 = r9.A0K()
            r1 = 2131895034(0x7f1222fa, float:1.942489E38)
            if (r0 == 0) goto L_0x01b7
            r1 = 2131892527(0x7f12192f, float:1.9419805E38)
            goto L_0x01b7
        L_0x053b:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895050(0x7f12230a, float:1.9424922E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.C36331k8.A1X(r0, r6, r8, r11, r4)
            java.lang.String r10 = r2.getString(r1, r0)
            goto L_0x0187
        L_0x054d:
            java.lang.Long r0 = r5.A0L(r9)
            if (r0 == 0) goto L_0x0187
            long r0 = r0.longValue()
            java.lang.String r8 = r5.A0M(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L_0x0574
            X.0wG r0 = r2.A01
            android.content.res.Resources r2 = X.C36421kH.A0B(r0)
            r1 = 2131755390(0x7f10017e, float:1.9141658E38)
            java.lang.Object[] r0 = X.C36431kI.A1a(r12, r8, r6)
            java.lang.String r10 = r2.getQuantityString(r1, r4, r0)
            goto L_0x0187
        L_0x0574:
            r10 = 0
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            if (r5 <= 0) goto L_0x0587
            r0 = 2131895049(0x7f122309, float:1.942492E38)
            java.lang.String r10 = X.C36351kA.A0w(r1, r12, r4, r0)
            goto L_0x0187
        L_0x0587:
            r0 = 2131895047(0x7f122307, float:1.9424916E38)
            java.lang.String r10 = r1.getString(r0)
            goto L_0x0187
        L_0x0590:
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r1 = 2131895033(0x7f1222f9, float:1.9424888E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.C36331k8.A1X(r0, r6, r8, r11, r4)
            java.lang.String r10 = r2.getString(r1, r0)
            goto L_0x0187
        L_0x05a2:
            X.C18740tg.A06(r6)
            java.lang.Long r0 = r5.A0L(r9)
            if (r0 == 0) goto L_0x0187
            long r0 = r0.longValue()
            android.util.Pair r10 = r5.A0G(r0)
            if (r10 == 0) goto L_0x05d0
            X.0wG r0 = r2.A01
            android.content.res.Resources r8 = X.C36421kH.A0B(r0)
            r5 = 2131755389(0x7f10017d, float:1.9141656E38)
            int r2 = X.C36381kD.A04(r10)
            java.lang.Object[] r1 = X.C36411kG.A1b(r6)
            java.lang.Object r0 = r10.second
            r1[r4] = r0
            java.lang.String r10 = r8.getQuantityString(r5, r2, r1)
            goto L_0x0187
        L_0x05d0:
            r10 = 0
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            if (r5 <= 0) goto L_0x05e3
            r0 = 2131895032(0x7f1222f8, float:1.9424886E38)
            java.lang.String r10 = X.C36351kA.A0w(r1, r6, r4, r0)
            goto L_0x0187
        L_0x05e3:
            r0 = 2131895030(0x7f1222f6, float:1.9424881E38)
            java.lang.String r10 = r1.getString(r0)
            goto L_0x0187
        L_0x05ec:
            r0 = 2131892533(0x7f121935, float:1.9419817E38)
            java.lang.String r10 = X.C36351kA.A0w(r2, r11, r4, r0)
            goto L_0x0187
        L_0x05f5:
            r11 = r6
            r13 = 0
            goto L_0x016b
        L_0x05f9:
            boolean r0 = r3.BMP(r1)
            if (r0 == 0) goto L_0x060d
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894994(0x7f1222d2, float:1.9424808E38)
            if (r5 != 0) goto L_0x0097
            r0 = 2131894995(0x7f1222d3, float:1.942481E38)
            goto L_0x0097
        L_0x060d:
            boolean r0 = r3.BM5(r1)
            if (r0 == 0) goto L_0x062d
            X.1EU r0 = r2.A03
            X.B66 r0 = r0.A05()
            boolean r0 = r0.B2O()
            if (r0 == 0) goto L_0x062d
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894982(0x7f1222c6, float:1.9424784E38)
            if (r5 == 0) goto L_0x0097
            r0 = 2131894983(0x7f1222c7, float:1.9424786E38)
            goto L_0x0097
        L_0x062d:
            boolean r0 = r3.BLa(r1)
            if (r0 == 0) goto L_0x064b
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894974(0x7f1222be, float:1.9424768E38)
            goto L_0x0097
        L_0x063c:
            boolean r0 = r3.BMr(r1)
            if (r0 == 0) goto L_0x064b
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895041(0x7f122301, float:1.9424904E38)
            goto L_0x0097
        L_0x064b:
            int r1 = r9.A02
            r0 = 14
            if (r1 == r0) goto L_0x0661
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x0658
            r0 = 0
            goto L_0x009b
        L_0x0658:
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895054(0x7f12230e, float:1.942493E38)
            goto L_0x0097
        L_0x0661:
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892641(0x7f1219a1, float:1.9420036E38)
            goto L_0x0097
        L_0x066a:
            r0 = 2131894971(0x7f1222bb, float:1.9424762E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A06 = r0
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167797yq.A0l(java.util.List):void");
    }

    public void A0m(List list) {
        C202319lY r3 = this.A06.A01;
        if (this.A0X.A02.A0E(1359) && r3.A03 == 100 && r3.A0L() && !r3.A0H()) {
            A04(list);
            C180068l9 r2 = new C180068l9();
            r2.A00 = new AnonymousClass3YH(this, r3, 7);
            list.add(r2);
        }
    }

    public void A0q(boolean z) {
        C183758rJ r2;
        boolean z2 = z;
        if (this instanceof C180228lP) {
            C180228lP r22 = (C180228lP) this;
            if (r22.A05 == null) {
                C180288lW r1 = new C180288lW(r22, r22.A04, r22.A0A, r22.A0H, z2);
                r22.A05 = r1;
                C36331k8.A1F(r1, r22.A0h);
            }
        } else if (this.A05 == null) {
            String str = this.A0A;
            if ("native".equals(str)) {
                r2 = new C183758rJ(this, this.A07, this.A0B, z);
            } else if ("non_native".equals(str)) {
                r2 = new C180278lV(this, this.A07, this.A0B, z);
            } else {
                C165577te.A1M("PaymentTransactionDetailsViewModel", "unsupported payment receipt type");
                return;
            }
            this.A05 = r2;
            C36331k8.A1F(r2, this.A0h);
        }
    }

    public boolean A0r() {
        C193689Ml r0 = this.A06;
        if (r0 == null || TextUtils.isEmpty(r0.A01.A0K) || this.A06.A01.A0K()) {
            return false;
        }
        return true;
    }

    public static void A01(Context context, C180118lE r1, int i) {
        r1.A04 = context.getString(i);
    }

    public String A0X(C202319lY r2) {
        if (r2.A0K() || C203419nz.A07(r2.A0F)) {
            return r2.A0F;
        }
        return r2.A0K;
    }

    public void A0g(List list) {
        C207259uo r0;
        A0e(list);
        A0n(list);
        A05(list);
        C193689Ml r02 = this.A06;
        C18740tg.A06(r02);
        C202319lY r4 = r02.A01;
        C175708av r3 = r4.A0A;
        if (!(r3 == null || (r0 = r3.A02) == null || TextUtils.isEmpty(r0.A02))) {
            list.add(new C180018l4(new AnonymousClass3YM(this, r3, r4, 18), this.A06.A01));
            A04(list);
        }
        A0o(list);
        A0m(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0n(java.util.List r11) {
        /*
            r10 = this;
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            X.8lE r0 = r10.A0V()
            if (r0 == 0) goto L_0x01c5
            A05(r11)
            r11.add(r0)
        L_0x0010:
            X.1EV r2 = r10.A0X
            X.9l8 r1 = X.C202159l8.A0E
            X.1De r0 = r2.A04
            X.9l8 r0 = r0.A02()
            if (r1 != r0) goto L_0x0030
            boolean r0 = r2.A0E()
            if (r0 != 0) goto L_0x0028
            boolean r0 = r2.A0B()
            if (r0 == 0) goto L_0x0030
        L_0x0028:
            X.9Ml r0 = r10.A06
            if (r0 != 0) goto L_0x0169
            r6 = 0
        L_0x002d:
            r3.add(r6)
        L_0x0030:
            X.9FU r0 = r10.A0T()
            r3.add(r0)
            X.8lE r0 = r10.A0U()
            r3.add(r0)
            r4 = r10
            boolean r2 = r10 instanceof X.C180338lb
            if (r2 == 0) goto L_0x0166
            X.9Ml r0 = r10.A06
            r6 = 0
            if (r0 == 0) goto L_0x0077
            X.9lY r0 = r0.A01
            if (r0 == 0) goto L_0x0077
            X.8av r5 = r0.A0A
            if (r5 == 0) goto L_0x0077
            boolean r0 = r5 instanceof X.C175928bI
            if (r0 == 0) goto L_0x0077
            X.8bI r5 = (X.C175928bI) r5
            X.9e1 r0 = r5.A0F
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0077
            X.8lE r6 = new X.8lE
            r6.<init>()
            X.0wG r0 = r10.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131892200(0x7f1217e8, float:1.9419142E38)
            A01(r1, r6, r0)
            X.9e1 r0 = r5.A0F
            java.lang.String r0 = r0.A01
            r6.A03 = r0
        L_0x0077:
            r3.add(r6)
            X.9Ml r0 = r10.A06
            r9 = 0
            if (r0 == 0) goto L_0x00d2
            X.9lY r0 = r0.A01
            X.8av r0 = r0.A0A
            if (r0 == 0) goto L_0x00d2
            X.9uW r1 = r0.A0B()
            if (r1 == 0) goto L_0x00d2
            int r8 = r1.A01
            r0 = 1
            if (r8 <= r0) goto L_0x00d2
            X.9ua r6 = r1.A02
            if (r6 == 0) goto L_0x00d2
            java.lang.Integer r0 = X.C36381kD.A0m()
            A02(r1, r10, r0, r9)
            X.0ts r5 = r10.A0Q
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.16U r1 = r6.A01
            X.AnonymousClass00C.A08(r1)
            X.16X r0 = r6.A02
            java.lang.String r7 = r1.B7d(r5, r0)
            X.AnonymousClass00C.A08(r7)
            X.8lE r9 = new X.8lE
            r9.<init>()
            X.0wG r0 = r10.A0P
            android.content.Context r6 = r0.A00
            r0 = 2131890494(0x7f12113e, float:1.9415681E38)
            A01(r6, r9, r0)
            r5 = 2131892305(0x7f121851, float:1.9419355E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            java.lang.String r0 = java.lang.String.valueOf(r8)
            X.C90494aF.A1H(r0, r7, r1)
            java.lang.String r0 = r6.getString(r5, r1)
            r9.A03 = r0
        L_0x00d2:
            r3.add(r9)
            X.9Ml r0 = r10.A06
            r7 = 0
            if (r0 == 0) goto L_0x0164
            X.9lY r5 = r0.A01
            X.8lE r6 = new X.8lE
            r6.<init>()
            X.0wG r0 = r10.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131895007(0x7f1222df, float:1.9424835E38)
            A01(r1, r6, r0)
            X.8av r1 = r5.A0A
            if (r1 == 0) goto L_0x0164
            boolean r0 = r1 instanceof X.C175938bJ
            if (r0 == 0) goto L_0x015b
            X.8bJ r1 = (X.C175938bJ) r1
            java.lang.String r5 = r1.A06
        L_0x00f7:
            if (r5 == 0) goto L_0x0164
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0164
            r6.A03 = r5
            r1 = 0
            X.B8M r0 = new X.B8M
            r0.<init>(r10, r5, r1)
            r6.A02 = r0
        L_0x0109:
            r3.add(r6)
            if (r2 == 0) goto L_0x0156
            X.8lb r4 = (X.C180338lb) r4
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            X.9Ml r0 = r4.A06
            X.9lY r0 = r0.A01
            X.8av r1 = r0.A0A
            X.8bI r1 = (X.C175928bI) r1
            X.C180338lb.A07(r4, r2)
            X.9Ml r0 = r4.A06
            X.9lY r0 = r0.A01
            int r0 = r0.A02
            X.C180338lb.A06(r1, r4, r2, r0)
        L_0x0128:
            r3.addAll(r2)
        L_0x012b:
            boolean r0 = r3.remove(r7)
            if (r0 != 0) goto L_0x012b
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01ef
            A05(r11)
            r1 = 0
        L_0x013b:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x01ef
            java.lang.Object r0 = r3.get(r1)
            r11.add(r0)
            int r0 = r3.size()
            int r0 = r0 + -1
            if (r1 == r0) goto L_0x0153
            A04(r11)
        L_0x0153:
            int r1 = r1 + 1
            goto L_0x013b
        L_0x0156:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            goto L_0x0128
        L_0x015b:
            boolean r0 = r1 instanceof X.C175918bH
            if (r0 == 0) goto L_0x0164
            X.8bH r1 = (X.C175918bH) r1
            java.lang.String r5 = r1.A04
            goto L_0x00f7
        L_0x0164:
            r6 = r7
            goto L_0x0109
        L_0x0166:
            r6 = 0
            goto L_0x0077
        L_0x0169:
            X.9lY r1 = r0.A01
            X.8lE r6 = new X.8lE
            r6.<init>()
            X.0wG r0 = r10.A0P
            android.content.Context r7 = r0.A00
            r0 = 2131892311(0x7f121857, float:1.9419367E38)
            A01(r7, r6, r0)
            int r1 = r1.A03
            r0 = 100
            if (r1 == r0) goto L_0x01b7
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x01b7
            r2 = 2131232703(0x7f0807bf, float:1.8081523E38)
            r5 = 2131895071(0x7f12231f, float:1.9424965E38)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131167890(0x7f070a92, float:1.7950066E38)
        L_0x0191:
            int r4 = X.C36441kJ.A05(r1, r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass00E.A00(r7, r2)
            java.lang.String r0 = r7.getString(r5)
            r6.A03 = r0
            if (r2 == 0) goto L_0x002d
            r1 = 2130970628(0x7f040804, float:1.7549971E38)
            r0 = 2131102241(0x7f060a21, float:1.7816914E38)
            int r0 = X.C36351kA.A01(r7, r1, r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3UF.A08(r2, r0)
            r6.A00 = r1
            r0 = 0
            r1.setBounds(r0, r0, r4, r4)
            goto L_0x002d
        L_0x01b7:
            r2 = 2131231287(0x7f080237, float:1.807865E38)
            r5 = 2131895072(0x7f122320, float:1.9424967E38)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131167888(0x7f070a90, float:1.7950062E38)
            goto L_0x0191
        L_0x01c5:
            X.9Ml r0 = r10.A06
            r1 = 0
            if (r0 == 0) goto L_0x01dc
            X.3T1 r2 = r0.A02
            if (r2 == 0) goto L_0x01dc
            boolean r0 = r2 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x01e1
            java.lang.String r0 = r2.A0b()
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 == 0) goto L_0x01e1
        L_0x01dc:
            r3.add(r1)
            goto L_0x0010
        L_0x01e1:
            boolean r1 = r2 instanceof X.C46962bx
            r0 = 205(0xcd, float:2.87E-43)
            if (r1 == 0) goto L_0x01e9
            r0 = 209(0xd1, float:2.93E-43)
        L_0x01e9:
            X.2Zy r1 = new X.2Zy
            r1.<init>(r2, r0)
            goto L_0x01dc
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167797yq.A0n(java.util.List):void");
    }

    public boolean A0s(C202319lY r5) {
        C23083B3q BAJ = A0S().BAJ();
        return this.A0g.A0f(r5, A0S().BE1(), BAJ, 1);
    }

    public C167797yq(Bundle bundle, AnonymousClass17Y r6, C19730wQ r7, AnonymousClass1KK r8, AnonymousClass1NG r9, AnonymousClass16D r10, C21060yb r11, C19970wo r12, C19630wG r13, C18820ts r14, C20310xM r15, AnonymousClass1FF r16, AnonymousClass1VZ r17, C24881Ed r18, AnonymousClass16T r19, AnonymousClass16S r20, C25251Fo r21, AnonymousClass1EZ r22, C24601Db r23, AnonymousClass1DR r24, AnonymousClass1EV r25, AnonymousClass1EU r26, AnonymousClass1XC r27, AnonymousClass6PS r28, C23075B3f b3f, AnonymousClass1YQ r30, AnonymousClass39O r31, C199849g7 r32, C200899iR r33, AnonymousClass1FR r34, C19770wU r35) {
        int i;
        this.A0O = r12;
        this.A0I = r6;
        this.A0J = r7;
        this.A0P = r13;
        this.A0h = r35;
        this.A0m = r20;
        this.A0g = r34;
        this.A0M = r10;
        this.A0N = r11;
        this.A0Q = r14;
        this.A0Y = r26;
        this.A0L = r9;
        this.A0i = r15;
        this.A0e = r31;
        this.A0U = r23;
        this.A0f = r33;
        this.A0T = r22;
        this.A0k = r17;
        this.A0j = r16;
        this.A0X = r25;
        this.A0l = r19;
        this.A0n = r32;
        this.A0K = r8;
        this.A0a = r28;
        this.A0b = b3f;
        this.A0d = r30;
        this.A0R = r18;
        this.A0Z = r27;
        AnonymousClass1DR r3 = r24;
        this.A0W = r3;
        this.A0S = r21;
        this.A0H = bundle;
        this.A0F = bundle.getString("referral_screen");
        this.A07 = AnonymousClass3UJ.A03(bundle, "");
        this.A0B = bundle.getString("extra_transaction_id");
        String string = bundle.getString("extra_payment_receipt_type");
        this.A0A = string == null ? "native" : string;
        this.A0C = bundle.getString("extra_transaction_ref");
        this.A09 = Boolean.valueOf(bundle.getBoolean("extra_is_pending_request_saved_instance", false));
        if (this instanceof C180338lb) {
            i = 7;
        } else if (this instanceof C180328la) {
            i = 6;
        } else {
            i = 8;
        }
        C203349np r0 = new C203349np(this, i);
        this.A0V = r0;
        r3.registerObserver(r0);
        this.A00 = bundle.getInt("extra_payment_flow_entry_point", 0);
    }
}
