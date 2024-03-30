package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3dJ  reason: invalid class name and case insensitive filesystem */
public class C69303dJ implements C159227j1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ AnonymousClass17Y A02;
    public final /* synthetic */ C79593ty A03;
    public final /* synthetic */ C202279lS A04;
    public final /* synthetic */ UserJid A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C69303dJ(Context context, Intent intent, AnonymousClass17Y r3, C79593ty r4, C202279lS r5, UserJid userJid, String str, boolean z) {
        this.A06 = str;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = userJid;
        this.A07 = z;
        this.A00 = context;
        this.A01 = intent;
        this.A03 = r4;
    }

    public void BXn(String str, int i) {
        if (this.A06.equals(str)) {
            AnonymousClass17Y r3 = this.A02;
            r3.A02.post(new AVa(this, this.A04, 46));
            this.A03.A0C(C36381kD.A0j());
        }
    }

    public void BXo(AnonymousClass9NZ r9, String str) {
        String str2 = this.A06;
        if (str2.equals(str)) {
            AnonymousClass17Y r3 = this.A02;
            r3.A02.post(new AVa(this, this.A04, 47));
            AnonymousClass3SM.A01(this.A00, this.A01, this.A05, (Integer) null, (Integer) null, str2, 6, this.A07);
            this.A03.A0C(C36371kC.A0m());
        }
    }
}
