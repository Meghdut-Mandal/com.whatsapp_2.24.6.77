package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.2jE  reason: invalid class name and case insensitive filesystem */
public final class C49502jE extends C132446Tt {
    public final C19630wG A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass00T A02 = C36431kI.A1I(new C83874Bb(this));
    public final AnonymousClass00T A03 = C36431kI.A1I(new C83884Bc(this));
    public final C006302t A04;

    public C49502jE(AnonymousClass012 r2, C19630wG r3, C006302t r4, int i) {
        super(r2, true);
        this.A00 = r3;
        this.A04 = r4;
        this.A01 = C36431kI.A1I(new C83864Ba(i));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        this.A04.invoke(obj);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass00T r8 = this.A02;
        AnonymousClass00T r7 = this.A01;
        List<ResolveInfo> queryIntentActivities = ((PackageManager) C36381kD.A0p(r8)).queryIntentActivities((Intent) r7.getValue(), 0);
        ArrayList<ResolveInfo> A13 = C36411kG.A13(queryIntentActivities);
        for (ResolveInfo next : queryIntentActivities) {
            if (next.activityInfo.exported) {
                A13.add(next);
            }
        }
        if (A13.isEmpty()) {
            return C023409w.A00;
        }
        Drawable A002 = AnonymousClass00E.A00(this.A00.A00, R.mipmap.icon);
        Objects.requireNonNull(A002, "Icon is NULL");
        int intrinsicHeight = A002.getIntrinsicHeight();
        ArrayList<AnonymousClass011> A0z = C36351kA.A0z(A13);
        for (ResolveInfo resolveInfo : A13) {
            A0z.add(C36441kJ.A19(resolveInfo, resolveInfo.loadIcon((PackageManager) C36381kD.A0p(r8))));
        }
        ArrayList A0z2 = C36351kA.A0z(A0z);
        for (AnonymousClass011 r0 : A0z) {
            AnonymousClass000.A1F(A0z2, ((Drawable) r0.second).getIntrinsicHeight());
        }
        Iterator it = A0z2.iterator();
        while (it.hasNext()) {
            intrinsicHeight = Math.min(intrinsicHeight, C36341k9.A0A(it));
        }
        ArrayList A0z3 = C36351kA.A0z(A0z);
        for (AnonymousClass011 r9 : A0z) {
            ActivityInfo activityInfo = ((ResolveInfo) r9.first).activityInfo;
            AnonymousClass00C.A07(activityInfo);
            Drawable A07 = AnonymousClass3UF.A07((Resources) this.A03.getValue(), (Drawable) r9.second, intrinsicHeight);
            AnonymousClass00C.A08(A07);
            CharSequence loadLabel = ((ResolveInfo) r9.first).loadLabel((PackageManager) C36381kD.A0p(r8));
            AnonymousClass00C.A08(loadLabel);
            A0z3.add(new C601436q((Intent) r7.getValue(), activityInfo, A07, loadLabel));
        }
        return A0z3;
    }
}
