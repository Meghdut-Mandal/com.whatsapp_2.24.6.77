package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8lV  reason: invalid class name and case insensitive filesystem */
public class C180278lV extends C183758rJ {
    public final /* synthetic */ C167797yq A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C180278lV(C167797yq r1, C64933Qa r2, String str, boolean z) {
        super(r1, r2, str, z);
        this.A00 = r1;
    }

    public C193689Ml A0G() {
        C202319lY r2;
        AnonymousClass2bZ r4;
        int i;
        UserJid userJid;
        int i2;
        Context context;
        int i3;
        List list;
        C167797yq r7 = this.A00;
        C64933Qa r8 = r7.A07;
        C18740tg.A06(r8);
        AnonymousClass11F r3 = r8.A00;
        C175788b3 r6 = null;
        if (r3 != null) {
            r4 = r7.A0j.A01(r8.A01);
            if (r4 != null) {
                C207219uk r0 = r4.A00;
                C18740tg.A06(r0);
                C207199ui r5 = r0.A01;
                C18740tg.A06(r5);
                C206979uM r1 = r5.A0B;
                C199449fK r22 = new C199449fK();
                C18740tg.A06(r5);
                AnonymousClass16U r9 = r5.A08;
                r22.A02 = r9;
                C18740tg.A06(r1);
                r22.A00 = r1.A00;
                C18740tg.A06(r1);
                r22.A01 = r1.A01;
                C207119ua A01 = r22.A01();
                UserJid A0L = r4.A0L();
                C18740tg.A06(A0L);
                boolean z = r8.A02;
                if (z) {
                    i = 200;
                    userJid = (UserJid) r3;
                } else {
                    i = 100;
                    userJid = A0L;
                    A0L = (UserJid) r3;
                }
                C18740tg.A06(r9);
                AnonymousClass16V r10 = (AnonymousClass16V) r9;
                String str = r10.A02;
                BigDecimal bigDecimal = A01.A02.A00;
                C18740tg.A06(r5);
                long j = r5.A01 * 1000;
                String str2 = r5.A04;
                String str3 = "confirm";
                if (str3.equals(str2)) {
                    boolean equals = "captured".equals(r5.A05);
                    if (z) {
                        i2 = 903;
                        if (equals) {
                            i2 = 904;
                        }
                    } else {
                        i2 = 803;
                        if (equals) {
                            i2 = 804;
                        }
                    }
                } else if ("payment_instruction".equals(str2)) {
                    boolean equals2 = "captured".equals(r5.A05);
                    if (z) {
                        i2 = 901;
                        if (equals2) {
                            i2 = 902;
                        }
                    } else {
                        i2 = 801;
                        if (equals2) {
                            i2 = 802;
                        }
                    }
                } else if ("pix".equals(str2)) {
                    boolean equals3 = "captured".equals(r5.A05);
                    if (z) {
                        i2 = 905;
                        if (equals3) {
                            i2 = 906;
                        }
                    } else {
                        i2 = 907;
                        if (equals3) {
                            i2 = 908;
                        }
                    }
                } else {
                    i2 = 401;
                    if (z) {
                        i2 = 101;
                    }
                }
                C202159l8 r23 = C202159l8.A0E;
                C203419nz r24 = C203419nz.$redex_init_class;
                String str4 = str;
                AnonymousClass16U r14 = r9;
                AnonymousClass16X r15 = new AnonymousClass16X(bigDecimal, r10.A01);
                r2 = new C202319lY(r14, r15, userJid, A0L, str4, (String) null, (String) null, (String) null, (String) null, (String) null, "BR", i, i2, 1, 0, 0, j, j);
                r2.A0R = null;
                r2.A0F(false);
                r2.A07 = r9;
                C175708av BKY = r7.A0S().BKY();
                if (BKY != null) {
                    r2.A08(new C207259uo(0, r5.A0F, r4.A1J.A01), BKY);
                }
                C19630wG r82 = r7.A0P;
                boolean A1P = AnonymousClass000.A1P(C165587tf.A05(r7.A0g.A06));
                String str5 = r5.A04;
                if (str3.equals(str5)) {
                    context = r82.A00;
                    i3 = R.string.f12nameremoved;
                    if (A1P) {
                        i3 = R.string.f12nameremoved;
                    }
                } else {
                    if ("payment_instruction".equals(str5) && (list = r5.A0J) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str6 = ((C206929uE) it.next()).A00;
                            if (!TextUtils.isEmpty(str6)) {
                                r6 = new C175788b3("payment_instruction", str6);
                                break;
                            }
                        }
                    } else {
                        str3 = "pix";
                        if (str3.equals(str5)) {
                            context = r82.A00;
                            i3 = R.string.f12nameremoved;
                        }
                    }
                    r6 = null;
                }
                r6 = new C175788b3(str3, context.getString(i3));
            } else {
                r2 = null;
            }
        } else {
            r2 = null;
            r4 = null;
        }
        return new C193689Ml(r6, r2, (AnonymousClass3T1) null, r4, true);
    }
}
