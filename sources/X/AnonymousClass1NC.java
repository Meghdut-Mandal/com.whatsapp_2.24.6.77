package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.1NC  reason: invalid class name */
public class AnonymousClass1NC {
    public static Intent A00(Context context) {
        return new Intent("android.intent.action.VIEW").setClassName(context.getPackageName(), "com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity");
    }
}
