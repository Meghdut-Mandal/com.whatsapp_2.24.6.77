package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.net.URL;

/* renamed from: X.1OB  reason: invalid class name */
public final class AnonymousClass1OB {
    public final AnonymousClass164 A00;
    public final C220412q A01;
    public final AnonymousClass1GQ A02;
    public final AnonymousClass1OA A03;

    public AnonymousClass1OB(AnonymousClass164 r2, C220412q r3, AnonymousClass1GQ r4, AnonymousClass1OA r5) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final C124245xp A00(C28981Uw r12, boolean z) {
        int i;
        long j;
        String str;
        C28981Uw r4 = r12;
        AnonymousClass00C.A0D(r12, 0);
        C44072La r2 = (C44072La) this.A01.A09(r12, false);
        if (r2 == null) {
            return null;
        }
        String str2 = r2.A0L;
        if (!z || (str = r2.A0M) == null) {
            i = 2;
            if (str2 == null) {
                return null;
            }
        } else {
            str2 = str;
            i = 1;
        }
        if (str2.length() == 0) {
            return null;
        }
        if (i == 1) {
            j = r2.A05;
        } else {
            j = r2.A06;
        }
        return new C124245xp(r4, str2, String.valueOf(j), (URL) null, (byte[]) null, (int) (j / SearchActionVerificationClientService.MS_TO_NS), i);
    }
}
