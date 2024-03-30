package X;

import android.database.AbstractCursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4bI  reason: invalid class name and case insensitive filesystem */
public class C91004bI extends AbstractCursor {
    public Map A00 = null;
    public Map A01 = null;
    public final AnonymousClass16K A02;
    public final C21430zE A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass1HX A0A;
    public final AnonymousClass171 A0B;
    public final AnonymousClass1VC A0C;
    public final C119625qB A0D;
    public final AnonymousClass6KI A0E;
    public final AnonymousClass3G0 A0F;
    public final AnonymousClass3S0 A0G;
    public final C128946Ef A0H;
    public final List A0I;
    public final AtomicInteger A0J = new AtomicInteger();
    public final String[] A0K;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.00f} */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getInt(int r14) {
        /*
            r13 = this;
            r0 = -1
            if (r14 == r0) goto L_0x01d8
            int r0 = r13.getPosition()
            X.141 r5 = r13.A00(r0)
            int r0 = r13.A07
            if (r14 != r0) goto L_0x0014
            boolean r0 = r5.A0G()
            return r0
        L_0x0014:
            int r0 = r13.A04
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r14 != r0) goto L_0x00e2
            java.util.Map r4 = r13.A00
            if (r4 != 0) goto L_0x00d6
            X.5qB r4 = r13.A0D
            X.6Ef r0 = r13.A0H
            java.lang.String r9 = r0.A01
            r7 = 0
            X.AnonymousClass00C.A0D(r9, r7)
            X.62w r6 = r4.A01
            X.1VC r0 = r6.A01
            X.0yf r1 = r0.A00
            X.0yi r0 = X.C21100yf.A0O
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x00d0
            X.0wo r0 = r6.A00
            long r10 = X.C19970wo.A00(r0)
            X.1VE r8 = r6.A02
            java.lang.String r3 = "metadata/last_call_ranking_time"
            java.lang.String r1 = X.AnonymousClass1VE.A01(r9, r3)
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r8)
            long r0 = X.C36341k9.A0B(r0, r1)
            long r10 = r10 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d0
            java.lang.String r3 = X.AnonymousClass1VE.A01(r9, r3)
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r8)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            X.0wo r0 = r8.A01
            long r0 = X.C19970wo.A00(r0)
            X.C36341k9.A0w(r2, r3, r0)
            X.1HJ r2 = r4.A00
            r1 = 1000(0x3e8, float:1.401E-42)
            X.6tJ r0 = X.C145076tJ.A00
            java.util.ArrayList r0 = r2.A08(r0, r7, r1)
            long r2 = r6.A00()
            X.0tV r1 = X.C90514aH.A0X(r0)
            X.7UK r0 = new X.7UK
            r0.<init>(r4, r2)
            X.0ih r2 = X.C15060md.A02(r0, r1)
            r1 = 14
            X.7qx r0 = new X.7qx
            r0.<init>(r1)
            X.0id r1 = new X.0id
            r1.<init>(r0, r2)
            X.7T8 r0 = new X.7T8
            r0.<init>(r4)
            X.0ib r2 = new X.0ib
            r2.<init>(r0, r1)
            r0 = 50
            X.0ik r1 = new X.0ik
            r1.<init>(r2, r0)
            X.0iZ r0 = new X.0iZ
            r0.<init>(r1)
            java.util.LinkedHashMap r4 = X.C36431kI.A1G()
            X.0tN r3 = new X.0tN
            r3.<init>((X.C12730iZ) r0)
        L_0x00b0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r2 = r3.next()
            X.0Ug r2 = (X.C06600Ug) r2
            java.lang.Object r0 = r2.A01
            X.AnonymousClass00C.A08(r0)
            X.5Nh r0 = (X.C107265Nh) r0
            X.6by r0 = r0.A04
            com.whatsapp.jid.UserJid r1 = r0.A01
            X.AnonymousClass00C.A08(r1)
            int r0 = r2.A00
            X.C36341k9.A1K(r1, r4, r0)
            goto L_0x00b0
        L_0x00d0:
            X.00f r4 = X.C000400e.A0D()
        L_0x00d4:
            r13.A00 = r4
        L_0x00d6:
            X.11F r1 = r5.A0H
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x01c4
            java.util.Map r0 = r13.A00
            goto L_0x01c0
        L_0x00e2:
            int r0 = r13.A08
            if (r14 != r0) goto L_0x01c5
            java.util.Map r0 = r13.A01
            if (r0 != 0) goto L_0x01b4
            X.6KI r6 = r13.A0E
            X.6Ef r0 = r13.A0H
            java.lang.String r9 = r0.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            X.62w r2 = r6.A02
            X.1VC r0 = r2.A01
            X.0yf r1 = r0.A00
            X.0yi r0 = X.C21100yf.A0O
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x018f
            X.0wo r0 = r2.A00
            long r7 = X.C19970wo.A00(r0)
            X.1VE r4 = r2.A02
            java.lang.String r3 = "metadata/last_message_ranking_time"
            java.lang.String r1 = X.AnonymousClass1VE.A01(r9, r3)
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r4)
            long r0 = X.C36341k9.A0B(r0, r1)
            long r7 = r7 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x018f
            java.lang.String r3 = X.AnonymousClass1VE.A01(r9, r3)
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r4)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            X.0wo r0 = r4.A01
            long r0 = X.C19970wo.A00(r0)
            X.C36341k9.A0w(r2, r3, r0)
            X.12t r1 = r6.A00
            r0 = 0
            X.C220712t.A02(r1, r0)
            X.12q r0 = r6.A01
            java.util.Collection r0 = r0.A0F()
            java.util.ArrayList r3 = X.C36411kG.A13(r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x014d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3Qp r0 = (X.C65073Qp) r0
            X.11F r0 = r0.A06()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0166
            r3.add(r1)
            goto L_0x014d
        L_0x0166:
            r7.add(r1)
            goto L_0x014d
        L_0x016a:
            java.util.LinkedHashMap r4 = X.AnonymousClass6KI.A00(r6, r3)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r7.iterator()
        L_0x0176:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x019d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3Qp r0 = (X.C65073Qp) r0
            X.11F r0 = r0.A06()
            boolean r0 = r0 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0176
            r3.add(r1)
            goto L_0x0176
        L_0x018f:
            X.00f r1 = X.C000400e.A0D()
            X.00f r0 = X.C000400e.A0D()
            X.6AJ r2 = new X.6AJ
            r2.<init>(r1, r0)
            goto L_0x01a6
        L_0x019d:
            java.util.LinkedHashMap r0 = X.AnonymousClass6KI.A00(r6, r3)
            X.6AJ r2 = new X.6AJ
            r2.<init>(r4, r0)
        L_0x01a6:
            java.util.Map r0 = r2.A01
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            r13.A01 = r1
            java.util.Map r0 = r2.A00
            r1.putAll(r0)
        L_0x01b4:
            X.11F r1 = r5.A0H
            java.util.Map r0 = r13.A01
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x01c4
            java.util.Map r0 = r13.A01
        L_0x01c0:
            int r12 = X.C90474aD.A06(r1, r0)
        L_0x01c4:
            return r12
        L_0x01c5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Column #"
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " is not an int."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        L_0x01d8:
            java.lang.String r0 = "Invalid column index"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91004bI.getInt(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r0 == false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getString(int r14) {
        /*
            r13 = this;
            r0 = -1
            if (r14 == r0) goto L_0x01e4
            int r0 = r13.getPosition()
            X.141 r1 = r13.A00(r0)
            int r0 = r13.A06
            if (r14 != r0) goto L_0x001e
            X.3G0 r3 = r13.A0F
            X.6Ef r2 = r13.A0H
            X.11F r0 = X.C36351kA.A0j(r1)
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r3.A01(r0, r2)
            return r0
        L_0x001e:
            int r0 = r13.A05
            if (r14 != r0) goto L_0x0049
            com.whatsapp.jid.UserJid r3 = X.C36351kA.A0l(r1)
            if (r3 == 0) goto L_0x003f
            X.1HX r2 = r13.A0A
            if (r2 == 0) goto L_0x003f
            X.1Hg r0 = r2.A00
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x003f
            boolean r0 = X.C197029b1.A00(r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.A03(r3)
            return r0
        L_0x003f:
            X.171 r2 = r13.A0B
            r0 = 0
            X.34G r0 = r2.A0F(r1, r0)
            java.lang.String r0 = r0.A01
            return r0
        L_0x0049:
            int r0 = r13.A07
            if (r14 == r0) goto L_0x01db
            int r0 = r13.A04
            if (r14 == r0) goto L_0x01db
            int r0 = r13.A08
            if (r14 == r0) goto L_0x01db
            int r0 = r13.A09
            if (r14 != r0) goto L_0x01c8
            X.1VC r0 = r13.A0C
            X.0yC r2 = r0.A01
            r0 = 5340(0x14dc, float:7.483E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x01c6
            X.11F r0 = r1.A0H
            if (r0 == 0) goto L_0x01c6
            java.util.concurrent.atomic.AtomicInteger r0 = r13.A0J
            int r5 = r0.getAndIncrement()
            X.0zE r4 = r13.A03
            r3 = 494354237(0x1d773f3d, float:3.2722871E-21)
            r2 = 0
            r4.BPM(r3, r5, r2)
            int r6 = r13.getPosition()
            if (r6 >= 0) goto L_0x00c1
            java.lang.String r6 = "invalid"
        L_0x0080:
            java.lang.String r0 = "cursor_position"
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (java.lang.String) r6)
            X.11F r0 = r1.A0H
            boolean r0 = r0 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x00a4
            X.11F r0 = X.C36351kA.A0j(r1)
            java.lang.String r6 = X.AnonymousClass3U8.A05(r0)
            if (r6 == 0) goto L_0x00a4
            X.005 r0 = X.AnonymousClass3S0.A04
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.C36361kB.A1Z(r6, r0)
            r6 = 1
            if (r0 != 0) goto L_0x00a5
        L_0x00a4:
            r6 = 0
        L_0x00a5:
            if (r6 == 0) goto L_0x0178
            java.lang.String r0 = "is_privacy_placeholder"
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (boolean) r2)
            X.16K r0 = r13.A02
            java.io.File r1 = r0.A01(r1)
            java.lang.String r0 = "get_file_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)
            r6 = 0
            if (r1 == 0) goto L_0x0171
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0171
            goto L_0x00e7
        L_0x00c1:
            r0 = 10
            if (r6 >= r0) goto L_0x00c8
            java.lang.String r6 = "<10"
            goto L_0x0080
        L_0x00c8:
            r0 = 50
            if (r6 >= r0) goto L_0x00cf
            java.lang.String r6 = "<50"
            goto L_0x0080
        L_0x00cf:
            r0 = 100
            if (r6 >= r0) goto L_0x00d6
            java.lang.String r6 = "<100"
            goto L_0x0080
        L_0x00d6:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r6 >= r0) goto L_0x00dd
            java.lang.String r6 = "<500"
            goto L_0x0080
        L_0x00dd:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r6 >= r0) goto L_0x00e4
            java.lang.String r6 = "<1000"
            goto L_0x0080
        L_0x00e4:
            java.lang.String r6 = ">=1000"
            goto L_0x0080
        L_0x00e7:
            java.io.FileInputStream r7 = X.C90524aI.A0U(r1)     // Catch:{ IOException -> 0x0187 }
            long r0 = r1.length()     // Catch:{ all -> 0x0167 }
            int r11 = (int) r0     // Catch:{ all -> 0x0167 }
            java.lang.String r12 = "file_size"
            long r0 = (long) r11     // Catch:{ all -> 0x0167 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ff
            java.lang.String r8 = "Invalid"
        L_0x00fb:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r12, (java.lang.String) r8)     // Catch:{ all -> 0x0167 }
            goto L_0x012f
        L_0x00ff:
            r9 = 2048(0x800, double:1.0118E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0108
            java.lang.String r8 = "<2KB"
            goto L_0x00fb
        L_0x0108:
            r9 = 4096(0x1000, double:2.0237E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0111
            java.lang.String r8 = "<4KB"
            goto L_0x00fb
        L_0x0111:
            r9 = 6144(0x1800, double:3.0355E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x011a
            java.lang.String r8 = "<6KB"
            goto L_0x00fb
        L_0x011a:
            r9 = 8192(0x2000, double:4.0474E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0123
            java.lang.String r8 = "<8KB"
            goto L_0x00fb
        L_0x0123:
            r9 = 10240(0x2800, double:5.059E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x012c
            java.lang.String r8 = "<10KB"
            goto L_0x00fb
        L_0x012c:
            java.lang.String r8 = ">=10KB"
            goto L_0x00fb
        L_0x012f:
            r9 = 102400(0x19000, double:5.05923E-319)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0145
            java.lang.String r0 = "ContactsUriHandler/RestrictedCursor/getThumbnailPic thumbnail file size is >100KB"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0167 }
            X.5SI r0 = X.AnonymousClass5SI.FILE_TOO_LARGE     // Catch:{ all -> 0x0167 }
            android.util.Pair r8 = X.C36441kJ.A0Q(r6, r0)     // Catch:{ all -> 0x0167 }
            r7.close()     // Catch:{ IOException -> 0x0187 }
            goto L_0x0193
        L_0x0145:
            byte[] r1 = new byte[r11]     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "read_from_file_to_byte_array_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0167 }
            r7.read(r1)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "convert_to_byte_array_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r1 = X.C36441kJ.A13(r1)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "encode_to_base64_string_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0167 }
            X.5SI r0 = X.AnonymousClass5SI.SUCCESS_WITH_PICTURE     // Catch:{ all -> 0x0167 }
            android.util.Pair r8 = X.C36441kJ.A0Q(r1, r0)     // Catch:{ all -> 0x0167 }
            r7.close()     // Catch:{ IOException -> 0x0187 }
            goto L_0x0193
        L_0x0167:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x016c }
            goto L_0x0170
        L_0x016c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0187 }
        L_0x0170:
            throw r1     // Catch:{ IOException -> 0x0187 }
        L_0x0171:
            X.5SI r0 = X.AnonymousClass5SI.SUCCESS_WITHOUT_PICTURE
            android.util.Pair r8 = X.C36441kJ.A0Q(r6, r0)
            goto L_0x0193
        L_0x0178:
            r1 = 1
            java.lang.String r0 = "is_privacy_placeholder"
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (boolean) r1)
            X.5SI r1 = X.AnonymousClass5SI.SUCCESS_WITH_PICTURE
            java.lang.String r0 = "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"
            android.util.Pair r8 = X.C36441kJ.A0Q(r0, r1)
            goto L_0x0193
        L_0x0187:
            r1 = move-exception
            java.lang.String r0 = "ContactsUriHandler/RestrictedCursor/getThumbnailPic encountered IO exception"
            com.whatsapp.util.Log.w(r0, r1)
            X.5SI r0 = X.AnonymousClass5SI.IO_EXCEPTION
            android.util.Pair r8 = X.C36441kJ.A0Q(r6, r0)
        L_0x0193:
            java.lang.Object r0 = r8.second
            X.5SI r0 = (X.AnonymousClass5SI) r0
            int r7 = r0.ordinal()
            r0 = 1
            r6 = 2
            java.lang.String r1 = "is_pic_available"
            if (r7 == r2) goto L_0x01bb
            if (r7 == r0) goto L_0x01bf
            r0 = 3
            if (r7 == r0) goto L_0x01b5
            if (r7 != r6) goto L_0x01b0
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r2)
            r0 = 147(0x93, float:2.06E-43)
        L_0x01ad:
            r4.markerEnd(r3, r5, r0)
        L_0x01b0:
            java.lang.Object r0 = r8.first
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x01b5:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r2)
            r0 = 159(0x9f, float:2.23E-43)
            goto L_0x01ad
        L_0x01bb:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r0)
            goto L_0x01c2
        L_0x01bf:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r2)
        L_0x01c2:
            r4.markerEnd(r3, r5, r6)
            goto L_0x01b0
        L_0x01c6:
            r0 = 0
            return r0
        L_0x01c8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Column #"
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " is not a string."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        L_0x01db:
            int r0 = r13.getInt(r14)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L_0x01e4:
            java.lang.String r0 = "Invalid column index"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91004bI.getString(int):java.lang.String");
    }

    public boolean isNull(int i) {
        return false;
    }

    private AnonymousClass141 A00(int i) {
        if (i >= 0) {
            List list = this.A0I;
            if (i < list.size()) {
                return (AnonymousClass141) list.get(i);
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Position: ");
        A0u.append(i);
        A0u.append(", size = ");
        throw AnonymousClass001.A09(C36381kD.A10(A0u, this.A0I.size()));
    }

    public int getCount() {
        return this.A0I.size();
    }

    public C91004bI(AnonymousClass1HX r15, AnonymousClass171 r16, AnonymousClass16K r17, AnonymousClass1VC r18, C119625qB r19, C1261862w r20, AnonymousClass6KI r21, AnonymousClass3G0 r22, AnonymousClass3S0 r23, C21430zE r24, C128946Ef r25, List list, String[] strArr) {
        String[] A1b;
        String[] strArr2 = strArr;
        if (strArr == null) {
            A1b = new String[]{"_id", "display_name", "is_group", "call_rank", "message_rank", "primary_profile_picture_bytestream"};
        } else {
            HashSet A0g = C36421kH.A0g(new String[]{"_id", "display_name", "is_group", "call_rank", "message_rank", "primary_profile_picture_bytestream"});
            ArrayList A0I2 = AnonymousClass001.A0I();
            int length = strArr2.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (A0g.contains(str)) {
                    A0I2.add(str);
                }
            }
            A1b = C36371kC.A1b(A0I2, 0);
        }
        if (!r20.A01.A00.A09(C21100yf.A0O)) {
            LinkedList linkedList = new LinkedList(Arrays.asList(A1b));
            linkedList.remove("call_rank");
            linkedList.remove("message_rank");
            A1b = C36371kC.A1b(linkedList, 0);
        }
        this.A0K = A1b;
        this.A0A = r15;
        this.A0I = C36441kJ.A15(list);
        this.A03 = r24;
        this.A0B = r16;
        this.A02 = r17;
        this.A0H = r25;
        this.A0C = r18;
        this.A0D = r19;
        this.A0E = r21;
        this.A0G = r23;
        this.A0F = r22;
        this.A06 = AnonymousClass6XG.A00("_id", A1b);
        this.A05 = AnonymousClass6XG.A00("display_name", A1b);
        this.A07 = AnonymousClass6XG.A00("is_group", A1b);
        this.A04 = AnonymousClass6XG.A00("call_rank", A1b);
        this.A08 = AnonymousClass6XG.A00("message_rank", A1b);
        this.A09 = AnonymousClass6XG.A00("primary_profile_picture_bytestream", A1b);
    }

    public String[] getColumnNames() {
        return this.A0K;
    }

    public double getDouble(int i) {
        throw AnonymousClass001.A0D();
    }

    public float getFloat(int i) {
        throw AnonymousClass001.A0D();
    }

    public long getLong(int i) {
        throw AnonymousClass001.A0D();
    }

    public short getShort(int i) {
        throw AnonymousClass001.A0D();
    }
}
