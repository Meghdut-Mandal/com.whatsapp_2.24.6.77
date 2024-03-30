package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.perf.profilo.ProfiloUploadService;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1io  reason: invalid class name and case insensitive filesystem */
public class C35511io implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C35511io(Object obj, Object obj2, String str, int i, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
        this.A00 = i;
    }

    public final void run() {
        int i;
        String str;
        int A002;
        Long l;
        C203119nL r15;
        if (this.A04 != 0) {
            AnonymousClass11e r4 = (AnonymousClass11e) this.A01;
            String str2 = this.A03;
            int i2 = this.A00;
            Runnable runnable = (Runnable) this.A02;
            if (r4.A00 != -1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C18720te r6 = r4.A0H;
                long j = elapsedRealtime - r6.A01;
                long uptimeMillis = SystemClock.uptimeMillis() - r6.A02;
                if (r4.A0A) {
                    if (r4.A07 != null) {
                        HashMap hashMap = new HashMap(4);
                        hashMap.put("from", r4.A08);
                        hashMap.put("to", str2);
                        r4.A05.A01(r4.A07, hashMap, r4.A00);
                        r4.A04.A01();
                    }
                    int i3 = r4.A00;
                    if (C200699i4.A00 == 2 && (r15 = C203119nL.A0A) != null) {
                        C203119nL.A03(r15, C197679cB.A02, 1, 0, (long) i3);
                    }
                    Context context = r4.A0D.A00;
                    Class<ProfiloUploadService> cls = ProfiloUploadService.class;
                    AnonymousClass0DY.A00(context, new Intent(context, cls), cls, 8);
                }
                if (r4.A06 != null) {
                    AnonymousClass11h A012 = r4.A0E.A01("app-startup");
                    if (r4.A06 != null) {
                        AnonymousClass11k r7 = new AnonymousClass11k();
                        r7.A01 = Integer.valueOf(r4.A01);
                        r7.A03 = Long.valueOf(j);
                        r7.A02 = Long.valueOf(uptimeMillis);
                        r7.A00 = Integer.valueOf(i2);
                        r7.A05 = (Long) A012.A02.get("msgstore.db");
                        r7.A06 = (Long) A012.A03.get("msgstore.db");
                        r7.A04 = (Long) A012.A00.get("msgstore.db");
                        if (A012.A04) {
                            Map map = A012.A01;
                            int A003 = C20800yB.A00(C21000yV.A02, r4.A0F, 4216);
                            if (A003 >= 0 && (l = r7.A06) != null && l.longValue() > ((long) A003)) {
                                StringBuilder sb = new StringBuilder();
                                for (Map.Entry entry : map.entrySet()) {
                                    if (((String) entry.getKey()).startsWith("w-") || ((String) entry.getKey()).startsWith("m-")) {
                                        sb.append((String) entry.getKey());
                                        sb.append(":");
                                        sb.append(entry.getValue());
                                        sb.append(";");
                                    }
                                }
                                r4.A0C.A0E("startup-db-writes", sb.toString(), false);
                            }
                        }
                        r4.A0G.Blz(r7, r4.A06.intValue());
                    }
                }
                if (r4.A01 == 1 && (A002 = C20800yB.A00(C21000yV.A02, r4.A0F, 1626)) > 0) {
                    long j2 = (long) A002;
                    if (j >= j2) {
                        AnonymousClass2PC r1 = new AnonymousClass2PC();
                        r1.A02 = "app_launch";
                        r1.A00 = Long.valueOf(j);
                        r1.A01 = Long.valueOf(j2);
                        r4.A0G.Blv(r1);
                    }
                }
                AnonymousClass2QQ r8 = new AnonymousClass2QQ();
                int i4 = r4.A01;
                int i5 = 1;
                if (i4 != 2) {
                    i = 3;
                    if (i4 != 3) {
                        i = 1;
                    }
                } else {
                    i = 2;
                }
                if (i2 == 2) {
                    i5 = 2;
                } else if (i2 == 3) {
                    i5 = 3;
                }
                r8.A01 = Integer.valueOf(i);
                r8.A03 = Long.valueOf(j);
                r8.A02 = Long.valueOf(uptimeMillis);
                r8.A00 = Integer.valueOf(i5);
                r4.A0G.Blx(r8, r4.A02);
                r4.A0N.Boy(new C35731jA((Object) r4, 3));
                C21700zf r5 = r4.A03;
                if (r5 != null) {
                    if (i2 == 1) {
                        str = "chat_list";
                    } else if (i2 == 2) {
                        str = "chat";
                    } else if (i2 != 4) {
                        str = "";
                    } else {
                        str = "call";
                    }
                    r5.A0A("destination", str, true);
                    r4.A03.A07("render");
                }
                r4.A00 = -1;
                r4.A08 = null;
                r4.A0A = false;
                r4.A07 = null;
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        C34671hS r52 = (C34671hS) this.A01;
        String str3 = this.A03;
        int i6 = this.A00;
        C34621hN r12 = r52.A00;
        r12.A09.A0H(new C35261iP((Object) r52, i6, 5, (Object) r12.A0J.A02((AnonymousClass11F) this.A02, str3)));
    }
}
