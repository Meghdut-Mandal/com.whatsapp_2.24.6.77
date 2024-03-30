package X;

import android.content.SharedPreferences;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Pt  reason: invalid class name and case insensitive filesystem */
public class C131616Pt {
    public C106725Lc A00;
    public final C002000v A01;

    public Object A01(C125475zy r10, String str) {
        C118005nB A002 = A00(str);
        AnonymousClass6S9 r7 = (AnonymousClass6S9) A002.A00.A04(r10.A00());
        if (r7 != null) {
            long j = r7.A01;
            if (j == -1 || System.currentTimeMillis() < r7.A00 + j) {
                Object obj = r7.A02;
                if (obj != null) {
                    return obj;
                }
            } else {
                A03(r10, str);
            }
        }
        return null;
    }

    public void A02(C125475zy r13, AnonymousClass6S9 r14, String str) {
        C107815Qz r2;
        OutputStreamWriter outputStreamWriter;
        String str2;
        String str3 = str;
        A00(str).A00.A08(r13.A00(), r14);
        Object obj = r14.A02;
        if ((obj instanceof String) && r14.A03) {
            C106725Lc r1 = this.A00;
            String A002 = r13.A00();
            AnonymousClass00C.A0D(str, 0);
            AnonymousClass6S8 r4 = r1.A01;
            C1496071z A003 = AnonymousClass6S8.A00(r4);
            if (A003 == null) {
                str2 = "BkCacheSaveOnDiskHelper/saveOnDisk disk cache is not setup for bk cache";
            } else if (obj == null) {
                str2 = "BkCacheSaveOnDiskHelper/saveOnDisk invalid value in CacheValue";
            } else {
                try {
                    C1269666k A004 = C1496071z.A00(A003, C90464aC.A0d(str, A002));
                    String str4 = (String) obj;
                    OutputStreamWriter outputStreamWriter2 = null;
                    try {
                        r2 = A004.A00();
                        try {
                            outputStreamWriter = new OutputStreamWriter(r2, C1496071z.A0E);
                        } catch (Throwable th) {
                            th = th;
                            C1496071z.A06(outputStreamWriter2);
                            C1496071z.A06(r2);
                            throw th;
                        }
                        try {
                            outputStreamWriter.write(str4);
                            C1496071z.A06(outputStreamWriter);
                            C1496071z.A06(r2);
                            A004.A01();
                            r4.A00.put(C90464aC.A0d(str, A002), new AnonymousClass63N(r14.A01, str3, r14.A00, A002));
                            AnonymousClass6S8.A01(r4);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            outputStreamWriter2 = outputStreamWriter;
                            C1496071z.A06(outputStreamWriter2);
                            C1496071z.A06(r2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = null;
                        C1496071z.A06(outputStreamWriter2);
                        C1496071z.A06(r2);
                        throw th;
                    }
                } catch (IOException unused) {
                    Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to save the bk-cache");
                    return;
                }
            }
            Log.e(str2);
        }
    }

    public C131616Pt(C106725Lc r22) {
        InputStreamReader inputStreamReader;
        C93284gJ r1 = new C93284gJ(10);
        this.A01 = r1;
        r1.A00 = AnonymousClass717.A00;
        C106725Lc r12 = r22;
        this.A00 = r12;
        r12.A00 = new C117995nA(this);
        AnonymousClass6S8 r8 = r12.A01;
        C1496071z A002 = AnonymousClass6S8.A00(r8);
        if (A002 != null) {
            HashMap A0J = AnonymousClass001.A0J();
            try {
                SharedPreferences A003 = r8.A01.A00("bloks");
                AnonymousClass00C.A08(A003);
                JSONArray jSONArray = new JSONArray(A003.getString("bk_cache_lookup_map", "{}"));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String obj = jSONArray.get(i).toString();
                    if (!(obj == null || obj.length() == 0)) {
                        try {
                            JSONObject A1C = C36441kJ.A1C(obj);
                            String string = A1C.getString("shard-key");
                            String string2 = A1C.getString("entry-key");
                            long j = A1C.getLong("expiration-time");
                            long j2 = A1C.getLong("create-time");
                            AnonymousClass00C.A0B(string);
                            AnonymousClass00C.A0B(string2);
                            AnonymousClass63N r14 = new AnonymousClass63N(j, string, j2, string2);
                            if (System.currentTimeMillis() > r14.A01 + r14.A00) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append(r14.A03);
                                A0u.append(':');
                                String A0q = AnonymousClass000.A0q(r14.A02, A0u);
                                C1496071z A004 = AnonymousClass6S8.A00(r8);
                                if (A004 == null) {
                                    Log.e("BkCacheSaveOnDiskHelper/removeOnDisk disk cache is not setup for bk cache");
                                } else {
                                    try {
                                        A004.A0C(A0q);
                                    } catch (IOException unused) {
                                        Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to remove the bk-cache");
                                    }
                                }
                            } else {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append(r14.A03);
                                A0u2.append(':');
                                A0J.put(AnonymousClass000.A0q(r14.A02, A0u2), r14);
                            }
                        } catch (JSONException unused2) {
                            Log.e("BkCacheSaveOnDiskHelper:BkCacheValueHelper/fromJsonString threw exception");
                        }
                    }
                }
            } catch (JSONException unused3) {
                Log.e("BkCacheSaveOnDiskHelper/syncLookUpMapToDisk parsing lookUpMap from disk threw exception");
            }
            r8.A00 = A0J;
            AnonymousClass6S8.A01(r8);
            Iterator A0z = AnonymousClass000.A0z(r8.A00);
            while (A0z.hasNext()) {
                AnonymousClass63N r7 = (AnonymousClass63N) A0z.next();
                try {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    String str = r7.A03;
                    A0u3.append(str);
                    A0u3.append(':');
                    C1494971l A0B = A002.A0B(AnonymousClass000.A0q(r7.A02, A0u3));
                    if (A0B != null) {
                        inputStreamReader = new InputStreamReader(A0B.A00[0], C1496071z.A0E);
                        StringWriter stringWriter = new StringWriter();
                        char[] cArr = new char[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                        while (true) {
                            int read = inputStreamReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            stringWriter.write(cArr, 0, read);
                        }
                        String obj2 = stringWriter.toString();
                        inputStreamReader.close();
                        if (!(obj2 == null || obj2.length() == 0)) {
                            A02(new AnonymousClass5OG(r7), new AnonymousClass6S9((Object) obj2, r7.A01, r7.A00), str);
                        }
                    } else {
                        Log.i("BkCacheSaveOnDiskHelper/initDiskCache snapshot is null");
                    }
                } catch (IOException unused4) {
                    Log.e("BkCacheSaveOnDiskHelper/initDiskCache unable to fetch content from disk");
                } catch (Throwable th) {
                    inputStreamReader.close();
                    throw th;
                }
            }
        }
    }

    private C118005nB A00(String str) {
        C118005nB r0;
        C002000v r3 = this.A01;
        C118005nB r02 = (C118005nB) r3.A04(str);
        if (r02 != null) {
            return r02;
        }
        synchronized (r3) {
            r0 = (C118005nB) r3.A04(str);
            if (r0 == null) {
                C106725Lc r03 = this.A00;
                int A02 = AnonymousClass1K2.A02(r03.A02, r03.A03);
                int i = 50;
                if (A02 < 2016) {
                    i = 10;
                    if (A02 >= 2014) {
                        i = 30;
                    }
                }
                r0 = new C118005nB(str, i);
                r3.A08(str, r0);
            }
        }
        return r0;
    }

    public void A03(C125475zy r6, String str) {
        C118005nB r0 = (C118005nB) this.A01.A04(str);
        if (r0 != null) {
            r0.A00.A05(r6.A00());
        }
        C106725Lc r1 = this.A00;
        String A002 = r6.A00();
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass6S8 r3 = r1.A01;
        String A0f = C90464aC.A0f(A002, AnonymousClass000.A0v(str), ':');
        C1496071z A003 = AnonymousClass6S8.A00(r3);
        if (A003 == null) {
            Log.e("BkCacheSaveOnDiskHelper/removeOnDisk disk cache is not setup for bk cache");
        } else {
            try {
                A003.A0C(A0f);
            } catch (IOException unused) {
                Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to remove the bk-cache");
            }
        }
        r3.A00.remove(C90464aC.A0f(A002, AnonymousClass000.A0v(str), ':'));
        AnonymousClass6S8.A01(r3);
    }
}
