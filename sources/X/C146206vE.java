package X;

import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6vE  reason: invalid class name and case insensitive filesystem */
public class C146206vE implements AnonymousClass1XK {
    public final C24041Av A00;
    public final C19630wG A01;
    public final AnonymousClass1H2 A02;
    public final C23981Ap A03;
    public final AnonymousClass1HA A04;
    public final Map A05 = C90524aI.A0s();

    public /* bridge */ /* synthetic */ C88794Ub B4V(Object obj, float f) {
        return new C146216vF((C161307mX) obj, Float.valueOf(1.0f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList BKI() {
        /*
            r17 = this;
            r7 = r17
            X.0wG r0 = r7.A01
            java.io.File r1 = X.C90514aH.A0j(r0)
            java.lang.String r0 = "content_stickers"
            java.io.File r16 = X.C36441kJ.A0w(r1, r0)
            boolean r0 = r16.exists()
            r15 = 0
            if (r0 == 0) goto L_0x018c
            java.io.FileInputStream r3 = X.C90524aI.A0U(r16)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x0179 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x0179 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0179 }
            android.util.JsonReader r6 = new android.util.JsonReader     // Catch:{ all -> 0x016f }
            r6.<init>(r5)     // Catch:{ all -> 0x016f }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0165 }
            r6.beginArray()     // Catch:{ all -> 0x0165 }
        L_0x002c:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0151
            r6.beginObject()     // Catch:{ all -> 0x0165 }
            r2 = r15
            r9 = r15
            r8 = r15
        L_0x0038:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0165 }
            r13 = 1
            if (r0 == 0) goto L_0x0094
            java.lang.String r11 = r6.nextName()     // Catch:{ all -> 0x0165 }
            r10 = -1
            int r12 = r11.hashCode()     // Catch:{ all -> 0x0165 }
            r0 = -1391167122(0xffffffffad14796e, float:-8.439789E-12)
            r1 = 2
            if (r12 == r0) goto L_0x006b
            r0 = -791592328(0xffffffffd0d14278, float:-2.80863539E10)
            if (r12 == r0) goto L_0x0062
            r0 = 114586(0x1bf9a, float:1.60569E-40)
            if (r12 != r0) goto L_0x0076
            java.lang.String r0 = "tag"
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0076
            r10 = 0
            goto L_0x0076
        L_0x0062:
            java.lang.String r0 = "weight"
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0076
            goto L_0x0075
        L_0x006b:
            java.lang.String r0 = "mimetype"
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0076
            r10 = 2
            goto L_0x0076
        L_0x0075:
            r10 = 1
        L_0x0076:
            if (r10 == 0) goto L_0x008f
            if (r10 == r13) goto L_0x0085
            if (r10 == r1) goto L_0x0080
            r6.skipValue()     // Catch:{ all -> 0x0165 }
            goto L_0x0038
        L_0x0080:
            java.lang.String r8 = r6.nextString()     // Catch:{ all -> 0x0165 }
            goto L_0x0038
        L_0x0085:
            double r0 = r6.nextDouble()     // Catch:{ all -> 0x0165 }
            float r9 = (float) r0     // Catch:{ all -> 0x0165 }
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x0165 }
            goto L_0x0038
        L_0x008f:
            java.lang.String r2 = r6.nextString()     // Catch:{ all -> 0x0165 }
            goto L_0x0038
        L_0x0094:
            r6.endObject()     // Catch:{ all -> 0x0165 }
            if (r2 == 0) goto L_0x0146
            if (r9 == 0) goto L_0x0146
            java.util.Map r11 = r7.A05     // Catch:{ all -> 0x0165 }
            java.lang.Object r10 = r11.get(r2)     // Catch:{ all -> 0x0165 }
            X.7mX r10 = (X.C161307mX) r10     // Catch:{ all -> 0x0165 }
            if (r10 != 0) goto L_0x0134
            java.lang.String r1 = "StickerShapeCreator:"
            boolean r0 = r2.startsWith(r1)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = ""
            java.lang.String r14 = r2.replace(r1, r0)     // Catch:{ all -> 0x0165 }
            goto L_0x00b5
        L_0x00b4:
            r14 = 0
        L_0x00b5:
            if (r14 == 0) goto L_0x00ff
            X.1Av r0 = r7.A00     // Catch:{ all -> 0x0165 }
            java.io.File r12 = r0.A04(r14, r8)     // Catch:{ all -> 0x0165 }
            boolean r0 = r12.exists()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0134
            X.6c4 r1 = new X.6c4     // Catch:{ all -> 0x0165 }
            r1.<init>()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x0165 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x00d4
            r0 = r15
            goto L_0x00da
        L_0x00d4:
            X.1Ap r0 = r7.A03     // Catch:{ all -> 0x0165 }
            X.3S2 r0 = r0.A02(r12, r8)     // Catch:{ all -> 0x0165 }
        L_0x00da:
            r1.A04 = r0     // Catch:{ all -> 0x0165 }
            r1.A0E = r14     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x0165 }
            r1.A02(r0, r13)     // Catch:{ all -> 0x0165 }
            r1.A0D = r8     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0165 }
            r1.A0N = r0     // Catch:{ all -> 0x0165 }
            X.1Ap r0 = r7.A03     // Catch:{ all -> 0x0165 }
            r0.A04(r1)     // Catch:{ all -> 0x0165 }
            X.1HA r0 = r7.A04     // Catch:{ all -> 0x0165 }
            X.6wB r10 = new X.6wB     // Catch:{ all -> 0x0165 }
            r10.<init>(r1, r0)     // Catch:{ all -> 0x0165 }
            r11.put(r2, r10)     // Catch:{ all -> 0x0165 }
            goto L_0x0134
        L_0x00ff:
            java.lang.String r1 = "EmojiShapeCreator:"
            boolean r0 = r2.startsWith(r1)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = ""
            java.lang.String r8 = r2.replace(r1, r0)     // Catch:{ all -> 0x0165 }
            goto L_0x010f
        L_0x010e:
            r8 = 0
        L_0x010f:
            if (r8 == 0) goto L_0x0134
            X.1H2 r2 = r7.A02     // Catch:{ IllegalArgumentException -> 0x0128 }
            X.1XQ r0 = new X.1XQ     // Catch:{ IllegalArgumentException -> 0x0128 }
            r0.<init>((java.lang.String) r8)     // Catch:{ IllegalArgumentException -> 0x0128 }
            X.6wA r1 = new X.6wA     // Catch:{ IllegalArgumentException -> 0x0128 }
            r1.<init>(r0, r2)     // Catch:{ IllegalArgumentException -> 0x0128 }
            java.lang.String r0 = r1.BIB()     // Catch:{ IllegalArgumentException -> 0x0125 }
            r11.put(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0125 }
            goto L_0x0133
        L_0x0125:
            r2 = move-exception
            r10 = r1
            goto L_0x0129
        L_0x0128:
            r2 = move-exception
        L_0x0129:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "Unable to create emoji shape creator from "
            X.C90464aC.A1L(r0, r8, r1, r2)     // Catch:{ all -> 0x0165 }
            goto L_0x0134
        L_0x0133:
            r10 = r1
        L_0x0134:
            if (r10 == 0) goto L_0x002c
            boolean r0 = r10.B2L()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x002c
            X.6vF r0 = new X.6vF     // Catch:{ all -> 0x0165 }
            r0.<init>(r10, r9)     // Catch:{ all -> 0x0165 }
            r4.add(r0)     // Catch:{ all -> 0x0165 }
            goto L_0x002c
        L_0x0146:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "RecentShapesHelper/init/ tag or weight is null for tag="
            X.C36321k7.A1P(r0, r2, r1)     // Catch:{ all -> 0x0165 }
            goto L_0x002c
        L_0x0151:
            r6.close()     // Catch:{ all -> 0x0162 }
            r5.close()     // Catch:{ all -> 0x015f }
            r3.close()     // Catch:{ Exception -> 0x015c }
            r15 = r4
            goto L_0x018c
        L_0x015c:
            r1 = move-exception
            r15 = r4
            goto L_0x0184
        L_0x015f:
            r1 = move-exception
            r15 = r4
            goto L_0x017a
        L_0x0162:
            r1 = move-exception
            r15 = r4
            goto L_0x0170
        L_0x0165:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x016a }
            goto L_0x016e
        L_0x016a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x016f }
        L_0x016e:
            throw r1     // Catch:{ all -> 0x016f }
        L_0x016f:
            r1 = move-exception
        L_0x0170:
            r5.close()     // Catch:{ all -> 0x0174 }
            goto L_0x0178
        L_0x0174:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0179 }
        L_0x0178:
            throw r1     // Catch:{ all -> 0x0179 }
        L_0x0179:
            r1 = move-exception
        L_0x017a:
            r3.close()     // Catch:{ all -> 0x017e }
            goto L_0x0182
        L_0x017e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0183 }
        L_0x0182:
            throw r1     // Catch:{ Exception -> 0x0183 }
        L_0x0183:
            r1 = move-exception
        L_0x0184:
            java.lang.String r0 = "RecentShapesHelper/init"
            com.whatsapp.util.Log.e(r0, r1)
            r16.delete()
        L_0x018c:
            if (r15 != 0) goto L_0x0192
            java.util.ArrayList r15 = X.AnonymousClass001.A0I()
        L_0x0192:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146206vE.BKI():java.util.ArrayList");
    }

    public void Blb(List list) {
        JsonWriter jsonWriter;
        String str;
        try {
            FileOutputStream A0W = C90524aI.A0W(C36441kJ.A0w(C90514aH.A0j(this.A01), "content_stickers"));
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(A0W, C19430v1.A0B);
                try {
                    jsonWriter = new JsonWriter(outputStreamWriter);
                    jsonWriter.setIndent("");
                    jsonWriter.beginArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C146216vF r7 = (C146216vF) it.next();
                        C161307mX r2 = r7.A01;
                        if (r2 instanceof C146796wB) {
                            str = ((C146796wB) r2).A00.A0D;
                        } else {
                            str = null;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("tag").value(r2.BIB());
                        jsonWriter.name("weight").value((double) r7.A00);
                        if (str != null) {
                            jsonWriter.name("mimetype").value(str);
                        }
                        jsonWriter.endObject();
                    }
                    jsonWriter.endArray();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    A0W.close();
                    return;
                } catch (Throwable th) {
                    outputStreamWriter.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A0W.close();
                throw th2;
            }
        } catch (IOException e) {
            Log.e((Throwable) e);
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    public C146206vE(C24041Av r5, C19630wG r6, AnonymousClass1H2 r7, C23981Ap r8, AnonymousClass1HA r9) {
        this.A01 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A04 = r9;
        this.A00 = r5;
        ArrayList A002 = C129866It.A00();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            C161307mX r2 = (C161307mX) it.next();
            this.A05.put(r2.BIB(), r2);
        }
    }
}
