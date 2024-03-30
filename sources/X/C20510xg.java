package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0xg  reason: invalid class name and case insensitive filesystem */
public class C20510xg implements AnonymousClass00M {
    public static final AnonymousClass1AL[] A0H = new AnonymousClass1AL[0];
    public final C19700wN A00;
    public final C19970wo A01;
    public final AnonymousClass12O A02;
    public final C20810yC A03;
    public final C230717b A04;
    public final AnonymousClass19A A05;
    public final AnonymousClass1AQ A06;
    public final C19770wU A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;
    public final AnonymousClass005 A0C;
    public final AnonymousClass005 A0D;
    public final Map A0E = new HashMap();
    public final Set A0F = Collections.synchronizedSet(new HashSet());
    public final AnonymousClass1AO A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r3 = r6.A00;
        r1 = new java.lang.StringBuilder();
        r1.append(r8);
        r1.append(" - ");
        r1.append(r9);
        r3.A0E("GroupLidInfra/addressing_mode_mismatch", r1.toString(), false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.AnonymousClass147 r7, java.lang.String r8, int r9) {
        /*
            r6 = this;
            r0 = 5
            if (r0 == r9) goto L_0x0006
            r0 = 6
            if (r0 != r9) goto L_0x0050
        L_0x0006:
            java.util.Set r5 = r6.A0F
            monitor-enter(r5)
            boolean r0 = r5.contains(r7)     // Catch:{ all -> 0x0032 }
            r4 = 0
            if (r0 == 0) goto L_0x002d
            X.0wN r3 = r6.A00     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "GroupLidInfra/one_in_flight_group_info_mismatch"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            r1.append(r8)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = " - "
            r1.append(r0)     // Catch:{ all -> 0x0032 }
            r1.append(r9)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0032 }
            r3.A0E(r2, r0, r4)     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            return
        L_0x002d:
            r5.add(r7)     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            goto L_0x0035
        L_0x0032:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            throw r0
        L_0x0035:
            X.0wN r3 = r6.A00
            java.lang.String r2 = "GroupLidInfra/addressing_mode_mismatch"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r0 = " - "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r3.A0E(r2, r0, r4)
        L_0x0050:
            X.3S5 r0 = new X.3S5
            r0.<init>(r8, r9)
            r6.A09(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20510xg.A0E(X.147, java.lang.String, int):void");
    }

    public static void A01(C162227oF r16, C20510xg r17, AnonymousClass147 r18, C236119d r19, String str, List list, int i, boolean z) {
        AnonymousClass147 r2;
        Jid jid;
        Jid jid2;
        StringBuilder sb = new StringBuilder();
        sb.append("GroupXmppMethods/");
        String str2 = str;
        sb.append(str2);
        Log.i(sb.toString());
        C236119d r12 = r19;
        if (r19 != null) {
            C20510xg r13 = r17;
            AnonymousClass19A r15 = r13.A05;
            String A092 = r15.A09();
            List list2 = list;
            int size = list2.size();
            C203399nx[] r8 = new C203399nx[size];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                r2 = r18;
                if (i2 >= size) {
                    break;
                }
                ArrayList arrayList = new ArrayList();
                Jid jid3 = (Jid) list2.get(i2);
                if (((AnonymousClass17X) r13.A0A.get()).A0B(r2)) {
                    C162227oF r22 = r16;
                    if (AnonymousClass143.A0I(jid3)) {
                        jid2 = (Jid) r22.inverse().get(jid3);
                        jid = jid3;
                    } else {
                        jid = (Jid) r22.get(jid3);
                        jid2 = jid3;
                    }
                    if (jid == null || jid2 == null) {
                        i3++;
                    } else {
                        arrayList.add(new AnonymousClass1AL(jid2, "phone_number"));
                        jid3 = jid;
                    }
                }
                arrayList.add(0, new AnonymousClass1AL(jid3, "jid"));
                r8[i2] = new C203399nx("participant", (AnonymousClass1AL[]) arrayList.toArray(new AnonymousClass1AL[arrayList.size()]));
                i2++;
            }
            if (i3 > 0) {
                C19700wN r3 = r13.A00;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Added ");
                sb2.append(size);
                sb2.append(" participants and ");
                sb2.append(i3);
                sb2.append(" mapping missing");
                r3.A0E("GroupLidInfra/add_participant_normalization", sb2.toString(), false);
            }
            C203399nx r32 = new C203399nx(str2, (AnonymousClass1AL[]) null, r8);
            AnonymousClass1AL[] r4 = {new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1AL((Jid) r2, "to")};
            if (z) {
                r32 = new C203399nx(r32, "admin", (AnonymousClass1AL[]) null);
            }
            C76603p9 r162 = new C76603p9(r13, r12, str2);
            r15.A0K(r162, new C203399nx(r32, "iq", r4), A092, i, 32000);
        }
    }

    public static void A02(C20510xg r9, AnonymousClass147 r10, AnonymousClass4RS r11, Runnable runnable, String str, AnonymousClass1AL[] r14, int i) {
        AnonymousClass19A r5 = r9.A05;
        String A092 = r5.A09();
        C203399nx r2 = new C203399nx(str, r14);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092));
        arrayList.add(new AnonymousClass1AL("xmlns", "w:g2"));
        arrayList.add(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        arrayList.add(new AnonymousClass1AL((Jid) r10, "to"));
        r5.A0K(new C76663pF(r9, r11, runnable, str), new C203399nx(r2, "iq", (AnonymousClass1AL[]) arrayList.toArray(A0H)), A092, i, 32000);
    }

    public C99424tL A03(AnonymousClass4U4 r19, C605738j r20) {
        AnonymousClass19A r11 = this.A05;
        String A092 = r11.A09();
        C605738j r8 = r20;
        C203399nx r13 = new C203399nx(new C203399nx(new C203399nx("add_request", new AnonymousClass1AL[]{new AnonymousClass1AL("code", r8.A03), new AnonymousClass1AL("expiration", Long.toString(r8.A00)), new AnonymousClass1AL((Jid) r8.A02, "admin")}), "query", (AnonymousClass1AL[]) null), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL((Jid) r8.A01, "to")});
        C99424tL r0 = new C99424tL();
        r11.A0E(new C65843Tr(r0, this, r19, 1), r13, A092, 208, 32000);
        return r0;
    }

    public C99424tL A04(AnonymousClass4U4 r14, String str) {
        AnonymousClass19A r6 = this.A05;
        String A092 = r6.A09();
        C203399nx r8 = new C203399nx(new C203399nx("invite", new AnonymousClass1AL[]{new AnonymousClass1AL("code", str)}), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL((Jid) C177578e1.A00, "to")});
        C99424tL r1 = new C99424tL();
        r6.A0F(new C65843Tr(r1, this, r14, 0), r8, A092, 107, 32000);
        return r1;
    }

    public C99424tL A05(AnonymousClass4U6 r14, AnonymousClass147 r15, String str, String str2, String str3) {
        AnonymousClass19A r6 = this.A05;
        String A092 = r6.A09();
        ArrayList arrayList = new ArrayList();
        String str4 = str;
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(new AnonymousClass1AL("prev", str4));
        }
        String str5 = str2;
        if (!TextUtils.isEmpty(str5)) {
            arrayList.add(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5));
        }
        String str6 = str3;
        C203399nx r4 = null;
        if (TextUtils.isEmpty(str6)) {
            arrayList.add(new AnonymousClass1AL("delete", "true"));
        } else {
            r4 = new C203399nx("body", str6, (AnonymousClass1AL[]) null);
        }
        C203399nx r8 = new C203399nx(new C203399nx(r4, "description", (AnonymousClass1AL[]) arrayList.toArray(A0H)), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1AL((Jid) r15, "to")});
        C99424tL r0 = new C99424tL();
        r6.A0E(new C65843Tr(r0, this, r14, 3), r8, A092, 134, 32000);
        return r0;
    }

    public C99424tL A06(AnonymousClass32N r23, AnonymousClass147 r24, List list) {
        C203399nx[] r7;
        AnonymousClass19A r15 = this.A05;
        String A092 = r15.A09();
        List list2 = list;
        if (list2.size() > 0) {
            int size = list2.size();
            r7 = new C203399nx[size];
            for (int i = 0; i < size; i++) {
                r7[i] = new C203399nx("participant", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) list2.get(i), "jid")});
            }
        } else {
            r7 = null;
        }
        AnonymousClass147 r13 = r24;
        C203399nx r0 = new C203399nx(new C203399nx("revoke", (AnonymousClass1AL[]) null, r7), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1AL((Jid) r13, "to")});
        C99424tL r10 = new C99424tL();
        r15.A0E(new C65823Tp(r10, this, r23, r13, 0), r0, A092, 210, 32000);
        return r10;
    }

    public C99424tL A07(C87944Qu r28, AnonymousClass4RS r29, C605738j r30) {
        C605738j r0 = r30;
        AnonymousClass147 r12 = r0.A01;
        AnonymousClass19A r14 = this.A05;
        String A092 = r14.A09();
        C99424tL r9 = new C99424tL();
        String str = r0.A03;
        long j = r0.A00;
        Long valueOf = Long.valueOf(j);
        UserJid userJid = r0.A02;
        AnonymousClass6QB r02 = new AnonymousClass6QB("iq");
        r02.A04(new AnonymousClass1AL("xmlns", "w:g2"));
        r02.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C203539oF.A0N(r12, "to")) {
            r02.A04(new AnonymousClass1AL((Jid) r12, "to"));
        }
        if (C203539oF.A0P(A092, 0, 9007199254740991L, false)) {
            r02.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092));
        }
        AnonymousClass6QB r1 = new AnonymousClass6QB("accept");
        if (C203539oF.A0P(str, 16, 16, false)) {
            r1.A04(new AnonymousClass1AL("code", str));
        }
        if (C203539oF.A0L(valueOf, 0, 9007199254740991L, false)) {
            r1.A04(new AnonymousClass1AL("expiration", j));
        }
        if (C203539oF.A0N(userJid, "accept->admin")) {
            r1.A04(new AnonymousClass1AL((Jid) userJid, "admin"));
        }
        r02.A05(r1.A03());
        r14.A0E(new C76733pM(r9, this, r28, r12, r29), r02.A03(), A092, 209, 32000);
        return r9;
    }

    public C99424tL A08(C87944Qu r17, AnonymousClass4RS r18, String str) {
        AnonymousClass19A r9 = this.A05;
        String A092 = r9.A09();
        C203399nx r11 = new C203399nx(new C203399nx("invite", new AnonymousClass1AL[]{new AnonymousClass1AL("code", str)}), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1AL((Jid) C177578e1.A00, "to")});
        C99424tL r4 = new C99424tL();
        r9.A0E(new C65823Tp(r4, this, r17, r18, 1), r11, A092, C65953Uc.A03, 32000);
        return r4;
    }

    public void A09(AnonymousClass3S5 r19, AnonymousClass147 r20) {
        AnonymousClass1AL[] r2;
        AnonymousClass147 r4 = r20;
        if (!this.A06.A00.A02(r4)) {
            Log.w("GroupXmppMethods/skip sendGetGroupInfo");
            return;
        }
        String str = "GroupXmppMethods/sendGetGroupInfo";
        AnonymousClass3S5 r5 = r19;
        String str2 = r5.A01;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('/');
            sb.append(str2);
            str = sb.toString();
        }
        Log.w(str);
        AnonymousClass19A r11 = this.A05;
        String A092 = r11.A09();
        this.A0E.put(r4, Long.valueOf(C19970wo.A00(this.A01)));
        String str3 = r5.A02;
        if (str2 != null) {
            r2 = str3 != null ? new AnonymousClass1AL[]{new AnonymousClass1AL("request", str2), new AnonymousClass1AL("phash", str3)} : new AnonymousClass1AL[]{new AnonymousClass1AL("request", str2)};
        } else {
            r2 = null;
        }
        r11.A0K(new C65843Tr(r4, this, r5, 5), new C203399nx(new C203399nx("query", r2), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL((Jid) r4, "to")}), A092, 20, 32000);
    }

    public void A0A(AnonymousClass23D r19) {
        Log.i("GroupXmppMethod/sendLeaveGroup");
        AnonymousClass19A r11 = this.A05;
        String A092 = r11.A09();
        AnonymousClass23D r4 = r19;
        AnonymousClass147 r2 = r4.A03;
        if (r11.A0K(new C76673pG(this, r4, r4, r4.A06), new C203399nx(new C203399nx("leave", (AnonymousClass1AL[]) null, new C203399nx[]{new C203399nx("group", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) r2, (String) PublicKeyCredentialControllerUtility.JSON_KEY_ID)})}), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1AL((Jid) C177578e1.A00, "to")}), A092, 16, 32000)) {
            this.A0G.A00(r2, 5);
            this.A07.Boy(new C35721j9(this, r4, 25));
        }
    }

    public void A0B(AnonymousClass23D r13) {
        AnonymousClass19A r5 = this.A05;
        String A092 = r5.A09();
        C203399nx r7 = new C203399nx(new C203399nx("subject", r13.A04, (AnonymousClass1AL[]) null), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1AL((Jid) r13.A03, "to")});
        C65843Tr r6 = new C65843Tr(r13, this, r13, 4);
        Log.i("GroupXmppMethods/sendSetGroupSubject");
        r5.A0K(r6, r7, A092, 17, 32000);
    }

    public void A0C(AnonymousClass23D r8, AnonymousClass147 r9, int i) {
        AnonymousClass1AL[] r5;
        int i2;
        String str;
        if (i > 0) {
            r5 = new AnonymousClass1AL[]{new AnonymousClass1AL("expiration", i)};
            i2 = 224;
            str = "ephemeral";
        } else {
            r5 = null;
            i2 = 224;
            str = "not_ephemeral";
        }
        A02(this, r9, r8, r8, str, r5, i2);
        StringBuilder sb = new StringBuilder();
        sb.append("GroupXmppMethods/set-ephemeral-setting; ephemeralDuration=");
        sb.append(i);
        Log.i(sb.toString());
    }

    public void A0D(AnonymousClass4TC r19, C605738j r20) {
        AnonymousClass19A r11 = this.A05;
        String A092 = r11.A09();
        C605738j r6 = r20;
        r11.A0E(new C65843Tr(r6, this, r19, 2), new C203399nx(new C203399nx(new C203399nx("add_request", new AnonymousClass1AL[]{new AnonymousClass1AL("code", r6.A03), new AnonymousClass1AL("expiration", Long.toString(r6.A00)), new AnonymousClass1AL((Jid) r6.A02, "admin")}), "picture", (AnonymousClass1AL[]) null), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:profile:picture"), new AnonymousClass1AL((Jid) r6.A01, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get")}), A092, 212, 32000);
    }

    public C20510xg(C19700wN r2, AnonymousClass1AO r3, C19970wo r4, AnonymousClass12O r5, C20810yC r6, C230717b r7, AnonymousClass19A r8, AnonymousClass1AQ r9, C19770wU r10, AnonymousClass005 r11, AnonymousClass005 r12, AnonymousClass005 r13, AnonymousClass005 r14, AnonymousClass005 r15, AnonymousClass005 r16) {
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = r2;
        this.A07 = r10;
        this.A05 = r8;
        this.A04 = r7;
        this.A09 = r11;
        this.A02 = r5;
        this.A0G = r3;
        this.A06 = r9;
        this.A08 = r12;
        this.A0C = r13;
        this.A0B = r14;
        this.A0A = r15;
        this.A0D = r16;
    }

    public static C203399nx A00(String str, List list) {
        int size = list.size();
        C203399nx[] r6 = new C203399nx[size];
        for (int i = 0; i < size; i++) {
            r6[i] = new C203399nx("participant", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) list.get(i), "jid")});
        }
        return new C203399nx(str, (AnonymousClass1AL[]) null, r6);
    }
}
