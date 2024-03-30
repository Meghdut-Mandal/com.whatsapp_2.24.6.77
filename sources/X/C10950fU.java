package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0fU  reason: invalid class name and case insensitive filesystem */
public final class C10950fU implements Iterable {
    public final Context A00;
    public final ArrayList A01 = AnonymousClass001.A0I();

    public static void A01(Context context, Intent[] intentArr) {
        context.startActivities(intentArr, (Bundle) null);
    }

    public void A02() {
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            A01(this.A00, intentArr);
            return;
        }
        throw AnonymousClass001.A09("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public void A03(Activity activity) {
        Intent intent;
        if (((activity instanceof AnonymousClass01K) && (intent = AnonymousClass050.A00((Activity) ((AnonymousClass01K) activity))) != null) || (intent = AnonymousClass050.A00(activity)) != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.A00.getPackageManager());
            }
            ArrayList arrayList = this.A01;
            int size = arrayList.size();
            try {
                Context context = this.A00;
                for (Intent A002 = A00(component, context); A002 != null; A002 = A00(A002.getComponent(), context)) {
                    arrayList.add(size, A002);
                }
                arrayList.add(intent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Deprecated
    public Iterator iterator() {
        return this.A01.iterator();
    }

    public C10950fU(Context context) {
        this.A00 = context;
    }

    public static Intent A00(ComponentName componentName, Context context) {
        String A012 = AnonymousClass050.A01(componentName, context);
        if (A012 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), A012);
        if (AnonymousClass050.A01(componentName2, context) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }
}
