package X;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.whatsapp.glasses.SupDelegateImpl$setDelayedCollapseJob$1;
import com.whatsapp.glasses.SupDelegateImpl$startErrorToConnectJob$1;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.9nR  reason: invalid class name and case insensitive filesystem */
public final class C203169nR {
    public int A00;
    public Surface A01;
    public AnonymousClass3FS A02 = AnonymousClass21D.A00;
    public C130076Jp A03 = new C130076Jp(new C22395Alw(this));
    public AnonymousClass00S A04;
    public C006302t A05;
    public C007403e A06;
    public boolean A07;
    public B5h A08;
    public C007403e A09;
    public final Context A0A;
    public final C200219gt A0B;
    public final C202609mI A0C = new C202609mI(new C22180Ai3(this), new AnonymousClass7MC(this), new C22182Ai5(this), new AnonymousClass7T3(this));
    public final C159477jQ A0D;
    public final AnonymousClass040 A0E = C009403z.A01();
    public final C191759Ef A0F;

    public final void A0A(C23107B5m b5m, B5h b5h) {
        B5h b5h2 = b5h;
        C36321k7.A0w(b5h, b5m);
        this.A08 = b5h;
        b5m.Bo5((Long) null);
        C23012B0d b0d = this.A03.A00;
        if (b0d != null) {
            int i = 0;
            if (Build.VERSION.SDK_INT >= 34) {
                i = 9;
            }
            AnonymousClass88A r0 = this.A0B.A08;
            AnonymousClass88P r2 = (AnonymousClass88P) b5h2;
            r2.A0H.post(new AVj(r2, b0d, i, r0.A03, r0.A02));
        }
    }

    public C203169nR(Context context, C23090B4a b4a, C20810yC r28, C159477jQ r29) {
        Integer num;
        Context context2 = context;
        C20810yC r2 = r28;
        C36321k7.A0x(r2, context2);
        C159477jQ r1 = r29;
        AnonymousClass00C.A0D(r1, 4);
        this.A0A = context2;
        this.A0D = r1;
        C191759Ef r9 = new C191759Ef(r2);
        this.A0F = r9;
        C200219gt r11 = new C200219gt((C1891592m) null, (C23090B4a) null, (AnonymousClass9YO) null, (C22793Aw4) null, (C22793Aw4) null, (AnonymousClass9DD) null);
        this.A0B = r11;
        AnonymousClass9AO.A00 = new C169778Aq();
        r11.A07 = b4a;
        r11.A05 = context2;
        r11.A00 = 4;
        AnonymousClass9AL.A00 = 4;
        B70 b70 = new B70(r9, 2);
        r11.A09 = b70;
        r11.A08(b70.A02());
        r11.A01 = 4;
        C20810yC r22 = r9.A00;
        String A19 = C36431kI.A19(r22, 6899);
        if (A19.equals("TCP")) {
            num = C023109s.A00;
        } else if (A19.equals("BLE")) {
            num = C023109s.A01;
        } else if (A19.equals("BTC")) {
            num = C023109s.A0C;
        } else {
            throw AnonymousClass001.A08(A19);
        }
        r11.A0H = num;
        if (num == C023109s.A0C && r11.A0E == null) {
            C201369jP r5 = new C201369jP((C1264163w) null, (C05250Oz) null, 1);
            r11.A0E = r5;
            C22341Al3 al3 = new C22341Al3(r11);
            AnonymousClass7XO r3 = AnonymousClass7XO.A00;
            AnonymousClass00C.A0D(r3, 1);
            r5.A06 = al3;
            r5.A07 = r3;
            C201369jP r8 = r11.A0E;
            if (r8 != null) {
                int i = r11.A08.A00;
                AnonymousClass9AO.A01.A01("sup:BtcThroughputHealth", AnonymousClass000.A0r("Set expected bitrate to ", AnonymousClass000.A0u(), i));
                r8.A00 = i;
                System.currentTimeMillis();
            }
        }
        r11.A02 = r22.A07(6894);
        r11.A04 = r22.A07(6895);
        r11.A0Q = true;
        AnonymousClass932.A01 = C36431kI.A19(r22, 6898);
        AnonymousClass932.A02 = (double) r22.A05(6891);
        AnonymousClass932.A00 = (double) r22.A05(6890);
        AnonymousClass932.A03 = r22.A07(6889);
        AnonymousClass932.A04 = r22.A07(6892);
        AnonymousClass930.A00 = r22.A07(6893);
        AnonymousClass930.A01 = r22.A07(6896);
        AnonymousClass930.A02 = true;
        if (r22.A0E(6904)) {
            C198109cv r82 = new C198109cv((long) r22.A07(6906), (long) r22.A07(6905));
            r11.A0B = r82;
            AnonymousClass88A A022 = b70.A02();
            long A072 = (long) r22.A07(6908);
            int A073 = r22.A07(6914);
            int A074 = r22.A07(6917);
            int A075 = r22.A07(6913);
            String A092 = r22.A09(6910);
            String A093 = r22.A09(6909);
            int A076 = r22.A07(6915);
            int A077 = r22.A07(6911);
            AnonymousClass00C.A0B(A092);
            AnonymousClass00C.A0B(A093);
            C200999ib r6 = new C200999ib(A022, r82, A092, A093, C22508Anq.A00, (double) r22.A05(6918), (double) r22.A05(6916), (double) r22.A05(6912), A073, A074, A075, A076, A077, A072);
            r11.A0A = r6;
            C201369jP r23 = r11.A0E;
            if (r23 != null) {
                int i2 = ((AnonymousClass88B) C007103b.A0N(C90524aI.A0q(((AnonymousClass9YO) r6.A0J.getValue()).A00))).A04.A00;
                r23.A01 = i2;
                AnonymousClass9AO.A01.A01("sup:BtcThroughputHealth", AnonymousClass000.A0r("minBitrate is ", AnonymousClass000.A0u(), i2));
            }
        }
        int i3 = this.A00;
        if (i3 != 6) {
            this.A00 = 6;
            C200159gk r32 = AnonymousClass9AO.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Product type changed from ");
            A0u.append(i3);
            r32.A01("sup:MediaStreamController", AnonymousClass000.A0r(" to ", A0u, 6));
        }
        this.A0B.A0F = this.A0C.A01;
        A01(new AnonymousClass8AZ(this), "sup:SUPDelegate_TOGGLED_CALLBACK");
        A00();
        A01(new C162597oq(this, 0), "sup:SUPDelegate_ON_DISCOVERED_CALLBACK");
        A01(new C162597oq(this, 1), "sup:SUPDelegate_CONNECT_ON_DISCOVER");
    }

    private final void A00() {
        C200219gt r3 = this.A0B;
        boolean z = r3.A0M;
        C200159gk r2 = AnonymousClass9AO.A01;
        if (z) {
            r2.A02("sup:SUPDelegate", "Already initialized, returning");
            return;
        }
        r2.A01("sup:MediaStreamController", "msc:init");
        if (r3.A0M) {
            r2.A01("sup:MediaStreamController", "msc: Already initialized");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("MediaStreamController", 0);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        AnonymousClass00C.A08(looper);
        r3.A06 = looper;
        C23090B4a b4a = r3.A07;
        if (b4a != null) {
            ((AnonymousClass6n9) b4a).A02 = AnonymousClass000.A1S(r3.A01, 3);
        }
        r3.A0D = new C202259lQ(r3.A08, r3.A0Q);
        Looper looper2 = r3.A06;
        if (looper2 == null) {
            throw C36331k8.A0d("looper");
        }
        AnonymousClass97B A002 = AnonymousClass97B.A00(new AnonymousClass9DC(r3), 9);
        AnonymousClass97B A003 = AnonymousClass97B.A00(r3.A0T, 10);
        C1898895z r13 = new C1898895z(r3, 2);
        AnonymousClass5X0 r12 = new AnonymousClass5X0(r3, 0);
        C197559bu r8 = new C197559bu((C1891692n) null, (C05250Oz) null, 1);
        r3.A0C = new AnonymousClass9SO(r3.A00(), looper2, r3.A07, r8, r3.A0H, A002, A003, r12, r13, r3.A02, r3.A01);
        C200999ib r4 = r3.A0A;
        if (r4 != null) {
            r4.A05 = new C22340Al2(r3);
        }
        C198109cv r42 = r3.A0B;
        if (r42 != null) {
            r42.A03 = new AnonymousClass7JU(r3);
        }
        C199259ez r7 = C199259ez.A03;
        Context A004 = r3.A00();
        List A005 = AnonymousClass95I.A00(A004, "com.facebook.stella");
        if (!(A005 == null && (A005 = AnonymousClass95I.A00(A004, "com.facebook.stella_debug")) == null)) {
            C007103b.A0Q(".", "", "", A005, (C006302t) null);
        }
        synchronized (r7) {
        }
        r3.A0M = true;
        if (r3.A0U.compareAndSet(true, false)) {
            r3.A03();
        }
    }

    private final void A01(AnonymousClass9YG r3, String str) {
        C200219gt r1 = this.A0B;
        r1.A0J.put(str, r3);
        if (r1.A0V.get()) {
            r3.A02();
        }
    }

    public static final void A02(C203169nR r3, AnonymousClass00S r4, boolean z) {
        C007403e r2 = r3.A06;
        if (r2 != null) {
            r2.B2S((CancellationException) null);
        }
        AnonymousClass3FS r22 = r3.A02;
        if (z) {
            AnonymousClass3FS A012 = r22.A01((AnonymousClass9QU) null, true, (Boolean) null);
            if (A012 != null) {
                r3.A02 = A012;
                r4.invoke();
                r3.A06 = C36391kE.A12(new SupDelegateImpl$setDelayedCollapseJob$1(r3, (C023509x) null, r4), r3.A0E);
            }
            Log.i("VoipGlassesManager.kt onStatusIndicatorChanged");
            ((C145796uX) r3.A0D).A00.A0B.invoke(C36381kD.A0j());
            return;
        }
        AnonymousClass3FS A013 = r22.A01((AnonymousClass9QU) null, C36381kD.A0j(), (Boolean) null);
        if (A013 != null) {
            r3.A02 = A013;
            r4.invoke();
        }
    }

    public static final void A03(C203169nR r4, boolean z) {
        AnonymousClass3FS r3 = r4.A02;
        if (r3 instanceof AnonymousClass21E) {
            AnonymousClass21E r32 = (AnonymousClass21E) r3;
            if (r32.A00 || !r4.A0D.BCK()) {
                C200159gk r2 = AnonymousClass9AO.A01;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Don't autoconnect user - seeing NUX tooltip: ");
                A0u.append(r32.A00);
                A0u.append(" or has not initiated ");
                r2.A01("sup:SUPDelegate", C36421kH.A0d(A0u, r4.A0D.BCK()));
                return;
            }
        }
        C006302t r22 = r4.A05;
        if (r22 != null && C90464aC.A1Y(new C22241Aj2(r4, z), r22)) {
            if (z) {
                r4.A02 = AnonymousClass21B.A00;
                r4.A0C.A04();
                AnonymousClass00S r0 = r4.A04;
                if (r0 != null) {
                    r0.invoke();
                }
            }
            r4.A00();
            r4.A0B.A03();
        }
    }

    public static final void A04(C203169nR r3, boolean z) {
        C007403e r0 = r3.A09;
        if (r0 != null) {
            r0.B2S((CancellationException) null);
        }
        r3.A09 = C36391kE.A12(new SupDelegateImpl$startErrorToConnectJob$1(r3, (C023509x) null, z), r3.A0E);
    }

    public static final boolean A05(C203169nR r2) {
        AnonymousClass3FS r1 = r2.A02;
        if (r1 instanceof AnonymousClass21A) {
            AnonymousClass21A r12 = (AnonymousClass21A) r1;
            if (r12.A01 || r12.A00.A00.A01 != C023109s.A0C) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A06() {
        AnonymousClass9AO.A01.A01("sup:SUPDelegate", "Fire on mobile button clicked");
        A02(this, new C22178Ai1(this), false);
        if (A0B()) {
            this.A0B.A05();
            C130076Jp r1 = this.A03;
            C23012B0d b0d = r1.A00;
            if (b0d != null) {
                ((C20985A1z) b0d).B5N();
            }
            C130076Jp.A00(r1);
            this.A02 = this.A02.A00(false);
            Log.i("VoipGlassesManager.kt onGlassesUnselecting");
            C144206ro r3 = ((C145796uX) this.A0D).A00;
            AnonymousClass6YM r0 = r3.A00;
            if (r0 != null) {
                r0.A1E.execute(new C1501474d(false));
                r3.A0B.invoke(true);
                this.A0C.A06(C98714rs.A00);
                AnonymousClass00S r02 = this.A04;
                if (r02 != null) {
                    r02.invoke();
                }
                if (A05(this)) {
                    A04(this, false);
                    return;
                }
                return;
            }
            throw C36381kD.A0l();
        }
    }

    public final void A07() {
        AnonymousClass3FS A012;
        AnonymousClass9AO.A01.A01("sup:SUPDelegate", "Fire on SUP button clicked");
        AnonymousClass3FS r4 = this.A02;
        if (r4 instanceof AnonymousClass21E) {
            A09();
            AnonymousClass00S r0 = this.A04;
            if (r0 != null) {
                r0.invoke();
            }
        } else if (!(r4 instanceof AnonymousClass21A)) {
            return;
        } else {
            if (this.A0B.A0K || ((AnonymousClass21A) r4).A01) {
                AnonymousClass21A r2 = (AnonymousClass21A) r4;
                if (!(r2.A01 || r2.A00.A00.A01 == C023109s.A0C || (A012 = r4.A01((AnonymousClass9QU) null, (Boolean) null, true)) == null)) {
                    this.A02 = A012;
                }
                A02(this, new C22179Ai2(this), !r2.A00.A03);
                return;
            }
        }
        A03(this, true);
    }

    public final void A08() {
        if (AnonymousClass00C.A0J(this.A02, AnonymousClass21D.A00)) {
            A01(new C162597oq(this, 0), "sup:SUPDelegate_ON_DISCOVERED_CALLBACK");
            A03(this, false);
        }
    }

    public final void A09() {
        AnonymousClass21E r0;
        C27631Pa r5 = ((C145796uX) this.A0D).A00.A05;
        if (C27631Pa.A00(r5).getBoolean("smart_glasses_nux_tool_tip", false)) {
            r0 = new AnonymousClass21E(false);
        } else {
            AnonymousClass9AO.A01.A01("sup:SUPDelegate", "Showing NUX tooltip");
            C36331k8.A0w(C27631Pa.A00(r5).edit(), "smart_glasses_nux_tool_tip", true);
            r0 = new AnonymousClass21E(true);
        }
        this.A02 = r0;
    }

    public final boolean A0B() {
        AnonymousClass3FS r1 = this.A02;
        if (!(r1 instanceof AnonymousClass21A) || !((AnonymousClass21A) r1).A01) {
            return false;
        }
        return true;
    }
}
