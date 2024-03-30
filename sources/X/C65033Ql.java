package X;

import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ql  reason: invalid class name and case insensitive filesystem */
public class C65033Ql {
    public final AnonymousClass16D A00;
    public final C21060yb A01;
    public final C19630wG A02;
    public final C18820ts A03;
    public final C65643Sx A04 = new C65643Sx();

    public ArrayList A01(List list) {
        int i = 0;
        int i2 = 0;
        ArrayList A0r = C36361kB.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            C65033Ql r0 = new C65033Ql(this.A00, this.A01, this.A02, this.A03);
            try {
                r0.A05(A0C);
                C65643Sx r1 = r0.A04;
                A0r.add(new AnonymousClass363(A0C, r1));
                AnonymousClass361 r12 = r1.A0C;
                i2 += r12.A01;
                i += r12.A00;
            } catch (AnonymousClass1YJ unused) {
            }
        }
        if (i2 > 0 || i > 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("contactstruct/construct/too_long=");
            A0u.append(i2);
            C36321k7.A1U("; exceed_max=", A0u, i);
        }
        return A0r;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.AnonymousClass363 A03(X.AnonymousClass2bX r9) {
        /*
            r8 = this;
            monitor-enter(r9)
            java.lang.Object r7 = r9.A1M     // Catch:{ all -> 0x0039 }
            monitor-enter(r7)     // Catch:{ all -> 0x0039 }
            X.363 r6 = r9.A02     // Catch:{ all -> 0x0036 }
            monitor-exit(r7)     // Catch:{ all -> 0x0036 }
            if (r6 != 0) goto L_0x0034
            r6 = 0
            java.lang.String r5 = r9.A1X()     // Catch:{ 1YJ -> 0x002e }
            X.0wG r4 = r8.A02     // Catch:{ 1YJ -> 0x002e }
            X.16D r3 = r8.A00     // Catch:{ 1YJ -> 0x002e }
            X.0yb r2 = r8.A01     // Catch:{ 1YJ -> 0x002e }
            X.0ts r1 = r8.A03     // Catch:{ 1YJ -> 0x002e }
            X.3Ql r0 = new X.3Ql     // Catch:{ 1YJ -> 0x002e }
            r0.<init>(r3, r2, r4, r1)     // Catch:{ 1YJ -> 0x002e }
            r0.A05(r5)     // Catch:{ 1YJ -> 0x002e }
            X.3Sx r1 = r0.A04     // Catch:{ 1YJ -> 0x002e }
            X.363 r0 = new X.363     // Catch:{ 1YJ -> 0x002e }
            r0.<init>(r5, r1)     // Catch:{ 1YJ -> 0x002e }
            monitor-enter(r7)     // Catch:{ 1YJ -> 0x002e }
            r9.A02 = r0     // Catch:{ all -> 0x002b }
            monitor-exit(r7)     // Catch:{ all -> 0x002b }
            monitor-exit(r9)     // Catch:{ all -> 0x0039 }
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ 1YJ -> 0x002e }
        L_0x002e:
            r1 = move-exception
            java.lang.String r0 = "Can't read VCard contact."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0039 }
        L_0x0034:
            monitor-exit(r9)     // Catch:{ all -> 0x0039 }
            return r6
        L_0x0036:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0039 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65033Ql.A03(X.2bX):X.363");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v171, resolved type: X.3A9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v246, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v247, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0587, code lost:
        r1 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05e2, code lost:
        r1 = r4.A04;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C602837f r26) {
        /*
            r25 = this;
            r5 = 0
            r2 = r26
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "VCARD"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05f9
            java.util.ArrayList r0 = r2.A02
            java.util.Iterator r18 = r0.iterator()
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
        L_0x0019:
            boolean r0 = r18.hasNext()
            r4 = r25
            if (r0 == 0) goto L_0x0585
            java.lang.Object r3 = r18.next()
            X.3KL r3 = (X.AnonymousClass3KL) r3
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r3.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "VERSION"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "FN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.3Sx r0 = r4.A04
            X.3F9 r1 = r0.A0A
            java.lang.String r0 = r3.A02
            r1.A01 = r0
            goto L_0x0019
        L_0x004a:
            java.lang.String r0 = "NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            X.3Sx r0 = r4.A04
            X.3F9 r2 = r0.A0A
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = r3.A02
            r2.A01 = r0
            goto L_0x0019
        L_0x005f:
            java.lang.String r0 = "N"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0071
            X.3Sx r0 = r4.A04
            X.3F9 r1 = r0.A0A
            java.util.List r0 = r3.A03
            X.C65643Sx.A02(r0, r1)
            goto L_0x0019
        L_0x0071:
            java.lang.String r0 = "SORT-STRING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0080
            X.3Sx r1 = r4.A04
            java.lang.String r0 = r3.A02
            r1.A01 = r0
            goto L_0x0019
        L_0x0080:
            java.lang.String r0 = "SOUND"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bb
            java.util.Set r1 = r3.A04
            java.lang.String r0 = "X-IRMC-N"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0557
            X.3Sx r7 = r4.A04
            java.lang.String r0 = r7.A01
            if (r0 != 0) goto L_0x0557
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r4 = r3.A02
            int r3 = r4.length()
            r2 = 0
        L_0x00a3:
            if (r2 >= r3) goto L_0x00b3
            char r1 = r4.charAt(r2)
            r0 = 59
            if (r1 == r0) goto L_0x00b0
            r6.append(r1)
        L_0x00b0:
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00b3:
            java.lang.String r0 = r6.toString()
            r7.A01 = r0
            goto L_0x0019
        L_0x00bb:
            java.lang.String r0 = "ADR"
            boolean r0 = r1.equals(r0)
            java.lang.String r10 = "X-"
            r2 = -1
            java.lang.String r9 = "PREF"
            java.lang.String r6 = ""
            java.lang.String r8 = "WORK"
            java.lang.String r7 = "HOME"
            if (r0 == 0) goto L_0x01df
            java.util.List r13 = r3.A03
            java.util.Iterator r1 = r13.iterator()
        L_0x00d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00d4
            java.util.Set r0 = r3.A04
            java.util.Iterator r19 = r0.iterator()
            r12 = r6
            r11 = 0
        L_0x00ec:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0155
            java.lang.String r1 = X.AnonymousClass001.A0C(r19)
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0102
            if (r16 != 0) goto L_0x0102
            r16 = 1
            r11 = 1
            goto L_0x00ec
        L_0x0102:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x010b
            r12 = r6
            r2 = 1
            goto L_0x00ec
        L_0x010b:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "COMPANY"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "POSTAL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "PARCEL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "DOM"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "INTL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x014e
            if (r2 >= 0) goto L_0x00ec
            r0 = 2
            java.lang.String r12 = r1.substring(r0)
        L_0x014c:
            r2 = 0
            goto L_0x00ec
        L_0x014e:
            if (r2 >= 0) goto L_0x00ec
            r12 = r1
            goto L_0x014c
        L_0x0152:
            r12 = r6
            r2 = 2
            goto L_0x00ec
        L_0x0155:
            if (r2 >= 0) goto L_0x0158
            r2 = 1
        L_0x0158:
            int r1 = r13.size()
            r0 = 1
            if (r1 <= r0) goto L_0x01db
            X.3PZ r7 = new X.3PZ
            r7.<init>()
            int r1 = r13.size()
            r0 = 2
            if (r1 <= r0) goto L_0x0171
            java.lang.String r0 = X.C36401kF.A0s(r13, r0)
            r7.A03 = r0
        L_0x0171:
            int r1 = r13.size()
            r0 = 3
            if (r1 <= r0) goto L_0x017e
            java.lang.String r0 = X.C36401kF.A0s(r13, r0)
            r7.A00 = r0
        L_0x017e:
            int r1 = r13.size()
            r0 = 4
            if (r1 <= r0) goto L_0x018b
            java.lang.String r0 = X.C36401kF.A0s(r13, r0)
            r7.A02 = r0
        L_0x018b:
            int r1 = r13.size()
            r0 = 5
            if (r1 <= r0) goto L_0x0198
            java.lang.String r0 = X.C36401kF.A0s(r13, r0)
            r7.A04 = r0
        L_0x0198:
            int r1 = r13.size()
            r0 = 6
            if (r1 <= r0) goto L_0x01a5
            java.lang.String r0 = X.C36401kF.A0s(r13, r0)
            r7.A01 = r0
        L_0x01a5:
            int r1 = r13.size()
            r0 = 7
            if (r1 <= r0) goto L_0x01af
            r13.get(r0)
        L_0x01af:
            java.lang.String r0 = r7.toString()
            java.lang.String r6 = r0.trim()
        L_0x01b7:
            X.3Sx r0 = r4.A04
            java.util.List r3 = r0.A03
            if (r3 != 0) goto L_0x01c3
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r0.A03 = r3
        L_0x01c3:
            X.3A9 r1 = new X.3A9
            r1.<init>()
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            r1.A01 = r0
            r1.A00 = r2
            r1.A02 = r6
            r1.A04 = r7
            r1.A03 = r12
            r1.A05 = r11
            r3.add(r1)
            goto L_0x0019
        L_0x01db:
            java.lang.String r6 = r3.A02
            r7 = 0
            goto L_0x01b7
        L_0x01df:
            java.lang.String r0 = "ORG"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x022f
            java.util.Set r0 = r3.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x01ed:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0201
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x01ed
            if (r14 != 0) goto L_0x01ed
            r14 = 1
            goto L_0x01ed
        L_0x0201:
            X.3Sx r4 = r4.A04
            java.util.List r0 = r3.A03
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.util.Iterator r1 = r0.iterator()
        L_0x020d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0226
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)
            r2.append(r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x020d
            r0 = 32
            r2.append(r0)
            goto L_0x020d
        L_0x0226:
            java.lang.String r0 = r2.toString()
            r4.A05(r0, r6)
            goto L_0x0019
        L_0x022f:
            java.lang.String r0 = "TITLE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x055e
            java.lang.String r0 = "ROLE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x055e
            java.lang.String r0 = "PHOTO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0267
            java.lang.String r0 = r3.A02
            byte[] r2 = r0.getBytes()
            X.3Sx r1 = r4.A04
            r0 = 0
            r1.A0B = r0
            if (r2 == 0) goto L_0x0019
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0019
            byte[] r0 = android.util.Base64.decode(r2, r5)     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException -> 0x025f }
            r1.A0B = r0     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException -> 0x025f }
            goto L_0x0019
        L_0x025f:
            r1 = move-exception
            java.lang.String r0 = "contactstruct/constructcontactfromvnode/base64-decode/error"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0019
        L_0x0267:
            java.lang.String r0 = "LOGO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = "name/LOGO/we_don't_support"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0019
        L_0x0276:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r1.equals(r0)
            java.lang.String r6 = "CELL"
            if (r0 == 0) goto L_0x02f2
            java.util.Set r0 = r3.A04
            java.util.Iterator r13 = r0.iterator()
            r12 = 0
            r11 = 0
        L_0x0288:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02ce
            java.lang.String r1 = X.AnonymousClass001.A0C(r13)
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x029d
            if (r15 != 0) goto L_0x029d
            r15 = 1
            r11 = 1
            goto L_0x0288
        L_0x029d:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x02a5
            r2 = 1
            goto L_0x0288
        L_0x02a5:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x02ad
            r2 = 2
            goto L_0x0288
        L_0x02ad:
            boolean r0 = r1.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x02b5
            r2 = 4
            goto L_0x0288
        L_0x02b5:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x02cb
            if (r2 >= 0) goto L_0x0288
            r0 = 2
            java.lang.String r1 = r1.substring(r0)
        L_0x02c8:
            r12 = r1
            r2 = 0
            goto L_0x0288
        L_0x02cb:
            if (r2 >= 0) goto L_0x0288
            goto L_0x02c8
        L_0x02ce:
            if (r2 >= 0) goto L_0x02d1
            r2 = 3
        L_0x02d1:
            X.3Sx r0 = r4.A04
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r4 = android.provider.ContactsContract.CommonDataKinds.Email.class
            java.lang.String r3 = r3.A02
            java.util.List r1 = r0.A03
            if (r1 != 0) goto L_0x02e1
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r0.A03 = r1
        L_0x02e1:
            X.3A9 r0 = new X.3A9
            r0.<init>()
            r0.A01 = r4
            r0.A00 = r2
            r0.A02 = r3
            r0.A03 = r12
            r0.A05 = r11
            goto L_0x03c3
        L_0x02f2:
            java.lang.String r0 = "TEL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b5
            java.util.Set r0 = r3.A04
            java.util.Iterator r12 = r0.iterator()
            r22 = r7
            r11 = 0
            r24 = 0
        L_0x0305:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0398
            java.lang.String r1 = X.AnonymousClass001.A0C(r12)
            if (r11 == 0) goto L_0x032b
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x0323
            r2 = 5
        L_0x0318:
            android.content.ContentValues r1 = r3.A00
            java.lang.String r0 = "waId"
            java.lang.String r1 = r1.getAsString(r0)
            if (r1 == 0) goto L_0x03a4
            goto L_0x039d
        L_0x0323:
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x0398
            r2 = 4
            goto L_0x0318
        L_0x032b:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0338
            if (r17 != 0) goto L_0x0338
            r17 = 1
            r24 = 1
            goto L_0x0305
        L_0x0338:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0340
            r2 = 1
            goto L_0x0305
        L_0x0340:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x0348
            r2 = 3
            goto L_0x0305
        L_0x0348:
            boolean r0 = r1.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x0395
            java.lang.String r0 = "MOBILE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0395
            java.lang.String r0 = "PAGER"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0360
            r2 = 6
            goto L_0x0305
        L_0x0360:
            java.lang.String r0 = "FAX"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x036a
            r11 = 1
            goto L_0x0305
        L_0x036a:
            java.lang.String r0 = "VOICE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0305
            java.lang.String r0 = "MSG"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0305
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x0390
            if (r2 >= 0) goto L_0x0305
            r0 = 2
            java.lang.String r22 = r1.substring(r0)
        L_0x038d:
            r2 = 0
            goto L_0x0305
        L_0x0390:
            if (r2 >= 0) goto L_0x0305
            r22 = r1
            goto L_0x038d
        L_0x0395:
            r2 = 2
            goto L_0x0305
        L_0x0398:
            if (r2 >= 0) goto L_0x0318
            r2 = 1
            goto L_0x0318
        L_0x039d:
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY     // Catch:{ 0wR -> 0x03a4 }
            com.whatsapp.jid.PhoneUserJid r20 = X.C222913s.A00(r1)     // Catch:{ 0wR -> 0x03a4 }
            goto L_0x03a6
        L_0x03a4:
            r20 = 0
        L_0x03a6:
            X.3Sx r1 = r4.A04
            java.lang.String r0 = r3.A02
            r19 = r1
            r21 = r0
            r23 = r2
            r19.A04(r20, r21, r22, r23, r24)
            goto L_0x0019
        L_0x03b5:
            java.lang.String r0 = "NOTE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03c8
            X.3Sx r0 = r4.A04
            java.util.List r1 = r0.A04
            java.lang.String r0 = r3.A02
        L_0x03c3:
            r1.add(r0)
            goto L_0x0019
        L_0x03c8:
            java.lang.String r0 = "BDAY"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03f7
            X.3Sx r4 = r4.A04
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L_0x03f2
            java.lang.String r0 = "1604"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x03f2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "-"
            r1.append(r0)
            r0 = 4
            java.lang.String r0 = r2.substring(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r3.A02 = r0
        L_0x03f2:
            r4.A06(r3)
            goto L_0x0019
        L_0x03f7:
            java.lang.String r0 = "URL"
            boolean r0 = r1.equals(r0)
            java.lang.String r2 = "PROFILE"
            if (r0 == 0) goto L_0x0471
            java.lang.String r6 = r3.A02
            java.util.Set r0 = r3.A04
            java.util.Iterator r9 = r0.iterator()
            r3 = -1
        L_0x040a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0454
            java.lang.String r1 = X.AnonymousClass001.A0C(r9)
            java.lang.String r0 = "BLOG"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x041e
            r3 = 2
            goto L_0x040a
        L_0x041e:
            java.lang.String r0 = "FTP"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0428
            r3 = 6
            goto L_0x040a
        L_0x0428:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0430
            r3 = 4
            goto L_0x040a
        L_0x0430:
            java.lang.String r0 = "HOMEPAGE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x043a
            r3 = 1
            goto L_0x040a
        L_0x043a:
            java.lang.String r0 = "OTHER"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0444
            r3 = 7
            goto L_0x040a
        L_0x0444:
            boolean r0 = r1.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x044c
            r3 = 3
            goto L_0x040a
        L_0x044c:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x040a
            r3 = 5
            goto L_0x040a
        L_0x0454:
            X.3Sx r0 = r4.A04
            java.util.List r1 = r0.A07
            if (r1 != 0) goto L_0x0460
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r0.A07 = r1
        L_0x0460:
            X.362 r0 = new X.362
            r0.<init>()
            r0.A00 = r3
            X.C18740tg.A06(r6)
            r0.A01 = r6
            r1.add(r0)
            goto L_0x0019
        L_0x0471:
            java.lang.String r0 = "REV"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "UID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "KEY"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "MAILER"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "TZ"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "GEO"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "NICKNAME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "CLASS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "CATEGORIES"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "SOURCE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "PRODID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.lang.String r0 = "X-PHONETIC-FIRST-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04e1
            X.3Sx r0 = r4.A04
            X.3F9 r1 = r0.A0A
            java.lang.String r0 = r3.A02
            r1.A04 = r0
            goto L_0x0019
        L_0x04e1:
            java.lang.String r0 = "X-PHONETIC-MIDDLE-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "X-PHONETIC-LAST-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04fb
            X.3Sx r0 = r4.A04
            X.3F9 r1 = r0.A0A
            java.lang.String r0 = r3.A02
            r1.A05 = r0
            goto L_0x0019
        L_0x04fb:
            java.lang.String r0 = "X-WA-BIZ-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x050d
            X.3Sx r0 = r4.A04
            X.3F9 r1 = r0.A0A
            java.lang.String r0 = r3.A02
            r1.A08 = r0
            goto L_0x0019
        L_0x050d:
            java.lang.String r0 = "X-WA-BIZ-DESCRIPTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x051d
            X.3Sx r1 = r4.A04
            java.lang.String r0 = r3.A02
            r1.A02 = r0
            goto L_0x0019
        L_0x051d:
            java.lang.String r0 = "X-WA-BIZ-AUTOMATED-TYPE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x052d
            X.3Sx r1 = r4.A04
            java.lang.String r0 = r3.A02
            r1.A00 = r0
            goto L_0x0019
        L_0x052d:
            java.lang.String r0 = "X-WA-LID"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0545
            X.3Sx r0 = r4.A04
            X.35z r2 = r0.A09
            java.lang.String r1 = r3.A02
            X.6Nb r0 = X.C223313w.A01
            X.13w r0 = r0.A01(r1)
            r2.A00 = r0
            goto L_0x0019
        L_0x0545:
            java.lang.String r0 = "X-WA-LID-DISPLAY-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0557
            X.3Sx r0 = r4.A04
            X.35z r1 = r0.A09
            java.lang.String r0 = r3.A02
            r1.A01 = r0
            goto L_0x0019
        L_0x0557:
            X.3Sx r0 = r4.A04
            r0.A06(r3)
            goto L_0x0019
        L_0x055e:
            X.3Sx r4 = r4.A04
            java.lang.String r3 = r3.A02
            java.util.List r0 = r4.A05
            if (r0 != 0) goto L_0x056c
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r4.A05 = r0
        L_0x056c:
            int r2 = r0.size()
            r1 = 1
            if (r2 != 0) goto L_0x0578
            r0 = 0
            r4.A05(r6, r0)
            r2 = 1
        L_0x0578:
            java.util.List r0 = r4.A05
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            X.360 r0 = (X.AnonymousClass360) r0
            r0.A01 = r3
            goto L_0x0019
        L_0x0585:
            if (r17 != 0) goto L_0x059e
            X.3Sx r1 = r4.A04
            java.util.List r0 = r1.A06
            if (r0 == 0) goto L_0x059e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x059e
            java.util.List r0 = r1.A06
            java.lang.Object r1 = r0.get(r5)
            X.39e r1 = (X.C607439e) r1
            r0 = 1
            r1.A04 = r0
        L_0x059e:
            if (r16 != 0) goto L_0x05bf
            X.3Sx r0 = r4.A04
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x05bf
            java.util.Iterator r3 = r0.iterator()
        L_0x05aa:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05bf
            java.lang.Object r2 = r3.next()
            X.3A9 r2 = (X.AnonymousClass3A9) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r1 != r0) goto L_0x05aa
            r0 = 1
            r2.A05 = r0
        L_0x05bf:
            if (r15 != 0) goto L_0x05e0
            X.3Sx r0 = r4.A04
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x05e0
            java.util.Iterator r3 = r0.iterator()
        L_0x05cb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05e0
            java.lang.Object r2 = r3.next()
            X.3A9 r2 = (X.AnonymousClass3A9) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x05cb
            r0 = 1
            r2.A05 = r0
        L_0x05e0:
            if (r14 != 0) goto L_0x05f3
            X.3Sx r1 = r4.A04
            java.util.List r0 = r1.A05
            if (r0 == 0) goto L_0x05f3
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x05f3
            java.util.List r0 = r1.A05
            r0.get(r5)
        L_0x05f3:
            X.3Sx r0 = r4.A04
            r4.A07(r0)
            return
        L_0x05f9:
            java.lang.String r1 = "Non VCARD data is inserted."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.1YJ r0 = new X.1YJ
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65033Ql.A06(X.37f):void");
    }

    public HashMap A02(String str) {
        HashMap A0J = AnonymousClass001.A0J();
        Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", this.A02.A00.getString(R.string.f12nameremoved)).appendQueryParameter("account_type", "com.whatsapp").build();
        C21050ya A0z = C36431kI.A0z(this.A01);
        String[] A1R = C36441kJ.A1R();
        A1R[0] = str;
        Cursor A032 = A0z.A03(build, new String[]{"sync1", "_id"}, "contact_id=?", A1R, (String) null);
        if (A032 != null) {
            while (A032.moveToNext()) {
                try {
                    String A0f = C36341k9.A0f(A032, "_id");
                    UserJid A0l = C36431kI.A0l(C36341k9.A0f(A032, "sync1"));
                    if (A0l != null) {
                        A0J.put(A0f, A0l);
                    }
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
        }
        if (A032 != null) {
            A032.close();
        }
        return A0J;
    }

    public void A04(AnonymousClass1KK r8) {
        String str;
        C65643Sx r4 = this.A04;
        List<C607439e> list = r4.A06;
        if (list != null) {
            for (C607439e r3 : list) {
                AnonymousClass141 A0F = this.A00.A0F(r3.A02);
                if (A0F != null) {
                    if (A0F.A0C()) {
                        AnonymousClass3F9 r1 = r4.A0A;
                        r1.A08 = r1.A01;
                        UserJid A0l = C36351kA.A0l(A0F);
                        String A08 = r8.A08(A0l);
                        if (!TextUtils.isEmpty(A08)) {
                            r4.A02 = A08;
                        }
                        if (A0l != null) {
                            int A05 = r8.A06.A05(A0l);
                            if (A05 == 1) {
                                str = "1p_partial";
                            } else if (A05 == 2) {
                                str = "3p_full";
                            }
                            r4.A00 = str;
                        }
                    }
                    UserJid A0l2 = C36351kA.A0l(A0F);
                    if (A0F.A0z && A0l2 != null) {
                        r3.A01 = A0l2;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void A07(C65643Sx r9) {
        Cursor A032;
        boolean z;
        Map map;
        String str;
        String A042;
        String str2;
        String str3;
        String str4;
        List list = r9.A06;
        if (list != null) {
            ArrayList A0r = C36361kB.A0r(list);
            for (C607439e r1 : r9.A06) {
                if (r1.A01 == null && (str4 = r1.A02) != null) {
                    int indexOf = str4.indexOf(44);
                    if (indexOf != -1) {
                        str4 = str4.substring(0, indexOf);
                    }
                    A0r.add(PhoneNumberUtils.stripSeparators(str4.trim()));
                }
            }
            SystemClock.uptimeMillis();
            C229516p r7 = this.A00.A05;
            if (A0r.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                boolean z2 = false;
                if (A0r.size() <= 10) {
                    z2 = true;
                }
                C18740tg.A0C(z2);
                Iterator it = A0r.iterator();
                while (it.hasNext()) {
                    String A0C = AnonymousClass001.A0C(it);
                    if (A0C != null) {
                        int length = A0C.length();
                        z = true;
                        if (length <= 30) {
                            C18740tg.A0C(z);
                        }
                    }
                    z = false;
                    C18740tg.A0C(z);
                }
                HashMap hashMap = new HashMap(A0r.size());
                AnonymousClass1M0 A033 = r7.A00.get();
                try {
                    int size = A0r.size();
                    String str5 = AnonymousClass2x7.A08;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("SELECT wa_contacts.jid, number FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE ");
                    C36351kA.A1O("number IN ", A0u, size);
                    A032 = C229416o.A03(A033, A0u.toString(), "GET_JIDS_BY_PHONE_NUMBERS", C36371kC.A1b(A0r, 0));
                    int columnIndexOrThrow = A032.getColumnIndexOrThrow("jid");
                    int columnIndexOrThrow2 = A032.getColumnIndexOrThrow("number");
                    while (A032.moveToNext()) {
                        UserJid A0l = C36431kI.A0l(A032.getString(columnIndexOrThrow));
                        String string = A032.getString(columnIndexOrThrow2);
                        if (!(A0l == null || string == null)) {
                            hashMap.put(string, A0l);
                        }
                    }
                    A032.close();
                    A033.close();
                    map = hashMap;
                } catch (Throwable th) {
                    try {
                        A033.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            SystemClock.uptimeMillis();
            for (C607439e r3 : r9.A06) {
                AnonymousClass11F r0 = r3.A01;
                if (r0 == null) {
                    String str6 = r3.A02;
                    int indexOf2 = str6.indexOf(44);
                    if (indexOf2 != -1) {
                        str6 = str6.substring(0, indexOf2);
                    }
                    r0 = (AnonymousClass11F) map.get(PhoneNumberUtils.stripSeparators(str6.trim()));
                    if (r0 == null) {
                        A042 = r3.A02.trim();
                        r3.A02 = A042;
                    }
                }
                A042 = AnonymousClass3U8.A04(r0);
                if (!(A042 == null || (str2 = r3.A02) == null || r3.A01 != null)) {
                    int indexOf3 = str2.indexOf(44);
                    if (indexOf3 != -1) {
                        str3 = str2.substring(indexOf3 + 1);
                    } else {
                        str3 = "";
                    }
                    String stripSeparators = PhoneNumberUtils.stripSeparators(str3.trim());
                    if (!TextUtils.isEmpty(stripSeparators)) {
                        StringBuilder A0v = AnonymousClass000.A0v(A042);
                        A0v.append(',');
                        A042 = AnonymousClass000.A0q(stripSeparators, A0v);
                    }
                }
                r3.A02 = A042;
            }
            for (C607439e r2 : r9.A06) {
                if (r2.A00 == 0 && ((str = r2.A03) == null || str.equalsIgnoreCase("null"))) {
                    r2.A03 = this.A02.A00.getString(R.string.f12nameremoved);
                }
            }
            return;
        }
        return;
        throw th;
    }

    public C65033Ql(AnonymousClass16D r2, C21060yb r3, C19630wG r4, C18820ts r5) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }

    public String A00(String str) {
        C65643Sx r0;
        C602837f A012 = C65643Sx.A01(str);
        if (A012 != null) {
            Iterator it = A012.A02.iterator();
            AnonymousClass3KL r6 = null;
            AnonymousClass3KL r4 = null;
            AnonymousClass3KL r3 = null;
            while (it.hasNext()) {
                AnonymousClass3KL r2 = (AnonymousClass3KL) it.next();
                String str2 = r2.A01;
                if (!TextUtils.isEmpty(r2.A02)) {
                    if ("FN".equals(str2)) {
                        r6 = r2;
                    } else if ("NAME".equals(str2)) {
                        r4 = r2;
                    } else if ("ORG".equals(str2) && r3 == null) {
                        r3 = r2;
                    }
                }
            }
            if (r6 != null) {
                return r6.A02;
            }
            if (r4 != null) {
                return r4.A02;
            }
            if (r3 != null) {
                List list = r3.A03;
                StringBuilder A0u = AnonymousClass000.A0u();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    A0u.append(AnonymousClass001.A0C(it2));
                    if (it2.hasNext()) {
                        A0u.append(' ');
                    }
                }
                return A0u.toString();
            }
            C65033Ql r02 = new C65033Ql(this.A00, this.A01, this.A02, this.A03);
            try {
                r02.A06(A012);
                r0 = r02.A04;
            } catch (AnonymousClass1YJ unused) {
                r0 = null;
            }
            if (r0 != null) {
                return r0.A03();
            }
        }
        return null;
    }

    public void A05(String str) {
        SystemClock.uptimeMillis();
        C602837f A012 = C65643Sx.A01(str);
        SystemClock.uptimeMillis();
        if (A012 != null) {
            try {
                A06(A012);
                SystemClock.uptimeMillis();
                return;
            } catch (AnonymousClass1YJ unused) {
                Log.e("Failed to construct VCard from node.");
            }
        }
        throw new AnonymousClass1YJ("Invalid VCard node.");
    }
}
