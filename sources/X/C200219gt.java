package X;

import android.content.Context;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9gt  reason: invalid class name and case insensitive filesystem */
public final class C200219gt {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Context A05;
    public Looper A06;
    public C23090B4a A07;
    public AnonymousClass88A A08;
    public AnonymousClass9YO A09;
    public C200999ib A0A;
    public C198109cv A0B;
    public AnonymousClass9SO A0C;
    public C202259lQ A0D;
    public C201369jP A0E;
    public AnonymousClass9DD A0F;
    public Integer A0G;
    public Integer A0H;
    public Long A0I;
    public Map A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public AnonymousClass884 A0S;
    public final AnonymousClass9PO A0T;
    public final AtomicBoolean A0U;
    public final AtomicBoolean A0V;

    public C200219gt(C1891592m r4, C23090B4a b4a, AnonymousClass9YO r6, C22793Aw4 aw4, C22793Aw4 aw42, AnonymousClass9DD r9) {
        this.A0F = null;
        this.A09 = null;
        this.A07 = null;
        this.A0V = new AtomicBoolean(false);
        this.A08 = AnonymousClass9AN.A01;
        this.A0S = AnonymousClass9AN.A00;
        this.A0G = C023109s.A00;
        this.A00 = 6;
        this.A04 = 5;
        this.A02 = 1;
        this.A0H = C023109s.A0C;
        this.A0J = C90524aI.A0s();
        this.A01 = 3;
        this.A0U = new AtomicBoolean(false);
        this.A0T = new AnonymousClass9PO(this);
    }

    public final void A06() {
        this.A0O = false;
        C200999ib r3 = this.A0A;
        if (r3 != null) {
            AnonymousClass9AO.A01.A01("sup:FrameRateAdaptiveVideoConfigHandler", "Stopping monitor");
            r3.A07 = false;
            C200999ib.A01(r3);
        }
        C201369jP r32 = this.A0E;
        if (r32 != null) {
            C201369jP.A00(new AnonymousClass88D(0), r32);
            C1264163w r2 = r32.A03;
            r2.A03.clear();
            r2.A01 = 0;
            r2.A00 = System.currentTimeMillis();
            r32.A03 = new C1264163w(r32.A03.A02);
            r32.A08.set(0);
            r32.A09.set(0);
        }
        AnonymousClass9YO r0 = this.A09;
        if (r0 != null) {
            A08(r0.A02());
        }
    }

    public Context A00() {
        Context context = this.A05;
        if (context != null) {
            return context;
        }
        throw C36331k8.A0d("context");
    }

    public final AnonymousClass9SO A01() {
        AnonymousClass9SO r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mediaStreamClient");
    }

    public final C202259lQ A02() {
        C202259lQ r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mediaCodecDecoder");
    }

    public void A03() {
        C200159gk r3 = AnonymousClass9AO.A01;
        r3.A01("sup:MediaStreamController", "msc:connect");
        if (!this.A0M) {
            r3.A01("sup:MediaStreamController", "msc, not initialized, returning");
            this.A0U.set(true);
        } else if (this.A0L) {
            r3.A01("sup:MediaStreamController", "Already connecting");
        } else if (this.A0K) {
            r3.A01("sup:MediaStreamController", "Already connected");
            Iterator A0y = AnonymousClass000.A0y(this.A0J);
            while (A0y.hasNext()) {
                ((AnonymousClass9YG) C36351kA.A0u(A0y)).A00();
            }
        } else {
            this.A0L = true;
            A01().A00.A04(AnonymousClass8AQ.A00);
        }
    }

    public void A04() {
        C200159gk r2 = AnonymousClass9AO.A01;
        r2.A01("sup:MediaStreamController", "msc:disconnect");
        if (this.A0L) {
            r2.A01("sup:MediaStreamController", "msc, was still connecting, internalDisconnect");
        } else if (!this.A0K) {
            r2.A01("sup:MediaStreamController", "msc, not connected, returning");
            return;
        }
        A01().A00.A04(AnonymousClass8AS.A00);
        this.A0L = false;
        this.A0K = false;
        A06();
        Iterator A0y = AnonymousClass000.A0y(this.A0J);
        while (A0y.hasNext()) {
            ((AnonymousClass9YG) C36351kA.A0u(A0y)).A01();
        }
    }

    public void A05() {
        C200159gk r2 = AnonymousClass9AO.A01;
        r2.A01("sup:MediaStreamController", "msc:stop");
        if (!this.A0O) {
            r2.A01("sup:MediaStreamController", "msc, not streaming, returning");
            return;
        }
        this.A0P = false;
        C23090B4a b4a = this.A07;
        if (b4a != null) {
            b4a.BPE("cancel_reason", "foa_sent_stop_request_before_qpl_finished");
            b4a.BPF(4);
            ((AnonymousClass6n9) b4a).A00 = 0;
            synchronized (C199259ez.A03) {
            }
        }
        A01().A00.A04(AnonymousClass8AW.A00);
        A06();
        C202259lQ A022 = A02();
        A022.A08((C006302t) null);
        A022.A07((AnonymousClass00S) null);
        A022.A09(false);
    }

    public final void A07(int i) {
        Integer num;
        this.A03 = i;
        if (i == this.A04) {
            Iterator A0y = AnonymousClass000.A0y(this.A0J);
            while (A0y.hasNext()) {
                ((AnonymousClass9YG) C36351kA.A0u(A0y)).A03();
            }
            if (this.A0N || this.A01 == 4) {
                num = C023109s.A06;
            } else {
                num = C023109s.A05;
            }
            A0A(num);
        }
    }

    public void A08(AnonymousClass88A r6) {
        this.A08 = r6;
        C201369jP r4 = this.A0E;
        if (r4 != null) {
            int i = r6.A00;
            AnonymousClass9AO.A01.A01("sup:BtcThroughputHealth", AnonymousClass000.A0r("Set expected bitrate to ", AnonymousClass000.A0u(), i));
            r4.A00 = i;
            System.currentTimeMillis();
        }
    }

    public final void A09(AnonymousClass88E r4, C194269Ow r5) {
        C200159gk r1;
        String str;
        if (r4 == null) {
            new Exception(AnonymousClass000.A0l(r5, "sup:MediaStreamController Failed on error event ", AnonymousClass000.A0u()));
        }
        if (r5 instanceof C1695289r) {
            AnonymousClass9AO.A01.A01("sup:MediaStreamController", "handleMediaStreamErrorEvent ConnectionError");
            Iterator A0y = AnonymousClass000.A0y(this.A0J);
            while (A0y.hasNext()) {
                ((AnonymousClass9YG) C36351kA.A0u(A0y)).A04(r5);
            }
        } else if (r5 instanceof C1695389s) {
            AnonymousClass9AO.A01.A01("sup:MediaStreamController", "handleMediaStreamErrorEvent StreamStartError");
            Iterator A0y2 = AnonymousClass000.A0y(this.A0J);
            while (A0y2.hasNext()) {
                ((AnonymousClass9YG) C36351kA.A0u(A0y2)).A04(r5);
            }
            if (AnonymousClass00C.A0J(r5.A01(), "LIVE_STREAM_START_DOFF_ERROR")) {
                return;
            }
        } else if (r5 instanceof C1695489t) {
            AnonymousClass9AO.A01.A01("sup:MediaStreamController", "handleMediaStreamErrorEvent StreamingError");
            Iterator A0y3 = AnonymousClass000.A0y(this.A0J);
            while (A0y3.hasNext()) {
                ((AnonymousClass9YG) C36351kA.A0u(A0y3)).A04(r5);
            }
        } else {
            if (r5 instanceof C1695189q) {
                r1 = AnonymousClass9AO.A01;
                str = "handleMediaStreamErrorEvent StreamingTransientError";
            } else if (r5 instanceof C1695589u) {
                r1 = AnonymousClass9AO.A01;
                str = "handleMediaStreamErrorEvent TelemetryError";
            } else {
                return;
            }
            r1.A01("sup:MediaStreamController", str);
            return;
        }
        A04();
    }

    public void A0A(Integer num) {
        A01().A00.A04(new AnonymousClass8AM(new AnonymousClass88J(num, System.currentTimeMillis())));
    }

    public C200219gt() {
        this((C1891592m) null, (C23090B4a) null, (AnonymousClass9YO) null, (C22793Aw4) null, (C22793Aw4) null, (AnonymousClass9DD) null);
    }
}
