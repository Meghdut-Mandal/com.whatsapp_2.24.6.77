package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.2je  reason: invalid class name and case insensitive filesystem */
public class C49762je extends C132446Tt {
    public final AnonymousClass11F A00;
    public final UserJid A01;
    public final C64933Qa A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final String A06;
    public final WeakReference A07;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return C36441kJ.A0W(Boolean.valueOf(C36411kG.A1a(((C236419g) this.A04.get()).A0A())), ((AnonymousClass1A1) this.A05.get()).A03(this.A02));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00I r8 = (AnonymousClass00I) obj;
        boolean A1X = AnonymousClass000.A1X(r8.A00);
        AnonymousClass3T1 r5 = (AnonymousClass3T1) r8.A01;
        C225014r r4 = (C225014r) this.A07.get();
        if (r4 != null) {
            C64743Pg r2 = new C64743Pg((C20810yC) this.A03.get(), this.A00, this.A06, A1X);
            r2.A05 = false;
            r2.A07 = false;
            r2.A01 = this.A01;
            r2.A03 = new C89434Wn(this, 4);
            if (r5 != null) {
                r2.A02 = r5.A1J;
            }
            r4.Btm(r2.A01());
        }
    }

    public C49762je(C225014r r2, AnonymousClass11F r3, UserJid userJid, C64933Qa r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8, String str) {
        this.A07 = AnonymousClass001.A0F(r2);
        this.A05 = r7;
        this.A03 = r6;
        this.A04 = r8;
        this.A00 = r3;
        this.A06 = str;
        this.A01 = userJid;
        this.A02 = r5;
    }
}
