package X;

import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.3d0  reason: invalid class name and case insensitive filesystem */
public class C69113d0 implements C19710wO {
    public final C19730wQ A00;
    public final AnonymousClass36G A01;
    public final AnonymousClass1C3 A02;
    public final C30591aS A03;
    public final AnonymousClass196 A04;
    public final AnonymousClass1IZ A05;
    public final C144576sT A06;
    public final C18820ts A07;

    public String BIB() {
        return "CompanionInitAsync";
    }

    public /* synthetic */ void BRM() {
    }

    public void BRL() {
        AnonymousClass1LZ A002;
        AnonymousClass36G r1 = this.A01;
        if (r1.A01.A09() && !r1.A02.A01.A2H()) {
            Log.i("MDOptInInitializer/Force_If_Required");
            synchronized (r1) {
                Log.i("MDOptInInitializer/Opting In");
                r1.A00.A00();
            }
        }
        if (this.A00.A0L()) {
            this.A03.A01((AnonymousClass5J9) null);
        }
        AnonymousClass1C3 r12 = this.A02;
        if (r12.A0C.A02() != null) {
            r12.A02.A00();
        }
        AnonymousClass196 r5 = this.A04;
        if (r5.A0S()) {
            this.A05.A01();
        }
        r5.A0F();
        C18820ts r0 = this.A07;
        C144576sT r4 = this.A06;
        r0.A09.add(r4);
        Locale locale = Locale.getDefault();
        if (!r5.A06.A0L() && (A002 = r5.A0T.A00("setting_locale")) != null) {
            C36371kC.A1Q(r5.A0W, r5, A002, locale, 26);
        }
        r4.A02();
    }

    public C69113d0(C19730wQ r1, AnonymousClass36G r2, AnonymousClass1C3 r3, C30591aS r4, AnonymousClass196 r5, AnonymousClass1IZ r6, C144576sT r7, C18820ts r8) {
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
    }
}
