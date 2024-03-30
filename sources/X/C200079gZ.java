package X;

import android.content.SharedPreferences;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.core.integrity.ax;
import com.google.android.play.core.integrity.f;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.9gZ  reason: invalid class name and case insensitive filesystem */
public final class C200079gZ {
    public StandardIntegrityManager.StandardIntegrityTokenProvider A00;
    public final C19970wo A01;
    public final C19420v0 A02;
    public final C26151Jb A03;
    public final AnonymousClass1X1 A04;
    public final C19600wD A05;
    public final C19630wG A06;
    public final C21520zN A07;

    public C200079gZ(C19600wD r2, C19970wo r3, C19630wG r4, C19420v0 r5, C26151Jb r6, C21520zN r7, AnonymousClass1X1 r8) {
        AnonymousClass00C.A0D(r3, 1);
        C36321k7.A17(r7, r5, r2, 3);
        AnonymousClass00C.A0D(r4, 6);
        this.A01 = r3;
        this.A03 = r6;
        this.A07 = r7;
        this.A02 = r5;
        this.A05 = r2;
        this.A06 = r4;
        this.A04 = r8;
    }

    public final synchronized void A02(B19 b19, String str) {
        C52842qG r1;
        SharedPreferences.Editor editor;
        StringBuilder A0t = C36401kF.A0t(str, 1);
        A0t.append("GPIA_PREPARE_CALL_");
        String A0q = AnonymousClass000.A0q(C165607th.A0v(Locale.ROOT, str), A0t);
        AnonymousClass1X1 r4 = this.A04;
        r4.A00(A0q);
        try {
            if (A04()) {
                Log.w("GPIA prepare() not called because it's already prepared");
                r4.A01(A0q, "_PREPARED");
                if (b19 != null) {
                    b19.onSuccess();
                }
            } else {
                if (!this.A05.A09()) {
                    Log.w("GPIA prepare() not called because of no internet access");
                    r4.A01(A0q, "_NONETWORK");
                    if (b19 != null) {
                        r1 = new C52842qG(1001);
                    }
                } else {
                    C19970wo r2 = this.A01;
                    C19420v0 r7 = this.A02;
                    AnonymousClass005 r10 = r7.A00;
                    if ((System.currentTimeMillis() - r2.A03) - C36341k9.A0B(C36391kE.A0H(r10), "pref_last_gpia_prepare_call_timestamp") < 60000) {
                        int A012 = C36371kC.A01(C36391kE.A0H(r10), "pref_gpia_prepare_call_count_in_last_interval");
                        if (A012 >= 5) {
                            Log.w("GPIA prepare() not called because of too many attempts in the last minute");
                            r4.A01(A0q, "_TOOMANY");
                            if (b19 != null) {
                                r1 = new C52842qG(1002);
                            }
                        } else {
                            editor = C19420v0.A00(r7).putInt("pref_gpia_prepare_call_count_in_last_interval", A012 + 1);
                        }
                    } else {
                        editor = C19420v0.A00(r7).putInt("pref_gpia_prepare_call_count_in_last_interval", 1);
                    }
                    editor.apply();
                    C36341k9.A0w(C19420v0.A00(r7), "pref_last_gpia_prepare_call_timestamp", System.currentTimeMillis() - r2.A03);
                    StandardIntegrityManager a = ax.a(this.A06.A00).a();
                    AnonymousClass00C.A08(a);
                    StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder builder = StandardIntegrityManager.PrepareIntegrityTokenRequest.builder();
                    builder.setCloudProjectNumber(293955441834L);
                    Task prepareIntegrityToken = a.prepareIntegrityToken(builder.build());
                    prepareIntegrityToken.addOnSuccessListener(new C1903297y(new C22488AnR(b19, this, A0q), 0));
                    prepareIntegrityToken.addOnFailureListener(new B9A(b19, this, A0q, 0));
                }
                b19.onFailure(r1);
            }
        } catch (Exception e) {
            this.A03.A01(C188648zz.A08, "exception_thrown", e);
            r4.A01(A0q, "_EXCEPTION");
            if (b19 != null) {
                b19.onFailure(e);
            }
        }
    }

    public final synchronized void A03(B1A b1a, String str, String str2) {
        C36321k7.A0v(str, 0, str2);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GPIA_TRIGGER_CALL_");
        String A0q = AnonymousClass000.A0q(C165607th.A0v(Locale.ROOT, str2), A0u);
        AnonymousClass1X1 r4 = this.A04;
        r4.A00(A0q);
        if (!A04()) {
            this.A03.A00(C188648zz.A09, "NULL integrityTokenProvider");
            r4.A01(A0q, "_NOTPREPARED");
            e = new C52842qG(1003);
        } else {
            try {
                f fVar = new f();
                fVar.a = str;
                StandardIntegrityManager.StandardIntegrityTokenRequest build = fVar.build();
                StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider = this.A00;
                AnonymousClass00C.A0B(standardIntegrityTokenProvider);
                Task request = standardIntegrityTokenProvider.request(build);
                request.addOnSuccessListener(new C1903297y(new C22489AnS(b1a, this, A0q), 1));
                request.addOnFailureListener(new B9A(b1a, this, A0q, 1));
            } catch (Exception e) {
                e = e;
                this.A03.A01(C188648zz.A09, "exception_thrown", e);
                r4.A01(A0q, "_EXCEPTION");
            }
        }
        b1a.onFailure(e);
        return;
    }

    public final synchronized boolean A04() {
        return AnonymousClass000.A1V(this.A00);
    }

    public static final String A00(Exception exc) {
        ApiException apiException;
        Integer valueOf;
        if (!(exc instanceof ApiException) || (apiException = (ApiException) exc) == null || (valueOf = Integer.valueOf(apiException.mStatus.A01)) == null) {
            return "";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('/');
        return AnonymousClass000.A0o(valueOf, A0u);
    }

    public final Object A01(String str, C023509x r5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AR.A02;
        AnonymousClass0AR r2 = new AnonymousClass0AR(1, AnonymousClass0AA.A01(r5));
        r2.A0J();
        A02(new B8K(r2, 1), str);
        Object A0G = r2.A0G();
        if (A0G != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return A0G;
    }
}
