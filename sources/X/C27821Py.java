package X;

import android.app.Activity;
import android.content.Intent;
import android.nfc.NfcAdapter;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.1Py  reason: invalid class name and case insensitive filesystem */
public final class C27821Py {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C20310xM A02;
    public final AnonymousClass00T A03 = new AnonymousClass00U(C27831Pz.A00);
    public final AnonymousClass16D A04;
    public final C21060yb A05;
    public final C20830yE A06;
    public final C220712t A07;
    public final C220412q A08;

    public C27821Py(C19730wQ r3, AnonymousClass16D r4, C21060yb r5, C19970wo r6, C20830yE r7, C220712t r8, C220412q r9, C20310xM r10) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r9, 3);
        AnonymousClass00C.A0D(r8, 4);
        AnonymousClass00C.A0D(r4, 5);
        AnonymousClass00C.A0D(r5, 6);
        AnonymousClass00C.A0D(r10, 7);
        AnonymousClass00C.A0D(r7, 8);
        this.A01 = r6;
        this.A00 = r3;
        this.A08 = r9;
        this.A07 = r8;
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r10;
        this.A06 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            r7 = 0
            boolean r0 = X.C19550w8.A0A()
            if (r0 != 0) goto L_0x00f8
            java.lang.String r1 = r10.getAction()
            java.lang.String r0 = "android.nfc.action.NDEF_DISCOVERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r4 = "NfcChatHandlerImpl/processNfcIntent"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            java.lang.String r0 = "android.nfc.extra.NDEF_MESSAGES"
            android.os.Parcelable[] r1 = r10.getParcelableArrayExtra(r0)
            if (r1 == 0) goto L_0x00f8
            int r0 = r1.length
            if (r0 != 0) goto L_0x002b
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x002b:
            r5 = r1[r7]
            boolean r0 = r5 instanceof android.nfc.NdefMessage
            r6 = 0
            if (r0 == 0) goto L_0x00f8
            android.nfc.NdefMessage r5 = (android.nfc.NdefMessage) r5
            if (r5 == 0) goto L_0x00f8
            android.nfc.NdefRecord[] r0 = r5.getRecords()
            r0 = r0[r7]
            byte[] r2 = r0.getType()
            X.AnonymousClass00C.A08(r2)
            X.00T r3 = r8.A03
            java.lang.Object r0 = r3.getValue()
            X.AnonymousClass00C.A08(r0)
            java.nio.charset.Charset r0 = (java.nio.charset.Charset) r0
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r0)
            java.lang.String r0 = "application/com.whatsapp.chat"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f8
            android.nfc.NdefRecord[] r0 = r5.getRecords()
            r0 = r0[r7]
            byte[] r2 = r0.getPayload()
            X.AnonymousClass00C.A08(r2)
            java.lang.Object r1 = r3.getValue()
            X.AnonymousClass00C.A08(r1)
            java.nio.charset.Charset r1 = (java.nio.charset.Charset) r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0091 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r0 = "jid"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x0095 }
            goto L_0x009a
        L_0x008e:
            r0 = move-exception
            r2 = r6
            goto L_0x0096
        L_0x0091:
            r0 = move-exception
            r3 = r6
            r2 = r6
            goto L_0x0096
        L_0x0095:
            r0 = move-exception
        L_0x0096:
            com.whatsapp.util.Log.e(r4, r0)
            r1 = r6
        L_0x009a:
            X.13q r0 = X.AnonymousClass11F.A00
            X.11F r4 = r0.A02(r3)
            if (r4 == 0) goto L_0x00d8
            if (r2 == 0) goto L_0x00d8
            X.12q r0 = r8.A08
            boolean r0 = r0.A0M(r4)
            if (r0 != 0) goto L_0x00c6
            X.16D r0 = r8.A04
            X.141 r0 = r0.A08(r4)
            X.12t r2 = r8.A07
            if (r0 == 0) goto L_0x00ba
            X.3IL r0 = r0.A0F
            if (r0 != 0) goto L_0x00bb
        L_0x00ba:
            r6 = r1
        L_0x00bb:
            r0 = 42
            X.1jB r5 = new X.1jB
            r5.<init>(r8, r4, r0)
            r3 = 0
            r2.A05(r3, r4, r5, r6, r7)
        L_0x00c6:
            X.190 r0 = new X.190
            r0.<init>()
            android.content.Intent r1 = r0.A1Z(r9, r4, r7)
            java.lang.String r0 = "NewChatNfc:processNfcIntent"
            X.AnonymousClass3M9.A01(r1, r0)
            r9.startActivity(r1)
            return
        L_0x00d8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "NfcChatHandlerImpl/processNfcIntent jid is invalid: "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass143.A03(r4)
            r1.append(r0)
            java.lang.String r0 = " id: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27821Py.A01(android.content.Context, android.content.Intent):void");
    }

    public void A00(Activity activity) {
        if (!C19550w8.A0A() && this.A05.A0P("android.hardware.nfc") && this.A06.A02("android.permission.NFC") == 0) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
            if (defaultAdapter != null) {
                try {
                    NfcAdapter.class.getMethod("setNdefPushMessageCallback", new Class[]{NfcAdapter.CreateNdefMessageCallback.class, Activity.class, Activity[].class}).invoke(defaultAdapter, new Object[]{new AnonymousClass3WW(this), activity, new Activity[0]});
                } catch (IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                    Log.i("NfcChatHandlerImpl/onActivityCreated ", e);
                }
            }
            if ("android.nfc.action.NDEF_DISCOVERED".equals(activity.getIntent().getAction())) {
                Intent intent = activity.getIntent();
                AnonymousClass00C.A08(intent);
                A01(activity, intent);
            }
        }
    }
}
