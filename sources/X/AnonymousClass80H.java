package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.math.BigDecimal;
import java.text.NumberFormat;

/* renamed from: X.80H  reason: invalid class name */
public abstract class AnonymousClass80H extends AnonymousClass0D3 {
    public void A0B(AnonymousClass9EB r15) {
        int i;
        AnonymousClass1RJ r8;
        AnonymousClass1RJ r1;
        int i2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        String string;
        float f;
        C128826Dt r0;
        C132386Tk r5;
        TextView textView4;
        String A0v;
        Context A0F;
        int i3;
        Object[] objArr;
        String str;
        BigDecimal bigDecimal;
        C132386Tk r12;
        Context A0F2;
        int i4;
        C132386Tk r13;
        if (this instanceof AnonymousClass8VU) {
            AnonymousClass8VU r6 = (AnonymousClass8VU) this;
            C206439tP r7 = ((AnonymousClass8VK) r15).A00;
            r6.A02.setText(r7.A06);
            BigDecimal bigDecimal2 = r7.A02;
            if (bigDecimal2 == null || (r13 = r7.A01) == null) {
                A0F2 = C36441kJ.A0F(r6);
                i4 = R.string.f12nameremoved;
            } else {
                r6.A01.setText(r13.A03(r6.A09, bigDecimal2, true));
                A0F2 = C36441kJ.A0F(r6);
                i4 = R.string.f12nameremoved;
            }
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1L(objArr2, r7.A00, 0);
            r6.A03.setText(A0F2.getString(i4, objArr2));
            ImageView imageView = r6.A00;
            C134966bu r4 = r7.A05;
            C196089Xp r2 = r6.A07;
            UserJid userJid = r6.A0A;
            AnonymousClass9HG r14 = null;
            if (userJid != null) {
                r14 = new AnonymousClass9HG(new AnonymousClass9ED(897465374), userJid);
            }
            C109905Zo.A00(imageView, r14, r2, r4);
            r6.A06.A0C(new BAK(r7, r6, 5), userJid);
            return;
        }
        if (this instanceof AnonymousClass8VR) {
            AnonymousClass8VR r22 = (AnonymousClass8VR) this;
            AnonymousClass8VN r152 = (AnonymousClass8VN) r15;
            r22.A00.setText(r152.A00);
            boolean z = r152.A01;
            r1 = r22.A01;
            i2 = C36351kA.A00(z ? 1 : 0);
        } else if (this instanceof AnonymousClass8VT) {
            AnonymousClass8VT r82 = (AnonymousClass8VT) this;
            AnonymousClass00C.A0D(r15, 0);
            if (r15 instanceof AnonymousClass8VO) {
                AnonymousClass8VO r153 = (AnonymousClass8VO) r15;
                C128826Dt r3 = r153.A00;
                AnonymousClass1RJ r02 = r82.A03;
                if (r3 != null) {
                    if (r02 != null) {
                        r02.A03(8);
                    }
                    AnonymousClass1RJ r03 = r82.A04;
                    if (r03 != null) {
                        r03.A03(0);
                    }
                    TextView textView5 = (TextView) r82.A06.getValue();
                    if (textView5 != null) {
                        textView5.setText(r3.A06);
                    }
                    View view = (View) r82.A07.getValue();
                    if (view != null) {
                        view.setVisibility(C36351kA.A00(r82.A02.A0E(7120) ^ true ? 1 : 0));
                    }
                    if (!(!r82.A02.A0E(7120)) || (bigDecimal = r153.A02) == null || (r12 = r153.A01) == null) {
                        int i5 = r3.A00;
                        if (i5 == 2) {
                            AnonymousClass00T r16 = r82.A05;
                            View view2 = (View) r16.getValue();
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                            textView4 = (TextView) r16.getValue();
                            if (textView4 != null) {
                                A0F = C36441kJ.A0F(r82);
                                i3 = R.string.f12nameremoved;
                                objArr = new Object[1];
                                str = r3.A03;
                            } else {
                                return;
                            }
                        } else if (i5 != 1 || (r5 = r153.A01) == null) {
                            AnonymousClass00T r23 = r82.A05;
                            TextView textView6 = (TextView) r23.getValue();
                            if (textView6 != null) {
                                textView6.setText((CharSequence) null);
                            }
                            View view3 = (View) r23.getValue();
                            if (view3 != null) {
                                view3.setVisibility(8);
                                return;
                            }
                            return;
                        } else {
                            AnonymousClass00T r24 = r82.A05;
                            View view4 = (View) r24.getValue();
                            if (view4 != null) {
                                view4.setVisibility(0);
                            }
                            BigDecimal A00 = C129676Ia.A00(r5, C36371kC.A0A(AnonymousClass097.A04(r3.A03)));
                            textView4 = (TextView) r24.getValue();
                            if (textView4 != null) {
                                A0v = C36391kE.A0v(C36441kJ.A0F(r82), r5.A03(r82.A01, A00, true), new Object[1], 0, R.string.f12nameremoved);
                                textView4.setText(A0v);
                                return;
                            }
                            return;
                        }
                    } else {
                        str = r12.A03(r82.A01, bigDecimal, true);
                        AnonymousClass00C.A08(str);
                        textView4 = (TextView) r82.A05.getValue();
                        if (textView4 != null) {
                            A0F = C36441kJ.A0F(r82);
                            i3 = R.string.f12nameremoved;
                            objArr = new Object[1];
                        } else {
                            return;
                        }
                    }
                    A0v = C36391kE.A0v(A0F, str, objArr, 0, i3);
                    textView4.setText(A0v);
                    return;
                }
                if (r02 != null) {
                    r02.A03(0);
                }
                AnonymousClass1RJ r04 = r82.A04;
                if (r04 != null) {
                    r04.A03(8);
                    return;
                }
                return;
            }
            return;
        } else if (this instanceof AnonymousClass8VV) {
            AnonymousClass8VV r52 = (AnonymousClass8VV) this;
            AnonymousClass00C.A0D(r15, 0);
            if (r15 instanceof AnonymousClass8VP) {
                View view5 = r52.A01;
                AnonymousClass8VP r154 = (AnonymousClass8VP) r15;
                boolean z2 = r154.A05;
                view5.setVisibility(C36381kD.A00(z2 ^ true ? 1 : 0));
                View view6 = r52.A0H;
                int paddingLeft = view6.getPaddingLeft();
                if (z2) {
                    i = 0;
                } else {
                    i = r52.A00;
                }
                view6.setPadding(paddingLeft, i, view6.getPaddingRight(), view6.getPaddingBottom());
                AnonymousClass8VV.A01(r52.A0B, r52.A0A, r154.A04);
                AnonymousClass8VV.A01(r52.A09, r52.A08, r154.A03);
                String str2 = r154.A01;
                if (str2 == null || str2.length() == 0) {
                    AnonymousClass1RJ r17 = r52.A05;
                    r8 = r52.A04;
                    if (r17 != null) {
                        r17.A03(8);
                    }
                    if (r8 != null) {
                        r8.A03(8);
                    }
                } else {
                    AnonymousClass1RJ r05 = r52.A05;
                    r8 = r52.A04;
                    if (r05 != null) {
                        r05.A03(0);
                    }
                    if (r8 != null) {
                        r8.A03(0);
                    }
                    if (!(r05 == null || (textView3 = (TextView) r05.A01()) == null)) {
                        Context context = view6.getContext();
                        if (!(!r52.A03.A0E(7120)) || (r0 = r154.A00) == null) {
                            C128826Dt r11 = r154.A00;
                            if (r11 != null) {
                                int i6 = r11.A00;
                                if (i6 == 1) {
                                    string = C36391kE.A0v(context, r11.A06, new Object[1], 0, R.string.f12nameremoved);
                                } else if (i6 == 2) {
                                    Object[] objArr3 = new Object[2];
                                    NumberFormat A0N = r52.A02.A0N();
                                    String str3 = r11.A03;
                                    Float f2 = null;
                                    try {
                                        if (AnonymousClass0RV.A00.A03(str3)) {
                                            f2 = Float.valueOf(Float.parseFloat(str3));
                                            if (f2 != null) {
                                                f = f2.floatValue();
                                                objArr3[0] = A0N.format(Float.valueOf(f / 100.0f));
                                                string = C36391kE.A0v(context, r11.A06, objArr3, 1, R.string.f12nameremoved);
                                            }
                                        }
                                    } catch (NumberFormatException unused) {
                                    }
                                    f = 0.0f;
                                    objArr3[0] = A0N.format(Float.valueOf(f / 100.0f));
                                    string = C36391kE.A0v(context, r11.A06, objArr3, 1, R.string.f12nameremoved);
                                }
                                AnonymousClass00C.A08(string);
                            }
                            string = context.getString(R.string.f12nameremoved);
                            AnonymousClass00C.A08(string);
                        } else {
                            string = C36391kE.A0v(context, r0.A06, new Object[1], 0, R.string.f12nameremoved);
                            AnonymousClass00C.A0B(string);
                        }
                        textView3.setText(string);
                    }
                    if (!(r8 == null || (textView2 = (TextView) r8.A01()) == null)) {
                        textView2.setText(str2);
                    }
                }
                String str4 = r154.A02;
                if (str4 != null) {
                    AnonymousClass8VV.A01(r52.A07, r52.A06, str4);
                    return;
                }
                if (r8 != null) {
                    r8.A03(8);
                }
                AnonymousClass1RJ r06 = r52.A07;
                if (!(r06 == null || (textView = (TextView) C36391kE.A0L(r06, 0)) == null)) {
                    textView.setText(R.string.f12nameremoved);
                }
                r1 = r52.A06;
                if (r1 != null) {
                    i2 = 8;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass8VW) {
            A0C(r15, AnonymousClass001.A0I());
            return;
        } else if (this instanceof AnonymousClass8VQ) {
            AnonymousClass8VQ r62 = (AnonymousClass8VQ) this;
            AnonymousClass8VM r155 = (AnonymousClass8VM) r15;
            WaTextView waTextView = r62.A00;
            Resources A0F3 = C36341k9.A0F(r62.A0H);
            int i7 = r155.A00;
            Object[] A0L = AnonymousClass001.A0L();
            boolean A1b = C36361kB.A1b(A0L, i7);
            waTextView.setText(A0F3.getQuantityString(R.plurals.f10nameremoved, i7, A0L));
            boolean z3 = r155.A01;
            WDSButton wDSButton = r62.A01;
            if (z3) {
                wDSButton.setVisibility(A1b ? 1 : 0);
                return;
            } else {
                wDSButton.setVisibility(8);
                return;
            }
        } else {
            return;
        }
        r1.A03(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.AnonymousClass9EB r14, java.util.List r15) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.AnonymousClass8VW
            if (r0 == 0) goto L_0x0150
            r5 = r13
            X.8VW r5 = (X.AnonymousClass8VW) r5
            X.8VL r14 = (X.AnonymousClass8VL) r14
            X.6B4 r7 = r14.A00
            android.widget.TextView r1 = r5.A04
            X.9up r4 = r7.A02
            java.lang.String r0 = r4.A05
            r1.setText(r0)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r6 = r5.A0A
            long r2 = r7.A00
            long r0 = r4.A09
            r6.A04(r2, r0)
            r2 = 0
            r6.setVisibility(r2)
            long r0 = r7.A00
            java.math.BigDecimal r6 = r4.A06
            X.6Tk r9 = r4.A04
            X.6bV r11 = r4.A02
            X.0ts r8 = r5.A0C
            java.util.Date r12 = r14.A01
            android.view.View r3 = r5.A0H
            r3.getContext()
            r10 = 0
            if (r6 == 0) goto L_0x0118
            if (r9 == 0) goto L_0x0118
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r3 = r6.multiply(r3)
            r7 = 1
            java.lang.String r6 = r9.A03(r8, r3, r7)
            if (r11 == 0) goto L_0x005a
            boolean r3 = r11.A00(r12)
            if (r3 == 0) goto L_0x005a
            java.math.BigDecimal r3 = r11.A00
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = r3.multiply(r0)
            java.lang.String r10 = r9.A03(r8, r0, r7)
        L_0x005a:
            X.00I r1 = new X.00I
            r1.<init>(r6, r10)
        L_0x005f:
            java.lang.Object r3 = r1.A00
            if (r3 != 0) goto L_0x00ee
            android.widget.TextView r1 = r5.A02
            java.lang.String r0 = "$000.00"
            r1.setText(r0)
            android.widget.LinearLayout r1 = r5.A01
            r0 = 4
        L_0x006d:
            r1.setVisibility(r0)
        L_0x0070:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0093
            android.widget.ImageView r3 = r5.A00
            boolean r0 = X.AnonymousClass8VW.A00(r3, r5, r4)
            if (r0 != 0) goto L_0x0093
            X.9dH r0 = r5.A07
            java.lang.String r1 = r4.A0F
            X.AnonymousClass00C.A0D(r1, r2)
            X.1Ws r0 = r0.A0H
            X.9up r0 = X.C165617ti.A0N(r0, r1)
            if (r0 == 0) goto L_0x00ea
            boolean r0 = X.AnonymousClass8VW.A00(r3, r5, r0)
            if (r0 == 0) goto L_0x00ea
        L_0x0093:
            X.1KP r1 = r5.A0B
            X.9EA r0 = r5.A08
            X.7zo r0 = r0.A00
            X.9uZ r0 = r0.A00
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0143
            X.6bW r0 = r4.A0B
            if (r0 == 0) goto L_0x0143
            java.util.List r1 = r0.A02
            if (r1 == 0) goto L_0x0143
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0143
            android.widget.TextView r7 = r5.A05
            r7.setVisibility(r2)
            java.util.ArrayList r3 = X.C36321k7.A0J(r1)
            java.util.Iterator r8 = r1.iterator()
        L_0x00bc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x011f
            java.lang.Object r6 = r8.next()
            X.6bJ r6 = (X.C134606bJ) r6
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r6.A00
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = X.C165607th.A0v(r1, r0)
            r4.append(r0)
            java.lang.String r0 = ": "
            r4.append(r0)
            java.lang.String r0 = r6.A01
            java.lang.String r0 = X.C165607th.A0v(r1, r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r4)
            r3.add(r0)
            goto L_0x00bc
        L_0x00ea:
            X.C53332r9.A00(r3)
            goto L_0x0093
        L_0x00ee:
            android.widget.LinearLayout r0 = r5.A01
            r0.setVisibility(r2)
            java.lang.Object r1 = r1.A01
            android.widget.TextView r0 = r5.A02
            if (r1 != 0) goto L_0x0102
            X.C165607th.A1A(r0, r3)
            android.widget.TextView r1 = r5.A03
            r0 = 8
            goto L_0x006d
        L_0x0102:
            X.C165607th.A1A(r0, r1)
            android.widget.TextView r1 = r5.A03
            X.C165607th.A1A(r1, r3)
            r1.setVisibility(r2)
            int r0 = r1.getPaintFlags()
            r0 = r0 | 16
            r1.setPaintFlags(r0)
            goto L_0x0070
        L_0x0118:
            X.00I r1 = new X.00I
            r1.<init>(r10, r10)
            goto L_0x005f
        L_0x011f:
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x012f
            r7.setVisibility(r2)
            java.lang.Object r0 = r3.get(r2)
            X.C165607th.A1A(r7, r0)
        L_0x012f:
            int r1 = r3.size()
            r0 = 1
            if (r1 <= r0) goto L_0x014f
            android.widget.TextView r1 = r5.A06
            r1.setVisibility(r2)
            java.lang.Object r0 = r3.get(r0)
            X.C165607th.A1A(r1, r0)
            return
        L_0x0143:
            android.widget.TextView r0 = r5.A05
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r5.A06
            r0.setVisibility(r1)
        L_0x014f:
            return
        L_0x0150:
            r13.A0B(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80H.A0C(X.9EB, java.util.List):void");
    }

    public AnonymousClass80H(View view) {
        super(view);
    }
}
