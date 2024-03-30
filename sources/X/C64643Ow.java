package X;

/* renamed from: X.3Ow  reason: invalid class name and case insensitive filesystem */
public class C64643Ow {
    public int A00 = 0;
    public String A01;
    public StringBuilder A02;
    public final AnonymousClass1N4 A03;
    public final C18820ts A04;

    public C64643Ow(AnonymousClass1N4 r2, C18820ts r3) {
        this.A04 = r3;
        this.A03 = r2;
    }

    public static void A00(String str, StringBuilder sb, C64643Ow r2) {
        sb.append(str);
        sb.append(r2.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01c6, code lost:
        if (r10.trim().equals("") != false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0277, code lost:
        if (r9.trim().equals("") != false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0318, code lost:
        if (r9.trim().equals("") != false) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r1 != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0189, code lost:
        if (r4.A00 == -1) goto L_0x014f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(X.C65643Sx r14) {
        /*
            r13 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r13.A02 = r2
            X.3F9 r3 = r14.A0A
            java.lang.String r1 = r3.A01
            if (r1 != 0) goto L_0x0010
            java.lang.String r1 = ""
            r3.A01 = r1
        L_0x0010:
            java.lang.String r8 = "\n"
            r13.A01 = r8
            java.lang.String r0 = "BEGIN:VCARD"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "VERSION:3.0"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "N:"
            r2.append(r0)
            java.lang.String r0 = r3.A00
            java.lang.String r6 = ";"
            if (r0 == 0) goto L_0x0032
            r2.append(r0)
        L_0x0032:
            r2.append(r6)
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x003c
            r2.append(r0)
        L_0x003c:
            r2.append(r6)
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0046
            r2.append(r0)
        L_0x0046:
            r2.append(r6)
            java.lang.String r0 = r3.A06
            if (r0 == 0) goto L_0x0050
            r2.append(r0)
        L_0x0050:
            r2.append(r6)
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x005a
            r2.append(r0)
        L_0x005a:
            r2.append(r8)
            java.lang.String r0 = "FN:"
            X.AnonymousClass000.A1D(r0, r1, r8, r2)
            java.util.Map r0 = r14.A08
            r5 = 0
            if (r0 == 0) goto L_0x007f
            java.lang.String r2 = "NICKNAME"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x007f
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "NICKNAME:"
            r1.append(r0)
            X.3KL r0 = X.C65643Sx.A00(r2, r14)
            java.lang.String r0 = r0.A02
            A00(r0, r1, r13)
        L_0x007f:
            java.lang.String r2 = r3.A04
            if (r2 == 0) goto L_0x008d
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "X-PHONETIC-FIRST-NAME:"
            r1.append(r0)
            A00(r2, r1, r13)
        L_0x008d:
            java.lang.String r2 = r3.A05
            if (r2 == 0) goto L_0x009b
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "X-PHONETIC-LAST-NAME:"
            r1.append(r0)
            A00(r2, r1, r13)
        L_0x009b:
            java.util.List r0 = r14.A05
            if (r0 == 0) goto L_0x00d1
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00d1
            java.util.List r0 = r14.A05
            java.lang.Object r0 = r0.get(r5)
            X.360 r0 = (X.AnonymousClass360) r0
            java.lang.String r4 = r0.A00
            java.util.List r0 = r14.A05
            java.lang.Object r0 = r0.get(r5)
            X.360 r0 = (X.AnonymousClass360) r0
            java.lang.String r2 = r0.A01
            if (r4 == 0) goto L_0x00c5
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "ORG:"
            r1.append(r0)
            A00(r4, r1, r13)
        L_0x00c5:
            if (r2 == 0) goto L_0x00d1
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "TITLE:"
            r1.append(r0)
            A00(r2, r1, r13)
        L_0x00d1:
            java.util.List r2 = r14.A04
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x011b
            java.lang.String r0 = X.C36401kF.A0s(r2, r5)
            if (r0 == 0) goto L_0x00ec
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00ed
        L_0x00ec:
            r0 = 1
        L_0x00ed:
            if (r0 != 0) goto L_0x011b
            java.lang.StringBuilder r7 = r13.A02
            java.lang.String r0 = "NOTE:"
            r7.append(r0)
            java.lang.String r10 = X.C36401kF.A0s(r2, r5)
            java.lang.String r9 = "\r\n"
            boolean r0 = r10.endsWith(r9)
            r4 = 1
            r2 = 0
            r1 = 2
            if (r0 == 0) goto L_0x019a
            int r0 = r10.length()
            int r0 = r0 - r1
        L_0x010a:
            java.lang.String r0 = r10.substring(r5, r0)
            java.lang.String r1 = r0.replaceAll(r9, r8)
            java.lang.String r0 = "\n "
            java.lang.String r2 = r1.replaceAll(r8, r0)
        L_0x0118:
            A00(r2, r7, r13)
        L_0x011b:
            java.util.List r0 = r14.A06
            if (r0 == 0) goto L_0x0254
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            java.util.Iterator r11 = r0.iterator()
        L_0x0127:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r4 = r11.next()
            X.39e r4 = (X.C607439e) r4
            java.lang.String r0 = r4.A02
            boolean r1 = r2.containsKey(r0)
            java.lang.String r0 = r4.A02
            if (r1 == 0) goto L_0x0196
            java.lang.Object r1 = r2.get(r0)
            X.39e r1 = (X.C607439e) r1
            int r0 = r1.A00
            r7 = 1
            r8 = -1
            if (r0 != r8) goto L_0x0183
            int r0 = r4.A00
            if (r0 != r8) goto L_0x018b
            r1.A00 = r7
        L_0x014f:
            java.lang.String r10 = r1.A03
            java.lang.String r9 = "null"
            if (r10 == 0) goto L_0x015b
            boolean r0 = r10.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x0167
        L_0x015b:
            java.lang.String r8 = r4.A03
            if (r8 == 0) goto L_0x017c
            boolean r0 = r8.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x017c
            r1.A03 = r8
        L_0x0167:
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x016f
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0171
        L_0x016f:
            r1.A04 = r7
        L_0x0171:
            com.whatsapp.jid.UserJid r0 = r1.A01
            if (r0 != 0) goto L_0x0127
            com.whatsapp.jid.UserJid r0 = r4.A01
            if (r0 == 0) goto L_0x0127
            r1.A01 = r0
            goto L_0x0127
        L_0x017c:
            if (r10 != 0) goto L_0x0167
            java.lang.String r0 = "HOME"
            r1.A03 = r0
            goto L_0x0167
        L_0x0183:
            if (r0 == r8) goto L_0x018b
            if (r0 != 0) goto L_0x014f
            int r0 = r4.A00
            if (r0 == r8) goto L_0x014f
        L_0x018b:
            int r0 = r4.A00
            r1.A00 = r0
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = r4.A03
            r1.A03 = r0
            goto L_0x014f
        L_0x0196:
            r2.put(r0, r4)
            goto L_0x0127
        L_0x019a:
            boolean r0 = r10.endsWith(r8)
            if (r0 == 0) goto L_0x0118
            int r0 = r10.length()
            int r0 = r0 - r4
            goto L_0x010a
        L_0x01a7:
            java.util.Iterator r11 = X.C36391kE.A10(r2)
        L_0x01ab:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0254
            java.lang.Object r7 = r11.next()
            X.39e r7 = (X.C607439e) r7
            java.lang.String r10 = r7.A02
            if (r10 == 0) goto L_0x01c8
            java.lang.String r1 = r10.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x01c9
        L_0x01c8:
            r0 = 1
        L_0x01c9:
            if (r0 != 0) goto L_0x01ab
            int r1 = r7.A00
            r4 = 58
            if (r1 != 0) goto L_0x0215
            int r0 = r13.A00
            int r9 = r0 + 1
            r13.A00 = r9
            java.lang.StringBuilder r8 = r13.A02
            java.lang.String r2 = "item"
            r8.append(r2)
            r8.append(r9)
            java.lang.String r0 = ".TEL"
            r8.append(r0)
            com.whatsapp.jid.UserJid r0 = r7.A01
            if (r0 == 0) goto L_0x01f6
            java.lang.String r1 = r0.user
            if (r1 == 0) goto L_0x01f6
            java.lang.String r0 = ";waid="
            r8.append(r0)
            r8.append(r1)
        L_0x01f6:
            r8.append(r4)
            r8.append(r10)
            java.lang.String r1 = r13.A01
            r8.append(r1)
            r8.append(r2)
            r8.append(r9)
            java.lang.String r0 = ".X-ABLabel:"
            r8.append(r0)
            java.lang.String r0 = r7.A03
            r8.append(r0)
            r8.append(r1)
            goto L_0x01ab
        L_0x0215:
            X.0ts r0 = r13.A04
            int r1 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(r1)
            android.content.Context r0 = r0.A00
            java.lang.String r8 = X.C36401kF.A0o(r0, r1)
            r2 = 59
            int r1 = r8.indexOf(r2)
            r0 = -1
            if (r1 == r0) goto L_0x0230
            r0 = 44
            java.lang.String r8 = r8.replace(r2, r0)
        L_0x0230:
            java.lang.StringBuilder r2 = r13.A02
            java.lang.String r0 = "TEL;type="
            r2.append(r0)
            r2.append(r8)
            com.whatsapp.jid.UserJid r0 = r7.A01
            if (r0 == 0) goto L_0x024a
            java.lang.String r1 = r0.user
            if (r1 == 0) goto L_0x024a
            java.lang.String r0 = ";waid="
            r2.append(r0)
            r2.append(r1)
        L_0x024a:
            r2.append(r4)
            java.lang.String r0 = r7.A02
            A00(r0, r2, r13)
            goto L_0x01ab
        L_0x0254:
            java.util.List r0 = r14.A07
            if (r0 == 0) goto L_0x02ef
            java.util.Iterator r10 = r0.iterator()
        L_0x025c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02ef
            java.lang.Object r4 = r10.next()
            X.362 r4 = (X.AnonymousClass362) r4
            java.lang.String r9 = r4.A01
            if (r9 == 0) goto L_0x0279
            java.lang.String r1 = r9.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x027a
        L_0x0279:
            r0 = 1
        L_0x027a:
            if (r0 != 0) goto L_0x025c
            int r7 = r4.A00
            r2 = 2
            r0 = 4
            r1 = 1
            if (r7 == r0) goto L_0x02ca
            r0 = 5
            if (r7 == r0) goto L_0x02c7
            if (r7 == r1) goto L_0x02c4
            if (r7 == r2) goto L_0x02c1
            r0 = 3
            if (r7 == r0) goto L_0x02be
            r0 = 6
            if (r7 == r0) goto L_0x02bb
            java.lang.String r8 = "OTHER"
        L_0x0292:
            int r0 = r13.A00
            int r7 = r0 + 1
            r13.A00 = r7
            java.lang.StringBuilder r4 = r13.A02
            java.lang.String r2 = "item"
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".URL:"
            r4.append(r0)
            r4.append(r9)
            java.lang.String r1 = r13.A01
            r4.append(r1)
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".X-ABLabel:"
            X.AnonymousClass000.A1D(r0, r8, r1, r4)
            goto L_0x025c
        L_0x02bb:
            java.lang.String r8 = "FTP"
            goto L_0x0292
        L_0x02be:
            java.lang.String r8 = "PROFILE"
            goto L_0x0292
        L_0x02c1:
            java.lang.String r8 = "BLOG"
            goto L_0x0292
        L_0x02c4:
            java.lang.String r8 = "HOMEPAGE"
            goto L_0x0292
        L_0x02c7:
            java.lang.String r2 = "WORK"
            goto L_0x02cc
        L_0x02ca:
            java.lang.String r2 = "HOME"
        L_0x02cc:
            int r1 = r2.indexOf(r6)
            r0 = -1
            if (r1 == r0) goto L_0x02d9
            java.lang.String r0 = ","
            java.lang.String r2 = r2.replace(r6, r0)
        L_0x02d9:
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "URL;type="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r0 = r4.A01
            A00(r0, r1, r13)
            goto L_0x025c
        L_0x02ef:
            java.util.List r0 = r14.A03
            if (r0 == 0) goto L_0x046b
            java.util.Iterator r12 = r0.iterator()
        L_0x02f7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x046b
            java.lang.Object r8 = r12.next()
            X.3A9 r8 = (X.AnonymousClass3A9) r8
            java.lang.Class r1 = r8.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x0352
            java.lang.String r9 = r8.A02
            if (r9 == 0) goto L_0x031a
            java.lang.String r1 = r9.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x031b
        L_0x031a:
            r0 = 1
        L_0x031b:
            if (r0 != 0) goto L_0x02f7
            int r1 = r8.A00
            if (r1 != 0) goto L_0x043d
            int r0 = r13.A00
            int r7 = r0 + 1
            r13.A00 = r7
            java.lang.StringBuilder r4 = r13.A02
            java.lang.String r2 = "item"
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".EMAIL;type=INTERNET:"
            r4.append(r0)
            r4.append(r9)
            java.lang.String r1 = r13.A01
            r4.append(r1)
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".X-ABLabel:"
            r4.append(r0)
            java.lang.String r0 = r8.A03
            r4.append(r0)
            r4.append(r1)
            goto L_0x02f7
        L_0x0352:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r1 != r0) goto L_0x02f7
            int r0 = r13.A00
            int r11 = r0 + 1
            r13.A00 = r11
            X.3PZ r7 = r8.A04
            if (r7 == 0) goto L_0x0464
            int r1 = r8.A00
            java.lang.String r4 = "vcardcomposer/appendwapostalstr failed isoFromNativeName"
            java.lang.String r10 = ".X-ABADR:"
            java.lang.String r9 = "item"
            if (r1 != 0) goto L_0x03d5
            java.lang.StringBuilder r2 = r13.A02
            r2.append(r9)
            r2.append(r11)
            java.lang.String r0 = ".ADR:;;"
            r2.append(r0)
            java.lang.String r0 = r7.A01()
            A00(r0, r2, r13)
            X.C36351kA.A1M(r9, r10, r2, r11)
            java.lang.String r10 = r7.A01
            if (r10 == 0) goto L_0x03b7
            X.1N4 r0 = r13.A03     // Catch:{ IOException -> 0x03b3 }
            X.AnonymousClass1N4.A01(r0)     // Catch:{ IOException -> 0x03b3 }
            java.util.ArrayList r0 = r0.A01     // Catch:{ IOException -> 0x03b3 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ IOException -> 0x03b3 }
        L_0x0390:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x03b3 }
            if (r0 == 0) goto L_0x03b0
            java.lang.Object r1 = r7.next()     // Catch:{ IOException -> 0x03b3 }
            X.3O9 r1 = (X.AnonymousClass3O9) r1     // Catch:{ IOException -> 0x03b3 }
            java.lang.String r0 = r1.A03     // Catch:{ IOException -> 0x03b3 }
            boolean r0 = r0.startsWith(r10)     // Catch:{ IOException -> 0x03b3 }
            if (r0 == 0) goto L_0x0390
            java.lang.String r1 = r1.A02     // Catch:{ IOException -> 0x03b3 }
        L_0x03a6:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x03b3 }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ IOException -> 0x03b3 }
            r2.append(r0)     // Catch:{ IOException -> 0x03b3 }
            goto L_0x03b7
        L_0x03b0:
            java.lang.String r1 = ""
            goto L_0x03a6
        L_0x03b3:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x03b7:
            java.lang.StringBuilder r2 = r13.A02
            java.lang.String r1 = r13.A01
            r2.append(r1)
            r2.append(r9)
            int r0 = r13.A00
            r2.append(r0)
            java.lang.String r0 = ".X-ABLabel:"
            r2.append(r0)
            java.lang.String r0 = r8.A03
            r2.append(r0)
            r2.append(r1)
            goto L_0x02f7
        L_0x03d5:
            X.0ts r0 = r13.A04
            int r1 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabelResource(r1)
            android.content.Context r0 = r0.A00
            java.lang.String r1 = X.C36401kF.A0o(r0, r1)
            java.lang.StringBuilder r7 = r13.A02
            r7.append(r9)
            int r2 = r13.A00
            r7.append(r2)
            java.lang.String r0 = ".ADR;type="
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = ":;;"
            r7.append(r0)
            X.3PZ r1 = r8.A04
            java.lang.String r0 = r1.A01()
            A00(r0, r7, r13)
            X.C36351kA.A1M(r9, r10, r7, r2)
            java.lang.String r8 = r1.A01
            if (r8 == 0) goto L_0x043a
            X.1N4 r0 = r13.A03     // Catch:{ IOException -> 0x0436 }
            X.AnonymousClass1N4.A01(r0)     // Catch:{ IOException -> 0x0436 }
            java.util.ArrayList r0 = r0.A01     // Catch:{ IOException -> 0x0436 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x0436 }
        L_0x0413:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0436 }
            if (r0 == 0) goto L_0x0433
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x0436 }
            X.3O9 r1 = (X.AnonymousClass3O9) r1     // Catch:{ IOException -> 0x0436 }
            java.lang.String r0 = r1.A03     // Catch:{ IOException -> 0x0436 }
            boolean r0 = r0.startsWith(r8)     // Catch:{ IOException -> 0x0436 }
            if (r0 == 0) goto L_0x0413
            java.lang.String r1 = r1.A02     // Catch:{ IOException -> 0x0436 }
        L_0x0429:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x0436 }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ IOException -> 0x0436 }
            r7.append(r0)     // Catch:{ IOException -> 0x0436 }
            goto L_0x043a
        L_0x0433:
            java.lang.String r1 = ""
            goto L_0x0429
        L_0x0436:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x043a:
            java.lang.StringBuilder r2 = r13.A02
            goto L_0x045d
        L_0x043d:
            X.0ts r0 = r13.A04
            int r1 = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabelResource(r1)
            android.content.Context r0 = r0.A00
            java.lang.String r1 = X.C36401kF.A0o(r0, r1)
            java.lang.StringBuilder r2 = r13.A02
            java.lang.String r0 = "EMAIL;TYPE="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ":"
            r2.append(r0)
            java.lang.String r0 = r8.A02
            r2.append(r0)
        L_0x045d:
            java.lang.String r0 = r13.A01
            r2.append(r0)
            goto L_0x02f7
        L_0x0464:
            java.lang.String r0 = "appendWAPostalStr addr_data is NULL"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x02f7
        L_0x046b:
            java.util.Map r0 = r14.A08
            if (r0 == 0) goto L_0x0487
            java.lang.String r2 = "BDAY"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0487
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "BDAY;value=date:"
            r1.append(r0)
            X.3KL r0 = X.C65643Sx.A00(r2, r14)
            java.lang.String r0 = r0.A02
            A00(r0, r1, r13)
        L_0x0487:
            java.util.Map r0 = r14.A08
            if (r0 == 0) goto L_0x04d8
            java.util.Iterator r8 = X.AnonymousClass000.A10(r0)
        L_0x048f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04d8
            java.lang.String r1 = X.AnonymousClass001.A0C(r8)
            java.util.HashMap r0 = X.C65643Sx.A0E
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x048f
            X.3KL r7 = X.C65643Sx.A00(r1, r14)
            java.lang.StringBuilder r0 = r13.A02
            r0.append(r1)
            r0.append(r6)
            java.util.Set r4 = r7.A04
            java.lang.String r2 = ":"
            int r0 = r4.size()
            java.lang.StringBuilder r1 = r13.A02
            if (r0 <= 0) goto L_0x04d2
            java.lang.String r0 = "type="
            r1.append(r0)
            java.lang.Object[] r0 = r4.toArray()
            r0 = r0[r5]
            r1.append(r0)
        L_0x04c7:
            r1.append(r2)
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = r7.A02
            A00(r0, r1, r13)
            goto L_0x048f
        L_0x04d2:
            java.lang.String r0 = "type=HOME"
            r1.append(r0)
            goto L_0x04c7
        L_0x04d8:
            byte[] r2 = r14.A0B
            if (r2 == 0) goto L_0x04ea
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "PHOTO;BASE64:"
            r1.append(r0)
            java.lang.String r0 = X.C36441kJ.A13(r2)
            A00(r0, r1, r13)
        L_0x04ea:
            java.lang.String r0 = r3.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x054a
            java.lang.String r0 = r14.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0512
            java.lang.StringBuilder r2 = r13.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "X-WA-BIZ-DESCRIPTION:"
            r1.append(r0)
            java.lang.String r0 = r14.A02
            r1.append(r0)
            X.C36351kA.A1K(r1, r2)
            java.lang.String r0 = r13.A01
            r2.append(r0)
        L_0x0512:
            java.lang.String r0 = r14.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0532
            java.lang.StringBuilder r2 = r13.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "X-WA-BIZ-AUTOMATED-TYPE:"
            r1.append(r0)
            java.lang.String r0 = r14.A00
            r1.append(r0)
            X.C36351kA.A1K(r1, r2)
            java.lang.String r0 = r13.A01
            r2.append(r0)
        L_0x0532:
            java.lang.StringBuilder r2 = r13.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "X-WA-BIZ-NAME:"
            r1.append(r0)
            java.lang.String r0 = r3.A08
            r1.append(r0)
            X.C36351kA.A1K(r1, r2)
            java.lang.String r0 = r13.A01
            r2.append(r0)
        L_0x054a:
            X.35z r4 = r14.A09
            X.13w r2 = r4.A00
            java.lang.String r3 = ":"
            if (r2 == 0) goto L_0x0561
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "X-WA-LID"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r2.user
            A00(r0, r1, r13)
        L_0x0561:
            java.lang.String r2 = r4.A01
            if (r2 == 0) goto L_0x0571
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "X-WA-LID-DISPLAY-NAME"
            X.AnonymousClass000.A1D(r0, r3, r2, r1)
            java.lang.String r0 = r13.A01
            r1.append(r0)
        L_0x0571:
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "END:VCARD"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64643Ow.A01(X.3Sx):java.lang.String");
    }
}
