package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2FS  reason: invalid class name */
public class AnonymousClass2FS extends AnonymousClass1LZ {
    public Runnable A00;
    public List A01 = AnonymousClass001.A0I();
    public final C19730wQ A02;
    public final AnonymousClass16D A03;
    public final C64523Oi A04;
    public final C20430xY A05;
    public final C19980wp A06;
    public final C19630wG A07;
    public final AnonymousClass1AC A08;
    public final C20810yC A09;
    public final C19770wU A0A;
    public final AnonymousClass199 A0B;
    public final AnonymousClass171 A0C;
    public final C19970wo A0D;
    public final AnonymousClass17X A0E;
    public final AnonymousClass12O A0F;

    public String A0B() {
        return "critical_unblock_low";
    }

    public String A0C() {
        return "contact";
    }

    public boolean A0H() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C201669k5 A0A(X.C202599mH r16, java.lang.String r17, boolean r18) {
        /*
            r15 = this;
            r1 = r16
            java.lang.String[] r5 = r1.A06
            X.9fw r4 = r1.A01
            X.8SS r3 = r1.A03
            int r2 = r5.length
            r10 = 0
            r0 = 2
            if (r2 != r0) goto L_0x0036
            r14 = 0
            r2 = r5[r14]
            java.lang.String r0 = "contact"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0036
            r2 = 1
            r0 = r5[r2]
            com.whatsapp.jid.UserJid r8 = X.C36431kI.A0l(r0)
            if (r8 != 0) goto L_0x0037
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contact-mutation/from-key-value unable to create user jid from "
            r1.append(r0)
            r0 = r5[r2]
            r1.append(r0)
        L_0x002f:
            java.lang.String r0 = r1.toString()
        L_0x0033:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return r10
        L_0x0037:
            X.9fw r5 = X.C199769fw.A03
            boolean r0 = r5.equals(r4)
            r9 = r17
            if (r0 == 0) goto L_0x008d
            if (r3 == 0) goto L_0x008a
            boolean r0 = r3.A0u()
            if (r0 == 0) goto L_0x008a
            int r0 = r3.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x008a
            long r12 = r3.timestamp_
            X.8Qo r2 = r3.contactAction_
            if (r2 != 0) goto L_0x0057
            X.8Qo r2 = X.C173148Qo.DEFAULT_INSTANCE
        L_0x0057:
            int r3 = r2.bitField0_
            r0 = r3 & 1
            if (r0 == 0) goto L_0x0087
            java.lang.String r11 = r2.fullName_
            r0 = r3 & 2
            if (r0 == 0) goto L_0x0065
            java.lang.String r10 = r2.firstName_
        L_0x0065:
            r0 = r3 & 4
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r2.lidJid_
            com.whatsapp.jid.UserJid r7 = X.C36431kI.A0l(r0)
            boolean r0 = r7 instanceof X.C223313w
            if (r0 == 0) goto L_0x0085
            X.13w r7 = (X.C223313w) r7
        L_0x0075:
            int r0 = r2.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x007d
            boolean r14 = r2.saveOnPrimaryAddressbook_
        L_0x007d:
            X.9jo r6 = r1.A02
            X.2Lk r4 = new X.2Lk
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14)
            return r4
        L_0x0085:
            r7 = 0
            goto L_0x0075
        L_0x0087:
            java.lang.String r0 = "contact-mutation/from-key-value fullName was not in contactAction protobuf"
            goto L_0x0033
        L_0x008a:
            java.lang.String r0 = "contact-mutation/from-key-value syncActionValue is null, missing timestamp, or is missing contactAction"
            goto L_0x0033
        L_0x008d:
            X.9fw r5 = X.C199769fw.A02
            boolean r0 = r5.equals(r4)
            if (r0 == 0) goto L_0x00a2
            r12 = 0
            X.9jo r0 = r1.A02
            X.2Lk r4 = new X.2Lk
            r6 = r0
            r7 = r10
            r11 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14)
            return r4
        L_0x00a2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contact-mutation/from-key-value unknown operation: "
            r1.append(r0)
            r1.append(r4)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2FS.A0A(X.9mH, java.lang.String, boolean):X.9k5");
    }

    public List A0D(boolean z) {
        C18740tg.A0D(false, "Please use createBootstrapMutations(initialData) method instead");
        return A0J(Collections.emptyList());
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r5) {
        boolean z;
        C199769fw r1;
        C199769fw r0;
        AnonymousClass2Lk r52 = (AnonymousClass2Lk) r5;
        AnonymousClass16D r2 = this.A03;
        AnonymousClass141 A0E2 = r2.A0E(r52.A01, false);
        if (A0E2 == null || !r2.A05.A0Z(A0E2)) {
            z = false;
            r1 = r52.A05;
            r0 = C199769fw.A02;
        } else {
            z = true;
            if (A0E2.A0z) {
                r1 = r52.A05;
                r0 = C199769fw.A03;
            }
            r1 = r52.A05;
            r0 = C199769fw.A02;
        }
        if (r1 == r0) {
            A06(r52);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("contact-mutation-handler/handleNotReadyToSyncPendingMutation delete mutation isValidWhatsAppContact = ");
        A0u.append(z);
        A0u.append("; WAState=");
        Log.w(C36421kH.A0d(A0u, A0E2.A0z));
        A04(r52);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c2, code lost:
        if (r13.length() != 0) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d2, code lost:
        if (r15 == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d5, code lost:
        r1.withValue("data3", r13);
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0G(X.C201669k5 r21, X.C201669k5 r22) {
        /*
            r20 = this;
            r3 = r21
            X.2Lk r3 = (X.AnonymousClass2Lk) r3
            r2 = r20
            r6 = r22
            if (r22 == 0) goto L_0x0016
            long r7 = r6.A04
            long r4 = r3.A04
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            r2.A07(r3)
            return
        L_0x0016:
            X.0wQ r4 = r2.A02
            boolean r0 = r4.A0L()
            if (r0 != 0) goto L_0x020b
            X.0yC r1 = r2.A09
            boolean r0 = X.C36401kF.A1Y(r1)
            if (r0 == 0) goto L_0x0085
            r0 = 7301(0x1c85, float:1.0231E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0085
            X.16D r14 = r2.A03
            com.whatsapp.jid.UserJid r10 = r3.A01
            X.141 r15 = r14.A0D(r10)
            X.9fw r1 = r3.A05
            X.9fw r0 = X.C199769fw.A02
            r12 = 0
            if (r1 != r0) goto L_0x008d
            java.lang.String r0 = "ContactMutationHandler/handleMutationInPrimaryMode/remove operation"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3IL r0 = r15.A0F
            if (r0 == 0) goto L_0x0085
            long r0 = r0.A00
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x0089
            X.11F r7 = r15.A0H
            X.3Oi r0 = r2.A04
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0085
            X.3IL r0 = r15.A0F
            java.lang.String r8 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0072
            X.199 r5 = r2.A0B
            java.lang.String r4 = "SYNC_MANAGER_CONTACTS_UPDATED_BY_COMPANION"
            java.util.HashSet r1 = r5.A09(r4)
            boolean r0 = r1.add(r8)
            if (r0 == 0) goto L_0x0072
            r5.A0A(r4, r1)
        L_0x0072:
            X.3IL r0 = r15.A0F
            long r0 = r0.A00
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r7.user
            r19 = 0
            r18 = r0
            r16 = r7
            r14.A0V(r15, r16, r17, r18, r19)
        L_0x0085:
            r2.A09(r3, r6)
            return
        L_0x0089:
            r14.A0P(r15)
            goto L_0x0085
        L_0x008d:
            java.lang.String r7 = r3.A03
            java.lang.String r9 = r3.A02
            java.lang.String r0 = r7.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = " "
            java.lang.String[] r1 = r9.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x00d4
            r0 = 0
            r7 = r1[r0]
        L_0x00a7:
            X.3IL r5 = r15.A0F
            boolean r4 = X.AnonymousClass000.A1V(r5)
            r0 = -5
            if (r4 == 0) goto L_0x00d1
            long r4 = r5.A00
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
        L_0x00b5:
            if (r8 != 0) goto L_0x00d7
            r4 = 1
            r15.A0s = r4
            r15.A07 = r4
            java.lang.String r5 = r10.user
            X.3IL r4 = new X.3IL
            r4.<init>(r0, r5)
            r15.A0F = r4
            r15.A0P = r9
            r15.A0R = r7
            java.util.Set r0 = java.util.Collections.singleton(r15)
            r14.A0l(r0)
            goto L_0x0085
        L_0x00d1:
            boolean r8 = r3.A04
            goto L_0x00b5
        L_0x00d4:
            java.lang.String r7 = ""
            goto L_0x00a7
        L_0x00d7:
            java.lang.String r9 = r10.user
            X.3Oi r4 = r2.A04
            X.0wG r0 = r2.A07
            android.content.Context r10 = r0.A00
            r8 = 0
            X.AnonymousClass00C.A0D(r10, r8)
            boolean r0 = r4.A01()
            java.lang.String r5 = "PHONE"
            if (r0 == 0) goto L_0x0154
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r10)
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r1 = r1.getAccountsByType(r0)
            X.AnonymousClass00C.A08(r1)
            int r0 = r1.length
            if (r0 == 0) goto L_0x0154
            r10 = r1[r8]
            X.AnonymousClass00C.A0B(r10)
        L_0x0100:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0117
            X.199 r8 = r2.A0B
            java.lang.String r5 = "SYNC_MANAGER_CONTACTS_UPDATED_BY_COMPANION"
            java.util.HashSet r1 = r8.A09(r5)
            boolean r0 = r1.add(r9)
            if (r0 == 0) goto L_0x0117
            r8.A0A(r5, r1)
        L_0x0117:
            X.3AU r11 = new X.3AU
            r11.<init>()
            java.lang.String r0 = r10.name
            r11.A01 = r0
            java.lang.String r0 = r10.type
            r11.A02 = r0
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            r11.A04 = r7
            X.3IL r0 = r15.A0F
            r8 = 0
            if (r0 == 0) goto L_0x0139
            long r0 = r0.A00
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x0139
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
        L_0x0139:
            r11.A00 = r8
            r11.A06 = r9
            java.lang.String r12 = r11.A01
            java.lang.String r14 = r11.A02
            java.lang.String r13 = r11.A05
            java.lang.String r10 = r11.A03
            boolean r11 = r11.A07
            boolean r0 = r4.A01()
            if (r0 != 0) goto L_0x0161
            java.lang.String r0 = "NativeContactDbHelper no contact permission"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0085
        L_0x0154:
            r0 = 2131892998(0x7f121b06, float:1.942076E38)
            java.lang.String r0 = r10.getString(r0)
            android.accounts.Account r10 = new android.accounts.Account
            r10.<init>(r0, r5)
            goto L_0x0100
        L_0x0161:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            boolean r15 = X.AnonymousClass000.A1V(r8)
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r0)
            java.lang.String r0 = "account_type"
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r0, r14)
            java.lang.String r0 = "account_name"
            X.C36351kA.A13(r1, r12, r0, r5)
            boolean r0 = X.AnonymousClass000.A1V(r8)
            java.lang.String r12 = "data2"
            if (r0 != 0) goto L_0x01ae
            int r0 = r7.length()
            if (r0 != 0) goto L_0x01ae
            if (r13 == 0) goto L_0x0190
            int r0 = r13.length()
            if (r0 != 0) goto L_0x01ae
        L_0x0190:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r0 = X.C64523Oi.A00(r8, r0, r11)
            java.lang.String r7 = "data1"
            android.content.ContentProviderOperation$Builder r1 = r0.withValue(r7, r9)
            java.lang.Integer r0 = X.C36361kB.A0j()
            X.C36351kA.A13(r1, r0, r12, r5)
            if (r15 != 0) goto L_0x01db
            if (r10 == 0) goto L_0x01e4
            int r0 = r10.length()
            if (r0 != 0) goto L_0x01db
            goto L_0x01e4
        L_0x01ae:
            java.lang.String r0 = "vnd.android.cursor.item/name"
            android.content.ContentProviderOperation$Builder r1 = X.C64523Oi.A00(r8, r0, r11)
            if (r15 != 0) goto L_0x01cf
            int r0 = r7.length()
            if (r0 != 0) goto L_0x01cf
        L_0x01bc:
            if (r13 == 0) goto L_0x01c4
            int r0 = r13.length()
            if (r0 != 0) goto L_0x01d5
        L_0x01c4:
            android.content.ContentProviderOperation r0 = r1.build()
            X.AnonymousClass00C.A08(r0)
            r5.add(r0)
            goto L_0x0190
        L_0x01cf:
            r1.withValue(r12, r7)
            if (r15 != 0) goto L_0x01d5
            goto L_0x01bc
        L_0x01d5:
            java.lang.String r0 = "data3"
            r1.withValue(r0, r13)
            goto L_0x01c4
        L_0x01db:
            java.lang.String r0 = "vnd.android.cursor.item/organization"
            android.content.ContentProviderOperation$Builder r0 = X.C64523Oi.A00(r8, r0, r11)
            X.C36351kA.A13(r0, r10, r7, r5)
        L_0x01e4:
            X.0yb r0 = r4.A00     // Catch:{ Exception -> 0x01ff }
            X.0ya r0 = r0.A0O()     // Catch:{ Exception -> 0x01ff }
            if (r0 == 0) goto L_0x0085
            java.lang.String r4 = "com.android.contacts"
            java.util.ArrayList r1 = X.C36441kJ.A15(r5)     // Catch:{ Exception -> 0x01ff }
            android.content.ContentResolver r0 = X.C21050ya.A00(r0)     // Catch:{ Exception -> 0x01ff }
            android.content.ContentProviderResult[] r0 = r0.applyBatch(r4, r1)     // Catch:{ Exception -> 0x01ff }
            X.AnonymousClass00C.A08(r0)     // Catch:{ Exception -> 0x01ff }
            goto L_0x0085
        L_0x01ff:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NativeContactDbHelper/unable to save contact "
            X.C36321k7.A1W(r0, r1, r4)
            goto L_0x0085
        L_0x020b:
            com.whatsapp.jid.UserJid r5 = r3.A01
            X.9fw r1 = r3.A05
            X.9fw r0 = X.C199769fw.A03
            if (r1 != r0) goto L_0x02cb
            boolean r0 = r4.A0M(r5)
            if (r0 == 0) goto L_0x022c
            X.0wp r0 = r2.A06
            java.lang.String r4 = r3.A02
            android.content.SharedPreferences r0 = X.C19980wp.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "self_contact_name"
            X.C36341k9.A0x(r1, r0, r4)
            goto L_0x0085
        L_0x022c:
            X.16D r4 = r2.A03
            r4.A0D(r5)
            java.lang.String r10 = r3.A03
            java.lang.String r9 = r3.A02
            java.lang.String r0 = r10.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x024b
            java.lang.String r0 = " "
            java.lang.String[] r1 = r9.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x02a7
            r0 = 0
            r10 = r1[r0]
        L_0x024b:
            java.lang.String r1 = r5.user
            X.141 r7 = r4.A08(r5)
            if (r7 == 0) goto L_0x029d
            X.16p r8 = r4.A05
            r0 = 4
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r0)
            java.lang.String r0 = "number"
            r4.put(r0, r1)
            r0 = -3
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "raw_contact_id"
            r4.put(r0, r1)
            java.lang.String r0 = "given_name"
            r4.put(r0, r10)
            java.lang.String r0 = "display_name"
            r4.put(r0, r9)
            X.11F r0 = r7.A0H
            X.C229516p.A09(r4, r8, r0)
            X.005 r0 = r8.A08
            java.lang.Object r1 = r0.get()
            X.2ZF r1 = (X.AnonymousClass2ZF) r1
            java.util.Set r0 = java.util.Collections.singleton(r7)
            r1.A00(r0)
        L_0x0289:
            X.0wp r0 = r2.A06
            android.content.SharedPreferences r1 = X.C19980wp.A00(r0)
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            int r1 = X.C36371kC.A01(r1, r0)
            r0 = 1
            if (r1 == r0) goto L_0x0085
            r0 = 2
            if (r1 == r0) goto L_0x0085
            monitor-enter(r2)
            goto L_0x02aa
        L_0x029d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ContactManager/updateContactSyncd attempting to update contact that is not in db with jid="
            X.C36321k7.A1J(r5, r0, r1)
            goto L_0x0289
        L_0x02a7:
            java.lang.String r10 = ""
            goto L_0x024b
        L_0x02aa:
            java.util.List r0 = r2.A01     // Catch:{ all -> 0x02c8 }
            r0.add(r5)     // Catch:{ all -> 0x02c8 }
            java.lang.Runnable r0 = r2.A00     // Catch:{ all -> 0x02c8 }
            if (r0 != 0) goto L_0x02c5
            X.0wU r7 = r2.A0A     // Catch:{ all -> 0x02c8 }
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r1 = "ContactMutationHandler/syncNewContacts"
            r0 = 11
            X.3v2 r0 = X.C80213v2.A00(r2, r0)     // Catch:{ all -> 0x02c8 }
            X.1jE r0 = r7.BpM(r0, r1, r4)     // Catch:{ all -> 0x02c8 }
            r2.A00 = r0     // Catch:{ all -> 0x02c8 }
        L_0x02c5:
            monitor-exit(r2)
            goto L_0x0085
        L_0x02c8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x02cb:
            X.9fw r0 = X.C199769fw.A02
            if (r1 != r0) goto L_0x03c1
            boolean r0 = r4.A0M(r5)
            if (r0 == 0) goto L_0x02ef
            X.0wp r0 = r2.A06
            r4 = 0
            android.content.SharedPreferences r0 = X.C19980wp.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "self_contact_name"
            X.C36341k9.A0x(r1, r0, r4)
        L_0x02e5:
            X.1AC r0 = r2.A08
            X.18P r0 = r0.A00
            X.1M0 r4 = r0.A04()
            goto L_0x0392
        L_0x02ef:
            X.16D r6 = r2.A03
            X.141 r8 = r6.A08(r5)
            if (r8 == 0) goto L_0x0357
            X.16p r10 = r6.A05
            r0 = 3
            android.content.ContentValues r14 = new android.content.ContentValues
            r14.<init>(r0)
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "raw_contact_id"
            r14.put(r0, r1)
            r9 = 0
            java.lang.String r0 = "given_name"
            r14.put(r0, r9)
            java.lang.String r0 = "display_name"
            r14.put(r0, r9)
            r7 = 0
            X.16r r0 = r10.A00     // Catch:{ IllegalArgumentException -> 0x0361 }
            X.1M0 r4 = r0.A04()     // Catch:{ IllegalArgumentException -> 0x0361 }
            X.71s r15 = r4.B1k()     // Catch:{ all -> 0x034d }
            java.lang.String r13 = "wa_contacts"
            java.lang.String r12 = "wa_contacts._id = ?"
            java.lang.String[] r11 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0343 }
            long r0 = r8.A0I()     // Catch:{ all -> 0x0343 }
            X.C36351kA.A1V(r11, r7, r0)     // Catch:{ all -> 0x0343 }
            long r13 = X.C229416o.A01(r14, r4, r13, r12, r11)     // Catch:{ all -> 0x0343 }
            r11 = 1
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0339
            r7 = 1
        L_0x0339:
            r15.A00()     // Catch:{ all -> 0x0343 }
            r15.close()     // Catch:{ all -> 0x034d }
            r4.close()     // Catch:{ IllegalArgumentException -> 0x0361 }
            goto L_0x0374
        L_0x0343:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0348 }
            goto L_0x034c
        L_0x0348:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x034d }
        L_0x034c:
            throw r1     // Catch:{ all -> 0x034d }
        L_0x034d:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0352 }
            goto L_0x0356
        L_0x0352:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x0361 }
        L_0x0356:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0361 }
        L_0x0357:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ContactManager/removeContactSyncd attempting to remove contact that is not in db with jid="
            X.C36321k7.A1J(r5, r0, r1)
            goto L_0x0389
        L_0x0361:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contact-mgr-db/unable to remove contact from syncd mutation "
            r1.append(r0)
            X.11F r0 = r8.A0H
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            X.C18740tg.A08(r0, r4)
        L_0x0374:
            r8.A0P = r9
            r8.A0R = r9
            if (r7 == 0) goto L_0x0389
            X.005 r0 = r10.A08
            java.lang.Object r1 = r0.get()
            X.2ZF r1 = (X.AnonymousClass2ZF) r1
            java.util.Set r0 = java.util.Collections.singleton(r8)
            r1.A01(r0)
        L_0x0389:
            X.16z r0 = r6.A04
            java.util.Map r0 = r0.A01
            r0.remove(r5)
            goto L_0x02e5
        L_0x0392:
            X.71s r2 = r4.B1k()     // Catch:{ all -> 0x03b7 }
            X.14e r1 = r4.A02     // Catch:{ all -> 0x03ad }
            java.util.Set r0 = java.util.Collections.singleton(r3)     // Catch:{ all -> 0x03ad }
            java.lang.String[] r0 = X.C201839kV.A02(r0)     // Catch:{ all -> 0x03ad }
            X.AnonymousClass1AC.A08(r1, r0)     // Catch:{ all -> 0x03ad }
            r2.A00()     // Catch:{ all -> 0x03ad }
            r2.close()     // Catch:{ all -> 0x03b7 }
            r4.close()
            return
        L_0x03ad:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x03b2 }
            goto L_0x03b6
        L_0x03b2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03b7 }
        L_0x03b6:
            throw r1     // Catch:{ all -> 0x03b7 }
        L_0x03b7:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x03bc }
            throw r1
        L_0x03bc:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x03c1:
            java.lang.String r0 = "ContactMutationHandler/handleMutation received undefined SyncD operation"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2FS.A0G(X.9k5, X.9k5):void");
    }

    public List A0J(List list) {
        PhoneUserJid A0n = C36441kJ.A0n(this.A02);
        if (A0n == null) {
            Log.e("contact-mutation-handler/createBootstrapMutations me is null");
            return Collections.emptyList();
        }
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass16D r0 = this.A03;
        r0.A0i(A0I);
        AnonymousClass141 A0E2 = r0.A0E(A0n, false);
        if (A0E2 != null && r0.A05.A0Z(A0E2) && !A0I.contains(A0E2)) {
            A0I.add(A0E2);
        }
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            UserJid A0i = C36391kE.A0i(A0f);
            if (A0i != null) {
                A0J.put(A0i, A0f);
            }
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        ArrayList A0I3 = AnonymousClass001.A0I();
        ArrayList A0I4 = AnonymousClass001.A0I();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass36J r2 = (AnonymousClass36J) it2.next();
            AnonymousClass11F r9 = r2.A00.A06;
            if (r9 instanceof PhoneUserJid) {
                Log.i("contact-mutation-handler/createBootstrapMutations attempting to add jid from 1:1 chat");
                A00(r9, A0n, A0I2, A0J);
            } else if (AnonymousClass143.A0G(r9)) {
                C36321k7.A1K(r9, "contact-mutation-handler/createBootstrapMutations attempting to add jids that messaged in group or were mentioned: ", AnonymousClass000.A0u());
                Iterator it3 = r2.A02.iterator();
                while (it3.hasNext()) {
                    AnonymousClass3T1 A0l = C36391kE.A0l(it3);
                    A00(A0l.A0J(), A0n, A0I3, A0J);
                    Iterator it4 = C65713Te.A02(UserJid.class, A0l.A0w).iterator();
                    while (it4.hasNext()) {
                        A00((Jid) it4.next(), A0n, A0I3, A0J);
                    }
                }
                AnonymousClass17X r02 = this.A0E;
                GroupJid A0l2 = C36441kJ.A0l(r9);
                C18740tg.A06(A0l2);
                C20760y7 A062 = r02.A07.A0C(A0l2).A06();
                C36321k7.A1K(r9, "contact-mutation-handler/createBootstrapMutations attempting to add all participant jids for group: ", AnonymousClass000.A0u());
                C225614x it5 = A062.iterator();
                while (it5.hasNext()) {
                    A00((Jid) it5.next(), A0n, A0I4, A0J);
                }
            }
        }
        Collection[] collectionArr = new Collection[4];
        collectionArr[0] = A0I2;
        C36411kG.A1Q(A0I3, A0I4, collectionArr, 1);
        collectionArr[3] = A0J.keySet();
        List<Collection> asList = Arrays.asList(collectionArr);
        ArrayList A0I5 = AnonymousClass001.A0I();
        for (Collection addAll : asList) {
            A0I5.addAll(addAll);
        }
        return A0I(C199769fw.A03, A0I5);
    }

    public AnonymousClass2FS(C19730wQ r2, AnonymousClass16D r3, C64523Oi r4, AnonymousClass171 r5, C20430xY r6, C19980wp r7, C19970wo r8, C19630wG r9, AnonymousClass17X r10, AnonymousClass12O r11, AnonymousClass1AC r12, C20810yC r13, C19770wU r14, AnonymousClass199 r15) {
        super(r12);
        this.A0D = r8;
        this.A09 = r13;
        this.A02 = r2;
        this.A07 = r9;
        this.A0A = r14;
        this.A0B = r15;
        this.A03 = r3;
        this.A0C = r5;
        this.A0F = r11;
        this.A05 = r6;
        this.A08 = r12;
        this.A04 = r4;
        this.A0E = r10;
        this.A06 = r7;
    }

    public static void A00(Jid jid, UserJid userJid, List list, Map map) {
        UserJid A0b = C36401kF.A0b(jid);
        if (A0b != null && !userJid.equals(jid) && map.containsKey(A0b)) {
            C36321k7.A1K(A0b, "contact-mutation-handler/populateJidList adding jid: ", AnonymousClass000.A0u());
            list.add(A0b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r5 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0I(X.C199769fw r20, java.util.Collection r21) {
        /*
            r19 = this;
            java.util.HashSet r4 = X.C36441kJ.A16()
            int r0 = r21.size()
            java.util.ArrayList r3 = X.C36441kJ.A14(r0)
            r2 = r19
            X.0wo r0 = r2.A0D
            long r16 = X.C19970wo.A00(r0)
            java.util.Iterator r7 = r21.iterator()
        L_0x0018:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0081
            com.whatsapp.jid.UserJid r12 = X.C36441kJ.A0o(r7)
            boolean r0 = r4.contains(r12)
            if (r0 != 0) goto L_0x0018
            X.9fw r6 = X.C199769fw.A03
            r9 = r20
            boolean r0 = r9.equals(r6)
            r14 = 0
            if (r0 == 0) goto L_0x007f
            X.16D r1 = r2.A03
            r0 = 1
            X.141 r5 = r1.A0E(r12, r0)
            if (r5 != 0) goto L_0x0054
        L_0x003c:
            boolean r0 = r9.equals(r6)
            if (r0 == 0) goto L_0x0054
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contact-sync-handler/create-contact-mutations given contact "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " doesn't exist in DB but should"
            X.C36321k7.A1Z(r1, r0)
            goto L_0x0018
        L_0x0054:
            boolean r0 = r12 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x007d
            X.12O r1 = r2.A0F
            r0 = r12
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            X.13w r11 = r1.A09(r0)
        L_0x0061:
            if (r5 == 0) goto L_0x007b
            java.lang.String r14 = r5.A0R
            X.171 r0 = r2.A0C
            java.lang.String r15 = r0.A0H(r5)
        L_0x006b:
            r18 = 0
            r10 = 0
            X.2Lk r8 = new X.2Lk
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r18)
            r3.add(r8)
            r4.add(r12)
            goto L_0x0018
        L_0x007b:
            r15 = r14
            goto L_0x006b
        L_0x007d:
            r11 = r14
            goto L_0x0061
        L_0x007f:
            r5 = r14
            goto L_0x003c
        L_0x0081:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2FS.A0I(X.9fw, java.util.Collection):java.util.ArrayList");
    }
}
