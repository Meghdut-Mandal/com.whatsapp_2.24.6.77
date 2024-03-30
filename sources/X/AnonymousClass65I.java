package X;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.65I  reason: invalid class name */
public class AnonymousClass65I {
    public AnonymousClass7e7 A00;
    public List A01 = AnonymousClass001.A0I();
    public Set A02;
    public Set A03 = C36441kJ.A17();
    public Executor A04;
    public Executor A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public final Context A09;
    public final AnonymousClass609 A0A = new AnonymousClass609();
    public final String A0B;
    public final List A0C = AnonymousClass001.A0I();
    public final List A0D = AnonymousClass001.A0I();

    public AnonymousClass65I(Context context, String str) {
        this.A09 = context;
        this.A0B = str;
    }

    public void A00(AnonymousClass61V... r5) {
        Set set = this.A02;
        if (set == null) {
            set = C36441kJ.A16();
            this.A02 = set;
        }
        AnonymousClass61V r2 = r5[0];
        set.add(Integer.valueOf(r2.A01));
        Set set2 = this.A02;
        AnonymousClass00C.A0B(set2);
        set2.add(Integer.valueOf(r2.A00));
        this.A0A.A00((AnonymousClass61V[]) Arrays.copyOf(r5, 1));
    }
}
