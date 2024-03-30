package X;

import android.os.Binder;
import android.os.IBinder;
import com.whatsapp.instrumentation.InstrumentationInterface;
import com.whatsapp.instrumentation.api.InstrumentationService;

/* renamed from: X.4cD  reason: invalid class name and case insensitive filesystem */
public class C91544cD extends Binder implements InstrumentationInterface {
    public final /* synthetic */ InstrumentationService A00;

    public IBinder asBinder() {
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0a31 in list []
        	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:44)
        	at jadx.core.dex.instructions.SwitchNode.initBlocks(SwitchNode.java:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.lambda$initBlocksInTargetNodes$0(BlockSplitter.java:71)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.initBlocksInTargetNodes(BlockSplitter.java:68)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(BlockSplitter.java:53)
        */
    public boolean onTransact(int r38, android.os.Parcel r39, android.os.Parcel r40, int r41) {
        /*
            r37 = this;
            r3 = 1
            java.lang.String r2 = "com.whatsapp.instrumentation.InstrumentationInterface"
            r1 = r37
            r5 = r38
            r4 = r39
            r36 = r40
            if (r5 < r3) goto L_0x0dfd
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r5 > r0) goto L_0x0df8
            r4.enforceInterface(r2)
            if (r5 == r3) goto L_0x0d8a
            r10 = 2
            if (r5 != r10) goto L_0x0dfd
            java.lang.String r4 = r4.readString()
            com.whatsapp.instrumentation.api.InstrumentationService r1 = r1.A00
            X.1VH r0 = r1.A02
            X.6Ef r2 = r0.A00()
            r2.A00()
            android.os.Binder.clearCallingIdentity()
            X.5zD r6 = r1.A00     // Catch:{ Exception -> 0x0d7a }
            X.12U r0 = r6.A0I     // Catch:{ Exception -> 0x0d7a }
            boolean r0 = r0.A03()     // Catch:{ Exception -> 0x0d7a }
            if (r0 != 0) goto L_0x0048     // Catch:{ Exception -> 0x0d7a }
            java.lang.String r0 = "RequestHandler/request client is not registered"     // Catch:{ Exception -> 0x0d7a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x0d7a }
            java.lang.String r1 = "Client is not registered"     // Catch:{ Exception -> 0x0d7a }
            r0 = 7     // Catch:{ Exception -> 0x0d7a }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r0)     // Catch:{ Exception -> 0x0d7a }
        L_0x0042:
            java.lang.String r2 = java.util.Objects.toString(r5)     // Catch:{ Exception -> 0x0d7a }
            goto L_0x0e06     // Catch:{ Exception -> 0x0d7a }
        L_0x0048:
            X.1VC r0 = r6.A02     // Catch:{ Exception -> 0x0d7a }
            X.0yf r1 = r0.A00     // Catch:{ Exception -> 0x0d7a }
            X.0yi r0 = X.C21100yf.A0P     // Catch:{ Exception -> 0x0d7a }
            boolean r0 = r1.A09(r0)     // Catch:{ Exception -> 0x0d7a }
            java.lang.String r5 = "Feature is disabled!"     // Catch:{ Exception -> 0x0d7a }
            if (r0 != 0) goto L_0x0061     // Catch:{ Exception -> 0x0d7a }
            java.lang.String r0 = "RequestHandler/request service not enabled"     // Catch:{ Exception -> 0x0d7a }
        L_0x0058:
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x0d7a }
            r0 = 3     // Catch:{ Exception -> 0x0d7a }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r5, r0)     // Catch:{ Exception -> 0x0d7a }
            goto L_0x0042     // Catch:{ Exception -> 0x0d7a }
        L_0x0061:
            X.0wQ r0 = r6.A00     // Catch:{ Exception -> 0x0d7a }
            r0.A0G()     // Catch:{ Exception -> 0x0d7a }
            X.142 r1 = r0.A0E     // Catch:{ Exception -> 0x0d7a }
            if (r1 == 0) goto L_0x0073     // Catch:{ Exception -> 0x0d7a }
            X.3S0 r0 = r6.A0F     // Catch:{ Exception -> 0x0d7a }
            boolean r0 = r0.A00(r1)     // Catch:{ Exception -> 0x0d7a }
            if (r0 == 0) goto L_0x0073     // Catch:{ Exception -> 0x0d7a }
            goto L_0x0076     // Catch:{ Exception -> 0x0d7a }
        L_0x0073:
            java.lang.String r0 = "RequestHandler/request service not enabled for this number"     // Catch:{ Exception -> 0x0d7a }
            goto L_0x0058     // Catch:{ Exception -> 0x0d7a }
        L_0x0076:
            X.0z5 r0 = r6.A01     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r0.A02()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 != 0) goto L_0x0d3e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            org.json.JSONObject r4 = X.C36441kJ.A1C(r4)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r9 = "action"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r7 = r4.getString(r9)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r8 = "header"
            org.json.JSONObject r1 = r4.getJSONObject(r8)     // Catch:{ JSONException -> 0x0d35 }
            java.lang.String r0 = "protocol_version"     // Catch:{ JSONException -> 0x0d35 }
            int r0 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0d35 }
            if (r0 < r3) goto L_0x0d35     // Catch:{ JSONException -> 0x0d35 }
            java.lang.String r11 = "get_request_token"
            boolean r0 = r7.equals(r11)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0102     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.3Fg r5 = r6.A0G     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r4 = r2.A01     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            monitor-enter(r5)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.1VE r7 = r5.A00     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = "request/token"     // Catch:{ all -> 0x00fe }
            java.lang.String r1 = X.AnonymousClass1VE.A01(r4, r2)     // Catch:{ all -> 0x00fe }
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r7)     // Catch:{ all -> 0x00fe }
            java.lang.String r6 = X.C36371kC.A0t(r0, r1)     // Catch:{ all -> 0x00fe }
            if (r6 != 0) goto L_0x00e4     // Catch:{ all -> 0x00fe }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ all -> 0x00fe }
            r1.<init>()     // Catch:{ all -> 0x00fe }
            r0 = 16     // Catch:{ all -> 0x00fe }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x00fe }
            r1.nextBytes(r0)     // Catch:{ all -> 0x00fe }
            java.lang.String r6 = X.C90504aG.A0o(r0)     // Catch:{ all -> 0x00fe }
            java.lang.String r1 = X.AnonymousClass1VE.A01(r4, r2)     // Catch:{ all -> 0x00fe }
            java.lang.String r0 = "request/token_ts"     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = X.AnonymousClass1VE.A01(r4, r0)     // Catch:{ all -> 0x00fe }
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r7)     // Catch:{ all -> 0x00fe }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x00fe }
            android.content.SharedPreferences$Editor r2 = r0.putString(r1, r6)     // Catch:{ all -> 0x00fe }
            X.0wo r0 = r7.A01     // Catch:{ all -> 0x00fe }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x00fe }
            X.C36341k9.A0w(r2, r4, r0)     // Catch:{ all -> 0x00fe }
        L_0x00e4:
            monitor-exit(r5)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            org.json.JSONObject r5 = X.C36441kJ.A1B()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "request_token"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1.put(r0, r6)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "success"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r5.put(r0, r3)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "result"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r5.put(r0, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0042     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r2 = move-exception     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            monitor-exit(r5)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0d57     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0102:
            org.json.JSONObject r8 = r4.getJSONObject(r8)     // Catch:{ JSONException -> 0x0d2d }
            java.lang.String r1 = "authorization_token"     // Catch:{ JSONException -> 0x0d2d }
            java.lang.String r22 = ""     // Catch:{ JSONException -> 0x0d2d }
            r0 = r22     // Catch:{ JSONException -> 0x0d2d }
            java.lang.String r1 = r8.optString(r1, r0)     // Catch:{ JSONException -> 0x0d2d }
            if (r1 == 0) goto L_0x0d2d     // Catch:{ JSONException -> 0x0d2d }
            X.3Fg r0 = r6.A0G     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r8 = r2.A01     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r0.A00(r8, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0d1f     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5m3 r1 = r6.A08     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            int r13 = r7.hashCode()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            switch(r13) {
                case 711383033: goto L_0x0142;
                case 771140814: goto L_0x013f;
                case 1673427744: goto L_0x0144;
                default: goto L_0x0125;
            }     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0125:
            X.1VE r1 = r1.A00     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "metadata/last_active_time"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r12 = X.AnonymousClass1VE.A01(r8, r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            android.content.SharedPreferences$Editor r11 = r0.edit()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.0wo r0 = r1.A01     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.C36341k9.A0w(r11, r12, r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x014b     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x013f:
            java.lang.String r11 = "access_contacts"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0144     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0142:
            java.lang.String r11 = "get_call_state"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0144:
            boolean r0 = r7.equals(r11)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 != 0) goto L_0x014b     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0125     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x014b:
            r20 = 0     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            switch(r13) {
                case -1472535883: goto L_0x0c19;
                case -1368724237: goto L_0x0b79;
                case -624136624: goto L_0x051f;
                case -555816913: goto L_0x0c46;
                case -241377379: goto L_0x0152;
                case 565287780: goto L_0x04fc;
                case 628187957: goto L_0x042b;
                case 711383033: goto L_0x03e4;
                case 771140814: goto L_0x039e;
                case 1331833598: goto L_0x038e;
                case 1759298208: goto L_0x0374;
                case 1912051456: goto L_0x02e6;
                case 2060915200: goto L_0x015c;
                default: goto L_0x0150;
            }     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0150:
            goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0152:
            java.lang.String r0 = "stop_voice_message_playback"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 != 0) goto L_0x0c66     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x015c:
            java.lang.String r0 = "start_voip_call"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r0 = 494345332(0x1d771c74, float:3.2704888E-21)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.0zE r1 = r6.A0H     // Catch:{ all -> 0x0b6a }
            r35 = r1     // Catch:{ all -> 0x0b6a }
            r1.markerStart(r0)     // Catch:{ all -> 0x0b6a }
            X.5Az r10 = r6.A0C     // Catch:{ all -> 0x0b6a }
            java.lang.String r13 = "Group calling is disabled"     // Catch:{ all -> 0x0b6a }
            java.lang.String r8 = "stop_instrumentation_service_end"     // Catch:{ all -> 0x0b6a }
            java.lang.String r9 = "stop_instrumentation_service_start"     // Catch:{ all -> 0x0b6a }
            java.lang.String r1 = "payload"     // Catch:{ all -> 0x0b6a }
            org.json.JSONObject r4 = r4.getJSONObject(r1)     // Catch:{ all -> 0x0b6a }
            java.lang.String r1 = "contact_ids"     // Catch:{ all -> 0x0b6a }
            org.json.JSONArray r15 = r4.getJSONArray(r1)     // Catch:{ all -> 0x0b6a }
            int r1 = r15.length()     // Catch:{ all -> 0x0b6a }
            java.lang.String r11 = "Bad request - start_voip_call"     // Catch:{ all -> 0x0b6a }
            java.lang.String r5 = "fail_reason"     // Catch:{ all -> 0x0b6a }
            if (r1 != 0) goto L_0x019e     // Catch:{ all -> 0x0b6a }
            java.lang.String r1 = "requesthandler/handle-start-voip-call request did not include a contact"     // Catch:{ all -> 0x0b6a }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x0b6a }
            X.0zE r2 = r10.A0A     // Catch:{ all -> 0x0b6a }
            java.lang.String r1 = "no contact"     // Catch:{ all -> 0x0b6a }
            r2.markerAnnotate((int) r0, (java.lang.String) r5, (java.lang.String) r1)     // Catch:{ all -> 0x0b6a }
        L_0x0198:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r11, r3)     // Catch:{ all -> 0x0b6a }
            goto L_0x0b41     // Catch:{ all -> 0x0b6a }
        L_0x019e:
            java.util.HashSet r12 = X.C36441kJ.A16()     // Catch:{ all -> 0x0b6a }
            r14 = 0     // Catch:{ all -> 0x0b6a }
        L_0x01a3:
            int r1 = r15.length()     // Catch:{ SecurityException -> 0x01f1 }
            if (r14 >= r1) goto L_0x01e9     // Catch:{ SecurityException -> 0x01f1 }
            java.lang.String r4 = r15.getString(r14)     // Catch:{ SecurityException -> 0x01f1 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SecurityException -> 0x01f1 }
            if (r1 == 0) goto L_0x01c5     // Catch:{ SecurityException -> 0x01f1 }
            java.lang.String r1 = "requesthandler/handle-start-voip-call request included an empty contact"     // Catch:{ SecurityException -> 0x01f1 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ SecurityException -> 0x01f1 }
            X.0zE r2 = r10.A0A     // Catch:{ SecurityException -> 0x01f1 }
            java.lang.String r1 = "empty contact"     // Catch:{ SecurityException -> 0x01f1 }
            r2.markerAnnotate((int) r0, (java.lang.String) r5, (java.lang.String) r1)     // Catch:{ SecurityException -> 0x01f1 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r11, r3)     // Catch:{ SecurityException -> 0x01f1 }
            goto L_0x0b41     // Catch:{ SecurityException -> 0x01f1 }
        L_0x01c5:
            X.3G0 r1 = r10.A07     // Catch:{ SecurityException -> 0x01f1 }
            X.141 r4 = r1.A00(r2, r4)     // Catch:{ SecurityException -> 0x01f1 }
            boolean r1 = r4.A0G()     // Catch:{ SecurityException -> 0x01f1 }
            if (r1 == 0) goto L_0x01e3     // Catch:{ SecurityException -> 0x01f1 }
            java.lang.String r1 = "requesthandler/handle-start-voip-call cannot place group calls yet"     // Catch:{ SecurityException -> 0x01f1 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ SecurityException -> 0x01f1 }
            X.0zE r1 = r10.A0A     // Catch:{ SecurityException -> 0x01f1 }
            r1.markerAnnotate((int) r0, (java.lang.String) r5, (java.lang.String) r13)     // Catch:{ SecurityException -> 0x01f1 }
            r1 = 23     // Catch:{ SecurityException -> 0x01f1 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r13, r1)     // Catch:{ SecurityException -> 0x01f1 }
            goto L_0x0b41     // Catch:{ SecurityException -> 0x01f1 }
        L_0x01e3:
            r12.add(r4)     // Catch:{ SecurityException -> 0x01f1 }
            int r14 = r14 + 1     // Catch:{ SecurityException -> 0x01f1 }
            goto L_0x01a3     // Catch:{ SecurityException -> 0x01f1 }
        L_0x01e9:
            X.0zE r4 = r10.A0A     // Catch:{ SecurityException -> 0x01f1 }
            java.lang.String r1 = "contact list prepared"     // Catch:{ SecurityException -> 0x01f1 }
            r4.markerPoint(r0, r1)     // Catch:{ SecurityException -> 0x01f1 }
            goto L_0x0210     // Catch:{ SecurityException -> 0x01f1 }
            r8 = move-exception
            java.lang.String r1 = "requesthandler/handle-start-voip-call request included an invalid contact"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x0b6a }
            X.0zE r4 = r10.A0A     // Catch:{ all -> 0x0b6a }
            java.lang.String r1 = r8.getMessage()     // Catch:{ all -> 0x0b6a }
            if (r1 != 0) goto L_0x0205     // Catch:{ all -> 0x0b6a }
            java.lang.String r1 = "SecurityException"     // Catch:{ all -> 0x0b6a }
        L_0x0201:
            r4.markerAnnotate((int) r0, (java.lang.String) r5, (java.lang.String) r1)     // Catch:{ all -> 0x0b6a }
            goto L_0x0198     // Catch:{ all -> 0x0b6a }
        L_0x0205:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0b6a }
            java.lang.String r1 = "SecurityException:"     // Catch:{ all -> 0x0b6a }
            java.lang.String r1 = X.C36331k8.A0i(r1, r2, r8)     // Catch:{ all -> 0x0b6a }
            goto L_0x0201     // Catch:{ all -> 0x0b6a }
        L_0x0210:
            X.0yE r1 = r10.A06     // Catch:{ all -> 0x0b6a }
            boolean r1 = r1.A0C()     // Catch:{ all -> 0x0b6a }
            if (r1 == 0) goto L_0x02d4     // Catch:{ all -> 0x0b6a }
            X.0zA r1 = r10.A01     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            boolean r1 = r1.A00     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            if (r1 != 0) goto L_0x022d     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "foreground_app_start"     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            r4.markerPoint(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            X.6S5 r1 = r10.A09     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            X.AnonymousClass6S5.A00(r1, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "foreground_app_end"     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            r4.markerPoint(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x022d:
            X.0wo r11 = r10.A04     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            X.0wQ r1 = r10.A02     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            byte[] r1 = X.C237919w.A01(r1, r11, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r11 = X.C18750th.A06(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            X.7qj r1 = new X.7qj     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            r1.<init>(r10, r12, r11, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.util.concurrent.FutureTask r12 = new java.util.concurrent.FutureTask     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            r12.<init>(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            android.os.Handler r1 = r10.A00     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            r1.post(r12)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.Object r1 = r12.get()     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            int r12 = X.C90514aH.A0H(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "start_call_on_ui_thread_future_finished"     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            r4.markerPoint(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            X.6Uw r1 = r10.A08     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r11 = r1.A04(r2, r11)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            if (r12 == 0) goto L_0x028c     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            switch(r12) {
                case 2: goto L_0x027f;
                case 3: goto L_0x027a;
                case 4: goto L_0x0275;
                case 5: goto L_0x0270;
                case 6: goto L_0x026b;
                case 7: goto L_0x0266;
                case 8: goto L_0x0261;
                case 9: goto L_0x0261;
                default: goto L_0x0260;
            }     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x0260:
            goto L_0x0284     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x0261:
            r2 = 10     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "Can't initiate a call when already in a call."     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            goto L_0x0287     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x0266:
            r2 = 9     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "WhatsApp requires voice permissions for this operation."     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            goto L_0x0287     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x026b:
            r2 = 15     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "Video calling is disabled."     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            goto L_0x0287     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x0270:
            r2 = 11     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "The requested contact is blocked."     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            goto L_0x0287     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x0275:
            r2 = 12     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "WhatsApp needs an internet connection to perform this operation."     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            goto L_0x0287     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x027a:
            r2 = 14     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "Unable to perform requested operation as terms of service have not been accepted."     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            goto L_0x0287     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x027f:
            r2 = 13     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "Can't initiate a call when a pending call exists."     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            goto L_0x0287     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x0284:
            r2 = 5     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "Service internal error! start_voip_call"     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x0287:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            goto L_0x02ba     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
        L_0x028c:
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            java.lang.String r1 = "call_id"     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            org.json.JSONObject r1 = r2.put(r1, r11)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            goto L_0x02ba     // Catch:{ InterruptedException | ExecutionException -> 0x029b }
            r11 = move-exception
            java.lang.String r1 = r11.getMessage()     // Catch:{ all -> 0x02c7 }
            if (r1 != 0) goto L_0x02af     // Catch:{ all -> 0x02c7 }
            java.lang.String r1 = "Exception"     // Catch:{ all -> 0x02c7 }
        L_0x02a4:
            r4.markerAnnotate((int) r0, (java.lang.String) r5, (java.lang.String) r1)     // Catch:{ all -> 0x02c7 }
            r2 = 5     // Catch:{ all -> 0x02c7 }
            java.lang.String r1 = "Service internal error! start_voip_call"     // Catch:{ all -> 0x02c7 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r2)     // Catch:{ all -> 0x02c7 }
            goto L_0x02ba     // Catch:{ all -> 0x02c7 }
        L_0x02af:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02c7 }
            java.lang.String r1 = "Exception:"     // Catch:{ all -> 0x02c7 }
            java.lang.String r1 = X.C36331k8.A0i(r1, r2, r11)     // Catch:{ all -> 0x02c7 }
            goto L_0x02a4     // Catch:{ all -> 0x02c7 }
        L_0x02ba:
            r4.markerPoint(r0, r9)     // Catch:{ all -> 0x0b6a }
            X.6S5 r1 = r10.A09     // Catch:{ all -> 0x0b6a }
            X.AnonymousClass6S5.A01(r1, r3)     // Catch:{ all -> 0x0b6a }
            r4.markerPoint(r0, r8)     // Catch:{ all -> 0x0b6a }
            goto L_0x0b41     // Catch:{ all -> 0x0b6a }
            r2 = move-exception     // Catch:{ all -> 0x0b6a }
            r4.markerPoint(r0, r9)     // Catch:{ all -> 0x0b6a }
            X.6S5 r1 = r10.A09     // Catch:{ all -> 0x0b6a }
            X.AnonymousClass6S5.A01(r1, r3)     // Catch:{ all -> 0x0b6a }
            r4.markerPoint(r0, r8)     // Catch:{ all -> 0x0b6a }
            throw r2     // Catch:{ all -> 0x0b6a }
        L_0x02d4:
            java.lang.String r1 = "requesthandler/handle-start-voip-call insufficient permissions for call"     // Catch:{ all -> 0x0b6a }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x0b6a }
            java.lang.String r2 = "WhatsApp requires voice permissions for this operation."     // Catch:{ all -> 0x0b6a }
            r4.markerAnnotate((int) r0, (java.lang.String) r5, (java.lang.String) r2)     // Catch:{ all -> 0x0b6a }
            r1 = 9     // Catch:{ all -> 0x0b6a }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r2, r1)     // Catch:{ all -> 0x0b6a }
            goto L_0x0b41     // Catch:{ all -> 0x0b6a }
        L_0x02e6:
            java.lang.String r0 = "mark_message_read"
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5Aw r5 = r6.A09     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "payload"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            org.json.JSONObject r1 = r4.getJSONObject(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "message_id"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ SecurityException -> 0x0370 }
            X.3G1 r0 = r5.A01     // Catch:{ SecurityException -> 0x0370 }
            X.3T1 r10 = r0.A00(r2, r1)     // Catch:{ SecurityException -> 0x0370 }
            X.3Qa r0 = r10.A1J     // Catch:{ SecurityException -> 0x0370 }
            X.11F r9 = r0.A00     // Catch:{ SecurityException -> 0x0370 }
            X.C18740tg.A06(r9)     // Catch:{ SecurityException -> 0x0370 }
            X.12t r8 = r5.A00     // Catch:{ SecurityException -> 0x0370 }
            r13 = 3     // Catch:{ SecurityException -> 0x0370 }
            X.12q r1 = r8.A00     // Catch:{ SecurityException -> 0x0370 }
            r0 = 0     // Catch:{ SecurityException -> 0x0370 }
            X.3Qp r2 = r1.A09(r9, r0)     // Catch:{ SecurityException -> 0x0370 }
            if (r2 != 0) goto L_0x0328     // Catch:{ SecurityException -> 0x0370 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SecurityException -> 0x0370 }
            java.lang.String r0 = "msgstore/setChatPartiallySeen/nochat/"     // Catch:{ SecurityException -> 0x0370 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r9, r0, r1)     // Catch:{ SecurityException -> 0x0370 }
        L_0x031f:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x0370 }
        L_0x0322:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r20)     // Catch:{ SecurityException -> 0x0370 }
            goto L_0x0c27     // Catch:{ SecurityException -> 0x0370 }
        L_0x0328:
            long r4 = r2.A0Q     // Catch:{ SecurityException -> 0x0370 }
            long r0 = r10.A1O     // Catch:{ SecurityException -> 0x0370 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))     // Catch:{ SecurityException -> 0x0370 }
            if (r6 < 0) goto L_0x0333     // Catch:{ SecurityException -> 0x0370 }
            java.lang.String r0 = "msgstore/setChatPartiallySeen/message already seen"     // Catch:{ SecurityException -> 0x0370 }
            goto L_0x031f     // Catch:{ SecurityException -> 0x0370 }
        L_0x0333:
            X.005 r4 = r8.A01     // Catch:{ SecurityException -> 0x0370 }
            java.lang.Object r0 = r4.get()     // Catch:{ SecurityException -> 0x0370 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ SecurityException -> 0x0370 }
            X.17U r5 = r0.A0K     // Catch:{ SecurityException -> 0x0370 }
            long r0 = r10.A1O     // Catch:{ SecurityException -> 0x0370 }
            int r11 = r5.A00(r9, r0)     // Catch:{ SecurityException -> 0x0370 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SecurityException -> 0x0370 }
            java.lang.String r0 = "msgstore/setChatPartiallySeen/"     // Catch:{ SecurityException -> 0x0370 }
            r1.append(r0)     // Catch:{ SecurityException -> 0x0370 }
            r1.append(r9)     // Catch:{ SecurityException -> 0x0370 }
            java.lang.String r0 = "/"     // Catch:{ SecurityException -> 0x0370 }
            r1.append(r0)     // Catch:{ SecurityException -> 0x0370 }
            java.lang.String r0 = r2.A09()     // Catch:{ SecurityException -> 0x0370 }
            X.C36321k7.A1a(r1, r0)     // Catch:{ SecurityException -> 0x0370 }
            java.lang.Object r0 = r4.get()     // Catch:{ SecurityException -> 0x0370 }
            X.1Do r0 = (X.C24731Do) r0     // Catch:{ SecurityException -> 0x0370 }
            X.17U r2 = r0.A0K     // Catch:{ SecurityException -> 0x0370 }
            long r0 = r10.A1O     // Catch:{ SecurityException -> 0x0370 }
            int r12 = r2.A02(r9, r0)     // Catch:{ SecurityException -> 0x0370 }
            int r11 = r11 - r12     // Catch:{ SecurityException -> 0x0370 }
            r14 = 1     // Catch:{ SecurityException -> 0x0370 }
            r15 = 0     // Catch:{ SecurityException -> 0x0370 }
            X.C220712t.A00(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ SecurityException -> 0x0370 }
            goto L_0x0322     // Catch:{ SecurityException -> 0x0370 }
            java.lang.String r0 = "Bad request - mark_message_read"
            goto L_0x0519
        L_0x0374:
            java.lang.String r0 = "mute_unmute_mic"
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "Request is not implemented yet!mute_unmute_mic"
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r10)     // Catch:{ Exception -> 0x0384 }
            goto L_0x0c27     // Catch:{ Exception -> 0x0384 }
            r1 = move-exception
            java.lang.String r0 = "MuteUnmuteMicRequest/handleRequest Error: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "Bad request - mute_unmute_mic"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0519     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x038e:
            java.lang.String r0 = "reject_call"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5B0 r0 = r6.A0E     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            org.json.JSONObject r5 = r0.A00(r2, r4)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x039e:
            java.lang.String r0 = "access_contacts"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5Au r2 = r6.A04     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            android.net.Uri r0 = X.C89024Uy.A00     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1.add(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.1VF r5 = r2.A00     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.1VH r0 = r5.A01     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r0.A02(r8)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x03bc:
            boolean r0 = r4.hasNext()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x03de     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.Object r2 = r4.next()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            android.net.Uri r2 = (android.net.Uri) r2     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r1 = r2.getAuthority()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "com.whatsapp.provider.instrumentation"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r0.equals(r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0d48     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.0wG r0 = r5.A00     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            android.content.Context r1 = r0.A00     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r0 = 129(0x81, float:1.81E-43)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1.grantUriPermission(r8, r2, r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x03bc     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x03de:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r20)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x03e4:
            java.lang.String r0 = "get_call_state"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r0 = 494341755(0x1d770e7b, float:3.2697664E-21)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.0zE r1 = r6.A0H     // Catch:{ all -> 0x0b6a }
            r35 = r1     // Catch:{ all -> 0x0b6a }
            java.lang.String r5 = "trigger_type"     // Catch:{ all -> 0x0b6a }
            java.lang.String r4 = "request"     // Catch:{ all -> 0x0b6a }
            r1.markerStart(r0, r5, r4)     // Catch:{ all -> 0x0b6a }
            X.5B3 r8 = r6.A06     // Catch:{ all -> 0x0b6a }
            X.004 r1 = r8.A08     // Catch:{ all -> 0x0b6a }
            java.lang.Object r5 = r1.get()     // Catch:{ all -> 0x0b6a }
            com.whatsapp.voipcalling.CallState r5 = (com.whatsapp.voipcalling.CallState) r5     // Catch:{ all -> 0x0b6a }
            X.004 r1 = r8.A07     // Catch:{ all -> 0x0b6a }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x0b6a }
            com.whatsapp.voipcalling.CallInfo r4 = (com.whatsapp.voipcalling.CallInfo) r4     // Catch:{ all -> 0x0b6a }
            X.0wQ r9 = r8.A00     // Catch:{ all -> 0x0b6a }
            X.0zE r1 = r8.A06     // Catch:{ all -> 0x0b6a }
            X.16D r10 = r8.A01     // Catch:{ all -> 0x0b6a }
            X.171 r11 = r8.A02     // Catch:{ all -> 0x0b6a }
            X.32G r12 = r8.A03     // Catch:{ all -> 0x0b6a }
            X.6Uw r14 = r8.A05     // Catch:{ all -> 0x0b6a }
            X.3G0 r13 = r8.A04     // Catch:{ all -> 0x0b6a }
            r15 = r1     // Catch:{ all -> 0x0b6a }
            r16 = r2     // Catch:{ all -> 0x0b6a }
            r17 = r4     // Catch:{ all -> 0x0b6a }
            r18 = r5     // Catch:{ all -> 0x0b6a }
            org.json.JSONObject r1 = X.AnonymousClass5B3.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b6a }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r1)     // Catch:{ all -> 0x0b6a }
            goto L_0x0b41     // Catch:{ all -> 0x0b6a }
        L_0x042b:
            java.lang.String r0 = "accept_call"
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5Ax r8 = r6.A03     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r11 = "WhatsApp requires voice permissions for this operation."     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r13 = "Group calling is disabled"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "There is no call with that call id"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r14 = "There is no incoming call"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r16 = 1     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r5 = 2     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r9 = 3     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r6 = 494340632(0x1d770a18, float:3.2695396E-21)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.0zE r1 = r8.A04     // Catch:{ all -> 0x04f0 }
            r1.markerStart(r6)     // Catch:{ all -> 0x04f0 }
            java.lang.String r12 = "payload"     // Catch:{ all -> 0x04f0 }
            org.json.JSONObject r4 = r4.getJSONObject(r12)     // Catch:{ all -> 0x04f0 }
            com.whatsapp.voipcalling.CallState r12 = com.whatsapp.voipcalling.Voip.getCurrentCallState()     // Catch:{ all -> 0x04f0 }
            boolean r15 = com.whatsapp.voipcalling.Voip.A09(r12)     // Catch:{ all -> 0x04f0 }
            java.lang.String r12 = "fail_reason"
            if (r15 != 0) goto L_0x0466
            r1.markerAnnotate((int) r6, (java.lang.String) r12, (java.lang.String) r14)     // Catch:{ all -> 0x04f0 }
            r0 = 18     // Catch:{ all -> 0x04f0 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r14, r0)     // Catch:{ all -> 0x04f0 }
            goto L_0x04eb     // Catch:{ all -> 0x04f0 }
        L_0x0466:
            java.lang.String r14 = "call_id"     // Catch:{ all -> 0x04f0 }
            java.lang.String r14 = r4.getString(r14)     // Catch:{ all -> 0x04f0 }
            X.6Uw r4 = r8.A03     // Catch:{ all -> 0x04f0 }
            java.lang.String r2 = r4.A03(r2, r14)     // Catch:{ all -> 0x04f0 }
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()     // Catch:{ all -> 0x04f0 }
            if (r4 == 0) goto L_0x04e2     // Catch:{ all -> 0x04f0 }
            java.lang.String r14 = r4.callId     // Catch:{ all -> 0x04f0 }
            boolean r14 = r2.equals(r14)     // Catch:{ all -> 0x04f0 }
            if (r14 == 0) goto L_0x04e2     // Catch:{ all -> 0x04f0 }
            boolean r0 = r4.isGroupCall     // Catch:{ all -> 0x04f0 }
            if (r0 != 0) goto L_0x04d8     // Catch:{ all -> 0x04f0 }
            boolean r0 = r4.isJoinableGroupCall     // Catch:{ all -> 0x04f0 }
            if (r0 != 0) goto L_0x04d8     // Catch:{ all -> 0x04f0 }
            boolean r14 = r4.videoEnabled     // Catch:{ all -> 0x04f0 }
            X.13J r13 = r8.A05     // Catch:{ all -> 0x04f0 }
            X.0yE r4 = r8.A02     // Catch:{ all -> 0x04f0 }
            boolean r0 = r4.A0C()     // Catch:{ all -> 0x04f0 }
            if (r0 == 0) goto L_0x04ce     // Catch:{ all -> 0x04f0 }
            boolean r0 = X.AnonymousClass3UD.A08(r4, r13, r14)     // Catch:{ all -> 0x04f0 }
            if (r0 != 0) goto L_0x04ce     // Catch:{ all -> 0x04f0 }
            X.0wG r0 = r8.A01     // Catch:{ all -> 0x04f0 }
            android.content.Context r4 = r0.A00     // Catch:{ all -> 0x04f0 }
            X.0zA r0 = r8.A00     // Catch:{ all -> 0x04f0 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x04f0 }
            boolean r26 = X.AnonymousClass000.A1Q(r0)
            X.190 r21 = X.C36441kJ.A0j()     // Catch:{ all -> 0x04f0 }
            java.lang.String r23 = X.C114145gi.A00     // Catch:{ all -> 0x04f0 }
            r25 = 3     // Catch:{ all -> 0x04f0 }
            r22 = r4     // Catch:{ all -> 0x04f0 }
            r24 = r2     // Catch:{ all -> 0x04f0 }
            android.content.Intent r2 = r21.A1d(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x04f0 }
            java.lang.String r0 = "start_activity_start"     // Catch:{ all -> 0x04f0 }
            r1.markerPoint(r6, r0)     // Catch:{ all -> 0x04f0 }
            r4.startActivity(r2)     // Catch:{ all -> 0x04f0 }
            java.lang.String r0 = "start_activity_end"     // Catch:{ all -> 0x04f0 }
            r1.markerPoint(r6, r0)     // Catch:{ all -> 0x04f0 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r20)     // Catch:{ all -> 0x04cc }
            r1.markerEnd(r6, r10)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1 = move-exception
            goto L_0x04f3
        L_0x04ce:
            r1.markerAnnotate((int) r6, (java.lang.String) r12, (java.lang.String) r11)     // Catch:{ all -> 0x04f0 }
            r0 = 9     // Catch:{ all -> 0x04f0 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r11, r0)     // Catch:{ all -> 0x04f0 }
            goto L_0x04eb     // Catch:{ all -> 0x04f0 }
        L_0x04d8:
            r1.markerAnnotate((int) r6, (java.lang.String) r12, (java.lang.String) r13)     // Catch:{ all -> 0x04f0 }
            r0 = 23     // Catch:{ all -> 0x04f0 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r13, r0)     // Catch:{ all -> 0x04f0 }
            goto L_0x04eb     // Catch:{ all -> 0x04f0 }
        L_0x04e2:
            r1.markerAnnotate((int) r6, (java.lang.String) r12, (java.lang.String) r0)     // Catch:{ all -> 0x04f0 }
            r2 = 17     // Catch:{ all -> 0x04f0 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r2)     // Catch:{ all -> 0x04f0 }
        L_0x04eb:
            r1.markerEnd(r6, r9)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1 = move-exception
            r16 = 0
        L_0x04f3:
            X.0zE r0 = r8.A04     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r16 != 0) goto L_0x04f8     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r5 = 3     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x04f8:
            r0.markerEnd(r6, r5)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            throw r1     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x04fc:
            java.lang.String r0 = "announce_user_opt_out"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5Av r0 = r6.A05     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.1ex r0 = r0.A00     // Catch:{ Exception -> 0x0511 }
            r0.A00(r8)     // Catch:{ Exception -> 0x0511 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r20)     // Catch:{ Exception -> 0x0511 }
            goto L_0x0c27     // Catch:{ Exception -> 0x0511 }
            r1 = move-exception
            java.lang.String r0 = "AnnounceUserOptOutRequest/handleRequest Error revoking access: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "Bad request - announce_user_opt_out"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0519:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r3)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x051f:
            java.lang.String r0 = "send_message"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r0 = 494340037(0x1d7707c5, float:3.2694195E-21)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.0zE r1 = r6.A0H     // Catch:{ all -> 0x0b6a }
            r35 = r1     // Catch:{ all -> 0x0b6a }
            r1.markerStart(r0)     // Catch:{ all -> 0x0b6a }
            X.5B2 r1 = r6.A0B     // Catch:{ all -> 0x0b6a }
            java.lang.String r21 = "plain_text"     // Catch:{ all -> 0x0b6a }
            java.lang.String r8 = "media_type"     // Catch:{ all -> 0x0b6a }
            java.lang.String r9 = "payload"     // Catch:{ all -> 0x0b6a }
            org.json.JSONObject r4 = r4.getJSONObject(r9)     // Catch:{ all -> 0x0b6a }
            java.lang.String r9 = "contact_id"     // Catch:{ all -> 0x0b6a }
            java.lang.String r11 = r4.getString(r9)     // Catch:{ all -> 0x0b6a }
            X.3G0 r9 = r1.A0A     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.141 r11 = r9.A00(r2, r11)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.11F r9 = X.C36331k8.A0G(r11)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.3S0 r2 = r1.A0C     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r2 = r2.A01(r9)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r2 != 0) goto L_0x055c     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r1 = 3     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r5, r1)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x055c:
            boolean r2 = r11.A0G()     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r2 == 0) goto L_0x0584     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.11F r12 = r11.A0H     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r2 = r12 instanceof X.AnonymousClass147     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r2 == 0) goto L_0x0584     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.jid.GroupJid r12 = (com.whatsapp.jid.GroupJid) r12     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.17X r2 = r1.A08     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r2 = r2.A0C(r12)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r2 == 0) goto L_0x057a     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.1EM r2 = r1.A0I     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r2 = r2.A04(r11, r12)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r2 == 0) goto L_0x0584     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x057a:
            r2 = 16     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "You can't send a message to this group"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0584:
            X.1NG r12 = r1.A02     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.jid.UserJid r2 = X.C36351kA.A0l(r11)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r2 = r12.A0O(r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r2 == 0) goto L_0x059a     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2 = 11     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "The requested contact is blocked."     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x059a:
            X.5xA r2 = r1.A0B     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.17T r12 = r2.A04     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r11 = r12.A08(r9)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r11 != 0) goto L_0x05b3     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "system-messages-handler/new chat initiated"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2 = 22     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "User tries to start a new thread which would produce a system message"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x05b3:
            boolean r11 = r12.A08(r9)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r11 != 0) goto L_0x05c8     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "system-messages-handler/new chat initiated"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x05be:
            r2 = 20     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "There is a critical unread system message in the thread"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x05c8:
            X.12t r11 = r2.A01     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r11 = r11.A0A(r9)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r11 == 0) goto L_0x0690     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.12q r11 = r2.A02     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            long r26 = r11.A07(r9)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.0xM r11 = r2.A03     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r25 = 100     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r28 = -1     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r23 = r11     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r24 = r9     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.36f r19 = r23.A0S(r24, r25, r26, r28)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r11 = r19
            android.database.Cursor r11 = r11.A00     // Catch:{ all -> 0x0682 }
            r18 = r11     // Catch:{ all -> 0x0682 }
            if (r11 == 0) goto L_0x0690     // Catch:{ all -> 0x0682 }
            boolean r11 = r18.moveToFirst()     // Catch:{ all -> 0x0682 }
            if (r11 != 0) goto L_0x05f4     // Catch:{ all -> 0x0682 }
            goto L_0x068d     // Catch:{ all -> 0x0682 }
        L_0x05f4:
            X.1A1 r12 = r2.A05     // Catch:{ all -> 0x0682 }
            r11 = r18     // Catch:{ all -> 0x0682 }
            X.3T1 r13 = r12.A01(r11, r9)     // Catch:{ all -> 0x0682 }
            if (r13 == 0) goto L_0x0666     // Catch:{ all -> 0x0682 }
            long r11 = r13.A1N     // Catch:{ all -> 0x0682 }
            int r14 = (r11 > r26 ? 1 : (r11 == r26 ? 0 : -1))     // Catch:{ all -> 0x0682 }
            if (r14 == 0) goto L_0x0666     // Catch:{ all -> 0x0682 }
            long r14 = r13.A0I     // Catch:{ all -> 0x0682 }
            X.0wo r11 = r2.A00     // Catch:{ all -> 0x0682 }
            long r16 = X.C19970wo.A00(r11)     // Catch:{ all -> 0x0682 }
            r11 = 86400000(0x5265c00, double:4.2687272E-316)     // Catch:{ all -> 0x0682 }
            long r16 = r16 - r11     // Catch:{ all -> 0x0682 }
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))     // Catch:{ all -> 0x0682 }
            if (r11 < 0) goto L_0x0666     // Catch:{ all -> 0x0682 }
            boolean r11 = r13 instanceof X.AnonymousClass2bH     // Catch:{ all -> 0x0682 }
            if (r11 != 0) goto L_0x067d     // Catch:{ all -> 0x0682 }
            boolean r11 = r13 instanceof X.AnonymousClass2bI     // Catch:{ all -> 0x0682 }
            if (r11 == 0) goto L_0x0666     // Catch:{ all -> 0x0682 }
            X.2bI r13 = (X.AnonymousClass2bI) r13     // Catch:{ all -> 0x0682 }
            int r11 = r13.A00     // Catch:{ all -> 0x0682 }
            java.util.Set r12 = X.C56672wh.A01     // Catch:{ all -> 0x0682 }
            r12 = 22     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 23     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 24     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 25     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 26     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 34     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 35     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 36     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 46     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 47     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 48     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 49     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 50     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 55     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 62     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            r12 = 63     // Catch:{ all -> 0x0682 }
            if (r11 == r12) goto L_0x066d     // Catch:{ all -> 0x0682 }
            switch(r11) {
                case 4: goto L_0x0670;
                case 12: goto L_0x0670;
                case 18: goto L_0x0670;
                case 20: goto L_0x0670;
                case 27: goto L_0x0670;
                case 52: goto L_0x0670;
                case 56: goto L_0x0670;
                case 57: goto L_0x0670;
                case 59: goto L_0x0670;
                case 67: goto L_0x0670;
                case 71: goto L_0x0670;
                case 79: goto L_0x0670;
                case 80: goto L_0x0670;
                case 90: goto L_0x0670;
                case 106: goto L_0x0670;
                case 123: goto L_0x0670;
                case 124: goto L_0x0670;
                case 126: goto L_0x0670;
                case 127: goto L_0x0670;
                case 130: goto L_0x0670;
                case 131: goto L_0x0670;
                case 144: goto L_0x0670;
                case 149: goto L_0x0670;
                default: goto L_0x0666;
            }     // Catch:{ all -> 0x0682 }
        L_0x0666:
            boolean r11 = r18.moveToNext()     // Catch:{ all -> 0x0682 }
            if (r11 != 0) goto L_0x05f4     // Catch:{ all -> 0x0682 }
            goto L_0x068d     // Catch:{ all -> 0x0682 }
        L_0x066d:
            java.lang.String r1 = "system-messages-handler/critical message"     // Catch:{ all -> 0x0682 }
            goto L_0x067a     // Catch:{ all -> 0x0682 }
        L_0x0670:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0682 }
            java.lang.String r1 = "system-messages-handler/critical message "     // Catch:{ all -> 0x0682 }
            java.lang.String r1 = X.AnonymousClass000.A0r(r1, r2, r11)     // Catch:{ all -> 0x0682 }
        L_0x067a:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0682 }
        L_0x067d:
            r18.close()     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x05be     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2 = move-exception     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r1 = r19     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            android.database.Cursor r1 = r1.A00     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r1 == 0) goto L_0x068c     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r1.close()     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x068c:
            throw r2     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x068d:
            r18.close()     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0690:
            X.0zE r2 = r1.A0H     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r11 = "contact_checks_end"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2.markerPoint(r0, r11)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r11 = r21     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r13 = r4.optString(r8, r11)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r11 = "media_uri"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r17 = r4.optString(r11)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r11 = "message"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r23 = r4.optString(r11)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r12 = "media_quality"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r11 = -1     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            int r11 = r4.optInt(r12, r11)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r12 = "visualization_data"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONArray r15 = r4.optJSONArray(r12)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r4 = "read_payload_end"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2.markerPoint(r0, r4)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            int r16 = r13.hashCode()     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r14 = "voice_message"
            java.lang.String r12 = "video"
            java.lang.String r4 = "photo"
            switch(r16) {
                case 106642994: goto L_0x0a31;
                case 112202875: goto L_0x0940;
                case 354039290: goto L_0x06ca;
                case 1021751938: goto L_0x0af4;
                default: goto L_0x06c8;
            }     // Catch:{ all -> 0x0b6a }
        L_0x06c8:
            goto L_0x0b2f     // Catch:{ all -> 0x0b6a }
        L_0x06ca:
            boolean r4 = r13.equals(r14)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r4 == 0) goto L_0x0b2f     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2.markerAnnotate((int) r0, (java.lang.String) r8, (java.lang.String) r14)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r4 = android.text.TextUtils.isEmpty(r17)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r4 == 0) goto L_0x06e6     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "SendMessageRequest/sendVoiceMessage/ empty URI"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Bad request -  voice message uri is empty"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r3)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x06e6:
            X.1VC r4 = r1.A09     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.0yC r8 = r4.A01     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r4 = 5649(0x1611, float:7.916E-42)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r4 = r8.A0E(r4)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r4 != 0) goto L_0x06fa     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "SendMessageRequest/sendVoiceMessage/ feature disabled"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r1 = 3     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0936     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x06fa:
            X.AnonymousClass5B2.A00(r1)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            android.net.Uri r5 = android.net.Uri.parse(r17)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.3Qj r8 = new X.3Qj     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r8.<init>()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.1GX r4 = r1.A0J     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.io.File r11 = r4.A0h(r5)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r4 = "parse_uri_end"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r2.markerPoint(r0, r4)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.5qD r12 = r1.A0D     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            boolean r4 = r11.canRead()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            if (r4 != 0) goto L_0x073c     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.6Rw r4 = r12.A00     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "emitFileNotExistsError"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r2 = "PTT_VALIDATION_FILE_NOT_EXIST"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r1 = r20     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.C132036Rw.A01(r4, r2, r1)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x0727:
            java.lang.String r1 = "isValidVoiceMessageFile file validation failed"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x072c:
            java.lang.String r1 = "SendMessageRequest/sendVoiceMessage/ file validation failed"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r11.delete()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Bad request -  voice message file validation failed"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r3)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x073c:
            long r4 = r11.length()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r16 = 0     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            int r13 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            if (r13 <= 0) goto L_0x0831     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r16 = 2000000(0x1e8480, double:9.881313E-318)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            int r13 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            if (r13 > 0) goto L_0x0831     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r4 = r11.getAbsolutePath()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.media.OggAnalyzer$OggFileReport r13 = com.whatsapp.media.OggAnalyzer.examineOggStream(r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            boolean r4 = r13.isAudioStreamOpus     // Catch:{ OggAnalyzerException -> 0x0813 }
            if (r4 != 0) goto L_0x0768     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.6Rw r4 = r12.A00     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "emitNotOpusError"     // Catch:{ OggAnalyzerException -> 0x0813 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r2 = "PTT_VALIDATION_NOT_OPUS"     // Catch:{ OggAnalyzerException -> 0x0813 }
            r1 = r20     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.C132036Rw.A01(r4, r2, r1)     // Catch:{ OggAnalyzerException -> 0x0813 }
            goto L_0x072c     // Catch:{ OggAnalyzerException -> 0x0813 }
        L_0x0768:
            float r4 = r13.fileDurationSeconds     // Catch:{ OggAnalyzerException -> 0x0813 }
            r5 = 1065353216(0x3f800000, float:1.0)     // Catch:{ OggAnalyzerException -> 0x0813 }
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))     // Catch:{ OggAnalyzerException -> 0x0813 }
            if (r5 >= 0) goto L_0x0789     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.6Rw r8 = r12.A00     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "emitDurationTooShortError durationSeconds="     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = X.C90484aE.A0o(r1, r2, r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r2 = X.C132036Rw.A00(r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "PTT_VALIDATION_DURATION_MIN"     // Catch:{ OggAnalyzerException -> 0x0813 }
        L_0x0785:
            X.C132036Rw.A01(r8, r1, r2)     // Catch:{ OggAnalyzerException -> 0x0813 }
            goto L_0x072c     // Catch:{ OggAnalyzerException -> 0x0813 }
        L_0x0789:
            r5 = 1133903872(0x43960000, float:300.0)     // Catch:{ OggAnalyzerException -> 0x0813 }
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))     // Catch:{ OggAnalyzerException -> 0x0813 }
            if (r5 <= 0) goto L_0x07a5     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.6Rw r8 = r12.A00     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "emitDurationTooLongError durationSeconds="     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = X.C90484aE.A0o(r1, r2, r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r2 = X.C132036Rw.A00(r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "PTT_VALIDATION_DURATION_MAX"     // Catch:{ OggAnalyzerException -> 0x0813 }
            goto L_0x0785     // Catch:{ OggAnalyzerException -> 0x0813 }
        L_0x07a5:
            int r4 = r13.numberOfStreams     // Catch:{ OggAnalyzerException -> 0x0813 }
            if (r4 == r3) goto L_0x07bb     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.6Rw r8 = r12.A00     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "emitMultipleStreamsError streamsCount="     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.C36321k7.A1U(r1, r2, r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r2 = java.lang.Integer.toString(r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "PTT_VALIDATION_MULTIPLE_STREAMS"     // Catch:{ OggAnalyzerException -> 0x0813 }
            goto L_0x0785     // Catch:{ OggAnalyzerException -> 0x0813 }
        L_0x07bb:
            int r5 = r13.samplingRate     // Catch:{ OggAnalyzerException -> 0x0813 }
            r4 = 16000(0x3e80, float:2.2421E-41)     // Catch:{ OggAnalyzerException -> 0x0813 }
            if (r5 == r4) goto L_0x07d3     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.6Rw r8 = r12.A00     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "emitSamplingRateError samplingRateHz="     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.C36321k7.A1U(r1, r2, r5)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r2 = java.lang.Integer.toString(r5)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "PTT_VALIDATION_SAMPLING_RATE"     // Catch:{ OggAnalyzerException -> 0x0813 }
            goto L_0x0785     // Catch:{ OggAnalyzerException -> 0x0813 }
        L_0x07d3:
            int r4 = r13.channels     // Catch:{ OggAnalyzerException -> 0x0813 }
            if (r4 == r3) goto L_0x07e9     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.6Rw r8 = r12.A00     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "emitChannelsCountError channelsCount="     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.C36321k7.A1U(r1, r2, r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r2 = java.lang.Integer.toString(r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r1 = "PTT_VALIDATION_CHANNELS"     // Catch:{ OggAnalyzerException -> 0x0813 }
            goto L_0x0785     // Catch:{ OggAnalyzerException -> 0x0813 }
        L_0x07e9:
            X.6Rw r5 = r12.A00     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.1VC r4 = r5.A00     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.0yC r13 = r4.A01     // Catch:{ OggAnalyzerException -> 0x0813 }
            r4 = 6076(0x17bc, float:8.514E-42)     // Catch:{ OggAnalyzerException -> 0x0813 }
            boolean r4 = r13.A0E(r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            if (r4 != 0) goto L_0x07fd     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r4 = "emitSuccess suppressed"     // Catch:{ OggAnalyzerException -> 0x0813 }
            com.whatsapp.util.Log.w((java.lang.String) r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            goto L_0x0858     // Catch:{ OggAnalyzerException -> 0x0813 }
        L_0x07fd:
            java.lang.String r4 = "emitSuccess"     // Catch:{ OggAnalyzerException -> 0x0813 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ OggAnalyzerException -> 0x0813 }
            X.0zE r13 = r5.A01     // Catch:{ OggAnalyzerException -> 0x0813 }
            r5 = 494345136(0x1d771bb0, float:3.2704492E-21)     // Catch:{ OggAnalyzerException -> 0x0813 }
            r13.markerStart(r5)     // Catch:{ OggAnalyzerException -> 0x0813 }
            java.lang.String r4 = "is_success"     // Catch:{ OggAnalyzerException -> 0x0813 }
            r13.markerAnnotate((int) r5, (java.lang.String) r4, (boolean) r3)     // Catch:{ OggAnalyzerException -> 0x0813 }
            r13.markerEnd(r5, r10)     // Catch:{ OggAnalyzerException -> 0x0813 }
            goto L_0x0858     // Catch:{ OggAnalyzerException -> 0x0813 }
            r2 = move-exception
            java.lang.String r1 = "isValidVoiceMessageFile failed to parse file"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.6Rw r5 = r12.A00     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            int r4 = r2.errorCode     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "emitOpusParsingError errorCode="     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.C36321k7.A1U(r1, r2, r4)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r2 = java.lang.Integer.toString(r4)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "PTT_VALIDATION_PARSING"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.C132036Rw.A01(r5, r1, r2)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x072c     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x0831:
            X.6Rw r8 = r12.A00     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "emitFileSizeError fileSizeBytes="     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = X.C36381kD.A0z(r1, r2, r4)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            double r1 = (double) r4     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            double r1 = r1 / r4     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            double r1 = java.lang.Math.ceil(r1)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            double r1 = r1 * r4     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            long r1 = java.lang.Math.round(r1)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r2 = java.lang.Long.toString(r1)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "PTT_VALIDATION_FILE_SIZE"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.C132036Rw.A01(r8, r1, r2)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0727     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x0858:
            java.lang.String r4 = "file_validation_end"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r2.markerPoint(r0, r4)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r4 = 0     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            if (r15 != 0) goto L_0x0863     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r5 = "parseVoiceMessageVisualizationData jsonVisualizationData is null"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x08e0     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x0863:
            int r14 = r15.length()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            if (r14 < r3) goto L_0x08d6     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r5 = 10000(0x2710, float:1.4013E-41)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            if (r14 > r5) goto L_0x08d6     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.util.ArrayList r5 = X.C36441kJ.A14(r14)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r13 = 0     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x0872:
            int r12 = r15.getInt(r13)     // Catch:{ JSONException -> 0x08c7 }
            if (r12 < 0) goto L_0x08bd     // Catch:{ JSONException -> 0x08c7 }
            r10 = 100     // Catch:{ JSONException -> 0x08c7 }
            if (r12 > r10) goto L_0x08bd     // Catch:{ JSONException -> 0x08c7 }
            X.AnonymousClass000.A1F(r5, r12)     // Catch:{ JSONException -> 0x08c7 }
            int r13 = r13 + 1     // Catch:{ JSONException -> 0x08c7 }
            if (r13 < r14) goto L_0x0872     // Catch:{ JSONException -> 0x08c7 }
            X.5mA r4 = r1.A0E     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r5.size()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.0yF r4 = r4.A00     // Catch:{ IOException -> 0x08b0 }
            X.0yG r10 = r4.A00     // Catch:{ IOException -> 0x08b0 }
            r4 = r22     // Catch:{ IOException -> 0x08b0 }
            java.io.File r4 = r10.A01(r4)     // Catch:{ IOException -> 0x08b0 }
            java.io.FileOutputStream r12 = X.C90524aI.A0W(r4)     // Catch:{ IOException -> 0x08b0 }
            java.util.Iterator r10 = r5.iterator()     // Catch:{ IOException -> 0x08b4 }
        L_0x089a:
            boolean r5 = r10.hasNext()     // Catch:{ IOException -> 0x08b4 }
            if (r5 == 0) goto L_0x08ac     // Catch:{ IOException -> 0x08b4 }
            java.lang.Object r5 = r10.next()     // Catch:{ IOException -> 0x08b4 }
            int r5 = X.C90514aH.A0H(r5)     // Catch:{ IOException -> 0x08b4 }
            r12.write(r5)     // Catch:{ IOException -> 0x08b4 }
            goto L_0x089a     // Catch:{ IOException -> 0x08b4 }
        L_0x08ac:
            r12.close()     // Catch:{ IOException -> 0x08b4 }
            goto L_0x08e4     // Catch:{ IOException -> 0x08b4 }
            r5 = move-exception
            java.lang.String r4 = "generateVoiceMessageVisualizationFile/ Failed to create or open temporary file for visualization data"
            goto L_0x08b7
            r5 = move-exception
            java.lang.String r4 = "Unexpected error writing or flushing visualization data to disk"
        L_0x08b7:
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r4 = r20     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x08e4     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x08bd:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x08c7 }
            java.lang.String r5 = "isValidValue value is outside expected range: "     // Catch:{ JSONException -> 0x08c7 }
            X.C36321k7.A1U(r5, r10, r12)     // Catch:{ JSONException -> 0x08c7 }
            goto L_0x08ec     // Catch:{ JSONException -> 0x08c7 }
            r12 = move-exception
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r5 = "parseVoiceMessageVisualizationData invalid integer at position "     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r5 = X.AnonymousClass000.A0r(r5, r10, r13)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.w(r5, r12)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x08ec     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x08d6:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r5 = "parseVoiceMessageVisualizationData jsonDataLen="     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r5 = X.AnonymousClass000.A0r(r5, r10, r14)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x08e0:
            com.whatsapp.util.Log.w((java.lang.String) r5)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x08ec     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x08e4:
            r4.getAbsolutePath()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r5 = "generate_voice_visualization_end"     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r2.markerPoint(r0, r5)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
        L_0x08ec:
            r8.A0I = r11     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.1Xr r5 = r1.A0F     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.0wo r10 = r1.A05     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            long r22 = X.C19970wo.A00(r10)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r21 = r11.getName()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            long r24 = r11.length()     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r26 = 0     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r17 = r5     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r18 = r8     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r19 = r9     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.2bi r10 = r17.A00(r18, r19, r20, r21, r22, r24, r26)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            int r5 = X.AnonymousClass1GW.A04(r11)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r10.A0B = r5     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            X.3L2 r8 = r1.A0G     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r5 = r20     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            r8.A00(r5, r10, r4)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            A00(r1, r9, r2)     // Catch:{ IOException -> 0x0920, NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r20)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2 = move-exception     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "SendMessageRequest/sendmedia/sendvoicemessage/share-failed/ "     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = r2.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r1 == 0) goto L_0x093c     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r1 = X.C90504aG.A1Y(r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r1 == 0) goto L_0x093c     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r1 = 19     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r5 = "Device doesn't have enough free space"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0936:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r5, r1)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x093c:
            r1 = 5     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r5 = "Service internal error! "     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0936     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0940:
            boolean r4 = r13.equals(r12)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r4 == 0) goto L_0x0b2f     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2.markerAnnotate((int) r0, (java.lang.String) r8, (java.lang.String) r12)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r4 = android.text.TextUtils.isEmpty(r17)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r4 == 0) goto L_0x0958     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2 = 1     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Bad request -  video uri is empty"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0952:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0958:
            X.0yE r4 = r1.A07     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.2nw r5 = r4.A04()     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.2nw r4 = X.C51512nw.GRANTED     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r5 == r4) goto L_0x0967     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2 = 24     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Missing media permission to send media Messages"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0952     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0967:
            java.lang.String r4 = "permission_checks_end"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2.markerPoint(r0, r4)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            android.net.Uri r5 = android.net.Uri.parse(r17)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r4 = "parse_uri_end"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2.markerPoint(r0, r4)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.AnonymousClass5B2.A00(r1)     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            X.1XY r8 = r1.A00     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            java.util.List r24 = java.util.Collections.singletonList(r9)     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            X.0yb r4 = r1.A04     // Catch:{ IOException -> 0x09c8, all -> 0x09c6 }
            X.0ya r4 = r4.A0O()     // Catch:{ IOException -> 0x09c8, all -> 0x09c6 }
            java.io.InputStream r10 = r4.A06(r5)     // Catch:{ IOException -> 0x09c8, all -> 0x09c6 }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            java.lang.String r4 = "temp_"     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            r11.append(r4)     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            java.lang.String r11 = X.C36411kG.A11(r11, r4)     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            X.0wG r4 = r1.A06     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            java.io.File r5 = X.C90524aI.A0R(r4)     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            r4 = r20     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            java.io.File r22 = java.io.File.createTempFile(r11, r4, r5)     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            java.io.FileOutputStream r5 = X.C90524aI.A0W(r22)     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            r4 = 4096(0x1000, float:5.74E-42)     // Catch:{ IOException -> 0x09c2, all -> 0x0a01 }
            byte[] r12 = new byte[r4]     // Catch:{ IOException -> 0x09c0 }
        L_0x09ad:
            int r11 = r10.read(r12)     // Catch:{ IOException -> 0x09c0 }
            r4 = -1     // Catch:{ IOException -> 0x09c0 }
            if (r11 == r4) goto L_0x09b9     // Catch:{ IOException -> 0x09c0 }
            r4 = 0     // Catch:{ IOException -> 0x09c0 }
            r5.write(r12, r4, r11)     // Catch:{ IOException -> 0x09c0 }
            goto L_0x09ad     // Catch:{ IOException -> 0x09c0 }
        L_0x09b9:
            r10.close()     // Catch:{ IOException -> 0x09e1 }
            r5.close()     // Catch:{ IOException -> 0x09e1 }
            goto L_0x09e5     // Catch:{ IOException -> 0x09e1 }
            r4 = move-exception
            goto L_0x09cc
            r4 = move-exception
            r5 = r20
            goto L_0x09cc
            r2 = move-exception
            goto L_0x0a13
            r4 = move-exception
            r10 = r20
            r5 = r10
        L_0x09cc:
            r4.printStackTrace()     // Catch:{ all -> 0x09ff }
            if (r10 == 0) goto L_0x09d4     // Catch:{ all -> 0x09ff }
            r10.close()     // Catch:{ IOException -> 0x09da }
        L_0x09d4:
            if (r5 == 0) goto L_0x09de     // Catch:{ IOException -> 0x09da }
            r5.close()     // Catch:{ IOException -> 0x09da }
            goto L_0x09de     // Catch:{ IOException -> 0x09da }
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
        L_0x09de:
            r22 = r20     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x09e5     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r4 = move-exception     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r4.printStackTrace()     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
        L_0x09e5:
            r25 = 0     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r19 = r20     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r21 = r20     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r26 = 0     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r27 = 0     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r17 = r8     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r18 = r20     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r17.A08(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            A00(r1, r9, r2)     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r21)     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r2 = move-exception
            goto L_0x0a04
            r2 = move-exception
            r5 = r20
        L_0x0a04:
            if (r10 == 0) goto L_0x0a09
            r10.close()     // Catch:{ IOException -> 0x0a0f }
        L_0x0a09:
            if (r5 == 0) goto L_0x0a13     // Catch:{ IOException -> 0x0a0f }
            r5.close()     // Catch:{ IOException -> 0x0a0f }
            goto L_0x0a13     // Catch:{ IOException -> 0x0a0f }
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
        L_0x0a13:
            throw r2     // Catch:{ IOException -> 0x0a14, NullPointerException | SecurityException -> 0x0b36 }
            r2 = move-exception
            java.lang.String r1 = "sendmedia/sendvideos/share-failed/ "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = r2.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r1 == 0) goto L_0x0a2c     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r1 = X.C90504aG.A1Y(r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r1 == 0) goto L_0x0a2c     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2 = 19     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Device doesn't have enough free space"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0952     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0a2c:
            r2 = 5     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Service internal error! "     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0952     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0a31:
            boolean r5 = r13.equals(r4)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r5 == 0) goto L_0x0b2f     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2.markerAnnotate((int) r0, (java.lang.String) r8, (java.lang.String) r4)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r12 = "Service internal error! "     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r4 = "SendMessageRequest/sendmedia/sendimages/share-failed/ "     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r5 = android.text.TextUtils.isEmpty(r17)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r5 == 0) goto L_0x0a4c     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Bad request -  photo uri is empty"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r3)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0a4c:
            X.0yE r5 = r1.A07     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.2nw r8 = r5.A04()     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.2nw r5 = X.C51512nw.GRANTED     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r8 == r5) goto L_0x0a60     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2 = 24     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Missing media permission to send media Messages"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0a5a:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0a60:
            java.lang.String r5 = "permission_checks_end"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2.markerPoint(r0, r5)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            android.net.Uri r18 = android.net.Uri.parse(r17)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r5 = "parse_uri_end"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2.markerPoint(r0, r5)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r5 = 5     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.AnonymousClass5B2.A00(r1)     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            X.1XY r13 = r1.A00     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            java.util.List r24 = java.util.Collections.singletonList(r9)     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r27 = 0     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r8 = -1     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            if (r11 == r8) goto L_0x0a92     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r8 = 0     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            if (r11 == 0) goto L_0x0a95     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r8 = 1     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            if (r11 == r3) goto L_0x0a95     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r8 = 2     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            if (r11 == r10) goto L_0x0a95     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r8 = 3     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            if (r11 == r8) goto L_0x0a95     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r8 = "SendMessageRequest/sendmedia/translateMediaQuality/ Unknown media quality: "     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            X.C36321k7.A1U(r8, r10, r11)     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
        L_0x0a92:
            r22 = r20     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0a99     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
        L_0x0a95:
            java.lang.Integer r22 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
        L_0x0a99:
            r21 = r20     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r26 = r21     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r28 = 0     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r29 = 0     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r30 = 0     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r31 = 0     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r32 = 0     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r33 = 0     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r34 = 0     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r17 = r13     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r19 = r20     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r25 = r21     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r17.A02(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            A00(r1, r9, r2)     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r21)     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ IOException -> 0x0abd, 1X5 -> 0x0ae4, OutOfMemoryError -> 0x0adb, SecurityException -> 0x0ad2, NullPointerException | SecurityException -> 0x0b36 }
            r2 = move-exception
            com.whatsapp.util.Log.e(r4, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = r2.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r1 == 0) goto L_0x0aef     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r1 = X.C90504aG.A1Y(r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r1 == 0) goto L_0x0aef     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2 = 19     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Device doesn't have enough free space"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0a5a     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2 = move-exception     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "sendmedia/sendimages/share-failed/ "     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Bad request -  URI inaccessible"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0aea     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r1 = move-exception     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.e(r4, r1)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r12, r5)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r1 = move-exception     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            com.whatsapp.util.Log.e(r4, r1)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Bad request -  file not an image"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0aea:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r3)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0aef:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r12, r5)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0af4:
            r4 = r21     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r4 = r13.equals(r4)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r4 == 0) goto L_0x0b2f     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r4 = r21     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r2.markerAnnotate((int) r0, (java.lang.String) r8, (java.lang.String) r4)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            boolean r4 = android.text.TextUtils.isEmpty(r23)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            if (r4 == 0) goto L_0x0b0e     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "Bad request -  message is empty"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r3)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0b0e:
            X.AnonymousClass5B2.A00(r1)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            X.1X4 r4 = r1.A01     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.util.List r15 = java.util.Collections.singletonList(r9)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r17 = 0     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r12 = r20     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r13 = r12     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r16 = r12     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r18 = 0     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r10 = r4     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r11 = r12     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r14 = r23     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            r10.A0I(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            A00(r1, r9, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r16)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
        L_0x0b2f:
            java.lang.String r1 = "Request is not implemented yet!"     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r10)     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            goto L_0x0b41     // Catch:{ NullPointerException | SecurityException -> 0x0b36 }
            java.lang.String r1 = "requesthandler/send-message invalid contact ID"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0b6a }
            java.lang.String r1 = "Bad request - send_message"     // Catch:{ all -> 0x0b6a }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r3)     // Catch:{ all -> 0x0b6a }
        L_0x0b41:
            r8 = 3
            java.lang.String r6 = "Service internal error! "
            java.lang.String r4 = "fail_reason"
            java.lang.String r1 = "success"
            boolean r1 = r5.getBoolean(r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r1 != 0) goto L_0x0b5c     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r1 = "error_message"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r2 = r5.optString(r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r1 = r2.isEmpty()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r1 != 0) goto L_0x0b5e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r6 = r2     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0b5e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0b5c:
            r8 = 2     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0b63     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0b5e:
            r1 = r35     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1.markerAnnotate((int) r0, (java.lang.String) r4, (java.lang.String) r6)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0b63:
            r1 = r35     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1.markerEnd(r0, r8)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r7 = move-exception     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r5 = 3     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r4 = "Service internal error! "     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r2 = "fail_reason"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.0zE r1 = r6.A0H     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1.markerAnnotate((int) r0, (java.lang.String) r2, (java.lang.String) r4)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1.markerEnd(r0, r5)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            throw r7     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0b79:
            java.lang.String r0 = "get_unread_messages"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5B1 r6 = r6.A07     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "payload"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            org.json.JSONObject r8 = X.C90474aD.A0t(r0, r4)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r4 = "time_limit_ms"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            long r4 = r8.optLong(r4, r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "contact_id"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r1 = r8.optString(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 != 0) goto L_0x0bb0     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.3G0 r0 = r6.A03     // Catch:{ SecurityException -> 0x0c0c }
            X.141 r0 = r0.A00(r2, r1)     // Catch:{ SecurityException -> 0x0c0c }
            X.11F r0 = X.C36331k8.A0G(r0)     // Catch:{ SecurityException -> 0x0c0c }
            X.AnonymousClass5B1.A00(r6, r0, r8, r4)     // Catch:{ SecurityException -> 0x0c0c }
            goto L_0x0be0     // Catch:{ SecurityException -> 0x0c0c }
        L_0x0bb0:
            X.1A6 r0 = r6.A00     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.1CR r10 = r6.A05     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.util.ArrayList r0 = r0.A0B(r10)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0bbc:
            boolean r0 = r9.hasNext()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0be0     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.11F r1 = X.C36401kF.A0a(r9)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.12t r0 = r6.A01     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r0.A0A(r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0bbc     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r10.A0j(r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 != 0) goto L_0x0bbc     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.12q r0 = r6.A02     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r0.A0N(r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 != 0) goto L_0x0bbc     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.AnonymousClass5B1.A00(r6, r1, r8, r4)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0bbc     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0be0:
            X.761 r0 = X.AnonymousClass761.A00     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.util.Collections.sort(r8, r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            org.json.JSONArray r5 = X.C90524aI.A0u()     // Catch:{ SecurityException -> 0x0c08 }
            java.util.Iterator r4 = r8.iterator()     // Catch:{ SecurityException -> 0x0c08 }
        L_0x0bed:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0c08 }
            if (r0 == 0) goto L_0x0c03     // Catch:{ SecurityException -> 0x0c08 }
            X.3T1 r1 = X.C36391kE.A0l(r4)     // Catch:{ SecurityException -> 0x0c08 }
            X.2Wt r0 = r6.A04     // Catch:{ SecurityException -> 0x0c08 }
            org.json.JSONObject r0 = r0.A04(r1, r2)     // Catch:{ SecurityException -> 0x0c08 }
            if (r0 == 0) goto L_0x0bed     // Catch:{ SecurityException -> 0x0c08 }
            r5.put(r0)     // Catch:{ SecurityException -> 0x0c08 }
            goto L_0x0bed     // Catch:{ SecurityException -> 0x0c08 }
        L_0x0c03:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r5)     // Catch:{ SecurityException -> 0x0c08 }
            goto L_0x0c27     // Catch:{ SecurityException -> 0x0c08 }
            r1 = 5
            java.lang.String r0 = "Service internal error! get_unread_messages"
            goto L_0x0c14
            java.lang.String r0 = "requesthandler/get-unread-messages invalid contact ID"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1 = 1     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "Bad request - send_message"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0c14:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0c19:
            java.lang.String r0 = "hang_up_call"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c4e     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5B0 r0 = r6.A0D     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            org.json.JSONObject r5 = r0.A00(r2, r4)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0c27:
            java.lang.String r0 = "error_message"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r2 = r5.optString(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r2.isEmpty()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 != 0) goto L_0x0042     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "RequestHandler/handleRequest failed. action="     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1.append(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1.append(r7)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = ", error="     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.C36321k7.A1R(r0, r2, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0042     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0c46:
            java.lang.String r0 = "play_voice_message"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r7.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 != 0) goto L_0x0c66     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0c4e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "RequestHandler/handleRequest unhandled action = "     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.C36321k7.A1R(r0, r7, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "Bad request - "     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r3)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0c66:
            X.5Ay r8 = r6.A0A     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r1 = r4.getString(r9)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "stop_voice_message_playback"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            boolean r0 = r1.equals(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r0 == 0) goto L_0x0c8a     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.6zU r1 = r8.A00     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            if (r1 == 0) goto L_0x0c85     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r0 = 0
            r1.A0H(r3, r0)     // Catch:{ Exception -> 0x0c7d }
            goto L_0x0c85     // Catch:{ Exception -> 0x0c7d }
            r1 = 5
            java.lang.String r0 = "Service internal error! "
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0c85:
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r20)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0c8a:
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r6.<init>(r3)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r5 = 0     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.0zE r10 = r8.A05     // Catch:{ Exception -> 0x0d0c }
            r9 = 494342675(0x1d771213, float:3.2699522E-21)     // Catch:{ Exception -> 0x0d0c }
            r10.markerStart(r9)     // Catch:{ Exception -> 0x0d0c }
            X.1VC r0 = r8.A03     // Catch:{ Exception -> 0x0d0c }
            X.0yC r1 = r0.A01     // Catch:{ Exception -> 0x0d0c }
            r0 = 5650(0x1612, float:7.917E-42)     // Catch:{ Exception -> 0x0d0c }
            boolean r0 = r1.A0E(r0)     // Catch:{ Exception -> 0x0d0c }
            if (r0 != 0) goto L_0x0cb9     // Catch:{ Exception -> 0x0d0c }
            r1 = 3     // Catch:{ Exception -> 0x0d0c }
            java.lang.String r0 = "Feature is disabled!play_voice_message"     // Catch:{ Exception -> 0x0d0c }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r1)     // Catch:{ Exception -> 0x0d0c }
        L_0x0cab:
            java.lang.String r0 = "success"     // Catch:{ Exception -> 0x0d0c }
            boolean r0 = r5.getBoolean(r0)     // Catch:{ Exception -> 0x0d0c }
            r0 = r0 ^ 1     // Catch:{ Exception -> 0x0d0c }
            if (r0 == 0) goto L_0x0cfe     // Catch:{ Exception -> 0x0d0c }
            r6.countDown()     // Catch:{ Exception -> 0x0d0c }
            goto L_0x0cfe     // Catch:{ Exception -> 0x0d0c }
        L_0x0cb9:
            java.lang.String r0 = "payload"     // Catch:{ Exception -> 0x0d0c }
            org.json.JSONObject r1 = r4.getJSONObject(r0)     // Catch:{ Exception -> 0x0d0c }
            java.lang.String r0 = "message_id"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ SecurityException -> 0x0cf7 }
            X.3G1 r0 = r8.A04     // Catch:{ SecurityException -> 0x0cf7 }
            X.3T1 r4 = r0.A00(r2, r1)     // Catch:{ SecurityException -> 0x0cf7 }
            java.lang.String r0 = "read_payload_end"     // Catch:{ SecurityException -> 0x0cf7 }
            r10.markerPoint(r9, r0)     // Catch:{ SecurityException -> 0x0cf7 }
            boolean r0 = r4 instanceof X.C46812bi     // Catch:{ SecurityException -> 0x0cf7 }
            if (r0 == 0) goto L_0x0cee     // Catch:{ SecurityException -> 0x0cf7 }
            r0 = r4     // Catch:{ SecurityException -> 0x0cf7 }
            X.2bi r0 = (X.C46812bi) r0     // Catch:{ SecurityException -> 0x0cf7 }
            boolean r0 = r0.A1l()     // Catch:{ SecurityException -> 0x0cf7 }
            if (r0 == 0) goto L_0x0cee     // Catch:{ SecurityException -> 0x0cf7 }
            X.17Y r2 = r8.A01     // Catch:{ SecurityException -> 0x0cf7 }
            r1 = 45     // Catch:{ SecurityException -> 0x0cf7 }
            X.3vL r0 = new X.3vL     // Catch:{ SecurityException -> 0x0cf7 }
            r0.<init>(r8, r4, r6, r1)     // Catch:{ SecurityException -> 0x0cf7 }
            r2.A0H(r0)     // Catch:{ SecurityException -> 0x0cf7 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A02(r20)     // Catch:{ SecurityException -> 0x0cf7 }
            goto L_0x0cab     // Catch:{ SecurityException -> 0x0cf7 }
        L_0x0cee:
            r1 = 26     // Catch:{ SecurityException -> 0x0cf7 }
            java.lang.String r0 = "Message requested is not of the correct type. play_voice_message"     // Catch:{ SecurityException -> 0x0cf7 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r1)     // Catch:{ SecurityException -> 0x0cf7 }
            goto L_0x0cab     // Catch:{ SecurityException -> 0x0cf7 }
            java.lang.String r0 = "Bad request - play_voice_message"
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r3)     // Catch:{ Exception -> 0x0d0c }
            goto L_0x0cab     // Catch:{ Exception -> 0x0d0c }
        L_0x0cfe:
            X.0wU r2 = r8.A06     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1 = 46     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.3vL r0 = new X.3vL     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r0.<init>(r8, r6, r5, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r2.Boy(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0c27     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r0 = move-exception
            r6.countDown()     // Catch:{ all -> 0x0d11 }
            throw r0     // Catch:{ all -> 0x0d11 }
            r4 = move-exception
            X.0wU r2 = r8.A06     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1 = 46     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.3vL r0 = new X.3vL     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r0.<init>(r8, r6, r5, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r2.Boy(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            throw r4     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0d1f:
            java.lang.String r0 = "RequestHandler/request invalid authorization token"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r1 = 4     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "Request is not authorized!"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5V5 r2 = new X.5V5     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r2.<init>(r1, r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0d57     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0d2d:
            java.lang.String r0 = "Authorization token is missing."     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5V5 r2 = new X.5V5     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r2.<init>(r3, r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0d57     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0d35:
            r1 = 6     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "This protocol version is no longer supported."     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5V5 r2 = new X.5V5     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r2.<init>(r1, r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0d57     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0d3e:
            r1 = 21     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "This version of WhatsApp is no longer supported. Please download the latest version"     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            X.5V5 r2 = new X.5V5     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r2.<init>(r1, r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            goto L_0x0d57     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0d48:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = "Unexpected authority in URI: "     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r2.<init>(r0)     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
        L_0x0d57:
            throw r2     // Catch:{ 5V5 -> 0x0d6f, all -> 0x0d58 }
            r2 = move-exception
            java.lang.String r0 = "RequestHandler/handleRequest caught exception handling request"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ Exception -> 0x0d7a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0d7a }
            java.lang.String r0 = "Service internal error! "     // Catch:{ Exception -> 0x0d7a }
            java.lang.String r1 = X.C36331k8.A0i(r0, r1, r2)     // Catch:{ Exception -> 0x0d7a }
            r0 = 5     // Catch:{ Exception -> 0x0d7a }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r1, r0)     // Catch:{ Exception -> 0x0d7a }
            goto L_0x0042     // Catch:{ Exception -> 0x0d7a }
            r0 = move-exception     // Catch:{ Exception -> 0x0d7a }
            int r1 = r0.errorCode     // Catch:{ Exception -> 0x0d7a }
            java.lang.String r0 = r0.message     // Catch:{ Exception -> 0x0d7a }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r1)     // Catch:{ Exception -> 0x0d7a }
            goto L_0x0042     // Catch:{ Exception -> 0x0d7a }
            r1 = move-exception
            java.lang.String r0 = "InstrumentationService/request error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r1 = r1.getMessage()
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            throw r0
        L_0x0d8a:
            com.whatsapp.instrumentation.api.InstrumentationService r1 = r1.A00
            X.1VH r0 = r1.A02
            X.6Ef r0 = r0.A00()
            r0.A00()
            android.os.Binder.clearCallingIdentity()
            X.5v2 r6 = r1.A01     // Catch:{ Exception -> 0x0de8 }
            X.0wQ r0 = r6.A00     // Catch:{ JSONException -> 0x0de0 }
            r0.A0G()     // Catch:{ JSONException -> 0x0de0 }
            X.142 r1 = r0.A0E     // Catch:{ JSONException -> 0x0de0 }
            if (r1 == 0) goto L_0x0dcf     // Catch:{ JSONException -> 0x0de0 }
            X.3S0 r0 = r6.A02     // Catch:{ JSONException -> 0x0de0 }
            boolean r0 = r0.A00(r1)     // Catch:{ JSONException -> 0x0de0 }
            if (r0 == 0) goto L_0x0dcf     // Catch:{ JSONException -> 0x0de0 }
            X.12U r0 = r6.A03     // Catch:{ JSONException -> 0x0de0 }
            boolean r4 = r0.A03()     // Catch:{ JSONException -> 0x0de0 }
            org.json.JSONObject r5 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0de0 }
            java.lang.String r0 = "version"     // Catch:{ JSONException -> 0x0de0 }
            r5.put(r0, r3)     // Catch:{ JSONException -> 0x0de0 }
            java.lang.String r2 = "enabled"     // Catch:{ JSONException -> 0x0de0 }
            X.1VC r0 = r6.A01     // Catch:{ JSONException -> 0x0de0 }
            X.0yf r1 = r0.A00     // Catch:{ JSONException -> 0x0de0 }
            X.0yi r0 = X.C21100yf.A0P     // Catch:{ JSONException -> 0x0de0 }
            boolean r0 = r1.A09(r0)     // Catch:{ JSONException -> 0x0de0 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0de0 }
            java.lang.String r0 = "registered"     // Catch:{ JSONException -> 0x0de0 }
            r5.put(r0, r4)     // Catch:{ JSONException -> 0x0de0 }
            goto L_0x0ddb     // Catch:{ JSONException -> 0x0de0 }
        L_0x0dcf:
            java.lang.String r0 = "ServiceState/get-service-state service not enabled for this number"     // Catch:{ JSONException -> 0x0de0 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x0de0 }
            r1 = 3     // Catch:{ JSONException -> 0x0de0 }
            java.lang.String r0 = "Feature is disabled!"     // Catch:{ JSONException -> 0x0de0 }
            org.json.JSONObject r5 = X.AnonymousClass6R4.A03(r0, r1)     // Catch:{ JSONException -> 0x0de0 }
        L_0x0ddb:
            java.lang.String r2 = java.util.Objects.toString(r5)     // Catch:{ Exception -> 0x0de8 }
            goto L_0x0e06     // Catch:{ Exception -> 0x0de8 }
            r1 = move-exception     // Catch:{ Exception -> 0x0de8 }
            java.lang.String r0 = "Service internal error! "     // Catch:{ Exception -> 0x0de8 }
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r1)     // Catch:{ Exception -> 0x0de8 }
            throw r0     // Catch:{ Exception -> 0x0de8 }
            r1 = move-exception
            java.lang.String r0 = "InstrumentationService/getState error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r1 = r1.getMessage()
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            throw r0
        L_0x0df8:
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r5 == r0) goto L_0x0e09
        L_0x0dfd:
            r2 = r41
            r0 = r36
            boolean r0 = super.onTransact(r5, r4, r0, r2)
            return r0
        L_0x0e06:
            r36.writeNoException()
        L_0x0e09:
            r0 = r36
            r0.writeString(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91544cD.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C91544cD(InstrumentationService instrumentationService) {
        this();
        this.A00 = instrumentationService;
    }

    public static void A00(AnonymousClass5B2 r3, AnonymousClass11F r4, C21430zE r5) {
        r5.markerPoint(494340037, "send_message_end");
        r3.A03.A01(r4, 1, true, true);
        r5.markerPoint(494340037, "mark_chat_as_read_end");
    }

    public C91544cD() {
        attachInterface(this, "com.whatsapp.instrumentation.InstrumentationInterface");
    }
}
