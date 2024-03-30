package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.16p  reason: invalid class name and case insensitive filesystem */
public class C229516p extends C229416o implements AnonymousClass169 {
    public C19930wk A00;
    public Integer A01;
    public AnonymousClass12g A02;
    public final C19730wQ A03;
    public final C21060yb A04;
    public final C19970wo A05;
    public final C20810yC A06;
    public final C19770wU A07;
    public final AnonymousClass005 A08;
    public final Object A09 = new Object();
    public final C18820ts A0A;
    public final C230116v A0B;

    public AnonymousClass3L0 A0N(UserJid userJid) {
        Cursor A032;
        AnonymousClass3L0 r5 = null;
        if (userJid == null) {
            Log.w("contact-mgr-db/cannot get verified name details by null jid");
            return null;
        }
        AnonymousClass1M0 A033 = this.A00.get();
        try {
            A032 = C229416o.A03(A033, C56732wn.A01, "CONTACT_VNAMES", new String[]{userJid.getRawString()});
            if (!A032.isClosed() && A032.moveToNext()) {
                r5 = C53732rn.A00(A032);
            }
            A032.close();
            A033.close();
            return r5;
        } catch (Throwable th) {
            try {
                A033.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public X.AnonymousClass141 A0O(com.whatsapp.jid.Jid r10) {
        /*
            r9 = this;
            r5 = 0
            if (r10 != 0) goto L_0x0009
            java.lang.String r0 = "contact-mgr-db/cannot get contact by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r5
        L_0x0009:
            r0 = 1
            X.14g r4 = new X.14g
            r4.<init>((boolean) r0)
            r4.A03()
            r3 = 0
            X.16r r0 = r9.A00     // Catch:{ IllegalStateException -> 0x0069 }
            X.1M0 r8 = r0.get()     // Catch:{ IllegalStateException -> 0x0069 }
            java.lang.String r2 = X.AnonymousClass2x7.A04     // Catch:{ all -> 0x005b }
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x005b }
            r1[r3] = r0     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "GET_CONTACT_BY_JID"
            android.database.Cursor r7 = X.C229416o.A03(r8, r2, r0, r1)     // Catch:{ all -> 0x005b }
            r6 = r5
            r2 = 0
        L_0x002c:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0042
            X.141 r1 = X.C53712rl.A00(r7)     // Catch:{ all -> 0x004d }
            int r2 = r2 + 1
            X.141 r5 = A06(r1, r5)     // Catch:{ all -> 0x004d }
            X.3IL r0 = r1.A0F     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x002c
            r6 = r1
            goto L_0x002c
        L_0x0042:
            int r3 = r7.getCount()     // Catch:{ all -> 0x004d }
            r7.close()     // Catch:{ all -> 0x0059 }
            r8.close()     // Catch:{ IllegalStateException -> 0x0067 }
            goto L_0x0071
        L_0x004d:
            r1 = move-exception
            if (r7 == 0) goto L_0x0058
            r7.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0059 }
        L_0x0058:
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            goto L_0x005e
        L_0x005b:
            r1 = move-exception
            r6 = r5
            r2 = 0
        L_0x005e:
            r8.close()     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x0067 }
        L_0x0066:
            throw r1     // Catch:{ IllegalStateException -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            goto L_0x006c
        L_0x0069:
            r1 = move-exception
            r6 = r5
            r2 = 0
        L_0x006c:
            java.lang.String r0 = "contactmanagerdb/getContactByJid/"
            A0L(r1, r0, r3, r2)     // Catch:{ all -> 0x009b }
        L_0x0071:
            if (r6 == 0) goto L_0x0094
            if (r6 == r5) goto L_0x0094
            r3 = r9
            monitor-enter(r3)
            X.0wk r2 = r9.A00     // Catch:{ all -> 0x0086 }
            if (r2 != 0) goto L_0x0089
            X.0wU r1 = r9.A07     // Catch:{ all -> 0x0086 }
            r0 = 0
            X.0wk r2 = new X.0wk     // Catch:{ all -> 0x0086 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0086 }
            r9.A00 = r2     // Catch:{ all -> 0x0086 }
            goto L_0x0089
        L_0x0086:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0089:
            monitor-exit(r3)
            r1 = 43
            X.1j2 r0 = new X.1j2
            r0.<init>(r9, r6, r1)
            r2.execute(r0)
        L_0x0094:
            A0C(r9, r5)
            r4.A00()
            return r5
        L_0x009b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229516p.A0O(com.whatsapp.jid.Jid):X.141");
    }

    public ArrayList A0P() {
        Cursor A032;
        C224214g r5 = new C224214g(true);
        r5.A03();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        try {
            AnonymousClass1M0 A033 = this.A00.get();
            try {
                A032 = C229416o.A03(A033, AnonymousClass2x7.A01, "GET_ALL_GROUP_CHATS", (String[]) null);
                i = A032.getCount();
                while (A032.moveToNext()) {
                    AnonymousClass141 A002 = C53712rl.A00(A032);
                    if (A002.A0H != null) {
                        arrayList.add(A002);
                    }
                }
                A032.close();
                A033.close();
                arrayList.size();
                r5.A00();
                return arrayList;
            } catch (Throwable th) {
                A033.close();
                throw th;
            }
            throw th;
        } catch (IllegalStateException e) {
            A0L(e, "contactmanagerdb/getAllGroupChats/", i, arrayList.size());
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public ArrayList A0Q(AnonymousClass11F r8) {
        Cursor A032;
        C224214g r5 = new C224214g(true);
        r5.A03();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        try {
            AnonymousClass1M0 A033 = this.A00.get();
            try {
                A032 = C229416o.A03(A033, AnonymousClass2x7.A04, "GET_CONTACTS_BY_JID", new String[]{r8.getRawString()});
                i = A032.getCount();
                while (A032.moveToNext()) {
                    AnonymousClass141 A002 = C53712rl.A00(A032);
                    if (A002.A0H != null) {
                        arrayList.add(A002);
                    }
                }
                A032.close();
                A033.close();
                A0F(this, arrayList);
                arrayList.size();
                r5.A00();
                return arrayList;
            } catch (Throwable th) {
                A033.close();
                throw th;
            }
            throw th;
        } catch (IllegalStateException e) {
            A0L(e, "contactmanagerdb/getContactsByJid/", i, arrayList.size());
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A0S(AnonymousClass141 r9) {
        AnonymousClass1M0 A042;
        C224214g r3 = new C224214g(true);
        r3.A03();
        try {
            A042 = this.A00.A04();
            ContentValues contentValues = new ContentValues(6);
            contentValues.put("raw_contact_id", -4L);
            contentValues.put("given_name", r9.A0R);
            contentValues.put("family_name", r9.A0Q);
            contentValues.put("display_name", r9.A0J());
            contentValues.put("is_whatsapp_user", true);
            contentValues.put("wa_name", r9.A0a);
            AnonymousClass11F r0 = r9.A0H;
            C18740tg.A06(r0);
            C229416o.A01(contentValues, A042, "wa_contacts", "jid = ?", new String[]{r0.getRawString()});
            A042.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to update contact ");
            sb.append(r9.A0H);
            C18740tg.A08(sb.toString(), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        ((AnonymousClass2ZF) this.A08.get()).A00(Collections.singletonList(r9));
        r3.A00();
        return;
        throw th;
    }

    public void A0T(AnonymousClass141 r7) {
        AnonymousClass1M0 A042;
        String str;
        C224214g r3 = new C224214g(true);
        r3.A03();
        AnonymousClass11F r2 = r7.A0H;
        if (r2 == null) {
            str = "contact-mgr-db/unable to add unknown contact with null jid";
        } else {
            C19730wQ r1 = this.A03;
            r1.A0G();
            if (r1.A03 == null) {
                str = "contact-mgr-db/unable to add unknown contact due to null me record";
            } else if (r7.A0G() || !r1.A0M(r2)) {
                ContentValues contentValues = new ContentValues(4);
                contentValues.put("jid", r2.getRawString());
                contentValues.put("is_whatsapp_user", true);
                contentValues.put("status", r7.A0X);
                contentValues.put("status_timestamp", Long.valueOf(r7.A0D));
                contentValues.put("status_emoji", r7.A0Y);
                try {
                    A042 = this.A00.A04();
                    r7.A0L(C229416o.A00(contentValues, A042, "wa_contacts"));
                    A042.close();
                    ((AnonymousClass2ZF) this.A08.get()).A00(Collections.singletonList(r7));
                    r3.A00();
                    return;
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("contact-mgr-db/unable to add unknown contact ");
                    sb.append(r7);
                    C18740tg.A08(sb.toString(), e);
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                Log.i("contact-mgr-db/unable to add unknown contact due to matching jid prefix");
                return;
            }
        }
        Log.w(str);
        return;
        throw th;
    }

    public void A0U(AnonymousClass141 r5) {
        C224214g r3 = new C224214g(true);
        r3.A03();
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("display_name", r5.A0J());
        contentValues.put("phone_label", r5.A0V);
        contentValues.put("is_whatsapp_user", Boolean.valueOf(r5.A0z));
        contentValues.put("history_sync_initial_phash", r5.A0S);
        A09(contentValues, this, r5.A0H);
        A0D(this, r5, (AnonymousClass144) r5.A06(AnonymousClass147.class));
        StringBuilder sb = new StringBuilder();
        sb.append("updated group info for jid=");
        sb.append(r5.A0H);
        sb.append(" | time: ");
        sb.append(r3.A00());
        Log.i(sb.toString());
        ((AnonymousClass2ZF) this.A08.get()).A00(Collections.singleton(r5));
    }

    public void A0V(UserJid userJid, String str, long j) {
        AnonymousClass1M0 A042;
        C224214g r5 = new C224214g(true);
        r5.A03();
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("status", str);
        contentValues.put("status_timestamp", Long.valueOf(j));
        boolean z = true;
        try {
            A042 = this.A00.A04();
            C229416o.A01(contentValues, A042, "wa_contacts", "jid = ?", new String[]{userJid.getRawString()});
            A042.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to update contact status ");
            sb.append(userJid);
            sb.append(", statusNull=");
            if (str != null) {
                z = false;
            }
            sb.append(z);
            C18740tg.A08(sb.toString(), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        r5.A00();
        return;
        throw th;
    }

    public /* synthetic */ void BZS(Collection collection) {
    }

    public static AnonymousClass141 A06(AnonymousClass141 r5, AnonymousClass141 r6) {
        AnonymousClass3IL r2;
        AnonymousClass3IL r0;
        if (r6 == null || ((r2 = r6.A0F) == null && r5.A0F != null)) {
            return r5;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("lge") && r2 != null && r2.A00 == -2 && (r0 = r5.A0F) != null && r0.A00 != -2) {
            return r5;
        }
        boolean z = r6.A0z;
        boolean z2 = r5.A0z;
        if (!z) {
            if (z2) {
                return r5;
            }
        } else if (!z2 || r5.A0I() >= r6.A0I()) {
            return r6;
        } else {
            return r5;
        }
        return r6;
    }

    public static ArrayList A07(C229516p r7, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        C19730wQ r0 = r7.A03;
        r0.A0G();
        String A032 = AnonymousClass143.A03(r0.A03);
        String[] strArr = new String[2];
        if (A032 == null) {
            A032 = C177588e2.A00.getRawString();
        }
        strArr[0] = A032;
        strArr[1] = C177638e7.A00.getRawString();
        AnonymousClass1M0 A033 = r7.A00.get();
        try {
            String str2 = AnonymousClass2x7.A07;
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT ");
            sb.append(C73993kt.A00);
            sb.append(" FROM ");
            sb.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
            sb.append(" WHERE ");
            sb.append("is_whatsapp_user = 1");
            sb.append(" AND ");
            sb.append("wa_contacts.jid != 'broadcast'");
            sb.append(" AND ");
            sb.append("wa_contacts.jid IS NOT NULL");
            sb.append(" AND ");
            sb.append("wa_contacts.jid NOT LIKE '%@broadcast'");
            sb.append(" AND ");
            sb.append("wa_contacts.jid NOT LIKE '%@g.us'");
            sb.append(" AND ");
            sb.append("wa_contacts.jid NOT LIKE '%@temp'");
            sb.append(" AND ");
            sb.append("wa_contacts.jid != ?");
            sb.append(" AND ");
            sb.append("wa_contacts.jid != ?");
            sb.append(" AND (");
            sb.append("wa_contacts.raw_contact_id IS NULL OR (wa_contacts.raw_contact_id < 0");
            sb.append(" AND ");
            sb.append("wa_contacts.raw_contact_id != -5");
            sb.append("))");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            if (z) {
                sb2.append(obj);
                str = " AND (wa_contacts.is_sidelist_synced = 1)";
            } else {
                sb2.append(obj);
                str = " AND (wa_contacts.is_sidelist_synced = 0 OR wa_contacts.is_sidelist_synced IS NULL)";
            }
            sb2.append(str);
            Cursor A034 = C229416o.A03(A033, sb2.toString(), "GET_SIDE_LIST_CONTACTS", strArr);
            try {
                int count = A034.getCount();
                while (A034.moveToNext()) {
                    AnonymousClass141 A002 = C53712rl.A00(A034);
                    if (A002.A0H != null) {
                        arrayList.add(A002);
                    }
                }
            } catch (IllegalStateException e) {
                A0L(e, "contactmanagerdb/getSideListContacts/", 0, arrayList.size());
            } catch (Throwable th) {
                if (A034 != null) {
                    A034.close();
                }
                throw th;
            }
            if (A034 != null) {
                A034.close();
            }
            A033.close();
            arrayList.size();
            return arrayList;
        } catch (Throwable th2) {
            try {
                A033.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static HashSet A08(Cursor cursor, String str) {
        HashSet hashSet = new HashSet();
        if (cursor == null) {
            C18740tg.A0D(false, str);
        } else {
            while (cursor.moveToNext()) {
                UserJid A022 = UserJid.Companion.A02(cursor.getString(0));
                if (A022 != null) {
                    hashSet.add(A022);
                }
            }
        }
        return hashSet;
    }

    public static void A09(ContentValues contentValues, C229516p r7, AnonymousClass11F r8) {
        AnonymousClass1M0 A042;
        try {
            A042 = r7.A00.A04();
            String A032 = AnonymousClass143.A03(r8);
            C18740tg.A06(A032);
            C229416o.A01(contentValues, A042, "wa_contacts", "jid = ?", new String[]{A032});
            A042.close();
            return;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to update contact by jid ");
            sb.append(r8);
            C18740tg.A08(sb.toString(), e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void A0A(C229516p r7, C1495671s r8, UserJid userJid) {
        C18740tg.A0C(r8.A01());
        String rawString = userJid.getRawString();
        C18740tg.A06(rawString);
        AnonymousClass1M0 A042 = r7.A00.A04();
        try {
            C229416o.A02(A042, "wa_vnames", "jid = ?", new String[]{rawString});
            C229416o.A02(A042, "wa_vnames_localized", "jid = ?", new String[]{rawString});
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static void A0B(C229516p r3, AnonymousClass141 r4) {
        C1495671s B1k;
        AnonymousClass1M0 A042 = r3.A00.A04();
        try {
            B1k = A042.B1k();
            r3.A0H(B1k, r4, A042);
            B1k.A00();
            B1k.close();
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        throw th;
    }

    public static void A0C(C229516p r1, AnonymousClass141 r2) {
        if (r2 != null) {
            r1.A0K(r2, C18820ts.A01(r1.A0A.A00));
        }
    }

    public static void A0D(C229516p r21, AnonymousClass141 r22, AnonymousClass144 r23) {
        C1495671s B1k;
        AnonymousClass144 r1 = r23;
        if (r23 != null && !(r1 instanceof AnonymousClass146)) {
            try {
                AnonymousClass1M0 A042 = r21.A00.A04();
                try {
                    B1k = A042.B1k();
                    AnonymousClass141 r4 = r22;
                    A0J(B1k, A042, r1, r4.A0K);
                    boolean z = r4.A13;
                    boolean z2 = r4.A0d;
                    boolean z3 = r4.A11;
                    int i = r4.A02;
                    UserJid userJid = r4.A0I;
                    boolean z4 = r4.A0i;
                    boolean z5 = r4.A0r;
                    boolean z6 = r4.A12;
                    int i2 = r4.A04;
                    boolean z7 = r4.A0j;
                    int i3 = r4.A03;
                    boolean z8 = r4.A0u;
                    String str = r4.A0M;
                    boolean z9 = r4.A0p;
                    boolean z10 = r4.A0c;
                    boolean z11 = r4.A0v;
                    boolean z12 = r4.A10;
                    boolean z13 = r4.A0h;
                    boolean z14 = r4.A0e;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("jid", r1.getRawString());
                    contentValues.put("restrict_mode", Boolean.valueOf(z));
                    contentValues.put("announcement_group", Boolean.valueOf(z2));
                    contentValues.put("no_frequently_forwarded", Boolean.valueOf(z3));
                    contentValues.put("ephemeral_duration", Integer.valueOf(i));
                    contentValues.put("creator_jid", AnonymousClass143.A03(userJid));
                    contentValues.put("in_app_support", Boolean.valueOf(z4));
                    contentValues.put("is_suspended", Boolean.valueOf(z5));
                    contentValues.put("require_membership_approval", Boolean.valueOf(z6));
                    contentValues.put("member_add_mode", Integer.valueOf(i2));
                    contentValues.put("incognito", Boolean.valueOf(z7));
                    contentValues.put("group_state", Integer.valueOf(i3));
                    contentValues.put("is_pending_requests_banner_acknowledged", Boolean.valueOf(z8));
                    contentValues.put("addressing_mode", str);
                    contentValues.put("is_report_to_admin_enabled", Boolean.valueOf(z9));
                    contentValues.put("allow_non_admin_subgroup_creation", Boolean.valueOf(z10));
                    contentValues.put("is_pending_suggestions_banner_acknowledged", Boolean.valueOf(z11));
                    contentValues.put("is_name_group_banner_dismissed", Boolean.valueOf(z12));
                    contentValues.put("history_enabled", Boolean.valueOf(z13));
                    contentValues.put("auto_add_disabled", Boolean.valueOf(z14));
                    C229416o.A05(contentValues, A042, "wa_group_admin_settings");
                    B1k.A00();
                    B1k.close();
                    A042.close();
                    return;
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (IllegalArgumentException e) {
                C18740tg.A08("contact-mgr-db/unable to update group settings ", e);
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }

    public static void A0E(C229516p r7, String str, Set set) {
        C1495671s B1k;
        AnonymousClass1M0 A042 = r7.A00.A04();
        try {
            B1k = A042.B1k();
            C229416o.A02(A042, str, (String) null, (String[]) null);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("jid", ((UserJid) it.next()).getRawString());
                C229416o.A00(contentValues, A042, str);
            }
            B1k.A00();
            B1k.close();
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A0F(C229516p r3, Collection collection) {
        Locale A012 = C18820ts.A01(r3.A0A.A00);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            r3.A0K((AnonymousClass141) it.next(), A012);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0211, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0213, code lost:
        r8 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0218, code lost:
        if (r21 != false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x021a, code lost:
        r9 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0222, code lost:
        if (r9.hasNext() == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0224, code lost:
        r1 = (X.AnonymousClass141) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022c, code lost:
        if (r1.A0F != null) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x022e, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("contact-mgr-db/process-contact/removing duplicate contact with null key ");
        r0.append(r1);
        com.whatsapp.util.Log.i(r0.toString());
        r8.add(r1);
        r2.add(r1);
        r3.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x024b, code lost:
        r13 = X.C20800yB.A01(r10, r11, 5868);
        r9 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0259, code lost:
        if (r9.hasNext() == false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0269, code lost:
        if (r4.A0F.equals(((X.AnonymousClass141) r9.next()).A0F) == false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x026b, code lost:
        if (r13 == false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0275, code lost:
        if (r4.A0F.A00 != -5) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0277, code lost:
        r14 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x027f, code lost:
        if (r14.hasNext() == false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0281, code lost:
        r9 = (X.AnonymousClass141) r14.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028f, code lost:
        if (r4.A0F.A00 == -2) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0291, code lost:
        r0 = r9.A0F;
        X.C18740tg.A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x029a, code lost:
        if (r0.A00 != -2) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x029c, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("contact-mgr-db/process-contact/removing sim card duplicate contact ");
        r1.append(r9);
        com.whatsapp.util.Log.i(r1.toString());
        r8.add(r9);
        r2.add(r9);
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02b9, code lost:
        if (r21 != false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02bb, code lost:
        r13 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c3, code lost:
        if (r13.hasNext() == false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c5, code lost:
        r9 = (X.AnonymousClass141) r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02cf, code lost:
        if (r9.A0J() != null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d5, code lost:
        if (r4.A0J() != null) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02df, code lost:
        if (android.text.TextUtils.isEmpty(r9.A0J()) == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e9, code lost:
        if (android.text.TextUtils.isEmpty(r4.A0J()) != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02eb, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("contact-mgr-db/process-contact/deduping null/empty display name contact ");
        r1.append(r9);
        com.whatsapp.util.Log.i(r1.toString());
        r8.add(r9);
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0305, code lost:
        if (r21 != false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x030f, code lost:
        if (android.text.TextUtils.isEmpty(r4.A0J()) == false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0311, code lost:
        r1 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0319, code lost:
        if (r1.hasNext() == false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0329, code lost:
        if (android.text.TextUtils.isEmpty(((X.AnonymousClass141) r1.next()).A0J()) != false) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x032b, code lost:
        com.whatsapp.util.Log.i("contact-mgr-db/process-contact/ignoring empty name since we have non-empty one");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0331, code lost:
        r20 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0339, code lost:
        if (r20.hasNext() == false) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033b, code lost:
        r9 = (X.AnonymousClass141) r20.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0345, code lost:
        if (r9.A0J() == null) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0353, code lost:
        if (r9.A0J().equals(r4.A0J()) == false) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x035f, code lost:
        if (r4.A0I() >= r9.A0I()) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0361, code lost:
        r8.add(r9);
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0367, code lost:
        if (r21 != false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x036d, code lost:
        if (r4.A0J() == null) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x036f, code lost:
        r9 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0377, code lost:
        if (r9.hasNext() == false) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x038b, code lost:
        if (r4.A0J().equals(((X.AnonymousClass141) r9.next()).A0J()) == false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x038e, code lost:
        r3.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0392, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("contact-mgr-db/process-contact/removing duplicate contact with matching key ");
        r1.append(r4);
        com.whatsapp.util.Log.i(r1.toString());
        r2.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03a9, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ab, code lost:
        r22 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03ae, code lost:
        r3.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03b1, code lost:
        r3.removeAll(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b4, code lost:
        if (r22 != false) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03b6, code lost:
        r8 = new java.lang.StringBuilder("existing_contacts: ");
        r1 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03c5, code lost:
        if (r1.hasNext() == false) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c7, code lost:
        r8.append(r1.next());
        r8.append(", ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03d4, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("contact-mgr-db/process-contact/contacts are identical, yet not (");
        r1.append(r8);
        r1.append(" and ");
        r1.append(r4);
        r1.append(')');
        com.whatsapp.util.Log.w(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f5, code lost:
        r25.addAll(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03fc, code lost:
        r0 = new java.util.ArrayList();
        r0.add(r4);
        r12.put(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0410, code lost:
        throw new java.lang.IllegalStateException("same jid contacts must not be empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r23.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0415, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0416, code lost:
        if (r23 != null) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        r23.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x041c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0421, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0423, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0424, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        A0L(r2, "contactmanagerdb/getContactPickerList/", r7, r12.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x042e, code lost:
        r2 = r12.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r5 != 3) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x043a, code lost:
        if (r2.hasNext() != false) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x043c, code lost:
        r29.addAll((java.util.Collection) ((java.util.Map.Entry) r2.next()).getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x044e, code lost:
        A0F(r6, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0457, code lost:
        if (r25.isEmpty() == false) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0459, code lost:
        r3 = r28.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x045d, code lost:
        if (r33 != false) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r2 = r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0464, code lost:
        r2 = r3.B1k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r1 = r25.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0470, code lost:
        if (r1.hasNext() != false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0472, code lost:
        A0I(r2, (X.AnonymousClass141) r1.next(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x047c, code lost:
        r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0486, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r5 != 5) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x048b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0490, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0499, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        r24.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if (r5 == 1) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04ae, code lost:
        r6.A02.A01("contact-mgr-db/getContactPickerList", android.os.SystemClock.uptimeMillis() - r16);
        r29.size();
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r5 == 2) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r4 == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r1 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r5 != 4) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r4 != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r13 == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r0 = X.AnonymousClass2x7.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        if (r7 == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008e, code lost:
        r2 = "wa_contacts INNER JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0090, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("SELECT ");
        r1.append(X.C73993kt.A00);
        r1.append(" FROM ");
        r1.append(r2);
        r1.append(" WHERE ");
        r1.append("is_whatsapp_user");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b2, code lost:
        r2 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        if (r31 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        r0 = " = 0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ba, code lost:
        r0 = " = 1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        r1.append(r0);
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        if (r8 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" AND wa_contacts.jid != ?");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
        if (r9 == false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d8, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" AND (raw_contact_id > 0 OR raw_contact_id = -2 OR raw_contact_id = -3");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e9, code lost:
        if (r4 == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00eb, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" OR wa_contacts.jid LIKE '%@g.us'");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fc, code lost:
        if (r26 == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fe, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" OR raw_contact_id = -4");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        if (r14 == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0111, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" OR is_wa_created_contact = 1");
        r0 = r1.toString();
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" AND sync_policy != 2");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0133, code lost:
        if (r7 == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0135, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" AND verified_level != -1 AND verified_level != 0");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(")");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0157, code lost:
        if (r32 == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0159, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" AND is_starred = 1");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016a, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" ORDER BY display_name, wa_contacts.jid, phone_type ASC");
        r23 = X.C229416o.A03(r24, r1.toString(), "CONTACT_PICKER_LIST", r3);
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0188, code lost:
        if (r23.moveToNext() == false) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018a, code lost:
        r7 = r7 + 1;
        r4 = X.C53712rl.A00(r23);
        r1 = r4.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0192, code lost:
        if (r1 == null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0196, code lost:
        if ((r1 instanceof X.C177528dw) != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019a, code lost:
        if ((r1 instanceof X.AnonymousClass146) != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a0, code lost:
        if (X.AnonymousClass143.A0K(r1) != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a6, code lost:
        if (X.C197029b1.A00(r1) != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a9, code lost:
        if (r5 != 3) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ad, code lost:
        if ((r1 instanceof X.C177538dx) != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b3, code lost:
        if (X.AnonymousClass143.A0I(r1) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b5, code lost:
        if (r26 != false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01be, code lost:
        if (r12.containsKey(r4.A0H) == false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c0, code lost:
        r3 = (java.util.List) r12.get(r1);
        X.C18740tg.A06(r3);
        r2 = new java.util.ArrayList();
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d5, code lost:
        if (r4.A0F != null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01db, code lost:
        if (r3.isEmpty() != false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01dd, code lost:
        r14 = (X.AnonymousClass141) r3.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e5, code lost:
        if (r14.A0F != null) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ed, code lost:
        if (r14.A0B >= r4.A0B) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ef, code lost:
        r3.remove(r14);
        r2.add(r14);
        r3.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f9, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("contact-mgr-db/process-contact/removing duplicate contact with null key ");
        r0.append(r4);
        com.whatsapp.util.Log.i(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x020b, code lost:
        r2.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x020e, code lost:
        r21 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0G(X.C229516p r28, java.util.List r29, int r30, boolean r31, boolean r32, boolean r33) {
        /*
            java.lang.String r15 = "contact-mgr-db/getContactPickerList"
            r2 = 1
            X.14g r27 = new X.14g
            r0 = r27
            r0.<init>((boolean) r2)
            r27.A03()
            r6 = r28
            X.0wQ r0 = r6.A03
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r1 = r0.A03
            X.16v r3 = r6.A0B
            r5 = r30
            if (r5 == r2) goto L_0x0043
            r0 = 2
            if (r5 == r0) goto L_0x003e
            r26 = 0
        L_0x0021:
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            r4 = 0
            if (r1 != 0) goto L_0x0035
            java.lang.String[] r3 = new java.lang.String[r4]
        L_0x002b:
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            long r16 = android.os.SystemClock.uptimeMillis()
            goto L_0x004e
        L_0x0035:
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r0 = r1.getRawString()
            r3[r4] = r0
            goto L_0x002b
        L_0x003e:
            X.0yC r4 = r3.A01
            r3 = 3762(0xeb2, float:5.272E-42)
            goto L_0x0047
        L_0x0043:
            X.0yC r4 = r3.A01
            r3 = 3519(0xdbf, float:4.931E-42)
        L_0x0047:
            X.0yV r0 = X.C21000yV.A02
            boolean r26 = X.C20800yB.A01(r0, r4, r3)
            goto L_0x0021
        L_0x004e:
            X.16r r0 = r6.A00     // Catch:{ IllegalArgumentException -> 0x04a8 }
            r28 = r0
            X.1M0 r24 = r28.get()     // Catch:{ IllegalArgumentException -> 0x04a8 }
            X.0yC r11 = r6.A06     // Catch:{ all -> 0x049e }
            r0 = 5868(0x16ec, float:8.223E-42)
            X.0yV r10 = X.C21000yV.A02     // Catch:{ all -> 0x049e }
            boolean r14 = X.C20800yB.A01(r10, r11, r0)     // Catch:{ all -> 0x049e }
            r0 = 6699(0x1a2b, float:9.387E-42)
            boolean r4 = X.C20800yB.A01(r10, r11, r0)     // Catch:{ all -> 0x049e }
            r0 = 3
            if (r4 == 0) goto L_0x006c
            r4 = 1
            if (r5 == r0) goto L_0x0071
        L_0x006c:
            r4 = 0
            r0 = 5
            r13 = 1
            if (r5 == r0) goto L_0x007a
        L_0x0071:
            r13 = 0
            if (r5 == r2) goto L_0x007a
            r0 = 2
            if (r5 == r0) goto L_0x007a
            r9 = 0
            if (r4 == 0) goto L_0x007b
        L_0x007a:
            r9 = 1
        L_0x007b:
            r8 = 0
            if (r1 == 0) goto L_0x007f
            r8 = 1
        L_0x007f:
            r0 = 4
            r7 = 0
            if (r5 != r0) goto L_0x0084
            r7 = 1
        L_0x0084:
            if (r4 != 0) goto L_0x0089
            r4 = 0
            if (r13 == 0) goto L_0x008a
        L_0x0089:
            r4 = 1
        L_0x008a:
            java.lang.String r0 = X.AnonymousClass2x7.A07     // Catch:{ IllegalStateException -> 0x0423 }
            if (r7 == 0) goto L_0x00b2
            java.lang.String r2 = "wa_contacts INNER JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)"
        L_0x0090:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = "SELECT "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = X.C73993kt.A00     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " FROM "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r2)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " WHERE "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = "is_whatsapp_user"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            goto L_0x00b5
        L_0x00b2:
            java.lang.String r2 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)"
            goto L_0x0090
        L_0x00b5:
            if (r31 == 0) goto L_0x00ba
            java.lang.String r0 = " = 0"
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r0 = " = 1"
        L_0x00bc:
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
            if (r8 == 0) goto L_0x00d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " AND wa_contacts.jid != ?"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
        L_0x00d6:
            if (r9 == 0) goto L_0x0157
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " AND (raw_contact_id > 0 OR raw_contact_id = -2 OR raw_contact_id = -3"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
            if (r4 == 0) goto L_0x00fc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " OR wa_contacts.jid LIKE '%@g.us'"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
        L_0x00fc:
            if (r26 == 0) goto L_0x010f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " OR raw_contact_id = -4"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
        L_0x010f:
            if (r14 == 0) goto L_0x0133
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " OR is_wa_created_contact = 1"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " AND sync_policy != 2"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
        L_0x0133:
            if (r7 == 0) goto L_0x0146
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " AND verified_level != -1 AND verified_level != 0"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
        L_0x0146:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
        L_0x0157:
            if (r32 == 0) goto L_0x016a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " AND is_starred = 1"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
        L_0x016a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0423 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0423 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r0 = " ORDER BY display_name, wa_contacts.jid, phone_type ASC"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r2 = r1.toString()     // Catch:{ IllegalStateException -> 0x0423 }
            java.lang.String r1 = "CONTACT_PICKER_LIST"
            r0 = r24
            android.database.Cursor r23 = X.C229416o.A03(r0, r2, r1, r3)     // Catch:{ IllegalStateException -> 0x0423 }
            r7 = 0
        L_0x0184:
            boolean r0 = r23.moveToNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0411
            int r7 = r7 + 1
            X.141 r4 = X.C53712rl.A00(r23)     // Catch:{ all -> 0x0415 }
            X.11F r1 = r4.A0H     // Catch:{ all -> 0x0415 }
            if (r1 == 0) goto L_0x0184
            boolean r0 = r1 instanceof X.C177528dw     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x0184
            boolean r0 = r1 instanceof X.AnonymousClass146     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x0184
            boolean r0 = X.AnonymousClass143.A0K(r1)     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x0184
            boolean r0 = X.C197029b1.A00(r1)     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x0184
            r0 = 3
            if (r5 != r0) goto L_0x01af
            boolean r0 = r1 instanceof X.C177538dx     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x0184
        L_0x01af:
            boolean r0 = X.AnonymousClass143.A0I(r1)     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x01b8
            if (r26 != 0) goto L_0x01b8
            goto L_0x0184
        L_0x01b8:
            X.11F r0 = r4.A0H     // Catch:{ all -> 0x0415 }
            boolean r0 = r12.containsKey(r0)     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x03fc
            java.lang.Object r3 = r12.get(r1)     // Catch:{ all -> 0x0415 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0415 }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x0415 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0415 }
            r2.<init>()     // Catch:{ all -> 0x0415 }
            X.3IL r0 = r4.A0F     // Catch:{ all -> 0x0415 }
            java.lang.String r13 = "contact-mgr-db/process-contact/removing duplicate contact with null key "
            r1 = 0
            r22 = 1
            if (r0 != 0) goto L_0x0211
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x0409
            java.lang.Object r14 = r3.get(r1)     // Catch:{ all -> 0x0415 }
            X.141 r14 = (X.AnonymousClass141) r14     // Catch:{ all -> 0x0415 }
            X.3IL r0 = r14.A0F     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x01f9
            long r8 = r14.A0B     // Catch:{ all -> 0x0415 }
            long r0 = r4.A0B     // Catch:{ all -> 0x0415 }
            int r18 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r18 >= 0) goto L_0x020b
            r3.remove(r14)     // Catch:{ all -> 0x0415 }
            r2.add(r14)     // Catch:{ all -> 0x0415 }
            r3.add(r4)     // Catch:{ all -> 0x0415 }
            goto L_0x020e
        L_0x01f9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0415 }
            r0.<init>()     // Catch:{ all -> 0x0415 }
            r0.append(r13)     // Catch:{ all -> 0x0415 }
            r0.append(r4)     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0415 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0415 }
        L_0x020b:
            r2.add(r4)     // Catch:{ all -> 0x0415 }
        L_0x020e:
            r21 = 1
            goto L_0x0213
        L_0x0211:
            r21 = 0
        L_0x0213:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0415 }
            r8.<init>()     // Catch:{ all -> 0x0415 }
            if (r21 != 0) goto L_0x03ab
            java.util.Iterator r9 = r3.iterator()     // Catch:{ all -> 0x0415 }
        L_0x021e:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x024b
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0415 }
            X.141 r1 = (X.AnonymousClass141) r1     // Catch:{ all -> 0x0415 }
            X.3IL r0 = r1.A0F     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x021e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0415 }
            r0.<init>()     // Catch:{ all -> 0x0415 }
            r0.append(r13)     // Catch:{ all -> 0x0415 }
            r0.append(r1)     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0415 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0415 }
            r8.add(r1)     // Catch:{ all -> 0x0415 }
            r2.add(r1)     // Catch:{ all -> 0x0415 }
            r3.add(r4)     // Catch:{ all -> 0x0415 }
            goto L_0x03a9
        L_0x024b:
            r0 = 5868(0x16ec, float:8.223E-42)
            boolean r13 = X.C20800yB.A01(r10, r11, r0)     // Catch:{ all -> 0x0415 }
            java.util.Iterator r9 = r3.iterator()     // Catch:{ all -> 0x0415 }
        L_0x0255:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0277
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0415 }
            X.141 r0 = (X.AnonymousClass141) r0     // Catch:{ all -> 0x0415 }
            X.3IL r1 = r4.A0F     // Catch:{ all -> 0x0415 }
            X.3IL r0 = r0.A0F     // Catch:{ all -> 0x0415 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0255
            if (r13 == 0) goto L_0x0392
            X.3IL r0 = r4.A0F     // Catch:{ all -> 0x0415 }
            long r0 = r0.A00     // Catch:{ all -> 0x0415 }
            r13 = -5
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0392
        L_0x0277:
            java.util.Iterator r14 = r3.iterator()     // Catch:{ all -> 0x0415 }
        L_0x027b:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x02b9
            java.lang.Object r9 = r14.next()     // Catch:{ all -> 0x0415 }
            X.141 r9 = (X.AnonymousClass141) r9     // Catch:{ all -> 0x0415 }
            X.3IL r0 = r4.A0F     // Catch:{ all -> 0x0415 }
            long r0 = r0.A00     // Catch:{ all -> 0x0415 }
            r18 = -2
            int r13 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r13 == 0) goto L_0x027b
            X.3IL r0 = r9.A0F     // Catch:{ all -> 0x0415 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0415 }
            long r0 = r0.A00     // Catch:{ all -> 0x0415 }
            int r13 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x027b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0415 }
            r1.<init>()     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = "contact-mgr-db/process-contact/removing sim card duplicate contact "
            r1.append(r0)     // Catch:{ all -> 0x0415 }
            r1.append(r9)     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0415 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0415 }
            r8.add(r9)     // Catch:{ all -> 0x0415 }
            r2.add(r9)     // Catch:{ all -> 0x0415 }
            r21 = 1
            goto L_0x027b
        L_0x02b9:
            if (r21 != 0) goto L_0x038e
            java.util.Iterator r13 = r3.iterator()     // Catch:{ all -> 0x0415 }
        L_0x02bf:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0305
            java.lang.Object r9 = r13.next()     // Catch:{ all -> 0x0415 }
            X.141 r9 = (X.AnonymousClass141) r9     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r9.A0J()     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x02d7
            java.lang.String r0 = r4.A0J()     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x02eb
        L_0x02d7:
            java.lang.String r0 = r9.A0J()     // Catch:{ all -> 0x0415 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x02bf
            java.lang.String r0 = r4.A0J()     // Catch:{ all -> 0x0415 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x02bf
        L_0x02eb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0415 }
            r1.<init>()     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = "contact-mgr-db/process-contact/deduping null/empty display name contact "
            r1.append(r0)     // Catch:{ all -> 0x0415 }
            r1.append(r9)     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0415 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0415 }
            r8.add(r9)     // Catch:{ all -> 0x0415 }
            r21 = 1
            goto L_0x02bf
        L_0x0305:
            if (r21 != 0) goto L_0x038e
            java.lang.String r0 = r4.A0J()     // Catch:{ all -> 0x0415 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0331
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0415 }
        L_0x0315:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0331
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0415 }
            X.141 r0 = (X.AnonymousClass141) r0     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r0.A0J()     // Catch:{ all -> 0x0415 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0415 }
            if (r0 != 0) goto L_0x0315
            java.lang.String r0 = "contact-mgr-db/process-contact/ignoring empty name since we have non-empty one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0415 }
            goto L_0x03a9
        L_0x0331:
            java.util.Iterator r20 = r3.iterator()     // Catch:{ all -> 0x0415 }
        L_0x0335:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0367
            java.lang.Object r9 = r20.next()     // Catch:{ all -> 0x0415 }
            X.141 r9 = (X.AnonymousClass141) r9     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r9.A0J()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0335
            java.lang.String r1 = r9.A0J()     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r4.A0J()     // Catch:{ all -> 0x0415 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0335
            long r18 = r4.A0I()     // Catch:{ all -> 0x0415 }
            long r13 = r9.A0I()     // Catch:{ all -> 0x0415 }
            int r0 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0335
            r8.add(r9)     // Catch:{ all -> 0x0415 }
            r21 = 1
            goto L_0x0335
        L_0x0367:
            if (r21 != 0) goto L_0x038e
            java.lang.String r0 = r4.A0J()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x03ab
            java.util.Iterator r9 = r3.iterator()     // Catch:{ all -> 0x0415 }
        L_0x0373:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x03ae
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0415 }
            X.141 r0 = (X.AnonymousClass141) r0     // Catch:{ all -> 0x0415 }
            java.lang.String r1 = r4.A0J()     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r0.A0J()     // Catch:{ all -> 0x0415 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0373
            goto L_0x03ab
        L_0x038e:
            r3.add(r4)     // Catch:{ all -> 0x0415 }
            goto L_0x03ab
        L_0x0392:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0415 }
            r1.<init>()     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = "contact-mgr-db/process-contact/removing duplicate contact with matching key "
            r1.append(r0)     // Catch:{ all -> 0x0415 }
            r1.append(r4)     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0415 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0415 }
            r2.add(r4)     // Catch:{ all -> 0x0415 }
        L_0x03a9:
            r21 = 1
        L_0x03ab:
            r22 = r21
            goto L_0x03b1
        L_0x03ae:
            r3.add(r4)     // Catch:{ all -> 0x0415 }
        L_0x03b1:
            r3.removeAll(r8)     // Catch:{ all -> 0x0415 }
            if (r22 != 0) goto L_0x03f5
            java.lang.String r0 = "existing_contacts: "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0415 }
            r8.<init>(r0)     // Catch:{ all -> 0x0415 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0415 }
        L_0x03c1:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x03d4
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0415 }
            r8.append(r0)     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = ", "
            r8.append(r0)     // Catch:{ all -> 0x0415 }
            goto L_0x03c1
        L_0x03d4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0415 }
            r1.<init>()     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = "contact-mgr-db/process-contact/contacts are identical, yet not ("
            r1.append(r0)     // Catch:{ all -> 0x0415 }
            r1.append(r8)     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = " and "
            r1.append(r0)     // Catch:{ all -> 0x0415 }
            r1.append(r4)     // Catch:{ all -> 0x0415 }
            r0 = 41
            r1.append(r0)     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0415 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0415 }
        L_0x03f5:
            r0 = r25
            r0.addAll(r2)     // Catch:{ all -> 0x0415 }
            goto L_0x0184
        L_0x03fc:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0415 }
            r0.<init>()     // Catch:{ all -> 0x0415 }
            r0.add(r4)     // Catch:{ all -> 0x0415 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0415 }
            goto L_0x0184
        L_0x0409:
            java.lang.String r1 = "same jid contacts must not be empty"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0415 }
            r0.<init>(r1)     // Catch:{ all -> 0x0415 }
            throw r0     // Catch:{ all -> 0x0415 }
        L_0x0411:
            r23.close()     // Catch:{ IllegalStateException -> 0x0421 }
            goto L_0x042e
        L_0x0415:
            r1 = move-exception
            if (r23 == 0) goto L_0x0420
            r23.close()     // Catch:{ all -> 0x041c }
            goto L_0x0420
        L_0x041c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x0421 }
        L_0x0420:
            throw r1     // Catch:{ IllegalStateException -> 0x0421 }
        L_0x0421:
            r2 = move-exception
            goto L_0x0425
        L_0x0423:
            r2 = move-exception
            r7 = 0
        L_0x0425:
            java.lang.String r1 = "contactmanagerdb/getContactPickerList/"
            int r0 = r12.size()     // Catch:{ all -> 0x049e }
            A0L(r2, r1, r7, r0)     // Catch:{ all -> 0x049e }
        L_0x042e:
            java.util.Set r0 = r12.entrySet()     // Catch:{ all -> 0x049e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x049e }
        L_0x0436:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x049e }
            if (r0 == 0) goto L_0x044e
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x049e }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x049e }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x049e }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x049e }
            r0 = r29
            r0.addAll(r1)     // Catch:{ all -> 0x049e }
            goto L_0x0436
        L_0x044e:
            r0 = r29
            A0F(r6, r0)     // Catch:{ all -> 0x049e }
            boolean r0 = r25.isEmpty()     // Catch:{ all -> 0x049e }
            if (r0 != 0) goto L_0x049a
            X.1M0 r3 = r28.A04()     // Catch:{ all -> 0x049e }
            if (r33 == 0) goto L_0x0464
            X.71s r2 = r3.A00()     // Catch:{ all -> 0x0490 }
            goto L_0x0468
        L_0x0464:
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x0490 }
        L_0x0468:
            java.util.Iterator r1 = r25.iterator()     // Catch:{ all -> 0x0486 }
        L_0x046c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0486 }
            if (r0 == 0) goto L_0x047c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0486 }
            X.141 r0 = (X.AnonymousClass141) r0     // Catch:{ all -> 0x0486 }
            A0I(r2, r0, r3)     // Catch:{ all -> 0x0486 }
            goto L_0x046c
        L_0x047c:
            r2.A00()     // Catch:{ all -> 0x0486 }
            r2.close()     // Catch:{ all -> 0x0490 }
            r3.close()     // Catch:{ all -> 0x049e }
            goto L_0x049a
        L_0x0486:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x048b }
            goto L_0x048f
        L_0x048b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0490 }
        L_0x048f:
            throw r1     // Catch:{ all -> 0x0490 }
        L_0x0490:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0495 }
            goto L_0x0499
        L_0x0495:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x049e }
        L_0x0499:
            throw r1     // Catch:{ all -> 0x049e }
        L_0x049a:
            r24.close()     // Catch:{ IllegalArgumentException -> 0x04a8 }
            goto L_0x04ae
        L_0x049e:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x04a3 }
            goto L_0x04a7
        L_0x04a3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x04a8 }
        L_0x04a7:
            throw r1     // Catch:{ IllegalArgumentException -> 0x04a8 }
        L_0x04a8:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to apply contact picker list de-dupe batch "
            X.C18740tg.A08(r0, r1)     // Catch:{ all -> 0x04c0 }
        L_0x04ae:
            X.12g r2 = r6.A02
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r16
            r2.A01(r15, r0)
            r29.size()
            r27.A00()
            return
        L_0x04c0:
            r3 = move-exception
            X.12g r2 = r6.A02
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r16
            r2.A01(r15, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229516p.A0G(X.16p, java.util.List, int, boolean, boolean, boolean):void");
    }

    public Cursor A0M() {
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            Cursor A033 = C229416o.A03(A032, "SELECT jid, conversation_size, conversation_message_count FROM wa_contact_storage_usage WHERE jid != ? ORDER BY conversation_size DESC, conversation_message_count DESC", "CONTACT_STORAGE_USAGES", new String[]{C177528dw.A00.getRawString()});
            A032.close();
            return A033;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0R(C80193v0 r11) {
        C1495671s B1k;
        try {
            AnonymousClass1M0 A042 = this.A00.A04();
            try {
                B1k = A042.B1k();
                String rawString = r11.A01().getRawString();
                ContentValues contentValues = new ContentValues();
                contentValues.put("conversation_size", Long.valueOf(r11.A00.A0I));
                contentValues.put("conversation_message_count", Integer.valueOf(r11.A00.A06));
                if (C229416o.A01(contentValues, A042, "wa_contact_storage_usage", "jid = ?", new String[]{rawString}) == 0) {
                    contentValues.put("jid", rawString);
                    C229416o.A05(contentValues, A042, "wa_contact_storage_usage");
                }
                B1k.A00();
                B1k.close();
                A042.close();
                return;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (IllegalArgumentException e) {
            C18740tg.A08("contact-mgr-db/unable to update batch on storage usage table", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A0W(ArrayList arrayList) {
        Cursor A032;
        C21050ya A0O = this.A04.A0O();
        if (A0O == null) {
            Log.w("contact-mgr-db/wadbhelper/get-contact-nux-suggest-list cr=null");
            return;
        }
        try {
            A032 = A0O.A03(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"raw_contact_id"}, "starred=1", (String[]) null, (String) null);
            if (A032 != null) {
                int columnIndexOrThrow = A032.getColumnIndexOrThrow("raw_contact_id");
                HashSet hashSet = new HashSet();
                while (A032.moveToNext()) {
                    Long valueOf = Long.valueOf(A032.getLong(columnIndexOrThrow));
                    if (hashSet.add(valueOf)) {
                        arrayList.add(valueOf);
                    }
                }
                A032.close();
                return;
            }
            return;
        } catch (Exception e) {
            Log.e("contact-mgr-db/unable to query the phone book for favorited contacts", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0104 A[Catch:{ all -> 0x0245 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(java.util.Collection r18) {
        /*
            r17 = this;
            r3 = r18
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "contact-mgr-db/add contacts called without any contacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x000e:
            r0 = 1
            X.14g r6 = new X.14g
            r6.<init>((boolean) r0)
            r6.A03()
            android.content.ContentValues r7 = new android.content.ContentValues
            r7.<init>()
            r5 = r17
            X.16r r10 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0259 }
            X.1M0 r2 = r10.A04()     // Catch:{ IllegalArgumentException -> 0x0259 }
            X.71s r4 = r2.B1k()     // Catch:{ all -> 0x024f }
            java.util.Iterator r16 = r3.iterator()     // Catch:{ all -> 0x0245 }
        L_0x002c:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x0122
            java.lang.Object r9 = r16.next()     // Catch:{ all -> 0x0245 }
            X.141 r9 = (X.AnonymousClass141) r9     // Catch:{ all -> 0x0245 }
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r0 = r9.A06(r0)     // Catch:{ all -> 0x0245 }
            X.11F r0 = (X.AnonymousClass11F) r0     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x002c
            java.util.ArrayList r0 = r5.A0Q(r0)     // Catch:{ all -> 0x0245 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0245 }
        L_0x004a:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x0072
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0245 }
            X.141 r11 = (X.AnonymousClass141) r11     // Catch:{ all -> 0x0245 }
            boolean r0 = r5.A0Z(r11)     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x006e
            X.3IL r8 = r9.A0F     // Catch:{ all -> 0x0245 }
            if (r8 == 0) goto L_0x004a
            X.3IL r0 = r11.A0F     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0245 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x004a
        L_0x006e:
            r5.A0H(r4, r11, r2)     // Catch:{ all -> 0x0245 }
            goto L_0x004a
        L_0x0072:
            X.0yC r8 = r5.A06     // Catch:{ all -> 0x0245 }
            r1 = 5868(0x16ec, float:8.223E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x0245 }
            boolean r0 = X.C20800yB.A01(r0, r8, r1)     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x002c
            X.3IL r13 = r9.A0F     // Catch:{ all -> 0x0245 }
            long r0 = r13.A00     // Catch:{ all -> 0x0245 }
            r11 = -5
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x002c
            java.lang.String r14 = r13.A01     // Catch:{ all -> 0x0245 }
            r0 = 1
            X.14g r11 = new X.14g     // Catch:{ all -> 0x0245 }
            r11.<init>((boolean) r0)     // Catch:{ all -> 0x0245 }
            r11.A03()     // Catch:{ all -> 0x0245 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0245 }
            r15.<init>()     // Catch:{ all -> 0x0245 }
            r8 = 0
            X.1M0 r12 = r10.get()     // Catch:{ IllegalStateException -> 0x00e6 }
            java.lang.String r13 = X.AnonymousClass2x7.A06     // Catch:{ all -> 0x00dc }
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00dc }
            r1[r8] = r14     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "CONTACTS-BY-NUMBER"
            android.database.Cursor r14 = X.C229416o.A03(r12, r13, r0, r1)     // Catch:{ all -> 0x00dc }
            int r8 = r14.getCount()     // Catch:{ all -> 0x00cc }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x00cc }
            r13.<init>(r8)     // Catch:{ all -> 0x00cc }
        L_0x00b2:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00c0
            X.141 r0 = X.C53712rl.A00(r14)     // Catch:{ all -> 0x00ca }
            r13.add(r0)     // Catch:{ all -> 0x00ca }
            goto L_0x00b2
        L_0x00c0:
            r14.close()     // Catch:{ all -> 0x00d9 }
            r12.close()     // Catch:{ IllegalStateException -> 0x00c7 }
            goto L_0x00f1
        L_0x00c7:
            r12 = move-exception
            r15 = r13
            goto L_0x00e7
        L_0x00ca:
            r1 = move-exception
            goto L_0x00d0
        L_0x00cc:
            r1 = move-exception
            r13 = r15
            if (r14 == 0) goto L_0x00d8
        L_0x00d0:
            r14.close()     // Catch:{ all -> 0x00d4 }
            goto L_0x00d8
        L_0x00d4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00d9 }
        L_0x00d8:
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r1 = move-exception
            r15 = r13
            goto L_0x00dd
        L_0x00dc:
            r1 = move-exception
        L_0x00dd:
            r12.close()     // Catch:{ all -> 0x00e1 }
            goto L_0x00e5
        L_0x00e1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x00e6 }
        L_0x00e5:
            throw r1     // Catch:{ IllegalStateException -> 0x00e6 }
        L_0x00e6:
            r12 = move-exception
        L_0x00e7:
            java.lang.String r1 = "contactmanagerdb/getContactsByPhoneNumberLoose/"
            int r0 = r15.size()     // Catch:{ all -> 0x0120 }
            A0L(r12, r1, r8, r0)     // Catch:{ all -> 0x0120 }
            r13 = r15
        L_0x00f1:
            A0F(r5, r13)     // Catch:{ all -> 0x0245 }
            r13.size()     // Catch:{ all -> 0x0245 }
            r11.A00()     // Catch:{ all -> 0x0245 }
            java.util.Iterator r11 = r13.iterator()     // Catch:{ all -> 0x0245 }
        L_0x00fe:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x002c
            java.lang.Object r8 = r11.next()     // Catch:{ all -> 0x0245 }
            X.141 r8 = (X.AnonymousClass141) r8     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = r8.A0J()     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = r9.A0J()     // Catch:{ all -> 0x0245 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r8.A0k     // Catch:{ all -> 0x0245 }
            if (r0 != 0) goto L_0x00fe
            r5.A0H(r4, r8, r2)     // Catch:{ all -> 0x0245 }
            goto L_0x00fe
        L_0x0120:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0245 }
        L_0x0122:
            java.util.Iterator r11 = r3.iterator()     // Catch:{ all -> 0x0245 }
        L_0x0126:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x022b
            java.lang.Object r8 = r11.next()     // Catch:{ all -> 0x0245 }
            X.141 r8 = (X.AnonymousClass141) r8     // Catch:{ all -> 0x0245 }
            X.11F r0 = r8.A0H     // Catch:{ all -> 0x0245 }
            if (r0 != 0) goto L_0x014b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0245 }
            r1.<init>()     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "contact-mgr-db/skipped adding contact due to empty jid: "
            r1.append(r0)     // Catch:{ all -> 0x0245 }
            r1.append(r8)     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0245 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0245 }
            goto L_0x0126
        L_0x014b:
            X.3IL r10 = r8.A0F     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "jid"
            r7.put(r0, r1)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "is_whatsapp_user"
            boolean r0 = r8.A0z     // Catch:{ all -> 0x0245 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "status"
            java.lang.String r0 = r8.A0X     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r9 = "status_timestamp"
            long r0 = r8.A0D     // Catch:{ all -> 0x0245 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0245 }
            r7.put(r9, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r9 = "number"
            r1 = 0
            if (r10 == 0) goto L_0x01e8
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x0245 }
        L_0x017a:
            r7.put(r9, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r9 = "raw_contact_id"
            if (r10 == 0) goto L_0x0187
            long r0 = r10.A00     // Catch:{ all -> 0x0245 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0245 }
        L_0x0187:
            r7.put(r9, r1)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "display_name"
            java.lang.String r0 = r8.A0J()     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "phone_type"
            java.lang.Integer r0 = r8.A0L     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "phone_label"
            java.lang.String r0 = r8.A0V     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "given_name"
            java.lang.String r0 = r8.A0R     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "family_name"
            java.lang.String r0 = r8.A0Q     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "sort_name"
            java.lang.String r0 = r8.A0W     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "nickname"
            java.lang.String r0 = r8.A0U     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "company"
            java.lang.String r0 = r8.A0O     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "title"
            java.lang.String r0 = r8.A0Z     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "is_spam_reported"
            boolean r0 = r8.A0w     // Catch:{ all -> 0x0245 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "status_emoji"
            java.lang.String r0 = r8.A0Y     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            X.0yC r9 = r5.A06     // Catch:{ all -> 0x0245 }
            r1 = 5868(0x16ec, float:8.223E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x0245 }
            boolean r0 = X.C20800yB.A01(r0, r9, r1)     // Catch:{ all -> 0x0245 }
            goto L_0x01ea
        L_0x01e8:
            r0 = r1
            goto L_0x017a
        L_0x01ea:
            if (r0 == 0) goto L_0x0211
            java.lang.String r1 = "sync_policy"
            int r0 = r8.A07     // Catch:{ all -> 0x0245 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "is_wa_created_contact"
            boolean r0 = r8.A0s     // Catch:{ all -> 0x0245 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0245 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r9 = "is_contact_synced"
            boolean r1 = r8.A0k     // Catch:{ all -> 0x0245 }
            r0 = 0
            if (r1 == 0) goto L_0x020a
            r0 = 1
        L_0x020a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0245 }
            r7.put(r9, r0)     // Catch:{ all -> 0x0245 }
        L_0x0211:
            java.lang.String r0 = "wa_contacts"
            X.C229416o.A00(r7, r2, r0)     // Catch:{ all -> 0x0245 }
            X.11F r0 = r8.A0H     // Catch:{ all -> 0x0245 }
            boolean r0 = r0 instanceof X.AnonymousClass147     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x0126
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r1 = r8.A06(r0)     // Catch:{ all -> 0x0245 }
            X.144 r1 = (X.AnonymousClass144) r1     // Catch:{ all -> 0x0245 }
            X.3QL r0 = r8.A0K     // Catch:{ all -> 0x0245 }
            A0J(r4, r2, r1, r0)     // Catch:{ all -> 0x0245 }
            goto L_0x0126
        L_0x022b:
            r4.A00()     // Catch:{ all -> 0x0245 }
            r1 = 44
            X.1j2 r0 = new X.1j2     // Catch:{ all -> 0x0245 }
            r0.<init>(r5, r3, r1)     // Catch:{ all -> 0x0245 }
            r2.B5o(r0)     // Catch:{ all -> 0x0245 }
            r4.close()     // Catch:{ all -> 0x024f }
            r2.close()     // Catch:{ IllegalArgumentException -> 0x0259 }
            r3.size()
            r6.A00()
            return
        L_0x0245:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x024a }
            goto L_0x024e
        L_0x024a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x024f }
        L_0x024e:
            throw r1     // Catch:{ all -> 0x024f }
        L_0x024f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0254 }
            goto L_0x0258
        L_0x0254:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x0259 }
        L_0x0258:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0259 }
        L_0x0259:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "contact-mgr-db/unable to add "
            r1.append(r0)
            int r0 = r3.size()
            r1.append(r0)
            java.lang.String r0 = " contacts "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A08(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229516p.A0X(java.util.Collection):void");
    }

    public void A0Y(List list) {
        C1495671s B1k;
        ContentValues contentValues = new ContentValues();
        try {
            AnonymousClass1M0 A042 = this.A00.A04();
            try {
                B1k = A042.B1k();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass11F r0 = (AnonymousClass11F) it.next();
                    if (r0 != null) {
                        contentValues.put("jid", r0.getRawString());
                        contentValues.put("conversation_size", 0);
                        contentValues.put("conversation_message_count", 0);
                        C229416o.A05(contentValues, A042, "wa_contact_storage_usage");
                    }
                }
                B1k.A00();
                B1k.close();
                A042.close();
                return;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (IllegalArgumentException e) {
            C18740tg.A08("contact-mgr-db/unable to insert batch to storage usage table", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public boolean A0Z(AnonymousClass141 r4) {
        if (r4.A0H == null) {
            return false;
        }
        if (r4.A0B()) {
            return true;
        }
        if (!r4.A0n) {
            return false;
        }
        if (C20800yB.A01(C21000yV.A02, this.A0B.A01, 3519)) {
            return true;
        }
        return false;
    }

    public void BUR(AnonymousClass141 r5) {
        synchronized (this.A09) {
            Integer num = this.A01;
            if (num != null) {
                Integer valueOf = Integer.valueOf(num.intValue() - 1);
                this.A01 = valueOf;
                StringBuilder sb = new StringBuilder();
                sb.append("contact-mgr-db/onContactUnlinkedFromPhonebook individualContactCount = ");
                sb.append(valueOf);
                Log.i(sb.toString());
            }
        }
    }

    public void BUU(Collection collection) {
        Integer valueOf;
        synchronized (this.A09) {
            int A042 = A04(collection);
            Integer num = this.A01;
            if (num == null) {
                valueOf = Integer.valueOf(A042);
                this.A01 = valueOf;
            } else {
                valueOf = Integer.valueOf(num.intValue() + A042);
                this.A01 = valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/onContactsAddedOrUpdated individualContactCount = ");
            sb.append(valueOf);
            Log.i(sb.toString());
        }
    }

    public void BUW(Collection collection) {
        synchronized (this.A09) {
            int A042 = A04(collection);
            Integer num = this.A01;
            if (num != null) {
                Integer valueOf = Integer.valueOf(num.intValue() - A042);
                this.A01 = valueOf;
                StringBuilder sb = new StringBuilder();
                sb.append("contact-mgr-db/onContactsRemoved individualContactCount = ");
                sb.append(valueOf);
                Log.i(sb.toString());
            }
        }
    }

    public C229516p(C19730wQ r2, C21060yb r3, C19970wo r4, C18820ts r5, AnonymousClass12g r6, C20810yC r7, C230116v r8, C19770wU r9, C229716r r10, AnonymousClass005 r11) {
        super(r10);
        this.A05 = r4;
        this.A06 = r7;
        this.A03 = r2;
        this.A07 = r9;
        this.A04 = r3;
        this.A0A = r5;
        this.A02 = r6;
        this.A0B = r8;
        this.A08 = r11;
    }

    private int A04(Collection collection) {
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass141 r2 = (AnonymousClass141) it.next();
            if (r2 != null && r2.A0z && r2.A0F != null && !this.A03.A0M(r2.A0H)) {
                i++;
            }
        }
        return i;
    }

    private void A0H(C1495671s r3, AnonymousClass141 r4, C26911Lz r5) {
        C18740tg.A0C(r3.A01());
        C224214g r0 = new C224214g(true);
        r0.A03();
        A0I(r3, r4, r5);
        r0.A00();
    }

    public static void A0I(C1495671s r7, AnonymousClass141 r8, C26911Lz r9) {
        C18740tg.A0C(r7.A01());
        AnonymousClass11F r5 = r8.A0H;
        String A032 = AnonymousClass143.A03(r5);
        C229416o.A02(r9, "wa_contacts", "_id = ?", new String[]{String.valueOf(r8.A0I())});
        C229416o.A02(r9, "wa_contact_storage_usage", "jid = ? AND NOT EXISTS (SELECT 1 FROM wa_contacts WHERE jid = ?)", new String[]{A032, A032});
        if (r5 instanceof AnonymousClass147) {
            A0J(r7, r9, (AnonymousClass144) r5, (AnonymousClass3QL) null);
        }
        C229416o.A02(r9, "wa_group_admin_settings", "jid = ?", new String[]{A032});
    }

    public static void A0J(C1495671s r6, C26911Lz r7, AnonymousClass144 r8, AnonymousClass3QL r9) {
        String str;
        String str2;
        C18740tg.A0C(r6.A01());
        if (r8 != null && !(r8 instanceof C177538dx) && !(r8 instanceof AnonymousClass146)) {
            String rawString = r8.getRawString();
            C18740tg.A06(rawString);
            if (r9 == null || (str = r9.A04) == null) {
                C229416o.A02(r7, "wa_group_descriptions", "jid = ?", new String[]{rawString});
                return;
            }
            String str3 = r9.A03;
            if (str3 != null) {
                C229416o.A02(r7, "wa_group_descriptions", "jid = ?", new String[]{rawString});
                ContentValues contentValues = new ContentValues(5);
                contentValues.put("jid", rawString);
                contentValues.put("description", str3);
                contentValues.put("description_id_string", str);
                contentValues.put("description_time", Long.valueOf(r9.A00));
                UserJid userJid = r9.A02;
                if (userJid != null) {
                    str2 = userJid.getRawString();
                } else {
                    str2 = "";
                }
                contentValues.put("description_setter_jid", str2);
                C229416o.A00(contentValues, r7, "wa_group_descriptions");
            }
        }
    }

    private void A0K(AnonymousClass141 r10, Locale locale) {
        Cursor A032;
        if (r10.A0N()) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            AnonymousClass11F r4 = r10.A0H;
            AnonymousClass1M0 A033 = this.A00.get();
            try {
                String A034 = AnonymousClass143.A03(r4);
                C18740tg.A06(A034);
                A032 = C229416o.A03(A033, "SELECT lc, verified_name FROM wa_vnames_localized WHERE jid = ? AND lg = ?", "CONTACT_VNAMES_LOCALIZED", new String[]{A034, language});
                String str = null;
                int columnIndexOrThrow = A032.getColumnIndexOrThrow("lc");
                int columnIndexOrThrow2 = A032.getColumnIndexOrThrow("verified_name");
                while (true) {
                    if (!A032.moveToNext()) {
                        break;
                    }
                    String string = A032.getString(columnIndexOrThrow);
                    String string2 = A032.getString(columnIndexOrThrow2);
                    if (TextUtils.isEmpty(string)) {
                        str = string2;
                    } else if (string.equals(country)) {
                        str = string2;
                        break;
                    }
                }
                if (str != null) {
                    r10.A0M(str);
                }
                r10.A0b = locale;
                A032.close();
                A033.close();
                return;
            } catch (Throwable th) {
                try {
                    A033.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }

    public static void A0L(IllegalStateException illegalStateException, String str, int i, int i2) {
        if (illegalStateException.getMessage() == null || !illegalStateException.getMessage().contains("Make sure the Cursor is initialized correctly before accessing data from it")) {
            throw illegalStateException;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("illegal-state-exception/cursor count=");
        sb.append(i);
        sb.append("; partial list size=");
        sb.append(i2);
        C18740tg.A08(sb.toString(), illegalStateException);
    }
}
