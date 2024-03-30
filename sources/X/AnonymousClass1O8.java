package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1O8  reason: invalid class name */
public class AnonymousClass1O8 {
    public long A00;
    public final C19970wo A01;
    public final C20810yC A02;
    public final AnonymousClass19A A03;
    public final AnonymousClass1OB A04;
    public final AnonymousClass1O9 A05;
    public final AnonymousClass1AQ A06;
    public final AnonymousClass17Y A07;
    public final C19730wQ A08;
    public final C20050ww A09;
    public final AnonymousClass19J A0A;
    public final AnonymousClass1O7 A0B;
    public final C19630wG A0C;
    public final C20500xf A0D;
    public final AnonymousClass1OC A0E;
    public final C21080yd A0F;
    public final C20020wt A0G;
    public final C19770wU A0H;

    public void A01(AnonymousClass11F r2, int i, int i2) {
        A03(r2, (AnonymousClass3EB) null, i, i2);
    }

    public void A03(AnonymousClass11F r11, AnonymousClass3EB r12, int i, int i2) {
        AnonymousClass11F r5 = r11;
        if (r11 != null && r11.isProtocolCompliant() && !(r11 instanceof C177618e5) && !(r11 instanceof C28981Uw)) {
            if (!AnonymousClass3M3.A01(this.A0D, r11) && this.A00 < C19970wo.A00(this.A01)) {
                AnonymousClass1AQ r1 = this.A06;
                int i3 = i2;
                if (((i2 & 1) != 0 && r1.A01.A02(r11)) || ((i2 & 2) != 0 && r1.A02.A02(r11))) {
                    this.A07.A0H(new C80613vg(r5, this, r12, i, i3));
                }
            }
        }
    }

    public void A04(C124245xp r12, long j) {
        C124245xp r3 = r12;
        if (r12.A01 == -1) {
            AnonymousClass1AT r0 = this.A06.A02;
            AnonymousClass11F r1 = r12.A03;
            r0.A01(r1);
            this.A0B.A02(r1);
            return;
        }
        int i = r12.A02;
        long j2 = j;
        if (r12.A04 != null) {
            this.A0E.A01(r12, j);
        } else if (r12.A06 != null) {
            C19630wG r2 = this.A0C;
            C20020wt r6 = this.A0G;
            C19770wU r7 = this.A0H;
            C107205My.A01(this.A09, this.A0B, r2, r3, this.A05, this.A0F, r6, r7, 0, j2);
        } else {
            this.A0B.A03(r12);
            AnonymousClass1O9 r22 = this.A05;
            int i2 = 1;
            if (i == 1) {
                i2 = 2;
            }
            r22.A00((Double) null, Long.valueOf(SystemClock.elapsedRealtime() - j), 1, i2, 200);
        }
    }

    public void A00(AnonymousClass11F r5, int i) {
        if (i == 500 || i == 501 || i == 503) {
            this.A00 = C19970wo.A00(this.A01) + 3600000;
        } else if (i == 401 && r5 != null && !AnonymousClass143.A0G(r5)) {
            this.A0B.A02(r5);
        }
    }

    public void A02(AnonymousClass11F r18, AnonymousClass147 r19, int i, int i2) {
        String str;
        String str2;
        AnonymousClass11F r4 = r18;
        StringBuilder sb = new StringBuilder();
        sb.append("ProfilePhotoManager/sendGetSubProfilePhoto photoId:");
        int i3 = i;
        sb.append(i3);
        sb.append(" query type:");
        sb.append("url");
        sb.append(" jid:");
        sb.append(r4);
        sb.append(" image type:");
        int i4 = i2;
        sb.append(i4);
        Log.i(sb.toString());
        if (i4 == 1) {
            str = "image";
        } else {
            str = "preview";
        }
        C62393Fz r3 = new C62393Fz(new C75273mx(this, this, this.A05, (AnonymousClass3EB) null, this.A06), this.A03);
        GroupJid groupJid = (GroupJid) r4;
        if (i > 0) {
            str2 = Integer.toString(i3);
        } else {
            str2 = null;
        }
        r3.A00(groupJid, r19, r3.A00.A09(), (String) null, str2, str, "url");
    }

    public void A05(C202899mr r15) {
        AnonymousClass11F r6 = r15.A0D;
        if (r6 != null && r6.isProtocolCompliant() && this.A0A.A06 && this.A00 < C19970wo.A00(this.A01)) {
            Log.w("app/sendSetProfilePhoto");
            C21347AHz aHz = new C21347AHz(r6, this.A03, r15);
            byte[] bArr = r15.A02;
            boolean A0M = this.A08.A0M(r6);
            boolean z = false;
            if (bArr == null) {
                z = true;
            }
            aHz.A00 = z;
            AnonymousClass19A r7 = aHz.A02;
            String A092 = r7.A09();
            AnonymousClass6QB r3 = new AnonymousClass6QB("iq");
            r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092));
            r3.A04(new AnonymousClass1AL("xmlns", "w:profile:picture"));
            r3.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
            r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
            if (!A0M) {
                r3.A04(new AnonymousClass1AL((Jid) aHz.A01, "target"));
            }
            AnonymousClass6QB r2 = new AnonymousClass6QB("picture");
            r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "image"));
            r2.A01 = bArr;
            r3.A05(r2.A03());
            r7.A0K(aHz, r3.A03(), A092, 25, 0);
        }
    }

    public AnonymousClass1O8(AnonymousClass17Y r2, C19730wQ r3, C20050ww r4, AnonymousClass19J r5, AnonymousClass1O7 r6, C19970wo r7, C19630wG r8, C20810yC r9, C20500xf r10, AnonymousClass1OC r11, AnonymousClass19A r12, AnonymousClass1OB r13, AnonymousClass1O9 r14, C21080yd r15, AnonymousClass1AQ r16, C20020wt r17, C19770wU r18) {
        this.A0C = r8;
        this.A01 = r7;
        this.A02 = r9;
        this.A07 = r2;
        this.A08 = r3;
        this.A0G = r17;
        this.A0H = r18;
        this.A09 = r4;
        this.A0D = r10;
        this.A03 = r12;
        this.A06 = r16;
        this.A0A = r5;
        this.A0F = r15;
        this.A0B = r6;
        this.A05 = r14;
        this.A04 = r13;
        this.A0E = r11;
    }
}
