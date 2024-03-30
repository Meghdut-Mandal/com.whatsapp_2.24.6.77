package X;

import android.app.Activity;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2jB  reason: invalid class name and case insensitive filesystem */
public class C49472jB extends C132446Tt {
    public ArrayList A00;
    public final AnonymousClass1NG A01;
    public final AnonymousClass16D A02;
    public final String A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String A06;
        if (this.A04.get() != null) {
            String str = this.A03;
            if (!AnonymousClass14B.A0F(str)) {
                if (this.A00 == null) {
                    ArrayList A0I = AnonymousClass001.A0I();
                    this.A00 = A0I;
                    this.A02.A0i(A0I);
                }
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    AnonymousClass141 A0f = C36391kE.A0f(it);
                    UserJid A0l = C36351kA.A0l(A0f);
                    if (A0l != null && !this.A01.A0O(A0l) && (A06 = AnonymousClass3U8.A06(A0l)) != null && A06.equals(str)) {
                        return A0f;
                    }
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass141 r10 = (AnonymousClass141) obj;
        C70283eu r5 = (C70283eu) this.A04.get();
        if (r5 != null) {
            Activity activity = r5.A03;
            if (activity.isFinishing()) {
                return;
            }
            if (r10 != null) {
                C62533Gn r4 = r5.A07;
                r4.A01(r10, activity.getString(R.string.f12nameremoved));
                String string = activity.getString(R.string.f12nameremoved);
                AnonymousClass3YE r2 = new AnonymousClass3YE(r5, r10, 33);
                AnonymousClass00C.A0D(string, 0);
                TextView textView = r4.A03;
                textView.setText(string);
                textView.setVisibility(0);
                textView.setOnClickListener(r2);
                return;
            }
            String str = r5.A02;
            AnonymousClass19A r7 = r5.A09;
            C21159AAt aAt = r5.A08;
            C50152kI r22 = new C50152kI(r5.A05, r5.A06, r5, aAt, r7, str);
            r5.A01 = r22;
            C36331k8.A1F(r22, r5.A0A);
        }
    }

    public C49472jB(AnonymousClass1NG r2, AnonymousClass16D r3, C70283eu r4, String str) {
        this.A04 = AnonymousClass001.A0F(r4);
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
    }
}
