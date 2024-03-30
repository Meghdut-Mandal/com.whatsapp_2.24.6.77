package com.facebook.wearable.mediastream.client.processor;

import X.B2N;
import X.C15590na;
import X.C17170qq;

public final class OutgoingMessageProcessor {
    public B2N A00;
    public final C17170qq A01 = new C15590na();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.nio.ByteBuffer r8, X.C023509x r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C21939AdI
            if (r0 == 0) goto L_0x002e
            r6 = r9
            X.AdI r6 = (X.C21939AdI) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r5 = r6.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r6.label
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r0) goto L_0x0034
            java.lang.Object r3 = r6.L$2
            X.0qq r3 = (X.C17170qq) r3
            java.lang.Object r8 = r6.L$1
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            java.lang.Object r6 = r6.L$0
            com.facebook.wearable.mediastream.client.processor.OutgoingMessageProcessor r6 = (com.facebook.wearable.mediastream.client.processor.OutgoingMessageProcessor) r6
            X.AnonymousClass0AN.A00(r5)
            goto L_0x004e
        L_0x002e:
            X.AdI r6 = new X.AdI
            r6.<init>(r7, r9)
            goto L_0x0012
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0039:
            X.AnonymousClass0AN.A00(r5)
            X.0qq r3 = r7.A01
            r6.L$0 = r7
            r6.L$1 = r8
            r6.L$2 = r3
            r6.label = r0
            java.lang.Object r0 = r3.BOV(r4, r6)
            if (r0 != r2) goto L_0x004d
            return r2
        L_0x004d:
            r6 = r7
        L_0x004e:
            X.9gk r5 = X.AnonymousClass9AO.A01     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "sup:OutgoingMessageProcessor"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "[OutgoingMessageProcessor]: writing message to mediastream socket, size "
            r1.append(r0)     // Catch:{ all -> 0x0086 }
            int r0 = r8.limit()     // Catch:{ all -> 0x0086 }
            r1.append(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = " bytes"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0086 }
            r5.A01(r2, r0)     // Catch:{ all -> 0x0086 }
            X.B2N r0 = r6.A00     // Catch:{ all -> 0x0086 }
            java.io.OutputStream r0 = r0.BEr()     // Catch:{ all -> 0x0086 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0086 }
            r1.<init>(r0)     // Catch:{ all -> 0x0086 }
            java.nio.channels.WritableByteChannel r0 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ all -> 0x0086 }
            r0.write(r8)     // Catch:{ all -> 0x0086 }
            r1.flush()     // Catch:{ all -> 0x0086 }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0086 }
            r3.BwJ(r4)
            return r0
        L_0x0086:
            r0 = move-exception
            r3.BwJ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.mediastream.client.processor.OutgoingMessageProcessor.A00(java.nio.ByteBuffer, X.09x):java.lang.Object");
    }

    public OutgoingMessageProcessor(B2N b2n) {
        this.A00 = b2n;
    }
}
