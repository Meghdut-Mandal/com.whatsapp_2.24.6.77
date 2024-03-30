package X;

import android.app.Activity;
import android.content.Intent;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9TL  reason: invalid class name */
public final class AnonymousClass9TL {
    public final AnonymousClass9P6 A00;

    public final List A00(List list) {
        boolean z;
        AnonymousClass00C.A0D(list, 0);
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SplitInfo splitInfo = (SplitInfo) it.next();
            ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
            AnonymousClass00C.A08(primaryActivityStack);
            boolean z2 = false;
            try {
                z = primaryActivityStack.isEmpty();
            } catch (NoSuchMethodError unused) {
                z = false;
            }
            List activities = primaryActivityStack.getActivities();
            AnonymousClass00C.A08(activities);
            C62723Hh r3 = new C62723Hh(activities, z);
            ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
            AnonymousClass00C.A08(secondaryActivityStack);
            try {
                z2 = secondaryActivityStack.isEmpty();
            } catch (NoSuchMethodError unused2) {
            }
            List activities2 = secondaryActivityStack.getActivities();
            AnonymousClass00C.A08(activities2);
            A0J.add(new C63033Im(r3, new C62723Hh(activities2, z2), splitInfo.getSplitRatio()));
        }
        return A0J;
    }

    public final Set A01(Set set) {
        Class<?> cls;
        SplitPairRule build;
        AnonymousClass9P6 r7 = this.A00;
        try {
            cls = r7.A00.loadClass("java.util.function.Predicate");
            AnonymousClass00C.A08(cls);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return C004702c.A00;
        }
        ArrayList A0J = C36321k7.A0J(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C53012qZ r9 = (C53012qZ) it.next();
            if (r9 instanceof AnonymousClass80X) {
                AnonymousClass80X r92 = (AnonymousClass80X) r9;
                Constructor<SplitPairRule.Builder> constructor = SplitPairRule.Builder.class.getConstructor(new Class[]{cls, cls, cls});
                Set set2 = r92.A00;
                Class<Activity> cls2 = Activity.class;
                AnonymousClass80U r4 = new AnonymousClass80U(new C22546AoW(set2), C36441kJ.A1A(cls2), C36441kJ.A1A(cls2));
                ClassLoader classLoader = r7.A00;
                SplitPairRule.Builder finishSecondaryWithPrimary = constructor.newInstance(new Object[]{C165587tf.A0e(classLoader, "java.util.function.Predicate", r4, new Class[1]), C165587tf.A0e(classLoader, "java.util.function.Predicate", new AnonymousClass80U(new C22545AoV(set2), C36441kJ.A1A(cls2), C36441kJ.A1A(Intent.class)), new Class[1]), r7.A00(new C22304AkS(r92), C36441kJ.A1A(WindowMetrics.class))}).setSplitRatio(0.4f).setLayoutDirection(3).setShouldClearTop(r92.A01).setFinishPrimaryWithSecondary(0).setFinishSecondaryWithPrimary(1);
                AnonymousClass00C.A08(finishSecondaryWithPrimary);
                build = finishSecondaryWithPrimary.build();
            } else if (r9 instanceof AnonymousClass80Y) {
                AnonymousClass80Y r93 = (AnonymousClass80Y) r9;
                Class<Intent> cls3 = Intent.class;
                Constructor<SplitPlaceholderRule.Builder> constructor2 = SplitPlaceholderRule.Builder.class.getConstructor(new Class[]{cls3, cls, cls, cls});
                Set set3 = r93.A01;
                SplitPlaceholderRule.Builder finishPrimaryWithSecondary = constructor2.newInstance(new Object[]{r93.A00, r7.A00(new C22302AkQ(set3), C36441kJ.A1A(Activity.class)), r7.A00(new C22303AkR(set3), C36441kJ.A1A(cls3)), r7.A00(new C22304AkS(r93), C36441kJ.A1A(WindowMetrics.class))}).setSplitRatio(0.4f).setLayoutDirection(3).setSticky(false).setFinishPrimaryWithSecondary(1);
                AnonymousClass00C.A08(finishPrimaryWithSecondary);
                build = finishPrimaryWithSecondary.build();
            } else if (r9 instanceof C42861zc) {
                Constructor<ActivityRule.Builder> constructor3 = ActivityRule.Builder.class.getConstructor(new Class[]{cls, cls});
                Set set4 = ((C42861zc) r9).A00;
                build = constructor3.newInstance(new Object[]{r7.A00(new C22302AkQ(set4), C36441kJ.A1A(Activity.class)), r7.A00(new C22303AkR(set4), C36441kJ.A1A(Intent.class))}).setShouldAlwaysExpand(true).build();
            } else {
                throw AnonymousClass001.A08("Unsupported rule type");
            }
            AnonymousClass00C.A08(build);
            A0J.add(build);
        }
        return C007103b.A0f(A0J);
    }

    public AnonymousClass9TL(AnonymousClass9P6 r1) {
        this.A00 = r1;
    }
}
