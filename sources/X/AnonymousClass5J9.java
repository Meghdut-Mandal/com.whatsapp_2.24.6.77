package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.5J9  reason: invalid class name */
public class AnonymousClass5J9 extends C181018mn implements C22992Azi {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public byte[] A0I;
    public byte[] A0J;

    public String BE6() {
        return "hist_sync";
    }

    public AnonymousClass5J9(C64933Qa r2, long j) {
        super(r2, 35, j);
    }

    public String A1X() {
        JsonWriter jsonWriter;
        StringWriter stringWriter = new StringWriter();
        try {
            jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (!TextUtils.isEmpty(this.A0B)) {
                jsonWriter.name("direct_path").value(this.A0B);
            }
            if (!TextUtils.isEmpty(this.A0D)) {
                jsonWriter.name("media_hash").value(this.A0D);
            }
            if (!TextUtils.isEmpty(this.A0C)) {
                jsonWriter.name("enc_media_hash").value(this.A0C);
            }
            if (!TextUtils.isEmpty(this.A0E)) {
                jsonWriter.name("original-msg-id").value(this.A0E);
            }
            if (!TextUtils.isEmpty(this.A0H)) {
                jsonWriter.name("session_id").value(this.A0H);
            }
            if (!TextUtils.isEmpty(this.A0G)) {
                jsonWriter.name("reg_attempt_id").value(this.A0G);
            }
            if (!TextUtils.isEmpty(this.A0F)) {
                jsonWriter.name("peer_data_request_session_id").value(this.A0F);
            }
            jsonWriter.name("file_length").value(this.A05).name("sync_type").value((long) this.A03).name("chunk_order").value((long) this.A00).name("progress").value((long) this.A01).name("retries").value((long) this.A02).name("latest_msg_id").value(this.A06).name("oldest_msg_id").value(this.A08).name("oldest_msg_id_to_sync").value(this.A09).name("chats_count").value(this.A04).name("messages_count").value(this.A07).name("oldest_msg_to_sync_timestamp").value(this.A0A);
            byte[] bArr = this.A0J;
            if (bArr != null) {
                jsonWriter.name("key_data").value(Base64.encodeToString(bArr, 2));
            }
            byte[] bArr2 = this.A0I;
            if (bArr2 != null) {
                jsonWriter.name("inline_payload").value(Base64.encodeToString(bArr2, 2));
            }
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            Log.e("FMessageHistorySyncNotification/writeData failed", e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Y(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x018a
            android.util.JsonReader r3 = X.C90484aE.A0Q(r5)     // Catch:{ IOException -> 0x0184 }
            r3.beginObject()     // Catch:{ all -> 0x017a }
        L_0x000d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0173
            java.lang.String r1 = r3.nextName()     // Catch:{ all -> 0x017a }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x017a }
            r2 = 2
            switch(r0) {
                case -1906067869: goto L_0x0031;
                case -1641051461: goto L_0x0040;
                case -1001078227: goto L_0x004f;
                case -945994952: goto L_0x005e;
                case -339500935: goto L_0x006d;
                case -50870532: goto L_0x007c;
                case 494573150: goto L_0x008b;
                case 500641162: goto L_0x009b;
                case 899130860: goto L_0x00af;
                case 990743644: goto L_0x00bf;
                case 1098377542: goto L_0x00cf;
                case 1120684249: goto L_0x00df;
                case 1161658856: goto L_0x00ef;
                case 1190721806: goto L_0x0103;
                case 1661853540: goto L_0x0113;
                case 1836211977: goto L_0x0123;
                case 1894532689: goto L_0x0133;
                case 1939495049: goto L_0x0143;
                case 2011285592: goto L_0x0153;
                case 2104347627: goto L_0x0163;
                default: goto L_0x001f;
            }     // Catch:{ all -> 0x017a }
        L_0x001f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x017a }
            java.lang.String r0 = "FMessageHistorySyncNotification/readData/unexpected name \""
            r2.append(r0)     // Catch:{ all -> 0x017a }
            r2.append(r1)     // Catch:{ all -> 0x017a }
            java.lang.String r0 = "\""
            X.C36341k9.A1O(r2, r0)     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x0031:
            java.lang.String r0 = "original-msg-id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x017a }
            r4.A0E = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x0040:
            java.lang.String r0 = "direct_path"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x017a }
            r4.A0B = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x004f:
            java.lang.String r0 = "progress"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            int r0 = r3.nextInt()     // Catch:{ all -> 0x017a }
            r4.A01 = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x005e:
            java.lang.String r0 = "oldest_msg_to_sync_timestamp"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            long r0 = r3.nextLong()     // Catch:{ all -> 0x017a }
            r4.A0A = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x006d:
            java.lang.String r0 = "oldest_msg_id_to_sync"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            long r0 = r3.nextLong()     // Catch:{ all -> 0x017a }
            r4.A09 = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x007c:
            java.lang.String r0 = "chunk_order"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            int r0 = r3.nextInt()     // Catch:{ all -> 0x017a }
            r4.A00 = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x008b:
            java.lang.String r0 = "sync_type"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            int r0 = r3.nextInt()     // Catch:{ all -> 0x017a }
            r4.A03 = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x009b:
            java.lang.String r0 = "key_data"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x017a }
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ all -> 0x017a }
            r4.A0J = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x00af:
            java.lang.String r0 = "peer_data_request_session_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x017a }
            r4.A0F = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x00bf:
            java.lang.String r0 = "messages_count"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            long r0 = r3.nextLong()     // Catch:{ all -> 0x017a }
            r4.A07 = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x00cf:
            java.lang.String r0 = "retries"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            int r0 = r3.nextInt()     // Catch:{ all -> 0x017a }
            r4.A02 = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x00df:
            java.lang.String r0 = "oldest_msg_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            long r0 = r3.nextLong()     // Catch:{ all -> 0x017a }
            r4.A08 = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x00ef:
            java.lang.String r0 = "inline_payload"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x017a }
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ all -> 0x017a }
            r4.A0I = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x0103:
            java.lang.String r0 = "enc_media_hash"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x017a }
            r4.A0C = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x0113:
            java.lang.String r0 = "session_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x017a }
            r4.A0H = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x0123:
            java.lang.String r0 = "file_length"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            long r0 = r3.nextLong()     // Catch:{ all -> 0x017a }
            r4.A05 = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x0133:
            java.lang.String r0 = "latest_msg_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            long r0 = r3.nextLong()     // Catch:{ all -> 0x017a }
            r4.A06 = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x0143:
            java.lang.String r0 = "media_hash"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x017a }
            r4.A0D = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x0153:
            java.lang.String r0 = "reg_attempt_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x017a }
            r4.A0G = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x0163:
            java.lang.String r0 = "chats_count"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x001f
            long r0 = r3.nextLong()     // Catch:{ all -> 0x017a }
            r4.A04 = r0     // Catch:{ all -> 0x017a }
            goto L_0x000d
        L_0x0173:
            r3.endObject()     // Catch:{ all -> 0x017a }
            r3.close()     // Catch:{ IOException -> 0x0184 }
            return
        L_0x017a:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x017f }
            goto L_0x0183
        L_0x017f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0184 }
        L_0x0183:
            throw r1     // Catch:{ IOException -> 0x0184 }
        L_0x0184:
            r1 = move-exception
            java.lang.String r0 = "FMessageHistorySyncNotification/readData failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5J9.A1Y(java.lang.String):void");
    }
}
