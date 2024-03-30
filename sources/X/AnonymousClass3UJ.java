package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3UJ  reason: invalid class name */
public abstract class AnonymousClass3UJ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.content.Intent[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A01(android.content.IntentSender r6, java.lang.CharSequence r7, java.util.List r8) {
        /*
            r5 = 0
            java.lang.Object r2 = r8.get(r5)
            android.content.Intent r2 = (android.content.Intent) r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x002c
            if (r6 == 0) goto L_0x002c
            android.content.Intent r4 = android.content.Intent.createChooser(r2, r7, r6)
        L_0x0013:
            int r3 = X.C36431kI.A07(r8)
            if (r3 <= 0) goto L_0x002b
            android.content.Intent[] r2 = new android.content.Intent[r3]
        L_0x001b:
            int r1 = r5 + 1
            java.lang.Object r0 = r8.get(r1)
            r2[r5] = r0
            r5 = r1
            if (r1 < r3) goto L_0x001b
            java.lang.String r0 = "android.intent.extra.INITIAL_INTENTS"
            r4.putExtra(r0, r2)
        L_0x002b:
            return r4
        L_0x002c:
            android.content.Intent r4 = android.content.Intent.createChooser(r2, r7)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UJ.A01(android.content.IntentSender, java.lang.CharSequence, java.util.List):android.content.Intent");
    }

    public static Intent A00(Intent intent, C64933Qa r5) {
        if (!intent.hasExtra("fMessageKeyJid") && !intent.hasExtra("fMessageKeyFromMe") && !intent.hasExtra("fMessageKeyId")) {
            return intent.putExtra("fMessageKeyId", r5.A01).putExtra("fMessageKeyFromMe", r5.A02).putExtra("fMessageKeyJid", AnonymousClass143.A03(r5.A00));
        }
        throw AnonymousClass001.A08("Intent already contains key.");
    }

    public static C64933Qa A02(Intent intent) {
        if (!intent.hasExtra("fMessageKeyJid") || !intent.hasExtra("fMessageKeyFromMe") || !intent.hasExtra("fMessageKeyId")) {
            return null;
        }
        return new C64933Qa(C36401kF.A0Z(intent, "fMessageKeyJid"), intent.getStringExtra("fMessageKeyId"), C36421kH.A1T(intent, "fMessageKeyFromMe"));
    }

    public static ArrayList A05(Bundle bundle) {
        if (!bundle.containsKey("fMessageKeyJidArray") || !bundle.containsKey("fMessageKeyFromMeArray") || !bundle.containsKey("fMessageKeyIdArray")) {
            return null;
        }
        String[] stringArray = bundle.getStringArray("fMessageKeyIdArray");
        C18740tg.A06(stringArray);
        boolean[] booleanArray = bundle.getBooleanArray("fMessageKeyFromMeArray");
        C18740tg.A06(booleanArray);
        String[] stringArray2 = bundle.getStringArray("fMessageKeyJidArray");
        C18740tg.A06(stringArray2);
        int length = stringArray.length;
        ArrayList A14 = C36441kJ.A14(length);
        for (int i = 0; i < length; i++) {
            A14.add(new C64933Qa(C36421kH.A0N(stringArray2[i]), stringArray[i], booleanArray[i]));
        }
        return A14;
    }

    public static void A06(Activity activity) {
        try {
            Intent A0I = C36441kJ.A0I("android.settings.APPLICATION_DETAILS_SETTINGS");
            A0I.setData(Uri.fromParts("package", "com.whatsapp", (String) null));
            activity.startActivity(A0I);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(C36441kJ.A0I("android.settings.SETTINGS"));
        }
    }

    public static void A07(Activity activity) {
        try {
            Intent A0I = C36441kJ.A0I("android.settings.APP_NOTIFICATION_SETTINGS");
            A0I.putExtra("android.provider.extra.APP_PACKAGE", "com.whatsapp");
            activity.startActivity(A0I);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(C36441kJ.A0I("android.settings.SETTINGS"));
        }
    }

    public static void A08(Bundle bundle, C64933Qa r2) {
        A09(bundle, r2, "");
    }

    public static void A0A(Bundle bundle, Collection collection) {
        if (bundle.containsKey("fMessageKeyJidArray") || bundle.containsKey("fMessageKeyFromMeArray") || bundle.containsKey("fMessageKeyIdArray")) {
            throw AnonymousClass001.A08("Bundle already contains list of keys.");
        }
        String[] strArr = new String[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        String[] strArr2 = new String[collection.size()];
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C64933Qa r1 = (C64933Qa) it.next();
            strArr[i] = r1.A01;
            zArr[i] = r1.A02;
            strArr2[i] = AnonymousClass143.A03(r1.A00);
            i++;
        }
        bundle.putStringArray("fMessageKeyIdArray", strArr);
        bundle.putBooleanArray("fMessageKeyFromMeArray", zArr);
        bundle.putStringArray("fMessageKeyJidArray", strArr2);
    }

    public static C64933Qa A03(Bundle bundle, String str) {
        String A0q = AnonymousClass000.A0q("fMessageKeyJid", AnonymousClass000.A0v(str));
        String A0q2 = AnonymousClass000.A0q("fMessageKeyFromMe", AnonymousClass000.A0v(str));
        String A0q3 = AnonymousClass000.A0q("fMessageKeyId", AnonymousClass000.A0v(str));
        if (!bundle.containsKey(A0q) || !bundle.containsKey(A0q2) || !bundle.containsKey(A0q3)) {
            return null;
        }
        return new C64933Qa(C36351kA.A0i(bundle, A0q), bundle.getString(A0q3), bundle.getBoolean(A0q2, false));
    }

    public static C64933Qa A04(AnonymousClass02E r1) {
        return A03(r1.A0b(), "");
    }

    public static void A09(Bundle bundle, C64933Qa r5, String str) {
        String A0q = AnonymousClass000.A0q("fMessageKeyJid", AnonymousClass000.A0v(str));
        String A0q2 = AnonymousClass000.A0q("fMessageKeyFromMe", AnonymousClass000.A0v(str));
        String A0q3 = AnonymousClass000.A0q("fMessageKeyId", AnonymousClass000.A0v(str));
        if (bundle.containsKey(A0q3) || bundle.containsKey(A0q2) || bundle.containsKey(A0q3)) {
            throw AnonymousClass001.A08("Bundle already contains key.");
        }
        bundle.putString(A0q3, r5.A01);
        bundle.putBoolean(A0q2, r5.A02);
        bundle.putString(A0q, AnonymousClass143.A03(r5.A00));
    }
}
