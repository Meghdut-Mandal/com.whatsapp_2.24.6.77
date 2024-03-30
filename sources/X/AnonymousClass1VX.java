package X;

import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1VX  reason: invalid class name */
public class AnonymousClass1VX {
    public final C19630wG A00;
    public final C24531Cu A01;
    public final C20310xM A02;
    public final AnonymousClass12O A03;
    public final AnonymousClass1FV A04;
    public final C238019x A05;
    public final C19770wU A06;
    public final C19730wQ A07;
    public final AnonymousClass1NG A08;
    public final AnonymousClass19A A09;

    public void A00() {
        Log.i("ChangeNumberManager/deleteChangeNumberContacts");
        new File(this.A00.A00.getFilesDir(), "change_number_contacts.json").delete();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a2, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x0084, B:40:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r11 = this;
            java.lang.String r0 = "changenumbermanager/sendchangenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wQ r0 = r11.A07
            com.whatsapp.Me r5 = r0.A05()
            X.C18740tg.A06(r5)
            java.lang.String r3 = r5.jabber_id
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wG r0 = r11.A00
            android.content.Context r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r0 = "change_number_contacts.json"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            r2 = 0
            if (r0 == 0) goto L_0x00cd
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x00bb }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x00bb }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x00a4 }
            r7.<init>(r6)     // Catch:{ all -> 0x00a4 }
            android.util.JsonReader r8 = new android.util.JsonReader     // Catch:{ all -> 0x0097 }
            r8.<init>(r7)     // Catch:{ all -> 0x0097 }
            r8.beginObject()     // Catch:{ all -> 0x008d }
            r4 = 0
            r9 = r2
            r1 = r2
        L_0x0040:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0078
            java.lang.String r10 = r8.nextName()     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "old_jid"
            boolean r0 = X.AnonymousClass00C.A0J(r10, r0)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0057
            java.lang.String r9 = r8.nextString()     // Catch:{ all -> 0x008d }
            goto L_0x0040
        L_0x0057:
            java.lang.String r0 = "notify_jids"
            boolean r0 = X.AnonymousClass00C.A0J(r10, r0)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x008d }
            r1.<init>()     // Catch:{ all -> 0x008d }
            r8.beginArray()     // Catch:{ all -> 0x008d }
        L_0x0067:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = r8.nextString()     // Catch:{ all -> 0x008d }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x008d }
            r1.add(r0)     // Catch:{ all -> 0x008d }
            goto L_0x0067
        L_0x0078:
            if (r9 == 0) goto L_0x0081
            if (r1 == 0) goto L_0x0081
            X.3Ie r4 = new X.3Ie     // Catch:{ all -> 0x008d }
            r4.<init>(r9, r1)     // Catch:{ all -> 0x008d }
        L_0x0081:
            r8.close()     // Catch:{ all -> 0x008b }
            r7.close()     // Catch:{ all -> 0x00a2 }
            r6.close()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            goto L_0x00c2
        L_0x008b:
            r1 = move-exception
            goto L_0x0099
        L_0x008d:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0092 }
            goto L_0x0096
        L_0x0092:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0097 }
        L_0x0096:
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            r4 = r2
        L_0x0099:
            r7.close()     // Catch:{ all -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            goto L_0x00a6
        L_0x00a4:
            r1 = move-exception
            r4 = r2
        L_0x00a6:
            r6.close()     // Catch:{ all -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
        L_0x00ae:
            throw r1     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
        L_0x00af:
            r1 = move-exception
            goto L_0x00bd
        L_0x00b1:
            r1 = move-exception
            goto L_0x00b5
        L_0x00b3:
            r1 = move-exception
            r4 = r2
        L_0x00b5:
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts/notFoundJson "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x00c2
        L_0x00bb:
            r1 = move-exception
            r4 = r2
        L_0x00bd:
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts/ioErrorJson "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00c2:
            if (r4 == 0) goto L_0x00cd
            java.lang.String r0 = r4.A00
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cd
            r2 = r4
        L_0x00cd:
            X.1NG r0 = r11.A08
            java.util.Set r3 = r0.A09()
            if (r2 == 0) goto L_0x00f5
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.util.List r0 = r2.A01
            java.util.ArrayList r2 = X.AnonymousClass143.A06(r1, r0)
            java.util.Iterator r1 = r2.iterator()
        L_0x00e1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00e1
            r1.remove()
            goto L_0x00e1
        L_0x00f5:
            r2 = 0
        L_0x00f6:
            X.19A r4 = r11.A09
            java.lang.String r0 = r5.jabber_id
            X.9Ht r3 = new X.9Ht
            r3.<init>(r0, r2)
            r1 = 0
            r2 = 0
            r0 = 61
            android.os.Message r1 = android.os.Message.obtain(r1, r2, r0, r2, r3)
            X.AnonymousClass00C.A0D(r1, r2)
            r0 = 0
            X.AnonymousClass19A.A01(r1, r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VX.A01():void");
    }

    public boolean A02() {
        if (this.A07.A05() != null) {
            return true;
        }
        return false;
    }

    public AnonymousClass1VX(C19730wQ r2, AnonymousClass1NG r3, C19630wG r4, C24531Cu r5, C20310xM r6, AnonymousClass12O r7, AnonymousClass1FV r8, AnonymousClass19A r9, C238019x r10, C19770wU r11) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A00 = r4;
        this.A06 = r11;
        this.A07 = r2;
        this.A09 = r9;
        this.A08 = r3;
        this.A03 = r7;
        this.A02 = r6;
        this.A05 = r10;
        this.A04 = r8;
        this.A01 = r5;
    }
}
