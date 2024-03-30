package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.4mu  reason: invalid class name and case insensitive filesystem */
public abstract class C96174mu extends AnonymousClass0CZ implements C158277gf {
    public C87794Qe A00;
    public AnonymousClass67Z A01;
    public int A02;
    public final C21060yb A03;
    public final C21010yW A04;
    public final AnonymousClass1GZ A05;
    public final C87794Qe A06 = new AnonymousClass5SQ(this, 1);
    public final C19890wg A07;

    public synchronized int A0J() {
        int i;
        AnonymousClass67Z r0 = this.A01;
        i = 0;
        if (r0 != null) {
            int size = r0.A04.size();
            AnonymousClass67Z r02 = this.A01;
            if (!(r02 == null || r02.A00 == null)) {
                i = 1;
            }
            i += size;
        }
        return i;
    }

    public final synchronized void A0L(AnonymousClass67Z r3) {
        AnonymousClass67Z r0 = this.A01;
        if (r0 != null) {
            r0.A03.remove(this);
        }
        this.A01 = r3;
        if (r3 != null) {
            r3.A03.add(this);
            List list = r3.A04;
            if (C36401kF.A1a(list)) {
                BfP(r3);
            }
            this.A02 = list.size();
        }
        A06();
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        AnonymousClass1GZ r4 = this.A05;
        C21010yW r3 = this.A04;
        return new C1043159d(viewGroup, this.A03, r3, r4, this.A06, this.A07);
    }

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass0D3 r2) {
        C97024oH r22 = (C97024oH) r2;
        AnonymousClass00C.A0D(r22, 0);
        r22.A0C();
    }

    public /* bridge */ /* synthetic */ void A0F(AnonymousClass0D3 r2) {
        C97024oH r22 = (C97024oH) r2;
        AnonymousClass00C.A0D(r22, 0);
        r22.A0B();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r11, int i) {
        boolean z;
        C162957pQ r2;
        C19770wU r0;
        C1043159d r112 = (C1043159d) r11;
        synchronized (this) {
            AnonymousClass00C.A0D(r112, 0);
            AnonymousClass67Z r7 = this.A01;
            if (r7 != null) {
                AnonymousClass3XU r02 = null;
                if (i < r7.A04.size()) {
                    List list = r7.A04;
                    if (((double) (i + 1)) >= ((double) list.size()) * 0.75d && !r7.A02) {
                        if (!r7.A01) {
                            String str = r7.A00;
                            if (r7 instanceof C162787p9) {
                                C162787p9 r8 = (C162787p9) r7;
                                if (r8.A02 != 0) {
                                    if (str != null) {
                                        r8.A01(str);
                                    }
                                } else if (str != null) {
                                    C1043759k r4 = (C1043759k) r8.A00;
                                    C36391kE.A1Q(new C162767p7(r8, r4, (CharSequence) r8.A01, str), r4.A08);
                                }
                            } else {
                                C162777p8 r42 = (C162777p8) r7;
                                if (r42.A01 != 0) {
                                    if (str != null) {
                                        AnonymousClass3L7 r1 = (AnonymousClass3L7) r42.A00;
                                        r2 = new C162957pQ(r42, r1, str, 1);
                                        r0 = r1.A08;
                                    }
                                } else if (str != null) {
                                    AnonymousClass3L7 r12 = (AnonymousClass3L7) r42.A00;
                                    r2 = new C162957pQ(r42, r12, str, 0);
                                    r0 = r12.A08;
                                }
                                C36391kE.A1Q(r2, r0);
                            }
                            z = false;
                            r7.A02 = z;
                        }
                        z = true;
                        r7.A02 = z;
                    }
                    r02 = (AnonymousClass3XU) list.get(i);
                }
                r112.A01 = r02;
            }
        }
    }

    public void BfP(AnonymousClass67Z r5) {
        if (AnonymousClass00C.A0J(r5, this.A01)) {
            int i = this.A02;
            List list = r5.A04;
            if (i >= list.size()) {
                A06();
            } else {
                A0A(this.A02, list.size() - this.A02);
            }
            this.A02 = list.size();
        }
    }

    public C96174mu(C21060yb r3, C21010yW r4, AnonymousClass1GZ r5, C87794Qe r6, C19890wg r7) {
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
        this.A00 = r6;
        this.A07 = r7;
    }
}
