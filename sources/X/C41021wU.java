package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.1wU  reason: invalid class name and case insensitive filesystem */
public class C41021wU extends AnonymousClass0CZ {
    public final AnonymousClass012 A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final AnonymousClass1Pp A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass171 A05;
    public final C27761Ps A06;
    public final C61923Ea A07;
    public final C39871u3 A08;
    public final C19930wk A09;
    public final C18820ts A0A;

    public static AnonymousClass34G A00(AnonymousClass141 r3, C41021wU r4, int i) {
        AnonymousClass171 r2 = r4.A05;
        if (!r2.A0g(r3, i) || !r4.A08.A0B) {
            return r2.A0E(r3, i, false, true);
        }
        return new AnonymousClass34G(C52022ol.PHONE_NUMBER, AnonymousClass3U8.A02(r4.A0A, r3));
    }

    public int A0J() {
        return C36401kF.A00(this.A07.A02);
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r26, int i) {
        AnonymousClass35P r1;
        C42251yW r6 = (C42251yW) r26;
        Context A0F = C36441kJ.A0F(r6);
        C80143uv r4 = (C80143uv) C36401kF.A0w(this.A07.A02).get(i);
        AnonymousClass11F r7 = r4.A04;
        AnonymousClass141 A082 = this.A04.A08(r7);
        C18740tg.A06(A082);
        Bitmap A072 = this.A06.A07(A0F, A082, 0.0f, A0F.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), true);
        if (A072 == null) {
            AnonymousClass1Pp r2 = this.A03;
            A072 = r2.A03(A0F, r2.A02(A082));
        }
        boolean A0M = this.A02.A0M(r7);
        AnonymousClass171 r11 = this.A05;
        int A0A2 = r11.A0A(this.A08.A02);
        String str = r4.A05;
        C18740tg.A06(str);
        if (A0M) {
            r1 = new AnonymousClass35P(A0F.getString(R.string.f12nameremoved), C36351kA.A0w(A0F, str, 1, R.string.f12nameremoved));
        } else {
            AnonymousClass34G A002 = A00(A082, this, A0A2);
            String str2 = A002.A01;
            Object[] A0M2 = AnonymousClass001.A0M();
            String str3 = str2;
            if (A002.A00 == C52022ol.PUSH_NAME) {
                str3 = AnonymousClass171.A03(r11, A082, R.string.f12nameremoved);
            }
            A0M2[0] = str3;
            r1 = new AnonymousClass35P(str2, C36391kE.A0v(A0F, str, A0M2, 1, R.string.f12nameremoved));
        }
        AnonymousClass141 r18 = A082;
        AnonymousClass35P r19 = r1;
        C80143uv r17 = r4;
        this.A09.execute(new C80883w7(A0F, A072, r17, r18, r19, r6, this, str, A0A2, A0M));
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        boolean z = this.A08.A0A;
        LayoutInflater A092 = C36331k8.A09(viewGroup);
        if (z) {
            return new C47082ct(A092.inflate(R.layout.f9nameremoved, viewGroup, false));
        }
        return new C42251yW(A092.inflate(R.layout.f9nameremoved, viewGroup, false));
    }

    public C41021wU(AnonymousClass012 r3, AnonymousClass17Y r4, C19730wQ r5, AnonymousClass1Pp r6, AnonymousClass16D r7, AnonymousClass171 r8, C27761Ps r9, C18820ts r10, C61923Ea r11, C39871u3 r12, C19930wk r13) {
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A09 = r13;
        this.A05 = r8;
        this.A0A = r10;
        this.A06 = r9;
        this.A00 = r3;
        this.A07 = r11;
        this.A08 = r12;
        C65973Ue.A01(r3, r11.A02, this, 17);
    }
}
