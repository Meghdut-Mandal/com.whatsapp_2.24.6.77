package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1e8  reason: invalid class name and case insensitive filesystem */
public final class C32751e8 {
    public final C32761e9 A00;
    public final AnonymousClass1KK A01;
    public final AnonymousClass16D A02;
    public final C27761Ps A03;
    public final C19630wG A04;
    public final AnonymousClass005 A05;

    public C32751e8(C32761e9 r2, AnonymousClass1KK r3, AnonymousClass16D r4, C27761Ps r5, C19630wG r6, AnonymousClass005 r7) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r5, 5);
        this.A04 = r6;
        this.A05 = r7;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
    }

    public final List A00(UserJid userJid) {
        C207109uZ A07;
        ArrayList arrayList = null;
        if (!(userJid == null || (A07 = this.A01.A07(userJid)) == null)) {
            List<C80153uw> list = A07.A0P;
            arrayList = new ArrayList(AnonymousClass03U.A06(list, 10));
            for (C80153uw r0 : list) {
                String str = r0.A01;
                String str2 = r0.A00;
                this.A00.A00(userJid.getRawString(), str);
                arrayList.add(new C80153uw(str, str2));
            }
        }
        return arrayList;
    }
}
