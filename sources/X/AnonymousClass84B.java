package X;

import android.content.Context;
import android.os.Looper;
import com.facebook.wearable.datax.LocalChannel;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.84B  reason: invalid class name */
public final class AnonymousClass84B extends AnonymousClass81Q {
    public static final /* synthetic */ C17960sM[] A0S;
    public int A00;
    public AnonymousClass9Y3 A01;
    public String A02;
    public final int A03;
    public final Looper A04;
    public final AnonymousClass9QJ A05;
    public final AnonymousClass9QJ A06;
    public final AnonymousClass9QJ A07;
    public final AnonymousClass9QJ A08;
    public final AnonymousClass9QJ A09;
    public final AnonymousClass9QJ A0A;
    public final AnonymousClass9QJ A0B;
    public final AnonymousClass9QJ A0C;
    public final AnonymousClass9QJ A0D;
    public final AnonymousClass9QJ A0E;
    public final AnonymousClass9QJ A0F;
    public final AnonymousClass9QJ A0G;
    public final C23090B4a A0H;
    public final C197559bu A0I;
    public final Integer A0J;
    public final C006302t A0K;
    public final C006302t A0L;
    public final C006302t A0M;
    public final C009003v A0N;
    public final boolean A0O = true;
    public final int A0P;
    public final Context A0Q;
    public final AnonymousClass9QJ A0R;

    public AnonymousClass84B(Context context, Looper looper, C23090B4a b4a, C197559bu r10, Integer num, C006302t r12, C006302t r13, C006302t r14, C009003v r15, int i, int i2) {
        super(looper);
        C006302t aky;
        C195539Ur r1;
        C200159gk r16;
        String str;
        this.A04 = looper;
        this.A0L = r12;
        this.A0M = r13;
        this.A0N = r15;
        this.A0K = r14;
        this.A0I = r10;
        this.A0H = b4a;
        this.A0J = num;
        int i3 = i;
        this.A03 = i3;
        this.A0P = i2;
        this.A0Q = context;
        this.A02 = "";
        this.A00 = i3 == 3 ? 8080 : 8084;
        if (num == C023109s.A0C) {
            aky = new C22327Akp(this);
        } else {
            aky = new C22336Aky(this);
        }
        C006302t r17 = aky;
        AnonymousClass00C.A0D(r17, 0);
        this.A00 = r17;
        this.A01 = new AnonymousClass9Y3(context);
        this.A0R = new AnonymousClass9QJ(new AnonymousClass8AD(context, this));
        this.A06 = new AnonymousClass9QJ(new AnonymousClass8A6(this));
        this.A08 = new AnonymousClass9QJ(new AnonymousClass8AC(this));
        this.A0B = new AnonymousClass9QJ(new AnonymousClass8AF(this));
        this.A09 = new AnonymousClass9QJ(new AnonymousClass8AG(this));
        this.A0A = new AnonymousClass9QJ(new AnonymousClass8AH(this));
        this.A05 = new AnonymousClass9QJ(new AnonymousClass8A8(this));
        this.A07 = new AnonymousClass9QJ(new AnonymousClass8A7(this));
        this.A0E = new AnonymousClass9QJ(new AnonymousClass8AE(this));
        this.A0C = new AnonymousClass9QJ(new AnonymousClass8AA(this));
        this.A0D = new AnonymousClass9QJ(new AnonymousClass8A9(this));
        this.A0G = new AnonymousClass9QJ(new AnonymousClass8AB(this));
        try {
            Object newInstance = Class.forName("com.facebook.wearable.mediastream.client.state.ToolkitHealthConnectionStateDelegate").getDeclaredConstructor(new Class[]{AnonymousClass84B.class}).newInstance(new Object[]{this});
            AnonymousClass00C.A0E(newInstance, "null cannot be cast to non-null type com.facebook.wearable.mediastream.client.state.BaseStateDelegate");
            r1 = (C195539Ur) newInstance;
        } catch (ClassNotFoundException e) {
            e = e;
            r16 = AnonymousClass9AO.A01;
            str = "ClassNotFoundException";
        } catch (NoSuchMethodException e2) {
            e = e2;
            r16 = AnonymousClass9AO.A01;
            str = "NoSuchMethodException";
        } catch (SecurityException e3) {
            e = e3;
            r16 = AnonymousClass9AO.A01;
            str = "SecurityException";
        } catch (InstantiationException e4) {
            e = e4;
            r16 = AnonymousClass9AO.A01;
            str = "InstantiationException";
        } catch (IllegalAccessException e5) {
            e = e5;
            r16 = AnonymousClass9AO.A01;
            str = "IllegalAccessException";
        } catch (IllegalArgumentException e6) {
            e = e6;
            r16 = AnonymousClass9AO.A01;
            str = "IllegalArgumentException";
        } catch (InvocationTargetException e7) {
            e = e7;
            r16 = AnonymousClass9AO.A01;
            str = "InvocationTargetException";
        }
        AnonymousClass00C.A0D(r1, 0);
        this.A0F = new AnonymousClass9QJ(r1);
        r16.A05("sup:MediaStreamState", str, e);
        r1 = new AnonymousClass84C(this);
        AnonymousClass00C.A0D(r1, 0);
        this.A0F = new AnonymousClass9QJ(r1);
    }

    public final void A09(AnonymousClass8AJ r8) {
        AnonymousClass00C.A0D(r8, 0);
        AnonymousClass9Y3 r4 = this.A01;
        int i = this.A0P;
        if (i < 1 || i > 3) {
            i = 1;
        }
        AnonymousClass8NN A0p = C172798Pf.DEFAULT_INSTANCE.A0p();
        ((C172798Pf) C90524aI.A0H(A0p)).nonce_ = r4.A00();
        AnonymousClass8NN A0p2 = AnonymousClass8RV.DEFAULT_INSTANCE.A0p();
        AnonymousClass88A r3 = r8.A00;
        ((AnonymousClass8RV) C90524aI.A0H(A0p2)).mime_ = AnonymousClass95D.A00(r3.A04);
        ((AnonymousClass8RV) C90524aI.A0H(A0p2)).width_ = r3.A03;
        ((AnonymousClass8RV) C90524aI.A0H(A0p2)).height_ = r3.A02;
        ((AnonymousClass8RV) C90524aI.A0H(A0p2)).bitrate_ = r3.A00;
        ((AnonymousClass8RV) C90524aI.A0H(A0p2)).frameRate_ = r3.A01;
        ((AnonymousClass8RV) C90524aI.A0H(A0p2)).eisMode_ = i;
        ((AnonymousClass8RV) C90524aI.A0H(A0p2)).iFrameInterval_ = 3;
        AnonymousClass8RV r0 = (AnonymousClass8RV) A0p2.A0R();
        r0.getClass();
        ((C172798Pf) C90524aI.A0H(A0p)).config_ = r0;
        ((C172798Pf) C90524aI.A0H(A0p)).enabled_ = true;
        C170918Hz A0R2 = A0p.A0R();
        AnonymousClass9AO.A01.A01("sup:MediaStreamState", AnonymousClass000.A0l(A0R2, "Configure Video: ", AnonymousClass000.A0u()));
        LocalChannel localChannel = r4.A03;
        if (localChannel != null) {
            byte[] A0o = A0R2.A0o();
            byte[] copyOf = Arrays.copyOf(A0o, A0o.length);
            AnonymousClass00C.A0D(copyOf, 2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(copyOf.length);
            allocateDirect.put(copyOf);
            allocateDirect.flip();
            localChannel.send(new C197549bt(5, allocateDirect));
        }
    }

    public final void A0A(AnonymousClass8AM r7) {
        AnonymousClass00C.A0D(r7, 0);
        LocalChannel localChannel = this.A01.A03;
        if (localChannel != null) {
            AnonymousClass913 r4 = AnonymousClass913.values()[r7.A00.A01.intValue()];
            AnonymousClass9AO.A01.A01("sup:MediaStreamState", AnonymousClass000.A0l(r4, "Sending Lifecycle Event: ", AnonymousClass000.A0u()));
            AnonymousClass8NN A012 = C170918Hz.A01(AnonymousClass8NR.DEFAULT_INSTANCE);
            ((AnonymousClass8NR) A012.A00).event_ = r4.BEY();
            AnonymousClass8NN.A0L(localChannel, A012, 19);
        }
    }

    public final boolean A0D(AnonymousClass00S r4) {
        Boolean bool;
        try {
            bool = r4.invoke();
        } catch (Throwable th) {
            bool = C90524aI.A0t(th);
        }
        Throwable A002 = AnonymousClass0AK.A00(bool);
        if (A002 != null) {
            A0B(A002);
        }
        if (bool instanceof AnonymousClass03N) {
            bool = false;
        }
        return AnonymousClass000.A1X(bool);
    }

    static {
        Class<AnonymousClass84B> cls = AnonymousClass84B.class;
        A0S = new C17960sM[]{new C14920mP(cls, "INITIAL", "getINITIAL()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "DISCOVERED", "getDISCOVERED()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "LINKED_APP_MANAGER", "getLINKED_APP_MANAGER()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "SN_APP_MANAGER", "getSN_APP_MANAGER()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "MEDIA_STREAM_SERVICE_BTC", "getMEDIA_STREAM_SERVICE_BTC()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "MEDIA_STREAM_SERVICE_TCP", "getMEDIA_STREAM_SERVICE_TCP()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "CONNECTED", "getCONNECTED()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "IDLE", "getIDLE()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "STREAMING", "getSTREAMING()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "SOCKET_CONNECTION_BTC", "getSOCKET_CONNECTION_BTC()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "SOCKET_CONNECTION_TCP", "getSOCKET_CONNECTION_TCP()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "WIFI_DIRECT", "getWIFI_DIRECT()Lcom/android/facebook/internal/util/State;"), new C14920mP(cls, "TOOLKIT_HEALTH_CONNECTION", "getTOOLKIT_HEALTH_CONNECTION()Lcom/android/facebook/internal/util/State;")};
    }

    public final C195999Xe A06() {
        return AnonymousClass9QJ.A00(this.A0R, this, A0S, 0);
    }

    public final void A0B(Throwable th) {
        C009003v r1;
        C195999Xe A002;
        Object r0;
        C200159gk r8 = AnonymousClass9AO.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("handleError from state: ");
        r8.A05("sup:MediaStreamState", AnonymousClass000.A0q(A03().A00(), A0u), th);
        AnonymousClass88E A003 = AnonymousClass81Q.A00(this, th);
        C195999Xe A032 = A03();
        AnonymousClass9QJ r9 = this.A0C;
        C17960sM[] r2 = A0S;
        if (AnonymousClass9QJ.A01(r9, this, A032, r2, 9)) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Handle uncaught error from ");
            A0u2.append(AnonymousClass9QJ.A00(r9, this, r2, 9));
            r8.A06("sup:MediaStreamState", AnonymousClass000.A0q(" state", A0u2), (Throwable) null);
            r1 = this.A0N;
            r0 = new C1695289r("BUG_MUST_FIX");
        } else if (AnonymousClass9QJ.A01(this.A05, this, A032, r2, 6) || AnonymousClass9QJ.A01(this.A07, this, A032, r2, 7) || AnonymousClass9QJ.A01(this.A0E, this, A032, r2, 8)) {
            this.A0N.invoke(new C1695489t("STREAMING_ERROR"), A003);
            return;
        } else {
            boolean A0J2 = AnonymousClass00C.A0J(A032, A06());
            r1 = this.A0N;
            if (A0J2) {
                r0 = new AnonymousClass89p();
            } else {
                r1.invoke(new C1695289r("BUG_MUST_FIX"), A003);
                A002 = AnonymousClass9QJ.A00(this.A06, this, r2, 1);
                this.A00.A03 = A002;
            }
        }
        r1.invoke(r0, A003);
        A002 = A06();
        this.A00.A03 = A002;
    }

    public final void A07(C194269Ow r5) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error: ");
        A0u.append(r5.A01());
        StringBuilder A0i = C90524aI.A0i(AnonymousClass000.A0q(" -- DUMP STATE:\n\t", A0u));
        A05(A0i);
        AnonymousClass9AO.A01.A06("sup:MediaStreamState", A0i.toString(), (Throwable) null);
        this.A0N.invoke(r5, AnonymousClass81Q.A00(this, new Exception()));
    }

    public final void A08(C194269Ow r5, Throwable th, boolean z) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Connection Step Failure - Error: ");
        A0u.append(r5.A01());
        StringBuilder A0i = C90524aI.A0i(AnonymousClass000.A0q(" -- DUMP STATE:\n\t", A0u));
        A05(A0i);
        AnonymousClass9AO.A01.A06("sup:MediaStreamState", A0i.toString(), (Throwable) null);
        C009003v r1 = this.A0N;
        if (th == null) {
            th = new Exception();
        }
        r1.invoke(r5, AnonymousClass81Q.A00(this, th));
        if (z) {
            A04(new AnonymousClass8AK(r5));
        }
    }

    public final void A0C(AnonymousClass00S r2) {
        Object obj;
        try {
            obj = r2.invoke();
        } catch (Throwable th) {
            obj = C90524aI.A0t(th);
        }
        Throwable A002 = AnonymousClass0AK.A00(obj);
        if (A002 != null) {
            A0B(A002);
        }
    }
}
