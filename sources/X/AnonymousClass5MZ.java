package X;

import android.database.ContentObserver;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.5MZ  reason: invalid class name */
public class AnonymousClass5MZ extends C132446Tt {
    public C36691l9 A00;
    public C36691l9 A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass1DF A04;
    public final C20810yC A05;
    public final AnonymousClass11F A06;
    public final C146826wE A07;
    public final AnonymousClass2bU A08;
    public final AnonymousClass1A1 A09;

    public AnonymousClass5MZ(AnonymousClass1DF r1, C20810yC r2, AnonymousClass11F r3, C146826wE r4, AnonymousClass2bU r5, AnonymousClass1A1 r6) {
        this.A05 = r2;
        this.A06 = r3;
        this.A08 = r5;
        this.A07 = r4;
        this.A09 = r6;
        this.A04 = r1;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (AnonymousClass000.A0I(obj) >= 0) {
            C146826wE r6 = this.A07;
            C36691l9 r5 = this.A00;
            boolean z = this.A02;
            C36691l9 r4 = this.A01;
            boolean z2 = this.A03;
            MediaViewBaseFragment mediaViewBaseFragment = r6.A0F;
            if (mediaViewBaseFragment.A0h() != null && !((C225314u) mediaViewBaseFragment.A0i()).BLh()) {
                r6.close();
                r6.A0B.put(0, r6.A0G);
                r6.A02 = r5;
                r6.A07 = z;
                r6.A03 = r4;
                r6.A08 = z2;
                r6.A00 = r5.getCount();
                int count = r4.getCount();
                r6.A01 = count;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("MediaMessagesNavigator/navigator/set-cursors/ head-count:");
                A0u.append(r6.A00);
                A0u.append(" head-full:");
                A0u.append(z);
                A0u.append(" tail-count:");
                A0u.append(count);
                C36321k7.A1X(" tail-full:", A0u, z2);
                ContentObserver contentObserver = r6.A0A;
                r5.registerContentObserver(contentObserver);
                r4.registerContentObserver(contentObserver);
                mediaViewBaseFragment.A1l(r6.A00, true);
            }
        }
    }
}
