package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.0YC  reason: invalid class name */
public final class AnonymousClass0YC {
    public static AnonymousClass0YC A05;
    public static final Object A06 = new Object();
    public final Context A00;
    public final ArrayList A01 = AnonymousClass001.A0I();
    public final HashMap A02 = AnonymousClass001.A0J();
    public final Handler A03;
    public final HashMap A04 = AnonymousClass001.A0J();

    public static AnonymousClass0YC A00(Context context) {
        AnonymousClass0YC r1;
        synchronized (A06) {
            r1 = A05;
            if (r1 == null) {
                r1 = new AnonymousClass0YC(context.getApplicationContext());
                A05 = r1;
            }
        }
        return r1;
    }

    public void A01(BroadcastReceiver broadcastReceiver) {
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            ArrayList arrayList = (ArrayList) hashMap.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C06530Ty r7 = (C06530Ty) arrayList.get(size);
                    r7.A01 = true;
                    for (int i = 0; i < r7.A02.countActions(); i++) {
                        String action = r7.A02.getAction(i);
                        HashMap hashMap2 = this.A04;
                        ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C06530Ty r1 = (C06530Ty) arrayList2.get(size2);
                                if (r1.A03 == broadcastReceiver) {
                                    r1.A01 = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                hashMap2.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public void A02(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            C06530Ty r5 = new C06530Ty(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) hashMap.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                hashMap.put(broadcastReceiver, arrayList);
            }
            arrayList.add(r5);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                HashMap hashMap2 = this.A04;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    hashMap2.put(action, arrayList2);
                }
                arrayList2.add(r5);
            }
        }
    }

    public void A03(Intent intent) {
        String str;
        synchronized (this.A02) {
            Intent intent2 = intent;
            String action = intent2.getAction();
            String resolveTypeIfNeeded = intent2.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent2.getData();
            String scheme = intent2.getScheme();
            Set<String> categories = intent2.getCategories();
            boolean z = false;
            if ((intent2.getFlags() & 8) != 0) {
                z = true;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Resolving type ");
                A0u.append(resolveTypeIfNeeded);
                A0u.append(" scheme ");
                A0u.append(scheme);
                Log.v("LocalBroadcastManager", AnonymousClass000.A0l(intent2, " of intent ", A0u));
            }
            ArrayList arrayList = (ArrayList) this.A04.get(intent2.getAction());
            if (arrayList != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", AnonymousClass000.A0l(arrayList, "Action list: ", AnonymousClass000.A0u()));
                }
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    C06530Ty r4 = (C06530Ty) arrayList.get(i);
                    if (z) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("Matching against filter ");
                        Log.v("LocalBroadcastManager", AnonymousClass000.A0o(r4.A02, A0u2));
                    }
                    if (!r4.A00) {
                        String str2 = resolveTypeIfNeeded;
                        int match = r4.A02.match(action, str2, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                StringBuilder A0u3 = AnonymousClass000.A0u();
                                A0u3.append("  Filter matched!  match=0x");
                                Log.v("LocalBroadcastManager", AnonymousClass000.A0q(Integer.toHexString(match), A0u3));
                            }
                            if (arrayList2 == null) {
                                arrayList2 = AnonymousClass001.A0I();
                            }
                            arrayList2.add(r4);
                            r4.A00 = true;
                        } else if (z) {
                            if (match == -4) {
                                str = "category";
                            } else if (match == -3) {
                                str = "action";
                            } else if (match == -2) {
                                str = "data";
                            } else if (match != -1) {
                                str = "unknown reason";
                            } else {
                                str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                            }
                            Log.v("LocalBroadcastManager", AnonymousClass000.A0p("  Filter did not match: ", str, AnonymousClass000.A0u()));
                        }
                    } else if (z) {
                        Log.v("LocalBroadcastManager", "  Filter's target already added");
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C06530Ty) arrayList2.get(i2)).A00 = false;
                    }
                    this.A01.add(new C06060Sd(intent2, arrayList2));
                    Handler handler = this.A03;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    public AnonymousClass0YC(Context context) {
        this.A00 = context;
        this.A03 = new AnonymousClass0E5(context.getMainLooper(), this);
    }
}
