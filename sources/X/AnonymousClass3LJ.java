package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.mediacomposer.doodle.DoodleView;

/* renamed from: X.3LJ  reason: invalid class name */
public abstract class AnonymousClass3LJ {
    public final C24791Du A00;
    public final AnonymousClass17Y A01;
    public final C21060yb A02;
    public final C18820ts A03;
    public final AnonymousClass1SU A04;
    public final AnonymousClass3G7 A05;

    public abstract long A0A();

    public abstract void A0G();

    public abstract void A0H();

    public static void A09(C63413Jy r2, AnonymousClass3LJ r3) {
        r2.A01 = 0;
        r2.A02 = SystemClock.elapsedRealtime();
        r2.A01();
        r3.A05.A01();
    }

    public final Context A0B() {
        View view = this.A05.A01.A00;
        C18740tg.A04(view);
        return view.getContext();
    }

    public View A0C() {
        if (this instanceof C47542ew) {
            return ((C47542ew) this).A09;
        }
        if (this instanceof C47522eu) {
            return ((C47522eu) this).A09;
        }
        if (this instanceof C47502es) {
            return ((C47502es) this).A00;
        }
        if (this instanceof C47532ev) {
            return ((C47532ev) this).A0E;
        }
        if (this instanceof C47512et) {
            return ((C47512et) this).A05;
        }
        return ((C47492er) this).A00;
    }

    public void A0D() {
        C63413Jy r0;
        Handler handler;
        if (this instanceof C47542ew) {
            C47542ew r3 = (C47542ew) this;
            C37161lu r2 = r3.A01;
            if (!(r2 == null || (handler = r2.A02) == null)) {
                C81173wa.A00(handler, r2, 28);
            }
            r3.A0A.A02(r3);
            r3.A02 = false;
        } else if (this instanceof C47522eu) {
            C47522eu r32 = (C47522eu) this;
            C47522eu.A04(r32);
            C65083Qq r02 = r32.A02;
            if (r02 != null) {
                r02.A0A();
            }
            DoodleView doodleView = r32.A0F;
            if (doodleView != null) {
                doodleView.A0E.A0A = false;
                doodleView.invalidate();
            }
            r32.A0I.A02(r32);
            r32.A03 = false;
            AnonymousClass3ES r03 = r32.A01;
            if (r03 != null) {
                r03.A03.dismiss();
            }
        } else {
            if (this instanceof C47502es) {
                r0 = ((C47502es) this).A05;
            } else if (this instanceof C47532ev) {
                r0 = ((C47532ev) this).A0D;
            } else if (this instanceof C47512et) {
                C47512et r1 = (C47512et) this;
                r1.A07.A02();
                r1.A02 = false;
                return;
            } else {
                r0 = ((C47492er) this).A01;
            }
            r0.A02();
        }
    }

    public void A0E() {
        C63413Jy r0;
        Handler handler;
        if (this instanceof C47542ew) {
            C47542ew r3 = (C47542ew) this;
            C37161lu r2 = r3.A01;
            if (!(r2 == null || (handler = r2.A02) == null)) {
                C81173wa.A00(handler, r2, 31);
            }
            if (!r3.A02 && r3.A05.A01.A06) {
                r3.A02 = true;
                r3.A0A.A03(r3);
            }
        } else if (this instanceof C47522eu) {
            C47522eu r32 = (C47522eu) this;
            C47522eu.A04(r32);
            if (!r32.A04) {
                C47522eu.A03(r32);
                if (r32.A02 != null) {
                    C47522eu.A04(r32);
                    C65083Qq r02 = r32.A02;
                    if (r02 != null) {
                        r02.A0C();
                    }
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("statusplaybackvideo/no player for ");
                    C36351kA.A1L(r32.A0H.A1J, A0u);
                }
                DoodleView doodleView = r32.A0F;
                if (doodleView != null) {
                    doodleView.A0E.A0A = true;
                    SystemClock.elapsedRealtime();
                    doodleView.invalidate();
                }
                C47522eu.A06(r32);
            }
        } else {
            if (this instanceof C47502es) {
                r0 = ((C47502es) this).A05;
            } else if (this instanceof C47532ev) {
                r0 = ((C47532ev) this).A0D;
            } else if (this instanceof C47512et) {
                r0 = ((C47512et) this).A07;
            } else {
                r0 = ((C47492er) this).A01;
            }
            r0.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0.A0V == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F() {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.C47542ew
            if (r0 == 0) goto L_0x0019
            r2 = r14
            X.2ew r2 = (X.C47542ew) r2
            X.2bi r0 = r2.A08
            X.3Qj r0 = r0.A01
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.A0V
            r1 = 0
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            X.1oM r0 = r2.A09
            r0.setBlurEnabled(r1)
        L_0x0018:
            return
        L_0x0019:
            boolean r0 = r14 instanceof X.C47522eu
            if (r0 == 0) goto L_0x0033
            r1 = r14
            X.2eu r1 = (X.C47522eu) r1
            boolean r0 = r1.A0J()
            if (r0 != 0) goto L_0x002f
            X.C47522eu.A05(r1)
            X.C47522eu.A07(r1)
            X.C47522eu.A04(r1)
        L_0x002f:
            X.C47522eu.A02(r1)
            return
        L_0x0033:
            boolean r0 = r14 instanceof X.C47502es
            if (r0 == 0) goto L_0x009e
            r10 = r14
            X.2es r10 = (X.C47502es) r10
            X.1fu r0 = r10.A02
            android.net.Uri r9 = r0.A00()
            X.AnonymousClass00C.A08(r9)
            X.3T1 r0 = r10.A04
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.A02
            r1 = 2131889776(0x7f120e70, float:1.9414225E38)
            if (r0 == 0) goto L_0x0051
            r1 = 2131889775(0x7f120e6f, float:1.9414223E38)
        L_0x0051:
            android.content.Context r0 = r10.A0B()
            java.lang.String r1 = X.C65373Ru.A00(r0, r9, r1)
            X.AnonymousClass00C.A08(r1)
            r12 = 0
            android.text.Spanned r0 = android.text.Html.fromHtml(r1)
            android.text.SpannableString r11 = android.text.SpannableString.valueOf(r0)
            X.AnonymousClass00C.A08(r11)
            int r1 = r1.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r8 = r11.getSpans(r12, r1, r0)
            android.text.style.URLSpan[] r8 = (android.text.style.URLSpan[]) r8
            X.AnonymousClass00C.A0B(r8)
            int r7 = r8.length
            r6 = 0
        L_0x0079:
            if (r6 >= r7) goto L_0x00d6
            r13 = r8[r6]
            int r5 = r11.getSpanStart(r13)
            int r4 = r11.getSpanEnd(r13)
            r11.removeSpan(r13)
            com.whatsapp.TextEmojiLabel r0 = r10.A01
            android.content.Context r3 = r0.getContext()
            X.17Y r2 = r10.A01
            X.0yb r1 = r10.A02
            X.1Du r0 = r10.A00
            X.21s r0 = X.C429721s.A00(r3, r13, r0, r2, r1)
            r11.setSpan(r0, r5, r4, r12)
            int r6 = r6 + 1
            goto L_0x0079
        L_0x009e:
            boolean r0 = r14 instanceof X.C47532ev
            if (r0 != 0) goto L_0x0018
            boolean r0 = r14 instanceof X.C47512et
            if (r0 == 0) goto L_0x0018
            r2 = r14
            X.2et r2 = (X.C47512et) r2
            com.whatsapp.mediaview.PhotoView r4 = r2.A05
            android.app.Activity r0 = X.C36361kB.A06(r4)
            android.view.View r0 = X.C36361kB.A0C(r0)
            X.AnonymousClass00C.A08(r0)
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            int r0 = java.lang.Math.max(r1, r0)
            r8 = 1
            X.2rp r6 = new X.2rp
            r6.<init>(r2, r0, r8)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x00e1
            X.1SV r3 = r2.A08
            X.2bp r5 = r2.A06
            X.3Qa r7 = r5.A1J
            r3.A0E(r4, r5, r6, r7, r8)
            return
        L_0x00d6:
            com.whatsapp.TextEmojiLabel r1 = r10.A01
            r1.setText(r11)
            r0 = 28
            X.C48902iF.A00(r1, r9, r10, r0)
            return
        L_0x00e1:
            X.1SV r1 = r2.A08
            X.2bp r0 = r2.A06
            r1.A0G(r4, r0, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LJ.A0F():void");
    }

    public void A0I(boolean z) {
        if (this instanceof C47542ew) {
            ((C47542ew) this).A04 = z;
        } else if (this instanceof C47522eu) {
            C47522eu r2 = (C47522eu) this;
            r2.A04 = z;
            C47592fB r1 = r2.A05.A01;
            if (r1.A06) {
                C65083Qq r0 = r2.A02;
                if (z) {
                    if (r0 != null) {
                        r0.A0A();
                        Bitmap A07 = r0.A07();
                        if (A07 != null) {
                            r2.A0G.A08(A07);
                            r2.A06 = true;
                        }
                    }
                    r2.A08.setVisibility(0);
                    C47522eu.A07(r2);
                } else if (r0 == null) {
                    C47522eu.A04(r2);
                    r2.A0G();
                } else {
                    C47522eu.A04(r2);
                    r1.A0H();
                }
            }
        }
    }

    public boolean A0J() {
        AnonymousClass1SU r2;
        AnonymousClass3T1 r1;
        if (this instanceof C47542ew) {
            C47542ew r0 = (C47542ew) this;
            r2 = r0.A04;
            r1 = r0.A08;
        } else if (this instanceof C47522eu) {
            C47522eu r02 = (C47522eu) this;
            return AnonymousClass3MP.A01(r02.A0D, r02.A04, r02.A0H);
        } else if (this instanceof C47502es) {
            C47502es r03 = (C47502es) this;
            return AnonymousClass3MP.A01(r03.A03, r03.A04, r03.A04);
        } else if (this instanceof C47532ev) {
            C47532ev r04 = (C47532ev) this;
            r2 = r04.A04;
            r1 = r04.A0C;
        } else if (!(this instanceof C47512et)) {
            return true;
        } else {
            C47512et r05 = (C47512et) this;
            r2 = r05.A04;
            r1 = r05.A06;
        }
        AnonymousClass00C.A0D(r1, 1);
        return AnonymousClass3MP.A01((C20810yC) null, r2, r1);
    }

    public AnonymousClass3LJ(C24791Du r1, AnonymousClass17Y r2, C21060yb r3, C18820ts r4, AnonymousClass1SU r5, AnonymousClass3G7 r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A05 = r6;
    }
}
