package X;

/* renamed from: X.74O  reason: invalid class name */
public class AnonymousClass74O implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(int r9, int r10) {
        /*
            r8 = this;
            r0 = 1
            r6 = -1
            r5 = 2
            r4 = 0
            if (r10 == r0) goto L_0x0037
            r7 = 0
            java.lang.Object r5 = r8.A04     // Catch:{ RuntimeException -> 0x0021 }
            X.5vo r5 = (X.C123025vo) r5     // Catch:{ RuntimeException -> 0x0021 }
            X.6NZ r3 = r5.A03     // Catch:{ RuntimeException -> 0x0021 }
            java.lang.Object r0 = r8.A02     // Catch:{ RuntimeException -> 0x0021 }
            X.7nn r0 = (X.C161977nn) r0     // Catch:{ RuntimeException -> 0x0021 }
            int r2 = r0.BCq()     // Catch:{ RuntimeException -> 0x0021 }
            int r1 = r0.BCp()     // Catch:{ RuntimeException -> 0x0021 }
            android.graphics.Bitmap$Config r0 = r5.A00     // Catch:{ RuntimeException -> 0x0021 }
            X.AU0 r4 = r3.A01(r0, r2, r1)     // Catch:{ RuntimeException -> 0x0021 }
            r5 = -1
            goto L_0x004b
        L_0x0021:
            r5 = move-exception
            java.lang.Class<X.5vo> r3 = X.C123025vo.class
            java.lang.String r2 = "Failed to create frame bitmap"
            X.7m1 r1 = X.C132886Vq.A00     // Catch:{ all -> 0x0093 }
            r0 = 5
            boolean r0 = r1.BMH(r0)     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r3.getSimpleName()     // Catch:{ all -> 0x0093 }
            r1.BxO(r0, r2, r5)     // Catch:{ all -> 0x0093 }
        L_0x0036:
            return r7
        L_0x0037:
            java.lang.Object r2 = r8.A03     // Catch:{ all -> 0x0093 }
            X.7ll r2 = (X.C160897ll) r2     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r8.A02     // Catch:{ all -> 0x0093 }
            X.7nn r0 = (X.C161977nn) r0     // Catch:{ all -> 0x0093 }
            int r1 = r0.BCq()     // Catch:{ all -> 0x0093 }
            int r0 = r0.BCp()     // Catch:{ all -> 0x0093 }
            X.AU0 r4 = r2.B8n(r9, r1, r0)     // Catch:{ all -> 0x0093 }
        L_0x004b:
            if (r4 == 0) goto L_0x0082
            boolean r0 = r4.A02()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r3 = r8.A04     // Catch:{ all -> 0x0093 }
            X.5vo r3 = (X.C123025vo) r3     // Catch:{ all -> 0x0093 }
            X.63p r1 = r3.A02     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r4.A01()     // Catch:{ all -> 0x0093 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0093 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0093 }
            boolean r0 = r1.A00(r0, r9)     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0082
            java.lang.Class<X.5vo> r2 = X.C123025vo.class
            java.lang.String r1 = "Frame %d ready."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0093 }
            X.C132886Vq.A02(r2, r0, r1)     // Catch:{ all -> 0x0093 }
            android.util.SparseArray r1 = r3.A01     // Catch:{ all -> 0x0093 }
            monitor-enter(r1)     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r8.A03     // Catch:{ all -> 0x007f }
            X.7ll r0 = (X.C160897ll) r0     // Catch:{ all -> 0x007f }
            r0.BYR(r4, r9, r10)     // Catch:{ all -> 0x007f }
            monitor-exit(r1)     // Catch:{ all -> 0x0093 }
            goto L_0x0086
        L_0x007f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0082:
            r0 = 0
            if (r4 == 0) goto L_0x008c
            goto L_0x0087
        L_0x0086:
            r0 = 1
        L_0x0087:
            r4.close()
            if (r0 != 0) goto L_0x0092
        L_0x008c:
            if (r5 == r6) goto L_0x0092
            boolean r0 = r8.A00(r9, r5)
        L_0x0092:
            return r0
        L_0x0093:
            r0 = move-exception
            if (r4 == 0) goto L_0x0099
            r4.close()
        L_0x0099:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74O.A00(int, int):boolean");
    }

    public AnonymousClass74O(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.A05 = i3;
        this.A04 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0162, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0166, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0211  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r3 = r16
            int r0 = r3.A05
            switch(r0) {
                case 0: goto L_0x0198;
                case 1: goto L_0x0081;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r11 = r3.A02
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r11 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r11
            java.lang.Object r12 = r3.A03
            android.net.Uri r12 = (android.net.Uri) r12
            int r2 = r3.A00
            int r14 = r3.A01
            java.lang.Object r13 = r3.A04
            r3 = 0
            r0 = 4
            X.AnonymousClass00C.A0D(r13, r0)
            X.00T r0 = r11.A0Q
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.1GX r0 = r0.A0F
            X.0yb r0 = r0.A01
            X.0ya r0 = r0.A0O()
            java.lang.String r0 = X.AnonymousClass1GW.A0M(r12, r0)
            boolean r0 = X.AnonymousClass1GX.A0c(r0)
            if (r0 == 0) goto L_0x006a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r0 = "from"
            java.lang.String r1 = r12.getQueryParameter(r0)
            if (r1 == 0) goto L_0x0067
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0067
            long r0 = java.lang.Long.parseLong(r1)
        L_0x0048:
            long r7 = r2.toMicros(r0)
            r1 = 0
            r5 = -1
            X.3nR r2 = new X.3nR
            r2.<init>(r11, r12)
            r10 = 1
            r4 = 0
            r6 = 0
            r9 = 0
            android.graphics.Bitmap r10 = X.C25541Gs.A00(r1, r2, r3, r4, r5, r6, r7, r9, r10)
        L_0x005b:
            X.17Y r0 = r11.A05
            X.3vk r9 = new X.3vk
            r15 = 4
            r9.<init>(r10, r11, r12, r13, r14, r15)
        L_0x0063:
            r0.A0H(r9)
        L_0x0066:
            return
        L_0x0067:
            r0 = 0
            goto L_0x0048
        L_0x006a:
            X.1Ax r3 = r11.A0F
            if (r3 == 0) goto L_0x0191
            int r1 = r2 / 2
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r11.A0G
            if (r0 == 0) goto L_0x018a
            boolean r7 = r0.A04()
            r8 = 0
            r4 = r12
            r5 = r1
            r6 = r2
            android.graphics.Bitmap r10 = r3.A05(r4, r5, r6, r7, r8)
            goto L_0x005b
        L_0x0081:
            java.lang.Object r10 = r3.A02
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r10 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r10
            int r6 = r3.A00
            int r5 = r3.A01
            java.lang.Object r1 = r3.A03
            X.4xU r1 = (X.C101394xU) r1
            java.lang.Object r2 = r3.A04
            X.4xX r2 = (X.C101424xX) r2
            r3 = 0
            X.1HC r4 = r10.A06
            int r13 = r4.A00()
            java.lang.String r0 = "save_profile_photo"
            r4.A01(r13, r0)
            X.5IW r0 = X.AnonymousClass5IW.A00
            r4.A03(r0, r13, r6)
            X.5If r0 = X.C106065If.A00
            r4.A03(r0, r13, r5)
            android.graphics.Bitmap r7 = r1.A01     // Catch:{ all -> 0x0167 }
            int r1 = r7.getWidth()     // Catch:{ all -> 0x0167 }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x0167 }
            if (r1 == r0) goto L_0x00d3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap not squared (w="
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            int r0 = r7.getWidth()     // Catch:{ all -> 0x0167 }
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = ", h="
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = X.C36321k7.A0G(r1, r0)     // Catch:{ all -> 0x0167 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0167 }
        L_0x00d3:
            int r6 = r2.A00     // Catch:{ all -> 0x0167 }
            int r2 = r7.getWidth()     // Catch:{ all -> 0x0167 }
            int r1 = r7.getHeight()     // Catch:{ all -> 0x0167 }
            android.graphics.Bitmap$Config r0 = r7.getConfig()     // Catch:{ all -> 0x0167 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ all -> 0x0167 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ all -> 0x0167 }
            android.graphics.Canvas r2 = X.C90524aI.A0A(r5)     // Catch:{ all -> 0x0167 }
            r2.drawColor(r6)     // Catch:{ all -> 0x0167 }
            r1 = 0
            r0 = 0
            r2.drawBitmap(r7, r1, r1, r0)     // Catch:{ all -> 0x0167 }
            int r0 = r5.getWidth()     // Catch:{ all -> 0x0167 }
            r2 = 196(0xc4, float:2.75E-43)
            if (r0 >= r2) goto L_0x0149
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap width too low ("
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            int r0 = r5.getWidth()     // Catch:{ all -> 0x0167 }
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "), will be scaled up."
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x0167 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0167 }
        L_0x0115:
            int r0 = r5.getWidth()     // Catch:{ all -> 0x0167 }
            r2 = 640(0x280, float:8.97E-43)
            if (r0 <= r2) goto L_0x0146
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap width too high ("
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            int r0 = r5.getWidth()     // Catch:{ all -> 0x0167 }
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "), will be scaled down."
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x0167 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0167 }
        L_0x0136:
            int r0 = r1.intValue()     // Catch:{ all -> 0x0167 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r5, r0, r0, r3)     // Catch:{ all -> 0x0167 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ all -> 0x0167 }
        L_0x0141:
            java.io.ByteArrayOutputStream r2 = X.C90524aI.A0Q()     // Catch:{ all -> 0x0167 }
            goto L_0x014b
        L_0x0146:
            if (r1 == 0) goto L_0x0141
            goto L_0x0136
        L_0x0149:
            r1 = 0
            goto L_0x0115
        L_0x014b:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0160 }
            r0 = 100
            r5.compress(r1, r0, r2)     // Catch:{ all -> 0x0160 }
            r2.close()     // Catch:{ all -> 0x0167 }
            r5.recycle()     // Catch:{ all -> 0x0167 }
            byte[] r12 = r2.toByteArray()     // Catch:{ all -> 0x0167 }
            X.AnonymousClass00C.A08(r12)     // Catch:{ all -> 0x0167 }
            goto L_0x016c
        L_0x0160:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0167 }
            throw r0     // Catch:{ all -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            X.03N r12 = X.C90524aI.A0t(r0)
        L_0x016c:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r12)
            if (r1 != 0) goto L_0x0211
            java.lang.String r0 = "generated_bitmap"
            r4.A01(r13, r0)
            X.0wQ r0 = r10.A02
            r0.A0G()
            X.142 r11 = r0.A0E
            if (r11 == 0) goto L_0x0066
            X.17Y r0 = r10.A01
            r14 = 1
            X.3vW r9 = new X.3vW
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0063
        L_0x018a:
            java.lang.String r0 = "whatsAppLibLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0191:
            java.lang.String r0 = "mediaUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0198:
            java.lang.Object r0 = r3.A03     // Catch:{ all -> 0x01ff }
            X.7ll r0 = (X.C160897ll) r0     // Catch:{ all -> 0x01ff }
            int r7 = r3.A01     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.B3W(r7)     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r4 = r3.A04     // Catch:{ all -> 0x01ff }
            X.5vo r4 = (X.C123025vo) r4     // Catch:{ all -> 0x01ff }
            java.lang.Class<X.5vo> r2 = X.C123025vo.class
            java.lang.String r1 = "Frame %d is cached already."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01ff }
            X.C132886Vq.A02(r2, r0, r1)     // Catch:{ all -> 0x01ff }
            android.util.SparseArray r2 = r4.A01
            monitor-enter(r2)
            int r0 = r3.A00     // Catch:{ all -> 0x020e }
            r2.remove(r0)     // Catch:{ all -> 0x020e }
            goto L_0x01fd
        L_0x01bc:
            r2 = 1
            boolean r0 = r3.A00(r7, r2)     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r6 = r3.A04     // Catch:{ all -> 0x01ff }
            X.5vo r6 = (X.C123025vo) r6     // Catch:{ all -> 0x01ff }
            java.lang.Class<X.5vo> r2 = X.C123025vo.class
            java.lang.String r1 = "Prepared frame %d."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01ff }
            X.C132886Vq.A02(r2, r0, r1)     // Catch:{ all -> 0x01ff }
            goto L_0x01f5
        L_0x01d3:
            java.lang.Object r6 = r3.A04     // Catch:{ all -> 0x01ff }
            X.5vo r6 = (X.C123025vo) r6     // Catch:{ all -> 0x01ff }
            java.lang.Class<X.5vo> r1 = X.C123025vo.class
            java.lang.String r5 = "Could not prepare frame %d."
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ff }
            X.C36331k8.A1W(r4, r7)     // Catch:{ all -> 0x01ff }
            X.7m1 r2 = X.C132886Vq.A00     // Catch:{ all -> 0x01ff }
            r0 = 6
            boolean r0 = r2.BMH(r0)     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x01f5
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x01ff }
            r0 = 0
            java.lang.String r0 = java.lang.String.format(r0, r5, r4)     // Catch:{ all -> 0x01ff }
            r2.B6I(r1, r0)     // Catch:{ all -> 0x01ff }
        L_0x01f5:
            android.util.SparseArray r2 = r6.A01
            monitor-enter(r2)
            int r0 = r3.A00     // Catch:{ all -> 0x020e }
            r2.remove(r0)     // Catch:{ all -> 0x020e }
        L_0x01fd:
            monitor-exit(r2)
            return
        L_0x01ff:
            r1 = move-exception
            java.lang.Object r0 = r3.A04
            X.5vo r0 = (X.C123025vo) r0
            android.util.SparseArray r2 = r0.A01
            monitor-enter(r2)
            int r0 = r3.A00     // Catch:{ all -> 0x020e }
            r2.remove(r0)     // Catch:{ all -> 0x020e }
            monitor-exit(r2)
            throw r1
        L_0x020e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0211:
            java.lang.String r0 = "AvatarProfilePhotoViewModel/unable to compose profile photo"
            com.whatsapp.util.Log.e(r0, r1)
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel.A03(r10, r3)
            X.17Y r1 = r10.A01
            r0 = 2131889297(0x7f120c91, float:1.9413254E38)
            r1.A07(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74O.run():void");
    }
}
