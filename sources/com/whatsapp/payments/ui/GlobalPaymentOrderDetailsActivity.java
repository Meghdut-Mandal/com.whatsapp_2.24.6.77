package com.whatsapp.payments.ui;

import X.AVX;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1A5;
import X.AnonymousClass1DR;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1VZ;
import X.AnonymousClass1XC;
import X.AnonymousClass2bZ;
import X.AnonymousClass3UJ;
import X.AnonymousClass9SC;
import X.AnonymousClass9UH;
import X.AnonymousClass9UZ;
import X.B3K;
import X.B7Y;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C165617ti;
import X.C179338jy;
import X.C180418ll;
import X.C18740tg;
import X.C188008yt;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C1900996w;
import X.C194219Oo;
import X.C19770wU;
import X.C19970wo;
import X.C199969gL;
import X.C20310xM;
import X.C206929uE;
import X.C207119ua;
import X.C207199ui;
import X.C207929xL;
import X.C20810yC;
import X.C21060yb;
import X.C21302AGg;
import X.C222813r;
import X.C22986Azc;
import X.C23043B1o;
import X.C24601Db;
import X.C24881Ed;
import X.C27111My;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C64933Qa;
import X.C65443Sb;
import X.C90464aC;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Objects;

public final class GlobalPaymentOrderDetailsActivity extends AnonymousClass155 implements B3K, C22986Azc {
    public AnonymousClass16D A00;
    public AnonymousClass185 A01;
    public AnonymousClass171 A02;
    public AnonymousClass1A5 A03;
    public C20310xM A04;
    public AnonymousClass16J A05;
    public AnonymousClass1VZ A06;
    public C24881Ed A07;
    public C24601Db A08;
    public AnonymousClass1DR A09;
    public AnonymousClass1EV A0A;
    public AnonymousClass1EU A0B;
    public AnonymousClass1XC A0C;
    public C21302AGg A0D;
    public AnonymousClass9UZ A0E;
    public AnonymousClass9UH A0F;
    public AnonymousClass1FR A0G;
    public C199969gL A0H;
    public C32681e1 A0I;
    public List A0J;
    public AnonymousClass141 A0K;
    public C180418ll A0L;
    public C179338jy A0M;
    public boolean A0N;

    public boolean BMo() {
        return false;
    }

    public void BUE(AnonymousClass11F r19) {
        AnonymousClass11F r4 = r19;
        AnonymousClass00C.A0D(r4, 0);
        long A0B2 = C165597tg.A0B();
        AnonymousClass1VZ r2 = this.A06;
        if (r2 != null) {
            AnonymousClass2bZ r5 = (AnonymousClass2bZ) r2.A02(A3i().A07);
            if (r5 != null) {
                C179338jy r11 = this.A0M;
                if (r11 == null) {
                    throw C36331k8.A0d("viewModel");
                }
                C207199ui A0T = r11.A0T(r5, (String) null, (String) null, 3, A0B2);
                C179338jy r0 = this.A0M;
                if (r0 == null) {
                    throw C36331k8.A0d("viewModel");
                }
                C18740tg.A06(r4);
                r0.A0X(r4, A0T, r5);
                AnonymousClass9UZ r02 = this.A0E;
                if (r02 != null) {
                    r02.A01(A0T, r5);
                } else {
                    throw C36331k8.A0d("paymentCheckoutOrderRepository");
                }
            }
            C199969gL r42 = this.A0H;
            if (r42 != null) {
                AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageInteractive");
                r42.A02(r5, (Integer) null, "cpi", (List) null, 19, false, false, true);
                finish();
                return;
            }
            throw C36331k8.A0d("orderDetailsMessageLogging");
        }
        throw C36331k8.A0d("paymentMessageStore");
    }

    public void BUH(C207119ua r21, AnonymousClass11F r22, AnonymousClass9SC r23, C23043B1o b1o) {
        AnonymousClass9SC r5 = r23;
        if (r23 != null) {
            int i = r5.A01;
            if (Integer.valueOf(i) != null) {
                AnonymousClass11F r4 = r22;
                if (i == 3) {
                    long A0B2 = C165597tg.A0B();
                    C179338jy r13 = this.A0M;
                    if (r13 == null) {
                        throw C36331k8.A0d("viewModel");
                    }
                    C23043B1o b1o2 = b1o;
                    C207199ui A0T = r13.A0T(b1o2, (String) null, (String) null, 3, A0B2);
                    C179338jy r0 = this.A0M;
                    if (r0 == null) {
                        throw C36331k8.A0d("viewModel");
                    }
                    C18740tg.A06(r4);
                    r0.A0X(r4, A0T, b1o2);
                    AnonymousClass9UZ r02 = this.A0E;
                    if (r02 != null) {
                        r02.A01(A0T, b1o2);
                        C199969gL r42 = this.A0H;
                        if (r42 != null) {
                            r42.A02(b1o2, (Integer) null, "confirm", (List) null, 19, false, false, true);
                            finish();
                            return;
                        }
                        throw C36331k8.A0d("orderDetailsMessageLogging");
                    }
                    throw C36331k8.A0d("paymentCheckoutOrderRepository");
                } else if (i == 2) {
                    C206929uE r03 = r5.A02;
                    if (r03 == null) {
                        C165577te.A1M("GlobalPaymentOrderDetailsActivity", "invalid external payemnt configuration payload");
                        return;
                    }
                    C18740tg.A06(r4);
                    String str = r03.A00;
                    C18740tg.A06(str);
                    AnonymousClass00C.A08(str);
                    C65443Sb.A00(C165607th.A0f(r4, str, "order_details", (String) null), this);
                }
            }
        }
    }

    public void Bbz(C188008yt r12, C194219Oo r13) {
        C1900996w.A00(this);
        this.A04.Bp1(new AVX(this, 28));
        C188008yt r5 = r12;
        A3i().A05.A02(this, this.A02, r5, r13, A3i().A08, (List) null, 2, r13.A00);
    }

    public void A2F() {
        if (!this.A0N) {
            this.A0N = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C165567td.A11(r2, this);
            C18830tt r3 = r2.A00;
            C165567td.A0v(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A0I = C36351kA.A0p(r3);
            this.A0G = C36431kI.A0p(r2);
            this.A0F = (AnonymousClass9UH) r3.AAb.get();
            this.A00 = C36341k9.A0R(r2);
            this.A02 = C36341k9.A0S(r2);
            this.A0B = C36381kD.A0f(r2);
            this.A04 = C36371kC.A0Z(r2);
            this.A05 = C36361kB.A0Z(r2);
            this.A08 = C165587tf.A0S(r2);
            this.A0A = C36371kC.A0h(r2);
            this.A06 = (AnonymousClass1VZ) r2.A6B.get();
            this.A01 = C36371kC.A0U(r2);
            this.A07 = (C24881Ed) r2.A6H.get();
            this.A0C = (AnonymousClass1XC) r2.A6F.get();
            this.A03 = (AnonymousClass1A5) r2.A2K.get();
            this.A0H = (C199969gL) r2.AUu.get();
            this.A09 = (AnonymousClass1DR) r2.A6G.get();
            this.A0E = C27111My.A2w(A0L2);
        }
    }

    public final C21302AGg A3i() {
        C21302AGg aGg = this.A0D;
        if (aGg != null) {
            return aGg;
        }
        throw C36331k8.A0d("orderDetailsCoordinator");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20810yC r7 = this.A0D;
        AnonymousClass00C.A07(r7);
        C19770wU r13 = this.A04;
        AnonymousClass00C.A07(r13);
        AnonymousClass16J r6 = this.A05;
        if (r6 != null) {
            AnonymousClass185 r3 = this.A01;
            if (r3 != null) {
                AnonymousClass1DR r8 = this.A09;
                if (r8 != null) {
                    AnonymousClass9UZ r10 = this.A0E;
                    if (r10 != null) {
                        C64933Qa A022 = AnonymousClass3UJ.A02(getIntent());
                        Objects.requireNonNull(A022);
                        AnonymousClass1FR r11 = this.A0G;
                        if (r11 != null) {
                            AnonymousClass1EU r9 = this.A0B;
                            if (r9 != null) {
                                C19970wo r5 = this.A07;
                                AnonymousClass00C.A07(r5);
                                C21060yb r4 = this.A08;
                                AnonymousClass00C.A07(r4);
                                this.A0M = (C179338jy) C165617ti.A0A(new C207929xL(r3, r4, r5, r6, r7, r8, r9, r10, r11, A022, r13), this).A00(C179338jy.class);
                                C19970wo r62 = this.A07;
                                AnonymousClass00C.A07(r62);
                                C20810yC r52 = this.A0D;
                                AnonymousClass00C.A07(r52);
                                C32681e1 r42 = this.A0I;
                                if (r42 != null) {
                                    Resources resources = getResources();
                                    AnonymousClass00C.A08(resources);
                                    AnonymousClass1FR r32 = this.A0G;
                                    if (r32 != null) {
                                        C18820ts r2 = this.A00;
                                        AnonymousClass00C.A07(r2);
                                        AnonymousClass1EU r0 = this.A0B;
                                        AnonymousClass1EU r18 = r0;
                                        if (r0 != null) {
                                            AnonymousClass185 r02 = this.A01;
                                            AnonymousClass185 r17 = r02;
                                            if (r02 != null) {
                                                AnonymousClass1EV r03 = this.A0A;
                                                AnonymousClass1EV r16 = r03;
                                                if (r03 != null) {
                                                    AnonymousClass1A5 r92 = this.A03;
                                                    if (r92 != null) {
                                                        C180418ll r19 = new C180418ll(resources, r17, r62, r2, r92, r52, r03, r18, r32, r42);
                                                        this.A0L = r19;
                                                        C19970wo r37 = this.A07;
                                                        C20810yC r23 = this.A0D;
                                                        AnonymousClass17Y r36 = this.A05;
                                                        C32681e1 r132 = this.A0I;
                                                        if (r132 != null) {
                                                            C19770wU r192 = this.A04;
                                                            AnonymousClass1FR r14 = this.A0G;
                                                            if (r14 != null) {
                                                                C18820ts r35 = this.A00;
                                                                AnonymousClass9UH r15 = this.A0F;
                                                                if (r15 != null) {
                                                                    AnonymousClass16D r12 = this.A00;
                                                                    if (r12 != null) {
                                                                        C20310xM r112 = this.A04;
                                                                        if (r112 != null) {
                                                                            AnonymousClass16J r102 = this.A05;
                                                                            if (r102 != null) {
                                                                                C24881Ed r72 = this.A07;
                                                                                if (r72 != null) {
                                                                                    AnonymousClass1XC r63 = this.A0C;
                                                                                    if (r63 != null) {
                                                                                        C199969gL r53 = this.A0H;
                                                                                        if (r53 != null) {
                                                                                            AnonymousClass1DR r43 = this.A09;
                                                                                            if (r43 != null) {
                                                                                                AnonymousClass9UZ r22 = this.A0E;
                                                                                                if (r22 != null) {
                                                                                                    AnonymousClass141 r33 = null;
                                                                                                    C19770wU r34 = r192;
                                                                                                    AnonymousClass1EV r25 = r16;
                                                                                                    AnonymousClass1EU r26 = r18;
                                                                                                    AnonymousClass17Y r142 = r36;
                                                                                                    AnonymousClass16D r152 = r12;
                                                                                                    AnonymousClass185 r162 = r17;
                                                                                                    C19970wo r172 = r37;
                                                                                                    C18820ts r182 = r35;
                                                                                                    this.A0D = new C21302AGg(r142, r152, r162, r172, r182, r92, r112, r102, r72, r23, r43, r25, r26, r63, r22, r19, r15, r14, r53, r132, r34);
                                                                                                    A3i().A08 = "GlobalPayment";
                                                                                                    C21302AGg A3i = A3i();
                                                                                                    C179338jy r04 = this.A0M;
                                                                                                    if (r04 == null) {
                                                                                                        throw C36331k8.A0a();
                                                                                                    }
                                                                                                    A3i.A00(this, this, r04);
                                                                                                    C222813r r05 = UserJid.Companion;
                                                                                                    UserJid A002 = C222813r.A00(A3i().A07.A00);
                                                                                                    if (A002 != null) {
                                                                                                        AnonymousClass1A5 r06 = this.A03;
                                                                                                        if (r06 != null) {
                                                                                                            r33 = r06.A01(A002);
                                                                                                        } else {
                                                                                                            throw C36331k8.A0d("conversationContactManager");
                                                                                                        }
                                                                                                    }
                                                                                                    this.A0K = r33;
                                                                                                    C36321k7.A0P(this);
                                                                                                    setContentView((View) A3i().A05);
                                                                                                    return;
                                                                                                }
                                                                                                throw C36331k8.A0d("paymentCheckoutOrderRepository");
                                                                                            }
                                                                                            throw C36331k8.A0d("paymentTransactionObservers");
                                                                                        }
                                                                                        throw C36331k8.A0d("orderDetailsMessageLogging");
                                                                                    }
                                                                                    throw C36331k8.A0d("paymentTransactionActions");
                                                                                }
                                                                                throw C36331k8.A0d("paymentTransactionStore");
                                                                            }
                                                                            throw C36331k8.A0d("messageObservers");
                                                                        }
                                                                        throw C36331k8.A0d("coreMessageStore");
                                                                    }
                                                                    throw C36331k8.A0d("contactManager");
                                                                }
                                                                throw C36331k8.A0d("paymentIntents");
                                                            }
                                                            throw C36331k8.A0d("paymentsUtils");
                                                        }
                                                        throw C36331k8.A0b();
                                                    }
                                                    throw C36331k8.A0d("conversationContactManager");
                                                }
                                                throw C36331k8.A0d("paymentsGatingManager");
                                            }
                                            throw C36331k8.A0d("verifiedNameManager");
                                        }
                                        throw C36331k8.A0d("paymentsManager");
                                    }
                                    throw C36331k8.A0d("paymentsUtils");
                                }
                                throw C36331k8.A0b();
                            }
                            throw C36331k8.A0d("paymentsManager");
                        }
                        throw C36331k8.A0d("paymentsUtils");
                    }
                    throw C36331k8.A0d("paymentCheckoutOrderRepository");
                }
                throw C36331k8.A0d("paymentTransactionObservers");
            }
            throw C36331k8.A0d("verifiedNameManager");
        }
        throw C36331k8.A0d("messageObservers");
    }

    public GlobalPaymentOrderDetailsActivity(int i) {
        this.A0N = false;
        B7Y.A00(this, 47);
    }

    public String BGY() {
        throw C90464aC.A0o();
    }

    public /* synthetic */ boolean BLF() {
        return false;
    }

    public void Bc0(C188008yt r2, C194219Oo r3) {
        throw C90464aC.A0o();
    }

    public void BgH(C207119ua r2) {
        throw C90464aC.A0o();
    }

    public GlobalPaymentOrderDetailsActivity() {
        this(0);
    }
}
