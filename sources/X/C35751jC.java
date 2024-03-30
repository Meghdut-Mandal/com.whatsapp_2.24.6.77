package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.Jid;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.voipcalling.JNIUtils;
import com.whatsapp.wds.components.fab.WDSFab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1jC  reason: invalid class name and case insensitive filesystem */
public class C35751jC implements Runnable {
    public Object A00;
    public final int A01;

    public C35751jC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void run() {
        List list;
        switch (this.A01) {
            case 0:
                AnonymousClass1E9 r5 = (AnonymousClass1E9) this.A00;
                C20810yC r9 = r5.A03;
                C21000yV r6 = C21000yV.A02;
                int A002 = C20800yB.A00(r6, r9, 908);
                AnonymousClass1EB r8 = r5.A06;
                AnonymousClass00T r7 = r8.A01;
                boolean z = false;
                if (A002 > ((SharedPreferences) r7.getValue()).getInt("tos_fetch_iteration", 0)) {
                    z = true;
                }
                if (!C20800yB.A01(r6, r9, 877)) {
                    list = new ArrayList();
                } else if (z) {
                    list = r5.A0B;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = ((SharedPreferences) r7.getValue()).getLong("request_refresh_rate_seconds", 864000000);
                    ArrayList arrayList = new ArrayList();
                    for (String str : r5.A0B) {
                        AnonymousClass00C.A0D(str, 0);
                        StringBuilder sb = new StringBuilder();
                        sb.append("tos_last_refresh_timestamp_");
                        sb.append(str);
                        long j2 = ((SharedPreferences) r7.getValue()).getLong(sb.toString(), -1);
                        if (j2 != -1) {
                            if (currentTimeMillis - j2 >= j) {
                                boolean A0L = r5.A01.A0L();
                                int A003 = r8.A00(str);
                                if (A0L) {
                                    if (A003 == 1) {
                                    }
                                } else if (A003 != 0) {
                                }
                            }
                        }
                        arrayList.add(str);
                    }
                    list = arrayList;
                }
                if (list.isEmpty()) {
                    r5.A07.A01();
                    return;
                }
                C76703pJ r92 = new C76703pJ(r5.A02, r5.A04, new AnonymousClass3EI(r5, list, A002, z), list);
                if (!r92.A00.A09()) {
                    r92.A02.A00(-1);
                    return;
                }
                AnonymousClass19A r82 = r92.A01;
                String A09 = r82.A09();
                List<String> list2 = r92.A03;
                ArrayList arrayList2 = new ArrayList(AnonymousClass03U.A06(list2, 10));
                for (String r1 : list2) {
                    arrayList2.add(new C203399nx("notice", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, r1)}));
                }
                r82.A0F(r92, new C203399nx(new C203399nx("request", (AnonymousClass1AL[]) null, (C203399nx[]) arrayList2.toArray(new C203399nx[0])), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09), new AnonymousClass1AL("xmlns", "tos"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get")}), A09, 282, 32000);
                return;
            case 1:
                for (C88614Tj Bjj : ((C29011Uz) this.A00).A09) {
                    Bjj.Bjj(-1);
                }
                return;
            case 2:
                for (C88614Tj Bjk : ((C29011Uz) this.A00).A09) {
                    Bjk.Bjk();
                }
                return;
            case 3:
                ((UpdatesFragment) this.A00).A0Q = null;
                return;
            case 4:
                UpdatesFragment.A03((UpdatesFragment) this.A00);
                return;
            case 5:
                UpdatesFragment updatesFragment = (UpdatesFragment) this.A00;
                AnonymousClass01I A0h = updatesFragment.A0h();
                if (A0h != null && !A0h.isFinishing() && updatesFragment.A12() && UpdatesFragment.A09(updatesFragment)) {
                    C19420v0.A00(updatesFragment.A1a()).putBoolean("updates_tab_see_all_status_tooltip_shown", true).apply();
                    WaTextView waTextView = updatesFragment.A0C;
                    if (waTextView != null) {
                        waTextView.setVisibility(0);
                    }
                    WaTextView waTextView2 = updatesFragment.A0C;
                    if (waTextView2 != null) {
                        waTextView2.startAnimation(AnimationUtils.loadAnimation(updatesFragment.A0a(), R.anim.f1nameremoved));
                    }
                    updatesFragment.A1Z().A0I(new C35751jC(updatesFragment, 4), 4000);
                    return;
                }
                return;
            case 6:
                UpdatesFragment updatesFragment2 = (UpdatesFragment) this.A00;
                if (updatesFragment2.A12()) {
                    UpdatesFragment.A05(updatesFragment2);
                    return;
                }
                return;
            case 7:
                UpdatesFragment updatesFragment3 = (UpdatesFragment) this.A00;
                if (!((SharedPreferences) updatesFragment3.A1a().A00.get()).getBoolean("channels_media_visibility_updated", false)) {
                    AnonymousClass1CR r62 = updatesFragment3.A0P;
                    if (r62 != null) {
                        ArrayList A0V = r62.A0V();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = A0V.iterator();
                        while (it.hasNext()) {
                            String str2 = ((AnonymousClass3LI) it.next()).A0F;
                            if (C28981Uw.A03.A01(str2) != null) {
                                arrayList3.add(str2);
                            }
                        }
                        String[] strArr = new String[arrayList3.size()];
                        arrayList3.toArray(strArr);
                        AnonymousClass72Z r12 = new AnonymousClass72Z(strArr, 975);
                        AnonymousClass1M0 A04 = r62.A0P().A04();
                        try {
                            Iterator it2 = r12.iterator();
                            while (it2.hasNext()) {
                                String[] strArr2 = (String[]) it2.next();
                                C224114e r3 = A04.A02;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("jid IN ");
                                sb2.append(AnonymousClass1M2.A00(strArr2.length));
                                r3.A03("settings", sb2.toString(), "removeNewsletterMediaVisibility/DELETE_NEWSLETTER_SETTINGS", strArr2);
                            }
                            A04.close();
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                r62.A0I.remove(it3.next());
                            }
                            C19420v0.A00(updatesFragment3.A1a()).putBoolean("channels_media_visibility_updated", true).apply();
                            return;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                            throw th;
                        }
                    } else {
                        AnonymousClass00C.A0G("chatSettingsStore");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                } else {
                    return;
                }
            case 8:
                UpdatesFragment.A00((UpdatesFragment) this.A00);
                return;
            case 9:
                AnonymousClass1Q0 r13 = (AnonymousClass1Q0) this.A00;
                C132476Tw r0 = r13.A01;
                if (r0 != null) {
                    r0.A06();
                    r13.A01 = null;
                    return;
                }
                return;
            case 10:
                ((AnonymousClass1SV) this.A00).A0B();
                return;
            case 11:
                ((C123495wb) this.A00).A02.BXv();
                return;
            case 12:
                C34081gQ.A02((View) this.A00);
                return;
            case 13:
                ((JNIUtils) this.A00).m6lambda$updateH26XCodecSupported$0$comwhatsappvoipcallingJNIUtils();
                return;
            case 14:
                ((Activity) this.A00).isFinishing();
                return;
            case 15:
                return;
            case 16:
                String str3 = AnonymousClass1UC.A07;
                ((AnonymousClass1UC) this.A00).A09();
                return;
            case 17:
                WDSFab.A01((WDSFab) this.A00);
                return;
            case 18:
                Iterable<AnonymousClass3HN> observers = ((AnonymousClass1UM) this.A00).A01.getObservers();
                AnonymousClass00C.A08(observers);
                for (AnonymousClass3HN A02 : observers) {
                    A02.A02();
                }
                return;
            case 19:
                Iterable<AnonymousClass3HN> observers2 = ((AnonymousClass1UM) this.A00).A01.getObservers();
                AnonymousClass00C.A08(observers2);
                for (AnonymousClass3HN A03 : observers2) {
                    A03.A03();
                }
                return;
            case 20:
                ((AnonymousClass1UZ) this.A00).A04("BACKGROUND_APP");
                return;
            case 21:
                AnonymousClass19O r02 = (AnonymousClass19O) this.A00;
                AnonymousClass00C.A0D(r02, 0);
                r02.A0H.set(0);
                return;
            default:
                AnonymousClass1W5 r14 = (AnonymousClass1W5) this.A00;
                AnonymousClass00C.A0D(r14, 0);
                AnonymousClass1W5.A00(r14, r14.A00);
                return;
        }
    }
}
