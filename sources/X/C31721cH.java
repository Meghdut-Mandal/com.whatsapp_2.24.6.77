package X;

import android.os.Message;
import com.whatsapp.jid.Jid;
import com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.1cH  reason: invalid class name and case insensitive filesystem */
public final class C31721cH implements C236319f {
    public final C30551aO A00;
    public final C20810yC A01;
    public final C28811Ud A02;

    public C31721cH(C30551aO r2, C20810yC r3, C28811Ud r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public int[] BCF() {
        return new int[]{257};
    }

    public boolean BJl(Message message, int i) {
        Object obj;
        boolean z;
        C184078rr r2;
        Message message2 = message;
        AnonymousClass00C.A0D(message2, 1);
        if (i != 257) {
            return false;
        }
        Object obj2 = message2.obj;
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type com.whatsapp.protocol.ProtocolTreeNode");
        C203399nx r5 = (C203399nx) obj2;
        C203399nx.A0A(r5, "ib");
        C203379ns.A03(r5, C177588e2.class, -9007199254740991L, 9007199254740991L, C177588e2.A00, new String[]{"from"}, false);
        AQH aqh = AQH.A00;
        String[] strArr = {"thread_metadata"};
        AnonymousClass00C.A0D(r5, 0);
        try {
            obj = C203539oF.A06(r5, aqh, strArr);
        } catch (C235919b unused) {
            obj = null;
        }
        C35841jL r22 = (C35841jL) obj;
        ArrayList A09 = C203539oF.A09(r5, AQI.A00, new String[]{"thread_metadata", "item"}, 0, 50);
        C203399nx r10 = r5;
        C203539oF.A09(r10, C77073pu.A00, new String[]{"thread_metadata"}, 1, 1).get(0);
        if (!(r22 == null || (r2 = (C184078rr) r22.A00) == null)) {
            AnonymousClass00T r8 = this.A02.A00;
            DelayedStanzasFetcher$StanzaFetcher delayedStanzasFetcher$StanzaFetcher = (DelayedStanzasFetcher$StanzaFetcher) r8.getValue();
            Number number = (Number) r2.A00;
            AnonymousClass00C.A08(number);
            boolean z2 = false;
            if (number.longValue() > 0) {
                z2 = true;
            }
            delayedStanzasFetcher$StanzaFetcher.A00.set(z2);
            StringBuilder sb = new StringBuilder();
            sb.append("DelayedStanzasManager/onDelayedNotifications pullNeeded=");
            sb.append(((DelayedStanzasFetcher$StanzaFetcher) r8.getValue()).A00.get());
            Log.i(sb.toString());
        }
        if (!C20800yB.A01(C21000yV.A01, this.A01, 3702) || !(!A09.isEmpty())) {
            return true;
        }
        C30551aO r7 = this.A00;
        if (A09.isEmpty()) {
            return true;
        }
        HashMap hashMap = new HashMap();
        Iterator it = A09.iterator();
        while (it.hasNext()) {
            C35841jL r23 = (C35841jL) it.next();
            Jid jid = (Jid) r23.A00;
            AnonymousClass00C.A0E(jid, "null cannot be cast to non-null type com.whatsapp.jid.ChatJid");
            AnonymousClass11F r52 = (AnonymousClass11F) jid;
            AnonymousClass11F BQG = r7.A02.BQG(r52);
            if (BQG != null) {
                r52 = BQG;
            }
            hashMap.put(r52, Long.valueOf(((Number) r23.A01).longValue() * 1000));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PresortingChatsManager/onThreadMetadataItems: ");
        sb2.append(hashMap.size());
        sb2.append(" conversations");
        Log.i(sb2.toString());
        AnonymousClass1A7 r6 = r7.A00.A01;
        synchronized (r6) {
            if (!r6.A00) {
                r6.A00 = true;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = r6.A01;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    AnonymousClass3I6 r11 = (AnonymousClass3I6) it2.next();
                    AnonymousClass11F r102 = r11.A01;
                    Long l = (Long) hashMap.get(r102);
                    if (l != null) {
                        long longValue = l.longValue();
                        long j = r11.A00;
                        if (longValue > j) {
                            r11 = new AnonymousClass3I6(r102, longValue);
                        } else if (r102 != r102) {
                            r11 = new AnonymousClass3I6(r102, j);
                        }
                    }
                    arrayList.add(r11);
                }
                Collections.sort(arrayList, r6.A02);
                HashMap hashMap2 = r6.A03;
                hashMap2.clear();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    AnonymousClass3I6 r1 = (AnonymousClass3I6) it3.next();
                    hashMap2.put(r1.A01, Long.valueOf(r1.A00));
                }
                if (!arrayList2.equals(arrayList)) {
                    Log.i("SortedConversationsList/updateFromThreadMetadata setting timestamps from metadata");
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    z = true;
                }
            }
            z = false;
        }
        if (!z) {
            return true;
        }
        r7.A01.A00();
        return true;
    }
}
