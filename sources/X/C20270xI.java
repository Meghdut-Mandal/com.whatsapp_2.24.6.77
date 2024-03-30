package X;

import android.os.ConditionVariable;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0xI  reason: invalid class name and case insensitive filesystem */
public class C20270xI implements AnonymousClass00M {
    public final C19970wo A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;

    public void A00(C159457jO r4) {
        AnonymousClass005 r2 = this.A05;
        ((C19580wB) r2.get()).registerObserver(new C142456ou(r4, this));
        if (((AnonymousClass19J) r2.get()).A04 == 2 && !((AnonymousClass19J) r2.get()).A02()) {
            r4.BYo();
        }
    }

    public boolean A01(byte[] bArr) {
        AnonymousClass14L r1;
        AnonymousClass005 r9 = this.A03;
        String A09 = ((AnonymousClass19A) r9.get()).A09();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Long valueOf = Long.valueOf(currentTimeMillis);
        AnonymousClass6QB r3 = new AnonymousClass6QB("iq");
        r3.A04(new AnonymousClass1AL("xmlns", "w:stats"));
        r3.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C203539oF.A0P(A09, 0, 9007199254740991L, false)) {
            r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09));
        }
        AnonymousClass6QB r6 = new AnonymousClass6QB("add");
        if (C203539oF.A0L(valueOf, 0, 9007199254740991L, false)) {
            r6.A04(new AnonymousClass1AL("t", currentTimeMillis));
        }
        byte[] bArr2 = bArr;
        C203539oF.A0I(bArr2, 4, 65536);
        r6.A01 = bArr2;
        r3.A05(r6.A03());
        C203399nx A032 = r3.A03();
        ConditionVariable conditionVariable = C18740tg.A00;
        AnonymousClass777 r0 = new AnonymousClass777();
        AnonymousClass19A.A03((AnonymousClass19A) r9.get(), new BAY(r0, 1), A032, A09, 58, 32000, true);
        try {
            boolean equals = "result".equals(((C203399nx) r0.get()).A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null));
            if (equals && bArr != null) {
                C20860yH r62 = (C20860yH) this.A06.get();
                int length = bArr2.length;
                if (((long) length) >= 0 && (r1 = r62.A00) != null) {
                    C18740tg.A0C(true);
                    Message.obtain(r1, 2, 32, length).sendToTarget();
                    C20860yH.A00(r62);
                }
            }
            return equals;
        } catch (InterruptedException | ExecutionException unused) {
            Log.e("FieldStatsXmppImpl/error sending fieldstats IQ");
            return false;
        }
    }

    public C20270xI(C19970wo r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7) {
        this.A03 = r2;
        this.A05 = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A04 = r6;
        this.A01 = r7;
        this.A00 = r1;
    }
}
