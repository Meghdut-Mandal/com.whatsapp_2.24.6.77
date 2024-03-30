package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1XC  reason: invalid class name */
public class AnonymousClass1XC {
    public final AnonymousClass17Y A00;
    public final C19630wG A01;
    public final C20310xM A02;
    public final AnonymousClass1VZ A03;
    public final AnonymousClass16T A04;
    public final C29221Vu A05;
    public final C24601Db A06;
    public final AnonymousClass1DR A07;
    public final C29121Vk A08;
    public final AnonymousClass1EU A09;
    public final AnonymousClass1VY A0A;

    public void A01(AnonymousClass1XD r16, Integer num, Integer num2, String str, String str2) {
        B66 A042;
        C23075B3f b3f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass1AL("action", "get-transactions"));
        String str3 = str;
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new AnonymousClass1AL("after", str3));
        }
        if (num != null) {
            arrayList.add(new AnonymousClass1AL("version", num.intValue()));
        }
        if (num2 != null) {
            arrayList.add(new AnonymousClass1AL("limit", num2.intValue()));
        }
        AZ9 A002 = AZ9.A00();
        if (!A002.A00.get()) {
            arrayList.add(new AnonymousClass1AL("client-public-key", Base64.encodeToString(A002.A02, 10)));
            C203399nx r11 = new C203399nx("account", (AnonymousClass1AL[]) arrayList.toArray(new AnonymousClass1AL[0]));
            String str4 = str2;
            boolean A0F = AnonymousClass14B.A0F(str4);
            AnonymousClass1EU r0 = this.A09;
            if (A0F) {
                A042 = r0.A05();
            } else {
                A042 = r0.A04(str4);
                if (A042 == null) {
                    b3f = null;
                    AnonymousClass1XD r2 = r16;
                    this.A08.A0H(new AnonymousClass8fz(this.A01.A00, r2, this.A05, this, A002, b3f, this.A00, true), r11, "get", 0);
                    return;
                }
            }
            b3f = A042.BBn();
            if (b3f != null) {
                b3f.Buu();
            }
            AnonymousClass1XD r22 = r16;
            this.A08.A0H(new AnonymousClass8fz(this.A01.A00, r22, this.A05, this, A002, b3f, this.A00, true), r11, "get", 0);
            return;
        }
        throw new IllegalStateException("key has been destroyed");
    }

    @Deprecated
    public void A02(AnonymousClass1XD r2, String str, boolean z) {
        A00(r2, this.A09.A05(), str, z);
    }

    public void A03(C178548gi r9) {
        List list = r9.A01;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C202319lY r6 : r9.A01) {
                C64933Qa r1 = new C64933Qa(r6.A0C, r6.A0L, r6.A0Q);
                if (r6.A0P || r1.A00 == null || r1.A01 == null) {
                    arrayList2.add(r6);
                } else {
                    arrayList.add(new AnonymousClass00I(r1, r6));
                }
            }
            if (!arrayList2.isEmpty()) {
                AnonymousClass1EU r0 = this.A09;
                AnonymousClass1EU.A00(r0);
                AnonymousClass9YB r4 = r0.A00;
                C18740tg.A06(r4);
                C18740tg.A06(r4);
                List list2 = r9.A01;
                r4.A03.Box(new C175598ak(r4, new C35761jD(this, arrayList2, 7), list2), new Void[0]);
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass00I r02 = (AnonymousClass00I) it.next();
                    this.A02.A0Z((C202319lY) r02.A01, (C64933Qa) r02.A00);
                }
            }
        }
    }

    public AnonymousClass1XC(AnonymousClass17Y r1, C19630wG r2, C20310xM r3, AnonymousClass1VZ r4, AnonymousClass16T r5, C29221Vu r6, C24601Db r7, AnonymousClass1DR r8, C29121Vk r9, AnonymousClass1EU r10, AnonymousClass1VY r11) {
        this.A00 = r1;
        this.A01 = r2;
        this.A09 = r10;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A0A = r11;
        this.A08 = r9;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
    }

    public void A00(AnonymousClass1XD r16, B66 b66, String str, boolean z) {
        AZ9 A002 = AZ9.A00();
        AnonymousClass1AL[] r4 = new AnonymousClass1AL[4];
        r4[0] = new AnonymousClass1AL("action", "get-transaction");
        int i = 1;
        r4[1] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        if (!z) {
            i = 2;
        }
        r4[2] = new AnonymousClass1AL("version", i);
        if (!A002.A00.get()) {
            r4[3] = new AnonymousClass1AL("client-public-key", Base64.encodeToString(A002.A02, 10));
            C203399nx r11 = new C203399nx("account", r4);
            C29121Vk r9 = this.A08;
            C23075B3f BBn = b66.BBn();
            Context context = this.A01.A00;
            AnonymousClass17Y r7 = this.A00;
            AnonymousClass1XD r2 = r16;
            r9.A0H(new AnonymousClass8fz(context, r2, this.A05, this, A002, BBn, r7, false), r11, "get", 0);
            return;
        }
        throw new IllegalStateException("key has been destroyed");
    }
}
