package X;

import android.content.ContentProvider;
import android.content.Context;
import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.instrumentation.api.InstrumentationProvider;
import com.whatsapp.registration.autoconf.LoginStatusContentProvider;
import com.whatsapp.registration.directmigration.MigrationContentProvider;
import com.whatsapp.stickers.storage.WhitelistPackQueryContentProvider;
import com.whatsapp.util.Log;

/* renamed from: X.0ur  reason: invalid class name and case insensitive filesystem */
public abstract class C19380ur extends ContentProvider {
    public boolean A00;

    public synchronized void A08() {
        if (!this.A00) {
            StringBuilder sb = new StringBuilder();
            sb.append("WaBaseContentProvider/ensureInitialized called for ");
            sb.append(getClass().getSimpleName());
            Log.i(sb.toString());
            Boolean bool = C18750th.A03;
            if (!C224714l.A02()) {
                C18740tg.A00();
                C18740tg.A00.block();
            }
            A07();
            this.A00 = true;
        }
    }

    public void A07() {
        if (this instanceof WhitelistPackQueryContentProvider) {
            WhitelistPackQueryContentProvider whitelistPackQueryContentProvider = (WhitelistPackQueryContentProvider) this;
            whitelistPackQueryContentProvider.A01 = (AnonymousClass1BP) ((C18800tq) C18810tr.A00(whitelistPackQueryContentProvider.getContext().getApplicationContext(), C18800tq.class)).A8a.get();
        } else if (this instanceof MigrationContentProvider) {
            MigrationContentProvider migrationContentProvider = (MigrationContentProvider) this;
            C18800tq r2 = (C18800tq) C18810tr.A00(migrationContentProvider.getContext(), C18800tq.class);
            migrationContentProvider.A02 = (C19730wQ) r2.A4g.get();
            migrationContentProvider.A01 = (C20690y0) r2.A6r.get();
            migrationContentProvider.A03 = (C21100yf) r2.A7f.get();
            migrationContentProvider.A08 = (AnonymousClass179) r2.A3D.get();
            migrationContentProvider.A04 = (C29301Wc) r2.A0b.get();
            migrationContentProvider.A07 = (AnonymousClass54Q) r2.A1X.get();
            migrationContentProvider.A06 = (C24431Ck) r2.A2z.get();
            migrationContentProvider.A0D = (AnonymousClass3T0) r2.AfI.A00.A4L.get();
            migrationContentProvider.A0C = (AnonymousClass1CR) r2.A1i.get();
            migrationContentProvider.A0A = (C19420v0) r2.A9G.get();
            migrationContentProvider.A09 = (C20830yE) r2.A9E.get();
            migrationContentProvider.A05 = (C24411Ci) r2.A2y.get();
            migrationContentProvider.A0E = (AnonymousClass54W) r2.A82.get();
            migrationContentProvider.A0B = (C19900wh) r2.A9J.get();
            migrationContentProvider.A00 = (C19700wN) r2.A2U.get();
        } else if (this instanceof LoginStatusContentProvider) {
            LoginStatusContentProvider loginStatusContentProvider = (LoginStatusContentProvider) this;
            Context context = loginStatusContentProvider.getContext();
            if (context != null) {
                C18800tq r22 = (C18800tq) C18810tr.A00(context, C18800tq.class);
                C20810yC Azp = r22.Azp();
                AnonymousClass00C.A0D(Azp, 0);
                loginStatusContentProvider.A03 = Azp;
                C19730wQ r0 = (C19730wQ) r22.A4g.get();
                AnonymousClass00C.A0D(r0, 0);
                loginStatusContentProvider.A00 = r0;
                C19630wG r02 = (C19630wG) r22.A91.get();
                AnonymousClass00C.A0D(r02, 0);
                loginStatusContentProvider.A01 = r02;
                C19420v0 r03 = (C19420v0) r22.A9G.get();
                AnonymousClass00C.A0D(r03, 0);
                loginStatusContentProvider.A02 = r03;
                return;
            }
            throw new IllegalStateException("Context is not attached.");
        } else if (this instanceof InstrumentationProvider) {
            InstrumentationProvider instrumentationProvider = (InstrumentationProvider) this;
            Context context2 = instrumentationProvider.getContext();
            if (context2 != null) {
                C18800tq r1 = (C18800tq) C18810tr.A00(context2, C18800tq.class);
                instrumentationProvider.A02 = (AnonymousClass1VE) r1.A4D.get();
                instrumentationProvider.A00 = (AnonymousClass1VC) r1.A4B.get();
                instrumentationProvider.A03 = (AnonymousClass1VH) r1.A4E.get();
                instrumentationProvider.A04 = (AnonymousClass12U) r1.A7L.get();
                instrumentationProvider.A01 = (C119635qC) r1.AfI.A00.A16.get();
                return;
            }
            throw new IllegalStateException("Context is not attached.");
        } else if (this instanceof MediaProvider) {
            MediaProvider mediaProvider = (MediaProvider) this;
            Context context3 = mediaProvider.getContext();
            if (context3 != null) {
                mediaProvider.A00 = context3;
                C18800tq r23 = (C18800tq) C18810tr.A00(context3, C18800tq.class);
                mediaProvider.A05 = r23.Bvc();
                mediaProvider.A01 = (C20690y0) r23.A6r.get();
                mediaProvider.A02 = (AnonymousClass16D) r23.A2A.get();
                mediaProvider.A03 = (AnonymousClass171) r23.A90.get();
                mediaProvider.A08 = (AnonymousClass1A1) r23.A3H.get();
                mediaProvider.A06 = (AnonymousClass1DF) r23.A4m.get();
                mediaProvider.A07 = (AnonymousClass1TA) r23.A7h.get();
                mediaProvider.A04 = (AnonymousClass1A6) r23.A2P.get();
                mediaProvider.A09 = (C24051Aw) r23.A3E.get();
                return;
            }
            throw new IllegalStateException("Cannot find context from the provider.");
        } else {
            AccountSwitchingContentProvider accountSwitchingContentProvider = (AccountSwitchingContentProvider) this;
            Context context4 = accountSwitchingContentProvider.getContext();
            if (context4 != null) {
                C18800tq r4 = (C18800tq) C18810tr.A00(context4, C18800tq.class);
                C19770wU r04 = (C19770wU) r4.A9Y.get();
                AnonymousClass00C.A0D(r04, 0);
                accountSwitchingContentProvider.A08 = r04;
                AnonymousClass1C4 r05 = (AnonymousClass1C4) r4.A7e.get();
                AnonymousClass00C.A0D(r05, 0);
                accountSwitchingContentProvider.A05 = r05;
                C20060wx r06 = (C20060wx) r4.A8B.get();
                AnonymousClass00C.A0D(r06, 0);
                accountSwitchingContentProvider.A02 = r06;
                AnonymousClass005 A002 = C18840tu.A00(r4.A6x);
                AnonymousClass00C.A0D(A002, 0);
                accountSwitchingContentProvider.A0M = A002;
                AnonymousClass005 A003 = C18840tu.A00(r4.A99);
                AnonymousClass00C.A0D(A003, 0);
                accountSwitchingContentProvider.A0P = A003;
                AnonymousClass005 A004 = C18840tu.A00(r4.A8M);
                AnonymousClass00C.A0D(A004, 0);
                accountSwitchingContentProvider.A0O = A004;
                AnonymousClass005 A005 = C18840tu.A00(r4.A4h);
                AnonymousClass00C.A0D(A005, 0);
                accountSwitchingContentProvider.A0L = A005;
                AnonymousClass005 A006 = C18840tu.A00(r4.A0Y);
                AnonymousClass00C.A0D(A006, 0);
                accountSwitchingContentProvider.A0F = A006;
                AnonymousClass005 A007 = C18840tu.A00(r4.A08);
                AnonymousClass00C.A0D(A007, 0);
                accountSwitchingContentProvider.A0A = A007;
                AnonymousClass005 A008 = C18840tu.A00(r4.A4U);
                AnonymousClass00C.A0D(A008, 0);
                accountSwitchingContentProvider.A0K = A008;
                AnonymousClass005 A009 = C18840tu.A00(r4.A8A);
                AnonymousClass00C.A0D(A009, 0);
                accountSwitchingContentProvider.A0N = A009;
                C229716r r07 = (C229716r) r4.A94.get();
                AnonymousClass00C.A0D(r07, 0);
                accountSwitchingContentProvider.A09 = r07;
                AnonymousClass19J r08 = (AnonymousClass19J) r4.A9p.get();
                AnonymousClass00C.A0D(r08, 0);
                accountSwitchingContentProvider.A00 = r08;
                AnonymousClass005 A0010 = C18840tu.A00(r4.A1o);
                AnonymousClass00C.A0D(A0010, 0);
                accountSwitchingContentProvider.A0H = A0010;
                C19650wI r09 = (C19650wI) r4.A4f.get();
                AnonymousClass00C.A0D(r09, 0);
                accountSwitchingContentProvider.A07 = r09;
                AnonymousClass005 A0011 = C18840tu.A00(r4.A1i);
                AnonymousClass00C.A0D(A0011, 0);
                accountSwitchingContentProvider.A0G = A0011;
                AnonymousClass005 A0012 = C18840tu.A00(r4.A0M);
                AnonymousClass00C.A0D(A0012, 0);
                accountSwitchingContentProvider.A0E = A0012;
                AnonymousClass12P r010 = (AnonymousClass12P) r4.A5G.get();
                AnonymousClass00C.A0D(r010, 0);
                accountSwitchingContentProvider.A03 = r010;
                C19420v0 r011 = (C19420v0) r4.A9G.get();
                AnonymousClass00C.A0D(r011, 0);
                accountSwitchingContentProvider.A01 = r011;
                C20720y3 r012 = (C20720y3) r4.A6u.get();
                AnonymousClass00C.A0D(r012, 0);
                accountSwitchingContentProvider.A04 = r012;
                AnonymousClass005 A0013 = C18840tu.A00(r4.A09);
                AnonymousClass00C.A0D(A0013, 0);
                accountSwitchingContentProvider.A0B = A0013;
                AnonymousClass005 A0014 = C18840tu.A00(r4.A0A);
                AnonymousClass00C.A0D(A0014, 0);
                accountSwitchingContentProvider.A0C = A0014;
                C18830tt r12 = r4.AfI.A00;
                AnonymousClass005 A0015 = C18840tu.A00(r12.A2A);
                AnonymousClass00C.A0D(A0015, 0);
                accountSwitchingContentProvider.A0I = A0015;
                C19880wf r013 = (C19880wf) r4.A4Q.get();
                AnonymousClass00C.A0D(r013, 0);
                accountSwitchingContentProvider.A06 = r013;
                AnonymousClass005 A0016 = C18840tu.A00(r4.A0B);
                AnonymousClass00C.A0D(A0016, 0);
                accountSwitchingContentProvider.A0D = A0016;
                AnonymousClass005 A0017 = C18840tu.A00(r12.A29);
                AnonymousClass00C.A0D(A0017, 0);
                accountSwitchingContentProvider.A0J = A0017;
                return;
            }
            throw new IllegalStateException("Context is not attached.");
        }
    }

    public final boolean onCreate() {
        return true;
    }
}
