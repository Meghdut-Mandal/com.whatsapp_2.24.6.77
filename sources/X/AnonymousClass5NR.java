package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.android.exoplayer2.util.Util;
import com.whatsapp.R;
import com.whatsapp.videoplayback.BloksVideoPlayerView;
import com.whatsapp.videoplayback.HeroPlaybackControlView;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.5NR  reason: invalid class name */
public class AnonymousClass5NR extends C65083Qq {
    public int A00;
    public int A01 = 0;
    public long A02;
    public Uri A03 = null;
    public Uri A04 = new Uri.Builder().build();
    public C22861AxD A05;
    public C204359ps A06;
    public C202289lT A07;
    public AUR A08;
    public AnonymousClass6KH A09;
    public AnonymousClass6FG A0A;
    public AnonymousClass4SP A0B;
    public AnonymousClass33I A0C = null;
    public AnonymousClass5NI A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q = false;
    public C19770wU A0R;
    public boolean A0S;
    public final B3J A0T = new C141046ma(this);
    public final AnonymousClass17Y A0U;
    public final AnonymousClass5NU A0V;

    public void A0C() {
        this.A0I = true;
        if (this.A06 != null) {
            A0E();
            this.A06.A0C();
            this.A06.A0G(C90514aH.A03(this.A0S ? 1 : 0));
            return;
        }
        this.A0P = true;
        A0F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r2.A0D.A08 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r4 = this;
            r3 = 0
            r4.A0B = r3
            r4.A0H = r3
            r4.A0G = r3
            r4.A0I = r3
            X.9ps r2 = r4.A06
            if (r2 == 0) goto L_0x009a
            boolean r0 = r2.A0A
            if (r0 != 0) goto L_0x0018
            X.9ng r0 = r2.A0D
            boolean r1 = r0.A08
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r4.A0P = r0
            r2.A0B()
            r4.A0C = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.A02 = r0
            X.9ps r0 = r4.A06
            java.util.concurrent.atomic.AtomicReference r1 = r0.A08
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r1.get()
            X.9ug r0 = (X.C207179ug) r0
            boolean r0 = r0.A0T
            if (r0 == 0) goto L_0x0054
            r0 = 1
            r4.A0C = r0
            X.9ps r0 = r4.A06
            long r0 = r0.A08()
            r4.A02 = r0
            X.9ps r0 = r4.A06
            java.util.concurrent.atomic.AtomicReference r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.9ug r0 = (X.C207179ug) r0
            int r0 = r0.A0W
            r4.A00 = r0
        L_0x0054:
            X.9ps r0 = r4.A06
            r0.A0F()
            X.5NU r1 = r4.A0V
            X.AnonymousClass5NU.A01(r1)
            r0 = 0
            X.AnonymousClass5NU.A00(r0, r1, r3)
            X.9ps r0 = r4.A06
            X.B3J r2 = r4.A0T
            android.os.Handler r1 = r0.A0C
            r0 = 45
            X.AnonymousClass000.A14(r1, r2, r0)
            X.9ps r0 = r4.A06
            r0.A0D()
            r0 = 0
            r4.A06 = r0
            r4.A0L = r3
            r4.A0J = r3
            X.17Y r1 = r4.A0U
            r0 = 14
            X.C1497472p.A01(r1, r4, r0)
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x009a
            X.0yb r0 = r4.A03
            X.C18740tg.A06(r0)
            android.media.AudioManager r1 = r0.A0D()
            if (r1 == 0) goto L_0x009a
            android.media.AudioManager$OnAudioFocusChangeListener r0 = r4.A02
            if (r0 != 0) goto L_0x0097
            X.3WQ r0 = X.AnonymousClass3WQ.A00
            r4.A02 = r0
        L_0x0097:
            r1.abandonAudioFocus(r0)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NR.A0D():void");
    }

    public void A0P(int i, int i2) {
        C204359ps r2 = this.A06;
        if (r2 != null) {
            r2.A0H(0, (long) i2);
        } else {
            this.A0E = C36341k9.A0I(0, i2);
        }
    }

    public static AnonymousClass5NR A00(Activity activity, AnonymousClass17Y r19, C21060yb r20, BloksVideoPlayerView bloksVideoPlayerView) {
        BloksVideoPlayerView bloksVideoPlayerView2 = bloksVideoPlayerView;
        C19630wG waContext = bloksVideoPlayerView2.getWaContext();
        C19630wG waContext2 = bloksVideoPlayerView2.getWaContext();
        AnonymousClass5NV r12 = new AnonymousClass5NV(bloksVideoPlayerView2.getCrashLogs(), bloksVideoPlayerView2.getMp4Ops(), bloksVideoPlayerView2.getWamediaWamLogger(), waContext2, Util.A09(bloksVideoPlayerView2.getContext(), bloksVideoPlayerView2.getContext().getString(R.string.f12nameremoved)));
        Activity activity2 = activity;
        AnonymousClass17Y r4 = r19;
        C21060yb r5 = r20;
        AnonymousClass5NR r2 = new AnonymousClass5NR(activity2, r4, r5, waContext, bloksVideoPlayerView2.getHeroSettingProvider(), bloksVideoPlayerView2.getWaWorkers(), (AnonymousClass6FG) null, 0, false);
        r2.A0e(r12);
        bloksVideoPlayerView2.A0C = r2;
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r11.A0Q == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass5NR r11) {
        /*
            X.9ps r0 = r11.A06
            if (r0 != 0) goto L_0x00a2
            X.6KH r2 = r11.A09
            X.00T r0 = r2.A01
            boolean r1 = X.C36331k8.A1b(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = X.C204359ps.A0T
            X.9lT r4 = r11.A07
            if (r1 == 0) goto L_0x00d2
            X.00T r0 = r2.A00
            java.lang.Object r3 = r0.getValue()
            android.os.Looper r3 = (android.os.Looper) r3
            X.6mW r1 = new X.6mW
            r1.<init>(r11)
            X.AUR r0 = r11.A08
            X.9ps r2 = new X.9ps
            r2.<init>(r3, r1, r4, r0)
        L_0x0026:
            r11.A06 = r2
            java.lang.Boolean r2 = X.C36381kD.A0j()
            r1 = r2
            X.33I r0 = r11.A0C
            if (r0 == 0) goto L_0x0047
            X.3O8 r3 = r0.A00
            int r2 = r3.A00
            int r1 = X.AnonymousClass3O8.A09
            r0 = 0
            if (r2 >= r1) goto L_0x003f
            int r0 = r2 + 1
            r3.A00 = r0
            r0 = 1
        L_0x003f:
            java.lang.Boolean r2 = X.C36441kJ.A0x(r0)
            java.lang.Boolean r1 = X.C36371kC.A0m()
        L_0x0047:
            android.net.Uri r4 = r11.A04
            android.net.Uri r5 = r11.A03
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x0054
            boolean r0 = r11.A0Q
            r7 = 1
            if (r0 != 0) goto L_0x0055
        L_0x0054:
            r7 = 0
        L_0x0055:
            int r6 = r11.A0D
            boolean r8 = r11.A0F
            boolean r9 = r2.booleanValue()
            boolean r10 = r1.booleanValue()
            r3 = 0
            X.9Xa r1 = X.C129696Ic.A00(r4, r5, r6, r7, r8, r9, r10)
            X.AxD r0 = r11.A05
            if (r0 == 0) goto L_0x006c
            r1.A03 = r0
        L_0x006c:
            X.9ps r0 = r11.A06
            r0.A0K(r1)
            X.9ps r1 = r11.A06
            boolean r0 = r11.A0S
            float r0 = X.C90514aH.A03(r0)
            r1.A0G(r0)
            X.9ps r0 = r11.A06
            X.B3J r2 = r11.A0T
            android.os.Handler r1 = r0.A0C
            r0 = 44
            X.AnonymousClass000.A14(r1, r2, r0)
            X.5NU r1 = r11.A0V
            X.9ps r0 = r11.A06
            r1.setPlayer(r0)
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x00a3
            long r2 = r11.A02
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00e0
            X.9ps r0 = r11.A06
            r0.A0E()
        L_0x00a2:
            return
        L_0x00a3:
            android.util.Pair r0 = r11.A0E
            if (r0 == 0) goto L_0x00a2
            int r4 = X.C36381kD.A04(r0)
            if (r4 < 0) goto L_0x00ba
            X.9ps r2 = r11.A06
            int r0 = X.C36381kD.A03(r0)
            long r0 = (long) r0
            r2.A0H(r4, r0)
        L_0x00b7:
            r11.A0E = r3
            return
        L_0x00ba:
            int r0 = X.C36381kD.A03(r0)
            if (r0 < 0) goto L_0x00b7
            X.9ps r2 = r11.A06
            X.5i1 r1 = new X.5i1
            r1.<init>()
            r1.A00 = r0
            X.60G r0 = new X.60G
            r0.<init>(r1)
            r2.A0J(r0)
            goto L_0x00b7
        L_0x00d2:
            X.6mW r1 = new X.6mW
            r1.<init>(r11)
            X.AUR r0 = r11.A08
            X.9ps r2 = new X.9ps
            r2.<init>(r1, r4, r0)
            goto L_0x0026
        L_0x00e0:
            X.9ps r1 = r11.A06
            int r0 = r11.A00
            r1.A0H(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NR.A01(X.5NR):void");
    }

    public int A04() {
        C204359ps r0 = this.A06;
        if (r0 != null) {
            return (int) r0.A08();
        }
        return 0;
    }

    public int A05() {
        C204359ps r0 = this.A06;
        if (r0 != null) {
            return (int) r0.A09();
        }
        return 0;
    }

    public int A06() {
        C204359ps r0 = this.A06;
        C18740tg.A06(r0);
        return r0.A07();
    }

    public Bitmap A07() {
        if (this.A0O || this.A06 == null || !this.A0N) {
            return null;
        }
        return this.A0V.getCurrentFrame();
    }

    public void A0A() {
        C204359ps r0 = this.A06;
        if (r0 != null) {
            r0.A0B();
            this.A0I = false;
        }
    }

    public void A0B() {
        int i;
        int i2;
        try {
            AnonymousClass6FG r5 = this.A0A;
            if (r5 != null) {
                r5.A00 = this.A00;
                int i3 = this.A01;
                if (r5 instanceof AnonymousClass5NL) {
                    AnonymousClass5NL r52 = (AnonymousClass5NL) r5;
                    if (r52.A03) {
                        C1040658d r3 = new C1040658d();
                        r3.A04 = r52.A02;
                        r3.A03 = Integer.valueOf(r52.A01);
                        C128896Ea r2 = r52.A0B;
                        r3.A0A = Long.valueOf(r2.A00 / 1000);
                        r3.A09 = Long.valueOf(r52.A0A.A00);
                        long j = r52.A07;
                        long j2 = -1;
                        if (j != -1) {
                            j2 = C36441kJ.A0A(j) / 1000;
                        }
                        r3.A07 = Long.valueOf(j2);
                        r3.A08 = Long.valueOf(r52.A06);
                        r3.A00 = C90524aI.A0Z(r52.A05);
                        r3.A0B = Long.valueOf(r52.A08);
                        r3.A06 = Long.valueOf(r52.A04);
                        r3.A05 = Long.valueOf(r52.A00);
                        r3.A01 = Integer.valueOf(r52.A00);
                        Integer num = r52.A01;
                        if (num != null) {
                            i2 = num.intValue();
                        } else {
                            i2 = 1;
                        }
                        r3.A02 = Integer.valueOf(i2);
                        r52.A09.Bly(r3);
                        r52.A03 = false;
                        r2.A01();
                        return;
                    }
                    return;
                }
                AnonymousClass5NM r53 = (AnonymousClass5NM) r5;
                C128896Ea r22 = r53.A0D;
                r22.A00();
                r53.A0C.A00();
                C128896Ea r8 = r53.A0B;
                r8.A00();
                C128896Ea r32 = r53.A0A;
                r32.A00();
                r53.A03 = (long) i3;
                C1041358k r4 = new C1041358k();
                AnonymousClass6Fk r6 = r53.A04;
                if (r6 != null) {
                    r4.A09 = Long.valueOf(r6.A04());
                    r4.A02 = C90524aI.A0Z(r6.A05());
                    r4.A0A = Long.valueOf(((long) r53.A04.A04) + 1);
                }
                r4.A01 = C90524aI.A0Z(r53.A02);
                r4.A07 = Long.valueOf(r8.A00);
                r4.A0D = Long.valueOf(r32.A00);
                r4.A0C = C36441kJ.A0y(r53.A01);
                long j3 = r22.A00;
                r4.A08 = Long.valueOf(j3);
                int i4 = r53.A00;
                if (i4 != 0) {
                    if (i4 != 1) {
                        int i5 = 3;
                        if (i4 != 2) {
                            i5 = 4;
                            if (i4 != 3) {
                                if (i4 == 5) {
                                    i5 = 6;
                                }
                            }
                        }
                        i = Integer.valueOf(i5);
                    } else {
                        i = 2;
                    }
                    r4.A06 = i;
                    r4.A0B = Long.valueOf(r53.A03);
                    r4.A00 = Boolean.valueOf(AnonymousClass000.A1R((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1))));
                    r4.A05 = Integer.valueOf(r53.A07);
                    C46932bu r33 = r53.A0E;
                    r4.A0E = C36441kJ.A0y(r33.A0B);
                    r4.A03 = C90524aI.A0Z(r33.A00);
                    r4.A04 = Integer.valueOf(C55802vD.A00(r53.A08, r33, r53.A0F, r53.A0G));
                    r53.A09.Bly(r4);
                }
                i = 1;
                r4.A06 = i;
                r4.A0B = Long.valueOf(r53.A03);
                r4.A00 = Boolean.valueOf(AnonymousClass000.A1R((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1))));
                r4.A05 = Integer.valueOf(r53.A07);
                C46932bu r332 = r53.A0E;
                r4.A0E = C36441kJ.A0y(r332.A0B);
                r4.A03 = C90524aI.A0Z(r332.A00);
                r4.A04 = Integer.valueOf(C55802vD.A00(r53.A08, r332, r53.A0F, r53.A0G));
                r53.A09.Bly(r4);
            }
        } catch (Exception unused) {
        }
    }

    public void A0E() {
        C19770wU r2 = this.A0R;
        if (r2 != null) {
            r2.Boy(new C1497472p(this, 15));
        } else {
            super.A0E();
        }
    }

    public void A0G() {
        AnonymousClass6FG r1 = this.A0A;
        if (r1 != null && !(r1 instanceof AnonymousClass5NL)) {
            AnonymousClass5NM r12 = (AnonymousClass5NM) r1;
            if (!r12.A06) {
                r12.A0B.A02();
            }
        }
    }

    public void A0H() {
        AnonymousClass6FG r1 = this.A0A;
        if (r1 == null) {
            return;
        }
        if (r1 instanceof AnonymousClass5NL) {
            ((AnonymousClass5NL) r1).A0B.A00();
            return;
        }
        AnonymousClass5NM r12 = (AnonymousClass5NM) r1;
        r12.A0D.A00();
        r12.A0C.A00();
        r12.A0B.A00();
        r12.A0A.A00();
        r12.A00 = 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r11.A0Q == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I() {
        /*
            r11 = this;
            X.9ps r0 = r11.A06
            if (r0 == 0) goto L_0x0076
            r11.A0K()
            X.9ps r1 = r11.A06
            X.9ng r0 = r1.A0D
            X.C203259ng.A05(r0)
            android.os.Handler r1 = r1.A0C
            r0 = 50
            android.os.Message r0 = r1.obtainMessage(r0)
            r1.sendMessage(r0)
            r1 = 0
            r11.A0B = r1
            r11.A0E = r1
            r11.A0G = r1
            r11.A0N = r1
            r11.A0M = r1
            X.6FG r0 = r11.A0A
            if (r0 == 0) goto L_0x002b
            r0.A00()
        L_0x002b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r1 = r3
            X.33I r0 = r11.A0C
            if (r0 == 0) goto L_0x004a
            X.3O8 r3 = r0.A00
            int r2 = r3.A00
            int r1 = X.AnonymousClass3O8.A09
            r0 = 0
            if (r2 >= r1) goto L_0x0042
            int r0 = r2 + 1
            r3.A00 = r0
            r0 = 1
        L_0x0042:
            java.lang.Boolean r3 = X.C36441kJ.A0x(r0)
            java.lang.Boolean r1 = X.C36371kC.A0m()
        L_0x004a:
            android.net.Uri r4 = r11.A04
            android.net.Uri r5 = r11.A03
            boolean r0 = r11.A0A
            r2 = 1
            if (r0 == 0) goto L_0x0058
            boolean r0 = r11.A0Q
            r7 = 1
            if (r0 != 0) goto L_0x0059
        L_0x0058:
            r7 = 0
        L_0x0059:
            int r6 = r11.A0D
            boolean r8 = r11.A0F
            boolean r9 = r3.booleanValue()
            boolean r10 = r1.booleanValue()
            X.9Xa r1 = X.C129696Ic.A00(r4, r5, r6, r7, r8, r9, r10)
            X.AxD r0 = r11.A05
            if (r0 == 0) goto L_0x006f
            r1.A03 = r0
        L_0x006f:
            X.9ps r0 = r11.A06
            r0.A0K(r1)
            r11.A0H = r2
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NR.A0I():void");
    }

    public void A0J() {
        C204359ps r0 = this.A06;
        if (r0 != null) {
            r0.A0C();
        }
    }

    public void A0K() {
        C204359ps r0 = this.A06;
        if (r0 == null || r0.A07() == 1) {
            this.A0O = false;
            return;
        }
        this.A0O = true;
        Handler handler = this.A06.A0C;
        handler.sendMessage(handler.obtainMessage(49));
    }

    public void A0L(int i) {
        C204359ps r2 = this.A06;
        if (r2 != null) {
            C114905i1 r1 = new C114905i1();
            r1.A00 = i;
            r2.A0J(new AnonymousClass60G(r1));
            return;
        }
        this.A0E = C36341k9.A0I(C90494aF.A0U(), i);
    }

    public void A0M(int i) {
        this.A0V.setLayoutResizeMode(i);
    }

    public void A0Q(AnonymousClass6D2 r2) {
        this.A0V.A01 = r2;
    }

    public void A0S(AnonymousClass5NI r4) {
        if (!(r4 instanceof HeroPlaybackControlView)) {
            ViewGroup viewGroup = (ViewGroup) r4.getParent();
            int indexOfChild = viewGroup.indexOfChild(r4);
            if (indexOfChild > 0) {
                viewGroup.removeViewAt(indexOfChild);
            }
            r4 = new HeroPlaybackControlView(this.A0V.getContext(), (AttributeSet) null);
            viewGroup.addView(r4);
        }
        this.A0D = r4;
        this.A0V.A02(r4, false);
    }

    public void A0V(boolean z) {
        this.A0S = z;
        C204359ps r1 = this.A06;
        if (r1 != null) {
            r1.A0G(C90514aH.A03(z ? 1 : 0));
        }
    }

    public void A0W(boolean z) {
        this.A0V.setCaptionsEnabled(z);
    }

    public boolean A0X() {
        C204359ps r2 = this.A06;
        if (r2 == null || this.A0O) {
            return false;
        }
        if (this.A0I || r2.A0M()) {
            return true;
        }
        return false;
    }

    public boolean A0Y() {
        if (!this.A0B || !this.A0G || !this.A0L) {
            return false;
        }
        return true;
    }

    public boolean A0a() {
        C204359ps r1 = this.A06;
        C18740tg.A06(r1);
        if (r1.A0A || r1.A0D.A08) {
            return true;
        }
        return false;
    }

    public boolean A0b() {
        return AnonymousClass000.A1Q(this.A0V.A06.getVisibility());
    }

    public void A0e(C139166jL r2) {
        r2.A00 = new AnonymousClass61H(this);
        this.A05 = r2;
    }

    public AnonymousClass5NR(Activity activity, AnonymousClass17Y r6, C21060yb r7, C19630wG r8, AnonymousClass6KH r9, C19770wU r10, AnonymousClass6FG r11, int i, boolean z) {
        this.A0U = r6;
        this.A03 = r7;
        this.A01 = activity;
        this.A08 = AnonymousClass6KH.A00(r9);
        this.A09 = r9;
        AnonymousClass5NU r0 = new AnonymousClass5NU(activity, r6, z);
        this.A0V = r0;
        r0.setLayoutResizeMode(i);
        this.A0A = r11;
        this.A0R = r10;
        HashMap A0J2 = AnonymousClass001.A0J();
        this.A07 = C202289lT.A01(r8.A00, this.A08, B44.A00, A0J2);
    }

    public static void A02(AnonymousClass5NR r2, Integer num, String str, String str2, boolean z) {
        C36321k7.A1P("WaHeroPlayer/onError=", str, AnonymousClass000.A0u());
        r2.A0U(str, str2, z);
        AnonymousClass6FG r1 = r2.A0A;
        if (r1 == null) {
            return;
        }
        if (r1 instanceof AnonymousClass5NL) {
            ((AnonymousClass5NL) r1).A01 = num;
        } else {
            ((AnonymousClass5NM) r1).A0A.A00();
        }
    }

    public View A08() {
        return this.A0V;
    }

    public AnonymousClass5NI A09() {
        return this.A0D;
    }

    public void A0F() {
        hashCode();
        if (this.A06 == null) {
            AnonymousClass5NI r1 = this.A0D;
            if (r1 != null) {
                Activity activity = this.A01;
                C18740tg.A06(activity);
                if ((C36361kB.A0C(activity).getSystemUiVisibility() & 4) == 0) {
                    r1.A05();
                } else {
                    r1.A04();
                }
            }
            A01(this);
            this.A0H = true;
            if (this.A0P) {
                if (this.A06 != null) {
                    AnonymousClass5NI r2 = this.A0D;
                    if (r2 != null) {
                        r2.A04 = null;
                        r2.A05 = new AnonymousClass6R5(this, 0);
                    }
                    C1497472p.A00(this.A0U, this, 16);
                }
            } else if (this.A0D == null) {
                AnonymousClass6FG r0 = this.A0A;
                if (r0 != null) {
                    r0.A00();
                }
                if (!this.A0Q) {
                    this.A06.A0L(this.A0A);
                }
            } else {
                C204359ps r02 = this.A06;
                if (r02 != null) {
                    r02.A0B();
                }
                AnonymousClass5NI r22 = this.A0D;
                if (r22 != null) {
                    r22.A04 = new C1491970f(this);
                    r22.A05 = new AnonymousClass6R5(this, 1);
                }
            }
        }
    }

    public void A0T(File file) {
        this.A04 = Uri.fromFile(file);
        this.A05 = null;
    }

    public boolean A0Z() {
        return this.A0K;
    }

    public boolean A0c() {
        return this.A0H;
    }

    public /* synthetic */ void A0d() {
        super.A0E();
    }

    public void A0N(int i) {
        this.A0D = i;
    }

    public void A0O(int i) {
        this.A00 = i;
    }
}
