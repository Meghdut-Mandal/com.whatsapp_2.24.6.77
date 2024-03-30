package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6uV  reason: invalid class name and case insensitive filesystem */
public final class C145776uV implements C159467jP {
    public FileStash A00;
    public final C1028051z A01;
    public final C132066Rz A02;

    public static final synchronized void A00(C145776uV r12) {
        Throwable th;
        synchronized (r12) {
            if (!C224714l.A02() && r12.A00 == null) {
                C132066Rz r9 = r12.A02;
                C98504rX A002 = C131716Qg.A00(111);
                C124605yU r1 = new C124605yU();
                r1.A03 = "wa_stash__gif_preview_cache";
                r1.A04 = null;
                C98494rW r0 = C98494rW.A00;
                r1.A02 = r0;
                r1.A00 = A002;
                r1.A01 = null;
                boolean z = r1.A07;
                boolean z2 = r1.A08;
                List list = r1.A06;
                String str = r1.A05;
                AnonymousClass6MU r5 = new AnonymousClass6MU("wa_stash__gif_preview_cache");
                r5.A00(r0);
                if (A002 == null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Config for ");
                    A0u.append("wa_stash__gif_preview_cache");
                    th = AnonymousClass000.A0c(" didn't specify an eviction config. Is this what you want?", A0u);
                } else {
                    r5.A00(new C98534ra(A002, (C98484rV) null, "wa_stash__gif_preview_cache"));
                    C17560rc r4 = r9.A00;
                    C114885hz r2 = new C114885hz();
                    if (str != null) {
                        Map map = r2.A00;
                        if (map == null) {
                            map = AnonymousClass001.A0J();
                            r2.A00 = map;
                        }
                        map.put("__subdir__", str);
                    }
                    File BJG = r4.BJG(new C118645oV(r2), 111);
                    C157957ey r13 = r9.A01;
                    FileStash r6 = new C140876mJ(r13, BJG);
                    if (z) {
                        FileStash r22 = new C98434rQ(RealtimeSinceBootClock.A00, r6);
                        ((C157937ew) r13).BBh(C023109s.A0C).execute(AnonymousClass74N.A00(r9, r22, 2));
                        r6 = r22;
                    }
                    if (z2) {
                        th = AnonymousClass001.A0D();
                    } else {
                        List emptyList = Collections.emptyList();
                        if ((list != null && !list.isEmpty()) || !emptyList.isEmpty()) {
                            ArrayList A0I = AnonymousClass001.A0I();
                            if (list != null) {
                                A0I.addAll(list);
                            }
                            A0I.addAll(emptyList);
                            ArrayList A0I2 = AnonymousClass001.A0I();
                            Iterator it = A0I.iterator();
                            if (it.hasNext()) {
                                it.next();
                                th = AnonymousClass001.A0A("getClass");
                            } else {
                                r6 = new C98424rP(r6, A0I2);
                            }
                        }
                        C132066Rz.A00(r6, r5);
                        r4.BnH(r5, BJG);
                        r12.A00 = r6;
                    }
                }
                throw th;
            }
        }
    }

    public C121635tS B81(String str) {
        File file;
        if (str != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C18750th.A04(str));
            String A0q = AnonymousClass000.A0q(".gif", A0u);
            A00(this);
            C1028051z r7 = this.A01;
            C121635tS A0E = r7.A0E(A0q);
            if (A0E != null || C224714l.A02()) {
                return A0E;
            }
            FileStash fileStash = this.A00;
            if (!(fileStash == null || (file = fileStash.getFile(A0q)) == null)) {
                if (file.length() <= 0) {
                    return A0E;
                }
                byte[] A04 = C25541Gs.A04(file);
                String path = file.getPath();
                AnonymousClass00C.A08(path);
                C121635tS r6 = new C121635tS(path, A04, str);
                r7.A0D(A0q, r6);
                return r6;
            }
        }
        return null;
    }

    public void Bmb(C121635tS r3, String str) {
        if (str != null) {
            A00(this);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C18750th.A04(str));
            this.A01.A0D(AnonymousClass000.A0q(".gif", A0u), r3);
        }
    }

    public C145776uV(AnonymousClass60T r2, C132066Rz r3) {
        C36321k7.A0x(r3, r2);
        this.A02 = r3;
        this.A01 = r2.A00(256);
    }
}
