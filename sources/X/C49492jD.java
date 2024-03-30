package X;

import android.database.Cursor;
import android.os.Bundle;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.2jD  reason: invalid class name and case insensitive filesystem */
public class C49492jD extends C132446Tt {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass196 A01;
    public final AnonymousClass1NO A02;
    public final AnonymousClass11F A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Set set;
        Cursor BE9;
        AnonymousClass196 r5 = this.A01;
        AnonymousClass11F r6 = this.A03;
        AnonymousClass8YK r4 = (AnonymousClass8YK) r5.A0T.A00("star");
        if (r4 == null || C36441kJ.A0n(r5.A06) == null) {
            set = Collections.emptySet();
        } else {
            AnonymousClass1M0 A042 = r4.A03.get();
            try {
                BE9 = r4.A02.BE9((C02680Bk) null, r6, (AnonymousClass1S3) null);
                ArrayList A002 = AnonymousClass8YK.A00(BE9, r4, false);
                BE9.close();
                A042.close();
                set = r5.A0C(A002);
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        boolean A032 = this.A02.A03(r6, (Long) null);
        if (A032) {
            r5.A0Q(set);
        } else {
            r5.A0P(set);
        }
        C225314u.A0S(this.A00, 300);
        return Boolean.valueOf(A032);
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Boolean bool = (Boolean) obj;
        AnonymousClass2JG r3 = (AnonymousClass2JG) this.A04.get();
        if (r3 != null && !r3.BLh()) {
            r3.Bnv();
            if (bool.booleanValue()) {
                C07540Ye.A00(r3).A02((Bundle) null, r3);
                r3.A3m();
                return;
            }
            r3.A05.A06(R.string.f12nameremoved, 0);
        }
    }

    public C49492jD(AnonymousClass196 r3, StarredMessagesActivity starredMessagesActivity, AnonymousClass1NO r5, AnonymousClass11F r6) {
        this.A01 = r3;
        this.A02 = r5;
        this.A04 = AnonymousClass001.A0F(starredMessagesActivity);
        this.A03 = r6;
    }
}
