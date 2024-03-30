package androidx.sharetarget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0X5;
import X.AnonymousClass72R;
import X.C114445hG;
import X.C120715rx;
import X.C120725ry;
import X.C129806In;
import X.C1507176i;
import X.C163757qi;
import X.C36371kC;
import X.C36441kJ;
import X.C90474aD;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ChooserTargetServiceCompat extends ChooserTargetService {
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Bitmap bitmap;
        C120715rx r0;
        Context applicationContext = getApplicationContext();
        if (C129806In.A01 == null) {
            synchronized (C129806In.A00) {
                if (C129806In.A01 == null) {
                    ArrayList A0I = AnonymousClass001.A0I();
                    Intent A0I2 = C36441kJ.A0I("android.intent.action.MAIN");
                    A0I2.addCategory("android.intent.category.LAUNCHER");
                    A0I2.setPackage(applicationContext.getPackageName());
                    List<ResolveInfo> queryIntentActivities = applicationContext.getPackageManager().queryIntentActivities(A0I2, 128);
                    if (queryIntentActivities != null) {
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            Bundle bundle = activityInfo.metaData;
                            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                                ArrayList A0I3 = AnonymousClass001.A0I();
                                XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(applicationContext.getPackageManager(), "android.app.shortcuts");
                                if (loadXmlMetaData == null) {
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("Failed to open android.app.shortcuts meta-data resource of ");
                                    throw AnonymousClass000.A0c(activityInfo.name, A0u);
                                }
                                while (true) {
                                    try {
                                        int next = loadXmlMetaData.next();
                                        if (next == 1) {
                                            break;
                                        } else if (next == 2 && loadXmlMetaData.getName().equals("share-target")) {
                                            String A00 = C129806In.A00(loadXmlMetaData, "targetClass");
                                            ArrayList A0I4 = AnonymousClass001.A0I();
                                            ArrayList A0I5 = AnonymousClass001.A0I();
                                            while (true) {
                                                int next2 = loadXmlMetaData.next();
                                                if (next2 != 1) {
                                                    if (next2 != 2) {
                                                        if (next2 == 3 && C90474aD.A1V("share-target", loadXmlMetaData)) {
                                                            break;
                                                        }
                                                    } else {
                                                        String name = loadXmlMetaData.getName();
                                                        if (name.equals("data")) {
                                                            C129806In.A00(loadXmlMetaData, "scheme");
                                                            C129806In.A00(loadXmlMetaData, "host");
                                                            C129806In.A00(loadXmlMetaData, "port");
                                                            C129806In.A00(loadXmlMetaData, "path");
                                                            C129806In.A00(loadXmlMetaData, "pathPattern");
                                                            C129806In.A00(loadXmlMetaData, "pathPrefix");
                                                            A0I4.add(new C114445hG(C129806In.A00(loadXmlMetaData, "mimeType")));
                                                        } else if (name.equals("category")) {
                                                            A0I5.add(C129806In.A00(loadXmlMetaData, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            if (A0I4.isEmpty() || A00 == null || A0I5.isEmpty()) {
                                                r0 = null;
                                            } else {
                                                r0 = new C120715rx(A00, (C114445hG[]) A0I4.toArray(new C114445hG[A0I4.size()]), C36371kC.A1b(A0I5, A0I5.size()));
                                            }
                                            if (r0 != null) {
                                                A0I3.add(r0);
                                            }
                                        }
                                    } catch (Exception e) {
                                        Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
                                    }
                                }
                                loadXmlMetaData.close();
                                A0I.addAll(A0I3);
                            }
                        }
                    }
                    C129806In.A01 = A0I;
                }
            }
        }
        ArrayList arrayList = C129806In.A01;
        ArrayList A0I6 = AnonymousClass001.A0I();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C120715rx r4 = (C120715rx) it.next();
            if (r4.A00.equals(componentName.getClassName())) {
                C114445hG[] r3 = r4.A01;
                int length = r3.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(r3[i].A00)) {
                        A0I6.add(r4);
                        break;
                    }
                    i++;
                }
            }
        }
        if (!A0I6.isEmpty()) {
            ShortcutInfoCompatSaverImpl instance = ShortcutInfoCompatSaverImpl.getInstance(applicationContext);
            try {
                List<AnonymousClass0X5> A02 = instance.A02();
                if (A02 != null && !A02.isEmpty()) {
                    ArrayList A0I7 = AnonymousClass001.A0I();
                    for (AnonymousClass0X5 r5 : A02) {
                        Iterator it2 = A0I6.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C120715rx r42 = (C120715rx) it2.next();
                            if (r5.A0N.containsAll(Arrays.asList(r42.A02))) {
                                A0I7.add(new AnonymousClass72R(new ComponentName(applicationContext.getPackageName(), r42.A00), r5));
                                break;
                            }
                        }
                    }
                    if (A0I7.isEmpty()) {
                        return AnonymousClass001.A0I();
                    }
                    Collections.sort(A0I7);
                    ArrayList A0I8 = AnonymousClass001.A0I();
                    float f = 1.0f;
                    int i2 = ((AnonymousClass72R) C36441kJ.A12(A0I7)).A01.A0E;
                    Iterator it3 = A0I7.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass72R r6 = (AnonymousClass72R) it3.next();
                        AnonymousClass0X5 r7 = r6.A01;
                        Icon icon = null;
                        try {
                            C120725ry r8 = (C120725ry) instance.A05.submit(new C1507176i(instance, r7.A0M)).get();
                            iconCompat = null;
                            if (r8 != null) {
                                String str = r8.A02;
                                if (!TextUtils.isEmpty(str)) {
                                    int i3 = 0;
                                    try {
                                        i3 = instance.A00.getResources().getIdentifier(str, (String) null, (String) null);
                                    } catch (Exception unused) {
                                    }
                                    if (i3 != 0) {
                                        Context context = instance.A00;
                                        Objects.requireNonNull(context);
                                        iconCompat = IconCompat.A02(context.getResources(), context.getPackageName(), i3);
                                    }
                                }
                                if (!TextUtils.isEmpty(r8.A01) && (bitmap = (Bitmap) instance.A06.submit(new C163757qi(instance, r8, 0)).get()) != null) {
                                    iconCompat = IconCompat.A03(bitmap);
                                }
                            }
                        } catch (Exception e2) {
                            Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e2);
                            iconCompat = null;
                        }
                        Bundle A07 = AnonymousClass001.A07();
                        A07.putString("android.intent.extra.shortcut.ID", r7.A0M);
                        int i4 = r7.A0E;
                        if (i2 != i4) {
                            f -= 0.01f;
                            i2 = i4;
                        }
                        CharSequence charSequence = r7.A0K;
                        if (iconCompat != null) {
                            icon = iconCompat.A08();
                        }
                        A0I8.add(new ChooserTarget(charSequence, icon, f, r6.A00, A07));
                    }
                    return A0I8;
                }
            } catch (Exception e3) {
                Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e3);
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }
}
