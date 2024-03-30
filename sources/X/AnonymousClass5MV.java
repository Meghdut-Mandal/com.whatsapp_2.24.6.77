package X;

import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.5MV  reason: invalid class name */
public class AnonymousClass5MV extends C132446Tt {
    public final int A00;
    public final long A01;
    public final AnonymousClass1DF A02;
    public final C20810yC A03;
    public final AnonymousClass11F A04;
    public final C146826wE A05;
    public final AnonymousClass1A1 A06;
    public final boolean A07;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C36691l9 r3;
        C36691l9 r1;
        C36691l9 r6 = (C36691l9) obj;
        if (r6 != null) {
            boolean z = this.A07;
            r6.getCount();
            r6.getPosition();
            C146826wE r4 = this.A05;
            MediaViewBaseFragment mediaViewBaseFragment = r4.A0F;
            if (mediaViewBaseFragment.A0h() != null && !((C225314u) mediaViewBaseFragment.A0i()).BLh()) {
                if (z) {
                    r3 = r4.A02;
                    r4.A07 = true;
                    r4.A02 = r6;
                    int count = r6.getCount();
                    r4.A00 = count;
                    C36321k7.A1T("MediaMessagesNavigator/navigator/upgrade-head-cursor/ count:", AnonymousClass000.A0u(), count);
                    r1 = r4.A02;
                } else {
                    r3 = r4.A03;
                    r4.A08 = true;
                    r4.A03 = r6;
                    int count2 = r6.getCount();
                    r4.A01 = count2;
                    C36321k7.A1T("MediaMessagesNavigator/navigator/upgrade-tail-cursor/ count:", AnonymousClass000.A0u(), count2);
                    r1 = r4.A03;
                }
                r1.registerContentObserver(r4.A0A);
                Runnable runnable = r4.A06;
                if (runnable != null) {
                    runnable.run();
                }
                if (r3 != null) {
                    r3.close();
                }
            }
        }
    }

    public AnonymousClass5MV(AnonymousClass1DF r1, C20810yC r2, AnonymousClass11F r3, C146826wE r4, AnonymousClass1A1 r5, int i, long j, boolean z) {
        this.A03 = r2;
        this.A05 = r4;
        this.A06 = r5;
        this.A02 = r1;
        this.A04 = r3;
        this.A01 = j;
        this.A07 = z;
        this.A00 = i;
    }
}
