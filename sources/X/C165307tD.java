package X;

/* renamed from: X.7tD  reason: invalid class name and case insensitive filesystem */
public class C165307tD implements AnonymousClass004 {
    public Object A00;
    public final int A01;

    public C165307tD(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C18910u1 A00(Object obj, int i) {
        return new C18910u1((Object) null, new C165307tD(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        if (com.whatsapp.mediacomposer.MediaComposerActivity.A0u(r1) != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019a, code lost:
        if (X.AnonymousClass143.A0M(r1.A0N) == false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019e, code lost:
        return X.C51292na.QUICK_SHARE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a1, code lost:
        return X.C51292na.DEFAULT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x0180;
                case 1: goto L_0x0175;
                case 2: goto L_0x0111;
                case 3: goto L_0x0106;
                case 4: goto L_0x00fd;
                case 5: goto L_0x00f4;
                case 6: goto L_0x00d9;
                case 7: goto L_0x000e;
                case 8: goto L_0x00b0;
                case 9: goto L_0x0092;
                case 10: goto L_0x007e;
                case 11: goto L_0x0072;
                case 12: goto L_0x0066;
                case 13: goto L_0x005a;
                case 14: goto L_0x004d;
                case 15: goto L_0x003a;
                case 16: goto L_0x002c;
                case 17: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A00
            X.005 r0 = (X.AnonymousClass005) r0
            java.lang.Object r7 = r0.get()
        L_0x000d:
            return r7
        L_0x000e:
            java.lang.Object r2 = r15.A00
            int[][] r2 = (int[][]) r2
            int r1 = r2.length
            java.util.ArrayList r7 = X.C36441kJ.A14(r1)
            r0 = 0
        L_0x0018:
            if (r0 >= r1) goto L_0x000d
            X.C90474aD.A1P(r7, r2, r0)
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r15.A00
            X.0wV r2 = (X.C19780wV) r2
            java.lang.String r1 = "PttTranscriptionPool"
            r0 = 1
            X.2kb r7 = r2.A00(r1, r0)
            return r7
        L_0x002c:
            java.lang.Object r0 = r15.A00
            X.004 r0 = (X.AnonymousClass004) r0
            java.lang.Object r0 = r0.get()
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            r7.<init>(r0)
            return r7
        L_0x003a:
            java.lang.Object r0 = r15.A00
            android.content.Context r0 = (android.content.Context) r0
            X.0tq r0 = X.C90464aC.A0I(r0)
            X.0tq r0 = r0.AfI
            X.0tt r0 = r0.A00
            X.004 r0 = r0.A2E
            java.lang.Object r7 = r0.get()
            return r7
        L_0x004d:
            java.lang.Object r0 = r15.A00
            X.6FO r0 = (X.AnonymousClass6FO) r0
            X.0wg r1 = r0.A00
            java.lang.String r0 = "migration_export"
            android.content.SharedPreferences r7 = r1.A00(r0)
            return r7
        L_0x005a:
            java.lang.Object r1 = r15.A00
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r1 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r1
            r0 = 2131234369(0x7f080e41, float:1.8084902E38)
            X.04n r7 = com.whatsapp.migration.android.view.GoogleMigrateImporterActivity.A01(r1, r0)
            return r7
        L_0x0066:
            java.lang.Object r1 = r15.A00
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r1 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r1
            r0 = 2131234368(0x7f080e40, float:1.80849E38)
            X.04n r7 = com.whatsapp.migration.android.view.GoogleMigrateImporterActivity.A01(r1, r0)
            return r7
        L_0x0072:
            java.lang.Object r1 = r15.A00
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r1 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r1
            r0 = 2131234370(0x7f080e42, float:1.8084904E38)
            X.04n r7 = com.whatsapp.migration.android.view.GoogleMigrateImporterActivity.A01(r1, r0)
            return r7
        L_0x007e:
            java.lang.Object r1 = r15.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            X.1Sf r0 = r1.A1G
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x019f
            boolean r0 = com.whatsapp.mediacomposer.MediaComposerActivity.A0u(r1)
            if (r0 == 0) goto L_0x019f
            goto L_0x019c
        L_0x0092:
            java.lang.Object r0 = r15.A00
            X.6vb r0 = (X.C146436vb) r0
            X.4xN r1 = r0.A01
            X.0wG r11 = r1.A0P
            com.whatsapp.Mp4Ops r9 = r1.A0E
            X.0wN r8 = r1.A0A
            X.1AV r10 = r1.A0G
            X.68C r0 = r1.A0f
            java.io.File r12 = r0.A0C
            X.6Fc r0 = r1.A0q
            long r13 = r0.A01()
            X.6Su r7 = new X.6Su
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x00b0:
            java.lang.Object r1 = r15.A00
            X.6TL r1 = (X.AnonymousClass6TL) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.0wG r0 = r1.A01     // Catch:{ IOException -> 0x00cd }
            java.io.File r1 = X.C90524aI.A0R(r0)     // Catch:{ IOException -> 0x00cd }
            java.lang.String r0 = "extensions_reporting_cache_dir"
            java.io.File r3 = X.C36441kJ.A0w(r1, r0)     // Catch:{ IOException -> 0x00cd }
            r1 = 10485760(0xa00000, double:5.180654E-317)
            r0 = 0
            X.71z r7 = X.C1496071z.A01(r0, r3, r1)     // Catch:{ IOException -> 0x00cd }
            return r7
        L_0x00cd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FlowsLogger/FlowsReportingDiskCache/init: "
            X.C36321k7.A1W(r0, r1, r2)
            r7 = 0
            return r7
        L_0x00d9:
            java.lang.Object r4 = r15.A00
            android.view.View r4 = (android.view.View) r4
            int r3 = r4.getLeft()
            float r0 = r4.getY()
            int r2 = (int) r0
            int r1 = r4.getRight()
            int r0 = r4.getBottom()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r3, r2, r1, r0)
            return r7
        L_0x00f4:
            java.lang.Object r0 = r15.A00
            android.view.View r0 = (android.view.View) r0
            android.graphics.Rect r7 = X.C90474aD.A0I(r0)
            return r7
        L_0x00fd:
            java.lang.Object r0 = r15.A00
            android.view.View r0 = (android.view.View) r0
            android.graphics.Rect r7 = X.C90474aD.A0I(r0)
            return r7
        L_0x0106:
            java.lang.Object r0 = r15.A00
            X.6Dz r0 = (X.C128886Dz) r0
            boolean r0 = r0.A04
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        L_0x0111:
            java.lang.Object r0 = r15.A00
            com.whatsapp.calling.views.VoipContactPickerDialogFragment r0 = (com.whatsapp.calling.views.VoipContactPickerDialogFragment) r0
            X.30h r9 = r0.A01
            X.5Fb r0 = r0.A00
            X.6OZ r7 = r0.A05()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            X.0wy r8 = r7.A04
            java.util.Collection r0 = r8.values()
            X.0y6 r0 = (X.C20750y6) r0
            X.14x r3 = r0.iterator()
        L_0x012d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0147
            X.6EE r2 = X.C90524aI.A0J(r3)
            boolean r0 = r2.A0J
            if (r0 != 0) goto L_0x012d
            int r1 = r2.A02
            r0 = 11
            if (r1 == r0) goto L_0x012d
            com.whatsapp.jid.UserJid r0 = r2.A08
            r6.add(r0)
            goto L_0x012d
        L_0x0147:
            boolean r5 = r7.A0N
            java.lang.String r4 = r7.A0B
            X.0yC r1 = r9.A00
            r0 = 5411(0x1523, float:7.582E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x015c
            r0 = 0
        L_0x0156:
            X.3JX r7 = new X.3JX
            r7.<init>(r0, r4, r6, r5)
            return r7
        L_0x015c:
            int r3 = X.C110325aU.A00(r8)
            int r2 = r8.size()
            int r1 = r7.A02
            if (r1 != 0) goto L_0x016a
            r1 = 32
        L_0x016a:
            int r0 = r1 - r3
            if (r3 < r1) goto L_0x0170
            int r0 = 64 - r2
        L_0x0170:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0156
        L_0x0175:
            java.lang.Object r1 = r15.A00
            X.0wU r1 = (X.C19770wU) r1
            r0 = 1
            X.0wk r7 = new X.0wk
            r7.<init>(r1, r0)
            return r7
        L_0x0180:
            java.lang.Object r1 = r15.A00
            X.4vk r1 = (X.C100794vk) r1
            X.1Sf r0 = r1.A0G
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x019f
            java.util.List r0 = r1.A0N
            boolean r0 = X.AnonymousClass143.A0N(r0)
            if (r0 == 0) goto L_0x019f
            java.util.List r0 = r1.A0N
            boolean r0 = X.AnonymousClass143.A0M(r0)
            if (r0 != 0) goto L_0x019f
        L_0x019c:
            X.2na r7 = X.C51292na.QUICK_SHARE
            return r7
        L_0x019f:
            X.2na r7 = X.C51292na.DEFAULT
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165307tD.get():java.lang.Object");
    }
}
